package tubes2;

class HerbivoraTest
{
	public static void main(String[] args)
	{
		Herbivora unta 	= new Herbivora();
		Herbivora gajah	= new Herbivora();

		Factory.makeUnta(unta);
		Factory.makeGajah(gajah);

		System.out.println("Unta");
		System.out.println("getpercepat: "+ unta.get_percepat());
		System.out.println("getdeltakecepatan: "+ unta.get_deltaKecepatan());
		System.out.println("");

		System.out.println("Gajah");
		System.out.println("getpercepat: "+ gajah.get_percepat());
		System.out.println("getdeltakecepatan: "+ gajah.get_deltaKecepatan());
		System.out.println("");


		System.out.println("setPercepat dan setDeltaKecepatan==================================");
		unta.set_percepat(true);
		unta.set_deltaKecepatan(5);
		gajah.set_percepat(true);
		gajah.set_deltaKecepatan(9);
		System.out.println("");


		System.out.println("Unta");
		System.out.println("[true]getpercepat: "+ unta.get_percepat());
		System.out.println("[5]getdeltakecepatan: "+ unta.get_deltaKecepatan());
		System.out.println("");

		System.out.println("Gajah");
		System.out.println("[true]getpercepat: "+ gajah.get_percepat());
		System.out.println("[9]getdeltakecepatan: "+ gajah.get_deltaKecepatan());
		System.out.println("");


		System.out.println("prosesMempercepat===================================================");
		unta.prosesMempercepat();
		gajah.prosesMempercepat();
		System.out.println("");


		System.out.println("Unta");
		System.out.println("[true]getpercepat: "+ unta.get_percepat());
		System.out.println("[10]getkecepatan: "+ unta.get_Kecepatan());
		System.out.println("");

		System.out.println("Gajah");
		System.out.println("[true]getpercepat: "+ gajah.get_percepat());
		System.out.println("[11]getkecepatan: "+ gajah.get_Kecepatan());
		System.out.println("");


		System.out.println("tes_Posisi========================================================");
		unta.setPosisi(new Point(2,2));
		System.out.println("Unta");
		System.out.println("Posisi:"+ unta.getPosisi());
		System.out.println("");

		gajah.setPosisi(new Point(5,5));
		System.out.println("gajah");
		System.out.println("Posisi:"+ gajah.getPosisi());
		System.out.println("");

		System.out.println("tes_Reaksi========================================================");
		/*unta.Reaction(gajah);
		gajah.Reaction(unta);
		unta.setPosisi(new Point(2,2));
		System.out.println("Unta");
		System.out.println("Posisi:"+ unta.getPosisi());
		System.out.println("");

		gajah.setPosisi(new Point(5,5));
		System.out.println("gajah");
		System.out.println("Posisi:"+ gajah.getPosisi());
		System.out.println("");
		*/
	}
}