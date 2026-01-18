abstract class data{
	
	abstract void m1();
	void m2() {
		System.out.println("M2");
	}
}
class data1 extends data{
	
	void m1() {
		System.out.println("M1");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        data1 dt = new data1();
        dt.m2();
        dt.m1();
	}

}
