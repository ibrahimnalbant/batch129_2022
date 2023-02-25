package mini_projects.RestaurantBillGenerator;
//3
public class Dish {
    //yiyeceklerin field'larina okunsun ancak degistirilmesin.

    private int code;

    private String name;

    private double price;

    //yiyecek olusturulurken ozellikleri (field'lari) set edilsin
    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //dish objesini yazdirmak icin
    @Override
    public String toString() {
        return  "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
