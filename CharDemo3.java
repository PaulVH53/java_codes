// char variables behave like integers.
class CharDemo3 {
	public static void main(String[] args) {
		int ascii;
		for(ascii = 77; ascii < 86; ascii++)
			{
				System.out.print("char: " + (char)ascii);
				System.out.println("   ord(char): " + ascii);
			}
	}
}