package nl.pellegroot.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView potato, arms, ears, eyebrows, eyes, glasses, hat, mouth, moustache, nose, shoes;
    public CheckBox checkArms, checkEars, checkEyebrows, checkEyes, checkGlasses, checkHat, checkMouth, checkMoustache, checkNose, checkShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        potato = findViewById(R.id.potato);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);
        moustache = findViewById(R.id.moustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        checkArms = findViewById(R.id.checkArms);
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

    public void checkArmsClicked (View view){
        if (arms.isShown())
            arms.setVisibility(View.INVISIBLE);
        else
            arms.setVisibility(View.VISIBLE);
    }

    public void checkEarsClicked (View view){
        if (ears.isShown())
            ears.setVisibility(View.INVISIBLE);
        else
            ears.setVisibility(View.VISIBLE);
    }

    public void checkEyebrowsClicked (View view){
        if (eyebrows.isShown())
            eyebrows.setVisibility(View.INVISIBLE);
        else
            eyebrows.setVisibility(View.VISIBLE);
    }

    public void checkEyesClicked (View view){
        if (eyes.isShown())
            eyes.setVisibility(View.INVISIBLE);
        else
            eyes.setVisibility(View.VISIBLE);
    }

    public void checkGlassesClicked (View view){
        if (glasses.isShown())
            glasses.setVisibility(View.INVISIBLE);
        else
            glasses.setVisibility(View.VISIBLE);
    }

    public void checkHatClicked (View view){
        if (hat.isShown())
            hat.setVisibility(View.INVISIBLE);
        else
            hat.setVisibility(View.VISIBLE);
    }

    public void checkMouthClicked (View view){
        if (mouth.isShown())
            mouth.setVisibility(View.INVISIBLE);
        else
            mouth.setVisibility(View.VISIBLE);
    }

    public void checkMoustacheClicked (View view){
        if (moustache.isShown())
            moustache.setVisibility(View.INVISIBLE);
        else
            moustache.setVisibility(View.VISIBLE);
    }

    public void checkNoseClicked (View view){
        if (nose.isShown())
            nose.setVisibility(View.INVISIBLE);
        else
            nose.setVisibility(View.VISIBLE);
    }

    public void checkShoesClicked (View view){
        if (shoes.isShown())
            shoes.setVisibility(View.INVISIBLE);
        else
            shoes.setVisibility(View.VISIBLE);
    }
}
