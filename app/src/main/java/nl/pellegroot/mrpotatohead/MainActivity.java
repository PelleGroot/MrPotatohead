package nl.pellegroot.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt;
    }

    public void checkClicked(View view){
        Log.d("arms", "checkClicked: ");
        CheckBox checkbox = (CheckBox) view;
        String idName = checkbox.getText().toString();

        int resId = getResources().getIdentifier(idName, "id", getPackageName());
        ImageView image = (ImageView) findViewById(resId);

        if (checkbox.isChecked())
            image.setVisibility(view.VISIBLE);
        else
            image.setVisibility(view.INVISIBLE);
    }
}
