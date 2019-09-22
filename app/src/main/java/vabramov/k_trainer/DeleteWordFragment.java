package vabramov.k_trainer;


import androidx.room.Delete;
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
public class DeleteWordFragment extends Fragment {
    private EditText TxtWordId;
    private Button  DeleteWord;


    public DeleteWordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_word, container, false);
        TxtWordId=view.findViewById(R.id.txt_word_id);
        DeleteWord=view.findViewById(R.id.delete);

        DeleteWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = Integer.parseInt(TxtWordId.getText().toString());
                K_vocab word = new K_vocab();
                word.setId(id);
                Startpage.myAppDatabase.K_DAO().deleteWord(word);

                Toast.makeText(getActivity(),"Word successfully removed..",Toast.LENGTH_SHORT).show();
                TxtWordId.setText("");

            }
        });
        return view;
    }

}
