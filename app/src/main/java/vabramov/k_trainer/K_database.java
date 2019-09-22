package vabramov.k_trainer;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.support.annotation.NonNull;


@Database(entities = {K_vocab.class}, version = 1, exportSchema = false)
public abstract class K_database extends RoomDatabase {
    public abstract K_DAO K_DAO();

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {

        }
    };
}
