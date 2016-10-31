package kr.hs.emirim.sebin.paythemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Douch extends AppCompatActivity implements View.OnClickListener{
    int person,price;
    int douchMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.douch);

        EditText editPerson = (EditText) findViewById(R.id.edit_person);
        EditText editPrice = (EditText) findViewById(R.id.edit_price);
        TextView textresult=(TextView)findViewById(R.id.text_result);

        person=Integer.parseInt(editPerson.toString());
        price=Integer.parseInt(editPrice.toString());


        if((douchMoney=price/person)==0) {///남은 돈이 없다면
           // mImageView.setImageResource(R.drawable.);
            Toast.makeText(this," 더치 페이 결과:"+douchMoney+"원을 내주세요~",Toast.LENGTH_LONG).show();
            //TextView에 result설정
            textresult.setText(" * 한 사람 당 "+douchMoney+"원을 내야합니다!");
        }
        else {
        }
    }

    @Override
    protected void onResume() { //화면이 보여질 떄마다 실행, 액티비티가 다시 재개될때
        super.onResume();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onClick(View view) {
        }
    }
}
