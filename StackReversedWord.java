import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackReversedWord {
	int [] arr;
	int TopOfStack,StackSize;

	StackReversedWord(int sz){
		this.StackSize = sz;
		int [] arr = new int[sz];
		this.TopOfStack = -1;
	}
	boolean isEmpty(){
		if (TopOfStack < 0)
			return true;

	return false;
	}
	boolean isFull(){
		if (TopOfStack == (StackSize-1))
			return true;

	return false;
	}
	public void push(char ch){
		  arr[TopOfStack++]=ch;
	}

	public char pop(){
		return (char) arr[TopOfStack--];
	}
}

class ReservedWord{

	private String Input,Output;

	ReservedWord(String in){
		this.Input = in;
	}

	public String DoReverse(){
		int Size = Input.length();
		StackReversedWord s = new StackReversedWord(5);
		for (int i=0;i<Size;i++){
			char ch = Input.charAt(i);
			s.push(ch);
		}
		Output="";
		while (!s.isEmpty()){
			char ch = (char) s.pop();
			Output+=ch;
		}
		return Output;
	}

}
class Main{
	public static void main(String[] args) throws IOException {
		String Input,Output;
		while (true){
			System.out.println("Enter String: ");
			System.out.flush();
			Input = getString();

			if (Input.equals("")){
					break;
			}
			ReservedWord rw = new ReservedWord(Input);
			Output = rw.DoReverse();
			System.out.println("Reveresed Word " + Output);
		}
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
