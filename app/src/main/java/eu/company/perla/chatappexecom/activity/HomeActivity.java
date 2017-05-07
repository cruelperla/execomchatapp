package eu.company.perla.chatappexecom.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import eu.company.perla.chatappexecom.R;
import eu.company.perla.chatappexecom.adapter.ConversationAdapter;
import eu.company.perla.chatappexecom.model.Conversation;

@EActivity(R.layout.activity_home)
public class HomeActivity extends AppCompatActivity {
    @ViewById
    ListView listView;

    @Bean
    ConversationAdapter conversationAdapter;

    @AfterViews
    void init() {
        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            LoginActivity_.intent(this).start();
        }
        listView.setAdapter(conversationAdapter);
    }

    @ItemClick
    void listViewItemClicked(Conversation conversation) { //naziv objekta (listView) + ItemClicked (on click listener)

    }
}
