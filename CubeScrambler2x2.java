import java.util.Random;

public class CubeScrambler2x2{
	

	int size = 4;
	int numScramble = 15;
	/*
	char[] bottom = {'y', 'y', 'y', 'y'};
	char[] top = {'w', 'w', 'w', 'w'};
	char[] right = {'r', 'r', 'r', 'r'};
	char[] left = {'o', 'o', 'o', 'o'};
	char[] front = {'g', 'g', 'g', 'g'};
	char[] back = {'b', 'b', 'b', 'b'};
	*/
	
	String[] bottom = new String[4];
	String[] top = new String[4];
	String[] right = new String[4];
	String[] left = new String[4];
	String[] front = new String[4];
	String[] back = new String[4];
	
	public CubeScrambler2x2(){
		for(int i = 0; i < size; i++){
			/*
			this.bottom[i] = "y" + String.valueOf(i);
			this.top[i] = "w" + String.valueOf(i);
			this.right[i] = "r" + String.valueOf(i);
			this.left[i] = "o" + String.valueOf(i);
			this.front[i] = "g" + String.valueOf(i);
			this.back[i] = "b" + String.valueOf(i);
			*/
			this.bottom[i] = "y";
			this.top[i] = "w";
			this.right[i] = "r";
			this.left[i] = "o";
			this.front[i] = "g";
			this.back[i] = "b";
		}
		
	}
	
	public void printCube(){
		System.out.print("     ");
		for(int i = 0; i < size; i++){
			if(i != 0 && i%2 == 0){
				System.out.println("");
				System.out.print("     ");
			}
			System.out.print(top[i] + " ");
		}
		System.out.println("");
		for(int i = 0; i < size; i = i + 2){
			if(i != 0 && i%2 == 0){
				System.out.println("");
			}
			System.out.print(left[i] + " ");
			System.out.print(left[i+1] + " ");
			System.out.print(" ");
			System.out.print(front[i] + " ");
			System.out.print(front[i+1] + " ");
			System.out.print(" ");
			System.out.print(right[i] + " ");
			System.out.print(right[i+1] + " ");
			System.out.print(" ");
			System.out.print(back[i] + " ");
			System.out.print(back[i+1] + " ");
			System.out.print(" ");			
		}
		System.out.println("");
		System.out.print("     ");
		for(int i = 0; i < size; i ++){
			if(i != 0 && i%2 == 0){
				System.out.println("");
				System.out.print("     ");
			}
			System.out.print(bottom[i] + " ");
		}
		System.out.println("");
	}
	
	public void rotateR(){
		//System.out.print("R ");
		String temp1 = top[1];
		String temp2 = top[3];
		top[1] = front[1];
		top[3] = front[3];
		front[1] = bottom[1];
		front[3] = bottom[3];
		bottom[1] = back[2];
		bottom[3] = back[0];
		back[0] = temp2;
		back[2] = temp1;
		
		String temp3 = right[0];
		right[0] = right[2];
		right[2] = right[3];
		right[3] = right[1];
		right[1] = temp3;
	}
	
	public void rotateRi(){
		//System.out.print("Ri ");
		String temp1 = top[1];
		String temp2 = top[3];
		top[1] = back[2];
		top[3] = back[0];
		back[0] = bottom[3];
		back[2] = bottom[1];
		bottom[1] = front[1];
		bottom[3] = front[3];
		front[1] = temp1;
		front[3] = temp2;

		String temp3 = right[0];
		right[0] = right[1];
		right[1] = right[3];
		right[3] = right[2];	
		right[2] = temp3;
	}
	
	public void rotateLi(){
		//System.out.print("Li ");
		String temp1 = top[0];
		String temp2 = top[2];
		top[0] = front[0];
		top[2] = front[2];
		front[0] = bottom[0];
		front[2] = bottom[2];
		bottom[0] = back[3];
		bottom[2] = back[1];
		back[1] = temp2;
		back[3] = temp1;
		
		String temp3 = left[0];
		left[0] = left[1];
		left[1] = left[3];
		left[3] = left[2];	
		left[2] = temp3;
	}
	
	public void rotateL(){
		//System.out.print("L ");
		String temp1 = top[0];
		String temp2 = top[2];
		top[0] = back[3];
		top[2] = back[1];
		back[1] = bottom[2];
		back[3] = bottom[0];
		bottom[0] = front[0];
		bottom[2] = front[2];
		front[0] = temp1;
		front[2] = temp2;

		String temp3 = left[0];
		left[0] = left[2];
		left[2] = left[3];
		left[3] = left[1];
		left[1] = temp3;
	}
	
	public void rotateF(){
		//System.out.print("F ");
		String temp1 = top[2];
		String temp2 = top[3];
		top[2] = left[3];
		top[3] = left[1];
		left[1] = bottom[0];
		left[3] = bottom[1];
		bottom[0] = right[2];
		bottom[1] = right[0];
		right[0] = temp1;
		right[2] = temp2;
		
		String temp3 = front[0];
		front[0] = front[2];
		front[2] = front[3];
		front[3] = front[1];
		front[1] = temp3;
	}
	
	public void rotateFi(){
		//System.out.print("Fi ");
		String temp1 = top[2];
		String temp2 = top[3];
		top[2] = right[0];
		top[3] = right[2];
		right[0] = bottom[1];
		right[2] = bottom[0];
		bottom[0] = left[1];
		bottom[1] = left[3];
		left[1] = temp2;
		left[3] = temp1;
		
		String temp3 = front[0];
		front[0] = front[1];
		front[1] = front[3];
		front[3] = front[2];	
		front[2] = temp3;
	}
	
	public void rotateB(){
		//System.out.print("B ");
		String temp1 = top[0];
		String temp2 = top[1];
		top[0] = right[1];
		top[1] = right[3];
		right[1] = bottom[3];
		right[3] = bottom[2];
		bottom[2] = left[0];
		bottom[3] = left[2];
		left[0] = temp2;
		left[2] = temp1;
		
		String temp3 = back[0];
		back[0] = back[2];
		back[2] = back[3];
		back[3] = back[1];
		back[1] = temp3;
	}
	
	public void rotateBi(){
		//System.out.print("Bi ");
		String temp1 = top[0];
		String temp2 = top[1];
		top[0] = left[2];
		top[1] = left[0];
		left[0] = bottom[2];
		left[2] = bottom[3];
		bottom[2] = right[3];
		bottom[3] = right[1];
		right[1] = temp1;
		right[3] = temp2;		
		
		String temp3 = back[0];
		back[0] = back[1];
		back[1] = back[3];
		back[3] = back[2];	
		back[2] = temp3;
	}
	
	public void rotateUi(){
		//System.out.print("Ui ");
		String temp1 = front[0];
		String temp2 = front[1];
		front[0] = left[0];
		front[1] = left[1];
		left[0] = back[0];
		left[1] = back[1];
		back[0] = right[0];
		back[1] = right[1];
		right[0] = temp1;
		right[1] = temp2;
		
		String temp3 = top[0];
		top[0] = top[1];
		top[1] = top[3];
		top[3] = top[2];	
		top[2] = temp3;
	}
	
	public void rotateU(){
		//System.out.print("U ");
		String temp1 = front[0];
		String temp2 = front[1];
		front[0] = right[0];
		front[1] = right[1];
		right[0] = back[0];
		right[1] = back[1];
		back[0] = left[0];
		back[1] = left[1];
		left[0] = temp1;
		left[1] = temp2;
		
		String temp3 = top[0];
		top[0] = top[2];
		top[2] = top[3];
		top[3] = top[1];
		top[1] = temp3;
	}
	
	public void rotateDi(){
		//System.out.print("Di ");
		String temp1 = front[2];
		String temp2 = front[3];
		front[2] = right[2];
		front[3] = right[3];
		right[2] = back[2];
		right[3] = back[3];
		back[2] = left[2];
		back[3] = left[3];
		left[2] = temp1;
		left[3] = temp2;
		
		String temp3 = bottom[0];
		bottom[0] = bottom[1];
		bottom[1] = bottom[3];
		bottom[3] = bottom[2];	
		bottom[2] = temp3;
	}
	
	public void rotateD(){
		//System.out.print("D ");
		String temp1 = front[2];
		String temp2 = front[3];
		front[2] = left[2];
		front[3] = left[3];
		left[2] = back[2];
		left[3] = back[3];
		back[2] = right[2];
		back[3] = right[3];
		right[2] = temp1;
		right[3] = temp2;
		
		String temp3 = bottom[0];
		bottom[0] = bottom[2];
		bottom[2] = bottom[3];
		bottom[3] = bottom[1];
		bottom[1] = temp3;
	}
	
	public void rotate(int i){
		switch (i){
			case 0: rotateU();
					System.out.print("U ");
					break;
			case 1: rotateD();
					System.out.print("D ");
					break;
			case 2: rotateF();
					System.out.print("F ");
					break;
			case 3: rotateB();
					System.out.print("B ");
					break;
			case 4: rotateR();
					System.out.print("R ");
					break;
			case 5: rotateL();
					System.out.print("L ");
					break;
			case 6: rotateU();
					rotateU();
					System.out.print("U2 ");
					break;
			case 7: rotateD();
					rotateD();
					System.out.print("D2 ");
					break;
			case 8: rotateF();
					rotateF();
					System.out.print("F2 ");
					break;
			case 9: rotateB();
					rotateB();
					System.out.print("B2 ");
					break;
			case 10: rotateR();
					rotateR();
					System.out.print("R2 ");
					break;
			case 11: rotateL();
					rotateL();
					System.out.print("L2 ");
					break;
			case 12: rotateUi();
					System.out.print("Ui ");
					break;
			case 13: rotateDi();
					System.out.print("Di ");
					break;
			case 14: rotateFi();
					System.out.print("Fi ");
					break;
			case 15: rotateBi();
					System.out.print("Bi ");
					break;
			case 16: rotateRi();
					System.out.print("Ri ");
					break;
			case 17: rotateLi();
					System.out.print("Li ");
					break;
			case 18: rotateU();
					rotateU();
					System.out.print("U2 ");
					break;
			case 19: rotateD();
					rotateD();
					System.out.print("D2 ");
					break;
			case 20: rotateF();
					rotateF();
					System.out.print("F2 ");
					break;
			case 21: rotateB();
					rotateB();
					System.out.print("B2 ");
					break;
			case 22: rotateR();
					rotateR();
					System.out.print("R2 ");
					break;
			case 23: rotateL();
					rotateL();
					System.out.print("L2 ");
					break;
			default: break;
		}
		//System.out.println();
	}
	
	public void scramble(){
		//"U", "D", "F", "B", "R", "L", 
		//"U2", "D2", "F2", "B2", "R2", "L2"
		//"Ui", "Di", "Fi", "Bi", "Ri", "Li", 
		//"U2i", "D2i", "F2i", "B2i", "R2i", "L2i"
		//  0  1  2  3  4  5  
		//  6  7  8  9 10 11 
		// 12 13 14 15 16 17 
		// 18 19 20 21 22 23 
		Random rand = new Random();
		int prev = -1;
		for(int i = 0; i <= numScramble; i++){
			int n = rand.nextInt(24);
			if(prev == -1){
				prev = n;
				rotate(n);
				//printCube();
				continue;
			}
			//prevent reverse move
			while(n%6 == prev%6){
				n = rand.nextInt(24);
			}
			prev = n;
			rotate(n);
			//printCube();
		}
		System.out.println("");
	}
	
	public static void main(String[] argc){
		CubeScrambler2x2 scrambler = new CubeScrambler2x2();
		scrambler.scramble();
		scrambler.printCube();
	}
}