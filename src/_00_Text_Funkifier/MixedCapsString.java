package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				char c = Character.toUpperCase(s.charAt(i));
				result += c;
			} else {
				char c = Character.toLowerCase(s.charAt(i));
				result += c;
			}
		}
		return result;
	}

}
