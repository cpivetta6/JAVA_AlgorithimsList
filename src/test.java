
public class test {
	
	public static void main(String[] args) {
	
	String s1 = new String ("hello");
	String s2 = new String("World");
	
	s1 = s2;
	s2 = null;
	
	System.gc();
	
	System.out.println(s1);
	
	}
}
