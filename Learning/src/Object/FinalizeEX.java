package Object;

public class FinalizeEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FinalizeDemo {
	
	public String name;
	
	// 建構子
	public FinalizeDemo() {
		this.name = "rock";
	}
	
	// finalize
	protected void finalize() {
		this.name = null;
	}
	
}
