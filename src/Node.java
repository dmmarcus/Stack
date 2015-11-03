
public class Node<T> {
	
	private T data = null;
	private Node<T> next = null;
	
	public Node(T obj, Node<T> next){
		
		this.data = obj;
		this.next = next;
	}
	
	public Node(T obj){
		
		this.data = obj;
		this.next = null;
		
	}

	public void set(T object){
		
		this.data = object;
	}
	
	public void setNext(Node<T> node){
		
		this.next = node;
		
	}

	public T get(){
		
		return this.data;
	}
	
	public Node<T> nextNode(){
		
		return next;
	}
}
