package classes.ufrpe.cine_easyplex.GUI;

import classes.ufrpe.cine_easyplex.beans.Filme;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdicionarFilmesController {
	@FXML ObservableList<String> classificacaoList = FXCollections.observableArrayList("L","10","12","14","16","18");
	@FXML ObservableList<String> generoList = FXCollections.observableArrayList("A��o","Anima��o","Cinema cat�strofe","Com�dia","Drama","Document�rio","Er�tico","Fantasia",
			"Fic��o cient�fica","Fic��o hist�rica","Guerra","Musical","Romance","Suspense","Terror");
	@FXML TextField tfTitulo, tfDuracao;
	@FXML Label lblError;
	@FXML ChoiceBox<String> classificacaoBox;
	@FXML ChoiceBox<String> generoBox;
	
	@FXML
	public void initialize() {
		classificacaoBox.setValue("L");
		classificacaoBox.setItems(classificacaoList);
		generoBox.setValue("A��o");
		generoBox.setItems(generoList);
		
	}
	
	public void adicionar(){
		try{
			Filme filme = new Filme();
			filme.setTitulo(tfTitulo.getText());
			filme.setDuracao(Integer.valueOf(tfDuracao.getText()));
			filme.setClassificacao(classificacaoBox.getValue());
			filme.setGenero(generoBox.getValue());
			Fachada.getInstancia().getFilmes().adicionarFilme(filme);
			lblError.setText("Adicionado com sucesso!");
			tfTitulo.clear();
			classificacaoBox.setValue("L");
			generoBox.setValue("A��o");
			tfDuracao.clear();
			
		}
		catch(Exception e){
			lblError.setText(e.getMessage());
		}
	}
	
	public void backToMenu(){
		try{
			ScreenManager.getInstance().getMenu();
			System.out.println("entrou aqui");
		}
		catch(Exception e){
			lblError.setText(e.getMessage());
		}
	}
	
	public void sair(){
		try{
			ScreenManager.getInstance().getTelaLogin();
			System.out.println("entrou aqui");
		}
		catch(Exception e){
			lblError.setText(e.getMessage());
		}
	}

	
	
}
