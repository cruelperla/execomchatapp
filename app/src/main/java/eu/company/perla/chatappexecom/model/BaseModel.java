package eu.company.perla.chatappexecom.model;

/**
 * Created by Perla on 7.5.2017.
 */

public abstract class BaseModel {
    private String id;

    public BaseModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
