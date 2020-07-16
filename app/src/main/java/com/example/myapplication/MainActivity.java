package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCan =  (Button)findViewById(R.id.btnCan);
        Button btnInfo =  (Button)findViewById(R.id.btnInfo);
        final EditText editName =  (EditText)findViewById(R.id.editName);
        final EditText editEmail =  (EditText)findViewById(R.id.editEmail);
        final CheckBox cbxCoding =  (CheckBox) findViewById(R.id.cbxCoding);
        final CheckBox cbxreading =  (CheckBox) findViewById(R.id.cbxreading);
        final CheckBox cbxTrave =  (CheckBox) findViewById(R.id.cbxTrave);
        final RadioButton rdnNam =  (RadioButton) findViewById(R.id.rdnNam);
        final RadioButton rdnNu =  (RadioButton) findViewById(R.id.rdnNu);
        final Spinner spinner =  (Spinner) findViewById(R.id.spinner);
        final Switch switch1 =  (Switch) findViewById(R.id.switch1);



        btnCan.setOnClickListener(new View.OnClickListener() {

                                         public void onClick(View v) {
                                             // nội dung thực thi
                                             cancel(v);
                                         }
                                     }
        );
        btnInfo.setOnClickListener(new View.OnClickListener() {
                                       // thực thi phương thức callback onClick
                                       public void onClick(View v) {
                                           // nội dung thực thi
                                           String msg = "My name: " + editName.getText().toString() +
                                                   System.getProperty("line.separator") +
                                                   "Email: " + editEmail.getText().toString();
                                           msg += System.getProperty("line.separator") + "My hobbies: ";
                                           if(cbxCoding.isChecked())
                                               msg +=  cbxCoding.getText().toString()+ ", ";
                                           if(cbxreading.isChecked())
                                               msg += cbxreading.getText().toString() + ", ";
                                           if(cbxTrave.isChecked())
                                               msg += cbxTrave.getText().toString()+ ", ";
                                           msg += System.getProperty("line.separator") + "My Sex: ";
                                           if(rdnNu.isChecked())
                                               msg += rdnNu.getText().toString();
                                           if(rdnNam.isChecked())
                                               msg += rdnNam.getText().toString();
                                           msg += System.getProperty("line.separator") + "My language: " + spinner.getSelectedItem().toString();
                                           msg += System.getProperty("line.separator") + "Do you have experience with Jave frameworks: ";
                                           if(switch1.isChecked())
                                               msg += "Yes";
                                           else
                                               msg += "No";
                                           info(v,msg);
                                           editName.setText("");
                                           editEmail.setText("");
                                           cbxCoding.setChecked(false);
                                           cbxreading.setChecked(false);
                                           cbxTrave.setChecked(false);
                                           rdnNu.setChecked(false);
                                           rdnNam.setChecked(false);
                                       }
                                   }
        );



    }
    public void cancel(View v){
        System.exit(0);
    }
    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("My First App");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
    }
