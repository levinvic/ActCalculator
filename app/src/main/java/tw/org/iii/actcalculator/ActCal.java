package tw.org.iii.actcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ActCal extends Activity {
    String s; //目前顯示
    int sum = 0; //總合
    ArrayList<String> list = new ArrayList<String>();

    //事件方法區
    View.OnClickListener btn1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "1";
                lblcal.setText(s);

            }else{
                lblcal.setText(s+"1");

            }
        }
    };


    View.OnClickListener btn2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "2";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"2");
            }
        }
    };

    View.OnClickListener btnadd_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            s = lblcal.getText().toString();


            if("0".equals(s)){
                if(list.size()>0){
                    list.set(list.size()-1,"+");
                }
            }else{
                list.add(s);
                list.add("+");
                lblcal.setText("0");
            }


            String str="";
            for(int i=0;i<list.size();i++){
                str+=list.get(i);
            }
            tbTmp.setText(str);

        }
    };

    View.OnClickListener btnequal_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //加最後一個進去
            tbTmp.setText(" ");
            s = lblcal.getText().toString();
            if("0".equals(s)){
                list.removeAll(list);
            }else{
            list.add(String.valueOf(s));

            int total = 0; //暫存乘除結果的total
            int j=0;
            int k=0;
            while(j<list.size()){
                if("*".equals(list.get(j))){
                    list.set(j,String.valueOf(Integer.parseInt(list.get(j-1))*Integer.parseInt(list.get(j+1))));
                    list.remove(j+1);
                    list.remove(j-1);
                    j=0;
                }
                if("/".equals(list.get(j))){
                    list.set(j,String.valueOf(Integer.parseInt(list.get(j-1))/Integer.parseInt(list.get(j+1))));
                    list.remove(j+1);
                    list.remove(j-1);
                    j=0;
                }

                if("+".equals(list.get(j))){
                    list.set(j,"0");
                }

                j++;
                total=0;
            }
            while(k<list.size()){
                if("-".equals(list.get(k))){
                    list.set(k,String.valueOf(Integer.parseInt(list.get(k-1))-Integer.parseInt(list.get(k+1))));
                    list.remove(k+1);
                    list.remove(k-1);
                    k=0;
                }
                k++;
                total=0;
            }

            for(int i=0;i<list.size();i++){
                sum += Integer.parseInt(list.get(i));
            }

            lblcal.setText(String.valueOf(sum));

            sum = 0;


            list.removeAll(list);
            }
        }
    };

    View.OnClickListener btnsub_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();

            if("0".equals(s)){
                if(list.size()>0){
                    list.set(list.size()-1,"-");
                }
            }else{
                list.add(s);
                list.add("-");
                lblcal.setText("0");
            }

            //即時算式
            String str="";
            for(int i=0;i<list.size();i++){
                str+=list.get(i);
            }
            tbTmp.setText(str);

        }
    };

    View.OnClickListener btnmul_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                if(list.size()>0){
                    list.set(list.size()-1,"*");
                }
            }else{
                list.add(s);
                list.add("*");
                lblcal.setText("0");
            }

            //即時算式
            String str="";
            for(int i=0;i<list.size();i++){
                str+=list.get(i);
            }
            tbTmp.setText(str);

        }
    };
    View.OnClickListener btndiv_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                if(list.size()>0){
                    list.set(list.size()-1,"/");
                }
            }else {
                list.add(s);
                list.add("/");
                lblcal.setText("0");
            }

            //即時算式
            String str="";
            for(int i=0;i<list.size();i++){
                str+=list.get(i);
            }
            tbTmp.setText(str);

        }
    };


    View.OnClickListener btn3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "3";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"3");
            }
        }
    };

    View.OnClickListener btn4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "4";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"4");
            }
        }
    };
    View.OnClickListener btn5_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "5";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"5");
            }
        }
    };
    View.OnClickListener btn6_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "6";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"6");
            }
        }
    };
    View.OnClickListener btn7_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "7";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"7");
            }
        }
    };
    View.OnClickListener btn8_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "8";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"8");
            }
        }
    };
    View.OnClickListener btn9_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "9";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"9");
            }
        }
    };
    View.OnClickListener btn0_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            if("0".equals(s)){
                s = "0";
                lblcal.setText(s);
            }else{
                lblcal.setText(s+"0");
            }
        }
    };
    private View.OnClickListener btnCE_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblcal.setText("0");
            tbTmp.setText(" ");
            list.removeAll(list);
        }
    };
    private View.OnClickListener btnBack_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            s = lblcal.getText().toString();
            int tmp = Integer.parseInt(s);
            lblcal.setText(String.valueOf(tmp/10));
        }
    };


    //程式進入點
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cal);
        InitialComponent();
    }
    //Initial Component()
    private void InitialComponent(){
        my1=(Button)findViewById(R.id.btn1);
        my1.setOnClickListener(btn1_click);
        my2=(Button)findViewById(R.id.btn2);
        my2.setOnClickListener(btn2_click);
        my3=(Button)findViewById(R.id.btn3);
        my3.setOnClickListener(btn3_click);
        my4=(Button)findViewById(R.id.btn4);
        my4.setOnClickListener(btn4_click);
        my5=(Button)findViewById(R.id.btn5);
        my5.setOnClickListener(btn5_click);
        my6=(Button)findViewById(R.id.btn6);
        my6.setOnClickListener(btn6_click);
        my7=(Button)findViewById(R.id.btn7);
        my7.setOnClickListener(btn7_click);
        my8=(Button)findViewById(R.id.btn8);
        my8.setOnClickListener(btn8_click);
        my9=(Button)findViewById(R.id.btn9);
        my9.setOnClickListener(btn9_click);
        my0=(Button)findViewById(R.id.btn0);
        my0.setOnClickListener(btn0_click);
        myadd=(Button)findViewById(R.id.btnadd);
        myadd.setOnClickListener(btnadd_click);
        mysub=(Button)findViewById(R.id.btnsub);
        mysub.setOnClickListener(btnsub_click);
        mymul=(Button)findViewById(R.id.btnmul);
        mymul.setOnClickListener(btnmul_click);
        mydiv=(Button)findViewById(R.id.btndiv);
        mydiv.setOnClickListener(btndiv_click);
        myequal=(Button)findViewById(R.id.btnequal);
        myequal.setOnClickListener(btnequal_click);
        lblcal = (TextView)findViewById(R.id.lblcal);
        btnCE = (Button)findViewById(R.id.btnCE);
        btnCE.setOnClickListener(btnCE_click);
        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(btnBack_click);
        tbTmp = (TextView)findViewById(R.id.tbTmp);
    }

    Button my1;
    Button my2;
    Button my3;
    Button my4;
    Button my5;
    Button my6;
    Button my7;
    Button my8;
    Button my9;
    Button my0;
    Button myadd;
    Button mysub;
    Button mymul;
    Button mydiv;
    Button myequal;
    TextView lblcal;
    Button btnBack;
    Button btnCE;
    TextView tbTmp;

}
