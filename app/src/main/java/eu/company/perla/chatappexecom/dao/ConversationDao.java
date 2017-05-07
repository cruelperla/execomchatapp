package eu.company.perla.chatappexecom.dao;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import eu.company.perla.chatappexecom.model.Conversation;

/**
 * Created by Perla on 7.5.2017.
 */

@EBean
public class ConversationDao {
    private List<Conversation> conversations = new ArrayList<>();


    @AfterInject
    void init() {
        for (int i = 0; i < 10; i ++) {
            conversations.add(new Conversation(null, "fun chat" + i));
        }
    }


    public List<Conversation> getConversations() {
        return conversations;
    }
}
