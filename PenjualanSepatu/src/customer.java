public class customer extends loginuser{
    public String Nama;
    public String Alamat;
    public String email;

    @Override
    public void cek() {
        super.cek();
    }

    public void pilihSepatu() {
        switch (kodesepatu) {
            case 1:
                namasepatu = "Adidas";
                ukuran = 41;
                harga = 630000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 2:
                namasepatu = "Nike";
                ukuran = 40;
                harga = 640000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 3:
                namasepatu = "Converse";
                ukuran = 39;
                harga = 549000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 4:
                namasepatu = "Vans";
                ukuran = 42;
                harga = 560000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
        }
    }

    public void Transaksi(){

    }
}
