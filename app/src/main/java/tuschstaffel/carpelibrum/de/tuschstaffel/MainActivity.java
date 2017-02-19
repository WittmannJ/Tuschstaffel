package tuschstaffel.carpelibrum.de.tuschstaffel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.KeyEvent;

import java.util.Timer;
import java.util.TimerTask;



public class MainActivity extends AppCompatActivity {

    Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = new Timer();
        t.schedule(new Zeitgeber(), 0, 3 * 1000);


    }

    @Override
    public boolean onKeyDown(int keyCode,
                             KeyEvent event) {
        t.cancel();
        return super.onKeyDown(keyCode, event);
    }
}
