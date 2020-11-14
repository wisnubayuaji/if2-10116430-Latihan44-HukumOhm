/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        
		System.out.println("=====Hukum Ohm=====");
        System.out.println("kuat arus yang mengalir pada suatu kawat penghantar"
                +"\n"+ "akan berbanding lurus dengan beda potensial "
                +"\n"+ "pada ujung-ujung kawat penghantar tersebu"
                +"\n"+ "asalkan suhu kawat dijaga konstan."
                +"\n");
        
        Baterai obj = new Baterai();
        System.out.println("Kuat Arus : "+obj.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+obj.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+obj.hitungTegangan()+" volt");
    }
}
