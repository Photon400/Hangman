package Main;

public class GallowDrawing {
	public void stage0() {
		for(int i = 0; i < 6; ++i) System.out.println('|');
		System.out.println("=========");
	}
	public void stage1() {
		System.out.println("+------+");
		for(int i = 0; i < 6; ++i) System.out.println('|');
		System.out.println("=========");
	}
	public void stage2() {
		System.out.println("+------+"+'\n'+"|      |");
		System.out.println("|      o");
		for(int i = 0; i < 4; ++i) System.out.println('|');
		System.out.println("=========");
	}
	public void stage3() {
		System.out.println("+------+"+'\n'+"|      |");
		System.out.println("|      o");
		System.out.println("|     /0\\");
		for(int i = 0; i < 3; ++i) System.out.println('|');
		System.out.println("=========");
	}
	public void stage4() {
		System.out.println("+------+"+'\n'+"|      |");
		System.out.println("| D    o");
		System.out.println("| E   /0\\");
		System.out.println("| A    П");
		System.out.println("| T");
		System.out.println("| H!");
		System.out.println("=========");
	}
	
}
