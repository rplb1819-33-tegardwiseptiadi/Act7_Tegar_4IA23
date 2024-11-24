package model;

import javax.persistence.*;

@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nama_pelanggan;
    private String nama_makanan;
    private int harga_makanan;
    private String nama_minuman;
    private int harga_minuman;
    private int total_harga;
    private int jumlah_bayar;
    private int kembalian;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama_pelanggan() { return nama_pelanggan; }
    public void setNama_pelanggan(String nama_pelanggan) { this.nama_pelanggan = nama_pelanggan; }

    public String getNama_makanan() { return nama_makanan; }
    public void setNama_makanan(String nama_makanan) { this.nama_makanan = nama_makanan; }

    public int getHarga_makanan() { return harga_makanan; }
    public void setHarga_makanan(int harga_makanan) { this.harga_makanan = harga_makanan; }

    public String getNama_minuman() { return nama_minuman; }
    public void setNama_minuman(String nama_minuman) { this.nama_minuman = nama_minuman; }

    public int getHarga_minuman() { return harga_minuman; }
    public void setHarga_minuman(int harga_minuman) { this.harga_minuman = harga_minuman; }

    public int getTotal_harga() { return total_harga; }
    public void setTotal_harga(int total_harga) { this.total_harga = total_harga; }

    public int getJumlah_bayar() { return jumlah_bayar; }
    public void setJumlah_bayar(int jumlah_bayar) { this.jumlah_bayar = jumlah_bayar; }

    public int getKembalian() { return kembalian; }
    public void setKembalian(int kembalian) { this.kembalian = kembalian; }
}
