package ArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] date = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList(){}
    public MyList( int capacity)
    {
        E[] date = (E[]) new Object[capacity];

    }
    public void add(int index, E e)
    {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--)
        {
            date[i + 1] = date[i];
        }
        date[index] = e;
        size++;
    }
    public E remove(int index)
    {
        if (index < 0 || index > date.length)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            E e = date[index];
            for (int i = index; i < size - 1; i++)
            {
                date[i] = date[i + 1];
            }
            date[size - 1] = null;
            size--;
            return e;
        }
    }
    public int getSize()
    {
        return this.size;
    }
    public E[] clone()
    {
        E[] date2 = (E[])date.clone();
        return date2;
    }
    public boolean contains(E e)
    {
        for (int i = 0; i < size; i++)
        {
            if (e.equals(date[i])) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e)
    {
        for (int i = 0; i < size; i++)
        {
            if (e.equals(date[i]))
            {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e)
    {
        ensureCapacity();
        date[size + 1] = e;
        return true;
    }
    private void ensureCapacity()
    {
        if (size >= date.length)
        {
            E[] newDate = (E[]) new Object[size * 2 + 1];
            System.arraycopy(date, 0, newDate,0,size);
            date = newDate;
        }
    }
    public E get(int index)
    {
        return date[index];
    }
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++)
        {
            result.append(date[i]);
            if ( i < size - 1 )
            {
                result.append(",");
            }
        }
        return result.toString() + "]";
    }
    
}
