import java.util.ArrayList;
import java.util.List;

public class Map {
  private int[][] floorMap;
  private List<List<GameObject>> gameObjects;


  public Map(int[][] floorMap) {
    this.floorMap = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};
    this.gameObjects = new ArrayList<>(new ArrayList<>());
  }


  public void fillMap() {
    for (int i = 0; i < 10; i++) {
      List<GameObject> tempArrayList = new ArrayList<>();
      gameObjects.add(tempArrayList);
      for (int j = 0; j < 10; j++) {
        if (floorMap[i][j] == 1) {
          tempArrayList.add(new Wall(i*72, j*72, "assets/wall.png"));
        } else {
          tempArrayList.add(new Floor(i*72, j*72, "assets/floor.png"));
        }

        }
      }
  }

}
