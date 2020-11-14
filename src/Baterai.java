/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(float kuatArus, float hambatan) {
        
    }

    public Baterai() {
    }
    public float getKuatArus() {
        kuatArus = 3;
        return kuatArus;
    }
    public float getHambatan() {
        hambatan = 12;
        return hambatan;
    }
    public float hitungTegangan() {
        float tegangan = kuatArus*hambatan;
        return tegangan;
    }
}
