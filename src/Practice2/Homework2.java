package Practice2;

public class Homework2 {
    static void main() {
        String playerName = "USEC";
        String playerClass = "Штурмовик";
        String enemyName = "BEAR";

        int strength = (int) (Math.random() * 11) + 8;
        int agility = (int) (Math.random() * 11) + 8;
        int intelligence = (int) (Math.random() * 11) + 8;

        int hp = strength * 10 + agility * 2;
        int mp = intelligence * 15;
        int armor = agility / 2;

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        int playerAttack = dice1 + dice2 + strength;
        final int MONSTER_ATTACK = 22;

        boolean isPlayerVictory = playerAttack > MONSTER_ATTACK;

        System.out.println("======================================");
        System.out.println("          КАРТКА ПЕРСОНАЖА");
        System.out.println("======================================");

        System.out.println("Персонаж: " + playerName);
        System.out.println("Клас: " + playerClass);

        System.out.println("\n[ХАРАКТЕРИСТИКИ]");
        System.out.println("Сила: " + strength);
        System.out.println("Спритність: " + agility);
        System.out.println("Інтелект: " + intelligence);

        System.out.println("\n[ПОХІДНІ АТРИБУТИ]");
        System.out.println("Здоров'я (HP): " + hp);
        System.out.println("Мана (MP): " + mp);
        System.out.println("Броня (Armor): " + armor);

        System.out.println("\n[СИМУЛЯЦІЯ БОЮ]");
        System.out.println("Противник: " + enemyName);
        System.out.println("Кидки кубиків: " + dice1 + " + " + dice2);
        System.out.println("Бонус сили: +" + strength);
        System.out.println("Загальна атака: " + playerAttack);
        System.out.println("Атака противника: " + MONSTER_ATTACK);
        System.out.println("Перемога гравця: " + isPlayerVictory);

        System.out.println("======================================");
    }
    }

