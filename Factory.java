

class Factory()
{
	public static void makePohon(Tumbuhan t)
	{
		t.setPredator(0,'g');
		t.setPredator(1,'u');
	}

	public static void makeRumput(Tumbuhan t)
	{
		t.setPredator(0,'u');
		t.setPredator(1,'g');
		t.setPredator(2,'C');
		t.setPredator(3,'H');
		t.setPredator(4,'m');
		t.setPredator(5,'b');
		t.setPredator(6,'h');
		t.setPredator(7,'y');
	}

	public static void makeGajah(Herbivora h)
	{
		h.setPredator(0,'H');
		h.setPredator(1,'h');
		h.setPredator(2,'y');
		h.setPredator(3,'b');

		h.setTarget(0,'!');
		h.setTarget(1,'^');
		h.setTarget(2,'u');
	}

	public static void makeUnta(Herbivora h)
	{
		h.setPredator(0,'H');
		h.setPredator(1,'h');
		h.setPredator(2,'y');
		h.setPredator(3,'b');
		h.setPredator(4,'g');


		h.setTarget(0,'!');
		h.setTarget(1,'^');
	}
}