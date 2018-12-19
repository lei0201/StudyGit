package ArrayDrill;

public class StaticTest {
	public static int statica=2;
	public int root=2;
	public StaticTest() {
		statica++;
		root++;
		System.out.println("statica"+"\t"+statica+",root"+"\t"+root);
	}
	public static void main(String[] args) {
		StaticTest st=new StaticTest();
		StaticTest st1=new StaticTest();
	}

}
