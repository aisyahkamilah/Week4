public class DriverCircle {

	public static void main(String[] args) {

		//object or reference
		Circle bulat = new Circle(); //DEFAULT

		Circle bulat1 = new Circle(5); //instantiate object

        Circle bulat2 = new Circle(10, "AISYAH"); //overloading constructor

        //string is reference
        String s = "AISYAH";
        System.out.println(s);

        System.out.println(bulat); //keluar Circle@816f27d (dalam memory)
        System.out.println(bulat1);
        System.out.println(bulat2);

        //System.out.println("Jejari = " + bulat1.getJejari()); //jejari=5
        //System.out.println("Jejari bulat = " + bulat.getJejari());
        //bulat2.setJejari(35);
        ///System.out.println("Jejari bulat2 = " + bulat2.getJejari());

        //bulat2.setJejari(7);
        //System.out.println("Jejari bulat2 = " + bulat2.getJejari());

        //bulat2.setJejari(81);
        //System.out.println("Jejari bulat2 = " + bulat2.getJejari());



		//System.out.println("Luas ialah " + bulat.KiraLuas());
		//System.out.printf("Luas ialah %2.2f " , bulat.KiraLuas());
		//System.out.format("Luas ialah %2.2f " , bulat.KiraLuas());
	}
}

    //kalau tak declare default, tapi panggil, java akan createkan untuk kita
	//kalau buat overloading constructor,default tak buat, dalam main panggil so compiler akan tanya
	//setiap kali nak buat overloading kena buat default even dalam 0