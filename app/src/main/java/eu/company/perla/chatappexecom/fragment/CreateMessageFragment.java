package eu.company.perla.chatappexecom.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eu.company.perla.chatappexecom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateMessageFragment extends Fragment {


    public CreateMessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_message, container, false);
    }

}
