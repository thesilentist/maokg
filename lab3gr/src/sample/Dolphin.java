package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;

public class Dolphin {
    public static Node[] getPicture() {
        Node[] body = getBody();

        return  Util.concatArrays(body);
    }

    public static Node[] getBody() {
        QuadCurve left1 = new QuadCurve();
        left1.setStartX(275.0);
        left1.setStartY(376.0);
        left1.setControlX(210.0);
        left1.setControlY(360.0);
        left1.setEndX(190.0);
        left1.setEndY(280.0);
        left1.setStroke(Color.BLACK);
        left1.setFill(Color.CYAN);

        QuadCurve left2 = new QuadCurve();
        left2.setStartX(190.0);
        left2.setStartY(280.0);
        left2.setControlX(190.0);
        left2.setControlY(160.0);
        left2.setEndX(290.0);
        left2.setEndY(150.0);
        left2.setStroke(Color.BLACK);
        left2.setFill(Color.CYAN);

        QuadCurve top1 = new QuadCurve();
        top1.setStartX(290.0);
        top1.setStartY(150.0);
        top1.setControlX(370.0);
        top1.setControlY(170.0);
        top1.setEndX(360.0);
        top1.setEndY(240.0);
        top1.setStroke(Color.BLACK);
        top1.setFill(Color.CYAN);

        QuadCurve right1 = new QuadCurve();
        right1.setStartX(360.0);
        right1.setStartY(240.0);
        right1.setControlX(400.0);
        right1.setControlY(290.0);
        right1.setEndX(324.0);
        right1.setEndY(280.0);
        right1.setStroke(Color.BLACK);
        right1.setFill(Color.CYAN);

        Line right2 = new Line(324.0,280.0,320.0,323.0);
        right2.setStroke(Color.BLACK);

        Line right3 = new Line(320.0,323.0,292.0,298.0);
        right3.setStroke(Color.BLACK);

        QuadCurve right4 = new QuadCurve();
        right4.setStartX(292.0);
        right4.setStartY(298.0);
        right4.setControlX(260.0);
        right4.setControlY(360.0);
        right4.setEndX(346.0);
        right4.setEndY(370.0);
        right4.setStroke(Color.BLACK);
        right4.setFill(Color.WHITE);

        QuadCurve bottom1 = new QuadCurve();
        bottom1.setStartX(346.0);
        bottom1.setStartY(370.0);
        bottom1.setControlX(330.0);
        bottom1.setControlY(390.0);
        bottom1.setEndX(302.0);
        bottom1.setEndY(386.0);
        bottom1.setStroke(Color.BLACK);
        bottom1.setFill(Color.CYAN);

        QuadCurve bottom2 = new QuadCurve();
        bottom2.setStartX(302.0);
        bottom2.setStartY(386.0);
        bottom2.setControlX(300.0);
        bottom2.setControlY(410.0);
        bottom2.setEndX(280.0);
        bottom2.setEndY(420.0);
        bottom2.setStroke(Color.BLACK);
        bottom2.setFill(Color.CYAN);

        QuadCurve bottom3 = new QuadCurve();
        bottom3.setStartX(280.0);
        bottom3.setStartY(420.0);
        bottom3.setControlX(260.0);
        bottom3.setControlY(410.0);
        bottom3.setEndX(275.0);
        bottom3.setEndY(376.0);
        bottom3.setStroke(Color.BLACK);
        bottom3.setFill(Color.CYAN);

        Polygon innerAreaPol = new Polygon();
        innerAreaPol.getPoints().addAll(
                190.0,280.0,
                        290.0,150.0,
                        360.0,240.0,
                        324.0,280.0,
                        320.0,323.0,
                        292.0,298.0,
                        346.0,370.0,
                        302.0,386.0,
                        280.0,420.0,
                        275.0,376.0
        );
        innerAreaPol.setFill(Color.CYAN);

        Circle leftEye1 = new Circle(315.0,224.0,10.0,Color.WHITE);
        leftEye1.setStroke(Color.BLACK);

        Circle leftEye2 = new Circle(316.0,229.0,5.0,Color.BLACK);

        Circle rightEye1 = new Circle(342.0,223.0,10.0,Color.WHITE);
        rightEye1.setStroke(Color.BLACK);

        Circle rightEye2 = new Circle(343.0,228.0,5.0,Color.BLACK);
        rightEye1.setStroke(Color.BLACK);

        Circle backCircle1 = new Circle(210.0,228.0,8.0,Color.MEDIUMSLATEBLUE);

        Circle backCircle2 = new Circle(203.0,253.0,7.0,Color.MEDIUMSLATEBLUE);

        Circle backCircle3 = new Circle(202.0,279.0,6.0,Color.MEDIUMSLATEBLUE);

        QuadCurve nose = new QuadCurve();
        nose.setStartX(324.0);
        nose.setStartY(280.0);
        nose.setControlX(290.0);
        nose.setControlY(270.0);
        nose.setEndX(250.0);
        nose.setEndY(234.0);
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.CYAN);

        QuadCurve mouth = new QuadCurve();
        mouth.setStartX(250.0);
        mouth.setStartY(234.0);
        mouth.setControlX(260.0);
        mouth.setControlY(300.0);
        mouth.setEndX(284.0);
        mouth.setEndY(260.0);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.RED);

        QuadCurve centerFin1 = new QuadCurve();
        centerFin1.setStartX(240.0);
        centerFin1.setStartY(317.0);
        centerFin1.setControlX(250.0);
        centerFin1.setControlY(290.0);
        centerFin1.setEndX(243.0);
        centerFin1.setEndY(273.0);
        centerFin1.setStroke(Color.BLACK);
        centerFin1.setFill(Color.CYAN);

        QuadCurve centerFin2 = new QuadCurve();
        centerFin2.setStartX(240.0);
        centerFin2.setStartY(317.0);
        centerFin2.setControlX(220.0);
        centerFin2.setControlY(310.0);
        centerFin2.setEndX(211.0);
        centerFin2.setEndY(287.0);
        centerFin2.setStroke(Color.BLACK);
        centerFin2.setFill(Color.CYAN);

        QuadCurve backFin1 = new QuadCurve();
        backFin1.setStartX(161.0);
        backFin1.setStartY(240.0);
        backFin1.setControlX(180.0);
        backFin1.setControlY(202.0);
        backFin1.setEndX(206.0);
        backFin1.setEndY(202.0);
        backFin1.setStroke(Color.BLACK);
        backFin1.setFill(Color.CYAN);

        QuadCurve backFin2 = new QuadCurve();
        backFin2.setStartX(161.0);
        backFin2.setStartY(240.0);
        backFin2.setControlX(191.0);
        backFin2.setControlY(240.0);
        backFin2.setEndX(191.0);
        backFin2.setEndY(254.0);
        backFin2.setStroke(Color.BLACK);
        backFin2.setFill(Color.WHITE);

        Polygon FinTrianglePol = new Polygon();
        FinTrianglePol.getPoints().addAll(
                161.0,240.0,
                191.0,254.0,
                206.0,202.0
        );
        FinTrianglePol.setFill(Color.CYAN);

        QuadCurve center1 = new QuadCurve();
        center1.setStartX(292.0);
        center1.setStartY(298.0);
        center1.setControlX(298.0);
        center1.setControlY(280.0);
        center1.setEndX(298.0);
        center1.setEndY(269.0);
        center1.setStroke(Color.BLACK);
        center1.setFill(Color.CYAN);



        return new Node[] {
                innerAreaPol,FinTrianglePol,left1,left2, top1, right1, right2, right3, right4, bottom1, bottom2, bottom3,center1, leftEye1, leftEye2, rightEye1, rightEye2, backFin1, backFin2, centerFin1, centerFin2,backCircle1,backCircle2,backCircle3, nose, mouth
        };
    }
}
