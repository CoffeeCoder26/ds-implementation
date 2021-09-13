/*
* Implement stack using array
* Karim Abo Agiza
*
* */

public class StackUsingArray {
	static final int MaxSize = 1000;
	int TopOfStack;
	int [] array = new int [MaxSize];

	StackUsingArray(){
		TopOfStack = -1;
	}
	/*
	* Check if the stack is empty or not
	* */

	boolean isEmpty(){
		// return (TopOfStack < 0)
		if(TopOfStack < 0){
			return  true;
		}
		return false;
	}
	/*
	* Adding items to stack
	* */
	int PushItems(int value){
		if(TopOfStack >=(MaxSize -1)){
			System.out.println("Stack is Overflow");
			return 0;
		}
		else{
			array[++TopOfStack] = value;
			System.out.println(value + " is pushed to top of stack");
			return 1;
		}
	}
	/*
	* Deleting items from stack
	*
	* */
	int PopItems(){
		if (TopOfStack < 0){
			System.out.println("Stack is underflow");
			return 0;
		}else {
			return array[TopOfStack--];
		}
	}

	/*
	* return the top of stack
	* */

	int getTopOfStack(){
		if (TopOfStack < 0){
			System.out.println("Stack is underflow");
			return 0;
		}else {
			return array[TopOfStack];
		}
	}
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		System.out.println(s.isEmpty());
		s.PushItems(100);
		s.PushItems(40);
		s.PushItems(60);
		s.PushItems(90);
		System.out.println(s.isEmpty());
		System.out.println(s.PopItems() + " Is poped from stack");
		System.out.println(s.getTopOfStack());


	}
}
