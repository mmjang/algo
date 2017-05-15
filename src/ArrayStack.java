import java.util.NoSuchElementException;
/**
 * Created by Maple on 2017/5/12.
 */
public class ArrayStack{
    private String[] mArray;
    private int mSize; //the real size of the stack
    public ArrayStack(){
        mArray = new String[2];
        mSize = 0;
    }

    public void push(String item){
        if(mSize < mArray.length){
            mArray[mSize] = item;
            mSize ++;
        }
        else{
            mArray = expand(mArray);
            mArray[mSize] = item;
            mSize ++;
        }

    }

    public String pop(){
        if(mSize == 0){
            throw new NoSuchElementException();
        }
        mSize --;
        return mArray[mSize];
    }

    private String[] expand(String[] arr){
        String[] newArr = new String[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }
}
