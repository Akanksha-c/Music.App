package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Main4Activity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //b1=(Button)findViewById(R.id.Button3);
        //b2=(Button)findViewById(R.id.Button2);
    }

    public void play(View v) {
        int s = getIntent().getIntExtra("key", 0);
        if (player == null) {
            switch (s) {
                case 0:
                    player = MediaPlayer.create(this, R.raw.mm);
                    break;
                case 1:
                    player = MediaPlayer.create(this, R.raw.pinga);
                    break;
                case 2:
                    player = MediaPlayer.create(this, R.raw.gile);
                    break;
                case 3:
                    player = MediaPlayer.create(this, R.raw.challa);
                    break;
                case 4:
                    player = MediaPlayer.create(this, R.raw.makhna);
                    break;
                case 5:
                    player = MediaPlayer.create(this, R.raw.tyhm);
                    break;
                case 6:
                    player = MediaPlayer.create(this, R.raw.raabta);
                    break;
                case 7:
                    player = MediaPlayer.create(this, R.raw.baarish);
                    break;
                case 8:
                    player = MediaPlayer.create(this, R.raw.jab);
                    break;
                case 9:
                    player = MediaPlayer.create(this, R.raw.nazm);
                    break;
                case 10:
                    player = MediaPlayer.create(this, R.raw.ddg);
                    break;
                case 11:
                    player = MediaPlayer.create(this, R.raw.sns);
                    break;
                case 12:
                    player = MediaPlayer.create(this, R.raw.ghoomar);
                    break;
                case 13:
                    player = MediaPlayer.create(this, R.raw.tareefan);
                    break;
                case 14:
                    player = MediaPlayer.create(this, R.raw.hawayein);
                    break;
                case 15:
                    player = MediaPlayer.create(this, R.raw.osaathi);
                    break;
                case 16:
                    player = MediaPlayer.create(this, R.raw.jogi);
                    break;
                case 17:
                    player = MediaPlayer.create(this, R.raw.tu_meri);
                    break;
                case 18:
                    player = MediaPlayer.create(this, R.raw.manwa);
                    break;
                case 19:
                    player = MediaPlayer.create(this, R.raw.titli);
                    break;
                case 20:
                    player = MediaPlayer.create(this, R.raw.tu_chahiye);
                    break;
                case 21:
                    player = MediaPlayer.create(this, R.raw.balam);
                    break;
                case 22:
                    player = MediaPlayer.create(this, R.raw.kabira);
                    break;
                case 23:
                    player = MediaPlayer.create(this, R.raw.dekho);
                    break;
                default:
                    break;
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


    public void pause(View v) {
        if (player != null) {
            player.pause();
        }


    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}


