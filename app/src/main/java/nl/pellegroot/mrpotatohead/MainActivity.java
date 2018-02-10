package nl.pellegroot.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView potato, arms, ears, eyebrows, eyes, glasses, hat, mouth, moustache, nose, shoes;
    public CheckBox checkArms, checkEars, checkEyebrows, checkEyes, checkGlasses, checkHat, checkMouth, checkMoustache, checkNose, checkShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        potato = (ImageView) findViewById(R.id.potato);
        arms = (ImageView) findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);
        moustache = findViewById(R.id.moustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        checkArms = (CheckBox) findViewById(R.id.checkArms);
        checkEars = findViewById(R.id.checkEars);
        checkEyebrows = findViewById(R.id.checkEyebrows);
        checkEyes = findViewById(R.id.checkEyes);
        checkGlasses = findViewById(R.id.checkGlasses);
        checkHat = findViewById(R.id.checkHat);
        checkMouth = findViewById(R.id.checkMouth);
        checkMoustache = findViewById(R.id.checkMoustache);
        checkNose = findViewById(R.id.checkNose);
        checkShoes = findViewById(R.id.checkShoes);

    }

    public void checkClicked(View v){
        Log.d("potato", "checkClicked:");
    }

    public void checkArmsClicked (View view){
        if (checkArms.isChecked())
            arms.setVisibility(View.VISIBLE);
        else
            arms.setVisibility(View.INVISIBLE);
    }

    public void checkEarsClicked (View view){
        if (checkEars.isChecked())
            ears.setVisibility(View.VISIBLE);
        else
            ears.setVisibility(View.INVISIBLE);
    }

    public void checkEyebrowsClicked (View view){
        if (checkEyebrows.isChecked())
            eyebrows.setVisibility(View.VISIBLE);
        else
            eyebrows.setVisibility(View.INVISIBLE);
    }

    public void checkEyesClicked (View view){
        if (checkEyes.isChecked())
            eyes.setVisibility(View.VISIBLE);
        else
            eyes.setVisibility(View.INVISIBLE);
    }

    public void checkGlassesClicked (View view){
        if (checkGlasses.isChecked())
            glasses.setVisibility(View.VISIBLE);
        else
            glasses.setVisibility(View.INVISIBLE);
    }

    public void checkHatClicked (View view){
        if (checkHat.isChecked())
            hat.setVisibility(View.VISIBLE);
        else
            hat.setVisibility(View.INVISIBLE);
    }

    public void checkMouthClicked (View view){
        if (checkMouth.isChecked())
            mouth.setVisibility(View.VISIBLE);
        else
            mouth.setVisibility(View.INVISIBLE);
    }

    public void checkMoustacheClicked (View view){
        if (checkMoustache.isChecked())
            moustache.setVisibility(View.VISIBLE);
        else
            moustache.setVisibility(View.INVISIBLE);
    }

    public void checkNoseClicked (View view){
        if (checkNose.isChecked())
            nose.setVisibility(View.VISIBLE);
        else
            nose.setVisibility(View.INVISIBLE);
    }

    public void checkShoesClicked (View view){
        if (checkShoes.isChecked())
            shoes.setVisibility(View.VISIBLE);
        else
            shoes.setVisibility(View.INVISIBLE);
    }
}
