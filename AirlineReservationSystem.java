package airlinereservationsystem;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class AirlineReservationSystem 
{
    public static void main(String[] args) 
    {
        // date & time
        Date date = new Date();
        
        // only time
        long CurrentTime = System.currentTimeMillis() + 10800000;
        Date date2 = new Date(CurrentTime);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        String time = sdf.format(date2);
        
        Scanner input = new Scanner(System.in);
        
        boolean[] BusinessSeats = new boolean[10];
        boolean[] EconomySeats = new boolean[10];
        boolean[] LowerEconomySeats = new boolean[10];
        
        // initial all false 
        
        for (int i=0; i<10; i++ )
        {
            BusinessSeats[i] = false;
            EconomySeats[i] = false;
            LowerEconomySeats[i] = false;
        }
        
        int repeat = 1;
        
        // never end until user input exit option
        
        while(repeat == 1)
        {
            
            System.out.println("\n\n- Airline Reservation System -\n");
            
            System.out.println("Please type 1 for Business Class \nPlease type 2 for Economy Class \nPlease type 3 for Lower Economy Class \nPlease type 0 for Exiting");
            
            System.out.print("\nOption : ");
            
            String option = input.next();
            
            System.out.println();
        
            // options 1,2,3,0,wrong entry
            
            switch(option)
            {
                
                // businees option
                
                case "1":
                {
                    boolean status = false;
                    String Class = "";
                    int SNO = 0;
                    boolean Continue = true;
                    
                    for(int i = 0; i<BusinessSeats.length; i++)
                    {
                        if (BusinessSeats[i] == false)
                        {
                            BusinessSeats[i] = true;
                            status =true;
                            Class = "Business";
                            SNO = i+1;
                            break;
                        }
                    }
                    
                    if (status != true)
                    {
                        System.out.print("\nAll seats are booked in Business Class, Do you want to book a seat in Economy Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<EconomySeats.length; i++)
                            {
                                if (EconomySeats[i] == false)
                                {
                                    EconomySeats[i] = true;
                                    status =true;
                                    Class = "Economy";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }

                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.print("\nAll seats are booked in Economy Class, Do you want to book a seat in Lower Economy Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<LowerEconomySeats.length; i++)
                            {
                                if (LowerEconomySeats[i] == false)
                                {
                                    LowerEconomySeats[i] = true;
                                    status =true;
                                    Class = "Lower Economy";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }
                        
                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.println("\n\nSorry We don't have any space in this flight. Next flight leaves in 3 hours at "+ time +"1"
                                + "\n" );
                    }
                    
                    if (status == true)
                    {
                        System.out.println("\n\n|-------------------------------------------|");
                        System.out.println("\t      - Boarding Pass -\n");
                        System.out.println(" Class : "+Class);
                        System.out.println(" Seat No : "+SNO);
                        System.out.println(" Time & Date : "+date.toString());
                        System.out.println("\n|-------------------------------------------|\n");
                    }
                    break;
                }
                
                // economy option
                
                case "2":
                {    
                    boolean status = false;
                    String Class = "";
                    int SNO = 0;
                    boolean Continue = true;
                    
                    for(int i = 0; i<EconomySeats.length; i++)
                    {
                        if (EconomySeats[i] == false)
                        {
                            EconomySeats[i] = true;
                            status =true;
                            Class = "Economy";
                            SNO = i+1;
                            break;
                        }
                    }
                    
                    if (status != true)
                    {
                        System.out.print("\nAll seats are booked in Economy Class, Do you want to book a seat in Lower Economy Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<LowerEconomySeats.length; i++)
                            {
                                if (LowerEconomySeats[i] == false)
                                {
                                    LowerEconomySeats[i] = true;
                                    status =true;
                                    Class = "Lower Economy";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }

                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.print("\nAll seats are booked in Lower Economy Class, Do you want to book a seat in Business Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<BusinessSeats.length; i++)
                            {
                                if (BusinessSeats[i] == false)
                                {
                                    BusinessSeats[i] = true;
                                    status =true;
                                    Class = " Business";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }
                        
                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.println("\n\nSorry We don't have any space in this flight. Next flight leaves in 3 hours at "+ time +"1"
                                + "\n" );
                    }
                    
                    if (status == true)
                    {
                        System.out.println("\n\n|-------------------------------------------|");
                        System.out.println("\t      - Boarding Pass -\n");
                        System.out.println(" Class : "+Class);
                        System.out.println(" Seat No : "+SNO);
                        System.out.println(" Time & Date : "+date.toString());
                        System.out.println("\n|-------------------------------------------|\n");
                    }
                    break;   
                }
                
                // lower economy option
                
                case "3":
                {    
                    boolean status = false;
                    String Class = "";
                    int SNO = 0;
                    boolean Continue = true;
                    
                    for(int i = 0; i<LowerEconomySeats.length; i++)
                    {
                        if (LowerEconomySeats[i] == false)
                        {
                            LowerEconomySeats[i] = true;
                            status =true;
                            Class = "Lower Economy";
                            SNO = i+1;
                            break;
                        }
                    }
                    
                    if (status != true)
                    {
                        System.out.print("\nAll seats are booked in Lower Economy Class, Do you want to book a seat in Economy Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<EconomySeats.length; i++)
                            {
                                if (EconomySeats[i] == false)
                                {
                                    EconomySeats[i] = true;
                                    status =true;
                                    Class = "Economy";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }

                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.print("\nAll seats are booked in Economy Class, Do you want to book a seat in Business Class (y) or (n) : ");
                        String Option2 = input.next(); 
                        
                        if ("y".equals(Option2) || "Y".equals(Option2))
                        {

                            for(int i = 0; i<BusinessSeats.length; i++)
                            {
                                if (BusinessSeats[i] == false)
                                {
                                    BusinessSeats[i] = true;
                                    status =true;
                                    Class = " Business";
                                    SNO = i+1;
                                    break;
                                }
                            }

                        }
                        else
                        {
                            Continue = false;
                            System.out.println("\n\nThank You! for having with us.\n");
                        }
                        
                    }
                    
                    if (status != true && Continue != false)
                    {
                        System.out.println("\n\nSorry We don't have any space in this flight. Next flight leaves in 3 hours at "+ time +"1"
                                + "\n" );
                    }
                    
                    if (status == true)
                    {
                        System.out.println("\n\n|-------------------------------------------|");
                        System.out.println("\t      - Boarding Pass -\n");
                        System.out.println(" Class : "+Class);
                        System.out.println(" Seat No : "+SNO);
                        System.out.println(" Time & Date : "+date.toString());
                        System.out.println("\n|-------------------------------------------|\n");
                    }
                    break;
                
                    
                }
                
                // exit option
                
                case "0":
                {
                    repeat =0;
                    System.out.println("\n\nThank You! for having with us.\n");
                    break;
                }
                
                // wrong entry
                
                default:
                {
                    System.out.print("\nWrong Entry !\n\n");
                }
            }
        
        }
    }
    
}
0