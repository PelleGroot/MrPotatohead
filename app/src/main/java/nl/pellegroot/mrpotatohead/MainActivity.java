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
        if (savedInstanceState != null) {
            boolean boolArms = savedInstanceState.getBoolean("ARMS");
            boolean boolEars = savedInstanceState.getBoolean("EARS");
            boolean boolEyebrows = savedInstanceState.getBoolean("EYEBROWS");
            boolean boolEyes = savedInstanceState.getBoolean("EYES");
            boolean boolGlasses = savedInstanceState.getBoolean("GLASSES");
            boolean boolHat = savedInstanceState.getBoolean("HAT");
            boolean boolMouth = savedInstanceState.getBoolean("MOUTH");
            boolean boolMoustache = savedInstanceState.getBoolean("MOUSTACHE");
            boolean boolNose = savedInstanceState.getBoolean("NOSE");
            boolean boolShoes = savedInstanceState.getBoolean("SHOES");

            ImageView arms = (ImageView) findViewById(R.id.arms);
            ImageView ears = (ImageView) findViewById(R.id.ears);
            ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
            ImageView eyes = (ImageView) findViewById(R.id.eyes);
            ImageView glasses = (ImageView) findViewById(R.id.glasses);
            ImageView hat = (ImageView) findViewById(R.id.hat);
            ImageView mouth = (ImageView) findViewById(R.id.mouth);
            ImageView moustache = (ImageView) findViewById(R.id.moustache);
            ImageView nose = (ImageView) findViewById(R.id.nose);
            ImageView shoes = (ImageView) findViewById(R.id.shoes);

            if (boolArms) {
                arms.setVisibility(View.VISIBLE);
            }if (boolEars) {
                ears.setVisibility(View.VISIBLE);
            }if (boolEyebrows) {
                eyebrows.setVisibility(View.VISIBLE);
            }if (boolEyes) {
                eyes.setVisibility(View.VISIBLE);
            }if (boolGlasses) {
                glasses.setVisibility(View.VISIBLE);
            }if (boolHat) {
                hat.setVisibility(View.VISIBLE);
            }if (boolMouth) {
                mouth.setVisibility(View.VISIBLE);
            }if (boolMoustache) {
                moustache.setVisibility(View.VISIBLE);
            }if (boolNose) {
                nose.setVisibility(View.VISIBLE);
            }if (boolShoes) {
                shoes.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        CheckBox checkArms = (CheckBox) findViewById(R.id.checkArms);
        CheckBox checkEars = (CheckBox) findViewById(R.id.checkEars);
        CheckBox checkEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        CheckBox checkEyes = (CheckBox) findViewById(R.id.checkEyes);
        CheckBox checkGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        CheckBox checkHat = (CheckBox) findViewById(R.id.checkHat);
        CheckBox checkMouth = (CheckBox) findViewById(R.id.checkMouth);
        CheckBox checkMoustache = (CheckBox) findViewById(R.id.checkMoustache);
        CheckBox checkNose = (CheckBox) findViewById(R.id.checkNose);
        CheckBox checkShoes = (CheckBox) findViewById(R.id.checkShoes);

        outState.putBoolean("ARMS",checkArms.isChecked());
        outState.putBoolean("EARS",checkEars.isChecked());
        outState.putBoolean("EYEBROWS",checkEyebrows.isChecked());
        outState.putBoolean("EYES",checkEyes.isChecked());
        outState.putBoolean("GLASSES",checkGlasses.isChecked());
        outState.putBoolean("HAT",checkHat.isChecked());
        outState.putBoolean("MOUTH",checkMouth.isChecked());
        outState.putBoolean("MOUSTACHE",checkMoustache.isChecked());
        outState.putBoolean("NOSE",checkNose.isChecked());
        outState.putBoolean("SHOES",checkShoes.isChecked());
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