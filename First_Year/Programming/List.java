import java.util.NoSuchElementException;

class ListNode<E>
{ 
    E data; 
    ListNode<E> nextNode;

    // Constructor creates a ListNode that refers to object
    public ListNode(E object) { this(object, null); }

    // Constructor creates a ListNode that refers to the specified object
    //and to the next ListNode
    public ListNode(E object, ListNode<E> node)
    {
        data = object;
        nextNode = node;
    }

    public E getData() { return data; }

    public ListNode<E> getNext() { return nextNode; }
}

class List<E>
{ 
    private ListNode<E> firstNode; 
    private ListNode<E> lastNode;
    private String name;

    // Constructor creates an empty List with â€œlist: as the name
    public List()
    {
        this("list");
    }

    // Constructor creates an empty List with a name
    public List(String listName)
    {
        name = listName;
        firstNode = lastNode = null;
    }

    // insert at front of List
    public void insertAtFront(E insertItem)
    {
        if (isEmpty())
	    firstNode = lastNode = new ListNode<E>(insertItem);
	else
	    // firstNode refers to new node
	    firstNode = new ListNode<E>(insertItem, firstNode);
    }
    
    // insert at end of List
    public void insertAtBack(E insertItem)
    {
        if (isEmpty())
	    firstNode = lastNode = new ListNode<E>(insertItem);
	else
	    // lastNodeâ€™s nextNode refers to new node
	    lastNode =  lastNode.nextNode = new ListNode<E>(insertItem);
    }

    // remove first node from List
    public E removeFromFront() throws NoSuchElementException
    {
        if (isEmpty())
            throw new NoSuchElementException(name + " is empty ");

	E removedItem = firstNode.data;

	if (firstNode == lastNode)
	    firstNode = lastNode = null;
	else
	    firstNode = firstNode.nextNode;

	return removedItem;
    }

    // remove last node from List
    public E removeFromBack() throws NoSuchElementException
    {
        if (isEmpty())
	    throw new NoSuchElementException(name + " is empty ");

	E removedItem = lastNode.data;

	if (firstNode == lastNode)
	    firstNode = lastNode = null;
	else
	{
	    ListNode<E> current = firstNode;

	    while (current.nextNode != lastNode)
	        current = current.nextNode;

	    lastNode = current;
	    current.nextNode = null;    
	}
	
	return removedItem;
    }

    // return true if list is empty
    public boolean isEmpty()
    {
	return firstNode == null;
    }

    // output list contents
    public void print()
    {
	if (isEmpty())
	{
	    System.out.printf("Empty %s%n", name);
	    return;
	}

	System.out.printf("The %s is: ", name);
	ListNode<E> current = firstNode;

	while (current != null)
	{
	    System.out.printf("%s ", current.data);
	    current = current.nextNode;
	}
	
	System.out.println();
    }
}