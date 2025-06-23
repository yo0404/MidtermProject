abstract class Hero extends Character {
    String weapon;
    Character ch = new Character("", 0) {
        @Override
        public void attack(Character target) {
            System.out.println(name + "は" + weapon + "で攻撃！" + target + "に5のダメージを与えた！");
            hp -= 5;
        }
    };

    Hero(String name, int hp, String weapon) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
    }

    Hero() {
        this.name = "";
        this.hp = 0;
        this.weapon = "";
    }

    public void heal() {
        System.out.println(name + "は回復呪文を唱えた！HPが20回復した！");
        hp += 20;
    }
}