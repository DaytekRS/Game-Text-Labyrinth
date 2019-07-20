import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Radkevich.Input;
interface State{
    public void goToUP();
    public void goToDown();
    public void goToLeft();
    public void goToRight();
    String status();
}
class stateUp implements State{
    Player pl;
    stateUp(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти вверх";
    }
}
class stateDown implements State{
    Player pl;
    stateDown(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти вниз";
    }
}
class stateLeft implements State{
    Player pl;
    stateLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти налево";
    }
}
class stateRight implements State{
    Player pl;
    stateRight(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти направо";
    }
}
class stateUpDown implements State{
    Player pl;
    stateUpDown(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти вверх или вниз";
    }
}
class stateUpRight implements State{
    Player pl;
    stateUpRight(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти вверх или направо";
    }
}
class stateUpLeft implements State{
    Player pl;
    stateUpLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти вверх или налево";
    }
}
class stateUpDownRight implements State{
    Player pl;
    stateUpDownRight(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти вверх, вниз или навпрао";
    }
}
class stateUpDownLeft implements State{
    Player pl;
    stateUpDownLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете идти вверх, вниз или налево";
    }
}
class stateUpRightLeft implements State{
    Player pl;
    stateUpRightLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти вверх,направо или налево";
    }
}
class stateUpDownRightLeft implements State{
    Player pl;
    stateUpDownRightLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        pl.y++;
        pl.start.setState();
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти во все стороны";
    }
}
class stateDownRight implements State{
    Player pl;
    stateDownRight(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти вниз или направо";
    }
}
class stateDownLeft implements State{
    Player pl;
    stateDownLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();

    }

    @Override
    public void goToRight() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public String status() {
        return "Вы можете вниз или налево";
    }
}
class stateDownRightLeft implements State{
    Player pl;
    stateDownRightLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        pl.y--;
        pl.start.setState();

    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете идти вниз, лево или направо";
    }
}
class stateRightLeft implements State{
    Player pl;
    stateRightLeft(Player pl){
        this.pl=pl;
    }
    @Override
    public void goToUP() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToDown() {
        System.out.println("Тут прохода нет");
    }

    @Override
    public void goToLeft() {
        pl.x--;
        pl.start.setState();
    }

    @Override
    public void goToRight() {
        pl.x++;
        pl.start.setState();
    }

    @Override
    public String status() {
        return "Вы можете направо или налево";
    }
}
class Start {
    Player pl;
    public Start(Player pl){
        this.pl=pl;
    }
    public void setState(){
        if ((pl.x==pl.map.winX)&&(pl.y==pl.map.winY)) pl.state=new Win();
        else {
            boolean up = false, down = false, left = false, right = false;
            if (pl.map.matrix[pl.x][pl.y + 1] == 0) up = true;
            if (pl.map.matrix[pl.x][pl.y - 1] == 0) down = true;
            if (pl.map.matrix[pl.x - 1][pl.y] == 0) left = true;
            if (pl.map.matrix[pl.x + 1][pl.y] == 0) right = true;
            if ((up) && (down) && (left) && (right)) pl.state = new stateUpDownRightLeft(pl);
            else if ((up) && (down) && (left)) pl.state = new stateUpDownLeft(pl);
            else if ((up) && (right) && (left)) pl.state = new stateUpRightLeft(pl);
            else if ((up) && (down) && (right)) pl.state = new stateUpDownRight(pl);
            else if ((left) && (down) && (right)) pl.state = new stateDownRightLeft(pl);
            else if ((left) && (right)) pl.state = new stateRightLeft(pl);
            else if ((left) && (right)) pl.state = new stateRightLeft(pl);
            else if ((left) && (down)) pl.state = new stateDownLeft(pl);
            else if ((down) && (right)) pl.state = new stateDownRight(pl);
            else if ((up) && (left)) pl.state = new stateUpLeft(pl);
            else if ((up) && (right)) pl.state = new stateUpRight(pl);
            else if ((down) && (up)) pl.state = new stateUpDown(pl);
            else if (up) pl.state = new stateUp(pl);
            else if (down) pl.state = new stateDown(pl);
            else if (right) pl.state = new stateRight(pl);
            else pl.state = new stateLeft(pl);
        }
    }
}
class Map{
    int x,y;
    int winX,winY;
    int startPl_x,startPl_y;
    int matrix[][];
    Map(String file){
        try {
            Scanner sc;
            sc = new Scanner(new File(file));
            startPl_x=sc.nextInt();
            startPl_y=sc.nextInt();
            winX=sc.nextInt();
            winY=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
            matrix=new int[x][y];

            for (int i=y-1;i>=0;i--){
                for (int j=0;j<x;j++) {

                    matrix[j][i] = sc.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    void Print(){
        for (int i=y-1;i>=0;i--){
            for (int j=0;j<x;j++) System.out.print(matrix[j][i]);
            System.out.println();
        }
    }
}
class Win implements State{

    @Override
    public void goToUP() {

    }

    @Override
    public void goToDown() {

    }

    @Override
    public void goToLeft() {

    }

    @Override
    public void goToRight() {

    }

    @Override
    public String status() {
        return "Вы прошли лабиринт";
    }
}
class Player{
    public int x,y;
    State state;
    public Start start;
    public Map map;
    public Player(){
        map=new Map("map.txt");
        //map.Print();
        this.x=map.startPl_x;
        this.y=map.startPl_y;
        start=new Start(this);
        start.setState();
    }
    public String toString(){
        return state.status();
    }
}
public class Game {

    public static void main(String [] args){
        Input in=new Input();
        Player pl=new Player();
        while (true){
            System.out.println(pl);
            switch (in.read_s()){
                case "w":
                    pl.state.goToUP();
                    break;
                case "s":
                    pl.state.goToDown();
                    break;
                case "a":
                    pl.state.goToLeft();
                    break;
                case "d":
                    pl.state.goToRight();
                    break;
                default:
                    System.out.println("Простите но такой операции нет");
            }
        }
    }
}
