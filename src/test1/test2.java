package test1;

public class test2 {
	
	final int aaa = 1;
	
	//Chi co the declare o top level calss, khong phai trong method
	//Dinh nghia 1 tap constant ma khong can gan gia tri cho chung
	// Kieu la ten cua tap constant
	enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		int total = 0, count;
		final int DAYS_PER_WEEK = 7;
		Weekday a = Weekday.MONDAY;
		if (a.equals(Weekday.MONDAY)) {
			System.out.println("monday");
		} else {
			System.out.println("nope");
			
		}
		
	}
	
	

}
