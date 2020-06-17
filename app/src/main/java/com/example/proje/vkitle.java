package com.example.proje;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class vkitle extends AppCompatActivity {

    Button hesapla;
    EditText v_kilo,v_boy,v_yas;
    TextView txt_ikilo,txt_skilo,txt_fkilo;
    RadioButton EradioButton,KradioButton;
    ProgressBar progressBar;
    private int progressDurum = 0;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vkitle);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        EradioButton = (RadioButton) findViewById(R.id.radio_erkek);
        KradioButton = (RadioButton) findViewById(R.id.radio_kadın);
        hesapla=(Button) findViewById(R.id.hesapla);
        v_kilo = (EditText) findViewById(R.id.v_kilo);
        v_boy = (EditText) findViewById(R.id.v_boy);
        v_yas = (EditText) findViewById(R.id.v_yas);
        txt_fkilo = (TextView) findViewById(R.id.txt_fkilo);
        txt_ikilo = (TextView) findViewById(R.id.txt_ikilo);
        txt_skilo = (TextView) findViewById(R.id.txt_skilo);




        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressDurum = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progressDurum<100)
                        {
                            progressDurum +=1;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressDurum);
                                }

                            });
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(InterruptedException e)
                            {
                                e.printStackTrace();
                            }

                        }
                    }
                }).start();



                if(EradioButton.isChecked()) {
                    float boy = Float.parseFloat(v_boy.getText().toString());
                    float ideal = Float.valueOf((float) ((boy - 100)*0.90));
                    float fazla = Float.parseFloat(v_kilo.getText().toString());
                    float fazlakk = Float.valueOf((float) (fazla - ideal));
                    txt_ikilo.setText(String.valueOf(ideal));
                    txt_fkilo.setText(String.valueOf(fazlakk));
                    if (boy >= 147 && boy <= 157) {
                        txt_skilo.setText("41 - 55");
                    } else if (boy >= 158 && boy <= 170) {
                        txt_skilo.setText("48 - 69");
                    } else if (boy > 170 && boy <= 180) {
                        txt_skilo.setText("69 - 78");
                    } else if (boy > 180 && boy <= 195) {
                        txt_skilo.setText("79 - 92");
                    } else {
                        Toast.makeText(getApplicationContext(), "Lütfen geçerli bir aralık giriniz(147-195)", Toast.LENGTH_LONG).show();
                    }
                }
                if (KradioButton.isChecked())
                {
                    float boy = Float.parseFloat(v_boy.getText().toString());
                    float ideal = Float.valueOf((float) ((boy - 100)*0.80));
                    float fazla = Float.parseFloat(v_kilo.getText().toString());
                    float fazlakk = Float.valueOf((float) (fazla - ideal));
                    txt_ikilo.setText(String.valueOf(ideal));
                    txt_fkilo.setText(String.valueOf(fazlakk));
                    if (boy >= 147 && boy <= 157) {
                        txt_skilo.setText("41 - 55");
                    } else if (boy >= 158 && boy <= 170) {
                        txt_skilo.setText("48 - 59");
                    } else if (boy > 170 && boy <= 180) {
                        txt_skilo.setText("60 - 65");
                    } else if (boy > 180 && boy <= 195) {
                        txt_skilo.setText("65 - 70");
                    } else {
                        Toast.makeText(getApplicationContext(), "Lütfen geçerli bir aralık giriniz(147-195)", Toast.LENGTH_LONG).show();
                    }


                }
            }
        });

    }
}
