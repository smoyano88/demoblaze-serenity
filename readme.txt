# Demoblaze E2E con Serenity BDD + Cucumber (FIXED)

Correcciones aplicadas:
- Serenity **4.2.34** y `serenity-cucumber`.
- `@Steps` desde `net.serenitybdd.annotations.Steps`.
- `HomePage.goHome()`.
- `withTimeoutOf(Duration.ofSeconds(10))`.
- `WebElementFacade` en `CartPage`.

## Ejecutar
mvn -U clean verify

Reporte: target/site/serenity/index.html
