package example.com.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTvNext = (TextView) findViewById(R.id.xTvNext);
        //mTvNext.setText(getString(R.string.app_name));

        System.out.println("Launcher1 onCreate");

        //startActivityForResult(new Intent(this, Main2Activity.class), 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==100 && resultCode==100 && data!=null)
        {
            System.out.println("pos "+data.getExtras().getIntegerArrayList("pos"));


        }
    }
}
