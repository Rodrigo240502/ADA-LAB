package Lab07;
import java.util.*;

public class Node<E> {
	//Clase generica Node (Sacada en su mayoria del curso de EDA)
	
	private E data;
	private ArrayList<Node<E>> hijos = new ArrayList<Node<E>>();
	private boolean visitado;
		
	public Node() {
		this(null);
	}
	
	public Node(E data) {	
		setData(data);
		setVisited(false);
	}
		
	public E getData() {
		return data;
	}
	
	public void setData(E data) {	
		this.data = data;	
	}
	
	public ArrayList<Node<E>> getSons() {
		return hijos;	
	}
	
	public void setSon(Node<E> hijo) {
		this.hijos.add(hijo);
	}
	
	public void setVisited(boolean visitado) {
		this.visitado = visitado;
	}
	
	public boolean isVisited() {
		return this.visitado;
	}

	public void auxRecursive(){
        auxRecursive(this);
        markAsNotVisited();
    }
	public void auxRecursive(Node<E> root) {
		
		System.out.println(root);
		root.setVisited(true);
		ArrayList<Node<E>> hijos = root.getSons();
		
		for(int i = 0; i < hijos.size(); i++) {
			if(!hijos.get(i).isVisited()) {
				auxRecursive(hijos.get(i));
			}
		}
	}
	
    public void auxIterative(){
        auxIterative(this);
        markAsNotVisited();
    }
	public void auxIterative(Node<E> root) {
		
		Stack<Node<E>> order = new Stack<Node<E>>();
		order.push(root);
		root.setVisited(true);
				
		while(!order.isEmpty()) {				
			Node<E> v = order.peek();
			System.out.println(order.pop());
			ArrayList<Node<E>> hijos = v.getSons();

			for(int i = hijos.size() - 1; i >= 0; i--) {				
				if(!hijos.get(i).isVisited()) {
					order.push(hijos.get(i));
					hijos.get(i).setVisited(true);
				}					
			}
		}
	}
	
	public void markAsNotVisited() {
		markAsNotVisited(this);
	}
	
	protected void markAsNotVisited(Node<E> root) {
		
		if(root.isVisited()) {
			root.setVisited(false);
			ArrayList<Node<E>> hijos = root.getSons();
			
			for(int i = 0; i < hijos.size(); i++) {		
				if(hijos.get(i).isVisited()) {		
					markAsNotVisited(hijos.get(i));			
				}						
			}			
		}	
	}
	@Override	
	public String toString() {
		return this.getData().toString();
	}
}

