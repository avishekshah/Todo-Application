package com.example.todomvvm.ui.todo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.todomvvm.R;


public class ViewFragment extends Fragment {


TextView viewTitle,viewDescription,viewDate;

    public static Fragment newInstance() {

        return new ViewFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_view, container, false);

        Bundle bundle = getArguments();
        String title = bundle.getString("task_title");
        String description = bundle.getString("task_description");
        String date = bundle.getString("created_at");
        final int taskId = bundle.getInt("task_id");

        viewTitle = view.findViewById(R.id.singleView);
        viewDescription = view.findViewById(R.id.singleViewDescription);
        viewDate = view.findViewById(R.id.date_view);
        viewTitle.setText(title);
        viewDescription.setText(description);
        viewDate.setText(date);


        return view;
    }
}