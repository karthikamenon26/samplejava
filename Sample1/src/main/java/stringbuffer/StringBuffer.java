package stringbuffer;

public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer buff=new StringBuffer("Hello");
		
		buff.insert(1, "World");
		System.out.println(buff);
		
		buff.replace(1,"World");
		System.out.println(buff);
		
		buff.delete(1,2);
		System.out.println(buff);
		
		buff.reverse();
		System.out.println(buff);
		
		System.out.println(buff);
	}

	void reverse() {
		// TODO Auto-generated method stub
		
	}

	private void delete(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void replace(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
