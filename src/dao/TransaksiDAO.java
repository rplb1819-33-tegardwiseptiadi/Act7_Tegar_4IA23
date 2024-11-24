package dao;

import model.Transaksi;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TransaksiDAO {
    private static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    // Create
    public void saveTransaksi(Transaksi transaksi) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(transaksi);
        tx.commit();
        session.close();
    }

    // Read
    public Transaksi getTransaksi(int id) {
        Session session = factory.openSession();
        Transaksi transaksi = (Transaksi) session.get(Transaksi.class, id);
        session.close();
        return transaksi;
    }

   // Update
public void updateTransaksi(int id, String nama_pelanggan, String nama_makanan, int harga_makanan, String nama_minuman, int harga_minuman, int total_harga, int jumlah_bayar, int kembalian) {
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();

    // Mencari transaksi berdasarkan ID
    Transaksi transaksi = (Transaksi) session.get(Transaksi.class, id);
    if (transaksi != null) {
        transaksi.setNama_pelanggan(nama_pelanggan);
        transaksi.setNama_makanan(nama_makanan);
        transaksi.setHarga_makanan(harga_makanan);
        transaksi.setNama_minuman(nama_minuman);
        transaksi.setHarga_minuman(harga_minuman);
        transaksi.setTotal_harga(total_harga);
        transaksi.setJumlah_bayar(jumlah_bayar);
        transaksi.setKembalian(kembalian);

        session.update(transaksi);
        tx.commit();
    } else {
        // Jika transaksi dengan ID tidak ditemukan, berikan pesan error
        System.out.println("Transaksi dengan ID " + id + " tidak ditemukan.");
    }
    session.close();
}
 
   // Delete
public void deleteTransaksi(int id) {
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();
    
    // Mencari transaksi berdasarkan ID
    Transaksi transaksi = (Transaksi) session.get(Transaksi.class, id);
    if (transaksi != null) {
        session.delete(transaksi); // Menghapus transaksi
        tx.commit();
    } else {
        System.out.println("Transaksi dengan ID " + id + " tidak ditemukan.");
    }
    
    session.close();
}

}
