import java.util.Scanner;

public class Noofcapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count=0;
       int ln=str.length();
       for(int i=0;i<ln;i++) {
    	   if(Character.isUpperCase(str.charAt(i))) {
    		   count=count+1;
    	   }
       }
       System.out.println(count);
	}

}
