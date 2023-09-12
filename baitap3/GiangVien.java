package baitap.baitap3;

public class GiangVien {
	private String maGV;
	private String fullName;
	private MonHoc monHoc;
	private double Luong;
	private float soNamKn;
	
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	
	public double getLuong() {
		return Luong;
	}
	public void setLuong(double luong) {
		Luong = luong;
	}
	public float getSoNamKn() {
		return soNamKn;
	}
	public void setSoNamKn(float soNamKn) {
		this.soNamKn = soNamKn;
	}
	public GiangVien(String maGV, String fullName, MonHoc monHoc, double luong, float soNamKn) {
		this.maGV = maGV;
		this.fullName = fullName;
		this.monHoc = monHoc;
		Luong = luong;
		this.soNamKn = soNamKn;
	}
	
	
}
