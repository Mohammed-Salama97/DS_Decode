public class Array<T> {
    public void Resize(T[] source, Integer newSize) {
        // validations
        if (newSize <= 0) {return;}
        if (newSize == source.length) {return;}
        if (newSize == null) {return;}

        // new array
        T[] newArr = (T[]) new Object[newSize];

        // transferring the data from source array to the new one
        for (int i = 0; i < source.length; i++) {
             newArr[i] = source[i];
        }

        // handling the addressing of the new array
        source = newArr;
    }
}
