public class Dosen {
	private String nama;
	private String nip;
	private String matkul;
	
	public Dosen(String nama, String nip, String matkul) {
		super();
		this.nama = nama;
		this.nip = nip;
		this.matkul = matkul;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getMatkul() {
		return matkul;
	}

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}
}
