package ifelse;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a="hello";
     System.out.println("length: "+a.length());
     System.out.println("charat: "+a.charAt(3));
     System.out.println("To Check Blank: "+a.isBlank());
     System.out.println("uppercase: "+a.toUpperCase());
     System.out.println("lowercase: "+a.toLowerCase());
     System.out.println("startswith: "+a.startsWith("he"));
     System.out.println("endwith: "+a.endsWith("he"));
     String b="Ajava";
     System.out.println("concate: "+a.concat(b));
     String c="ajavajava";
     System.out.println("equal: "+b.equals(c));
     System.out.println("equalignore: "+b.equalsIgnoreCase(c));
     System.out.println("Compare to: "+c.compareToIgnoreCase(b));
     System.out.println("indexof: "+c.indexOf('j'));
     System.out.println("lastindexof: "+c.lastIndexOf('j'));
     System.out.println("equalignore: "+b.equalsIgnoreCase(c));
     System.out.println("length: "+a.length());
	}

}
