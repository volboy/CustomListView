package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {

    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public StateAdapter(Context context, int resource, List<State> states) {
        super(context, resource, states);
        this.states=states;
        this.layout=resource;
        this.inflater=LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView==null){
            convertView=inflater.inflate(this.layout,parent,false);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder)convertView.getTag();
        }


        ImageView flagView=convertView.findViewById(R.id.flag);
        TextView nameView=convertView.findViewById(R.id.name);
        TextView capital=convertView.findViewById(R.id.capital);

        State state=states.get(position);
        viewHolder.imageView.setImageResource(state.getFlagResource());
        viewHolder.nameView.setText(state.getName());
        viewHolder.capitalView.setText(state.getCapital());

        return convertView;
    }
    private class ViewHolder{
        final ImageView imageView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            imageView=view.findViewById(R.id.flag);
            nameView=view.findViewById(R.id.name);
            capitalView=view.findViewById(R.id.capital);
        }
    }
}
