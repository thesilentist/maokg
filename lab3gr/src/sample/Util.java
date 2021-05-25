package sample;
import javafx.scene.Node;
public class Util {
    public static Node[] concatArrays(Node[]... args) {
        int count = 0;
        int size = 0;
        for (Node[] arg: args) {
            size += arg.length;
        }
        Node[] concatedArr = new Node[size];
        for (Node[] arg: args) {
            int argLength = arg.length;
            for (Node node : arg) {
                concatedArr[count] = node;
                count += 1;
            }
        }
        return concatedArr;
    }
}