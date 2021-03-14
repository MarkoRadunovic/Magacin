package magacin;

import java.util.Date;

public class KucnaHemija {

	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	private Date rokTrajanja;
	
	
	
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
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(Date rokTrajanja) throws Exception{
		if(rokTrajanja == null || rokTrajanja.before(new Date())) {
			throw new Exception("Rok trajanja ne sme biti null i ne sme biti pre datuma kreiranja artikla");
		}
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina
				+ ", rokTrajanja=" + rokTrajanja + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + ((rokTrajanja == null) ? 0 : rokTrajanja.hashCode());
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
		KucnaHemija other = (KucnaHemija) obj;
		
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	
	
}
