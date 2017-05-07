package eu.company.perla.chatappexecom.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import eu.company.perla.chatappexecom.dao.ConversationDao;
import eu.company.perla.chatappexecom.model.Conversation;
import eu.company.perla.chatappexecom.view.ConversationItemView;
import eu.company.perla.chatappexecom.view.ConversationItemView_;

/**
 * Created by Perla on 7.5.2017.
 */

@EBean
public class ConversationAdapter extends BaseAdapter {
    private List<Conversation> conversations = new ArrayList<>();


    @RootContext
    Context context;

    @Bean
    ConversationDao conversationDao;

    @AfterInject
    void init() {
        setConversations(conversationDao.getConversations());
    }

    @Override
    public int getCount() {
        return conversations.size();
    }

    @Override
    public Conversation getItem(int position) {
        return conversations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ConversationItemView conversationItemView;
        if (convertView == null) {
            conversationItemView = ConversationItemView_.build(context);
        } else {
            conversationItemView = (ConversationItemView) convertView;
        }

        conversationItemView.bind(getItem(position));

        return conversationItemView;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        notifyDataSetChanged();
    }
}
