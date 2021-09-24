
import java.io.File;
import java.util.Scanner;
class Encrypt_Decrypt{
	Scanner input = new Scanner(System.in);
	String result;
	String val;
	String res;
	int res1;
	void Encrypt(){
	      System.out.println("Input your message: ");
	      String stri = input.next();
	      StringBuffer sb = new StringBuffer();
	      //Converting string to character array
	      char ch[] = stri.toCharArray();
	      for(int i = 0; i < ch.length; i++) {
	         String hexString = Integer.toHexString(ch[i]);
	         sb.append(hexString);
	      }
	      result = sb.toString();
	      System.out.println("Input password (must be greater than 8 characters) :" );
	      StringBuffer sb1 = new StringBuffer();
	      //Converting string to character array
	  
	      int s=1;
	      String string1 = input.next();
	      char ch1[] = string1.toCharArray();
	      while(s==1) {
	    	  int ctr=0;
	      for(int i = 0; i < ch1.length; i++) {
	    	  ctr++;
	         String hexString = Integer.toHexString(ch1[i]);
	         sb1.append(hexString);
	    	  }
	    	  if(ctr>8) 
	    		  break;
	    	  else
	    	  {
	    		  System.out.println("Invalid password length.Please try again or press ctrl->c to quit.");
	    		  string1 = input.next();
	    	  }
	      }
    	  s=0;
    	  res=sb1.toString();
	      System.out.println("Your cipher text = "+result);
	      System.out.println("Your cipher Password = " +res);
	     
	}
	void Decrypt() {
	      String result1 = new String();
	      char[] charArray = result.toCharArray();
	      for(int i = 0; i < charArray.length; i=i+2) {
	         String st = ""+charArray[i]+""+charArray[i+1];
	         char ch = (char)Integer.parseInt(st, 16);
	         result1 = result1 + ch;
	      }
	      System.out.println("Your Original Text = "+result1);
	      
	      
	      String result2 = new String();
	      char[] charArray2 = res.toCharArray();
	      for(int i = 0; i < charArray2.length; i=i+2) {
	         String st1 = ""+charArray2[i]+""+charArray2[i+1];
	         char ch1 = (char)Integer.parseInt(st1, 16);
	         result2 = result2 + ch1;
	      }
	      System.out.println("Your Original Password = "+result2);
	      
	}
}

public class Cipher {

	public static void main(String[] args) {
		System.out.println("Welcome to My Encryption/Decryption Program");
		int status=1;
		File myobj= new File("Chipher.txt");
		Encrypt_Decrypt ob= new Encrypt_Decrypt();
		Scanner input= new Scanner(System.in);
		while(status==1) {
			System.out.println("Please enter the letter of your chosen operation:");
			System.out.println("\ta) Encrypt a message\n" + 
					"\tb) Decrypt a message\n"
					+ "\tc) Exit");
			System.out.println("Enter Option: ");
			char x= input.next().charAt(0);
			if((x=='a')||(x=='A')) {
				ob.Encrypt();
			}
			else if((x=='b')||(x=='B')) {
				ob.Decrypt();
			}
			else if((x=='c')||(x=='C'))
			{
				System.out.println("You are run out of the program.");
				break;
			}
			else {
				System.out.println("Invalid choice, please try again.");
			}
			}

	}

}
