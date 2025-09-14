# Demoblaze – E2E Purchase Flow (Serenity BDD + Cucumber)

Automatización de una **prueba funcional E2E** sobre https://www.demoblaze.com/ utilizando **Serenity BDD** con **Cucumber** (Java/Maven).

## Objetivo de la prueba

Verificar el flujo de compra end-to-end:
1. Agregar **dos productos** al carrito.
2. **Visualizar** el carrito y validar la cantidad de ítems.
3. **Completar** el formulario de compra.
4. **Finalizar** la compra y comprobar la confirmación.

## Stack técnico

- **Java 17**, **Maven 3.9+**
- **Serenity BDD 4.x** + **Cucumber**
- **Selenium WebDriver** con **WebDriverManager/Selenium Manager**
- **Google Chrome** (estable)
- Reportería **Serenity** con screenshots por paso.

---

## Requisitos

- Java 17+ (`java -version`)
- Maven 3.9+ (`mvn -v`)
- Google Chrome instalado
- Internet (para dependencias/driver)

> No es necesario instalar manualmente ChromeDriver. El proyecto descarga/gestiona el binario compatible automáticamente.

---

## Ejecución local

Clonar y entrar al proyecto:
```bash
git clone https://github.com/smoyano88/demoblaze-serenity.git
cd demoblaze-serenity```