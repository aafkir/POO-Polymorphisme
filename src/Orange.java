public class Orange extends Fruit{
    public Orange(int p){
        poids=p;
        System.out.println("création d'une Orange de "+ poids+" grammes ");
    }
    public void affiche(){
        System.out.println("C'est une Orange");
    }
    public void affichePoids(){
        System.out.println("le poids de la Orange est:"+poids+" grammes");
    }

    @Override
    public String toString() {
        return "Orange{" +  "poids=" + poids + '}';
    }
}