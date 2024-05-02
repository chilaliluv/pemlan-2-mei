public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, int totalJam, double upahPerJam) {
        super(nama, noKTP);
        this.totalJam = totalJam;
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        return getTotalJam() * getUpahPerJam() * 30;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "\nPegawai Harian   : " + getNama() +
                "\nNo KTP           : " + getNoKTP() + 
                "\nTotal Jam Kerja  : " + (long) getTotalJam() + " Jam" + 
                "\nUpah per Jam     : " + (long) getUpahPerJam() + " Rupiah" +
                "\nPendapatan       : " + (long) gaji() + " Rupiah";
    }
}
