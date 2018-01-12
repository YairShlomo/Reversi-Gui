/*
Name:Yair Shlomo
ID: 308536150
Name:Gal Eini
ID: 305216962
*/
public  class Main {
    private static final int NUMROW = 3;
    private static final int NUMCOL = 3;

    public static void main(String[] args) {
        Board board = new Board(NUMROW, NUMCOL);
        board.printBoard();
        GameLogic1 logic = new GameLogic1(board);
        ConsolePlayer pl1=new ConsolePlayer('X');
        ConsolePlayer pl2=new ConsolePlayer('O');
        Game game=new Game(pl1, pl2, board, logic);
        game.play();


    }
}

