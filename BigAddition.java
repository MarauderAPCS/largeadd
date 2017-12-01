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
			for (int g = 0; g<= (FirstInt.length()-2);g++) {//for each char of longest string
				SecondInt =  "0" + SecondInt.substring(0);//adds enough leading zeros to make the numbers equal length for easier addition later
			}
				length = FirstInt.length();//sets length of length int to the longest string length
			}else if ((SecondInt.length()-1) > (FirstInt.length()-1)) {
				for (int g = 0; g<= (SecondInt.length()-2);g++) {//for each char of longest string
					FirstInt =  "0" + FirstInt.substring(0);//adds enough leading zeros to make the numbers equal length for easier addition later
				}
				length = (SecondInt.length());//sets length of length int to the longest string length
			}else if ( (FirstInt.length()-1) == (SecondInt.length()-1)) {//if the string are same length dont edit them
				length = FirstInt.length();//sets length of length int to the longest string length
			}
		int[] one = new int[length];//set up top addition row
		int[] two = new int[length];//set up bottom addition row
		int carry = 0;//int used for carrying
		int[] output = new int[length];//output array

		//System.out.println(FirstInt); //debug code to see if numbers were reformatted correctly
		//System.out.println(SecondInt); //debug code to see if numbers were reformatted correctly
		
		for(int o  = FirstInt.length()-1;o>=0;o--) {
			
			one[o]=Integer.parseInt(Character.toString(FirstInt.charAt(o)));//setting the individual ints of the array, one int for each char of the string
			
		}
		for(int t  = SecondInt.length()-1;t>=0;t--) {
			
			two[t]=Integer.parseInt(Character.toString(SecondInt.charAt(t)));//setting the individual ints of the array, one int for each char of the string
			
		}
		
		for(int l = length-1; l>=0;l--) {
			
			if(carry==0) {//if there is nothing to carry
				//System.out.println(one[l]+ "+" +two[l] + "="); //debug code to make sure the numbers are correct
				int current = one[l]+two[l];//the out put is just the two number added
				if(current >= 10) {//if the current number is above ten
					carry = 1;//carry the 1
					output[l]= current%10;//and set the final output num in the array to the the number after carrying
				}else if(current<10) {//if it's below ten
					output[l]= current;//just set it to the final output num in the array to the the number
				}
				//System.out.println(output[l]);//debug code to make sure the numbers are correct
			}else if( carry==1) {//if there is currently a 1 being carried
				//System.out.println(one[l]+ "+" +two[l] + "="); //debug code to make sure the numbers are correct
				int current = one[l]+two[l]+1;//add one to the output after adding the two numbers
				carry = 0;//set carry to 0
				if(current >= 10) {//if the current number is above ten
					carry = 1;//carry the 1
					output[l]= current%10;//and set the final output num in the array to the the number after carrying
				}else if(current<10) {//if it's below ten
					output[l]= current;//just set it to the final output num in the array to the the number
				}
				//System.out.println(output[l]); //debug code to make sure the numbers are correct
			}
			
		}
		
		System.out.println("You number is:");
		System.out.println("");
		if(carry == 1) {
			System.out.print(carry);//if the final number needed to carry a one then add a 1 to the beginning of the final number
		}
		for(int i = 0; i<=length-1;i++) {
			System.out.print(output[i]);//output the sum of the numbers
		}

	}
	

}
