import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String ULword = "";
		int tmp;
		for(int i=0;i<word.length();i++) {
			tmp = (int)word.charAt(i);
			if((65<=tmp) && (tmp<=90)) {
				ULword += (char)(tmp+32);
			}else if((97<=tmp) && (tmp<=122)) {
				ULword += (char)(tmp-32);
			}else {
				ULword += (char)tmp;
			}
		}
		System.out.println(ULword);
	}

}
