import java.util.Scanner;

class Main{
    
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double gross_salary;
        double hourly_rate;
        double ot_pay;
        double Basic_Salary = 0;
        int rice_allowance = 0;
        double total;
        String input_password;
        String input_username;
        int att = 3;
        String username = "user123";
        String password = "pass123";
        char More;
        
        System.out.println("System User Login Credentials");
        do{
        System.out.print("Username: ");
        input_username = scanner.nextLine();
        System.out.print("password: ");
        input_password = scanner.nextLine();
        
        if (input_username.equals(username) && input_password.equals(password)){
            
            System.out.println("");
            System.out.println("Welcome to XYZ Company");
            System.out.println("Simple Payroll Master version 1.0");
            System.out.println("Semi Monthly April 16-30");
            do{
            System.out.println("");
            System.out.print("Employee number   : ");
            String Emp_number = scanner.nextLine();
            System.out.print("Status code[R,C]  : ");
            char status_code = scanner.next().charAt(0);
            if (status_code == 'R'){
                System.out.println("Code type         : Regular");
                rice_allowance += 1000;
                System.out.println("Rice Allowance    : " + rice_allowance);
                
            }else if (status_code == 'C'){
                System.out.println("Code type         : Casual");
                System.out.println("Rice Allowance    : " + rice_allowance);
            }else{
                System.out.println("Invalid");
                System.exit(0);
            }
            System.out.print("Basic Salary      : ");
            Basic_Salary = scanner.nextInt();
            hourly_rate = Basic_Salary / 30 / 8;
            System.out.println("Hourly Rate       : " + hourly_rate);
            System.out.print("Total Overtime    : ");
            int total_overtime = scanner.nextInt();
            ot_pay = hourly_rate * total_overtime;
            System.out.println("Computed OT pay   : " + ot_pay);
            gross_salary = Basic_Salary + ot_pay + rice_allowance;
            System.out.println("GROSS Salary PAY  : " + gross_salary);
            
            System.out.print("sss               : ");
            int sss = scanner.nextInt();
            System.out.print("PhilHealth        : ");
            int philHealth = scanner.nextInt();
             System.out.print("Pag-ibig          : ");
            int pagIbig = scanner.nextInt();
             System.out.print("BIR Tax           : ");
            int birTax = scanner.nextInt();
             System.out.print("Others            : ");
            int others = scanner.nextInt();
            total = sss + philHealth + pagIbig + birTax + others;
            System.out.println("Total Deduction   : " + total);
            System.out.println("Net Salary Pay    : " + (gross_salary - total));
            
            System.out.print("Calculate More[y/n] : ");
            More = scanner.next().charAt(0);
            
            
            }while(More == 'y' || More == 'Y');

        }else{
            att -= 1;
            System.out.println("Invalid Username or Password");
            System.out.println("Remaining Attemp: " + att);
            System.out.println("=============================");
        }
        if (att == 0){
             System.out.println("Sorry your account has been disable due to failed attemps.");
             System.exit(0);
        }
        }while (!input_username.equals(username) && !input_password.equals(password));
        
        
        
    }
}