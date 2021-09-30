import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int FirstPokemonHP;
        int SecondPokemonHP;
        int FirstPokemonATK;
        int SecondPokemonATK;
        int FirstPokemonDEF;
        int SecondPokemonDEF;
        int FirstPokemonSPD;
        int SecondPokemonSPD;
        int FirstPokemonSPA;
        int SecondPokemonSPA;
        int FirstCountVictory = 0;
        int SecondCountVictory = 0;
        int firstchoose;
        int secondchoose;
        String firstchoosename = "";
        String firstchoosetype = "";
        String secondchoosename = "";
        String secondchoosetype = "";
        Scanner ler = new Scanner(System.in);
        
        do{
        System.out.println("\n" + "Please choose a valid pokemon:" + "\n" +
                "1: Charizard, " +
                "2: Empoleon, " +
                "3: Sceptile");          
        firstchoose = ler.nextInt();
        } while(firstchoose != 1 && firstchoose != 2 && firstchoose != 3);
        
        do{
        System.out.println("\n" + "Please choose a valid opponent's pokemon:" + "\n" +
                "1: Charizard, " +
                "2: Empoleon, " +
                "3: Sceptile");          
        secondchoose = ler.nextInt();
        } while(secondchoose != 1 && secondchoose != 2 && secondchoose != 3);
        
        if (firstchoose == 1){
            firstchoosename = "Charizard";
            firstchoosetype = "Fire";
        }
        if (firstchoose == 2){
            firstchoosename = "Empoleon";
            firstchoosetype = "Water";
        }
        if (firstchoose == 3){
            firstchoosename = "Sceptile";
            firstchoosetype = "Grass";
        }
        
        if (secondchoose == 1){
            secondchoosename = "Charizard";
            secondchoosetype = "Fire";
        }
        if (secondchoose == 2){
            secondchoosename = "Empoleon";
            secondchoosetype = "Water";
        }
        if (secondchoose == 3){
            secondchoosename = "Sceptile";
            secondchoosetype = "Grass";
        }
        
        Pokemon FirstPokemon = new Pokemon(firstchoosename, firstchoosetype, 50);    
        Pokemon SecondPokemon = new Pokemon(secondchoosename, secondchoosetype, 50);
        
        FirstPokemon.printPokemon();
        SecondPokemon.printPokemon();
        
        FirstPokemonHP = FirstPokemon.getHp();
        SecondPokemonHP = SecondPokemon.getHp();
        
        FirstPokemonATK = FirstPokemon.getAttack();
        SecondPokemonATK = SecondPokemon.getAttack();
        
        FirstPokemonDEF = FirstPokemon.getDefence();
        SecondPokemonDEF = SecondPokemon.getDefence();
        
        FirstPokemonSPD = FirstPokemon.getSpeed();
        SecondPokemonSPD = SecondPokemon.getSpeed();
        
        FirstPokemonSPA = FirstPokemon.getSpattack();
        SecondPokemonSPA = SecondPokemon.getSpattack();
        
        if(FirstPokemonHP > SecondPokemonHP){
            FirstCountVictory++;
        }
        if(FirstPokemonHP < SecondPokemonHP){
            SecondCountVictory++;
        } else{
        }
        
        if(FirstPokemonATK > SecondPokemonATK){
            FirstCountVictory++;
        }
        if(FirstPokemonATK < SecondPokemonATK){
            SecondCountVictory++;
        } else{
        }
        
        if(FirstPokemonDEF > SecondPokemonDEF){
            FirstCountVictory++;
        }
        if(FirstPokemonDEF < SecondPokemonDEF){
            SecondCountVictory++;
        } else{
        }
        
        if(FirstPokemonSPD > SecondPokemonSPD){
            FirstCountVictory++;
        }
        if(FirstPokemonSPD < SecondPokemonSPD){
            SecondCountVictory++;
        } else{
        }
        
        if(FirstPokemonSPA > SecondPokemonSPA){
            FirstCountVictory++;
        }
        if(FirstPokemonSPA < SecondPokemonSPA){
            SecondCountVictory++;
        } else{
        }
        
        if(FirstCountVictory == SecondCountVictory){
            System.out.println("Draw!");
        } else if(FirstCountVictory > SecondCountVictory){
            System.out.println("You won!");
        } else{
            System.out.println("You lost");
        }    
    }
}