package jp.techacademy.yoshie.sekiguchi.taskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TaskAdapter extends BaseAdapter{

    //他のxmlリソースのViewを取り扱う
    private LayoutInflater mLayoutInflater = null;

    //Taskを保持するlist
    private List<Task> mTaskList;

    public TaskAdapter(Context context) {
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public void setTaskList(List<Task> taskList) {
        mTaskList = taskList;
    }

    //mTaskListの数を返す
    @Override
    public int getCount() {
        return mTaskList.size();
    }

    //mTaskListのdataを返す
    @Override
    public Object getItem(int position) {
        return mTaskList.get(position);
    }

    //mTaskListのIDを返す
    @Override
    public long getItemId(int position) {
        return mTaskList.get(position).getId();
    }

    //Viewを返す
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //convertViewがnullの場合、simple_list_item_2（タイトルとサブタイがあるセル）からViewを取得する
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null);
        }

        TextView textView1 = (TextView) convertView.findViewById(android.R.id.text1);
        TextView textView2 = (TextView) convertView.findViewById(android.R.id.text2);

        //Task classから情報取得
        textView1.setText(mTaskList.get(position).getTitle() + "（" + mTaskList.get(position).getCategory() + "）");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH;mm", Locale.JAPANESE);
        Date date = mTaskList.get(position).getDate();
        textView2.setText(simpleDateFormat.format(date));

        return convertView;
    }
}