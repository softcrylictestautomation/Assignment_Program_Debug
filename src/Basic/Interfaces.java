package Basic;

interface calc {
	int VAR = 1;

	void calc(int item);

}

interface calculate extends calc {

	int VAR = 0;

	void calc(int item);
}

abstract class display implements calculate {
	int x;

	public void cal(int item) {

		if (item < 2) {
			x = VAR;

			calc(x);
		} else
			x = item * item;
	}

}

// By calling the Cal function Print:- 0 0 4 in console
public class Interfaces extends display {
	public static void main(String args[]) {

	}

	@Override
	public void calc(int item) {
		// TODO Auto-generated method stub

	}
}
