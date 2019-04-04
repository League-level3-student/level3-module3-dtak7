package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i += 2) {
			result += s.substring(i, i + 1) + '-';
		}
		System.out.println(result);
		return result;
	}

}
