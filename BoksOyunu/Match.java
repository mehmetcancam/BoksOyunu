package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;

    }

    void run(){
       if(isCheck()){
           while (this.f1.health>0 && this.f2.health>0){
               System.out.println("=========Yeni Round=========");
               if (f1.isHitChance()){
                   f2.health=f1.hit(f2);
               }
               if (f2.isHitChance()){
                   f1.health=f2.hit(f1);
               }

               if (this.f2.health<=0 && this.f1.health<=0){
                   this.f1.health=0;
                   this.f2.health=0;
                   System.out.println("BERABERE");
                   System.out.println(this.f1.name+" CAN: "+this.f1.health+"\n"+this.f2.name+" CAN: "+this.f2.health);
                   break;
               }
               if (this.f1.health<=0){
                   this.f1.health=0;
                   System.out.println(this.f2.name+" KAZANDI");
               }if (this.f2.health<=0){
                   this.f2.health=0;
                   System.out.println(this.f1.name+" KAZANDI");

               }System.out.println(f2.name+" Kalan can: "+f2.health);
               System.out.println(f1.name+" Kalan can: "+f1.health);
           }
       }else {
           System.out.println("Sporcularin sikletleri uymuyor.");
       }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight<=maxWeight);
    }

}
