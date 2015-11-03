import java.util.NoSuchElementException;
public class LinkedList<T> {
	
	private Node<T> top = null;
	
	public LinkedList(){};
	
	//Starts the list with one object
	public LinkedList(T obj){
		
		top = new Node<T>(obj, null);
	}
	
	//Adds an element to the top and pushes every other element down one
	public void push(T obj){
		
		top = new Node<T>(obj, top);
	}
	
	//Returns but does not remove the top element
	public T peek() throws NoSuchElementException{
		
		if(top == null){
			
			throw new NoSuchElementException();
		}
		
		return top.get();
	}
	
	//Returns and removes the top element
	public T pop() throws NoSuchElementException{
		
		if(top == null){
			
			throw new NoSuchElementException();
		}
		
		T obj = top.get(); 
		top = top.nextNode();
		return obj;
	}
	
	//Checks to see if the list is empty 
	public boolean isEmpty(){
		
		if(top == null){
			
			return true;
		} else {
			
			return false;
		}
	}
	
	//Adds an element to the end of the list
	public void add(T obj){
		
		Node<T> thing = this.top;
		
		while (thing.nextNode() != null){
			
			thing = thing.nextNode();
		}
		
		thing.setNext(new Node<T>(obj));
	}
	
	//Returns the length of the list
	public int size(){
		
		int count = 0;
		Node<T> obj = this.top;
		
		while(obj != null){
			
			count = count + 1;
			obj = obj.nextNode();
		}
		
		return count;
	}
	
	//Clears the list i.e. makes the top null
	public void clear(){
		
		top = null;
	}
}
