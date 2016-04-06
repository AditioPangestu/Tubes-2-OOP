package tubes2;

public class Karnivora extends Hewan {
	
	/**
	 * An attribute that save the acceleration of movement.
	 */
	private int deltaKecepatan;
	
	/**
	 * A boolean value, used to check wheter the carnivore slowed or not
	 */
	private boolean melambat;
	
	/**
	 * A constructor
	 * Making a carnivore animals with a default value in every parameter
	 */
	public Karnivora(){
		super();
		melambat = false;
		deltaKecepatan = 0;
	}

	/**
	 * A setter for slowed status
	 * @param a boolean arguments that will be assigned to true if the carnivore want to be slowed
	 */
	public void setMelambat( boolean lambat){
		melambat = lambat;
	}
	/**
	 * A setter for the carnivore acceleration
	 * @param an integer arguments that will be assigned to true if the carnivore want to be slowed
	 */
	public void setDeltaKecepatan(int delta){
		deltaKecepatan = delta;
	}
	
	/**
	 * A getter for slowed status
	 */
	public boolean getMelambat(){
		return melambat;
	}
	
	/**
	 * A getter for acceleration of the carnivore
	 */
	public int getDeltaKecepatan(){
		return deltaKecepatan;
	}
	
	/**
	*  A normal member procedure
	*  A procedure to make the animal slowed
	*/
	public void prosesMelambat(){
		int newKecepatan;
		if (get_tingkat_kekenyangan() >= ((8*get_maks_tingkat_kekenyangan())/10)){
			if (!getMelambat()){
				newKecepatan = get_Kecepatan() - deltaKecepatan;
				set_Kecepatan(newKecepatan);
				setMelambat(true);
			}
		}
		else{
			if (getMelambat()){
				newKecepatan = get_Kecepatan() + deltaKecepatan;
				set_Kecepatan(newKecepatan);
				setMelambat(false);
			}
		}
	}
	
	/**
	*  A normal member procedure that take 1 arguments
	*  A procedure that makes carnivore react to an organism input
	*  @param an organism
	*/
	public void Reaction(MakhlukHidup M){
		prosesMelambat();
		if (M.getPosisi()== getPosisi()){
			if (get_DNA() == M.get_DNA()) {
				if (M.get_umur() >= get_umur())
					setMati(true);
			} else if (isPredator(M.get_DNA())) {
					setMati(true);
			} else if (isTarget(M.get_DNA()))
				set_tingkat_kekenyangan(get_maks_tingkat_kekenyangan());
		} else if (isRadius(3,M.getPosisi())){
			if (isTarget(M.get_DNA()) && (M.get_DNA() != '!'))
				set_Arah_Memburu(getPosisi(),M.getPosisi());
			else
				set_Arah_Bebas();
		} else{
			set_Arah_Bebas();
		}
	}
}
