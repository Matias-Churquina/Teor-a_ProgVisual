package ar.edu.unju.fi.alumno;

	public class Materia {
		private Integer codigo;
		private String nombre;

		public Materia() {
			// TODO Auto-generated constructor stub
		}

		public Materia(Integer codigo, String nombre) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
		}

		
		
		@Override
		public String toString() {
			return "Materia [codigo=" + codigo + ", nombre=" + nombre + "]";
		}

		public Integer getCodigo() {
			return codigo;
		}

		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
	}
