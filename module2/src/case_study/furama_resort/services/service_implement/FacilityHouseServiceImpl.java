//package case_study.furama_resort.services.service_implement;
//
//import case_study.furama_resort.models.Facility;
//import case_study.furama_resort.models.facility_models.House;
//import case_study.furama_resort.models.facility_models.Villa;
//import case_study.furama_resort.services.FacilityHouseService;
//import case_study.furama_resort.utils.CheckRegex;
//import case_study.furama_resort.utils.ReadAndWrite;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//import static case_study.furama_resort.services.service_implement.FacilityServiceImpl.*;
//
//public class FacilityHouseServiceImpl implements FacilityHouseService {
//    Scanner scanner = new Scanner(System.in);
//    List<House> houseListToWrite = new ArrayList<>();
//
//    @Override
//    public void add() {
//        String serviceId;
//        String serviceName;
//        String usableArea;
//        String rentalFee;
//        String maximumPax;
//        String rentalType;
//        String roomStandard;
//        String numOfFloors;
//
//        do {
//            System.out.print("Enter facility-service ID (Format: SVHO-XXXX): ");
//            serviceId = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(serviceId, CheckRegex.HOUSE_SERVICE_ID_REGEX)) {
//                System.out.println("Format should be SVHO-XXXX (X: digit). Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(serviceId, CheckRegex.HOUSE_SERVICE_ID_REGEX));
//
////        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
////            if (serviceId.equals(entry.getKey().getServiceId())) {
////                System.out.println("Add this facility again: " + entry.getKey());
////                entry.setValue(entry.getValue() + 1);
////                return;
////            }
////        }
//        for (House house : ReadAndWrite.houseList) {
//            if (serviceId.equals(house.getServiceId())) {
//                System.out.println("Add this facility again: " + house.getInfo());
//                houseListToWrite.clear();
//                houseListToWrite.add(house);
//                readAndWrite.writeToCsvFile(ReadAndWrite.HOUSE_PATH, houseListToWrite, true);
//                System.out.println("Add new house successfully!");
//                return;
//            }
//        }
//        do {
//            System.out.print("Enter facility-service name (Format: Yy*): ");
//            serviceName = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(serviceName, CheckRegex.STANDARD_STRING_REGEX)) {
//                System.out.println("First character must be in upper case and the remain is in lower case. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(serviceName, CheckRegex.STANDARD_STRING_REGEX));
//
//        do {
//            System.out.print("Enter facility usable area (Format: double, >30): ");
//            usableArea = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(usableArea, CheckRegex.AREA_REGEX)) {
//                System.out.println("Area should be in double format and greater than 30m^2. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(usableArea, CheckRegex.AREA_REGEX));
//
//        do {
//            System.out.print("Enter rental fee (Format: positive integer): ");
//            rentalFee = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(rentalFee, CheckRegex.POSITIVE_INTEGER_REGEX)) {
//                System.out.println("Fee should be a positive integer. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(rentalFee, CheckRegex.POSITIVE_INTEGER_REGEX));
//
//        do {
//            System.out.print("Enter maximum pax (Format: >0 & <20): ");
//            maximumPax = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(maximumPax, CheckRegex.MAX_PAX_REGEX)) {
//                System.out.println("The number of pax should be greater than 0 and less than 20. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(maximumPax, CheckRegex.MAX_PAX_REGEX));
//
//        do {
//            System.out.print("Enter rental type (Format: Yy*): ");
//            rentalType = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(rentalType, CheckRegex.STANDARD_STRING_REGEX)) {
//                System.out.println("First character must be in upper case and the remain is in lower case. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(rentalType, CheckRegex.STANDARD_STRING_REGEX));
//
//        do {
//            System.out.print("Enter room standard (Format: Yy*): ");
//            roomStandard = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(roomStandard, CheckRegex.STANDARD_STRING_REGEX)) {
//                System.out.println("First character must be in upper case and the remain is in lower case. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(roomStandard, CheckRegex.STANDARD_STRING_REGEX));
//
//        do {
//            System.out.print("Enter number of floors (Format: positive integer): ");
//            numOfFloors = scanner.nextLine();
//            if (!CheckRegex.checkingRegex(numOfFloors, CheckRegex.POSITIVE_INTEGER_REGEX)) {
//                System.out.println("The number of floors should be a positive integer. Try again!");
//            }
//        } while (!CheckRegex.checkingRegex(numOfFloors, CheckRegex.POSITIVE_INTEGER_REGEX));
//
////        facilities.put(new House(serviceId, serviceName, usableArea, rentalFee, maximumPax, rentalType, roomStandard, numOfFloors), 0);
//        houseListToWrite.clear();
//        houseListToWrite.add(new House(serviceId, serviceName, usableArea, rentalFee, maximumPax, rentalType, roomStandard, numOfFloors));
//        readAndWrite.writeToCsvFile(ReadAndWrite.HOUSE_PATH, houseListToWrite, true);
//        System.out.println("Add new house successfully!");
//
//    }
//}
