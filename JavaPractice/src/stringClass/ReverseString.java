package stringClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public void Reverse(String s) {

		char[] a = s.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i]);

		}
		System.out.print("\t");
	}

	// 2nd Method
	public void Reverse2New(String input) {
		char[] s = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);

	}

	// 3rd Method swap method
	public void Reverse3rdMethod(String S) {

		char[] temp = S.toCharArray();
		int left, right = 0;

		right = S.length() - 1;
		for (left = 0; left < right; left++, right--) {

			char tmp = temp[left];
			temp[left] = temp[right];
			temp[right] = tmp;
		}

		for (char c : temp) {
			System.out.print(c);
		}

	}

	// 4th method
	public void Reverse4thMethod(String str) {

		char[] t = str.toCharArray();
		List<Character> al = new ArrayList<>();

		for (char c : t)

			al.add(c);

		Collections.reverse(al);

		System.out.print(al);

		ListIterator<Character> it = al.listIterator();

		while (it.hasNext())
			
			System.out.print(it.next());

	}

	public static void main(String[] args) {
		ReverseString RS = new ReverseString();
		RS.Reverse("Pramod");
		RS.Reverse2New("JaiKishan");
		RS.Reverse3rdMethod("KumarGangwar");
		RS.Reverse4thMethod("moksha");
	}

}
