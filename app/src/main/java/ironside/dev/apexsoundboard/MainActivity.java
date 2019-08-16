package ironside.dev.apexsoundboard;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity {


    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysound1 = MediaPlayer.create(this, R.raw.mozambi);
        mysound2 = MediaPlayer.create(this, R.raw.robobitch);
        mysound3 = MediaPlayer.create(this, R.raw.bambuzu1);

    }

    public void sound1(View view)
    {
        mysound1.start();
    }

    public void sound2(View view)
    {
        mysound2.start();
    }

    public void sound3(View view)
    {
        mysound3.start();
    }
}
