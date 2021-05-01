public class Pomme extends Fruit{
    public Pomme(int p){
        poids=p;
        System.out.println("création d'une pomme de "+ poids+" grammes ");
    }
    public void affiche(){
        System.out.println("C'est une pomme");
    }
    public void affichePoids(){
        System.out.println("le poids de la pomme est:"+poids+" grammes");
    }

    @Override
    public String toString() {
        return "Pomme{" +  "poids=" + poids + '}';
    }
}