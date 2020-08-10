package Enumeration;

// Java program to demonstrate how values can 
// be assigned to enums. 
enum TrafficSignal 
{ 
    // This will call enum constructor with one 
    // String argument 
    RED("STOP"), GREEN("Go"), ORANGE("SLOW DOWN");
  
    // declaring private variable for getting values 
    private String action; 
  
    // getter method 
    public String getAction() 
    { 
        return this.action; 
    } 
  
    // enum constructor - cannot be public or protected 
    //enum constructor is required for customized value and we need to pass a string value and use this class to assign it
    
   // public static final Color GREEN = new Color("GO);
    private TrafficSignal(String action) 
    { 
        this.action = action; 
    } 
} 
  
// Driver code 
public class EnumWithCustomizedValue 
{ 
    public static void main(String args[]) 
    { 
        // let's print name of each enum and there action 
        // - Enum values() examples 
        TrafficSignal[] signals = TrafficSignal.values(); 
  
        for (TrafficSignal signal : signals) 
        { 
            // use getter method to get the value 
            System.out.println("name : " + signal.name() + 
                        " action: " + signal.getAction() ); 
        } 
    } 
} 