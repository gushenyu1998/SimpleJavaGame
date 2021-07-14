import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import game.Wall;

public class WallTest {
    @Test
    public void testGetMaze() {
        Wall wallObj = new Wall(25);

        int[][] map = wallObj.getMaze();
        int[][] testMap = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,3,2,2,2,1,0,0,2,2,2,0,2,0,1,0,0,0,3,1},
            {1,2,1,1,2,0,0,1,1,0,1,1,1,0,1,0,1,1,1,1},
            {1,2,1,0,2,1,0,1,2,2,2,0,3,0,0,0,0,0,2,1},
            {1,2,1,0,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1},
            {1,0,1,2,2,1,2,2,0,0,0,1,0,1,0,0,0,1,0,1},
            {1,0,1,1,2,0,0,1,1,1,0,1,0,0,2,1,1,1,0,1},
            {1,0,2,2,2,1,0,1,0,0,3,1,0,1,0,1,0,0,0,1},
            {1,1,1,2,1,1,0,0,0,1,0,1,0,1,2,2,0,1,0,1},
            {1,1,2,2,2,1,0,1,0,1,0,1,0,1,1,0,1,1,0,1},
            {1,2,2,1,2,2,0,1,0,1,0,1,0,0,1,0,1,0,0,1},
            {1,0,1,1,1,1,0,1,0,0,0,1,1,0,1,0,0,0,1,1},
            {1,0,1,0,0,0,0,1,0,1,0,2,2,0,0,0,1,0,0,1},
            {1,0,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1},
            {1,2,0,0,2,2,0,1,0,1,0,0,0,0,0,0,0,0,3,1},
            {1,0,1,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,0,1},
            {1,2,1,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,1,0,2,2,0,0,1,0,1},
            {1,2,1,1,1,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1},
            {1,0,2,2,0,0,0,2,2,0,0,1,0,0,0,2,2,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    
        };

        for(int i = 0; i<20; i++) {
            for(int j = 0; j<20; j++) {
                assertEquals(testMap[i][j], map[i][j]);
            }
        }
    }

    @Test
    public void testGetLocation() {
        Wall wallObj = new Wall(25);

        int item = wallObj.getLocation(0, 0);

        assertEquals(1, item);
    }

    @Test
    public void testSetLocation() {
        Wall wallObj = new Wall(25);

        wallObj.setLocation(0, 3, 5);

        int item = wallObj.getLocation(0, 3);

        assertEquals(5, item);
    }
}