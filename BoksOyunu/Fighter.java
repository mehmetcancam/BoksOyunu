package BoksOyunu;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => "+ foe.name+ " "+this.damage+" Hasar Vurdu");
        if(foe.isDodge()){
            System.out.println(foe.name + "Gelen hasari blokladi!");
            return foe.health;
        }
        return foe.health-this.damage;

    }

    boolean isDodge(){
        double random = Math.random() * 100;
        return random <= this.dodge;

    }

}
