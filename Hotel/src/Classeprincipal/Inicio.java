package Classeprincipal;

	import java.util.Scanner;

	import Objetos.Quartos;
	import Objetos.Reserva;
	import Objetos.Hospede;

	public class Inicio {

		private static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			menu();

		}
		
		public static void menu() {
			Integer resp =0;
			
			while(resp != 9){
			System.out.println("menu principal \n");
			System.out.println(
					  "1 - Cadastro de Quarto \n"
					+ "2 - Verificar Quartos \n"
					+ "3 - Check-in \n"
					+ "4 - check-out \n"
					+ "5 - Reservar quarto \n"
					+ "6 - Cadastrar usuario \n"
					+ "7 - Visualizar usuario \n"
					+ "8 - Indisponivel por periodo \n"
					+ "9 - fechar");
			resp = scan.nextInt();
			if(resp == 1) {
				Quartos.cadastroQuartos();
			} else if(resp == 2) {
				Quartos.visualizaQuarto();
			} else if(resp == 3) {
				Quartos.checkInPegaCod();
			} else if(resp == 4) {
				Quartos.checkOutPegaCod();
			} else if(resp == 5) {
				Reserva.reserva();
			} else if(resp == 6) {
				Hospede.cadastroCliente();
			} else if(resp == 7) {
				Hospede.passarCodCliente();
			} else if(resp == 8) {
				Reserva.ocupacao();
			}else {
				resp =9;
			}
			
		}
			
			
		}

	}


