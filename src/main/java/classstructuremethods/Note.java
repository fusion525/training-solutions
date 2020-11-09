package classstructuremethods;

public class Note {
    private String name;
    private String topic;
    private String text;

    public String getName() {
        return name;
    }
    public String getTopic() {
        return topic;
    }
    public String getText() {
        return text;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setTopic(String topic) {
        this.topic = topic;
        return topic;
    }

    public String setText(String text) {
        this.text = text;
        return text;
    }

    public String getNoteText() {
        System.out.println(this.name + ' ' + this.topic + ' ');
        return text;
    }

}
