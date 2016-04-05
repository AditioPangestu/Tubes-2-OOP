public class Manusia extends Hewan {
	
	/**
     * A Constructor.
     * It use default parameters.
     * @see MakhlukHidup
	 * @see HuntingSkill
	 * @see Gerak
     */
    Manusia();

 
	/**
	 * Setter procedure for menghindar attribute
	 * @param m A first parameter will be assigned in menghindar atrribute
	 */
    public void setMenghindar(bool m);

    /**
     * Getter function for menhindar attribute
     * @return menghindar attribute
     */
    public bool getMenghindar ();


    /**
     * A procedure changes posisi attribute.
     * It uses direction that assigned by _arah.
     * @see Gerak#gerak_berarah()
     */
    public void gerak_berarah();

    /**
     * A private attribute.
     * It stores the dodge condition.
     */
    private bool menghindar;
}