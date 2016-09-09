/**
 * 變數的有效範圍
 * @author rockst
 *
 */
public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		
		// 表示 j 只能在大括符內使用
		{
			int j = 2;
			System.out.println("i = " + i + " j = " + j);
		}
		
		// System.out.println(j);

	}

}
