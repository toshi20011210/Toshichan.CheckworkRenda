package app.takahashi.toshichan.renda2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import app.takahashi.toshichan.renda2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        //スタート押してカウントダウン(10秒)が始まる
        //その10秒内で何回連打できるかというゲームです。
        //カウントダウンが終わり、ゲームが終了したらまた遊べるようにしてください。
        //一度スタートボタンが押されたら、カウントダウンが終わるまで押せないようにしてください。
        //countTextが連打回数を表示し、secondTextが残り時間を表示します。



        // 変数宣言


        //タイマー処理
        val timer: CountDownTimer = object : CountDownTimer(10000,1000){
            //タイマー終わった時の処理
            override fun onFinish() {

            }
            //タイマー刻んだ時の処理
            override fun onTick(millisUntilFinished: Long) {

            }
        }

        //スタートボタンを押した時の処理
        //タイマーは timer.start() で始まるぞ
        binding.startButton.setOnClickListener {

        }

        //TAP!を押した時の処理
        binding.tapButton.setOnClickListener {

        }

    }
}