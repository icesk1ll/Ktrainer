package vabramov.k_trainer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddWordFragment extends Fragment {
    private EditText Word_id,Word_word,Word_trans;
    private Button BtnSave;


    public AddWordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_word, container, false);

        Word_id=view.findViewById(R.id.txt_word_id);
        Word_word= view.findViewById(R.id.txt_word_word);
        Word_trans= view.findViewById(R.id.txt_word_russian);
        BtnSave= view.findViewById(R.id.bn_save_word);

        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int word_id= Integer.parseInt(Word_id.getText().toString());
                String word_word=Word_word.getText().toString();
                String word_trans=Word_trans.getText().toString();

                K_vocab word = new K_vocab();
                word.setId(word_id);
                word.setKword(word_word);
                word.setTrans(word_trans);

                Database.myAppDatabase.K_DAO().addWord(word);
                Toast.makeText(getActivity(),"Word added successfully",Toast.LENGTH_SHORT).show();

                Word_id.setText("");
                Word_word.setText("");
                Word_trans.setText("");

            }
        });
        return view;
    }

}
