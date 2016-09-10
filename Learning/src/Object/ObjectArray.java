package Object;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		ObjectArrayBase Obj[] = new ObjectArrayBase[3]; // Object Array
		
		char str1[] = {'a','b'};
		char str2[] = {'c','b'};
		char str3[] = {'d','b'};
		
		Obj[0] = new ObjectArrayBase(str1);
		Obj[1] = new ObjectArrayBase(str2);
		Obj[2] = new ObjectArrayBase(str3);

		for(int i = 0; i < Obj.length; i++) {
			System.out.println(Arrays.toString(Obj[i].name));
		}
	}

}

class ObjectArrayBase {
	
	public char name[];
	
	ObjectArrayBase(char i_name[]) {
		this.name = new char[i_name.length];
		System.arraycopy(i_name, 0, this.name, 0, i_name.length);
	}
	
}

