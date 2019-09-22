package vabramov.k_trainer;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface K_DAO {

    @Insert
     void addWord(K_vocab word);

    @Query("select * from vocabulary")
      List<K_vocab> getWords();

    @Delete
     void deleteWord(K_vocab word);

    @Update
     void updateWord(K_vocab word);

    @Query("SELECT korean_word FROM vocabulary WHERE id = :id")
     String getKorean_word(int id);

    @Query("SELECT translate FROM vocabulary WHERE id = :id")
     String getTrans_word(int id);
}
