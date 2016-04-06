
public class KarnivoraTest {
	public static void main (String[] args){
		Karnivora H = new Karnivora();
		
		System.out.println("Test Case Method : setLapar dan getLapar");
		H.setLapar();
		H.set_tingkat_kekenyangan(20);
		H.set_maks_tingkat_kekenyangan(15);
		System.out.println("Hasil : " + H.get_lapar());
		System.out.println();
		
		System.out.println("Test Case Method : setMemburu dan getMemburu");
		H.setMemburu(true);
		System.out.println("Hasil : " + H.getMemburu());
		System.out.println();
		
		System.out.println("Test Case Method : setSedangMemburu dan getSedangMemburu");
		H.setSedangMemburu(true);
		System.out.println("Hasil : " + H.getSedangMemburu());
		System.out.println();
		
		System.out.println("Test Case Method : setTarget dan getTarget");
		H.setTarget(1,'A');
		H.setTarget(2,'B');
		H.setTarget(3,'C');
		H.setTarget(4,'D');
		char[] tempTarget = H.getTarget();
		System.out.println("Hasil : " + (tempTarget[1] == 'A'));
		System.out.println("Hasil : " + (tempTarget[2] == 'B'));
		System.out.println("Hasil : " + (tempTarget[3] == 'C'));
		System.out.println("Hasil : " + (tempTarget[4] == 'D'));
		System.out.println();
		
		System.out.println("Test Case Method : setTarget dan getTarget");
		H.setSedangMemburu(true);
		System.out.println("Hasil : " + H.getSedangMemburu());
		System.out.println();
		
		System.out.println("Test Case Method : set_Arah dan get_Arah");
		H.set_Arah(2);
		System.out.println("Hasil : " + (H.get_Arah() == 2));
		System.out.println();
		
		System.out.println("Test Case Method : set_Arah_Bebas dan get_Arah");
		H.set_Arah_Bebas();
		System.out.println ("Hasil : " + H.get_Arah());
		System.out.println();
		
		System.out.println("Test Case Method : set_Arah_Memburu dan get_Arah");
		Point awal = new Point(0,0);
		Point target = new Point(0,-2);
		H.set_Arah_Memburu(awal,target);
		System.out.println("Hasil : " + (H.get_Arah() == 1));
		System.out.println();
		
		System.out.println("Test Case Method : set_Arah_Memburu dan get_Arah");
		//Point awal = new Point(0,0);
		Point predator = new Point(0,-2);
		H.set_Arah_Menjauh(awal,predator);
		System.out.println("Hasil : " + (H.get_Arah() == 5));
		System.out.println();
		
		System.out.println("Test Case Method : set_Kecepatan dan get_Kecepatan");
		H.set_Kecepatan(4);
		System.out.println ("Hasil : " + (H.get_Kecepatan() == 4));
		System.out.println();
		
		System.out.println("Test Case Method : set_maks_tingkat_kekenyangan dan get_maks_tingkat_kekenyangan");
		H.set_maks_tingkat_kekenyangan(4);
		H.set_tingkat_kekenyangan(0);
		System.out.println ("Hasil : " + (H.get_maks_tingkat_kekenyangan() == 4));
		System.out.println();
		
		System.out.println("Test Case Method : set_tingkat_kekenyangan dan get_tingkat_kekenyangan");
		H.set_tingkat_kekenyangan(4);
		System.out.println ("Hasil : " + (H.get_tingkat_kekenyangan() == 4));
		System.out.println();
		
		System.out.println("Test Case Method : hewanMati");
		H.setMati(false);
		H.set_tingkat_kekenyangan(0);
		H.hewanMati();
		System.out.println ("Hasil : " + H.isMati());
		System.out.println();
		
		System.out.println("Test Case Method : isTarget");
		System.out.println ("Hasil : " + H.isTarget('A'));
		System.out.println ("Hasil : " + !H.isTarget('K'));
		System.out.println();
	}
}
