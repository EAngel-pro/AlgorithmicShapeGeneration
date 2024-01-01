package algorithm;

public class algorithm {

	public static void main(String[] args) {
		char print = '*';
		char sequence = 'a';
		int i = 0;
		int i2 = 0;
		int reverse = 9;
		while (sequence != 'e'){
			i = 0;
			i2 = 0;
			reverse = 9;
			System.out.println("(" + sequence + ")");
			switch (sequence) {
			case 'a':
				while (i < 10) {
					while (i2 < 10) {
						if (i2 <= i) {
							print = '*';
						}
						else {
							print = ' ';
						}
						System.out.print(print);
						i2++;
					}
					System.out.println();
					i2 = 0;
					i++;
				}
			    break;
			case 'b':
				while (i < 10) {
					while (i2 < 10) {
						if (i <= reverse) {
							print = '*';
						}
						else {
							print = ' ';
						}
						System.out.print(print);
						i2++;
						reverse--;
					}
					System.out.println();
					i2 = 0;
					reverse = 9;
					i++;
				}
			    break;
			case 'c':
				while (i < 10) {
					while (i2 < 10) {
						if (i2 >= i) {
							print = '*';
						}
						else {
							print = ' ';
						}
						System.out.print(print);
						i2++;
					}
					System.out.println();
					i2 = 0;
					i++;
				}
			    break;
			case 'd':
				while (i < 10) {
					while (i2 < 10) {
						if (i >= reverse) {
							print = '*';
						}
						else {
							print = ' ';
						}
						System.out.print(print);
						i2++;
						reverse--;
					}
					System.out.println();
					i2 = 0;
					reverse = 9;
					i++;
				}
			    break;
			}
			sequence++;
		}
	}

}
