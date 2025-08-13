package ch8;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try (FileInputStream fs = new FileInputStream("file.txt")) {
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		} finally {
//			System.out.println("Finally!");
//		}
		try (Resource r = new Resource()) {
			r.show();
		} catch (Exception e) {
			System.err.println("에러발생");
		}
	}

}

class Resource implements AutoCloseable {
	void show() {
		System.out.println("res 사용이유");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("res 닫아유");
	}
}