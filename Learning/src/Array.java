import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		copy();
		
		String[] a = {"rock"};
		String[] b = {"rock"};
		
		System.out.println(equals(a, b));
		
		sort();
		search();
		
		twodimarray();
		
	}
	
	// 宣告
	public static void decare() {
		int a[] = new int[5];
		int b[] = {1, 2, 3};
		
		System.out.println(b[0]);
		System.out.println(a.length); // 長度
		System.out.println(b.length); // 長度
	}
	
	// demo Arrays.fill and toString
	public static void fill() {
		
		final int SIZE = 5;
		
		String[] c = new String[SIZE];
		
		Arrays.fill(c, "rock"); // Call fill 以 10 填滿 Array
		System.out.println(Arrays.toString(c)); // 印出 Array
		
		Arrays.fill(c, 1, 4, "Claire"); // 填滿 2 ~ 3
		System.out.println(Arrays.toString(c)); // 印出 Array
	}
	
	// copy array
	public static void copy() {
		
		int a[] = {1, 2, 3};
		int b[] = new int[3];
		
		b = a; // 僅 copy 記憶體參考位置
		
		a[0] = 4;
		
		System.out.println(Arrays.toString(b));
		
		String c[] = {"rock", "claire"};
		String d[] = new String[2];
		
		System.arraycopy(c, 0, d, 0, c.length); // copy 值到新的位置
		
		c[0] = "rockst";
		
		System.out.println(Arrays.toString(d));
		
	}
	
	// 比較
	public static boolean equals(String[] a, String[] b) {
		
		return Arrays.equals(a, b);
		
	}
	
	// sorting
	public static void sort() {
		
		int a[] = {5, 12, 1, 3, 7};
		Arrays.sort(a); // 排序小到大
		System.out.println(Arrays.toString(a));
		
		int b[] = {5, 12, 1, 3, 7};
		Arrays.sort(b, 0, 3); // 排序從第0個開始的3個小到大
		System.out.println(Arrays.toString(b));
	}
	
	// search
	public static void search() {
		int a[] = {5, 4, 1, 3, 7};
		
		String b[] = {"rock", "claire"};
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 3)); // 要排序過才能尋找陣列值
		
		Arrays.sort(b);
		System.out.println(Arrays.binarySearch(b, "claire"));
		
		for(int i = 0; i < b.length; i++) {
			if(b[i] == "claire") {
				System.out.println("index:" + i + " value = " + b[i]);
				break;
			}
		}
		
	}
	
	// two dim array
	public static void twodimarray() {
		
		int a[][] = new int[1][2];
		int b[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		
		System.out.println(a.length + " " + a[0].length);
		System.out.println(Arrays.toString(b[0]));
		
	}
	
	// jagged array
	public static void jaggedarray() {
		
		// int a[][];
		// a = new int[2][];
		
		int b[][] = {
				{1, 2},
				{3, 4, 5}
		};
		
		System.out.println(b.length);
	}

}
