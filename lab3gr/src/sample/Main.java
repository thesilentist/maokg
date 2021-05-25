package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Time;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
        root.getChildren().addAll(Dolphin.getPicture());
        animateNode(root);
    }

    public void animateNode(Node node) {
        Path path = new Path();
        path.getElements().add(new MoveTo(400, 500));
        path.getElements().add(new CubicCurveTo(540, 100, 480, 420, 250, 300));
        path.getElements().add(new CubicCurveTo(250, 350, 400, 280, 550, 700));

        PathTransition pt = new PathTransition();
        pt.setPath(path);
        pt.setNode(node);
        pt.setDuration(Duration.millis(7000));
        pt.setAutoReverse(true);
        pt.setCycleCount(Timeline.INDEFINITE);

        RotateTransition rt = new RotateTransition();
        rt.setNode(node);
        rt.setDuration(Duration.millis(7000));
        rt.setByAngle(360f);
        rt.setAutoReverse(true);
        rt.setCycleCount(Timeline.INDEFINITE);

        ScaleTransition st = new ScaleTransition();
        st.setNode(node);
        st.setDuration(Duration.millis(7000));
        st.setToX(0.5f);
        st.setToY(0.5f);
        st.setAutoReverse(true);
        st.setCycleCount(Timeline.INDEFINITE);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(pt,rt,st);
        parallelTransition.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}