public interface CRoom { 
    public void addRoom();
    public void addItemps();
    public void showRoom();
}

class CSimpleRoom implements CRoom{ //all rooms can be transformed in to a line or could be a maze of random layout
    public CSimpleRoom() {}
    CPotion potion;
    CCards cards;
    CBomb bomb;
    CMoney money;
    //check how many possible exits out of the room could be (example first floor have 5 rooms, so if first respawn romm have 4 
    // exists (shop and 3 random) if player enters a room not a shop then check how many possible exits there could be 5-4=1 so 
    //random number between extra 1 or 0 exits in a room

    int room7x7[] = { //different number means different object 
        9,9,9,8,9,9,9,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        8,1,1,1,1,1,8,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        9,9,9,8,9,9,9
    };
    //int copyRoom7x7[] = room7x7.clone();

    public void addRoom(){
        int min = 0;
        int max = 4;
        int roomAmountNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        switch(roomAmountNumber){
            case 1:
                add1ExitRomm();
                break;
            case 2:
                add2ExitRomm();
                break;
            case 3:
                add3ExitRomm();
                break;
            case 4:
                add4ExitRomm();
                break; 
            default:
                System.out.println("Error in random regular room creating switch");
        }
        addItemps();
    }
    
    public void add1ExitRomm(){
        //[3] || [21] || [27] || [45] is doors to other room
    }
    public void add2ExitRomm(){
        //([3] && [21]) || ([3] && [27]) || ([3] && [45]) || ([21] && [27]) || ([21] && [45])... is doors to other room
        //random of:
        //1 - [3]
        //2 - [21]
        //3 - [27]
        //4 - [45]
        //random again without previews picked
        int min = 1;
        int max = 4;
        int nextRoomEntrance = (int)Math.floor(Math.random()*(max-min+1)+min);
        room7x7[3]=9; // for example 9 represence the wall
        room7x7[21]=9;
        room7x7[27]=9;
        room7x7[45]=9;
        switch (nextRoomEntrance) {
            case 1:
                room7x7[3]=8;
                break;
            case 2:
                room7x7[21]=8;
                break;
            case 3:
                room7x7[27]=8;
                break;
            case 4:
                room7x7[45]=8;
                break;
            default:
                System.out.println("Error in random number choice 2 switch");
        }
        boolean temp = false;
        while(temp == false){ // random until we gonna found second possible exit from the room
            nextRoomEntrance = (int)Math.floor(Math.random()*(max-min+1)+min);
            switch (nextRoomEntrance) {
                case 1:
                    if(room7x7[3]==8){
                        break;
                    }
                    else{
                        room7x7[3]=8;
                        temp = true;
                        break;
                    }
                case 2:
                    if(room7x7[21]==8){
                        break;
                    }
                    else{
                        room7x7[21]=8;
                        temp = true;
                        break;
                    }
                case 3:
                    if(room7x7[27]==8){
                        break;
                    }
                    else{
                        room7x7[27]=8;
                        temp = true;
                        break;
                    }
                case 4:
                    if(room7x7[45]==8){
                        break;
                    }
                    else{
                        room7x7[45]=8;
                        temp = true;
                        break;
                    }
                default:
                    System.out.println("Error in random number choice 2 switch");
            }
         }
    }
    public void add3ExitRomm(){
        
    }
    public void add4ExitRomm(){
        
    }
    public void addItemps(){
        int min = 0;
        int max = 100;
        int MoneyAmountNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        if(MoneyAmountNumber<50 && MoneyAmountNumber>20){
            System.out.println("add money to possible space");
        }
    }
    public void showRoom(){
        for(int i=0; i<7*7; i++){
            if((i+1)%7==0){
                System.out.println(room7x7[i]);
            }
            else{
                System.out.print(room7x7[i]);
            }
        }
    }
}

class CSpecialRoom implements CRoom{
    CPotion potion;
    CCards cards;
    CBomb bomb;
    CMoney money;
    int room7x7[] = { //different number means different object 
        9,9,9,8,9,9,9,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        8,1,1,10,1,1,8,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        9,9,9,8,9,9,9
    };

    public void addRoom(){

    }
    public void addItemps(){
        int min = 1;
        int max = 4;
        int randomItemNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        switch (randomItemNumber) {
            case 1:
                addCard();
                break;
            case 2:
                addBomb();
                break;   
            case 3:
                addMoney();
                break;
            case 4:
                addPotion();
                break;
            default:
            System.out.println("Error in random cards effect switch");
        }
        
    }
    public void addCard(){
        //add 3 cards in emplty room
    } 
    public void addBomb(){
        //add 3 bombs in emplty room
    } 
    public void addMoney(){
        //add 3 moneys in emplty room
    } 
    public void addPotion(){
        //add 3 potions in emplty room
    }
    public void showRoom(){
        for(int i=0; i<7*7; i++){
            if((i+1)%7==0){
                System.out.println(room7x7[i]);
            }
            else{
                System.out.print(room7x7[i]);
            }
        }
    }
}

class CShopRoom implements CRoom{
    CPotion potion;
    CCards cards;
    CBomb bomb;
    CMoney money;
    int room7x7[] = { //different number means different object 
        9,9,9,8,9,9,9,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        8,1,1,10,1,1,8,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        9,9,9,8,9,9,9
    };
    public void addRoom(){
        //always adds shop in the west direction of the first room
    }
    public void addItemps(){
        //add 3 items with price tags 
    }
    public void showRoom(){
        for(int i=0; i<7*7; i++){
            if((i+1)%7==0){
                System.out.println(room7x7[i]);
            }
            else{
                System.out.print(room7x7[i]);
            }
        }
    }

}

class CBoosRoom implements CRoom{
    CPotion potion;
    CCards cards;
    CBomb bomb;
    CMoney money;
    int room7x7[] = { //different number means different object 
        9,9,9,8,9,9,9,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        8,1,1,10,1,1,8,
        9,1,1,1,1,1,9,
        9,1,1,1,1,1,9,
        9,9,9,8,9,9,9
    };
    public void addRoom(){
        //always adds boss room most far away room from the first room
    }
    public void addItemps(){
        //add extra money after defeating the boss
    }
    public void showRoom(){
        for(int i=0; i<7*7; i++){
            if((i+1)%7==0){
                System.out.println(room7x7[i]);
            }
            else{
                System.out.print(room7x7[i]);
            }
        }
    }
}

