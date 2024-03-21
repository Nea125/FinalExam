
package FinalExam;

import java.util.Scanner;
public class Exam2 {
    
    String customerName;
    String customerType;
    String customer;
    String date;
    String serviceExpanse;
    String productExpanse;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setServiceExpanse(String serviceExpanse) {
        this.serviceExpanse = serviceExpanse;
    }

    public void setProductExpanse(String productExpanse) {
        this.productExpanse = productExpanse;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public String getServiceExpanse() {
        return serviceExpanse;
    }

    public String getProductExpanse() {
        return productExpanse;
    }

    public Exam2() {
    }
    

    public Exam2(String customerName, String customerType, String customer, String date, String serviceExpanse, String productExpanse) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.customer = customer;
        this.date = date;
        this.serviceExpanse = serviceExpanse;
        this.productExpanse = productExpanse;
    }
    
      public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter service type (premium, gold, silver, normal): ");
        String serviceType = scanner.next().toLowerCase();

      
        System.out.println("Enter product condition (premium, gold, silver, normal): ");
        String productCondition = scanner.next().toLowerCase();

       
        double serviceDiscount = getServiceDiscount(serviceType);

       
        double productDiscount = getProductDiscount(productCondition);

      
        double totalDiscount = Math.max(serviceDiscount, productDiscount);

        System.out.println("Total discount: " + totalDiscount + "%");

        scanner.close();
    }

    private static double getServiceDiscount(String serviceType) {
        switch (serviceType) {
            case "premium":
                return 20.0;
            case "gold":
                return 15.0;
            case "silver":
                return 10.0;
            case "normal":
                return 0.0;
            default:
                return 0.0;         }
    }

    private static double getProductDiscount(String productCondition) {
        switch (productCondition) {
            case "premium":
            case "gold":
            case "silver":
                return 10.0;
            case "normal":
                return 0.0;
            default:
                return 0.0;
        }
    }
  
   
}


    

