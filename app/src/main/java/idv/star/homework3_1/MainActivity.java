package idv.star.homework3_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    private Rectbar rectBar;
    private RelativeLayout relativeLayout;
    private Rectbar.Bluerect bluerect;
    private Rectbar.RedCircle redCircle;
    private Rectbar.BlueCircle blueCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.square:
                break;
            case R.id.sred:

                Rectbar rb=new Rectbar(this,null);
            setContentView(rb);

                break;

            case R.id.sblue:

              Rectbar.Bluerect br=new Rectbar(this,null).new Bluerect(this,null);
               setContentView(br);
                break;
            case R.id.round:
                break;
            case R.id.rred:
                Rectbar.RedCircle rred=new Rectbar(this,null).new RedCircle(this,null);
                setContentView(rred);
                break;
            case R.id.rblue:
                Rectbar.BlueCircle rblue=new Rectbar(this,null).new BlueCircle(this,null);
                setContentView(rblue);
                break;




        }
return true;
    }

}
