
public class Program {
	public static class department {
		int id;
		String name;
	}

	public static void main(String[] args) {
		department dep1 = new department();
		dep1.id = 1;
		dep1.name = "Sale";
		System.out.println("Thông tin phòng ban số 1: ");
		System.out.println("ID: " + dep1.id);
		System.out.println("Name:" + dep1.name);

		department dep2 = new department();
		dep2.id = 2;
		dep2.name = "Dev";
		System.out.println("Thông tin phòng ban số 2: ");
		System.out.println("ID: " + dep2.id);
		System.out.println("Name:" + dep2.name);
	}
}
