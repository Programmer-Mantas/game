
public abstract class CEnemies {
    int iHealth;
    int x;
    int y;
    public abstract void spawn(int X,int Y);
    public abstract void move();
    public abstract void addHealt(int iHealth);
    public abstract void minusHealt(int iHealth);
    public abstract void die();
    // public int getiHealth(){
    //     return iHealth;
    // }
    // public int getX(){
    //     return x;
    // }
    // public int getY(){
    //     return y;
    // }
}
class CBossEnemy extends CEnemies{
    CBossEnemy(int Health, int x, int y){
        this.iHealth = Health;
        this.x=x;
        this.y=y;
    }
    public void spawn(int X,int Y){
        System.out.println("I spawn in x and y");
    }
    public void move(){
        System.out.println("I move to random direction 5 places");
    }
    public void summon_regular(){
        int min=1;
        int max=10; 
        int numberOfSummon;
        numberOfSummon = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numberOfSummon);
        //in main it will crearte new regular object;
    }
    public void jump(){
        int min=0;//map size
        int maxX=10;// map size
        int maxY=10;//map size
        int newX;
        int newY;
        newX = (int)Math.floor(Math.random()*(maxX-min+1)+min);
        newY = (int)Math.floor(Math.random()*(maxY-min+1)+min);
        die();
        spawn(newX,newY);
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
    public void die(){
        System.out.println("clear enemy from the map");
    }

}

class CRegularEnemy extends CEnemies{
    CRegularEnemy(int Health, int x, int y){
        this.iHealth = Health;
        this.x=x;
        this.y=y;
    }
    public void spawn(int X,int Y){
        System.out.println("I spawn in x and y");
    }
    public void move(){
        System.out.println("I move to random direction 2 places");
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
    public void die(){
        System.out.println("clear enemy from the map");
    }
}

