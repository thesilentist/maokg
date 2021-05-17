package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        int sceneWidth = 300;
        int sceneHeight = 250;
        Group root = new Group();
        Scene scene = new Scene(root, sceneWidth, sceneHeight);

        int baseGap = 25;
        int rectWidth = sceneWidth - baseGap*2;
        int rectHeight = sceneHeight - baseGap*2;
        Rectangle rectangle = new Rectangle(baseGap,baseGap,rectWidth,rectHeight);
        root.getChildren().add(rectangle);
        rectangle.setFill(Color.MAROON);

        scene.setFill(Color.OLIVE);

        Line horizontal1 = new Line(baseGap + 3,baseGap+rectHeight/3 + 3,baseGap+rectWidth - 3,baseGap+rectHeight/3 + 3);
        root.getChildren().add(horizontal1);
        horizontal1.setStrokeWidth(6f);
        horizontal1.setStroke(Color.YELLOW);

        Line horizontal2 = new Line(baseGap +3,baseGap+2*rectHeight/3 + 3,baseGap+rectWidth -3,baseGap+2*rectHeight/3 + 3);
        root.getChildren().add(horizontal2);
        horizontal2.setStrokeWidth(6f);
        horizontal2.setStroke(Color.YELLOW);

        Line vertical1 = new Line(baseGap + rectWidth/2 + 3,baseGap + 3,baseGap + rectWidth/2 + 3,baseGap+rectHeight/3 + 3);
        root.getChildren().add(vertical1);
        vertical1.setStrokeWidth(6f);
        vertical1.setStroke(Color.YELLOW);

        Line vertical2 = new Line(baseGap + 3 + rectWidth/4,baseGap+rectHeight/3 + 3,baseGap + 3 + rectWidth/4,sceneHeight - baseGap -  3 - rectHeight/3);
        root.getChildren().add(vertical2);
        vertical2.setStrokeWidth(6f);
        vertical2.setStroke(Color.YELLOW);

        Line vertical3 = new Line(baseGap + 3 + rectWidth/4*3 ,baseGap+rectHeight/3 + 3,baseGap + 3 + rectWidth/4*3,sceneHeight - baseGap -  3 - rectHeight/3);
        root.getChildren().add(vertical3);
        vertical3.setStrokeWidth(6f);
        vertical3.setStroke(Color.YELLOW);

        Line vertical4 = new Line(baseGap + rectWidth/2 + 3,sceneHeight - baseGap +  3 - rectHeight/3,baseGap + rectWidth/2 + 3,sceneHeight - baseGap -  3);
        root.getChildren().add(vertical4);
        vertical4.setStrokeWidth(6f);
        vertical4.setStroke(Color.YELLOW);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
