package baitap.baitap1;

public class main {
	public static void main(String[] args) {
	    try {
	        Cat cat1 = new Cat(60);
	    } catch (OldCatException e) {
	        System.out.println(e.getMessage());
	    }
	}

}
