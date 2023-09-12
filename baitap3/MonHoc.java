package baitap.baitap3;

public class MonHoc {
	private int id;
	private String nameMonHoc;
	

	public String getNameMonHoc() {
		return nameMonHoc;
	}

	public void setNameMonHoc(String nameMonHoc) {
		this.nameMonHoc = nameMonHoc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MonHoc(int id) {
		this.id = id;
	}

	public MonHoc(int id, String nameMonHoc) {
		this.id = id;
		this.nameMonHoc = nameMonHoc;
	}
	
	
}
