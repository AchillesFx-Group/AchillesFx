package org.achillesfx.core.app.activity;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import org.achillesfx.core.app.base.AchillesFxScene;
import org.achillesfx.core.app.context.ActivityContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * The type Activity.
 *
 * @description
 * @create 2017 -08-19 下午12:14
 * @email spartajet.guo @gmail.com
 */
public abstract class Activity {
    /**
     * The Logger.
     */
    private Logger logger = LoggerFactory.getLogger(Activity.class);
    /**
     * The Context.
     */
    private ActivityContext context;
    /**
     * The Scene.
     */
    private AchillesFxScene scene;
    /**
     * The Node.
     */
    private Node node;


    /**
     * Instantiates a new Activity.
     *
     * @param context the context
     */
    public Activity(ActivityContext context) {
        this.context = context;
        this.onCreate();
    }

    /**
     * On create.
     */
    public abstract void onCreate();

    /**
     * On start.
     */
    public void onStart() {

    }

    /**
     * On resume.
     */
    public void onResume() {

    }

    /**
     * On pause.
     */
    public void onPause() {

    }

    /**
     * On stop.
     */
    public void onStop() {

    }

    /**
     * On destroy.
     */
    public void onDestroy() {

    }

    /**
     * On restart.
     */
    public void onRestart() {

    }

    /**
     * Sets content view.
     *
     * @param layoutName the layout path
     * @param bundle     the bundle
     * @param stylePaths the style paths
     */
    public void setContentView(String layoutName, ResourceBundle bundle, String... stylePaths) {
        Parent parent = null;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.context.getResource(layoutName));
        loader.setController(this);
        try {
            parent = loader.load();
        } catch (IOException e) {
            logger.error("achilles error", e);
            return;
        }
        this.setContentView(parent, bundle, stylePaths);
    }

    /**
     * Sets content view.
     *
     * @param parent     the parent
     * @param bundle     the bundle
     * @param stylePaths the style paths
     */
    public void setContentView(Parent parent, ResourceBundle bundle, String... stylePaths) {
        this.scene = new AchillesFxScene(parent);

    }

    /**
     * Finalize.
     */
    protected void finalize() {
        this.onDestroy();
    }

    /**
     * Find view by id.
     *
     * @param name the name
     * @return the node
     * @throws Exception the exception
     */
    public Node findViewById(String name) {
        if (this.scene == null) {

            return null;
        }
        return this.scene.lookup("#" + name);
    }

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public AchillesFxScene getScene() {
        return scene;
    }

    /**
     * Gets context.
     *
     * @return the context
     */
    public ActivityContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context the context
     */
    public void setContext(ActivityContext context) {
        this.context = context;
    }
}
