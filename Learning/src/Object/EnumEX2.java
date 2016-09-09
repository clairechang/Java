package Object;

/**
 * 使用列舉類別來實作包裹寄送的範列
 * @author rockst
 *
 */
public class EnumEX2 {

	public static void main(String[] args) {
		Package PK = new Package(CityCode2.TCH, 10, DeliverType.NORMAL);
		System.out.println(
				Package.fromCity + "->" + PK.getToCity() + " " + PK.getSize() + " " + PK.getType() +
				" Rate: " + PK.getRate()
				);
	}

}

// 包裹類別
class Package {
	
	// 來自那一個 City 使用 static final 不能修改
	public static final CityCode2 fromCity = CityCode2.TPE;
	
	private CityCode2 toCity; // 送到那一個 City
	private int size; // 尺寸
	private DeliverType type; // 包裹類型
	
	// 建構子
	public Package(CityCode2 code, int size, DeliverType type) {
		this.toCity = code;
		this.size = size;
		this.type = type;
	}
	
	public CityCode2 getToCity() { return this.toCity;}
	public int getSize() { return this.size;}
	public DeliverType getType() { return this.type;}
	
	// 計算費用
	public double getRate() {
		return this.size * toCity.getRate(this.type);
	}
	
}

// 列舉包裹投遞類型
enum DeliverType {
	NORMAL,
	EXPRESS;
}

// 定義 CityCode 所代表的費用
enum CityCode2 {
	
	TPE(1.0, 1.2), // (normal, express)
	TCH(2.5, 3.4),
	KHH(20.2, 33.6);
	
	private double normalRate; // 一般費率
	private double expressRate; // 快遞費率
	
	// CityCode 建構子
	private CityCode2(double normalRate, double expressRate) {
		
		this.normalRate = normalRate;
		this.expressRate = expressRate;
		
	}
	
	// 取得類別費用
	public double getRate(DeliverType type) {
		
		return (type == DeliverType.NORMAL) ? this.normalRate : this.expressRate;
		
	}
	
}
