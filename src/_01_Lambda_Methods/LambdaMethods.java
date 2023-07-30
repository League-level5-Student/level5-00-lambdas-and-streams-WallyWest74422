package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((b)->{
			StringBuilder Bob = new StringBuilder(b);
			System.out.println(Bob.reverse().toString());
					
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((m)->{
			StringBuilder Bob = new StringBuilder(m);
			StringBuilder Beaver = new StringBuilder();
			for(int i =0; i<m.length(); i+=2) {
				Beaver.append(Bob.substring(i, i+1).toUpperCase().toString());
				Beaver.append(Bob.substring(i+1, i+2).toString());
			}
				System.out.println(Beaver.toString());	
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((p)->{
			StringBuilder Builder = new StringBuilder();
			String[] letters = p.split("");
			for(int i =0; i<letters.length; i++) {
	Builder.append(letters[i]);
	Builder.append(".");
			}
			Builder.deleteCharAt(Builder.length()-1);
			System.out.println(Builder.toString());
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((v)->{
//			StringBuilder Builder = new StringBuilder(v);
for (int i = 0; i < v.length(); i++) {
v = v.replace("a", "");
v = v.replace("e", "");
v = v.replace("i", "");
v = v.replace("o", "");
v = v.replace("u", "");
}
System.out.println(v);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
