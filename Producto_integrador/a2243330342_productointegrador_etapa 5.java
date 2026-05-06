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
    // se modifico la funcion menu productos por matrices
    public static void MenuProductos(String[][] productos) throws IOException {

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
                    System.out.println(mostrarListaProductos(productos));

                    String codigo = Leer("Ingrese código del producto");

                    int pos = BuscarProducto(productos, codigo);

                    if (pos == -1) {
                        System.out.println("Producto no encontrado");
                    } else {
                        String precio = Leer("Nuevo precio");

                        if (EvaluarNumerico(precio, 2)) {
                            productos[pos][2] = precio;
                            System.out.println("Precio actualizado");
                        } else {
                            System.out.println("Precio inválido");
                        }
                    }
                    break;

                    case "2":
                        System.out.println(mostrarListaProductos(productos));
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
    
    private static int BuscarProducto(String[][] productos, String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0].equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

	// parte del codigo donde creamos un menu dentro del menu principal donde este creara un tiket de una venta 
    public static void MenuPuntoVenta(String[][] productos) throws IOException {

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
    
    static String[][] productos;
    //etapa 4 en esta etapa se ven ya lo que son matrices donde ahi almacenaran dentro de la matriz 
    public static String[][] cargarProductos() {
        
        String[][] producto = {
            {"001", "Arroz 1kg", "35", "10"},
            {"002", "Azúcar 1kg", "25", "10"},
            {"003", "Harina 1kg", "28", "10"},
            {"004", "Aceite 1L", "50", "10"},
            {"005", "Leche 1L", "35", "10"},
            {"006", "Huevos 12 unidades", "45", "10"},
            {"007", "Fideos 500g", "20", "10"},
            {"008", "Sal 1kg", "15", "10"},
            {"009", "Pasta de tomate 400g", "25", "10"},
            {"010", "Atún lata 170g", "35", "10"}
        };
        return producto;
    }
    // en esta parte del codigo muestra los productos rellenando los espacios
    public static String mostrarProducto(String[] vproducto) {

        String codigo = RellenarEspacios(vproducto[0], 5);
        String nombre = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String cadena = codigo + nombre + precio + cantidad;

        return cadena;
    }
    public static String rellenarEspacios(String texto, int espacios) {
        while (texto.length() < espacios) {
            texto += " ";
        }
        return texto;
    }
    
    
    //en esta parte se agrega un metodo menu inventrio donde se desplega un menu dentro del menu principal donde se agrega inventario 
    // se modifico esta funcion agregando matrices
    public static void menuinventario(String[][] productos) throws IOException {
        String[] datosmenuinventario = {
            "Listado de Inventario",
            "Agregar Inventario",
            "Salir"
        };

        String opcion = "0";

        do {

            opcion = DesplegarMenu("MENU INVENTARIO", datosmenuinventario);

            if (opcion == null) {
                System.out.println("Opcion incorrecta");
            } else {

                switch (opcion) {
                    case "1":
                    	//etapa 5: en esta funcion se cambio el caso donde ahora este llamara otra funcion donde muestra una lista de productos
                        System.out.println(mostrarListaProductos(productos));
                        break;

                    case "2":
                        AgregarStock(productos);
                        break;

                    case "3":
                        System.out.println("Salida del Sistema");
                        break;

                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }

            System.out.println();

        } while (!opcion.equals("3"));
    }
    
    public static String mostrarListaProductos(String[][] productos) {
        String salida = "";

        for (int i = 0; i < productos.length; i++) {
            salida += mostrarProducto(productos[i]) + "\n";
        }

        return salida;
    }
    
    // etapa 5 en esta etapa se declara una matriz donde el usuario puede agregar nuevo stock de mercancias 
    public static void AgregarStock(String[][] productos) throws IOException {

        String codigo = Leer("Ingrese codigo del producto");

        if (codigo == null) {
            System.out.println("dato nulo");
            return;
        }

        int pos = BuscarProducto(productos, codigo);

        if (pos == -1) {
            System.out.println("no existe codigo");
            return;
        }

        System.out.println("Producto encontrado:");
        System.out.println(mostrarProducto(productos[pos]));

        String cantidad = Leer("Ingrese cantidad a agregar");

        if (cantidad == null) {
            System.out.println("dato nulo");
            return;
        }

        if (!EvaluarNumerico(cantidad, 1)) {
            System.out.println("no es un valor numerico");
            return;
        }

        int cantidadActual = Integer.parseInt(productos[pos][3]);
        int cantidadNueva = Integer.parseInt(cantidad);

        cantidadActual = cantidadActual + cantidadNueva;

        productos[pos][3] = String.valueOf(cantidadActual);

        System.out.println("stock actualizado");}
    
    
    public static void main(String[] args) throws IOException {
//se empieza a agregar codigo en el menu principal llamando las funciones

    	 productos = cargarProductos();
    	 
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

    	        // Validar si es null<
    	        if (opcion == null) {
    	            System.out.println("Opción incorrecta");
    	        } else {

    	        	switch (opcion) {
    	        	case "1":
    	        	    MenuProductos(productos);
    	        	    break;

    	        	case "2":
    	        	    MenuPuntoVenta(productos);
    	        	    break;

    	        	case "3":
    	        	    menuinventario(productos);
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
