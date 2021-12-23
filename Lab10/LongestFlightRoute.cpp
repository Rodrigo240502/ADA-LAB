#include <bits/stdc++.h>

using namespace std;
const int maxN = 1e5+1;

bool vis[maxN];
// Arreglo booleano para saber si un nodo fue o no visitado

int N, M;
// N = numero de ciudades
// M = numero de rutas entre ciudades

int K;
// Numero de rutas entre 2 nodos

int a, b;
// Variables para agregar en el array

int in[maxN], p[maxN], l[maxN], ans[maxN];
// Arreglos auxiliares para resolver

vector<int> G[maxN];
// Grafo con nuestras ciudades en forma de arreglo

queue<int> Q;
// Cola de prioridad para movernos

void dfs(int u, int par = 0){
    vis[u] = true;
    for(int v : G[u])
        if(v != par && !vis[v])
            dfs(v, u);
}

int main(){
    scanf("%d %d", &N, &M); // Ingreso de datos N y M
    for(int i = 0; i < M; i++){
        scanf("%d %d", &a, &b); // Ingreso de a y b
        G[a].push_back(b);
        // Incrementamos una ruta de ingreso a "b"
        in[b]++;
    }

    dfs(1);
    if(!vis[N]){
        printf("IMPOSSIBLE\n");
        return 0;
    }

    // Llenamos el array con -1 desde la ciudad 2 para decir que no fueron visitadas
    fill(l+2, l+maxN, -1);

    // Recorremos el array y si no hay ruta de ingreso llenamos una
    for(int i = 1; i <= N; i++)
        if(in[i] == 0)
            Q.push(i);

    // Iteramos sobre la queue 
    while(!Q.empty()){

        // Rescatamos la primera ciudad de la queue
        int u = Q.front();
        Q.pop();
        for(int v : G[u]){
            if(l[u] != -1 && l[v] < l[u]+1){
                l[v] = l[u] + 1;
                p[v] = u;
            }
            in[v]--;
            if(in[v] == 0)
                Q.push(v);
        }
    }

    K = l[N] - l[1];
    printf("%d\n", K+1);
    for(int i = K, u = N; i >= 0; i--){
        ans[i] = u;
        u = p[u];
    }
    for(int i = 0; i <= K; i++)
        printf("%d%c", ans[i], (" \n")[i==K]);
}