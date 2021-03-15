package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item)
    {
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int over)
    {
        List<CatalogItem> filteredItems = new ArrayList<>();
        int pages = 0;
        int pc = 0;
        for (CatalogItem catalogItem : catalogItems)
        {
            if (catalogItem.numberOfPagesAtOneItem() > over)
            {
                filteredItems.add(catalogItem);
            }
        }
        for (CatalogItem catalogItem : filteredItems)
        {
            pages += catalogItem.numberOfPagesAtOneItem();
            pc++;
        }
        return pages/pc;
    }

    public void deleteItemByRegistrationNumber(String regNum)
    {
        ListIterator<CatalogItem> iter = catalogItems.listIterator();

        while(iter.hasNext())
        {
            if (iter.next().getRegistrationNumber().equals(regNum))
            {
                iter.remove();
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria criteria)
    {
        List<CatalogItem> founds = new ArrayList<>();

        return founds;
    }

    public int getAllPageNumber()
    {
        int pageNumber = 0;

        for (CatalogItem catalogItem : catalogItems)
        {
            pageNumber += catalogItem.numberOfPagesAtOneItem();
        }

        return pageNumber;
    }

    public int getFullLength()
    {
        int length = 0;

        for (CatalogItem catalogItem : catalogItems)
        {
            length += catalogItem.fullLengthAtOneItem();
        }

        return length;
    }

    public List<CatalogItem> getAudioLibraryItems()
    {
        List<CatalogItem> audioLibrary = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems)
        {
            if(catalogItem.hasAudioFeature())
            {
                audioLibrary.add(catalogItem);
            }
        }
        return audioLibrary;
    }

    public List<CatalogItem> getPrintedLibraryItems()
    {
        List<CatalogItem> printedLibrary = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems)
        {
            if(catalogItem.hasPrintedFeature())
            {
                printedLibrary.add(catalogItem);
            }
        }
        return printedLibrary;
    }

}
