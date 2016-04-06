package makhluk2;

public abstract class Manusia extends Hewan {
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
    
    @Override
    public abstract void Reaction(MakhlukHidup M);
}
