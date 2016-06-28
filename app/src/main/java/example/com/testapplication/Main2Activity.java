package example.com.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity
{
    ArrayList<Integer> mDeletedPosLst;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        System.out.println("Launcher2 onCreate");

        mDeletedPosLst = new ArrayList<>();

        mDeletedPosLst.add(1);
        mDeletedPosLst.add(3);
        mDeletedPosLst.add(5);
        mDeletedPosLst.add(6);
    }

    @Override
    public void onBackPressed()
    {
        //super.onBackPressed();

        Intent intent=new Intent();
        intent.putExtra("isdeleted",true);
        intent.putExtra("pos",mDeletedPosLst);
        setResult(100,intent);
        finish();
    }
}
