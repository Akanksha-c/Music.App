package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;


public class Main2Activity extends AppCompatActivity {

    MediaPlayer player;
    int s= getIntent().getIntExtra("key",0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //b1=(Button)findViewById(R.id.Button3);
        //b2=(Button)findViewById(R.id.Button2);
    }

    public void play(View v)
    {
        int s= getIntent().getIntExtra("key",0);
        if(player==null)
        {
            switch(s)
            {
                case 0: player=MediaPlayer.create(this,R.raw.glu);
                    break;
                case 1: player=MediaPlayer.create(this,R.raw.havana);
                     break;
                case 2: player=MediaPlayer.create(this,R.raw.idc);
                    break;
                case 3: player=MediaPlayer.create(this,R.raw.memories);
                    break;
                case 4: player=MediaPlayer.create(this,R.raw.night_changes);
                    break;
                case 5: player=MediaPlayer.create(this,R.raw.oca);
                    break;
                case 6: player=MediaPlayer.create(this,R.raw.otr);
                    break;
                case 7: player=MediaPlayer.create(this,R.raw.perfect);
                    break;
                case 8: player=MediaPlayer.create(this,R.raw.sou);
                    break;
                case 9: player=MediaPlayer.create(this,R.raw.senorita);
                    break;
                case 10: player=MediaPlayer.create(this,R.raw.soml);
                    break;
                case 11: player=MediaPlayer.create(this,R.raw.yntcd);
                    break;
                case 12:player=MediaPlayer.create(this,R.raw.photograph);
                        break;
                case 13:player=MediaPlayer.create(this,R.raw.faded);
                    break;
                case 14:player=MediaPlayer.create(this,R.raw.rockabye);
                    break;
                case 15:player=MediaPlayer.create(this,R.raw.lover);
                    break;
                case 16:player=MediaPlayer.create(this,R.raw.ntltc);
                    break;
                case 17:player=MediaPlayer.create(this,R.raw.awnw);
                    break;
                case 18:player=MediaPlayer.create(this,R.raw.sucker);
                    break;
                case 19:player=MediaPlayer.create(this,R.raw.closer);
                    break;
                        default:break;
            }

            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }


    public void pause(View v)
    {
        if(player!=null) {
            player.pause();
        }
    }
    public void stop(View v)
    {
        stopPlayer();
    }
    private void stopPlayer()
    {
        if(player!=null) {
            player.release();
            player = null;
        }
    }

    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
}
