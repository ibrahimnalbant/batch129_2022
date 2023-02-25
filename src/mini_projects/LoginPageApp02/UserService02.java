package mini_projects.LoginPageApp02;
/*

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5-user objesiyle ilgili islemleri bu class'da gerceklestirecegiz
public class UserService {
    //6-kullanici bilgilerini tutmak icin list olusturalim.
    List<User> userList=new ArrayList<>();  // olusturdugumuz herbir class ayrica "data type"dir.
    // tum metodlarda kullanicidan bilgi almak icin Scanner objesi olustur.
    Scanner inp=new Scanner(System.in);

    //7-userName veya eMail ile kayitli user'i getirme
    private User getUser(String userNameOrEmail){
        for (User user:userList){
            if(user.getUserName().equals(userNameOrEmail)){
                return user;
            } else if (user.getEmail().equals(userNameOrEmail)) {
                return user;
            }
        }
        return null;
    }
    //8-email validation
    private static boolean validateEmail(String eMail){
        boolean isValid;
        boolean isExistSpace=eMail.contains(" ");
        boolean isContainsAt=eMail.contains("@");
        if (isExistSpace){
            System.out.println("Email bosluk iceremez!");
            isValid=false;
        } else if (!isContainsAt) {
            System.out.println("Email @ sembolunu icermelidir!");
            isValid=false;
        }else {//asd@@gmail.com--> [asd, @gmail.com]  birden fazla @ girmeyi kontrol edecez sonra
            String firstPart=eMail.split("@")[0]; // asd@mail.com-->["asd", "mail.com"]
            String secondPart=eMail.split("@")[1];

            boolean valid=firstPart.replaceAll("[a-zA-Z0-9_.-]","").isEmpty();//As-2* -->*
            boolean checkStart=valid && firstPart.length()>0;

            boolean checkEnd=secondPart.equals("gmail.com") ||
                                secondPart.equals("hotmail.com") ||
                                secondPart.equals("yahoo.com");
            if (!checkStart){
                System.out.println("Mailin kullanici adi bolumu en az bir karakter icermelidir ve " +
                        "sadece kucuk-buyuk harf, rakam veya -._ icerebilir. ");
            }
            if (!checkEnd){
                System.out.println("email: gmail.com, hotmail.com veya yahoo.com ile bitmelidir.");
            }
            isValid=checkStart && checkEnd;

        }
        if (!isValid){
            System.out.println("Tekrar deneyiniz.");
        }

        return isValid;
    }
    //9-password validation
    private static boolean validatePassword(String passWord){
        boolean isValid;
        boolean isExistsSpace=passWord.contains(" ");
        boolean isLengthGtSix=passWord.length()>=6;
        boolean isExistsUpperLetter=passWord.replaceAll("[^A-Z]","").length()>0;
        boolean isExistsLowerLettrer=passWord.replaceAll("[^a-z]","").length()>0;
        boolean isExistsDigit=passWord.replaceAll("[\\D]","").length()>0;
        boolean isExistsSymbol=passWord.replaceAll("\\P{Punct}","").length()>0;
        if (isExistsSpace){
            System.out.println("Password bosluk iceremez");
        } else if (!isLengthGtSix) {
            System.out.println("Password en az 6 karakter icermelidir");
        } else if (!isExistsUpperLetter) {
            System.out.println("Password en az 1 tane buyuk harf icermelidir");
        } else if (!isExistsLowerLettrer) {
            System.out.println("Password en az 1 tane kucuk harf icermelidir");
        } else if (!isExistsDigit) {
            System.out.println("Password en az 1 tane rakam icermelidir");
        } else if (!isExistsSymbol) {
            System.out.println("Password en az 1 tane sembol icermelidir");
        }
        isValid=!isExistsSpace && isExistsUpperLetter && isExistsLowerLettrer && isExistsDigit && isExistsDigit && isLengthGtSix;
        if (!isValid){
            System.out.println("Gecersiz Password. Tekrar deneyiniz");
        }

        return isValid;
    }

    public void register(){
        System.out.println("Ad-Soyad: ");
        String name=inp.nextLine();
    //10-username unique/benzersiz olmali
        String username=getUserName();
    //11-email unique, gecerli olmali
        String email=getEmail();
    //12-password : gecerli olmali
        String password=getPassword();
    //13-user objesi olusturalim
        User user=new User(name,username,email,password);
    //14- user'i listeye kaydedelim
        this.userList.add(user);
        System.out.println("Tebrikler, isleminiz basariyla gerceklestirildi.");
        System.out.println("Kullanici adi (veya email) ve sifrenizle sisteme giris yapabilirsiniz.");

    }

    //10-a) kullanicidan username alma
    private String getUserName(){
        String username;
        boolean existsUserName;
        do {
            System.out.println("Kullanici adi giriniz: ");
            username=inp.next();//bu user name daha once kullanilmis mi?
            existsUserName=getUser(username)!=null;
            if (existsUserName){
                System.out.println("Bu username kullanilmistir, farkli bir username deneyiniz");
            }

        }while (existsUserName);
        return username;
    }
    //11-a-kullanicidan email alma
    private String getEmail(){
        String email;
        boolean isValid;
        do {
            System.out.println("Email giriniz");
            email=inp.next();//email gecerli mi: validation
            isValid=validateEmail(email);//gecerli ise unique mi?
            existsEmail=getUser(email)!=null;
            if (existsEmail){
                System.out.println("Bu email zaten kayitli, farkli bir email deneyiniz.");
                isValid=false;
            }

        }while (!isValid);


        return email;
    }
    //12-a- password olusturma
    private String getPassword(){
        String passw;
        boolean isValidPass;
        do {
            System.out.println("Sifrenizi giriniz");
            passw=inp.next();//gecerli mi
            isValidPass=validatePassword(passw);

        }while (!isValidPass);
    }

    //15- email veya username ile giris yapma
    public void login(){
        System.out.println("Lutfen kullanici adi veya email giriniz:");
        String userNameOrEmail=inp.next();

    //16-girilen deger ile user'i bulma
        if (getUser(userNameOrEmail)!=null){
            User user=getUser(userNameOrEmail);
            //17- user bulundu ise sifre kontrolu
            boolean isWrong=true;
            while (isWrong){
                System.out.println("Sifrenizi giriniz:");
                String password=inp.next();
                //girilen sifre buldugumuz userin sifresiyle aynimi? teyit.
                if (user.getPassWord().equals(password)){
                    System.out.println("Sisteme giris yaptiniz");
                    isWrong=false;
                }else {
                    System.out.println("Sifreniz yanlis, tekrar deneyiniz!");
                }
            }

        }else{
            System.out.println("Sistemde kayitli kullanici adi veya email bulunamadi.");
            System.out.println("Uyeyseniz bilgilerinizi kontrol ederek tekrar deneyiniz, " +
                    "uye degilseniz lutfen uye olunuz.");
        }


    }

}//class
*/
