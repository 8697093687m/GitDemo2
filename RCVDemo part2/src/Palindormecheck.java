import java.util.Scanner;

public class Palindormecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2 = new StringBuilder(str1).reverse().toString();
        if(str2.equals(str1)){
        	System.out.println(str2+":"+"String is a palindrome");
        }
        else {
        	System.out.println("String is not a palindrome");
        }
	}	
}	

	
