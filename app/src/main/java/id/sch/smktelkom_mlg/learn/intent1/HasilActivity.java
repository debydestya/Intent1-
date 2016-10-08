package id.sch.smktelkom_mlg.learn.intent1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class HasilActivity extends AppCompatActivity
{

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
       if (item.getItemId()==android.R.id.home)
       {
           onBackPressed();
           return true;
       }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


}

