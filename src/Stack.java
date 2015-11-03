import java.util.NoSuchElementException;
public class Stack<T> {
	
	private LinkedList<T> stack = null;
	
	//Creates an empty stack
	public Stack(){
		
		stack = new LinkedList<T>();
	}
	
	//Primes the stack with one object at the top
	public Stack(T obj){
		
		stack = new LinkedList<T>(obj);
	}
	
	//Add an element to the top of the stack
	public void push(T obj){
		
		stack.push(obj);
	}
	
	/* Returns the top element of the stack off and delete it
	 * and if there are no elements then it throws an exception
	 */
	public T pop(T obj) throws NoSuchElementException{
		if (stack.size() == 0){
			
			throw new NoSuchElementException();
		}
		
		return stack.pop();
	}
	
	/* Returns the top element of the stack off and
	 * and if there are no elements then it throws an exception
	 */
	public T peek() throws NoSuchElementException{
		
		if (stack.size() == 0){
			
			throw new NoSuchElementException();
		}
		
		return stack.peek();
	}
	
	//Checks to see if the stack is empty
	public boolean isEmpty(){
		
		return stack.isEmpty();
	}
	
	//Returns the size of the stack
	public int size(){
		
		return stack.size();
	}
}
