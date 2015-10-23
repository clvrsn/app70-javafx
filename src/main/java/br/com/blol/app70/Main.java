package br.com.blol.app70;

import br.com.blol.app70.view.FuncionarioForm;
import br.com.blol.app70.view.SetorForm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * Created by cleverson on 22/10/15.
 */
public class Main extends Application {

    private static BorderPane root = new BorderPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Exemplo JavaFX");

        MenuBar menuBar = new MenuBar();
        Menu menuCadastros = new Menu("Cadastros");

        MenuItem mnSetor = new MenuItem("Setor");
        MenuItem mnFuncionario = new MenuItem("Funcionario");

        mnFuncionario.setOnAction( e -> { getRoot().setCenter(new FuncionarioForm()); });
        mnSetor.setOnAction( e -> { getRoot().setCenter(new SetorForm()); });

        menuCadastros.getItems().addAll(mnSetor,mnFuncionario);

        menuBar.getMenus().addAll(menuCadastros);


        root.setTop(menuBar);
        root.setCenter(new FuncionarioForm());

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static BorderPane getRoot() {
        return root;
    }

    public static void setRoot(BorderPane root) {
        Main.root = root;
    }


}
