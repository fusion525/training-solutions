package catalog;

public class SearchCriteria {

    public String contributor;
    public String title;

    public static SearchCriteria createByBoth(String contributor, String title)
    {

        SearchCriteria searchCriteria = new SearchCriteria(contributor, title);

        return searchCriteria;
    }

    public static SearchCriteria createByContributor(String contributor)
    {
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title)
    {
        return new SearchCriteria(null,title);
    }

    public boolean hasContributor()
    {
        if (this.getContributor() != null)
        {
            return true;
        }
        else return false;
    }

    public boolean hasTitle()
    {
        if (this.getTitle() != null)
        {
            return true;
        }
        else return false;
    }

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
