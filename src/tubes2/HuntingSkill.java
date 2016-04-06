package tubes2;

interface HuntingSkill {
	/**
    * Prosedur setter untuk atribut Memburu
    * @param M , parameter pertama yang menyimpan kondisi yang akan diubah
    */
    public void setMemburu(bool M);

    public void setSedangMemburu(bool s);

    public bool getSedangMemburu();
    /**
    * Prosedur setter untuk atribut tabel Target
    * @param i , parameter pertama yang menyimpan nilai indeks tabel
    * @param _target , parameter kedua yang menyimpan DNA target
    */
    public void setTarget(int i, char _target);

    /**
    * Fungsi getter untuk atribut tabel Target
    * @return Mengembalikan atribut tabel Target
    */
    public char[] getTarget();

    /**
    * Fungsi getter untuk atribut Memburu
    * @return Mengembalikan atribut Memburu
    */
    public bool getMemburu();

    /**
    * Fungsi mencari anggota untuk atribut tabel Target
    * @param _target , parameter pertama yang menyimpan DNA yang akan dicari
    * @return Mengembalikan nilai true jika _target berada pada tabel Target
    */
    public bool isTarget(char _target);
}