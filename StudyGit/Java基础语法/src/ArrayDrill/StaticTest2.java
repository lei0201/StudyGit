package ArrayDrill;

public class StaticTest2 {
	public static int statica=2;
	public int root=2;
	public StaticTest2() {
		statica++;
		root++;
		System.out.println("statica"+"\t"+statica+",root"+"\t"+root);
	}
	public static void main(String[] args) {
		StaticTest2 st=new StaticTest2();
		StaticTest2 st1=new StaticTest2();
	}

}
class A{
	public static String staticStr="A";
	static {staticStr="A1";
	}
	public A() {
		staticStr="aa";
	}
	public  static void toChange() {staticStr="as";}
	public static void toChange2() {staticStr="A3";}
}

class B{
	public static final String staticB;
	static {staticB="A5";}
	
}