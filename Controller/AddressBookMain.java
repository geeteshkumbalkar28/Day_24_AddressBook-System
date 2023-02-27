package Controller;


import Model.Contacts;
import Exception.*;
import Service.AddressBookImp;

import java.util.LinkedList;
import java.util.Scanner;


public class AddressBookMain
{
    private static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args)
    {

        //  Linkedlist <Contacts>linkedList = new Linkedlist<>();
//        LinkedList<LinkedList<Contacts>> list = new LinkedList<>();
//        LinkedList <Contacts> linkedList = new LinkedList<>();


        int choice=1;

        while(choice!=0)
        {
            AddressBookImp addressBookImp = new AddressBookImp();



            addressBookImp.showCondition();


            choice = SCANNER.nextInt();

            // String poss;
            switch(choice)
            {
                case 1 :
                    try{
                        insertData();
                    }
                    catch (InvalidMobilNoException EMno)
                    {
                        System.out.println(EMno);
                        insertData();
                    }
                    catch (InvalidNameException Ename)
                    {
                        System.out.println(Ename);
                        insertData();
                    }
                    catch (InvalidEmailIdException EEmail)
                    {
                        System.out.println(EEmail);
                        insertData();
                    }


                    //insertInfo.insertData(firstName,lastName,address,city,state,email,zip,phoneNumber);
                    break;
                case 2:
                    addressBookImp.showAllContacts();
                break;
                case 3:
                    addressBookImp.editContactByName();
                break;
                case 4:
                   addressBookImp.removeContactByName();
                break;
                case 5:
                    addressBookImp.searchPersonBystateOrCity();
                break;
                case 6:
                    addressBookImp.displayPersonBystateOrCity();
                break;
                case 7:
                    addressBookImp.countBycityAndState();
                    break;
                case 8:
                    addressBookImp.sortByAlphabeticallyByName();
                    break;
                case 9:
                    addressBookImp.sortEntriesByCityStateOrZip();
                    break;
                case 10:
                    choice=0;
                    System.out.println();
                    System.out.println("---------------------------Thank you--------------------------");
                    System.out.println();
                break;
            }

        }

    }
    public static void insertData()
    {
        AddressBookImp addressBookImp = new AddressBookImp();
        Contacts contacts = new Contacts();
        System.out.println("Enter the first name");
        contacts.setFirstName(SCANNER.next());

        System.out.println("Enter the last name");
        contacts.setLastnames(SCANNER.next());

        System.out.println("Enter the address");
        contacts.setAddress(SCANNER.next());

        System.out.println("Enter the city");
        contacts.setCity(SCANNER.next());

        System.out.println("Enter the state");
        contacts.setState(SCANNER.next());


        System.out.println("Enter the email");
        contacts.setEmail(SCANNER.next());

        System.out.println("Enter the zip");
        contacts.setZip(SCANNER.nextInt());

        System.out.println("Enter the phone number");
        contacts.setPhoneNumber(SCANNER.nextLong());
        addressBookImp.insertContacts(contacts);

    }

}
