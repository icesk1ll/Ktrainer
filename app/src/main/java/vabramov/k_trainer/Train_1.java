package vabramov.k_trainer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

import static vabramov.k_trainer.Startpage.myAppDatabase;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("UnnecessaryParentheses")
public class Train_1 extends Fragment implements View.OnClickListener{

    private Button but0, but1, but2, but3, but_m;
    private TextView tv;
    private TextView tx3;
    private TextView tx4;
    private TextView textView3;
    private TextView textView4;
    private int stat;
    private int stat1;
    private int count;
    private final ArrayList<Integer> list;
    private final ArrayList<Integer> list1;


    public Train_1() {
        // Required empty public constructor
        list = new ArrayList<>();
        list1 = new ArrayList<>();
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train_1, container, false);
        tv =  view.findViewById(R.id.tv);
        TextView tv2 = view.findViewById(R.id.tv2);
        tx3 =  view.findViewById(R.id.tx3);
        tx4 =  view.findViewById(R.id.tx4);
        textView3 =  view.findViewById(R.id.textView3);
        textView4 =  view.findViewById(R.id.textView4);
        but0 = view.findViewById(R.id.but0);
        but0.setOnClickListener(this);
        but1 = view.findViewById(R.id.but1);
        but1.setOnClickListener(this);
        but2 = view.findViewById(R.id.but2);
        but2.setOnClickListener(this);
        but3 = view.findViewById(R.id.but3);
        but3.setOnClickListener(this);
        but_m = view.findViewById(R.id.but_m);
        but_m.setOnClickListener(this);
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        tv.setText(String.valueOf("Выберите правильный перевод из 4 предложенных. Количество слов - 20"));
        stat=0;
        stat1=0;
        count=21;
        textView3.setVisibility(View.GONE);
        textView4.setVisibility(View.GONE);
        but0.setVisibility(View.GONE);
        but1.setVisibility(View.GONE);
        but2.setVisibility(View.GONE);
        but3.setVisibility(View.GONE);
        return view;


    }
    private void GenerateWord(){

        Collections.shuffle(list1);
        list.clear();
        for (int i=1; i<5; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
       tv.setText(String.valueOf(myAppDatabase.K_DAO().getTrans_word(list.get(0))));
        but0.setText(String.valueOf((myAppDatabase.K_DAO().getKorean_word(list.get(list1.get(0))))));
       but1.setText(String.valueOf((myAppDatabase.K_DAO().getKorean_word(list.get(list1.get(1))))));
       but2.setText(String.valueOf((myAppDatabase.K_DAO().getKorean_word(list.get(list1.get(2))))));
       but3.setText(String.valueOf((myAppDatabase.K_DAO().getKorean_word(list.get(list1.get(3))))));
    }
    private void Counter(){
        tx3.setText(String.valueOf(stat));
        tx4.setText(String.valueOf(stat1));
        count=count-1;
        if (count==0){
            but0.setVisibility(View.GONE);
            but1.setVisibility(View.GONE);
            but2.setVisibility(View.GONE);
            but3.setVisibility(View.GONE);
            tv.setVisibility(View.GONE);
            but_m.setVisibility(View.VISIBLE);
            but_m.setText(String.valueOf("Окончить тренировку"));
        }
    }
    @Override
    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.but_m:
                if (count!=0){
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    but0.setVisibility(View.VISIBLE);
                    but1.setVisibility(View.VISIBLE);
                    but2.setVisibility(View.VISIBLE);
                    but3.setVisibility(View.VISIBLE);
                    but_m.setVisibility(View.GONE);
                    GenerateWord();
                    Counter();
                    break;
                }
                System.exit(0);
            case R.id.but0:
                if(String.valueOf(list.get(0)).equals(String.valueOf(list.get(list1.get(0))))){
                    stat=stat+1;
                }
                else {
                    stat1=stat1+1;
                }
                Counter();
                GenerateWord();
                break;
            case R.id.but1:
                if(String.valueOf(list.get(0)).equals(String.valueOf(list.get(list1.get(1))))){
                    stat=stat+1;
                }
                else {
                    stat1=stat1+1;
                }
                Counter();
                GenerateWord();
                break;
            case R.id.but2:
                if(String.valueOf(list.get(0)).equals(String.valueOf(list.get(list1.get(2))))){
                    stat=stat+1;

                }
                else {
                    stat1=stat1+1;
                }
                Counter();
                GenerateWord();
                break;
            case R.id.but3:
                if(String.valueOf(list.get(0)).equals(String.valueOf(list.get(list1.get(3))))){
                    stat=stat+1;

                }
                else {
                    stat1=stat1+1;
                }
                Counter();
                GenerateWord();
                break;
        }

    }

}
