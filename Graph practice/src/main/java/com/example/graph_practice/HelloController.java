package com.example.graph_practice;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private AreaChart areaChart;
    @FXML
    private LineChart lineChart;
    @FXML
    private StackedAreaChart stackedAreaChart;
    @FXML
    private ScatterChart scatterChart;
    @FXML
    private BarChart barChart;
    @FXML
    private StackedBarChart stackedBarChart;
    @FXML
    private BubbleChart bubbleChart;
    @FXML
    private PieChart pieChart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       // line chart
        XYChart.Series series = new XYChart.Series();
        series.setName("Sales");

        series.getData().add(new XYChart.Data("1", 23));
        series.getData().add(new XYChart.Data("2", 14));
        series.getData().add(new XYChart.Data("3", 9));
        series.getData().add(new XYChart.Data("4", 6));

        lineChart.getData().add(series);


        // area chart
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Sales Again");

        series2.getData().add(new XYChart.Data("1", 23));
        series2.getData().add(new XYChart.Data("2", 14));
        series2.getData().add(new XYChart.Data("3", 23));
        series2.getData().add(new XYChart.Data("4", 14));
        
        areaChart.getData().add(series2);



        // area chart 2
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Sales Again 2");

        series3.getData().add(new XYChart.Data("1", 17));
        series3.getData().add(new XYChart.Data("2", 21));
        series3.getData().add(new XYChart.Data("3", 25));
        series3.getData().add(new XYChart.Data("4", 26));

        areaChart.getData().add(series3);


        // stacked area chart
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Wow Sales");

        series4.getData().add(new XYChart.Data(1, 17));
        series4.getData().add(new XYChart.Data(2, 21));
        series4.getData().add(new XYChart.Data(3, 25));
        series4.getData().add(new XYChart.Data(4, 26));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Wow Sales again");

        series5.getData().add(new XYChart.Data(1, 25));
        series5.getData().add(new XYChart.Data(2, 24));
        series5.getData().add(new XYChart.Data(3, 22));
        series5.getData().add(new XYChart.Data(4, 21));

        stackedAreaChart.getData().addAll(series4, series5);


        // scatter chart
        XYChart.Series series6 = new XYChart.Series();
        series6.setName("scattered sales");

        series6.getData().add(new XYChart.Data("1", 19));
        series6.getData().add(new XYChart.Data("2", 15));
        series6.getData().add(new XYChart.Data("3", 21));
        series6.getData().add(new XYChart.Data("1", 24));

        scatterChart.getData().add(series6);


        // bar chart
        XYChart.Series series7 = new XYChart.Series();
        series7.setName("bar sales");

        series7.getData().add(new XYChart.Data("1", 19));
        series7.getData().add(new XYChart.Data("2", 15));
        series7.getData().add(new XYChart.Data("3", 21));
        series7.getData().add(new XYChart.Data("4", 24));

        barChart.getData().addAll(series7, series);


        // stacked bar chart
        XYChart.Series series8 = new XYChart.Series();
        series8.setName("stacked bar sales");

        series8.getData().add(new XYChart.Data("1", 13));
        series8.getData().add(new XYChart.Data("2", 19));
        series8.getData().add(new XYChart.Data("3", 11));
        series8.getData().add(new XYChart.Data("4", 10));

        stackedBarChart.getData().addAll(series8, series);


        // stacked bar chart
        XYChart.Series series9 = new XYChart.Series();
        series9.setName("bubbled sales");

        series9.getData().add(new XYChart.Data(1, 15));
        series9.getData().add(new XYChart.Data(2, 25, 2));
        series9.getData().add(new XYChart.Data(3, 15, 0.5));
        series9.getData().add(new XYChart.Data(4, 21));

        bubbleChart.getData().add(series9);


        // pie chart
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
               new PieChart.Data("Apples", 15) ,
                new PieChart.Data("Banana", 11) ,
                new PieChart.Data("Grapes", 3) ,
                new PieChart.Data("Berries", 8));

        pieChart.getData().addAll(pieChartData);
        
    }
}