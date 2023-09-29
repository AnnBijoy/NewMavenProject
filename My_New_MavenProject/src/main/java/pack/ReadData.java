package pack;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		Excel e=new Excel();
		String num=e.readData(0, 0);
		System.out.println(num);
		String name=e.readData(0, 1);
		System.out.println(name);
	}

}
