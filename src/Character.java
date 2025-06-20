public abstract class Character implements Creature{
    String name;
    int hp;
    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    Character(){
        this.name = "";
        this.hp = 0;
    }
    public abstract void attack(Character target);
    public final boolean isAlive(){
        hp = 0;
        return true;
    }
    public void showStatus(){
        System.out.println("[" + name + "] HP: [" + hp + "]");
    }
}
