package mini_projects.bilet_rezervasyon;

import java.util.Scanner;

/*
Project: mesafeye ve şartlara göre otobüs bileti fiyatı hesaplayan uygulama
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         koltuk no  bilgilerini alın.

         Mesafe başına ücret 1 Lira / km olarak alın.(Gidiş-Dönüş için *2)
         Tekli Koltuk ücreti:Koltuk numarası 3 veya 3 ün katı ise bilet fiyatı %20 daha fazladır(1.2 Lira).
         İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki kuralları uygulayın ;
         Koltuk numaraları 1-32 ye kadar olsun.
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

       1- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
       2-Yaş indirimi:
        Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 13-24 yaşları arasında ise son bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.
  alinan biletler?
  33 numarali koltuk?

 */
public class BiletRezervasyon {
    public static void main(String[] args) {
  //1-bilet rezervasyonu için otobüs objesi oluşturalım.
        Bus bus=new Bus("34 ASD 78");//"1","2"....
  //4-bilet objesi oluşturalım.
        Bilet bilet=new Bilet();
        start(bus,bilet);
    }
    public static void start(Bus bus, Bilet bilet){
        Scanner scan=new Scanner(System.in);
        int select;
        do {
            //6-kullanıcıdan bilgileri alalım.
            System.out.println("Bilet Rezervasyon Sistemine Hosgeldiniz...");
            System.out.println("Lutfen gidilecek mesafe bilgisini KM olarak giriniz:");
            double distance=scan.nextDouble();
            System.out.println("Lutfen yolculuk tipini seçiniz:");
            System.out.println("1.Tek Yön");
            System.out.println("2.Gidis-Dönüs");
            int type=scan.nextInt();
            System.out.println("Lutfen yasınızı giriniz:");
            int age= scan.nextInt();
            System.out.println("Koltuk no seçiniz:");
            System.out.println("(Tekli koltuk ucreti %20 daha fazladır.)");
            System.out.println(bus.seats);
            int seat=scan.nextInt();
            //7-seçilen koltuk noyu listeden kaldıralım.
            bus.seats.remove(String.valueOf(seat));//"3"->"1","2","4"
            //8-kullanıcıdan alınan değerler geçerli mi
            boolean check=type==1 || type==2;
            if(distance>0 && age>0 && check){
                //9-bilet fiyatını hesaplayalım
                bilet.distance=distance;
                bilet.typeNo=type;
                bilet.seatNo=seat;
                //getTotal ile bilet price'i set edelim
                bilet.price=getTotal(bilet, age);
                bilet.printBilet(bus);
            }else{
                System.out.println("Hatalı giris yaptınız!");
            }
            System.out.println("Yeni islem icin herhangi bir sayi girin cikis icin 0 giriniz:");
            select= scan.nextInt();
        }while(select!=0);
        System.out.println("Iyi gunler dileriz.");
    }

    private static double getTotal(Bilet bilet, int age){
        double dist=bilet.distance;
        int type=bilet.typeNo;
        int seat= bilet.seatNo;
        double total=0;
        switch (type){
            case 1:
                if(seat%3==0){
                    total=dist*1.2;
                }else{
                    total=dist*1;
                }
                System.out.println("Tutar :"+total);
                break;
            case 2:
                if(seat%3==0){
                    total=dist*2.4;
                }else{
                    total=dist*2;
                }
                System.out.println("Tutar :"+total);
                total=total*0.8;
                System.out.println("Cift yön indirimli Tutar :"+total);
                break;
        }
        if(age<=12){
            total=total*0.5;
            System.out.println("yas indirimli tutar :"+total);
        }else if (age>12 && age<24){
            total=total*0.9;
            System.out.println("yas indirimli tutar :"+total);
        }else if(age>65){
            total=total*0.7;
            System.out.println("yas indirimli tutar :"+total);
        }
        return total;

    }

}
