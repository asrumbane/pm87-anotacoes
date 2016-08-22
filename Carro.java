public class Carro{
	
	//Criando Variaveis locais(atributos)
	int numero;
	String dono;
	double saldo;
	double limite;

	//Criando os Metodos
	boolean deposita(double valor){
		if(valor>0){
			return true;
			this.saldo = this.saldo + valor;

		} else {
			System.out.printl("Nao eh possivel efectuar este deposito!!!");
		}
	}
	boolean deposita(double valor){
        	if(this.saldo >valor){
			return true;
                       	this.saldo = this.saldo - valor;
	        } else {
	                System.out.printl("Nao eh possivel efectuar este levantamento!!!");
		  }
															        }
	}	
