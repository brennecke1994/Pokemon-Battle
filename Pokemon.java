import java.util.Scanner;

public class Pokemon{
    private String name;
    private String type;
    private int level;
    private int hp = 200;
    private int attack;
    private int defence;
    private int speed;
    private int spattack;
    
    public Pokemon(String name, String type, int level){
        this.name = name;
        this.type = type;
        this.level = level;
                
        atributeCalculate();
        bonusCalculate();
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getSpattack() {
        return spattack;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    private void atributeCalculate(){
        switch(type){
            case "Fire":
                hp = hp - 20;
                attack = 50;
                defence = 20;
                speed = 25;
                spattack = 30;
            break;
            
            case "Water":
                hp = hp - 5;
                attack = 20;
                defence = 35;
                speed = 15;
                spattack = 40;
            break;
                       
            case "Grass":
                hp = hp + 25;
                attack = 40;
                defence = 15;
                speed = 20;
                spattack = 35;
            break;
            
            
        }
    }
    
    private void bonusCalculate(){
        
        hp = hp + (level / 2);
        attack = attack + (level / 3);
        defence = defence + (level / 4);
        speed = speed + (level / 5);
        spattack = spattack + (level / 3);
    }   
    
    public void printPokemon(){
        
        System.out.println( "\n" +
                "Name: " + name + " | " + 
                "Type: " + type + " | " + 
                "Level: " + level + " | " + 
                "HP: " + hp + " | " +
                "Attack: " + attack + " | " +
                "Defence: " + defence + " | " +
                "Special Attack: " + spattack + " | " +
                "Speed: " + speed + "\n");       
    }
}