package weeek1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String email = "gayathri,b3@tcs,com";
		String Pat = "[a-z0-9.]+@[a-z]+[.][a-z]{2,3}";
		Pattern newPat = Pattern.compile(Pat);
		//System.out.println(newPat);
		Matcher checkFlag =newPat.matcher(email);
		System.out.println(checkFlag.matches());
	}
}
