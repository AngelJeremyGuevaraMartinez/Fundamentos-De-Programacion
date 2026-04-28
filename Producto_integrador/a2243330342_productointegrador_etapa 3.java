import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;

public class a2243330342_productointegrador {

    public static String Mostrarmenu(String[] menu) {
        String cadena = "";

        for (int i = 0; i < menu.length; i++) {
            cadena += (i + 1) + ".- " + menu[i] + "\n";
        }
        return cadena;
    }

    public static String Dialogo(String texto) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); 
        String cadena;
        System.out.print(texto + ": ");
        cadena = leer.readLine();
        return cadena;
    }

    public static String DesplegarMenu(String titulo1, String[] menu) throws IOException {
        String cadena;

        cadena = titulo1 + "\n\n";
        cadena += Mostrarmenu(menu);
        cadena += "Seleccione una opción";

        return Dialogo(cadena);
    }
    
    
    // se agrego esta nueva funcion donde se verifica si la cadena es nula o no y se regresa 
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        
        if (cadena != null) {
            cadena = cadena.trim();

            if (cadena.equals("")) {
                cadena = null;
            }
        }
        return cadena;
    }
    
    // en esta funcion se agrego para evaluar si un numero es entero o no y si encuentra un caracter o que no sea un digito retorna false
    public static boolean Esnumeroentero(String dato) {
        if (dato == null || dato.equals("")) {
            return false;
        }
        for (int i = 0; i < dato.length(); i++) {
            char c = dato.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean EsNumeroDouble(String dato) {
        boolean punto = false;
        if (dato == null || dato.equals("")) {
            return false;
        }
        for (int i = 0; i < dato.length(); i++) {
            char c = dato.charAt(i);
            if (Character.isDigit(c)) {
            } else if (c == '.') {
                if (!punto) {
                    punto = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
    
    public static boolean EvaluarNumerico(String dato, int tipo) {

        boolean valido = false;

        if (tipo == 1) {
            if (Esnumeroentero(dato)) {
                valido = true;
            }

        } else if (tipo == 2) {
            if (EsNumeroDouble(dato)) {
                valido = true;
            }
        }

        return valido;
    }
    public static String RellenarEspacios(String dato, int tamano) {

        String cadena = dato;

        for (int i = cadena.length(); i < tamano; i++) {
            cadena += " ";
        }

        return cadena;
    }
    
    
    public static String IdTicketSiguiente(String idticket) {

        int num;
        String idticketnext = "";
        num = Integer.parseInt(idticket);
        num = num + 1;
        if (num < 10) {
            idticketnext = "00" + num;
        } else if (num < 100) {
            idticketnext = "0" + num;
        } else {
            idticketnext = "" + num;
        }

        return idticketnext;
    }
    
    
    //etapa 3 en esta funcion se puso la fecha del ticket 
    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(fecha);
    }
    //se agrega un menu dentro del menu principal escogiendo una de las opciones
    public static void MenuProductos() throws IOException {

        String[] menu = {
            "Modificar",
            "Listado",
            "Salida"
        };

        String opcion = "0";

        do {
            opcion = DesplegarMenu("MENU PRODUCTOS", menu);

            if (opcion == null) {
                System.out.println("Opción incorrecta");
            } else {

                switch (opcion) {
                    case "1":
                        System.out.println("Modificar Precio Producto");
                        break;

                    case "2":
                        System.out.println("Listado Producto");
                        break;

                    case "3":
                        System.out.println("Salida del Sistema");
                        break;

                    default:
                        System.out.println("No existe esta opción");
                        break;
                }
            }

            System.out.println();

        } while (!opcion.equals("3"));
    }
    
    // parte del codigo donde creamos un menu dentro del menu principal donde este creara un tiket de una venta 
    public static void MenuPuntoVenta() throws IOException {

        String idticket = "000";
        String opcion = "0";
        String membrete = "";
        boolean pago = false;

        // Genera un  nuevo ticket
        idticket = IdTicketSiguiente(idticket);

        // Obtiene la  fecha
        String fecha = Fecha();

        // Crear un membrete
        membrete = "Fecha: " + fecha + " Ticket: " + idticket + "\n---------------------";

        String[] datosmenu = {
            "Agregar Articulo",
            "Eliminar Articulo",
            "Listado de Articulos",
            "Pagar Ticket y salir",
            "Salir"
        };

        do {
            // Mostrar menú con membrete
            opcion = DesplegarMenu(membrete, datosmenu);

            if (opcion == null) {
                System.out.println("Opción incorrecta");
            } else {

                switch (opcion) {
                    case "1":
                        System.out.println("Agregar Articulo al Ticket");
                        break;

                    case "2":
                        System.out.println("Eliminar Articulo del Ticket");
                        break;

                    case "3":
                        System.out.println("Listado de Articulos del Ticket");
                        break;

                    case "4":
                        System.out.println("Pagar Ticket y salir");
                        pago = true;
                        opcion = "5";
                        break;

                    case "5":
                        System.out.println("Salida del Ventas");
                        if (!pago) {
                            System.out.println("No se pagó el ticket y se eliminará");
                        }
                        break;

                    default:
                        System.out.println("No existe esta opción");
                        break;
                }
            }

            System.out.println();

        } while (!opcion.equals("5"));
    }
    //en esta parte se agrega un metodo menu inventrio donde se desplega un menu dentro del menu principal donde se agrega inventario 
    public static void menuinventario() throws IOException {
        String[] datosmenuinventario = {
                "Listado de Inventario",
                "Agregar Inventario",
                "Salir"
            };

            String opcion = "0";

            do {

                opcion = DesplegarMenu("MENU INVENTARIO", datosmenuinventario);

                if (opcion == null) {
                    System.out.println("Opción incorrecta");
                } else {

                    switch (opcion) {
                        case "1":
                            System.out.println("Listado de Inventario");
                            break;

                        case "2":
                            System.out.println("Agregar Inventario");
                            break;

                        case "3":
                            System.out.println("Salida del Sistema");
                            break;

                        default:
                            System.out.println("No existe esta opción");
                            break;
                    }
                }

                System.out.println();

            } while (!opcion.equals("3"));
    }
    

    public static void main(String[] args) throws IOException {
//se empieza a agregar codigo en el menu principal llamando las funciones

    	    String[] datosmenuprincipal = {
    	        "Productos",
    	        "Punto de Venta",
    	        "Inventario",
    	        "Ventas",
    	        "Salir"
    	    };

    	    String opcion = "0";

    	    do {
    	        // Mostrar menú
    	        opcion = DesplegarMenu("MENU PRINCIPAL", datosmenuprincipal);

    	        // Validar si es null
    	        if (opcion == null) {
    	            System.out.println("Opción incorrecta");
    	        } else {

    	        	switch (opcion) {
    	            case "1":
    	                MenuProductos();
    	                break;

    	            case "2":
    	                MenuPuntoVenta();
    	                break;

    	            case "3":
    	                menuinventario();
    	                break;

    	            case "4":
    	                System.out.println("Ventas");
    	                break;

    	            case "5":
    	                System.out.println("Saliendo");
    	                break;

    	            default:
    	                System.out.println("No existe esta opción");
    	                break;
    	        }
    	        }

    	        System.out.println(); // espacio

    	    } while (!opcion.equals("5"));
    	}


    }
