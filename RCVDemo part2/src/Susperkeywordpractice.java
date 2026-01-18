
class tert{
	int a;
	tert(){
		a=8;
		System.out.println(a);
	}
	void m1() {
		System.out.println("Mainak");
	}
}
class tert1 extends tert{
	int b;
	tert1(){
		b=9;
		System.out.println(b);
	}
	void m2() {
		super.m1();
		System.out.println("Chowdhury");
	}
}
public class Susperkeywordpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        tert1 t1 = new tert1();
        t1.m2();
	}

}
