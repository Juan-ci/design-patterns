package designPatterns;

public class mainComposite {
    
    public static void main(String[] args) {
        
        Menu menu1 = new Menu();
        
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        
        Menu menu4 = new Menu();
        Menu menu5 = new Menu();
        
        menu1.addMenu(menu2);
        menu1.addMenu(menu3);
        
        menu3.addMenu(menu4);
        menu3.addMenu(menu5);
        
        menu1.open();
        menu1.close();
    }
}
