package jp.techacademy.yoshie.sekiguchi.taskapp;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Task extends RealmObject implements Serializable {
    //implements Serializable：生成したオブジェクトをシリアライズする
    //Serialize：データを丸ごとファイルに保存したり、TaskAppでいうと別のActivityに渡すことができる

    private String title;
    private String category;
    private String contents;
    private Date date;

    //idをprimary keyとして設定する
    @PrimaryKey
    private int id;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getContents(){
        return contents;
    }

    public void setContents(String contents){
        this.contents = contents;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
