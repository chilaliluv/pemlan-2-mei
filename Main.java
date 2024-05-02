public class Main {
    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("Doni", "831276767254", 12000000);
        PegawaiTetap pt2 = new PegawaiTetap("Sari", "918475836501", 14000000);
        PegawaiTetap pt3 = new PegawaiTetap("Mirna", "765927567381", 10000000);
        PegawaiHarian ph1 = new PegawaiHarian("Sista", "127412092096", 6, 150000);
        PegawaiHarian ph2 = new PegawaiHarian("Supri", "746273816490", 10, 100000);
        PegawaiHarian ph3 = new PegawaiHarian("Miguel", "627384019265", 8, 120000);
        Sales s1 = new Sales("Samirun", "827162884637", 200,50000);
        Sales s2 = new Sales("Ohara", "291724823816", 150,75000);
        Sales s3 = new Sales("Sam Dani Munfirkham", "018475927586", 300,30000);

        System.out.println(pt1);
        System.out.println(ph1);
        System.out.println(pt2);
        System.out.println(ph2);
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(pt3);
        System.out.println(s3);
        System.out.println(ph3);
    }
}
