package komputer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public interface AppInterface {
    final int VIEW_ALL_COMPUTERS = 0;
    final int ADD_DATA_COMPUTER = 1;
    final int SEARCH_BY_MODEL = 3; 
    final int SEARCH_BY_BRAND = 2; 
    final int EXIT = 4;
    

    public int menuOption();
    public void add();
    public String keyword(String type);
    public Komputer searchByBrand (String brand);
    public Komputer searchByModel (String model);
    public void viewData (Komputer computer);
    public void exit();
}