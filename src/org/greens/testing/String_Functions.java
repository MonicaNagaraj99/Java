package org.greens.testing;

public class String_Functions {

	public static void main(String[] args) {
		String s = "Selenium with JAVA";
		String t = "  Selenium with java";

		int length_S = s.length();
		System.out.println("Length of string : " + length_S);

		boolean equals_S = s.equals(t);
		System.out.println(equals_S);

		boolean equalsIgnoreCase_S = s.equalsIgnoreCase(t);
		System.out.println(equalsIgnoreCase_S);

		String upperCase_S = s.toUpperCase();
		System.out.println(upperCase_S);

		String lowerCase_S = s.toLowerCase();
		System.out.println(lowerCase_S);

		char charAt_S = s.charAt(14);
		System.out.println(charAt_S);

		int indexOf_T = t.indexOf('i');
		System.out.println(indexOf_T);

		int lastIndexOf_S = s.lastIndexOf('i');
		System.out.println(lastIndexOf_S);

		boolean contains_S = s.contains("with");
		System.out.println(contains_S);

		boolean startsWith_S = s.startsWith("Sel");
		System.out.println(startsWith_S);

		boolean endsWith_S = s.endsWith("A");
		System.out.println(endsWith_S);

		String trim_T = t.trim();
		System.out.println(trim_T);

		String replace_S = s.replace(" ", "~");
		System.out.println(replace_S);

		String concat_S = s.concat(t);
		System.out.println(concat_S);

		String substring_T = s.substring(14);
		System.out.println(substring_T);

		String substring_S = s.substring(9, 12);
		System.out.println(substring_S);

		String join_S = s.join("*", "Join", "function", "in", "String");
		System.out.println(join_S);

		boolean empty_T = t.isEmpty();
		System.out.println(empty_T);

		String[] split_S = s.split("");
		for (String string : split_S) {
			System.out.println(string);
		}

		String[] split_T = t.split(" ");
		for (String string : split_T) {
			System.out.println(string);
		}

		String c = "!@#$%Re^&place *(function)?";
		String replaceAll_C = c.replaceAll("[a-zA-Z ]", ".");
		System.out.println(replaceAll_C);

		String d = "Papaya";
		int indexOf_D = d.indexOf("a", 2);
		System.out.println(indexOf_D);
		
		
	}
}
