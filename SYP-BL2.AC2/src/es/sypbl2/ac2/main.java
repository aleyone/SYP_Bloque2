package es.sypbl2.ac2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int procesos, s1, s2;
		Scanner teclado = new Scanner(System.in);
		if (args.length == 3) {
			s1 = Integer.parseInt(args[0]);
			s2 = Integer.parseInt(args[1]);
			procesos = Integer.parseInt(args[2]);
		} else {
			System.out.print("Introduce valor 1: ");
			s1 = teclado.nextInt();
			System.out.print("Introduce valor 2: ");
			s2 = teclado.nextInt();
			System.out.print("¿En cuántos procesos quieres realizarlo? ");
			procesos = teclado.nextInt();
		}

		String clase = "es.sypbl2.ac1.Actividad1";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classPath = System.getProperty("java.class.path");
		String className = clase;

		List<String> command = new ArrayList<>();
		command.add(javaBin);
		command.add("-cp");
		command.add(classPath);
		command.add(className);
		command.add(String.valueOf(s1));
		command.add(String.valueOf(s2));
		command.add(String.valueOf(procesos));
		System.out.println("Comando que se pasa a ProcessBuilder: " + command);
		System.out.println("Comando para ejecutar en cmd: " + command.toString().replace(",", ""));

		ProcessBuilder builder = new ProcessBuilder(command);
		try {
			builder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		teclado.close();

	}

}
