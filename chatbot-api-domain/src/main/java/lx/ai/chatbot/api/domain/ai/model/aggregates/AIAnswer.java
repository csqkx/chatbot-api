package lx.ai.chatbot.api.domain.ai.model.aggregates;

import lx.ai.chatbot.api.domain.ai.model.vo.Choices;
import lx.ai.chatbot.api.domain.ai.model.vo.Usage;

import java.util.List;

public class AIAnswer
{
    private String id;

    private String object;

    private int created;

    private String model;

    private List<Choices> choices;

    private Usage usage;

    private String system_fingerprint;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setObject(String object){
        this.object = object;
    }
    public String getObject(){
        return this.object;
    }
    public void setCreated(int created){
        this.created = created;
    }
    public int getCreated(){
        return this.created;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setChoices(List<Choices> choices){
        this.choices = choices;
    }
    public List<Choices> getChoices(){
        return this.choices;
    }
    public void setUsage(Usage usage){
        this.usage = usage;
    }
    public Usage getUsage(){
        return this.usage;
    }
    public void setSystem_fingerprint(String system_fingerprint){
        this.system_fingerprint = system_fingerprint;
    }
    public String getSystem_fingerprint(){
        return this.system_fingerprint;
    }
}