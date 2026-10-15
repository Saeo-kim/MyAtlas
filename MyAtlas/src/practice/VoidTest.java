package practice;

public class VoidTest {
	
	public static void printMessage() {
		System.out.println("안녕하세요! void 메소드입니다.");
		return;
	}
	
	public static int getNumber() {
		System.out.println("int 메서드가 실행되었습니다.");
		return 100; 
	}

	public static void main(String[] args) {
		String result1 = printMessage();
		printMessage();
		int result2 = getNumber();
		System.out.println("받아온 값: " + result2);
	}
}
