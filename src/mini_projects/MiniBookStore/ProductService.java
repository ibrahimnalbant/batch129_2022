package mini_projects.MiniBookStore;
//2-tüm productların işlemleri icin standart (kontrat)
public interface ProductService {

    void processMenu();
    void listProduct();
    void addProduct();
    void removeProduct();
    void filterProduct(String filter);

}
