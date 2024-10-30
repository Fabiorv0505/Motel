package Objetos;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;


	public class Hospede {
		private static Scanner scan = new Scanner(System.in);
		private Integer codeg; 
		private String nome;
		private static List<Hospede> clientes = new ArrayList<Hospede>();
		
		public Hospede(Integer cod, String nome) {
			super();
			this.codeg = cod;
			this.nome = nome;
		}
		
		public Integer getCod() {
			return codeg;
		}
		public void setCod(Integer cod) {
			this.codeg = cod;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		
		
		
		public static void cadastroCliente(){
			System.out.println("Informe nome do Cliente");
			String nome = scan.next();
			System.out.println("Informe codigo do cliente");
			Integer codeg = scan.nextInt();
			clientes.add(new Hospede(codeg, nome));
		}
		
		
		
		
		
		public static void passarCodCliente() {
			System.out.println("informe codigo do cliente");
			Integer codeg = scan.nextInt();
			visualizarCliente(codeg);
		}
		
		
		

		public static void visualizarCliente(Integer cod) {
			for (Hospede clientes : clientes) {
	            if(clientes.codeg == cod) {
	            	System.out.println(clientes);
	            	Reserva.visualizarReserva(cod);
	            }
	        }
		}

		
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Hospede [cod=" + codeg + ", nome=" + nome + "]";
		}

		
		
	}


