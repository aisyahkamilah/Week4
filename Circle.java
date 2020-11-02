public class Circle {
	//field of attribute
	private double jejari = 1;

	//overload method toString()
	public String toString() {
		return "Jejari = " + jejari + "\nLuas adalah " + KiraLuas() ;
	}

	//setter hanya ada satu baris saja
	public void setJejari(double jejari) {
		//jejari = r;  //atau
		this.jejari = jejari; //senang faham

		//jejari = jejari; //masuk dalam diri sendiri bukan field so kena tambah this supaya yang set yang keluar
		//System.out.println(jejari);
	} 

	//getter hanya ada satu baris saja
	public double getJejari() {
		return jejari;
		//return this.jejari; //boleh tapi banyak key stroke
	}

	//default constructor
	public Circle() {
		//System.out.println("Default constructor dipanggil");
	}

	//overloading constructor kena ada parameter
	public Circle (double jejari) {
		this.jejari = jejari;
		//System.out.println("Jejari = " + jejari);
	}

	//overloading constructor ni takde limit
	public Circle (double r, String s) {
		jejari = r;
		System.out.println("Jejari = " + jejari + " String = " + s);
	}

	//method
	public double KiraLuas(){
		return jejari * jejari * Math.PI;
	}
}