# Lambda Expressions

> 用於簡化 SAM 介面（Single Abstract Method Interface）的程式敘述，省去繁索不相關定義，讓程式更加簡潔。

	參數列（parameters list）-> 函數本體（Body）
	
## 參數列

| 類型 | 範例 |
| -- | -- |
| 無 | () |
| 型別單一 | (int x) |
| 無型別單一 | x |
| 型別多參數 | (int x, String y) |
| 無型別多參數 | (x, y) |

## 函數本體

| 類型 | 範例 |
| -- | -- |
| 無敘述 | {} |
| 傳回值多行敘述 | { y++; return x * y;} |
| 傳回值單行敘述 | { return x * y; } |
| 不傳回值多行敘述 | { y++; x++; |
| 不傳回值單行敘述 | { x * y; } |

## 說明

[Java8 Lambda](https://magiclen.org/java-8-lambda/)

> 概念都是Lambda為一個函數，可以根據輸入的值，決定輸出的值。但Lambda與一般函數不同的是，Lambda並不需要替函數命名(如F(X) = X + 2, G(X) = F(X) + 3中的F、G便是函數的名稱)，所以我們常常把Lambda形容為「匿名的」(Anonymous)。

> 實際上Lambda語法只能用來表示一個「只擁有一個方法的介面」所實作出來的匿名類別

> 「只擁有一個方法的介面」

### demo

	Runnable runnbale = new Runnable() {
	    public void run() {
	    	System.out.println("run me!");
	    }
	};
	
> 下面改為 Lambda
	
	Runnable runnbale = () -> System.out.println("run me!");
	
> 使用Lambda來取代以往Functional Interface的使用方式，可以大大的縮短程式碼，在編譯的過程中，也可以避免掉產生新的.class檔案出來，執行的時候，也不會再重新new出一個物件實體，而是直接將Lambda的body程式碼存放在記憶體，直接以類似call function的方式去執行，大大的提升程式的執行效能。

## Lambda與Collection的關係

> List

	for (String s : list) {
    	System.out.print(s);
	}

> 下面改為 Lambda
	
	list.forEach(s -> System.out.print(s));
	list.forEach(System.out::print);
	
> Map
	
	Set<String> keySet = map.keySet();
	for (String s : keySet) {
		System.out.print(s + ":" + map.get(s));
	}
	
> 下面改為 Lambda

	map.forEach((k, v) -> System.out.print(k + ":" + v));
	
