import java.util.Scanner;
public class BigAddition {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Please input you first number to add:");
		String FirstInt = key.nextLine();
		System.out.println("Please input you second number to add:");
		String SecondInt = key.nextLine();
		
		
		int length = 0;
		if ((FirstInt.length()-1) > (SecondInt.length()-1)) {
			for (int g = 0; g<= (FirstInt.length()-2);g++) {
				SecondInt =  "0" + SecondInt.substring(0);
			}
				length = FirstInt.length();
			}else if ((SecondInt.length()-1) > (FirstInt.length()-1)) {
				for (int g = 0; g<= (SecondInt.length()-2);g++) {
					FirstInt =  "0" + FirstInt.substring(0);
				}
				length = (SecondInt.length());
			}else if ( (FirstInt.length()-1) == (SecondInt.length()-1)) {
				length = FirstInt.length();
			}
		int[] one = new int[length];
		int[] two = new int[length];
		int carry = 0;
		int[] output = new int[length];

		System.out.println(FirstInt);
		System.out.println(SecondInt);
		
		for(int o  = FirstInt.length()-1;o>=0;o--) {
			
			one[o]=Integer.parseInt(Character.toString(FirstInt.charAt(o)));
			
		}
		for(int t  = SecondInt.length()-1;t>=0;t--) {
			
			two[t]=Integer.parseInt(Character.toString(SecondInt.charAt(t)));
			
		}
		
		for(int l = length-1; l>=0;l--) {
			
			if(carry==0) {
				System.out.println(one[l]+ "+" +two[l] + "=");
				int current = one[l]+two[l];
				if(current >= 10) {
					carry = 1;
					output[l]= current%10;
				}else if(current<10) {
					output[l]= current;
				}
				System.out.println(output[l]);
			}else if( carry==1) {
				System.out.println(one[l]+ "+" +two[l] + "=");
				int current = one[l]+two[l]+1;
				carry = 0;
				if(current >= 10) {
					carry = 1;
					output[l]= current%10;
				}else if(current<10) {
					output[l]= current;
				}
				System.out.println(output[l]);
			}
			
		}
		
		System.out.println("You number is:");
		System.out.println("");
		if(carry == 1) {
			System.out.print(carry);
		}
		for(int i = 0; i<=length-1;i++) {
			System.out.print(output[i]);
		}

	}
	

}
