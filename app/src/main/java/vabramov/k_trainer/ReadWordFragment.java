package vabramov.k_trainer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadWordFragment extends Fragment {
    private TextView TxtInfo;

    public ReadWordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_word, container, false);
        TxtInfo=view.findViewById(R.id.txt_display_info);

        List<K_vocab> words = Database.myAppDatabase.K_DAO().getWords();

        String info="";

        for (K_vocab word : words)
        {
            int id = word.getId();
            String kword=word.getKword();
            String trans=word.getTrans();
            info = info+"\n\n"+"ID :"+id+"\n Word :"+kword+"\n Translate :"+trans;


        }

        TxtInfo.setText(info);
        return view;
    }

}
