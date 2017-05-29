package a67yjh00.com.example.lg.userdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but);
        but.setOnClickListener(this);//버튼이 눌렀는지 안 눌렀는지 검사하는 것 this는 mainactivity 가르키는것
    }
    @Override
    public void onClick(View v) {
        View dlgV=View.inflate(this,R.layout.dialog,null);
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);//getApplicationContext()=this
        dialog.setTitle("Input User Information");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setView(dlgV);
        dialog.setPositiveButton("OK",null);
        dialog.setNegativeButton("Cancel",null);
        dialog.show();
    }
}
