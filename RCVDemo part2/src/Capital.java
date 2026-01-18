import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 =" ";
        int ln = str.length();
        for(int i=0;i<ln;i++) {
        	if(str.charAt(i)<=90 && str.charAt(i)>=65 ) {
        		str1=str1 + str.charAt(i);
        	}
        }
        System.out.println(str1);
	}

}
