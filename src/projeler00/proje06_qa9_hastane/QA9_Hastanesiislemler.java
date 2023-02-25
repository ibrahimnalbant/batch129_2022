package projeler00.proje06_qa9_hastane;

import java.util.Scanner;

public class QA9_Hastanesiislemler {

    public static void hastaneMenusu() throws InterruptedException {
        Scanner scan=new Scanner(System.in);
        System.out.println("*********BATCH 129 HOSPITAL*******");
        System.out.println("Batch 129 Hastanesi'ne hosgeldiniz.");
        System.out.println("Yapmak istediginiz islemi seciniz: "+
                "\n==> Doktor Menusu icin '1' "+
                "\n==> Hasta Menusu icin '2' "+
                "\n==> Cikis icin '0' a basiniz");
        int tercih= scan.nextInt();
        switch (tercih){
            case 1:
                DoktorIslemleri.doktorMenu();
                break;
            case 2:
                HastaIslemleri.hastaMenusu();
                break;
            case 0:
                cikis();
                break;
        }

    }//method hastaneMenusu

    private static void cikis(){
        System.out.println("Sistemden cikis yapildi");
    }

}//class

