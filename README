############################################
        Sistema Open MRM
############################################

---

## 🧩 Software Requerido

(01) Java 1.6  
(02) MySQL Server 5.1  

---

## 💻 Hardware Requerido

Se requieren dos módems USB (HSDPA Dongles):

(01) Primer módem: para conexión a Internet.  
(02) Segundo módem: para envío de SMS.  
> ⚠️ No debe estar conectado a Internet. Cerrar cualquier software asociado (como Mobile Partner).

---

## 🔌 Identificación del Puerto del Módem SMS

1. Haz clic derecho en **Mi PC / Este equipo**
2. Selecciona **Administrar**
3. Busca la sección **Módems**
4. Se abrirá una ventana con varias pestañas
5. Localiza el campo **Puerto (Port)**

📌 Anota el número de puerto, ya que se deberá configurar en:  
**Open MRM System → Tools → Modem Configurations**

---

## ⚙️ Despliegue del Sistema

### 🔐 Cambio de contraseña de MySQL (Opcional)

> Por defecto, el sistema utiliza `"sa"` como contraseña del usuario `root`.

Se recomienda cambiarla por seguridad:

```sql
start mysql server (o WAMP)
mysql> use mysql;
mysql> update user set password=PASSWORD("sa") where User='root';
mysql> flush privileges;
mysql> quit;
🗄️ Importación de la Base de Datos
Iniciar el servidor MySQL
Importar el esquema de la base de datos:
mysql> source <ruta>/db_dump.sql
Desde la línea de comandos, ingresar a la carpeta del proyecto
Ejecutar el archivo principal:
<project>/dist/OpenMRMSys.jar
📡 Integración de SMS
⚠️ Configuración externa para la JVM (Altamente recomendada)

Los archivos necesarios se encuentran en la carpeta <extras> del proyecto.

📌 Copiar estos archivos al classpath de Java
Generalmente ubicado en:

C:\Program Files\Java
📦 Instalación de Java Comm
comm.jar → JDKDIR/jre/lib/ext/
javax.comm.properties → JDKDIR/jre/lib/
Librerías (ej. win32com.dll o .so en Linux) → JDKDIR/jre/bin/

Si tienes un JRE separado, repetir el proceso en el directorio JRE.

📦 Instalación de RxTx
RXTXcomm.jar → JDKDIR/jre/lib/ext/
Librerías necesarias (ej. librxtxSerial.so) → JDKDIR/jre/bin/

Aplicar lo mismo si existe un JRE independiente.

🧰 Herramientas de Terceros Utilizadas

(01) Jasper Reporting
(02) SMSLib API
(03) Rome XML Parser

🛠️ Solución de Problemas

Si ocurre un error como:

Java.lang.ClassNotFoundException

📌 Copiar los archivos JAR necesarios en las siguientes rutas y reiniciar la aplicación:

Linux
/jre/lib
/jre/lib/ext
