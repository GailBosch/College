// -- Wk 10 - AbstractClasses --
public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary; // Base salary per week

   // Constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales,
      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);

      if (baseSalary < 0.0) // Validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   }

   // Set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   } 

   // Return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // Calculate earnings; override method earnings in CommissionEmployee
   @Override                                                            
   public double earnings()                                             
   {                                                                    
      return getBaseSalary() + super.earnings();                        
   } 

   // Return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary());                             
   } 
} 

// -- Wk 10 - Polymorphism --
//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
//   private double baseSalary; // base salary per week
//
//   // six-argument constructor
//   public BasePlusCommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate, double baseSalary)
//   {
//      super(firstName, lastName, socialSecurityNumber, 
//         grossSales, commissionRate);                      
//
//      // if baseSalary is invalid throw exception
//      if (baseSalary < 0.0)                   
//         throw new IllegalArgumentException(
//            "Base salary must be >= 0.0");  
//
//      this.baseSalary = baseSalary;
//   }
//   
//   // set base salary
//   public void setBaseSalary(double baseSalary)
//   {
//      if (baseSalary < 0.0)                   
//         throw new IllegalArgumentException(
//            "Base salary must be >= 0.0");  
//
//      this.baseSalary = baseSalary;                
//   } 
//
//   // return base salary
//   public double getBaseSalary()
//   {
//      return baseSalary;
//   } 
//
//   // calculate earnings
//   @Override 
//   public double earnings()
//   {
//      return getBaseSalary() + super.earnings();
//   }
//
//   // return String representation of BasePlusCommissionEmployee
//   @Override
//   public String toString()
//   {
//      return String.format("%s %s%n%s: %.2f", "base-salaried",
//         super.toString(), "base salary", getBaseSalary());   
//   } 
//}

// -- Wk 10 - BasePlusCommissionEmployee4 --
//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
//   private double baseSalary; // Base salary per week
//
//   // Six-argument constructor
//   public BasePlusCommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate, double baseSalary)
//   {
//      super(firstName, lastName, socialSecurityNumber, 
//         grossSales, commissionRate);
//
//      // If baseSalary is invalid throw exception
//      if (baseSalary < 0.0)                      
//         throw new IllegalArgumentException(    
//            "Base salary must be >= 0.0");       
//
//      this.baseSalary = baseSalary;
//   } 
//   
//   // Set base salary
//   public void setBaseSalary(double baseSalary)
//   {
//      if (baseSalary < 0.0)
//         throw new IllegalArgumentException(
//            "Base salary must be >= 0.0");
//
//      this.baseSalary = baseSalary;
//   }
//
//   // Return base salary
//   public double getBaseSalary()
//   {
//      return baseSalary;
//   }
//
//   // Calculate earnings
//   @Override 
//   public double earnings()
//   {
//      return getBaseSalary() + super.earnings();
//   } 
//
//   // Return String representation of BasePlusCommissionEmployee
//   @Override 
//   public String toString()
//   {
//    return String.format("%s %s%n%s: %.2f", "base-salaried",
//       super.toString(), "base salary", getBaseSalary());
//   } 
//} // End class BasePlusCommissionEmployee

// -- Wk 9 - BasePlusCommissionEmployee2 --
//public class BasePlusCommissionEmployee extends CommissionEmployee
//{
//   private double baseSalary; // base salary per week
//
//   // Six-argument constructor
//   public BasePlusCommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate, double baseSalary)
//   {
//      // Explicit call to superclass CommissionEmployee constructor
//      super(firstName, lastName, socialSecurityNumber, 
//         grossSales, commissionRate);
//
//      // If baseSalary is invalid throw exception
//      if (baseSalary < 0.0)                      
//         throw new IllegalArgumentException(    
//            "Base salary must be >= 0.0");       
//
//      this.baseSalary = baseSalary;
//   } 
//   
//   // Set base salary
//   public void setBaseSalary(double baseSalary)
//   {
//      if (baseSalary < 0.0)
//         throw new IllegalArgumentException(
//            "Base salary must be >= 0.0");
//
//      this.baseSalary = baseSalary;
//   } 
//
//   // Return base salary
//   public double getBaseSalary()
//   {
//      return baseSalary;
//   } 
//
//   // Calculate earnings
//  @Override 
//   public double earnings()
//   {
//      // Not allowed: commissionRate and grossSales private in superclass
//      return baseSalary + (commissionRate * grossSales);
//   } 
//
//   // Return String representation of BasePlusCommissionEmployee
//   @Override 
//   public String toString()
//   {
//      // Not allowed: attempts to access private superclass members   
//      return String.format(
//         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
//         "base-salaried commission employee", firstName, lastName, 
//         "social security number", socialSecurityNumber, 
//         "gross sales", grossSales, "commission rate", commissionRate, 
//         "base salary", baseSalary);
//   } 
//} // End class BasePlusCommissionEmployee

// -- Wk 9 - BasePlusCommissionEmployee1 --
//public class BasePlusCommissionEmployee
//{
//   private final String firstName;
//   private final String lastName;
//   private final String socialSecurityNumber;
//   private double grossSales; // Gross weekly sales
//   private double commissionRate; // Commission percentage
//   private double baseSalary; // Base salary per week
//
//   // Six-argument constructor
//   public BasePlusCommissionEmployee(String firstName, String lastName, 
//      String socialSecurityNumber, double grossSales, 
//      double commissionRate, double baseSalary)
//   {
//      // Implicit call to Object's default constructor occurs here
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
//      // If baseSalary is invalid throw exception
//      if (baseSalary < 0.0)                      
//         throw new IllegalArgumentException(    
//            "Base salary must be >= 0.0");       
//
//      this.firstName = firstName;
//      this.lastName = lastName;
//      this.socialSecurityNumber = socialSecurityNumber;
//      this.grossSales = grossSales;
//      this.commissionRate = commissionRate;
//      this.baseSalary = baseSalary;
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
//   // Set base salary
//   public void setBaseSalary(double baseSalary)
//   {
//      if (baseSalary < 0.0)
//         throw new IllegalArgumentException(
//            "Base salary must be >= 0.0");
//
//      this.baseSalary = baseSalary;
//   } 
//
//   // Return base salary
//   public double getBaseSalary()
//   {
//      return baseSalary;
//   } 
//
//   // Calculate earnings
//   public double earnings()
//   {
//      return baseSalary + (commissionRate * grossSales);
//   } 
//
//   // Return String representation of BasePlusCommissionEmployee
//   @Override 
//   public String toString()
//   {
//      return String.format(
//         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
//         "base-salaried commission employee", firstName, lastName, 
//         "social security number", socialSecurityNumber, 
//         "gross sales", grossSales, "commission rate", commissionRate, 
//         "base salary", baseSalary);
//   }
//} // End class BasePlusCommissionEmployee