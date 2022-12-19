
public abstract class CItem {
    public abstract void action();
    public abstract void pickUp();
    public abstract void addItem();
}

class CPotion extends CItem { //activates instantly after pickup
    public void action(){
        int min = 1;
        int max = 6;
        int potionNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        switch(potionNumber){
            case 1:
                healthUp();
                break;
            case 2:
                healthDown();
                break;
            case 3:
                damageUp();
                break;
            case 4:
                damageDown();
                break;
            case 5:
                getACard();
                break;
            case 6:
                rangeUp();
                break;  
            default:
                System.out.println("Error in random potion effect switch");
        }

    }
    public void healthUp(){
        System.out.println("potion - health up");
    }
    public void healthDown(){
        System.out.println("potion - health down");
    }
    public void damageUp(){
        System.out.println("potion - damage up");
    }
    public void damageDown(){
        System.out.println("potion - damage down");
    }
    public void getACard(){
        System.out.println("drop card");
    }
    public void rangeUp(){
        System.out.println("potion - range up");
    }

    public void pickUp(){
        System.out.println("clear potion from the screen");
        action();
    }
    public void addItem(){
        //get random x and y possible for item to be on the map and 
    }
    
}

class CCards extends CItem{ //activates after player intervention
    public void action(){
        int min = 1;
        int max = 6;
        int potionNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        switch(potionNumber){
            case 1:
                rangeUp();
                break;
            case 2:
                healthDown();
                break;
            case 3:
                damageUp();
                break;
            case 4:
                shootingRateDown();
                break;
            case 5:
                teleportToTheSecretRoom();
                break;
            case 6:
                teleportToTheStart();
                break;  
            default:
                System.out.println("Error in random cards effect switch");
        }

    }
    public void rangeUp(){
        System.out.println("potion - range up");
    }
    public void healthDown(){
        System.out.println("potion - health down");
    }
    public void damageUp(){
        System.out.println("potion - damage up");
    }
    public void shootingRateDown(){
        System.out.println("potion - shooting rate down");
    }
    public void teleportToTheSecretRoom(){
        System.out.println("potion - teleport to the secret room");
    }
    public void teleportToTheStart(){
        System.out.println("potion - teleport to the start");
    }

    public void pickUp(){
        System.out.println("clear card from the screen if player is not holding any card");
    }
    public void addItem(){
        //get random x and y possible for item to be on the map and 
    }
}

class CMoney extends CItem{ // 99 money limit
    public void action(){
        //action in the shop
    }
    public void pickUp(){
        System.out.println("clear card from the screen if player have less then 100 moneys");
        System.out.println("add it to the players money count");
    }
    public void addItem(){
        //get random x and y possible for item to be on the map and 
    }
}
class CBomb extends CItem{ //99 bomb limit
    public void action(){
        System.out.println("Heath down to all nearby enemies");
    }
    public void pickUp(){
        System.out.println("clear card from the screen if player have less then 100 bombs");
        System.out.println("add it to the players money count");
    }
    public void addItem(){
        //get random x and y possible for item to be on the map and 
    }
}