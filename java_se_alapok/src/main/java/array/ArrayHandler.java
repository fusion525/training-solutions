package array;

public class ArrayHandler {

        public boolean contains( int[] source, int itemToFind){

            boolean isContains = false;

            for (int i = 0; i < source.length && isContains != true; i++) {
                if (source[i] == itemToFind) {
                    isContains = true;
                }
            }
            return isContains;
        }

        public int find ( int[] source, int itemToFind){

            int index = -1;

            boolean isContains = false;

            for (int i = 0; i < source.length && isContains != false; i++) {
                if (source[i] == itemToFind) {
                    index = i;
                    isContains = true;
                }
            }
            return index;
        }

}
