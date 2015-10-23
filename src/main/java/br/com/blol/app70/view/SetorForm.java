package br.com.blol.app70.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Created by cleverson on 23/10/15.
 */
public class SetorForm extends AnchorPane {
    public SetorForm(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Cadastro de Setor");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label lbCodigo = new Label("Código:");
        grid.add(lbCodigo, 0, 1);

        TextField tfCodigo = new TextField();
        grid.add(tfCodigo, 1, 1);

        Label lbNome = new Label("Nome:");
        grid.add(lbNome, 0, 2);

        TextField tfNome = new TextField();
        grid.add(tfNome, 1, 2);

        Label lbObs = new Label("Obs:");
        grid.add(lbObs, 0, 3);

        TextField tfObs = new TextField();
        grid.add(tfObs, 1, 3);

        Button btnCancelar = new Button("Cancelar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);

        Button btnSalvar = new Button("Salvar");
        hbBtn.getChildren().addAll(btnCancelar, btnSalvar);

        grid.add(hbBtn, 1, 4);
        getChildren().add(grid);

    }
}
