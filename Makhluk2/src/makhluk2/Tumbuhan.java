package makhluk2;


class Tumbuhan extends MakhlukHidup
{
	public Tumbuhan()
	{
		
	}	
	/*
	 * A constructor with 5 parameter
	 * @param an integer for the age limit of the animal
	 * @param a character of the carnivore's DNA
	 * @param an integer "birthday" that saves the birthday time for animal
	 * @param a Point that tells the position of the Carnivore
	 * @param a List of char that contain the predator of the plant
	 * */
	/**
	 * A virtual member procedure
	 * Process Reaction make plant react to the other organism
	 */
	public void Reaction(MakhlukHidup m)
	{
		if (isPredator(m.get_DNA()) && (getPosisi()==m.getPosisi())) {
		setMati(true);
		}
	}
}