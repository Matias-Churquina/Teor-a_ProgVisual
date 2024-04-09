package ar.edu.unju.fi.alumno;

public class Registro_Notas {
	private Integer codigo;
	private Materia materia;
	private Alumno alumno;
	private Float notaFinal;
	
	public Registro_Notas() {
		// TODO Auto-generated constructor stub
	}

	public Registro_Notas(Integer codigo, Materia materia, Alumno alumno, Float notaFinal) {
		super();
		this.codigo = codigo;
		this.materia = materia;
		this.alumno = alumno;
		this.notaFinal = notaFinal;
	}

	
	
	@Override
	public String toString() {
		return "Registro_Notas [codigo=" + codigo + ", materia=" + materia + ", alumno=" + alumno + ", notaFinal="
				+ notaFinal + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
