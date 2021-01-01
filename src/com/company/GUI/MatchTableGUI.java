package com.company.GUI;

import com.company.PremierLeagueManager;
import com.company.SportsClub;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Predicate;


public class MatchTableGUI extends Application {
    private static PremierLeagueManager LeagueManager;
    private TableView<SportsClub> tableMember;
    private TextField filterMember;
    private ObservableList<SportsClub> sportsClubList = FXCollections.observableArrayList();


    @Override
    public void start(Stage primaryStage) throws Exception {
        LeagueManager = new PremierLeagueManager();
        System.out.println("...Match Results...");
        primaryStage.setTitle("Sports Club System - Football");
        primaryStage.setHeight(500);
        primaryStage.setWidth(1225);


        TableColumn<SportsClub, String> clubnameColumn = new TableColumn<>("Club Name");
        clubnameColumn.setMinWidth(121);
        clubnameColumn.setCellValueFactory(new PropertyValueFactory<>("club_name"));

        TableColumn<SportsClub, String> locationColumn = new TableColumn<>("Location");
        locationColumn.setMinWidth(125);
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));

        TableColumn<SportsClub, String> various_staticticsColumn = new TableColumn<>("Various Statictics");
        various_staticticsColumn.setMinWidth(130);
        various_staticticsColumn.setCellValueFactory(new PropertyValueFactory<>("various_statictics"));

        TableColumn<SportsClub, String> recievedgoalsColumn = new TableColumn<>("Recieved Goals");
        recievedgoalsColumn.setMinWidth(110);
        recievedgoalsColumn.setCellValueFactory(new PropertyValueFactory<>("recieved_goals"));

        TableColumn<SportsClub, String> scoredgoalsColumn = new TableColumn<>(" Scored Goals");
        scoredgoalsColumn.setMinWidth(110);
        scoredgoalsColumn.setCellValueFactory(new PropertyValueFactory<>("scored_goals"));

        TableColumn<SportsClub, String> currentpointsColumn = new TableColumn<>("Current Points");
        currentpointsColumn.setMinWidth(121);
        currentpointsColumn.setCellValueFactory(new PropertyValueFactory<>("current_points"));

        TableColumn<SportsClub, String> winsColumn = new TableColumn<>("Wins");
        winsColumn.setMinWidth(119);
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));

        TableColumn<SportsClub, String> drawsColumn = new TableColumn<>("Draws");
        drawsColumn.setMinWidth(119);
        drawsColumn.setCellValueFactory(new PropertyValueFactory<>("Draws"));

        TableColumn<SportsClub, String> defeartsColumn = new TableColumn<>("Defearts");
        defeartsColumn.setMinWidth(119);
        defeartsColumn.setCellValueFactory(new PropertyValueFactory<>("Defearts"));

        TableColumn<SportsClub, String> matchcountColumn = new TableColumn<>("Match Count");
        matchcountColumn.setMinWidth(119);
        matchcountColumn.setCellValueFactory(new PropertyValueFactory<>("match_count"));


        filterMember = new TextField();
        filterMember.setPromptText("Enter name or ID");
        filterMember.setMinWidth(100);

        Label searchLabel = new Label("Search Member: ");
        searchLabel.setFont(new Font(17));

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(15, 11, 11, 60));
        hBox.setSpacing(11);
        hBox.getChildren().addAll(searchLabel, filterMember);

        tableMember = new TableView<>();
        tableMember.setItems(getSportsClubList());
        tableMember.getColumns().addAll(clubnameColumn, locationColumn, various_staticticsColumn, recievedgoalsColumn, scoredgoalsColumn, currentpointsColumn, winsColumn, drawsColumn, defeartsColumn, matchcountColumn);


        VBox vBox = new VBox(5);
        Label label = new Label("Sports Club - Football Club System");
        label.setFont(new Font(20));
        vBox.getChildren().addAll(label, tableMember, hBox);
        Scene scene = new Scene(vBox);
        tableMember.setEditable(true);

        vBox.setPadding(new Insets(17, 11, 15, 11));

       // FilteredList<SportsClub> filteredMemberList = new FilteredList<>(sportsClubList, e -> true);
         filterMember.setOnKeyPressed(e -> {

      //  filterMember.textProperty().addListener(((observable, oldValue, newValue) -> {
          /*  filteredMemberList.setPredicate((Predicate<? super SportsClub>) sportsClubList -> {
                if (e.getText() == null || e.getText().isEmpty()) {
                    return true;
                }
                String valueLowerCase = e.getText().toLowerCase();
                if (sportsClubList.getClub_name().toLowerCase().contains(valueLowerCase)) {
                    return true;
                }
                return false;
            });*/
   //     }
     //   ));
         ObservableList<SportsClub> searchResults = FXCollections.observableArrayList();
         for(SportsClub sportsClub:sportsClubArrayList){
             if(sportsClub.getClub_name().toLowerCase().contains(e.getText().toLowerCase())){
                 searchResults.add(sportsClub);
             }
         }
       // SortedList<SportsClub> searchResults = new SortedList<>(filteredMemberList);
       // searchResults.comparatorProperty().bind(tableMember.comparatorProperty());
        tableMember.setItems( searchResults);

         });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    ArrayList<SportsClub> sportsClubArrayList = new ArrayList<>();

    public ObservableList<SportsClub> getSportsClubList() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("saveFile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            sportsClubArrayList = (ArrayList<SportsClub>) objectInputStream.readObject();

        } catch (Exception e) {

        }
        System.out.println("Clubs have been loaded successfully");
        ObservableList<SportsClub> sportsclubs = FXCollections.observableArrayList(sportsClubArrayList);
        return sportsclubs;
    }
}
