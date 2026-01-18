
class test34{
	
	int a;
	test34(int a){
		this.a=a;
	}
	void m1() {
		System.out.println(a);
	}
}
public class thiskeywordtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      test34 u = new test34(5);
      u.m1();
	}

}
