/**
 * main
 */
public class main {
    public static void main(String[] args) {
        String nameOfThePlayer = "";
        //test
        nameOfThePlayer="Mantas";
        System.out.println("whats your name?");
        //get name of the player for leaderboard;
        CRegularEnemy spider = new CRegularEnemy(5, 3, 3); 
        CCharacters Ronaldo = new CCharacters(10, 5, 5, 4, 13, 10, 0, 0, false, nameOfThePlayer);
        CBomb bomb = new CBomb();
        System.out.println(spider.iHealth);
        System.out.println(Ronaldo.name);
        System.out.println(Ronaldo.damage);
        Ronaldo.addDamage(2);
        System.out.println(Ronaldo.damage);
        System.out.println(spider.iHealth);
        //example of bomb usage
        if(Ronaldo.bombCount>0){ // && and if player press the button 
            bomb.action();
        }
        CSimpleRoom rroom = new CSimpleRoom();
        rroom.showRoom();
        System.out.println("");
        rroom.add2ExitRomm();
        rroom.showRoom();
    }

}
