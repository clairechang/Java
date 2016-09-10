# 套件 Package

> 命名規則 namespace

	組織名稱類型.組織名稱.功能.類別名稱
	com.BitC.test.MyString
	
> 套件的引用

	import java.io.*;
	import java.io.Reader;
	
> 不使用引用的方法

	java.io.Reader a_reader;
	
## 預設引用的套件

| package | doc |
| --- | --- |
| java.lang | 如 System |
| java.io | 輸入輸出 BufferRead |
| java.applet | applet class |
| java.util | Iterator, Calendar |
| java.awt | Abstract Windows ToolKit |
| java.beans | JavaBeans |
| java.net | 網路相關 |

## Jar 檔

> 許多類別的 .class 以 ZIP 格式封裝在一個 jar 檔

>  封裝 jar 檔: 將 com 資料夾封裝為 package.jar 檔

	jar cf package.jar com
	
	也可透過 ZIP 軟體壓縮後更改檔名即可

> set classpath

	set classpath=%classpath%;路徑位置
	
	