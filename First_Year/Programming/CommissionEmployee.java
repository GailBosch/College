// -- Wk 10 - AbstractClasses --
public class CommissionEmployee extends Employee 
{
   private double grossSales; // Gross weekly sales
   private double commissionRate; // Commission percentage

   // Constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate 
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // Set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // Return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // Set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // Return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // Calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      return getCommissionRate() * getGrossSales();                    
   }                                             

   // Return String representation of CommissionEmployee object
   @Override                                                   
   public String toString()                                    
   {                                                           
      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
         "commission employee", super.toString(),              
         "gross sales", getGrossSales(),                       
         "commission rate", getCommissionRate());             
   } 
} 

// -- Wk 10 - Polymorphism --
//public class CommissionEmployee
//{
//   private final String firstName;                              
//   private final String lastName;                               
//   private final String socialSecurityNumber;                   
//   private double grossSales; // gross weekly sales       
//   private double commissionRate; // commission percentage
//
//   // five-argument constructor
//   public CommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate)
//   {
//      // implicit call to Object constructor occurs here
//
//      // if grossSales is invalid throw exception
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      // if commissionRate is invalid throw exception
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.firstName = firstName;                                    
//      this.lastName = lastName;                                    
//      this.socialSecurityNumber = socialSecurityNumber;         
//      this.grossSales = grossSales;
//      this.commissionRate = commissionRate;
//   } // end constructor 
//
//   // return first name
//   public String getFirstName()
//   {
//      return firstName;
//   }
//
//   // return last name
//   public String getLastName()
//   {
//      return lastName;
//   }
//
//   // return social security number
//   public String getSocialSecurityNumber()
//   {
//      return socialSecurityNumber;
//   } 
//
//   // set gross sales amount
//   public void setGrossSales(double grossSales)
//   {
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      this.grossSales = grossSales;
//   } 
//
//   // return gross sales amount
//   public double getGrossSales()
//   {
//      return grossSales;
//   } 
//
//   // set commission rate
//   public void setCommissionRate(double commissionRate)
//   {
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.commissionRate = commissionRate;
//   } 
//
//   // return commission rate
//   public double getCommissionRate()
//   {
//      return commissionRate;
//   }
//
//   // calculate earnings
//   public double earnings()
//   {
//      return getCommissionRate() * getGrossSales();
//   } 
//
//   // return String representation of CommissionEmployee object
//   @Override 
//   public String toString()
//   {
//      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
//         "commission employee", getFirstName(), getLastName(), 
//         "social security number", getSocialSecurityNumber(), 
//         "gross sales", getGrossSales(), 
//         "commission rate", getCommissionRate());
//   } 
//}

// -- Wk 10 - BasePlusCommissionEmployee4 --
//public class CommissionEmployee
//{
//   private final String firstName;
//   private final String lastName;
//   private final String socialSecurityNumber;
//   private double grossSales; // Gross weekly sales
//   private double commissionRate; // Commission percentage
//
//   // Five-argument constructor                                       
//   public CommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate)
//   {                                                                  
//      // Implicit call to Object constructor occurs here              
//
//      // If grossSales is invalid throw exception
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      // If commissionRate is invalid throw exception
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.firstName = firstName;                                     
//      this.lastName = lastName;                                    
//      this.socialSecurityNumber = socialSecurityNumber;         
//      this.grossSales = grossSales;
//      this.commissionRate = commissionRate;
//   } // End constructor        
//
//   // Return first name
//   public String getFirstName()
//   {
//      return firstName;
//   }
//
//   // Return last name
//   public String getLastName()
//   {
//      return lastName;
//   } 
//
//   // Return social security number
//   public String getSocialSecurityNumber()
//   {
//      return socialSecurityNumber;
//   } 
//
//   // Set gross sales amount
//   public void setGrossSales(double grossSales)
//   {
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      this.grossSales = grossSales;
//   } 
//
//   // Return gross sales amount
//   public double getGrossSales()
//   {
//      return grossSales;
//   } 
//
//   // Set commission rate
//   public void setCommissionRate(double commissionRate)
//   {
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.commissionRate = commissionRate;
//   } 
//
//   // Return commission rate
//   public double getCommissionRate()
//   {
//      return commissionRate;
//   } 
//
//   // Calculate earnings                 
//   public double earnings()              
//   {                                     
//      return getCommissionRate() * getGrossSales();
//   } 
//
//   // Return String representation of CommissionEmployee object         
//   @Override // Indicates that this method overrides a superclass method
//   public String toString()                                             
//   {                                                                    
//      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
//         "commission employee", getFirstName(), getLastName(),
//         "social security number", getSocialSecurityNumber(),                
//         "gross sales", getGrossSales(),                                     
//         "commission rate", getCommissionRate());                           
//   } 
//} // End class CommissionEmployee

// -- Wk 10 - BasePlusCommissionEmployee3 --
//public class CommissionEmployee
//{
//   protected final String firstName;
//   protected final String lastName;
//   protected final String socialSecurityNumber;
//   protected double grossSales; // Gross weekly sales
//   protected double commissionRate; // Commission percentage
//
//   // Five-argument constructor                                       
//   public CommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate)
//   {                                                                  
//      // Implicit call to Object constructor occurs here              
//
//      // If grossSales is invalid throw exception
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      // If commissionRate is invalid throw exception
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.firstName = firstName;                                     
//      this.lastName = lastName;                                    
//      this.socialSecurityNumber = socialSecurityNumber;         
//      this.grossSales = grossSales;
//      this.commissionRate = commissionRate;
//   } // End constructor        
//
//   // Return first name
//   public String getFirstName()
//   {
//      return firstName;
//   }
//
//   // Return last name
//   public String getLastName()
//   {
//      return lastName;
//   } 
//
//   // Return social security number
//   public String getSocialSecurityNumber()
//   {
//      return socialSecurityNumber;
//   } 
//
//   // Set gross sales amount
//   public void setGrossSales(double grossSales)
//   {
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      this.grossSales = grossSales;
//   } 
//
//   // Return gross sales amount
//   public double getGrossSales()
//   {
//      return grossSales;
//   } 
//
//   // Set commission rate
//   public void setCommissionRate(double commissionRate)
//   {
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.commissionRate = commissionRate;
//   } 
//
//   // Return commission rate
//   public double getCommissionRate()
//   {
//      return commissionRate;
//   } 
//
//   // Calculate earnings                 
//   public double earnings()              
//   {                                     
//      return commissionRate * grossSales;
//   } 
//
//   // Return String representation of CommissionEmployee object         
//   @Override // Indicates that this method overrides a superclass method
//   public String toString()                                             
//   {                                                                    
//      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
//         "commission employee", firstName, lastName,                    
//         "social security number", socialSecurityNumber,                
//         "gross sales", grossSales,                                     
//         "commission rate", commissionRate);                           
//   } 
//} // End class CommissionEmployee

// -- Wk9 - Base + --
//public class CommissionEmployee extends Object
//{
//   private final String firstName;                        
//   private final String lastName;                         
//   private final String socialSecurityNumber;             
//   private double grossSales; // Gross weekly sales       
//   private double commissionRate; // Commission percentage
//
//   // Five-argument constructor                                       
//   public CommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate)
//   {                                                                  
//      // Implicit call to Object constructor occurs here              
//
//      // If grossSales is invalid throw exception
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      // If commissionRate is invalid throw exception
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.firstName = firstName;                                     
//      this.lastName = lastName;                                    
//      this.socialSecurityNumber = socialSecurityNumber;         
//      this.grossSales = grossSales;
//      this.commissionRate = commissionRate;
//   } // End constructor           
//
//   // Return first name
//   public String getFirstName()
//   {
//      return firstName;
//   }
//
//   // Return last name
//   public String getLastName()
//   {
//      return lastName;
//   } 
//
//   // Return social security number
//   public String getSocialSecurityNumber()
//   {
//      return socialSecurityNumber;
//   } 
//
//   // Set gross sales amount
//   public void setGrossSales(double grossSales)
//   {
//      if (grossSales < 0.0) 
//         throw new IllegalArgumentException(
//            "Gross sales must be >= 0.0");
//
//      this.grossSales = grossSales;
//   } 
//
//   // Return gross sales amount
//   public double getGrossSales()
//   {
//      return grossSales;
//   } 
//
//   // Set commission rate
//   public void setCommissionRate(double commissionRate)
//   {
//      if (commissionRate <= 0.0 || commissionRate >= 1.0)
//         throw new IllegalArgumentException(
//            "Commission rate must be > 0.0 and < 1.0");
//
//      this.commissionRate = commissionRate;
//   } 
//
//   // Return commission rate
//   public double getCommissionRate()
//   {
//      return commissionRate;
//   } 
//
//   // Calculate earnings                 
//   public double earnings()              
//   {                                     
//      return commissionRate * grossSales;
//   } 
//
//   // Return String representation of CommissionEmployee object         
//   @Override // Indicates that this method overrides a superclass method
//   public String toString()                                             
//   {                                                                    
//      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
//         "commission employee", firstName, lastName,                    
//         "social security number", socialSecurityNumber,                
//         "gross sales", grossSales,                                     
//         "commission rate", commissionRate);                           
//   } 
//} // End class CommissionEmployee

// -- Wk9 - CommissionEmployee --