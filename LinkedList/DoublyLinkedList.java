package DataStrucutres.LinkedList;

Class DoublyLinkedList<T>
{

        T data;
        LinkedList<T> previous;
        LinkedList<T> next;

        public T getData()
        {
            return data;
        }

        public LinkedList<T> getNext()
        {
            return next;
        }

        public LinkedList<T> getPrevious()
        {
            return previous;
        }

        public void setData(T data)
        {
            this.data = data;
        }

        public  void setNext(LinkedList<T> next)
        {
            this.next = next;
        }

        public  void setPrevious(LinkedList<T> previous)
        {
            this.previous = previous;
        }
}