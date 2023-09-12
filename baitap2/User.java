package baitap.baitap2;

public class User {
	private long idUser;
	private Account account;
	
	
	
	public long getIdUser() {
		return idUser;
	}



	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public User(long idUser, Account account) {
		super();
		this.idUser = idUser;
		this.account = account;
	}
	
	public void chuyenTien(User nguoiNhan, double tienChuyen) throws TienException {
	    account.chuyenTien(nguoiNhan.getAccount(), tienChuyen);
	}

}
