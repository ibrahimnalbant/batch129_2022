package mini_projects.LoginPageApp02;

public class User {
    //3-name, username, email, password bilgileri olacak
    private String name;
    private String userName;
    private String eMail;
    private String passWord;
    //4- user objesi olusturulurken ozellikler set edilsin.
    public User(String name, String userName, String eMail, String passWord){
        this.name=name;
        this.userName=userName;
        this.eMail=eMail;
        this.passWord=passWord;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return eMail;
    }

    public String getPassWord() {
        return passWord;
    }
}//class
