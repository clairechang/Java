
/**
 * 可樂幾瓶
 * http://www.zgxue.com/206/2063144.html
 * @author rockst
 *
 */
public class Cola {

	//啤酒2块钱一瓶，俩瓶子换一瓶，四瓶盖换一瓶
	public  static int calBeers(int money) {
	    	int allBeers = money /2; 	// 喝了多少啤酒
	    	int beers = 0;				// 
	    	int bols = 0;				// 酒瓶
	    	int caps = 0;				// 蓋子
	    	beers = money /2;			// 第一次喝了多少啤酒
	    	
	    	while (beers != 0) {
	    		
				bols += beers;
				caps += beers ;
				beers = 0;
				
				allBeers += bols /2;
				beers += bols /2;
				bols = bols % 2;
				
				allBeers += caps /4;
				beers += caps /4;
				caps = caps % 4;
				
			}
	    	return allBeers;
		}
	    
	    
	    public static void main(String[] args) {
	    	// http://www.worldofmastermind.com/?p=3193
	    	// Total N = 3 + (n-2) * 4 = 4n – 5.
	    	
	    	System.out.println(3 + (12 - 2) * 4);
	    	System.out.println(calBeers(25));
	    }
}
