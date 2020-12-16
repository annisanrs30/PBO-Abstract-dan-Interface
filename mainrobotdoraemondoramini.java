package abstractdaninterface;

interface robot
{
    void setNama(String nama);
    void setTahun(int tahun);
    void displayData();
}

interface Doraemon
{
    void sayDora();
    void displayKantongAjaib();
}
class DoraMini implements robot , Doraemon
{
    String pemilik; 
    String nama;
    int tahun;

    String getPemilik()
    {
        return pemilik;
    }

    void setPemilik(String pemilik)
    {
        System.out.println("Pemilik Dora Mini : " + pemilik);
    }

    @Override
    public void setNama(String nama)
    {
        System.out.println("Nama : " + nama);
    }

    @Override
    public void setTahun(int tahun)
    {
        System.out.println("ahun Pembuatan : " + tahun);
    }

    @Override
    public void displayData()
    {
        setNama("DoraMini");
        setTahun(2020);
        setPemilik("Annisa Rusydina Sabila.\n");
        System.out.println("--DoraMini Berkata--");
        sayDora();
        displayKantongAjaib();
    }

    @Override
    public void sayDora()
    {
        System.out.println("Halo, Saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib()
    {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib\n");
    }

    public static void main(String[] args)
    {
        DoraMini DoraMini = new DoraMini();
        DoraMini.displayData();
    }
}