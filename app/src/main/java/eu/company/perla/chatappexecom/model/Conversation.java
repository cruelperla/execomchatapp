package eu.company.perla.chatappexecom.model;

/**
 * Created by Perla on 7.5.2017.
 */

public class Conversation extends BaseModel {
    private String title;

    public Conversation(String id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Conversation{" +
                "title='" + title + '\'' +
                '}';
    }
}
