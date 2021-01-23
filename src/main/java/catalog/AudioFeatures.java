package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        this.length = length;
        this.title = title;
        this.performers = performers;

    }

    public List<String> getContributors() {

        List<String> contributors = new ArrayList<>();

        for (String composer : composer) {
            contributors.add(composer);
        }
        for (String performer : performers) {
            contributors.add(performer);
        }

        return contributors;
    }

    public int getLength() {

        return length;
    }
    public String getTitle() {

        return title;
    }

}
