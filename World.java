import java.util.*;
import java.io.*;

class World  {
	private int panjang;
	private int lebar;

///Administrator///=========================================================================
	private int size; //banyak makhluk maksimal
	private int count; //banyak makhluk dalam daftar
	private Vector<MakhlukHidup> daftar;//array pointer objek makhluk

///Konduktor///=============================================================================
    private int lifeState;
    private int Count;

//private//=======================================================================================
    
	private void resetCursor()
	{
		//System call set cursor to (0,0) at console
		
	}
	//=======================================================================================
	private void moveCursor(int x, int y)
	{
		//System call set cursor to (x,y) at console
	}
	//=======================================================================================
	private void cursorSwitch(boolean b)
	{/*
	    HANDLE out = GetStdHandle(STD_OUTPUT_HANDLE);

	    CONSOLE_CURSOR_INFO     cursorInfo;

	    GetConsoleCursorInfo(out, cursorInfo);
	    cursorInfo.bVisible = b; // set the cursor visibility
	    SetConsoleCursorInfo(out, cursorInfo);*/
	}

	private void clear()
	{
		//system("cls");
	}

//public//=============================================================================================

//World//==============================================================================================
	public void initDisplay()
	{
		size = 10;
		count = 0;
		lifeState = 1;
		Count = 0;
		cursorSwitch(false);
		resetCursor();
	    clear();
	    for(int i=0; i<30; ++i)
	    {
	        for(int j=0; j<30; ++j)
	        {
	            System.out.print('.');
	        }
	        System.out.println();
	    }
	}


//=======================================================================================
	public void updateDisplay()
	{
	    for(int i=0; i<get_count(); ++i)
	    {
	        if(get_daftar(i) != null)
	        {
	            if(!get_daftar(i).isMati())
	            {
	                draw(get_daftar(i));
	            }
	            else
	            {
	                endDraw(get_daftar(i));
	                pluck(i);
	            }
	        }
	    }
	}

	public void updateMakhluk(int i)
	{
		boolean end = false;
		while(!end)
		{
			if(get_daftar(i) != null)
			{
				if(!get_daftar(i).isMati())
				{
					draw(get_daftar(i));
					Sleep(100);
				}
				else
				{
					endDraw(get_daftar(i));
					Sleep(3000);
					pluck(i);
					end = true;
				}
			}
		}
	}

	public void draw(Point Px, Point Pc, char display)
	{
		int ex_X = Px.getAbsis();
		int ex_Y = Px.getOrdinat();
		int x = Pc.getAbsis();
		int y = Pc.getOrdinat();

		moveCursor(ex_X, ex_Y);
		System.out.print('.');

		moveCursor(x,y);
		System.out.print(display);
	}

	public void draw(Point Pc, char display)
	{
		int x = Pc.getAbsis();
		int y = Pc.getOrdinat();

		moveCursor(x,y);
		System.out.print(display);
	}

	public void draw(Point Pc, int display)
	{
		int x = Pc.getAbsis();
		int y = Pc.getOrdinat();

		moveCursor(x,y);
		System.out.print(display);
	}

	public void draw(MakhlukHidup m1)
	{
		Point P  = m1.getPosisi();
		Point PP = m1.getPrecPosisi();
		draw(PP, P, m1.get_DNA());

		m1.setPrecPosisi(P);
	}

	public void draw(MakhlukHidup m1)
	{
		if(m1 != null)
		{
			Point P  = m1.getPosisi();
			Point PP = m1.getPrecPosisi();
			draw(PP, P, m1.get_DNA());

			m1.setPrecPosisi(P);
		}
	}

	public void initDraw(MakhlukHidup m1)
	{
		Point P = m1.getPosisi();
		draw(P, m1.get_DNA());

		m1.setPrecPosisi(P);
	}

	public void endDraw(MakhlukHidup m1)
	{
		draw(m1.getPrecPosisi(), '.');
		draw(m1.getPosisi(), '_');
	}

	public boolean isGameOver()
	{

		if(get_count() <= 0) return true;
		else				 return false;

	}

	public void tangkapLayar()
	{
		boolean found = false;
		//ofstream out("out.txt");


		for(int i=0; i<30; ++i)
		{
			for(int j=0; j<30; ++j)
			{
				found = false;
				for(int k=0; k<get_size(); k++)
				{
					if((get_daftar(k) != null) && (get_daftar(k).getPosisi().getAbsis()==j) && (get_daftar(k).getPosisi().getOrdinat()==i))
					{
						System.out.print(get_daftar(k).get_DNA());
						found = true;
					}
				}
				if(!found) System.out.print(".");
			}
			System.out.println();
		}
	}

	public void creation(Point P, char opsi)
	{
		if(get_count() < get_size())
		{
			switch (opsi)
			{
				case '1' :
				{
					Polisi m = new Polisi(P);
					fillDaftar(m);
					break;
				}

				case '2' :
				{
					Herbivora m = new Herbivora(P);
					fillDaftar(m);
					break;
				}

				case '3' :
				{
					Karnivora m = new Karnivora(P);
					fillDaftar(m);
					break;
				}

				case '4' :
				{
					Omnivora m = new Omnivora(P);
					fillDaftar(m);
					break;
				}

				case '5' :
				{
					Pemburu m = new Pemburu(P);
					fillDaftar(m);
					break;
				}

				case '6' :
				{
					Rumput m = new Rumput(P);
					fillDaftar(m);
					break;
				}

				case '7' :
				{
					Pohon m = new Pohon(P);
					fillDaftar(m);
					break;
				}

				case '8' :
				{
					Herbivora m = new Herbivora(P);
					fillDaftar(m);
					break;
				}

				case '9' :
				{
					Karnivora m = new Karnivora(P);
					fillDaftar(m);
					break;
				}

				case '0' :
				{
					Omnivora m = new Omnivora(P);
					fillDaftar(m);
					break;
				}
			}
		}
	}

	public void killAll()
	{
		for(int i=0; i<get_count(); i++)
		{
			if(get_daftar(i) != null)
			{
				get_daftar(i).setMati(true);
			}
		}
	}

///Konduktor///=======================================================================
    public void aging(MakhlukHidup m1) {
	    if((lifeState == 1) && (Count%10 == 0)) {
	        m1.menua();
	    }
    }
    public void pause() {
    	lifeState = 0;
    }
    public void resume() {
    	lifeState = 1;
    }
    public void setCount(int c) {
    	Count = c;
    }
    public int getCount() {
    	return Count;
    }
    public void hidup(MakhlukHidup m1) {
	    Manusia m2 = (Manusia) (m1);
	    Karnivora m3 = (Karnivora) (m1);
	    Herbivora m4 = (Herbivora) (m1);
	    Omnivora m5 = (Omnivora) (m1);
	    Herbivora m6 = (Herbivora) (m1);
	    Tumbuhan m7 = (Tumbuhan) (m1);
	    if (m2!=0){
	        hidup(m2);
	    } else if (m3!=0){
	        hidup(m3);
	    } else if (m4!=0){
	        hidup(m4);
	    } else if (m5!=0){
	        hidup(m5);
	    } else if (m6!=0){
	        hidup(m6);
	    } else{
	        hidup(m7);
	    }
    }
    public void hidup(Manusia m1) {
		if(lifeState == 1) //cek pause atau tidak
	    {
	        if(m1.get_Kecepatan() != 0)
	        {
	            if (Count%(10-m1.get_Kecepatan()) == 0){
	                if(m1.getPosisi() == Point(29,29))//ujung kanan-bawah
	                {
	                    m1.set_Arah(8);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,29))//kiri-bawah
	                {
	                    m1.set_Arah(2);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(29,0))//kanan-atas
	                {
	                    m1.set_Arah(6);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,0))//kiri-atas
	                {
	                    m1.set_Arah(4);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() >= 29)//kanan
	                {
	                    m1.set_Arah(7);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() == 0)//kiri
	                {
	                    m1.set_Arah(3);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() >= 29)
	                {
	                    m1.set_Arah(1);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() == 0)
	                {
	                    m1.set_Arah(5);

	                    m1.gerak_berarah();
	                }
	                else
	                {
	                    m1.gerak_berarah();
	                }

	                m1.setSedangMemburu(false);
	            }
	        }
	    }
	    else if(lifeState == 0)
	    {

	    }
    }
    public void hidup(Herbivora m1) {
    	if(lifeState == 1) //cek pause atau tidak
	    {
	        if(m1.get_Kecepatan() != 0)
	        {
	            if (Count%(10-m1.get_Kecepatan()) == 0){
	                if(m1.getPosisi() == Point(29,29))//ujung kanan-bawah
	                {
	                    m1.set_Arah(8);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,29))//kiri-bawah
	                {
	                    m1.set_Arah(2);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(29,0))//kanan-atas
	                {
	                    m1.set_Arah(6);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,0))//kiri-atas
	                {
	                    m1.set_Arah(4);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() >= 29)//kanan
	                {
	                    m1.set_Arah(7);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() == 0)//kiri
	                {
	                    m1.set_Arah(3);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() >= 29)
	                {
	                    m1.set_Arah(1);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() == 0)
	                {
	                    m1.set_Arah(5);

	                    m1.gerak_berarah();
	                }
	                else
	                {
	                    m1.gerak_berarah();
	                }
	            }
	        }
	    }
	    else if(lifeState == 0)
	    {

	    }
    }
    public void hidup(Karnivora m1) {
	    	if (Count%(10-m1.get_Kecepatan()) == 0){
	        if(lifeState == 1) //cek pause atau tidak
	        {
	            if(m1.get_Kecepatan() != 0)
	            {
	                if(m1.getPosisi() == Point(29,29))//ujung kanan-bawah
	                {
	                    m1.set_Arah(8);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,29))//kiri-bawah
	                {
	                    m1.set_Arah(2);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(29,0))//kanan-atas
	                {
	                    m1.set_Arah(6);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,0))//kiri-atas
	                {
	                    m1.set_Arah(4);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() >= 29)//kanan
	                {
	                    m1.set_Arah(7);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() == 0)//kiri
	                {
	                    m1.set_Arah(3);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() >= 29)
	                {
	                    m1.set_Arah(1);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() == 0)
	                {
	                    m1.set_Arah(5);

	                    m1.gerak_berarah();
	                }
	                else
	                {
	                    m1.gerak_berarah();
	                }
	            }
	        }
	    }
	    else if(lifeState == 0)
	    {

	    }
    }
    public void hidup(Omnivora m1) {
    	if(lifeState == 1) //cek pause atau tidak
	    {
	        if (Count%(10-m1.get_Kecepatan()) == 0){
	            if(m1.get_Kecepatan() != 0)
	            {
	                if(m1.getPosisi() == Point(29,29))//ujung kanan-bawah
	                {
	                    m1.set_Arah(8);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,29))//kiri-bawah
	                {
	                    m1.set_Arah(2);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(29,0))//kanan-atas
	                {
	                    m1.set_Arah(6);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi() == Point(0,0))//kiri-atas
	                {
	                    m1.set_Arah(4);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() >= 29)//kanan
	                {
	                    m1.set_Arah(7);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getAbsis() == 0)//kiri
	                {
	                    m1.set_Arah(3);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() >= 29)
	                {
	                    m1.set_Arah(1);

	                    m1.gerak_berarah();
	                }
	                else if(m1.getPosisi().getOrdinat() == 0)
	                {
	                    m1.set_Arah(5);

	                    m1.gerak_berarah();
	                }
	                else
	                {
	                    m1.gerak_berarah();
	                }
	            }
	        }
	    }
	    else if(lifeState == 0)
	    {

	    }
    }
    public void hidup(Tumbuhan t1) {

    }

///Administrator///======================================================================================
    public void fillDaftar(MakhlukHidup n)
	{
		daftar.push_back(n);
		count++;
	}

	public void pluck(MakhlukHidup n)
	{
		for(int i=0; i<get_count(); i++)
		{
			if(get_daftar(i) == n)
			{
				daftar.erase(daftar.begin()+i);
				break;
			}
		}
	}

	public void pluck(int i)
	{
		daftar.erase(daftar.begin()+i);
		count--;
	}

	public void sinyal()
	{
	    for(int i1=0; i1 < get_count(); i1++){
	        for(int i2=0; i2 < get_count(); i2++)
	        {
	            if(i1 != i2)
	            {
	                    get_daftar(i1).Reaction(get_daftar(i2));
	            }
	        }
	    }
	}

	public int get_size()
	{
		return size;
	}

	public int get_count()
	{
		return daftar.size();
	}

	public Vector<MakhlukHidup> get_daftar()
	{
		return daftar;
	}

	public MakhlukHidup get_daftar(int i)
	{
		return daftar.at(i);
	}

	//setter
	public void set_size(int s)
	{
		size = s;
	}

	public void set_count(int c)
	{
		count = c;
	}
}