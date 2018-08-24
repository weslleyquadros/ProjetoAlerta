package application;


import java.util.Arrays;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploAlerta extends Application {

	private Button botao01 = new Button("Exemplo 01");
	private Button botao02 = new Button("Exemplo 02");
	private Button botao03 = new Button("Exemplo 03");
	private Button botao04 = new Button("Exemplo 04");
	private Button botao05 = new Button("Exemplo 05");
	private Button botao06 = new Button("Exemplo 06");
	private Button botao07 = new Button("Exemplo 07");

	public void init() throws Exception {
		super.init();
		
		
		botao01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);	
				alert.setTitle("Informação");
				//retirando o cabeçalho
				alert.setHeaderText(null);
				alert.setContentText("Voce clicou no exemplo 01");
				alert.show();
				}
		});
		
		botao02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);	
				alert.setTitle("Informação");
				//retirando o cabeçalho
				alert.setHeaderText(null);
				alert.setContentText("Voce clicou no exemplo 01");
				alert.show();
				}
		});
		
		botao03.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);	
				alert.setTitle("Informação");
				//retirando o cabeçalho
				alert.setHeaderText(null);
				alert.setContentText("Voce clicou no exemplo 01");
				alert.show();
				}
		});
		
		botao04.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);	
				alert.setTitle("Informação");
				//retirando o cabeçalho
				alert.setHeaderText(null);
				alert.setContentText("Voce clicou no exemplo 01");
				alert.show();
				}
		});
		
		botao05.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert alert = new Alert(AlertType.INFORMATION);	
				alert.setTitle("Informação");
				//retirando o cabeçalho
				alert.setHeaderText("Outros Botões");
				alert.setContentText("Selecione uma das opções:");
				
				ButtonType buttonSim = new ButtonType("Sim");
				ButtonType buttonNao = new ButtonType("Não");
				ButtonType buttonTalvez = new ButtonType("Talvez");
				ButtonType buttonCerteza = new ButtonType("Certeza", ButtonData.CANCEL_CLOSE);
				
				alert.getButtonTypes().addAll(buttonSim, buttonNao, buttonTalvez, buttonCerteza);
				Optional<ButtonType> resposta = alert.showAndWait();
				
				System.out.println(resposta.get().getText());
			
			}
		});
		
		botao06.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				TextInputDialog dialog = new TextInputDialog("Palmas");	
				dialog.setTitle("Municipio");
				
				dialog.setHeaderText("Cabeçalho qualquer");
				dialog.setContentText("Informe o nome da sua cidade:");
				
				Optional<String> resultado = dialog.showAndWait();
				
				if(resultado.isPresent()) // so entra se der OK
				System.out.println("A cidade digitado foi:" + resultado.get());
			
			}
		});
		
		botao07.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ChoiceDialog<String> dialog = new ChoiceDialog<String>("Palmas" , Arrays.asList("Araguaina" , 
						"Paraiso", "Palmas"));
			Optional<String> resultado = dialog.showAndWait();
			
			System.out.println(resultado.get());
			
			
			}
		});
		
	}

	public static void main(String[] args) {
		launch(args);// executa o programa

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// criando um layout raiz (root) e adiciona un noh
		VBox root = new VBox();
		root.getChildren().addAll(botao01, botao02, botao03, botao04, botao05, botao06, botao07);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(10);

		// cria uma cena recebendo como parametros: Layout(root), largura e altura
		Scene scene = new Scene(root, 400, 400);

		primaryStage.setTitle("Iai Mundão");
		primaryStage.setScene(scene);// adiciona a cena ao stage e mostra a aplicacao
		primaryStage.show();

	}

}
