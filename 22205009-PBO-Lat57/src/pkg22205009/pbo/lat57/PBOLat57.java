package pkg22205009.pbo.lat57;

/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// kelas dasar yang memiliki atribut myBrand dan myModel
class Vehicle {

    protected String myBrand;   //Variabel untuk  brand saya
    protected String myModel;   //Variabel untuk menyimpan model saya
    
    public Vehicle(){
     
    }
    
    // Method Getter untuk mendapatkan brand
    public String getBrand(){
        return myBrand;
    }
    
    // Method Setter untuk mengatur brand
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    
    // Method Getter untuk mendapatkan model
    public String getModel(){
        return myModel;
    }
    
    // Method Setter untuk mengatur model
    public void setModel(String model){
        this.myModel = model;
    }
}

// kelas turunan dari kelas Vehicle, menambahkan atribut myGearCount
class Bicycle extends Vehicle{
    
    private int myGearCount; //Variabel untuk menyimpan jumlah gear
    
    public Bicycle(){
        
    }
    
    // Method Getter untuk mendapatkan jumlah gear
    public int getGearCount(){
        return myGearCount;
    }
    
    // Method Setter untuk mengatur jumlah gear
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}

// kelas turunan dari kelas Vehicle, menambahkan atribut myBoardLength
class Skateboard extends Vehicle{
    
    private double myBoardLength;   //Variabel untuk menyimpan panjang board
    
    public Skateboard(){
        
    }
    
    // Method Getter untuk mendapatkan panjang board
    public double getBoardLength(){
        return myBoardLength;
    }
    
    // Method Setter untuk mengatur panjang board
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}

// kelas utama yang berisi metode main untuk menjalankan programnya
public class PBOLat57{
    
    public static void main(String[] args) {
        //Membuat objek bicycle
        Bicycle b = new Bicycle();
        // Mengatur brand menggunakan metode setBrand dari objek b
        b.setBrand("TrekBike");
        // Mengatur model menggunakan metode setModel dari objek b
        b.setModel("7.4Fx");
        // Mengatur jumlah gear menggunakan metode setGearCount dari objek b
        b.setGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : " + b.getBrand());
        System.out.println("Model : " + b.getModel());
        System.out.println("Jumlah Gear : " + b.getGearCount() + "\n");
        
        //Membuat objek skateboard
        Skateboard sk = new Skateboard();
        // Mengatur brand menggunakan metode setBrand dari objek sk
        sk.setBrand("AllySkate");
        // Mengatur model menggunakan metode setModel dari objek sk
        sk.setModel("Rocket");
        // Mengatur panjang board menggunakan metode setBoardLength dari objek sk
        sk.setBoardLength(54.5);
        
        System.out.println("Skateboard");
        System.out.println("Brand : " + sk.getBrand());
        System.out.println("Model : " + sk.getModel());
        System.out.println("Panjangnya Board : " + sk.getBoardLength());
    }
}