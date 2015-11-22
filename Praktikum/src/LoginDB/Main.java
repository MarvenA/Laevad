package LoginDB;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by maus on 22.11.15.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Andmebaas a = new Andmebaas();
        //a.seadistaTabel();
        new loginScreen();
    }
}

/*
* 1. CREATE TABLE
* 2. INSERT
* 3. UPDATE
* 4. SELECT
* */