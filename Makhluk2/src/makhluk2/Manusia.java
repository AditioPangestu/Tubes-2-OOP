package makhluk2;

public class Manusia extends Hewan {
	/**
     * A private attribute.
     * It stores the dodge condition.
     */
    private boolean menghindar;
	
	/**
     * A Constructor.
     * It use default parameters.
     */
    Manusia(){
		super();
		menghindar = false;
	}
 
	/**
	 * Setter procedure for menghindar attribute
	 * @param m A first parameter will be assigned in menghindar atrribute
	 */
    public void setMenghindar(boolean m){
		menghindar  = m;
	}

    /**
     * Getter function for menhindar attribute
     * @return menghindar attribute
     */
    public boolean getMenghindar (){
		return menghindar;
	}
	
	public void Reaction(MakhlukHidup M){
		if (M.getPosisi()== getPosisi()){
			if (get_DNA() == M.get_DNA()) {
				if (M.get_umur() >= get_umur())
					setMati(true);
			} else if (isPredator(M.get_DNA())) {
					setMati(true);
			}
		}else if (isRadius(10,M.getPosisi())){
			if (isTarget(M.get_DNA()) && (M.get_DNA() != '^')){
				set_Arah_Memburu(getPosisi(),M.getPosisi());
				setSedangMemburu(true);
			}
			else if (!getSedangMemburu())
				set_Arah_Bebas();
		} else if(isRadius(2,M.getPosisi())) {
			if (isPredator(M.get_DNA()))
				set_Arah_Menjauh(getPosisi(),M.getPosisi());
			else if (!getSedangMemburu())
				set_Arah_Bebas();
		} else {
			if (!getSedangMemburu())
				set_Arah_Bebas();
		}
	}
}
