/**
 * 
 * @author Administrator
 * 1.在继承链中对象方法的调用存在一个优先级:this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
 * 	2.先上概念：
 *	同一行为的多种不同表达，或者同一行为的多种不同实现就叫做多态
 *	方法覆盖后出现的运行时多态，其运行规则是：编译时看数据类型，运行时看实际的对象类型（new谁调谁）
 *	就是编译看左边，运行看右边。
 */
class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }

}

class B extends A{
    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }
}

class C extends B{

}

class D extends B{

}

public class Demo {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
//this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}
