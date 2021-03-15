package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String toTest)
    {

        if (toTest == null)
        {
            return true;
        }
        else if ((toTest.trim()).isEmpty()){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isEmpty(List<?> toTest)
    {
        if (toTest == null)
        {
            return true;
        }
        return toTest.isEmpty();
    }

}
