package magacin;

public class KancelarijskiMaterijal {

	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if(naziv==null || naziv.isEmpty()) {
			throw new Exception("Naziv ne sme biti null ili prazan string!");
		}
		else this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) throws Exception {
		if(sifra<0) {
			throw new Exception("Sifra mora biti pozitivan ceo broj!");
		}
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) throws Exception {
		if(naziv==null || naziv.isEmpty()) {
			throw new Exception("Opis ne sme biti null ili prazan string!");
		}
		else this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) throws Exception {
		if(kolicina<=0) {
			throw new Exception("Kolicina mora biti pozitivan broj veci od nule!");
		}
		this.kolicina = kolicina;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;		
		
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	
	
}
