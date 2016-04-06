package makhluk2;


class Tumbuhan extends MakhlukHidup
{
	/**
	 * A constructor
	 * Making a plant with a default value in every parameter
	 */
        public Tumbuhan()
	{
            super();
	}
        
	/**
        * A constructor
        * Making a plant in a certain position
        * @param P Point
        */
        public Tumbuhan(Point P){
            super();
            setPosisi(P);
        }
        
	/**
	 * A virtual member procedure
	 * Process Reaction make plant react to the other organism
	 */
	public void Reaction(MakhlukHidup m)
	{
		if (isPredator(m.get_DNA()) && (getPosisi().getAbsis()==m.getPosisi().getAbsis()) 
			&& (getPosisi().getOrdinat()==m.getPosisi().getOrdinat())){
		setMati(true);
		}
	}
}