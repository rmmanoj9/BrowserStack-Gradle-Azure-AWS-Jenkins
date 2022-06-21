#language: es

Característica: Compra en mobile


  Esquema del escenario: Compra en mobile exitosa
    Dado ingreso a la pagina de automation practice
    Cuando realizo la busqueda de un producto
      | producto   |
      | <producto> |
    Y esta tiene algun resultado
      | producto   |
      | <producto> |
    Y agrego el producto al carrito
    Entonces visualizo que se agrega correctamente


    Ejemplos:
      | producto             |
      | Printed Summer Dress |
