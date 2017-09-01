package org.achillesfx.core.example;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.achillesfx.core.app.activity.BaseActivity;

/**
 * @description
 * @create 2017-09-01 下午11:52
 * @email spartajet.guo@gmail.com
 */
public class SimpleBaseActivity extends BaseActivity {
    private Button button1;
    private TextField text1;

    @Override
    public void onCreate() {
        setContentView("/view/SimpleExample.fxml", null, null);
        this.initViews();
    }

    private void initViews() {
        button1 = (Button) findViewById("button1");
        text1 = (TextField) findViewById("text1");
        button1.setOnAction(event -> text1.setText("clicked!"));
    }
}
