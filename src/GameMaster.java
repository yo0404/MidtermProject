public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero();
        Slime s = new Slime();

        System.out.println("冒険が始まる...！");
        Hero.showStatus();
        Slime.showStatus();
        System.out.println("戦闘開始！");

    }
}
