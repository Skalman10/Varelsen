package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    Cell c;
    CellList Cells;
    public SimulationModel() {
        int GridWidth = 100;
        int GridHeight= 100;
        boolean [][] CellList = new boolean[GridWidth][GridHeight];
        for (int x = 0;x<GridWidth;x++) {
            for (int y =0;y<GridHeight;y++) {
                CellList[x][y] = Math.random() <= 0.5;
            }
        }
        Cells = new CellList(CellList);
        c = new Cell(2,2);
    }
    public void update() {
        CellList.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c.getShape());
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(c.getSprite());
        return sprites;
    }
}
