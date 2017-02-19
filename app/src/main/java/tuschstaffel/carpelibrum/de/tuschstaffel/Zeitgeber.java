package tuschstaffel.carpelibrum.de.tuschstaffel;

import android.media.MediaPlayer;

import java.util.TimerTask;

/**
 * Created by jackl on 18.02.2017.
 */


    class Zeitgeber extends TimerTask {
        public void run() {
            MediaPlayer mp = new MediaPlayer();
            try{
                mp.setDataSource(
                        "http://www.carpelibrum.de/test/tada.mp3"
                );
                mp.prepare();
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

