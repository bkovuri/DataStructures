package DataStrucutres.LinkedList;

Class LinkedList<T>
{

    T data;
    LinkedList<T> next;

   public T getData()
   {
     return data;
   }

   public LinkedList<T> getNext()
   {
     return next;
   }

   public void setData(T data)
   {
        this.data = data;
   }

   public  void setNext(LinkedList<T> next)
   {
        this.next = next;
   }
}