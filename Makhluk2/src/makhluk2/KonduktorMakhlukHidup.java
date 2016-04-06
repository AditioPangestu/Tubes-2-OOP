package makhluk2;

interface KonduktorMakhlukHidup {
    public void aging(MakhlukHidup m1);
    public void pause();
    public void resume();
    public void setCount(int c);
    public int getCount();
    public void hidup(MakhlukHidup m1);
    public void hidup(Manusia m1);
    public void hidup(Herbivora m1);
    public void hidup(Karnivora m1);
    public void hidup(Omnivora m1);
    public void hidup(Tumbuhan t1);
}