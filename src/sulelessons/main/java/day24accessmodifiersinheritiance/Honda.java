package sulelessons.main.java.day24accessmodifiersinheritiance;
public class Honda extends Car{
    public  String renk;
    public Honda(){
        super("White",50000);
    }
    public Honda(String renk){
        this.renk=renk;
    }
}
