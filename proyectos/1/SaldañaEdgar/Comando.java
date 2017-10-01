import java.io.File;

public class Comando {

	//Listar contenido del directorio
	public static void ls() {
		for (int i = 0; i < Sistema.R.nombres_arch.size(); i++) {
			System.out.println(Sistema.R.nombres_arch.get(i)+"\t"+Sistema.R.inodos_arch.get(i).tipo);
		}	
	}

	//Crear directorio
	public static void mkd(String nombre) {
		Sistema.R.entra(nombre,'d');
	}

	//Crear archivo
	public static void mkf(String nombre) {
		Sistema.R.entra(nombre,'f');
	}

	//Abrir archivo
	public static void open() {
	}

	//Entrar a directorio
	public static void enter() {
	}

	//Lista la ayuda
	public static void help() {
		System.out.println("Sección de ayuda");
		System.out.println("COMANDO\t\tDESCRIPCIÓN");
		System.out.println("ls\t\tLista el contenido del directorio donde se ejecuta");
		System.out.println("mkd <nombre>\tCrea un directorio con el nombre especificado");
		System.out.println("enter <nombre>\t Entra al directorio especificado");
		System.out.println("mkf\t\tCrea un archivo");
		System.out.println("open\t\tAbre un archivo");
		System.out.println("super\t\tMuestra la información del superbloque");
		System.out.println("help\t\tMuestra la ayuda del sistema");
	}

	//Lista metadatos del superbloque
	public static void superb() {

		System.out.println("El volumen se llama: "+Sistema.superb.etiqueta_vol);
		System.out.println("El sistema de archivos se llama: "+Sistema.superb.sist_archivos);
		System.out.println("Tamaño del volumen: "+Sistema.superb.tamanio_vol+" bytes");
		System.out.println("Tamaño del bloque: "+Sistema.superb.tamanio_bloque+" bytes");
	}
}