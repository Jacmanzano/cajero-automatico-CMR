import java.util.Scanner;

public class cajeroAutomatico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] usuarios = {"cmanzano", "root", "admin", "user"};
		String[] contraseñas = {"platano123", "12345", "adn", "dinosaurio"};
		
		System.out.println("- - - BIENVENIDO A EL CAJERO AUTOMATICO - - -");
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrar un usuario nuevo \n");
		System.out.println("Elige una opción: ");
		int opcion = sc.nextInt();
		
		System.out.println();
		
		if(opcion == 1) {
			System.out.println("Introduce el nombre de usuario: ");
			String usuario = sc.next();
			
			System.out.println();
			
			System.out.println("Introduce la contraseña de el usuario " + usuario);
			String contraseña = sc.next();
			
			boolean acceso = comprobarCredenciales(usuarios, contraseñas, usuario, contraseña);
			comprobarAcceso(acceso, usuario);
		} else if (opcion == 2) {
			registrarUsuario();
		} else {
			System.out.println("Solo puedes una de las dos opciones :(");
		}
		sc.close();
	}
	
	public static boolean comprobarCredenciales(String[] usuarios, String[] contraseñas, String usuario, String contraseña) {

		for(int x= 0; x < usuarios.length; x++) {
			if(usuario.equals(usuarios[x]) && contraseña.equals(contraseñas[x])) {
				return true;
			}
		}
		return false;
	}
	
	public static void comprobarAcceso(boolean acceso, String usuario) {
		System.out.println();
		if(acceso) {
			System.out.println("✅ Acceso permitido. Bienvenido, " + usuario + "! :)");
		} else {
			System.out.println("❌ Usuario o contraseñas incorrectos :(");
		}
	}
	
	public static void registrarUsuario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nuevo usuario:");
		String nuevoUsuario = sc.next();
		
		System.out.println();
		
		System .out.println("Introduce la contraseña de el usuario " + nuevoUsuario);
		String nuevaContraseña = sc.next();
		
		System.out.println();
		
		System.out.println("El usuario " + nuevoUsuario + " ha sido registrado correctamente!");
		System.out.println("Recuerda apuntar que la contraseña de el nuevo usuario " + nuevoUsuario + " es " + nuevaContraseña + "!");
		sc.close();
	}
}

//CARLOS MANZANO REGALADO 1ºDAM