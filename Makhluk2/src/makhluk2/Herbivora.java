

class Herbivora extends Hewan 
{

	/**
     *  Store information how fast the Herbivore got to be.
     */
    private int deltaKecepatan;
    /**
     *  Store information is Herbivore need to get faster or not.
     */
    private boolean percepat;


    /**
     *  constructor with no parameter
     */
    public Herbivora()
    {
    	set_deltaKecepatan(0);
		set_percepat(false);
    }
    
    /**
     *  set the state of the Herbivore to Accelerated or not
     */
    public void set_percepat(boolean cepat)
    {
    		percepat = cepat;
    }
    /**
     *  set the acceleration
     */
    public void set_deltaKecepatan(int kec)
    {
    	deltaKecepatan = kec;
    }
    /**
     *  get the state of the Herbivore
     *  @param a boolean, true if the Herbivore is accelerated
     */
    public boolean get_percepat()
    {
    	return percepat;
    }
    /**
     *  get the acceleration
     * 	@return an integer
     */
    public int get_deltaKecepatan()
    {
    	return deltaKecepatan;
    }
    /**
     *  a procedure to simulate how the herbivore move faster
     */
    public void prosesMempercepat()
    {
    	set_Kecepatan(get_Kecepatan()+get_deltaKecepatan());
    }
    /**
     *  a procedure that makes herbivore react to its environment
     * 	Herbivore can eat, or going faster to flee away from its predator
     * 	@param a MakhlukHidup, another MakhlukHidup near the Herbivore
     */
    public void Reaction(MakhlukHidup m)
    {
    	if (getPosisi() == m.getPosisi()) {
			if (get_DNA() == m.get_DNA()) {
				setMati(true);
			} else {
				if (isPredator(m.get_DNA())) {
					setMati(true);
				} else if (isTarget(m.get_DNA())) {
					set_tingkat_kekenyangan(get_maks_tingkat_kekenyangan());
				}
			}
		} else {
			if (isRadius(2,m.getPosisi())) {
				if (isPredator(m.get_DNA())) {
					prosesMempercepat();
					set_Arah_Bebas();
				} else {
					set_Arah_Bebas();
				}
			} else {
				set_Kecepatan(get_Kecepatan());
				set_Arah_Bebas();
			}
		}
    }

}