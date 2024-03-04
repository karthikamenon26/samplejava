package stringexample;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sachin";
		String s1="Anu";
		String s2="Manu";
		String s3=new String("Anu");
		String name="HI";
		String s1="hello";
		
		s.concat("Tendulkar");
		System.out.println(s);
		
		s=s.concat("Tendulkar");
		System.out.println(s);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1==s2); //equals to
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s2));
		
		Char ch=name.charAt(2);
		System.out.println(ch);
		
		System.out.println("length=" +s1.length());
		System.out.println("length=" +s2.length());
		
		System.out.println(s1.toUppercase());
		
		System.out.println(s1.toLowercase());
		
		System.out.println(s.trim());
		
		
}
