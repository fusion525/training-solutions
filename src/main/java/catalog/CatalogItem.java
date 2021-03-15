package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem extends Catalog {

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;

        for (int i = 0; i<feature.length; i++ )
        {
            this.features.add(feature[i]);
        }
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;

        for (Feature feature : features)
        {
            if (feature instanceof AudioFeatures)
            {
                fullLength += ((AudioFeatures) feature).getLength();
            }
        }
        return fullLength;
    }

    public List<String> getContributors()
    {
        List<String> contributors = new ArrayList<>();

        for (Feature feature : features)
        {
            List<String> itemContributors = feature.getContributors();

            for (String contributor : itemContributors)
            {
                contributors.add(contributor);
            }
        }

        return contributors;
    }

    public List<String> getTitles()
    {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features)
        {
            titles.add(feature.getTitle());
        }

        return titles;
    }

    public boolean hasAudioFeature()
    {
        boolean hasAudioFeature = false;

        for (Feature feature : features)
        {
            if(feature instanceof AudioFeatures)
            {
                hasAudioFeature = true;
                break;
            }
        }
        return hasAudioFeature;
    }

    public boolean hasPrintedFeature()
    {
        boolean hasPrintedFeature = false;

        for (Feature feature : features)
        {
            if(feature instanceof PrintedFeatures)
            {
                hasPrintedFeature = true;
                break;
            }
        }
        return hasPrintedFeature;
    }

    public int numberOfPagesAtOneItem() {
        int pages = 0;

        for (Feature feature : features)
        {
            if (feature instanceof PrintedFeatures)
            {
                pages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return pages;
    }
    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
