package Main;

import java.util.Scanner;

public class Game {
	public static void start() {
		Scanner in = new Scanner(System.in);
		try {
			char repeats[] = new char[0];
			GallowDrawing gd = new GallowDrawing();
			Dictionary dict = new Dictionary();
			dict.makeDictionary();
			int trys = 5;
			int wordNumber = (int) (Math.random() * 80);
			String word = dict.words[wordNumber];
			char mask[] = new char[word.length()];
			for(int i = 0; i < word.length(); ++i) mask[i] = '*'; 
			System.out.print(mask);
			while(trys > 0) {
				System.out.print('\n' + "Введите букву: ");
				char letter = in.next().charAt(0);
				if((int)letter - 1072 < 0) letter = (char)((int)letter + 32);
				if(word.contains("" + letter)) {
					for(int i = 0; i < word.length(); ++i) {
						if(word.charAt(i) == letter) mask[i] = letter;
					}
				}
				else if(new String(repeats).contains("" + letter)) {
					System.out.println("Буква '" + letter + "' уже была выбрана. " 
										+ "Будьте внимательнее!");
				}
				else if((int)letter < 1040 | (int)letter > 1103) {
					System.out.print("Некорректный ввод. Необходимо ввести букву!");
				}
				else {
					trys-=1;
					System.out.println("Такой буквы в слове нет!");
					repeats = append(repeats, letter);
					switch(trys) {
						case (4):
							gd.stage0();
							break;
						case (3):
							gd.stage1();
							break;
						case (2):
							gd.stage2();
							break;
						case (1):
							gd.stage3();
							break;
						case (0):
							gd.stage4();
							break;
						default:
							break;
					}
					
				}
				System.out.println('\n' + "Осталось попыток: " + trys);
				System.out.println(mask);
				if(trys == 0) System.out.println("Игра окончилась поражением!");
				if(!(new String(mask).contains("*"))) {
					System.out.println("Игра окончена. Вы победили!");
					trys = 0;
				}
			}
		} finally {
			if(!(in.hasNextLine())) in.close();
		}
	}
	private static char[] append(char array[], char ch) {
		char newArray[] = new char[array.length+1];
		for(int i = 0; i < array.length; ++i) newArray[i] = array[i];
		newArray[array.length] = ch;
		return newArray;
	}
}
