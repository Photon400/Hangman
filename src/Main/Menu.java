package Main;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Начать новую игру [и] или выйти [в]?");
			char select = in.next().charAt(0);
			if((int)select - 1072 < 0) select = (char)((int)select + 32);
			if (select == 'и') {
				Game.start();
			} else if (select == 'в') {
				in.close();
				System.exit(0);
			} else {
				System.out.println("Некорректный ввод. Используйте предложенные команды.");
			}
		}
	}
}