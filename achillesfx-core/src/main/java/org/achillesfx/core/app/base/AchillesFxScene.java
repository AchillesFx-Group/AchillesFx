package org.achillesfx.core.app.base;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

/**
 * @description
 * @create 2017-09-01 下午11:47
 * @email spartajet.guo@gmail.com
 */
public class AchillesFxScene extends Scene {

    public AchillesFxScene(Parent root) {
        super(root);
    }

    public AchillesFxScene(Parent root, double width, double height) {
        super(root, width, height);
    }

    public AchillesFxScene(Parent root, Paint fill) {
        super(root, fill);
    }

    public AchillesFxScene(Parent root, double width, double height, Paint fill) {
        super(root, width, height, fill);
    }

    public AchillesFxScene(Parent root, double width, double height, boolean depthBuffer) {
        super(root, width, height, depthBuffer);
    }

    public AchillesFxScene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
        super(root, width, height, depthBuffer, antiAliasing);
    }


}
