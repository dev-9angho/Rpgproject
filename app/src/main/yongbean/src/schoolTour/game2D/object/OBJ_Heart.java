package schoolTour.game2D.object;

import schoolTour.game2D.main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Heart extends SuperObject{

    GamePanel gamePanel;

    public OBJ_Heart(GamePanel gamePanel) {
        this.gamePanel = gamePanel;

        name = "Heart";

        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/heart_full.png")));
            utilityTool.scaleImage(image, gamePanel.tileSize, gamePanel.tileSize);
            image2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/heart_half.png")));
            utilityTool.scaleImage(image2, gamePanel.tileSize, gamePanel.tileSize);
            image3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/heart_blank.png")));
            utilityTool.scaleImage(image3, gamePanel.tileSize, gamePanel.tileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}
