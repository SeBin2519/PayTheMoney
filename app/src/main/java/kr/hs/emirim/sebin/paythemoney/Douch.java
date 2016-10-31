package kr.hs.emirim.sebin.paythemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Douch extends AppCompatActivity implements View.OnClickListener{
    int person,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.douch);

        EditText editPerson = (EditText) findViewById(R.id.edit_person);
        EditText editPrice = (EditText) findViewById(R.id.edit_price);

        person=Integer.parseInt(editPerson.toString());
        price=Integer.parseInt(editPrice.toString());
    }

    @Override
    protected void onResume() { //화면이 보여질 떄마다 실행, 액티비티가 다시 재개될때
        super.onResume();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.but_douch:
                Intent intent =new Intent(this,Douch.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;
            case R.id.but_mol:
                Intent intent1 =new Intent(this,Mol.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;
            case R.id.but_random:
                Intent intent2 =new Intent(this,Random.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                break;
        }
    }
}
