package baitap.baitap1;

public class Cat {
	
	private String mauLong;
	private int old;
	private String monAn;
	private String mauMat;
	private String nameRieng;
	
	public String getMauLong() {
		return mauLong;
	}
	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) throws OldCatException {
		if(old < 0 || old > 50) {
			throw new OldCatException("tuoi meo khong hop le");
		}else {
			this.old = old;
		}
	}
	public String getMonAn() {
		return monAn;
	}
	public void setMonAn(String monAn) {
		this.monAn = monAn;
	}
	public String getMauMat() {
		return mauMat;
	}
	public void setMauMat(String mauMat) {
		this.mauMat = mauMat;
	}
	public String getNameRieng() {
		return nameRieng;
	}
	public void setNameRieng(String nameRieng) {
		this.nameRieng = nameRieng;
	}
	public Cat(int old) throws OldCatException {
		setOld(old);
	}
	public Cat(String mauLong, int old, String monAn, String mauMat, String nameRieng) {
		this.mauLong = mauLong;
		this.old = old;
		this.monAn = monAn;
		this.mauMat = mauMat;
		this.nameRieng = nameRieng;
	}
	
	
	
	
}
