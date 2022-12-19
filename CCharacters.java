
public class CCharacters {
    CCharacters(int Health, int x, int y, int shootingRate, int damage,int range, int moneyCount,int bombCount, Boolean cardInTheHand,String name){
        this.iHealth = Health;
        this.x=x;
        this.y=y;
        this.shootingRate=shootingRate;
        this.damage=damage;
        this.range=range;
        this.moneyCount=moneyCount;
        this.bombCount=bombCount;
        this.cardInTheHand=cardInTheHand;
        this.name=name;
    }
    
    int iHealth;
    int x;
    int y;
    int direction;
    int bulletSize;
    int shootingRate;
    int damage;
    int range;
    String name;
    int moneyCount;
    int bombCount;
    boolean cardInTheHand;

    // public int getiHealth(){
    //     return iHealth;
    // }
    // public int getX(){
    //     return x;
    // }
    // public int getY(){
    //     return y;
    // }
    // public int getDirection(){
    //     return direction;
    // }
    // public int getShootingRate(){
    //     return shootingRate;
    // }
    // public int getDamage(){
    //     return damage;
    // }
    // public int getRange(){
    //     return range;
    // }
    // public String getName(){
    //     return name;
    // }
    public void spawn(int X,int Y){
        System.out.println("spawn in x and y location");
    }
    public void move(){
        System.out.println("detect awsd buttons and react -> change characters pictures");
    }
    public void shoot(){
        System.out.println("get direction in which character is looking -> shoot in that direction with delay so it would be vissible");
    }
    public void addHealt(int iHealth){
        this.iHealth+=iHealth;
    }
    public void minusHealt(int iHealth){
        this.iHealth-=iHealth;
        if(iHealth<=0){
            die();
        }
    }
    public void addShootingRate(int shootingRate){
        this.shootingRate+=shootingRate;
    }
    public void minusShootingRate(int shootingRate){
        this.shootingRate-=shootingRate;
    }
    public void addDamage(int damage){
        this.damage+=damage;
    }
    public void minusDamage(int damage){
        this.damage-=damage;
    }
    public void addRange(int range){
        this.range+=range;
    }
    public void minusRange(int range){
        this.range-=range;
    }
    public void die(){
        System.out.println("clear screen -> show leaderboard");
    }

    // public void changeRegularHealth(regular nameOfTheregular){
        
    // }
}