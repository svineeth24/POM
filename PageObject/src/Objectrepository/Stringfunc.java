package Objectrepository;

public class Stringfunc {

	public static void main(String args[]) {
		String test="my12 tr58er 6Sdds 5r.";
		System.out.println(test.replaceAll("[a-zA-Z.]", ""));
		char[] Char=test.toCharArray();
		for(int i=Char.length-1;i>=0;i--) {
			System.out.print(Char[i]);
		}
	}
}
