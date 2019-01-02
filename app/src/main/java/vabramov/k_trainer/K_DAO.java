package vabramov.k_trainer;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface K_DAO {

    @Insert
    public void addWord(K_vocab word);

    @Query("select * from vocabulary")
    public List<K_vocab> getWords();

    @Delete
    public void deleteWord(K_vocab word);
}
