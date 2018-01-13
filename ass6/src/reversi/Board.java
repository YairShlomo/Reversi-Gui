package reversi;

import javafx.fxml.FXMLLoader;

public class Board {
    private int[][] board;
    private Player player;
    public Board(int[][] board) {
        this.board = board;
        FXMLLoader fxmlLoader = new
                FXMLLoader(getClass().getResource("MazeBoard.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
    }
}

