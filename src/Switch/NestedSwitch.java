package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1 :
                System.out.println("Saikat Mazumder");
                break;
            case 2 :
                System.out.println("Sudipa Mazumder");
                break;
            case 3 :
                System.out.println("Employee Id is 3");
                switch (department){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Invalid");
                }break;
            default:
                System.out.println("Enter valid number");
        }
    }
}
