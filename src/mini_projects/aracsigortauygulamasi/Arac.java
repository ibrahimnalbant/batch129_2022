package mini_projects.aracsigortauygulamasi;

import java.util.Scanner;

public class Arac {

    // arac tipi, prim

    public String type; //field veya feature(ozellik)
    public int prim;

    public void countPrim(int term){
        switch (this.type){
            case"otomobil":
                this.prim=term==1 ? 2000 : 2500;
                break;
            case"kamyon":
                this.prim=term==1 ? 3000 : 5500;
                break;
            case"motosiklet":
                this.prim=term==1 ? 1500 : 1750;
                break;
            case"otobus":
                countPrimBus(term);
                break;
            default:
                System.out.println("Hatali giris!!!");
                this.prim=0;
                break;
        }
    }

    private void countPrimBus(int term){
        Scanner inp=new Scanner(System.in);
        System.out.println("Otobus tipini giriniz:");
        System.out.println("1_18-30 koltuk");
        System.out.println("2_31 koltuk veya ustu");
        int busType= inp.nextInt();
        switch (busType){
            case 1:
                this.prim=term==1 ? 4000 : 4500;
                break;
            case 2:
                this.prim=term==1 ? 5000 : 5500;
                break;
            default:
                break;
        }
    }

}//class
