package mentoringsorular;

import java.util.Arrays;

public class Array_List_SorularCevaplar {

//    Soru 1:Verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun
          // int arr[]={3,5,6,1,9,45,25,4,9,0};

//    Cevap-->
    public static void main(String[] args) {
       int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);
    }//main

       public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr); // buyukten kucuge siraladi
        int tersArr[]=new int[arr.length]; //[0,0,0,0,0,0,0,0,0,0] 10 length uzunlugunda Array olusturdu
          // System.out.println(tersArr.length);
        for (int i = 0; i < arr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i]; // terstenlik sagladik
        }//method body
        System.out.println(Arrays.toString(tersArr));
    }
/*
    Soru 2:Verilen array da istenen bir elelmentin var olup olamdıgını
           true false olarak yazdirarak gosteren bir method olusturun

    Cevap-->public static void main(String[] args) {
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=14;
        istenenElemanVarMi(arr,istenenSayi);
        }
    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);
    }

    Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
           int arr[][]={{3,1,7},{6,10,2}};
   Cevap--> public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println(toplam);
    }
    Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
           arrayi olusturup elementlei kullanicidan alip array atayin

    Cevap-->   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin "+(i+1)+".elemani giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    Soru 5:Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
    Cevap-->  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi: "+arr.length);
    }
    Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
           ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }

    Cevap--> public static void main(String[] args) {

        int arr[][]={ {1,2,3}, {4,5}, {6} };
        int carpim=1;
        for (int i = 0; i < arr.length ; i++) {
            carpim*=arr[i][arr[i].length-1];
        }
        System.out.println("son elementlerin carpimi: "+carpim);
    }
    Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
           int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3

    Cevap--> public static void main(String[] args) {
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementiSil(arr,istenmeyenEleman);
    }
    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
         //1-istenmeyen element sayisini bulalim
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
        }
        //yeni arrayi olusturalim
        int arrYeni[]=new int[arr.length-sayac];
        //eski arrayden uygun elementleri yeniye tasiyalim
         int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }
        }
        //yeni arrayi yazdiralim
        System.out.println(Arrays.toString(arrYeni));
    }
    Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir mehod olusturun
           orn: [1,3,5,3,5,6,1,7]
           output [1,3,5,6,7]
    Cevap--> public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        tekrarsizListeOlustur(sayilar);
    }
    public static void tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizList);
    }
    Soru 9:Verilen bir listede istenen iki indexdeki elementlerin yerini kalici olarak degistiren bir method olusturun
    Cevap--> public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;
        sayilar=swapElement(sayilar,ilkIndex,ikinciIndex);
        System.out.println("swap'dan once list : " + sayilar); // bu satir gereksiz, gormeniz icin yazdim
        sayilar= swapElement(sayilar,ilkIndex,ikinciIndex);
        System.out.println("swap'dan sonra list : " + sayilar); // bu satir gereksiz, gormeniz icin yazdim
    }
    public static List<Integer> swapElement(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //bir temp sayi olusturup
        // verilen indexlerdeki sayilari degistirin
        //indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin
        int temp = 0;
        if ((ilkIndex > sayilar.size() - 1) || (ikinciIndex > sayilar.size() - 1)
                || ilkIndex < 0 || ikinciIndex < 0) {
            System.out.println("Lutfen Gecerli bir index giriniz");
        } else {
            temp = sayilar.get(ilkIndex);
            sayilar.set(ilkIndex, sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex, temp);
        }
            return sayilar;

    }
    Soru10: String 2D array olustur
           {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
            String de $ varsa 3.2 ile carp
           String de € varsa 4.2 ile carp
           elemanlarin toplamini double olarak yazdir

    Cevap--> public static void main(String[] args) {
            String[][] arr ={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
            double toplam=0;
            for (int i = 0; i <3 ; i++) {//outer array
            for (int j = 0; j <3 ; j++) {//inner array
            if (arr[i][j].contains("$")){
                toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
            }else if (arr[i][j].contains("€")){
                toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
            }
        }
    }
        System.out.println("Toplam = "+ toplam);
        }
    Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
           ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
           input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
    Cevap-->public static void main(String[] args) {
           int arr1[][]= {{10,20,30},{4},{6,7,20}};
        int arr2[]=new int[arr1.length];
        int toplam=0;
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                toplam+=arr1[i][j];
            }
            arr2[i]+=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(arr2));
    }
    Soru12:Bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
           input : 1,2,-3,4,-5,-6
           output :-1,-2,3,-4,5,6
    Cevap-->public static void main(String[] args) {
          int arr[]={1,2,-3,4,-5,-6};
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=(-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    Soru13:Verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
           yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
           int istenenToplam=9;

    Cevap--> public static void main(String[] args) {
           int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
       tpMethod(arr,istenenToplam);

    }

    private static void tpMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i <arr.length ; i++) {//arrayi kontrol ediyoruz
            for (int j = i; j <arr.length; j++) {//2.ci sayiyi aliyoruz
                if (arr[i]+arr[j]==9){
                    System.out.println(arr[i]+ " ve "+ arr[j]+ " " +
                            "toplami : "+ istenenToplam);
                }
            }
        }
    }
    Soru14:Write a java program that calculates the average value of array elements Print elements that are greater than avarage
          (dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
           input[]= {1,2,3,4,5,6,7}
           Output : 4

    Cevap-->  public static void main(String[] args) {
          int arr[]= {1,2,3,4,5,6,7};
          int toplam=0;
          double ortalama;
          for (int i = 0; i <arr.length ; i++) {
          toplam+=arr[i];
         }
         ortalama=toplam/arr.length;
         List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
        if (arr[i]>ortalama){
            sayilar.add(arr[i]);
          }
         }
           System.out.println(sayilar);
        }

    Soru15: $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
           String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

    Cevap-->public static void main(String[] args) {
    String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));

        int toplam$=0;
        int toplam£=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].contains("$")){
                toplam$+=Integer.parseInt(arr[i].replace("$",""));
            }else {
                toplam£+=Integer.parseInt(arr[i].replace("£",""));
            }
        }
        System.out.println("toplam dolar tutari:"+toplam$+"$");
        System.out.println("toplam Sterlin tutari:"+toplam£+"£");

    }

    Soru16:given an int array and find the squares of the elements (Verilen bir int dizisi icin elemanlarin karelerini bulun )
           Example:{2,6,4,5,8,9}
           output:{4,36,16,25,64,81}
    Cevap-->public static void main(String[] args) {
            int arr[]={2,6,4,5,8,9};

        int yeniArr[]=new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            yeniArr[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(yeniArr));
    }

    Soru17:Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
           INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
           OUTPUT : [Veli,Omer]

    Cevap-->public static void main(String[] args) {
    ArrayList<String> isimler=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
         ArrayList<String> aOlmayanIsimler= new ArrayList<String>();

        for (String w:isimler) {
            if (!w.toLowerCase().contains("a")){
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println(aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);
  */
}
