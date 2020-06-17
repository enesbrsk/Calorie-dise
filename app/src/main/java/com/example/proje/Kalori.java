package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Kalori extends AppCompatActivity {

    RadioButton rErkek,rKadın,rHareketsiz,rBirazHareket,rOldukçaHareket,rOrtaHareket,rSonDereceHareket;
    EditText   k_kilo,k_boy,k_yas;
    TextView  txt_bazal,txt_sabit,txt_kiloverme,txt_kiloal,txt_hızlıkilovermek;
    Button k_hesapla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalori);

        rErkek = (RadioButton) findViewById(R.id.rErkek);
        rKadın = (RadioButton) findViewById(R.id.rKadın);
        rHareketsiz = (RadioButton) findViewById(R.id.rHareketsiz);
        rBirazHareket = (RadioButton) findViewById(R.id.rBirazhareket);
        rOldukçaHareket = (RadioButton) findViewById(R.id.rOldukçaHareket);
        rOrtaHareket = (RadioButton) findViewById(R.id.rOrtahareket);
        rSonDereceHareket = (RadioButton) findViewById(R.id.rSondereceHareket);
        k_boy = (EditText) findViewById(R.id.k_boy);
        k_kilo = (EditText) findViewById(R.id.k_kilo);
        k_yas = (EditText) findViewById(R.id.k_yas);
        txt_bazal =(TextView) findViewById(R.id.txt_bazal);
        k_hesapla =(Button) findViewById(R.id.k_hesapla);
        txt_sabit =(TextView) findViewById(R.id.txt_sabit);
        txt_kiloverme =(TextView) findViewById(R.id.txt_kiloverme);
        txt_kiloal =(TextView) findViewById(R.id.txt_kiloal);
        txt_hızlıkilovermek =(TextView) findViewById(R.id.txt_hızlıkilo);



        k_hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//[9.99 x vücut ağırlığı] + [6.25 x boy (cm)] - [4.92 x yaş ] + 5
                if (rErkek.isChecked()) {
                    double boy = Double.parseDouble(k_boy.getText().toString());
                    double kilo = Float.parseFloat(k_kilo.getText().toString());
                    double yas = Float.parseFloat(k_yas.getText().toString());

                    //float bmh = Float.valueOf((float) ((9.99*kilo)+(6.25*boy)-(4.92*yas)+5));
                    Integer bmh = Integer.valueOf((int) ((9.99*kilo)+(6.25*boy)-(4.92*yas)+5));
                    txt_bazal.setText("Bazal Metabolizma Hızı  =  " + String.valueOf(bmh));
                    if(rHareketsiz.isChecked()){
                        Integer hackers = (int) (bmh * 1.2);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));
                    }
                    if (rBirazHareket.isChecked())
                    {
                        Integer hackers = (int) (bmh * 1.6);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if(rOldukçaHareket.isChecked()){
                        Integer hackers = (int) (bmh*1.8);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if (rOrtaHareket.isChecked()){
                        Integer hackers = (int) (bmh * 2.0);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if (rOldukçaHareket.isChecked()){
                        Integer hackers = (int) (((9.99*kilo)+(6.25*boy)-(4.92*yas)+5)*2.2);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));
                    }

                }

                if (rKadın.isChecked()) {
                    double boy = Double.parseDouble(k_boy.getText().toString());
                    double kilo = Float.parseFloat(k_kilo.getText().toString());
                    double yas = Float.parseFloat(k_yas.getText().toString());

                    //float bmh = Float.valueOf((float) ((9.99*kilo)+(6.25*boy)-(4.92*yas)+5));
                    Integer bmh = Integer.valueOf((int) ((9.99*kilo) + (6.25*boy)  - (4.92*yas) -161));
                    txt_bazal.setText("Bazal Metabolizma Hızı  =  " + String.valueOf(bmh));
                    if(rHareketsiz.isChecked()){
                        Integer hackers = (int) (bmh * 1.2);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));
                    }
                    if (rBirazHareket.isChecked())
                    {
                        Integer hackers = (int) (bmh * 1.6);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if(rOldukçaHareket.isChecked()){
                        Integer hackers = (int) (bmh*1.8);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if (rOrtaHareket.isChecked()){
                        Integer hackers = (int) (bmh * 2.0);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));

                    }
                    if (rOldukçaHareket.isChecked()){
                        Integer hackers = (int) (((9.99*kilo)+(6.25*boy)-(4.92*yas)+5)*2.2);
                        txt_sabit.setText("Kiloyu Sabit Tutmak  =  "+String.valueOf(hackers));
                        txt_kiloverme.setText("Yavaş Kilo Vermek  =  "+String.valueOf(hackers-321));
                        txt_kiloal.setText("Kilo Almak  =  "+String.valueOf(hackers+321));
                        txt_hızlıkilovermek.setText("Hızlı Kilo Vermek  =  "+String.valueOf(hackers-621));
                    }

                }
            }
        });




    }

}