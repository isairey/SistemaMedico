<div align="center">

# 🚀 Sistema Open MRM

### 📡 Plataforma de Gestión y Monitoreo con Integración SMS

Sistema desarrollado en Java para la administración, monitoreo y comunicación mediante mensajes SMS utilizando módems USB GSM/HSDPA.

![Java](https://img.shields.io/badge/Java-1.6-orange?style=for-the-badge\&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-5.1-blue?style=for-the-badge\&logo=mysql)
![SMSLib](https://img.shields.io/badge/SMSLib-API-success?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux-lightgrey?style=for-the-badge)

</div>

---

# 📋 Requisitos del Sistema

## 💻 Software Requerido

| Software     | Versión |
| ------------ | ------- |
| Java JRE/JDK | 1.6     |
| MySQL Server | 5.1     |

---

## 🖥️ Hardware Requerido

El sistema requiere dos módems USB GSM/HSDPA:

| Dispositivo | Función             |
| ----------- | ------------------- |
| 📶 Módem 1  | Conexión a Internet |
| 📩 Módem 2  | Envío de SMS        |

> ⚠️ El módem destinado al envío de SMS no debe estar conectado a Internet. Además, es recomendable cerrar cualquier software asociado al dispositivo (por ejemplo: Mobile Partner).

---

# 🔌 Configuración del Puerto del Módem SMS

Antes de utilizar el sistema es necesario identificar el puerto COM asignado al módem SMS.

### Pasos

1. Abrir **Mi PC / Este Equipo**
2. Clic derecho → **Administrar**
3. Acceder a la sección **Módems**
4. Seleccionar el dispositivo correspondiente
5. Consultar el valor de **Puerto (COM)**

### Configuración en Open MRM

Una vez identificado el puerto:

```text
Open MRM System
 └── Tools
      └── Modem Configurations
```

Registrar el número de puerto correspondiente.

---

# 🗄️ Configuración de Base de Datos

## Cambio de Contraseña de MySQL (Opcional)

Por defecto, el sistema utiliza:

```text
Usuario: root
Contraseña: sa
```

Para modificar la contraseña:

```sql
USE mysql;

UPDATE user
SET password = PASSWORD('sa')
WHERE User = 'root';

FLUSH PRIVILEGES;
EXIT;
```

---

# 📥 Importación de la Base de Datos

Iniciar el servidor MySQL e importar el respaldo incluido.

```sql
SOURCE <ruta>/db_dump.sql;
```

---

# ▶️ Ejecución del Sistema

Desde la carpeta principal del proyecto ejecutar:

```bash
java -jar dist/OpenMRMSys.jar
```

O directamente abrir:

```text
dist/OpenMRMSys.jar
```

---

# 📲 Integración de SMS

El sistema utiliza librerías externas para la comunicación serial con el módem GSM.

## Componentes Necesarios

Los archivos requeridos se encuentran en:

```text
/extras
```

---

# ☕ Instalación de Java Comm

Copiar los siguientes archivos:

```text
comm.jar
→ JDKDIR/jre/lib/ext/

javax.comm.properties
→ JDKDIR/jre/lib/

win32com.dll / *.so
→ JDKDIR/jre/bin/
```

> Si existe una instalación independiente del JRE, repetir el procedimiento.

---

# 🔄 Instalación de RxTx

Copiar los siguientes archivos:

```text
RXTXcomm.jar
→ JDKDIR/jre/lib/ext/

librxtxSerial.so
→ JDKDIR/jre/bin/
```

Aplicar la misma configuración al JRE si corresponde.

---

# 🧩 Dependencias de Terceros

El proyecto utiliza las siguientes herramientas:

| Herramienta     | Descripción            |
| --------------- | ---------------------- |
| Jasper Reports  | Generación de reportes |
| SMSLib API      | Comunicación SMS       |
| Rome XML Parser | Procesamiento XML      |

---

# 🛠️ Solución de Problemas

## Error: ClassNotFoundException

Si aparece un error similar a:

```java
java.lang.ClassNotFoundException
```

Verificar que todas las dependencias estén copiadas correctamente en:

```text
Linux

/jre/lib
/jre/lib/ext
```

Posteriormente reiniciar la aplicación.

---

# 📂 Estructura del Proyecto

```text
SistemaMedico/
│
├── dist/
│   └── OpenMRMSys.jar
│
├── extras/
│   ├── comm.jar
│   ├── RXTXcomm.jar
│   ├── javax.comm.properties
│   └── librerías nativas
│
├── database/
│   └── db_dump.sql
│
└── README.md
```

---

# 📜 Licencia

Este proyecto se distribuye con fines educativos y de mantenimiento de sistemas heredados basados en Java y comunicación SMS.

---

<div align="center">

### 📡 Open MRM System

Gestión • Monitoreo • Comunicación SMS

</div>
