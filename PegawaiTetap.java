public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        // TODO Auto-generated method stub
        return getUpah();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "\nPegawai Tetap    : " + getNama() +
                "\nNo KTP           : " + getNoKTP() + 
                "\nUpah             : " + (long) getUpah() + " Rupiah" + 
                "\nPendapatan       : " + (long) gaji() + " Rupiah" ;
    }
}
