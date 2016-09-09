package Object;

//定義一組常數型別
enum CityCode {
	TPE, TCH, TNH, KHH
}

public class EnumEX {
	
	public static void main(String[] args) {
		
		// 取得所有 CityCode 
		for(CityCode code : CityCode.values()) { // values 是一個靜態方法
			System.out.println(code.ordinal() + " - " + code.name());
		}
		
	}

}
