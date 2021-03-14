package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	private LinkedList<KucnaHemija> kucneHemije = new LinkedList<KucnaHemija>();
	private LinkedList<KancelarijskiMaterijal> kancelarijskiMaterijali = new LinkedList<KancelarijskiMaterijal>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public Knjiga pronadjiIVratiKnjigu(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {
		// TODO Auto-generated method stub

	}

	@Override
	public KancelarijskiMaterijal pronadjiIVratiKancMaterijal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dodajKucnuHemiju(KucnaHemija hemija) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKucnuHemiju(KucnaHemija hemija) {
		// TODO Auto-generated method stub

	}

	@Override
	public KucnaHemija pronadjiIVratiKucnuHemiju(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
