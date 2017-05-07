package eu.company.perla.chatappexecom.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import eu.company.perla.chatappexecom.R;
import eu.company.perla.chatappexecom.model.Conversation;

/**
 * Created by Perla on 7.5.2017.
 */


@EViewGroup(R.layout.item_view_conversation)
public class ConversationItemView extends LinearLayout {
    @ViewById
    TextView title;

    public ConversationItemView(Context context) {
        super(context);
    }

    public void bind(Conversation conversation) {
        title.setText(conversation.getTitle());
    }
}
