public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations cebu = new Cebu();
        Locations manila = new Manila();
        Locations iloilo = new Iloilo();
        Locations palawan = new Palawan();
        Locations siargao = new Siargao();
        
        Tourist lark = new Me();

        boracay.accept(lark);
        cebu.accept(lark);
        manila.accept(lark);
        iloilo.accept(lark);
        palawan.accept(lark);
        siargao.accept(lark);
    }
}