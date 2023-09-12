package Collections;

import java.util.HashMap;

public class firstNonRepetedAndRepeted {
	public static void main(String[] args) {

		String a = "aabbccdp";

		char ch[] = a.toCharArray();

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (hs.containsKey(ch[i])) {
				hs.put(ch[i], hs.get(ch[i]) + 1);

			} else {
				hs.put(ch[i], 1);
			}

		}

		for (int i = 0; i < ch.length; i++) {
			if (hs.get(ch[i]) == 1) {
				System.out.println("first non-repeated" + ch[i]);
				break;
			}
		}

		for (char k : ch) {
			if (hs.get(k) > 1) {
				System.out.println("first repeated" + k);
				break;
			}
		}

		for (int i = ch.length - 1; i >= 0; i--) {
        if(hs.get(ch[i]) == 1) {
        	System.out.println("Last non-repeated-" + ch[i]);
        	break;
        }
		}
       for(int i=ch.length-1;i>=0;i--) {
	if(hs.get(ch[i])>1) {
		System.out.println("Last repeated-" +ch[i]);
		break;
	}
}
	}
}
