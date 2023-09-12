package baitap.baitap2;

public class Account {
	private long idAccount;
	private long idSTK;
	private String nameTK;
	private double soDu;
	
	
	public long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}
	public long getIdSTK() {
		return idSTK;
	}
	public void setIdSTK(long idSTK) {
		this.idSTK = idSTK;
	}
	public String getNameTK() {
		return nameTK;
	}
	public void setNameTK(String nameTK) {
		this.nameTK = nameTK;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public Account(long idAccount, long idSTK, String nameTK, double soDu) {
		this.idAccount = idAccount;
		this.idSTK = idSTK;
		this.nameTK = nameTK;
		this.soDu = soDu;
	}
	
	public double napTien(double nap) throws TienException {
		if(nap < 0) {
			throw new TienException("so tien ban nhap k hop le");
		}else {
			return soDu += nap;
		}		
		
	}
	
	public double chuyenTien(Account taiKhoanNhan, double tienChuyen) throws TienException{
		
		if( tienChuyen > soDu) {
			throw new TienException("so tien ban muon chuyen khong hop le");
		}else {
			return soDu -= tienChuyen;
		}
		
	}
	
	public double rutTien(double tienRut) throws TienException{
		if(tienRut > soDu) {
			throw new TienException("so tien ban muon rut lon hon so tien ban co? thich an them k?");
		}else {
			return soDu -= tienRut;
		}
		
	}
	
	
}
