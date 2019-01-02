package vabramov.k_trainer;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface K_DAO {

    @Insert
    public void addWord(K_vocab kword);


}
