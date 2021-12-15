import java.util.*;
public class BookShopCSES {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int books = scan.nextInt();
		
		int money = scan.nextInt();
		
		int[] prices = new int[books];
		
		int[] pages = new int[books];
			
		for(int i = 0; i < books; i++) {
				
			prices[i] = scan.nextInt();
				
		}
					
		for(int i = 0; i < books; i++) {
				
			pages[i] = scan.nextInt();
				
		}
		
		scan.close();
		
		bookShop(books, money, prices, pages);
    }
    static void bookShop(int books, int money, int[]prices, int[]pages){
        int[][] pagesPrice = new int[books+1][money+1];
        
        for (int i = 0; i < books; i++) {
            for (int j = 0; j <= money; j++) {
                pagesPrice[i+1][j] = pagesPrice[i][j];

                if(prices[i] <= j){
                    pagesPrice[i+1][j] = Math.max(pagesPrice[i+1][j], (pages[i]+pagesPrice[i][j-prices[i]]));
                }
            }
        }
        System.out.println(pagesPrice[books][money]);
    }
}
