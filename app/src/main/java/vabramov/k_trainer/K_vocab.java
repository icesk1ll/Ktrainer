package vabramov.k_trainer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vocabulary")
public class K_vocab {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "korean_word")
    private String kword;
    @ColumnInfo(name = "translate")
    private String trans;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     String getKword() {
        return kword;
    }

    public void setKword(String kword) {
        this.kword = kword;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
}
