public class Hewan extends MakhlukHidup implements Movement {
	/**
	 * An attribute that save the sated rate of the animal
	 */
    private int tingkat_kekenyangan;
    /**
	 * An attribute that save the maximum sated rate of the animal 
	 */
    private int maks_tingkat_kekenyangan;
    /**
	 * An attribute that save the hunger state of the animal
	 */
    private boolean Lapar;
	
	/**
    * Private Attribute yang menyimpan DNA target
    */
    private char[] Target;

    /**
    * Private Attribute yang menyimpan kondisi akan berburu atau tidak
    */
    private boolean memburu;

    /**
    * Constant Private Attribute yang menyimpan ukuran dari tabel Target
    */
    private int ukuran_target;

    /**
    * Private Attribute yang menyimpan kondisi sedang berburu atau tidak
    */
    private bool sedangMemburu;
	
	/**
	 * An attribute that save velocity of movement.
	 */
	int kecepatan;
    /**
	 * An attribute that save direction of movement.
	 */
    int arah;
    
	/**
	 * A constructor
	 * Making an organism with a default value in every parameter
	 */
    public Hewan(){
		super();
		sedangMemburu = false;
		memburu = false;
		ukuran_target = 20;
		tingkat_kekenyangan = kenyang;
	    maks_tingkat_kekenyangan = maks;
	    Lapar = false; 
	    Target = new char[ukuran_target];
	}

    /**
	 * A normal procedure member
	 * A procedure that set the hunger status of the organism
	 */ 
    public void setLapar(){
		if (tingkat_kekenyangan <= (8 * maks_tingkat_kekenyangan/10)){
	        Lapar = true;
	    }
	    else {
	        Lapar = false;
	    }
	}

    /**
	 * A setter for tingkat_kekenyangan
	 * @param an integer arguments that will be assigned to tingkat_kekenyangan
	 */
    public void set_tingkat_kekenyangan(int kenyang){
		tingkat_kekenyangan = kenyang;
	}
	
    /**
	 * A setter for maks_tingkat_kekenyangan
	 * @param an integer arguments that will be assigned to maks_tingkat_kekenyangan
	 */
    public void set_maks_tingkat_kekenyangan(int maks){
		maks_tingkat_kekenyangan = maks;
	}
	
	/**
    * Prosedur setter untuk atribut Memburu
    * @param M , parameter pertama yang menyimpan kondisi yang akan diubah
    */
    public void setMemburu(bool M){
		memburu = M;
	}

    public void setSedangMemburu(bool s){
		sedangMemburu = s;
	}
	
	/**
    * Prosedur setter untuk atribut tabel Target
    * @param i , parameter pertama yang menyimpan nilai indeks tabel
    * @param _target , parameter kedua yang menyimpan DNA target
    */
    public void setTarget (int i, char _target){
		Target[i] = _target;
	}

	public void set_Arah_Bebas()
	{
	    int _arah = dist(mt);
	    set_Arah(_arah);
	}
	
	public void set_Arah_Memburu(Point Awal, Point Target)
	{
	    if ((Awal.getAbsis() == Target.getAbsis()) && (Awal.getOrdinat() > Target.getOrdinat()))
	        set_Arah(1);
	    else if ((Awal.getAbsis() < Target.getAbsis()) && (Awal.getOrdinat() > Target.getOrdinat()))
	        set_Arah(2);
	    else if ((Awal.getAbsis() < Target.getAbsis()) && (Awal.getOrdinat() == Target.getOrdinat()))
	        set_Arah(3);
	    else if ((Awal.getAbsis() < Target.getAbsis()) && (Awal.getOrdinat() < Target.getOrdinat()))
	        set_Arah(4);
	    else if ((Awal.getAbsis() == Target.getAbsis()) && (Awal.getOrdinat() < Target.getOrdinat()))
	        set_Arah(5);
	    else if ((Awal.getAbsis() > Target.getAbsis()) && (Awal.getOrdinat() < Target.getOrdinat()))
	        set_Arah(6);
	    else if ((Awal.getAbsis() > Target.getAbsis()) && (Awal.getOrdinat() == Target.getOrdinat()))
	        set_Arah(7);
	    else
	        set_Arah(8);
	}
	
	public void set_Arah_Menjauh(Point Awal, Point Predator)
	{
	    if ((Awal.getAbsis() == Predator.getAbsis()) && (Awal.getOrdinat() > Predator.getOrdinat()))
	        set_Arah(5);
	    else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() > Predator.getOrdinat()))
	        set_Arah(6);
	    else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() == Predator.getOrdinat()))
	        set_Arah(7);
	    else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
	        set_Arah(8);
	    else if ((Awal.getAbsis() == Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
	        set_Arah(1);
	    else if ((Awal.getAbsis() > Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
	        set_Arah(2);
	    else if ((Awal.getAbsis() > Predator.getAbsis()) && (Awal.getOrdinat() == Predator.getOrdinat()))
	        set_Arah(3);
	    else
	        set_Arah(4);
	}
	
    /**
	 * A getter for tingkat_kekenyangan
	 * @return an integer
	 */ 
    public int get_tingkat_kekenyangan(){
		return tingkat_kekenyangan;
	}
    
    /**
	 * A getter for maks_tingkat_kekenyangan
	 * @return an integer
	 */ 
    public int get_maks_tingkat_kekenyangan(){
		return maks_tingkat_kekenyangan;
	}
	
    /**
	 * A getter for hunger status
	 * @return a boolean
	 */ 
    public boolean get_lapar(){
		return Lapar;
	}

    public bool getSedangMemburu(){
		return sedangMemburu;
	}
    
    /**
    * Fungsi getter untuk atribut tabel Target
    * @return Mengembalikan atribut tabel Target
    */
    public char[] getTarget(){
		return Target;
	}

    /**
    * Fungsi getter untuk atribut Memburu
    * @return Mengembalikan atribut Memburu
    */
    public boolean getMemburu(){
		return memburu;
	}

    /**
    * Fungsi mencari anggota untuk atribut tabel Target
    * @param _target , parameter pertama yang menyimpan DNA yang akan dicari
    * @return Mengembalikan nilai true jika _target berada pada tabel Target
    */
    public bool isTarget(char _target){
		int i = 0;
	    bool stop = false;
	    while ((i < ukuran_target) && (!stop)){
	        if (Target[i] == _target){
	            stop = true;
	        } else
	            i++;
	    }
	    return (i < ukuran_target);
	}
	
	public int get_Kecepatan()
{
    return kecepatan;
}

	public int get_Arah()
	{
	    return arah;
	}
	
    /**
	 * A normal procedure member
	 * A procedure that processing the death of the animal
	 */  
    public void hewanMati(){
		if (tingkat_kekenyangan == 0) {
			setMati(true);
		}
	}
    
    /**
	 * A normal procedure member
	 * A procedure that makes animal move in a direction that has been set
	 */ 
    public void gerak_berarah(){
		tingkat_kekenyangan--;
	    hewanMati();
	    if (!isMati()){
	        setLapar();
	        if (Lapar){
	            setMemburu(true);
	        }
	        else{
	            setMemburu(false);
	        }
	    }
	    setPosisi(gerak_berarah(getPosisi()));
	}
	
}
