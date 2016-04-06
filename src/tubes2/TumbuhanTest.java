package tubes2;

class TumbuhanTest
{
	public static void main(String[] args)
	{
		Tumbuhan pohon = new Tumbuhan();
		Tumbuhan rumput = new Tumbuhan();

		Factory.makePohon(pohon);
		pohon.setPosisi(new Point(2,2));

		Factory.makeRumput(rumput);
		rumput.setPosisi(new Point(1,1));

		Herbivora unta = new Herbivora();
		Factory.makeUnta(unta);
		unta.setPosisi(new Point(2,2)); 

		System.out.println("Pohon");
		System.out.println("Posisi: "+ pohon.getPosisi());
		System.out.println("isMati: "+ pohon.isMati());
		System.out.println("");

		System.out.println("Rumput");
		System.out.println("Posisi: "+ rumput.getPosisi());
		System.out.println("isMati: "+ rumput.isMati());
		System.out.println("");

		System.out.println("Tes_Reaksi=================================");
		pohon.Reaction(unta);
		unta.setPosisi(new Point(1,1));
		rumput.Reaction(unta); 
		System.out.println("");

		System.out.println("Pohon");
		System.out.println("Posisi: "+ pohon.getPosisi());
		System.out.println("isMati: "+ pohon.isMati());
		System.out.println("");

		System.out.println("Rumput");
		System.out.println("Posisi: "+ rumput.getPosisi());
		System.out.println("isMati: "+ rumput.isMati());
		System.out.println("");

	}
}