package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	private LinkedList<KucnaHemija> kucneHemije = new LinkedList<KucnaHemija>();
	private LinkedList<KancelarijskiMaterijal> kancelarijskiMaterijali = new LinkedList<KancelarijskiMaterijal>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga!= null && !knjige.contains(knjiga)) {
			knjige.add(knjiga);
		}else if(knjiga!=null && knjige.contains(knjiga)) {
			int ind = knjige.indexOf(knjiga);
			int kol = knjige.get(ind).getKolicina();
			try {
				knjige.get(ind).setKolicina(kol+ knjiga.getKolicina());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Ne moze se dodati knjiga koja je null!");
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

		if(materijal!= null && !kancelarijskiMaterijali.contains(materijal)) {
			kancelarijskiMaterijali.add(materijal);
		}else if(materijal!=null && kancelarijskiMaterijali.contains(materijal)) {
			int ind = kancelarijskiMaterijali.indexOf(materijal);
			int kol = kancelarijskiMaterijali.get(ind).getKolicina();
			try {
				kancelarijskiMaterijali.get(ind).setKolicina(kol+ materijal.getKolicina());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Ne moze se dodati kancelarijski materijal koji je null!");
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

		if(hemija!= null && !kucneHemije.contains(hemija)) {
			kucneHemije.add(hemija);
		}else if(hemija!=null && kucneHemije.contains(hemija)) {
			int ind = kucneHemije.indexOf(hemija);
			int kol = kucneHemije.get(ind).getKolicina();
			try {
				kucneHemije.get(ind).setKolicina(kol+ hemija.getKolicina());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Ne moze se dodati kucna hemija koja je null!");
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
