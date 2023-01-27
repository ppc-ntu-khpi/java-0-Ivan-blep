/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Иван
 */
    public class Shirt {
  public int shirtID = 5; // стандартне значення номера моделі сорочки
  public String description = "chic"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public String  colorCode = "R";
  public double price = 50.0; // стандартна вартість сорочки
  public int quantityInStock = 20; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    switch (colorCode){
        case "R":System.out.println("Color red ");
        break;
        case "B":System.out.println("Color blue ");
        break;
        case "G":System.out.println("Color green ");
        break;
        default:System.out.println("Color unset ");
        break;
    }
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу

