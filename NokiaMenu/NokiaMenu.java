import java.util.Scanner;
public class NokiaMenu{
static Scanner scanner = new Scanner(System.in);
public static void main(String... args){

accessMenu();

}
public static void phoneOption(){
  String phoneOptionMenu =""" 
                       Options
                        1.Memory in use
                        2.Type of view
                        3.Memory status
                        0. to go back
                    """;
  while(true){
        System.out.print(phoneOptionMenu);
        int optionChoice = scanner.nextInt();
        switch (optionChoice){
            case 1:
                System.out.print("This is Memory in use");
                break;
            case 2:
                System.out.print("This is Type of View");
                break;
            case 3:
                System.out.print("This is Memory Status");
                break;
            case 0: 
                break;
                }
        if (optionChoice == 0){
            break;
        }
            
}
}
public static void phoneBook(){
 String phoneBookMenu ="""
        1.Search
        2.Service Nos
        3.Add name
        4.Erase
        5.Edit
        6.Copy
        7.Assign Tone
        8.Send b'card
        9.Options
        10.Speech dials
        11.Voice tags
        0.Go back
    """;
    while(true){
    System.out.print(phoneBookMenu);
        int phoneChoice = scanner.nextInt();
        switch (phoneChoice){
            case 1:
               System.out.println("You are now searching the phone book");
            case 2:
               System.out.print("This is Service No ");
               break;
            case 3:
               System.out.print("This is Add Name");
               break;
            case 4:
               System.out.print("This Erase Name");
               break;
            case 5:
               System.out.print("This Edit Name");
               break;
            case 6:
               System.out.print("This Copy Name");
               break;
            case 7:
               System.out.print("This Assign Tone");
               break;
            case 8:
               System.out.print("This Send b'card");
               break;
            case 9:
                phoneOption();
                break;
            case 10:
               System.out.print("This is Speed dials");
               break;
            case 11:
               System.out.print("This is Voice tags");
               break;
            case 0:
                break;
                }
        if (phoneChoice == 0){
            break;
          }
            }
}
public static void messageSetting(){
String settingMenu =""" 
               1.Set 1
                2.Common
                0.Go back
                  """;
while(true){
System.out.print(settingMenu);
int settingChoice = scanner.nextInt();
switch(settingChoice){
case 1:
 String set1Menu =""" 
               1.Message center number
               2.Message sent as
               3.Message validity  
               0. Go back
                """;             
                            
  while(true){
  System.out.println(set1Menu);
   int set1Choice = scanner.nextInt();
   switch (set1Choice){
    case 1:
         System.out.print("Message center number");
         break;
    case 2:
         System.out.print("Message sent as");
         break;
    case 3:
         System.out.print("Message validity");
         break;
    case 0:
         break;
                                 
   }
   if (set1Choice == 0){
   break;
   } 
}
  case 2:
 String commonMenu =""" 
                   1.Delivery Report
                    2.Reply via same center
                    3.Character Support 
                     0. Go back
                      """;
                            
    while(true){
    System.out.print(commonMenu);
   int commonChoice = scanner.nextInt();
     switch(commonChoice){
     case 1:
        System.out.print("Delivery Report");
        break;
    case 2:
      System.out.print("Reply via same center");
      break;
    case 3:
      System.out.print("Character Support");
     case 0:
      break;
     }
                                    
      if (commonChoice== 0){
      break;
      }                                                 
                                      
    }
                                
                               
case 0:
   break;    
   
}
if  (settingChoice == 0){
    break;
}                                                             
}
}


public static void messages(){
 String  messageMenu ="""
    
        1. Write messages 
        2. Inbox 
        3. Outbox 
        4. Picture messages 
        5. Templates 
        6. Smileys 
        7. Message settings
        8. Info service 
        9. Voice mailbox number 
        10. Service command editor
        0.Go Back
        
    """;
while(true){
System.out.println(messageMenu);
int messageChoice = scanner.nextInt();
switch (messageChoice){
case 1:
    System.out.print("You are now Writing message");
    break;
case 2:
  System.out.print("Checking Inbox.");
  break;
case 3:
  System.out.print("Seeing your Outlook");
  break;
case 4:
  System.out.print("Picture Message");
  break;
case 5:
  System.out.print("This a template");
  break;
case 6:
 System.out.print("This is Smiley") ;
 break;
case 7:
  messageSetting();
  break;
case 8:
   System.out.print("Info Service");
   break;
case 9:
 System.out.print("Voice mailbox number") ;
 break;
case 10:
 System.out.print("Service command editor") ;
 break;
case 0:
  break;
}
if (messageChoice ==0){
break;
} 
}
}
public static void chat(){
    System.out.print("Chat");
}
public static void duration(){
String durationMenu="""
                1.Last call duration
                2.All call duration
                3.Received calls' duration
                4.Dialed calls' duration
                5.Clear timer
                0.Go back
                """;
 while(true){
 System.out.println(durationMenu);
int durationChoice = scanner.nextInt();
switch(durationChoice){
case 1:
    System.out.println("Last call duration");
    break;
case 2:
     System.out.println("All call duration");
     break;
case 3:
    System.out.println("Received calls' duration");
    break;
case 4:
   System.out.println("Dialed calls' duration");
   break;
case 5:
    System.out.println("Clear timer");
    break;
case 0:
  break;
}
if (durationChoice == 0){
break;
}
 }                       
}
public static void callRegister(){
String callMenu ="""
    
        1. Missed Call 
        2. Received Call
        3. Dialed numbers
        4. Erase Recent Call List 
        5. Show call duration
        6. Show call cost
        7. Call cost setting
        8. Prepaid credit
        0.Go Back
        
    """ ;
while (true){
System.out.println(callMenu);
int callChoice = scanner.nextInt();
switch (callChoice){
case 1:
  System.out.println("Missed Call");
  break;
case 2:
    System.out.println("Received Calls");
    break;
case 3:
   System.out.println("Dialed Numbers");
   break;
case 4:
    System.out.println("Erase Recent Call List");
    break;
case 5:
    duration();
    break;
case 6:
 String  callCostMenu="""
                 1.Last call cost
                 2.All calls' cost
                  3.Clear counters
                  0.Go back
                """;
    while(true){
        System.out.println(callCostMenu);
     int  callCostChoice = scanner.nextInt();
      switch(callCostChoice){
           case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls' cost");
                break;
            case 3:
                 System.out.println("Clear counters");
                 break;
              case 0:
                   break;
                  }
                    if (callCostChoice == 0){
                   break;
                    }
                
}
case 7:
  System.out.println("Call cost setting");
  break;
case 8:
  System.out.println("Prepaid credit");
  break;
case 0:
  break;
}
if (callChoice==0){
break;
}
}
}            
                 
public static void tones(){
 String  toneMenu ="""
    
        1. Ringing Tone
        2. Ringing Volume
        3. Incoming call alert
        4. Message alert tone
        5. Keypad tones
        6. Warning tones
        7. Vibrating alert
        8. Screen saver
        0.Go Back
        
    """;
while(true){
System.out.println(toneMenu);  
int toneChoice = scanner.nextInt();
switch(toneChoice){
            case 1:
               System.out.println("Ringing Tone");
               break;
            case 2:
               System.out.println("Ringing Volume");
               break;
            case 3:;
               System.out.println("Incoming call alert");
               break;
            case 4:
               System.out.println("Message alert tone");
               break;
            case 5:
               System.out.println("Keypad tones");
               break;
            case 6:
               System.out.println("Warning tones");
               break;
            case 7:
               System.out.println("Vibrating alert");
               break;
            case 8:
               System.out.println("Screen saver");
               break;
            case 0:
                break;
                }
        if (toneChoice == 0){
        break;
        }                                 
}
  }
public static void callSetting(){
 String callSettingsMenu="""
                    1.Automatic redial
                    2.Speed dialing
                    3.Call Waiting options
                    4.Own number sending
                    5.Phone line in use
                    6.Automatic Answer
                    0.Go back
                    """;
while(true){
System.out.println(callSettingsMenu);
int callSettingsChoice = scanner.nextInt();
switch(callSettingsChoice){
case 1:
    System.out.println("Automatic redial");
    break;
case 2:
   System.out.println("Speed dialing");
   break;
case 3:
   System.out.println("Call Waiting options");
   break;
case 4:
  System.out.println("Own number sending");
  break;
case 5:
  System.out.println("Phone line in use");
  break;
case 6:
  System.out.println("Automatic Answer");
  break;
case 0:
    break;
     }
   if (callSettingsChoice == 0){
   break;
   }
                        
  }    
}
public static void  phoneSettings(){

String phoneSettingsMenu="""
                    1.Language
                    2.Cell Info display
                    3.Welcome note
                    4.Network selection
                    5.Confirm SIM service action
                    0.Go back
                    """;
while (true){
    System.out.println(phoneSettingsMenu);
    int phoneSettingsChoice = scanner.nextInt();
    switch (phoneSettingsChoice){
    case 1:
        System.out.println("Language");
        break;
    case 2:
       System.out.println("Call Info display");
       break;
    case 3:
        System.out.println("Welcome note");
        break;
    case 4:
        System.out.println("Network selection");
        break;
    case 5:
        System.out.println("Confirm SIM service action");
        break;
    case 0:
       break;
           }
    if (phoneSettingsChoice == 0){
                        break;
                        }
}

}
public static void securitySettings(){

String securitySettingsMenu="""
                    1.PIN code request
                    2.Call barring service
                    3.Fixed dialing
                    4.Closed user group
                    5.Security level
                    6.Change access codes
                    0.Go back
                    """;
while(true){
System.out.println(securitySettingsMenu);
int securitySettingsChoice = scanner.nextInt();
switch (securitySettingsChoice){
case 1:
    System.out.println("PIN code request");
    break;
case 2:
    System.out.println("Call barring service");
    break;
case 3:
    System.out.println("Fixed dialing");
    break;
case 4:
    System.out.println("Closed user group");
    break;
case 5:
    System.out.println("Security level");
    break;
case 6:
    System.out.println("Change access codes");
    break;
case 0:
    break;
 }              
 if (securitySettingsChoice == 0){
 break;
 }
                   
                
}
}
public static void setting(){
 String settingMenu="""
                1.Call Settings
                2.Phone Settings
                3.Security Settings
                4.Restore Factory Settings
                0.Go back
                """;
while (true){
        System.out.println(settingMenu);
        int settingChoice = scanner.nextInt();
        switch (settingChoice){
            case 1:
               callSetting();
               break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
            case 4:
                System.out.println("Restore Factory Settings");
                break;
            case 0:
                break;
               } 
        if (settingChoice == 0){
            break;
   }
   }

}

public static void  callDivert(){
    System.out.println("Diverting call");
  }
public static void music(){
  String  musicMenu="""
        1.Music Player
        2.Radio
        3.Recorder
        4.Track list
        0.Go back
                        
            """;
    while (true){
      System.out.println(musicMenu);
       int musicChoice = scanner.nextInt();
       switch (musicChoice){
        case 1:
                System.out.println("Music Player");
                break;
            case 2:
                System.out.println("Radio");
                break;
            case 3:
                System.out.println("Recorder");
                break;
            case 4:
                System.out.println("Track list");
                break;
            case 0:
                break;
                }
        if (musicChoice == 0){
            break;
}
}
}

public static void games(){
  System.out.println("Games .....");
  }
public static void calculator(){
    System.out.println("Calculator....");
    }
public static void remainder(){
    System.out.println("Reminder...");

 }   
public static void  clock(){
 String  clockMenu="""
        1.Alarm Clock
        2.Clock Setting
        3.Date setting
        4.Stop Watch
        5.Countdown timer
        6.Auto update of date and time
        0.Go back           
            """;
    while(true){
        System.out.println(clockMenu);
        int clockChoice = scanner.nextInt();
        switch (clockChoice){
            case 1:
                System.out.println("Alarm Clock");
                break;
            case 2:
                System.out.println("Clock Setting");
                break;
            case 3:
                System.out.println("Date setting");
                break;
            case 4:
                System.out.println("Stop Watch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            case 0:
                break;
                }
        if (clockChoice == 0){
            break;
            }
}
}
public static void profile(){
    System.out.println("Profiles...");
    }
public static void  service(){
    System.out.println("Service...");
    }
public static void  simService(){
    System.out.println("SIM Services....");
    }
    
public static void accessMenu(){
    String nokiaMenu ="""
        Welcome to Nokia
        1.Phone Book
        2.Messages
        3.Chats
        4.Call register
        5.Tones
        6.Setting
        7.Call divert
        8.Music
        9.Games
        10.Calculator
        11.Reminder
        12.Clock
        13.Profiles
        14.Services
        15.SIM services
        0.Go back
        Select an option:
    """;
    while (true){
        System.out.println(nokiaMenu);
       int  menuChoice = scanner.nextInt();
        switch (menuChoice){ 
            case 1: 
               phoneBook();
               break;
            case 2:
                messages();
                break;
            case 3:
                chat();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                setting();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                music();
                break;
            case 9:
                games();
                break;
            case 10:
                calculator();
                break;
            case 11:
                remainder();
                break;
            case 12:
                clock();
                break;
            case 13:
                profile();
                break;
            case 14:
                service();
                break;
            case 15:
                simService();
                break;
            case 0:
                break;
                }
        if (menuChoice  == 0){
             break;
             }
             }
}
}


