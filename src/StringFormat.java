
/* Using string format do
   String concatenation,Adds 0's after decimal point,Adding spaces before the number,Concatenates the arguments,leftpadding */

class StringFormat {
	public static void main(String[] args) {

		//String concatenation
		String str="Pavi";
		String s1=String.format("My name is "+str);
		System.out.println(s1);

		//Adds 0's after decimal point
		String s2=String.format("Adds 0's after decimal point: %.4f",12.1);
		System.out.println(s2);    //Output: 12.1000

		//Adds spaces before the number
		String s3=String.format("Adding spaces before number: %10.3f",3.2);
		System.out.println(s3);    //Output:           3.200

		//Concatenates the argument
		String str1="Str1";
		String str2="Str2";
		String s4=String.format("Concatenated arguments: "+"%1$s,%2$s",str1,str2);
		System.out.println(s4);    //Output: Str1,Str2

		//Left Padding
		String s5=String.format("Left padding: %07d ",123);
		System.out.println(s5);    //Output: 0000123(7 digits)

	}
}
