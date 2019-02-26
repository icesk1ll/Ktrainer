package vabramov.k_trainer;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;




@Database(entities = {K_vocab.class}, version = 1, exportSchema = false)
public abstract class K_database extends RoomDatabase {
    public abstract K_DAO K_DAO();
}
