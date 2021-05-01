public class Polymorphisme{
    public static void main(String[] args){
        //Pomme p=new Pomme(72);
     //   Orange o=new Orange(80);

// Sur-casting implicite
        Fruit f1=new Orange(40);
// Sur-casting explicite
        Fruit f2=(Fruit)new Pomme(60);
// Sur-casting implicite
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        // Sur-casting implicite
        f2=new Orange(40);

        System.out.println(f2.toString());

    }


}