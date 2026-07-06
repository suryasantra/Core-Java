import java.util.ArrayList;

class CollectionLastTopic{
    public static void main(String[] args) {
        // ArrayList a= new ArrayList();
        // a.add(10);
        // a.add(true);
        // a.add(8.6);
        // a.add(1,9);
        // System.out.println(a);


        ArrayList <String> bengali=new ArrayList();
        bengali.add("Shukto");
        bengali.add("Alu posto");
        bengali.add("Biriyani");
        bengali.add("Sobji Dal");
        System.out.println(bengali);


        ArrayList <String> bihari=new ArrayList();
        bihari.add("Litti Chokha");
        bihari.add("Thekua");
        bihari.add("Dahi Chura");
        System.out.println(bihari);

        ArrayList <String>  menu = new ArrayList();
        menu.addAll(bihari);
        menu.addAll(1,bengali);
        System.out.println(menu);
    }
}