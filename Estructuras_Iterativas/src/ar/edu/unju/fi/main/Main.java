package ar.edu.unju.fi.main;

import java.util.Scanner; 

import ar.edu.unju.fi.alumno.Alumno;

import ar.edu.unju.fi.alumno.Materia;

import ar.edu.unju.fi.alumno.Registro_Notas;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese legajo del alumno: ");
		Integer legajo = sc.nextInt();
		System.out.println("Ingrese nombre del alumno: ");
		String nombre = sc.next();
		System.out.println("Ingrese apellido del alumno: ");
		String apellido = sc.next();
		
		/*System.out.println(legajo);
		System.out.println(nombre);
		System.out.println(apellido);
		*/
		alumno.setLegajo(legajo);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		
		System.out.println(alumno.toString());
		
		int numMat = 1;
		while (numMat <= 4) {
			System.out.println("Ingrese código de la materia:");
			int codigoMat = sc.nextInt();
			System.out.println("Ingrese nombre de la materia:");
			String nombreMat = sc.next();
			
			Materia materia = new Materia(codigoMat, nombreMat);
			
			System.out.println("Ingrese código de registro:");
			int codigoReg = sc.nextInt();
			System.out.println("Ingrese nota final del alumno:");
			Float nota = sc.nextFloat();
			
			Registro_Notas registro = new Registro_Notas(codigoReg, materia, alumno, nota);
			
			System.out.println(registro.toString());
		}
	}
	

}
