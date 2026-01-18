import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String str= sc.nextLine();
         String reversed = new StringBuilder(str).reverse().toString();
         System.out.println(reversed);
	}

}
