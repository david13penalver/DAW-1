# Diferencias entre Excepciones y Errores en Java

- **Excepciones**:
  	- Pueden y deben ser detectadas y tratadas en el código.
  	- Utilizan la clase `Exception` y son subclases de `Throwable`.
  	- Se dividen en dos categorías:
    		- **Excepciones marcadas (checked)**: Se detectan en tiempo de compilación. Heredan de `Exception`, excepto `RuntimeException` y sus subclases.
    		- **Excepciones no marcadas (unchecked)**: Ocurren en tiempo de ejecución. Heredan de `RuntimeException`.

- **Errores**:
  	- No se pueden manejar en tiempo de ejecución.
  	- Utilizan la clase `Error`, una subclase de `Throwable`.
  	- Son indicativos de problemas con el entorno de tiempo de ejecución (JRE), como falta de memoria.

- **Jerarquía de clases en Java**:
  	- La clase base es `Throwable`.
  	- Una rama está encabezada por `Exception`, utilizada para condiciones excepcionales que se pueden detectar por programas de usuario.
  	- Otra rama, `Error`, se usa para errores relacionados con el sistema de tiempo de ejecución (JVM).

# Captura de Excepciones con `try…catch`

- Los lenguajes de programación, como Java, proporcionan herramientas para capturar y tratar excepciones.
- El **bloque `try…catch`** es una forma común de manejar excepciones:
  - El bloque `try` encierra el código que puede lanzar excepciones.
  - Si se lanza una excepción, el control pasa al bloque `catch`, donde se puede manejar la excepción.

- **Ejemplo**:
  ```java
  try {
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (Exception e) {
      System.out.println("Error en la división");
  }
  ```

  - En este ejemplo, el código intenta dividir dos números dentro del bloque `try`.
  - Si ocurre una excepción (como dividir por cero), se ejecuta el bloque `catch`, mostrando un mensaje de error.
  - Al final, el mensaje "Error en la división" se imprime porque el divisor es cero.

- La ventaja del uso de `try…catch` es que permite manejar situaciones inesperadas sin detener la ejecución del programa. 
- El bloque `catch` puede contener lógica para abordar la excepción y continuar con el flujo normal del programa.

## Bloque `finally` en Java

- El **bloque `finally`** es opcional pero se puede añadir a un bloque `try…catch`.
- Se ejecuta **siempre**, independientemente de si el bloque `try` lanza una excepción o no.
- Es útil para ejecutar código que debe ejecutarse en todas las circunstancias, como limpieza de recursos, cierre de conexiones, etc.

- **Ejemplo de uso**:
  ```java
  try {
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (Exception e) {
      System.out.println("Error en la división");
  } finally {
      System.out.println("Este código se ejecutará siempre");
  }
  ```

  - Si el divisor es cero, el bloque `catch` muestra "Error en la división", y luego el bloque `finally` se ejecuta mostrando "Este código se ejecutará siempre".
  - Si la división es exitosa, se muestra el resultado, y el bloque `finally` también se ejecuta.

- **Ventajas del bloque `finally`**:
  	- Permite garantizar la ejecución de código crítico para la integridad del sistema, como cerrar ficheros o desconectar bases de datos.
  	- Útil para liberar recursos, incluso si se produce una excepción.

- **Ejemplo práctico**:
  	- Si abres un fichero para operar con él, el bloque `finally` puede usarse para cerrarlo, asegurando que se liberen recursos, incluso si el proceso encuentra errores.
  	- Similarmente, en la interacción con bases de datos, el bloque `finally` puede usarse para desconectar o limpiar conexiones.

## Excepciones Checked y Unchecked en Java

- **Excepciones Checked**:
  	- Son aquellas excepciones que **Java nos obliga a manejar**.
  	- Si el código puede lanzar una excepción checked, debe encerrarse dentro de un bloque `try…catch` o declarar la excepción con `throws` en la firma del método.
  	- Ejemplos comunes: `IOException`, `SQLException`.

- **Excepciones Unchecked**:
  	- Son excepciones que **no requieren manejo obligatorio**.
  	- No es necesario usar `try…catch`, aunque se recomienda si el código es propenso a errores.
  	- Ejemplos comunes: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

- **Implicaciones Prácticas**:
  	- Para excepciones checked, si no las manejas con `try…catch` o `throws`, el compilador mostrará un error.
  	- Con excepciones unchecked, el código se compilará incluso sin bloques `try…catch`, pero si ocurre una excepción en tiempo de ejecución, puede hacer que el programa falle inesperadamente.

- **Consejos de uso**:
  	- Utiliza excepciones checked para casos en los que el manejo es crítico para la estabilidad del programa.
  	- Las excepciones unchecked pueden ser útiles para errores de programación que deben ser corregidos, pero no necesariamente capturados.
  	- Considera el flujo de tu programa y asegúrate de manejar excepciones checked donde sea necesario para evitar interrupciones inesperadas.

# Tipos de Excepción y Manejo de Errores en Java

- **Dividendo y Divisor con Error**:
  	- Intentamos almacenar un número decimal en una variable `int`, resultando en un `InputMismatchException`.
  	- Código ejemplo para capturar excepciones y manejar errores:

  ```java
  try {
      System.out.print("Dividendo: ");
      dividendo = reader.nextInt();
      System.out.print("Divisor: ");
      divisor = reader.nextInt();
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (Exception e) {
      System.out.println("Error en la división");
  } finally {
      System.out.println("Este código se ejecutará siempre");
  }
  ```

- **Uso de Métodos de la Clase `Exception`**:
  	- **`getMessage()`**: Obtiene el mensaje de la excepción.
  	- **`getClass()`**: Retorna la clase de la excepción.
  	- **`getStackTrace()`**: Devuelve la traza de la excepción, útil para diagnóstico.
  	- Ejemplo de uso de estos métodos para obtener detalles de la excepción:

  ```java
  try {
      System.out.print("Dividendo: ");
      dividendo = reader.nextInt();
      System.out.print("Divisor: ");
      divisor = reader.nextInt();
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (Exception e) {
      System.out.println(e.getClass().getCanonicalName());
      System.out.println(e.getMessage());
      System.out.println("Error en la división");
  } finally {
      System.out.println("Este código se ejecutará siempre");
  }
  ```

- **Personalizar el Bloque `catch`**:
  	- Puedes personalizar la acción según el tipo de excepción:
    	- Para `ArithmeticException` (división por cero), muestra un mensaje específico.
    	- Para `InputMismatchException`, indica entrada incorrecta.
    	- Captura general de `Exception` para errores desconocidos.
  	- Ejemplo de manejo con condiciones `if` para identificar el tipo de excepción:

  ```java
  try {
      System.out.print("Dividendo: ");
      dividendo = reader.nextInt();
      System.out.print("Divisor: ");
      divisor = reader.nextInt();
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (Exception e) {
      if (e.getMessage() != null && e.getMessage().equals("/ by zero")) {
          System.out.println("El divisor no puede ser 0");
      } else if (e.getClass().getCanonicalName().equals("java.util.InputMismatchException")) {
          System.out.println("Ha introducido algún dato erróneo");
      } else {
          System.out.println("Error desconocido");
      }
  }
  ```

- **Bloques `catch` Anidados**:
  	- Una mejor práctica para manejar excepciones específicas es usar bloques `catch` anidados.
  	- Ejemplo de bloques `catch` anidados para manejar diferentes tipos de excepciones:

  ```java
  try {
      System.out.print("Dividendo: ");
      dividendo = reader.nextInt();
      System.out.print("Divisor: ");
      divisor = reader.nextInt();
      System.out.println("Resultado: " + (dividendo / divisor));            
  } catch (InputMismatchException e) {
      System.out.println("Entrada incorrecta");
  } catch (ArithmeticException e) {
      System.out.println("División por 0");
  } catch (Exception e) {
      System.out.println("Error en la división");
  }
  ```

- **Precauciones de Seguridad**:
  	- No hagas un volcado de pila (`stack trace`) con los datos de la excepción, ya que puede exponer información sensible.
  	- El uso de un bloque `catch` general al final asegura que se manejen todas las excepciones.

- **Frameworks para Manejo de Excepciones**:
  	- Frameworks como Spring proporcionan herramientas para simplificar el manejo de excepciones.
  	- Estos frameworks ayudan a reducir la complejidad del tratamiento de excepciones en aplicaciones grandes.

# Lanzar Excepciones en Java

- **Cómo lanzar excepciones**:
  	- Se crea un nuevo objeto de excepción y se lanza con la palabra reservada `throw`.
  	- Se puede agregar un mensaje de descripción a la excepción.
  	- Ejemplo básico para lanzar y capturar excepciones:

  ```java
  public class Main {
      public static void main(String[] args) {
          try {
              System.out.println("Ocurre un error");
              throw new Exception("Ha ocurrido un error en la aplicación");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
  }
  ```

- **Lanzar excepciones en métodos**:
  	- Para lanzar una excepción checked, se debe indicar en la cabecera del método con `throws`.
  	- Si el método lanza una excepción checked, el código que lo llama debe estar en un bloque `try…catch`.
  	- Ejemplo de un método que lanza una excepción:

  ```java
  public class Main {
      public static void metodoExcepcion() throws Exception {
          System.out.println("Método que lanza una excepción");
          throw new Exception("Mensaje de la excepción");
      }

      public static void main(String[] args) {
          try {
              metodoExcepcion();
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
  }
  ```

- **Excepciones unchecked (RuntimeException)**:
  	- Para excepciones unchecked, no es obligatorio indicar `throws` en la cabecera del método.
  	- No es necesario encerrar la llamada al método en un bloque `try…catch`.
  	- Ejemplo con una excepción unchecked (`RuntimeException`):

  ```java
  public class Main {
      public static void metodoExcepcion() {
          System.out.println("Método que lanza una excepción");
          throw new RuntimeException("Excepción en tiempo de ejecución");
      }

      public static void main(String[] args) {
          metodoExcepcion();
      }
  }
  ```

- **Múltiples excepciones**:
  	- Un método puede lanzar diferentes tipos de excepciones.
  	- Para indicar varias excepciones, se separan con comas en la cabecera del método.
  	- Ejemplo con varias excepciones:

  ```java
  public void miMetodo() throws ExceptionInInitializerError, ArithmeticException, RuntimeException {
      // Código del método
  }
  ```

# Utilidad de las Excepciones en Java

Las excepciones son útiles para manejar errores conocidos y mejorar la robustez del código. Un ejemplo es una aplicación con dos clases: una clase principal y una clase llamada `Trabajador`. Esta última tiene dos propiedades (nombre y edad), con setters y un método `toString()`. El uso de excepciones simplifica la gestión de errores y evita la necesidad de códigos de error complejos.

## Ejemplo Inicial
- El siguiente código muestra cómo se define un trabajador con nombre y edad, y se imprime su información:

```java
public class Trabajador {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Pepe");
        trabajador1.setEdad(54);
        System.out.println(trabajador1.toString());
    }
}
```

- Resultado:
  ```
  Nombre: Pepe
  Edad: 54
  ```

## Problema con Edad Inválida
- Si asignamos una edad no válida, por ejemplo, 999 años, el código sigue funcionando, pero el valor no es realista:

```java
public static void main(String[] args) {
    Trabajador trabajador1 = new Trabajador();
    trabajador1.setNombre("Pepe");
    trabajador1.setEdad(999);
    System.out.println(trabajador1.toString());
}
```

- Resultado:
  ```
  Nombre: Pepe
  Edad: 999
  ```

## Uso de Excepciones para Validación
- En lugar de devolver códigos de error, las excepciones permiten simplificar el código y manejar errores de forma más clara.
- Modificamos el método `setEdad()` para lanzar excepciones si la edad está fuera del rango permitido:

```java
public void setEdad(int edad) throws Exception {
    if (edad < 18) {
        throw new Exception("La edad debe ser superior a 18 años");
    } else if (edad > 65) {
        throw new Exception("La edad no puede ser mayor que 65 años");
    }
    this.edad = edad;
}
```

- Ventajas:
  	- El código es más limpio y fácil de entender.
  	- No es necesario modificar la firma del método para devolver códigos de error.
  	- Se puede lanzar diferentes excepciones según el tipo de error.
  	- Ayuda a evitar complejidades asociadas a códigos de error múltiples.

Este enfoque con excepciones es más claro y eficiente para manejar errores, ya que separa la lógica de validación de errores de la funcionalidad principal del código.

# Crear Excepciones Propias en Java

Java permite crear excepciones personalizadas para manejar errores específicos de tu aplicación. Estas excepciones personalizadas pueden contener propiedades adicionales, como códigos de error, y heredan de la clase `Exception`.

## Crear una Excepción Propia
- Para crear una excepción personalizada, debes definir una clase que herede de `Exception`.
- En el constructor de la clase, puedes usar `super()` para llamar al constructor de la clase padre (`Exception`).

Ejemplo de creación de una excepción personalizada llamada `ExceptionEdad` con un código de error:

```java
public class ExceptionEdad extends Exception {
    private int code;

    public ExceptionEdad(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
```

- La propiedad `code` se puede utilizar para asignar un código único a cada excepción.
- El constructor toma un mensaje y un código, y llama al constructor de `Exception` con el mensaje.

## Uso de la Excepción Personalizada
- Con la excepción personalizada creada, ahora puedes lanzarla y capturarla como cualquier otra excepción.
- Por ejemplo, en un método que verifica la edad, puedes lanzar una excepción `ExceptionEdad` con un código y un mensaje específicos:

```java
public void setEdad(int edad) throws ExceptionEdad {
    if (edad < 18) {
        throw new ExceptionEdad("La edad debe ser superior a 18 años", 1);
    } else if (edad > 65) {
        throw new ExceptionEdad("La edad no puede ser mayor que 65 años", 2);            
    }
    this.edad = edad;
}
```

- Al usar esta excepción personalizada, puedes diferenciar errores por código y dar respuestas específicas según el caso.
- También se puede usar para almacenar mensajes de error en archivos externos y mostrarlos en diferentes idiomas, basándose en el código de error.

## Ventajas de Excepciones Personalizadas
- Permiten encapsular la lógica de error en clases especializadas.
- Pueden contener propiedades adicionales para brindar información específica sobre el error.
- Proporcionan flexibilidad para crear excepciones con comportamientos únicos.
- Ayudan a mantener el código limpio y modular, separando la lógica de error de la lógica de negocio.

# Dónde Tratar las Excepciones en Java

El tratamiento de excepciones es fundamental para mantener la robustez y estabilidad del código. A continuación, se describen buenas prácticas para determinar dónde y cómo tratar excepciones en Java.

## Tratar Excepciones en Clases Generales
- Se recomienda tratar las excepciones en clases superiores o más generales, como la clase principal (`Main`).
- En clases específicas, solo deberías lanzar excepciones y no capturarlas.

### Excepciones Checked
- Java obliga a tratar las excepciones checked en bloques `try…catch`.
- Si un método tiene excepciones checked, puedes propagarlas hacia clases superiores utilizando `throws` en la cabecera del método.

#### Ejemplo de Propagación de Excepciones Checked
```java
public class Fichero {
    public void read(String path) throws Exception {
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);                
        } catch (Exception e) {
            throw new Exception("No se puede leer el fichero", e);  // Propaga la excepción con un mensaje adicional
        }
    }
}
```

- Propagar la excepción con información adicional (mensaje y traza) es útil para mantener contexto al capturarla más adelante.

### Transformar Excepciones Checked en Unchecked
- Algunas API lanzan excepciones checked cuando podrían ser unchecked.
- Puedes transformar una excepción checked en una excepción unchecked (`RuntimeException`) al propagarla.

#### Ejemplo de Transformación a Excepción Unchecked
```java
public class Fichero {
    public void read(String path) throws RuntimeException {
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);                
        } catch (Exception e) {
            throw new RuntimeException("No se puede leer el fichero", e);
        }
    }
}
```

- Ten en cuenta que las excepciones checked se usan para situaciones que no indican errores del programa, sino condiciones externas excepcionales, como falta de un archivo.

## Uso de `try-with-resources`
- Desde Java 7, el uso de `try-with-resources` simplifica el manejo de recursos y garantiza el cierre adecuado.
- Este enfoque elimina la necesidad de usar bloques `finally` para cerrar recursos como `BufferedReader` o `FileReader`.

#### Ejemplo de Código con `finally`
```java
String path = "path_archivo";
BufferedReader br = null;

try {
    br = new BufferedReader(new FileReader(path));
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (Exception e) {
    e.printStackTrace();
} finally {
    if (br != null) 
        try {
            br.close();                    
        } catch (Exception e) {
            e.printStackTrace();
        }
}
```

- El bloque `finally` asegura el cierre del recurso, pero puede generar más excepciones, requiriendo otro bloque `try`.

#### Ejemplo de Código con `try-with-resources`
```java
try (BufferedReader br = new BufferedReader(new FileReader("path_archivo"))) {
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (Exception e) {
    e.printStackTrace();
}
```

- El uso de `try-with-resources` garantiza el cierre automático del recurso, simplificando el código y reduciendo el riesgo de errores relacionados con el manejo de recursos.