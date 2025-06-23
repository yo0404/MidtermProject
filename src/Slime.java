public final class Slime extends Character {
    Character ch = new Character("", 0) {
        @Override
        public void attack(Character target) {
            System.out.println(name + "は体当たり攻撃！" + target + "に5のダメージを与えた！");
            hp -= 5;
        }
    };
}
