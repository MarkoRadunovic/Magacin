package magacin.interfejs;

import java.util.LinkedList;

import magacin.KancelarijskiMaterijal;
import magacin.Knjiga;
import magacin.KucnaHemija;

public interface MagacinInterfejs {

	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public Knjiga pronadjiIVratiKnjigu(int sifra);
	
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal materijal);
	public void obrisiKancelarijskiMaterijal(KancelarijskiMaterijal materijal);
	public KancelarijskiMaterijal pronadjiIVratiKancMaterijal(int sifra);

	public void dodajKucnuHemiju(KucnaHemija hemija);
	public void obrisiKucnuHemiju(KucnaHemija hemija);
	public KucnaHemija pronadjiIVratiKucnuHemiju(int sifra);
	
	
}
