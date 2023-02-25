package projeler00.proje07_hastane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static projeler00.proje06_qa9_hastane.HastaIslemleri.anaMenu;

public class DoktorIslemleri {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> doktorListesiMap = new HashMap<>();

    public static void doktorListesi() {
        doktorListesiMap.put("Allergist", "Nilson, Avery");
        doktorListesiMap.put("Norolog", "John, Abel");
        doktorListesiMap.put("Genel cerrah", "Robert, Erik");
        doktorListesiMap.put("Cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("Dahiliye", "Alan, Pedro");
        doktorListesiMap.put("Kardiolog", "Mahesh, Tristen");
    }

    public static void doktorMenu() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("============DOKTOR MENUSU===========\n" +

                "\n" +
                        "\t  1-Doktor Ekle\t\n" +
                        "\t  2-Doktor Listesi Yazdir\n" +
                        "\t  3-Unvandan Doktor Bulma\n" +
                        "\t  4-Doktor Silme\n" +
                        "\t  5-ANA MENU\n" +
                        "\t  6-CIKIS");

        String secim=scan.nextLine();
        if(secim.length()!=1){
            System.out.println("Lutfen menudeki rakamlardan birini giriniz");
            doktorMenu();
        }
        boolean a= secim.contains("1") || secim.contains("2") || secim.contains("3") || secim.contains("4") || secim.contains("5") || secim.contains("6");
        if (!a){
            System.out.println("Lutfen menudeki rakamlardan birisini giriniz");
            doktorMenu();
        }


        switch (secim) {
            case "1":
                doktorEkleMethodu();
                doktorMenu();
                break;

            case "2":
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case "3":
                unvandanDoktorBulma();
                doktorMenu();
                break;
            case "4":
                doktorSilme();
                doktorMenu();
                break;
            case "5":
                QA9_Hastanesiislemler.hastaneMenusu();
                break;
            case "6":
                doktorMenusuCikis();
                break;

            default:
                System.out.println("Lutfen gecerli tercih yapiniz");

        }
    }

    private static void doktorMenusuCikis() throws InterruptedException {
        System.out.println("==>Ana Menuye donmek icin '1' e\n" +
                "==>Cikis icin '0' a basin");
        int secim = scan.nextInt();
        if (secim == 1) {
            QA9_Hastanesiislemler.hastaneMenusu();
        } else if (secim == 0) {
            System.out.println("Sistemden cikisiniz gerceklesti");

        }

    }

    public static void doktorEkleMethodu() throws InterruptedException {
        System.out.println("=========DOKTOR EKLEME========");
        System.out.println("Doktor ismi giriniz: ");

        String b=scan.nextLine().trim().toLowerCase();
     b=b.replaceAll("[0-9]", "");
        if (b.length()==0){
            System.out.println("Lutfen isim giriniz");
            doktorEkleMethodu();
        }

        String [] girilenDeger = b.split("");
        String ilk="";
        String iki = "";
        for (int i = 0; i < girilenDeger.length; i++) {
            if(i==0){
                ilk=girilenDeger[0];
            }else{
                iki+=girilenDeger[i];
            }
        }
        String doktorAdi=ilk.toUpperCase()+iki;

        System.out.println("Doktor soyismini giriniz: ");

        String a=scan.nextLine().trim().toLowerCase();
        a=a.replaceAll("[0-9]", "");
        if (a.length()==0){
            System.out.println("Lutfen isim giriniz");
            doktorEkleMethodu();
        }

        String [] girilenDeger1 = a.split("");
        String ilk1="";
        String iki1 = "";
        for (int i = 0; i < girilenDeger1.length; i++) {
            if(i==0){
                ilk1=girilenDeger1[0];
            }else{
                iki1+=girilenDeger1[i];
            }
        }
        String doktorSoyIsim=ilk1.toUpperCase()+iki1;

        System.out.println("Doktor unvanini giriniz: ");

        String c=scan.nextLine().trim().toLowerCase();
        c=c.replaceAll("[0-9]", "");
        if (c.length()==0){
            System.out.println("Lutfen isim giriniz");
            doktorEkleMethodu();
        }

        String [] girilenDeger2 = c.split("");
        String ilk2="";
        String iki2 = "";
        for (int i = 0; i < girilenDeger2.length; i++) {
            if(i==0){
                ilk2=girilenDeger2[0];
            }else{
                iki2+=girilenDeger2[i];
            }
        }
        String doktorUnvan=ilk2.toUpperCase()+iki2;

        String doktorTamAd = doktorAdi + " , " + doktorSoyIsim;
        doktorListesiMap.put(doktorUnvan, doktorTamAd);
        System.out.println("\n\n");

        Integer menuSec=0;
        boolean d=false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========DOKTOR EKLE MENUSUNDESİNİZ=========\n"+
                    "\t1-Doktor Menusu\n" +
                    "\t2-Ana Menu \t\n" +
                    "\t3-Doktor Ekleme");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            }catch (NumberFormatException e){
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (!d);
        if (menuSec==1){
            doktorMenu();
        }
        if(menuSec==2){
            anaMenu();
        }else {
            doktorEkleMethodu();
        }
    }

    public static void doktorListesiYazdirma() throws InterruptedException {
        System.out.println("========DOKTOR LISTELEME=========");
        System.out.println(" Unvan          Isim     Soyisim \n" +
                "---------------------------------------------------");
        Set<Map.Entry<String, String>> doktorListSet = doktorListesiMap.entrySet();
        for (Map.Entry<String, String> each : doktorListSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+", "+eachValue);
            String valueArr[] = eachValue.split(", ");
            System.out.printf("%-15s %-7s %-3s \n", eachKey, valueArr[0], valueArr[1]);

        }
        System.out.println("\n");

        Integer menuSec=0;
        boolean d=false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========DOKTOR LISTESI YAZDIRMA MENUSUNDESİNİZ=========\n"+
                    "\t1-Doktor Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Doktor Listesi Yazdirma");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            }catch (NumberFormatException e){
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (!d);
        if (menuSec==1){
            doktorMenu();
        }
        if(menuSec==2){
            anaMenu();
        }else {
            doktorListesiYazdirma();
        }
    }

    public static void unvandanDoktorBulma() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("======== UNVANDAN DOKTOR BULMA=========");
        System.out.println("========Aradiginiz doktorun unvanini giriniz=========");
        Set<Map.Entry<String, String>> doktorEntrySet = doktorListesiMap.entrySet();
        for (Map.Entry<String, String> each : doktorEntrySet) {
            String eachKey = each.getKey();
            System.out.println(eachKey);
        }

        String [] girilenDeger = scan.nextLine().trim().toLowerCase().split("");
        String ilk="";
        String iki = "";
        for (int i = 0; i < girilenDeger.length; i++) {
            if(i==0){
                ilk=girilenDeger[0];
            }else{
                iki+=girilenDeger[i];
            }
        }
        String arananUnvan=ilk.toUpperCase()+iki;
        System.out.println(" ======== DOKTOR LISTESI========= ");
        System.out.println("Unvan ismi soyadi\n" +
                "-------------------------------------");
        boolean flag = false;
        for (Map.Entry<String, String> w : doktorEntrySet) {
            String eachKey = w.getKey();
            //    System.out.println("====>>" + eachKey);
            String eachValue = w.getValue().toLowerCase();
            String[] valueArr = eachValue.split(", ");
            if (eachKey.contains(arananUnvan)) {
                System.out.printf("%1s %-8s %-8s\n", eachKey, valueArr[0], valueArr[1]);
                System.out.println("\n\n");
                flag=true;
                break;
            }

        }
        if(flag==false){

            System.out.println("Gecerli unvan giriniz");
            unvandanDoktorBulma();
        }

        Integer menuSec=0;
        boolean d=false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========UNVANDAN DOKTOR BULMA MENUSUNDESİNİZ=========\n"+
                    "\t1-Doktor Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Unvandan Doktor Bulma");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            }catch (NumberFormatException e){
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (!d);
        if (menuSec==1){
            doktorMenu();
        }
        if(menuSec==2){
            anaMenu();
        }else {
            unvandanDoktorBulma();
        }
    }

    public static void doktorSilme() throws InterruptedException {
        System.out.println("========Silmek istediginiz doktorun unvanin giriniz=========");
        System.out.println("======== DOKTOR UNVANLARI=========");
        Set<Map.Entry<String, String>> doktorEntrySet = doktorListesiMap.entrySet();
        for (Map.Entry<String, String> each : doktorEntrySet) {
            String eachKey = each.getKey();
            System.out.println(eachKey);
        }
        String [] girilenDeger3 = scan.nextLine().trim().toLowerCase().split("");
        String ilk3="";
        String iki3 = "";
        for (int i = 0; i < girilenDeger3.length; i++) {
            if(i==0){
                ilk3=girilenDeger3[0];
            }else{
                iki3+=girilenDeger3[i];
            }
        }
        String arananUnvan=ilk3.toUpperCase()+iki3;

        boolean flag = false;
        if (doktorListesiMap.containsKey(arananUnvan)) {
            doktorListesiMap.remove(arananUnvan);
            System.out.println("Istenen doktor silindi");
            System.out.println("========Guncel doktor listesi=======");
            System.out.println("\n");
            doktorListesiYazdirma();
            flag = true;

        }else {
            System.out.println("Gecerli unvan giriniz");
            System.out.println("Allergist//Norolog//Genel cerrah//Cocuk doktoru//Dahiliye//Kardiolog");
            doktorSilme();
        }

        Integer menuSec=0;
        boolean d=false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========DOKTOR SILME MENUSUNDESİNİZ=========\n"+
                    "\t1-Doktor Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Doktor Silme");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            }catch (NumberFormatException e){
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (!d);
        if (menuSec==1){
            doktorMenu();
        }
        if(menuSec==2){
            anaMenu();
        }else {
            doktorSilme();
        }
    }

}//class