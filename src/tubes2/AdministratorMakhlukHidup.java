package tubes2;

import java.util.Vector;

interface AdministratorMakhlukHidup {
	public void fillDaftar(MakhlukHidup n);
	public void pluck(MakhlukHidup n);
	public void pluck(int i);
	public void sinyal();
	public int get_size();
	public int get_count();
	public Vector<MakhlukHidup> get_daftar();
	public MakhlukHidup get_daftar(int i);
	public void set_size(int s);
	public void set_count(int c);
}