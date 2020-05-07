package id.ac.umn.quiz1;

import android.app.Activity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Random ran = new Random();
    int firstNum = ran.nextInt(1000) + 1000;
    int lastNum = ran.nextInt(1000) + 500;

    String plusOrMinus = (firstNum / lastNum > 0 ? "-" : "+");

    int calculation = (firstNum / lastNum > 0 ? firstNum - lastNum : firstNum + lastNum);
  }
}
