package reversi;

import javafx.fxml.FXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Game {
    private File file;
    public Game() {
        file = new File("settingFile.txt");
    }
    @FXML
    protected void openFile() {
        //System.out.println("work");

        try {
            File fil = new File("settingFile");
            fil.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(fil));
            String line;
            while((line= br.readLine()) != null) {
                System.out.println(line);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
