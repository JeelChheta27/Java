// public class AgeCheck {
//     public static void main(String[] args) {
//         int age = 18;

//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Minor");
//         }
//     }
// }



// public class week {
// public static void main(String[] args) {
// int day = 3;
// String dayName;

// switch (day) {
//     case 1:
//         dayName = "Monday";
//         break;
//     case 2:
//         dayName = "Tuesday";
//         break;
//     case 3:
//         dayName = "Wednesday";
//         break;
//     case 4:
//         dayName = "Thursday";
//         break;
//     case 5:
//         dayName = "Friday";
//         break;
//     case 6:
//         dayName = "Saturday";
//         break;
//     case 7:
//         dayName = "Sunday";
//         break;
//     default:
//         dayName = "Invalid day";
//         break;
// }

// System.out.println("Day " + day + " is " + dayName);
// }}





// // for loop
// for (int i = 0; i < 5; i++) {
//     System.out.println(i);
// }

// // while loop
// int j = 0;
// while (j < 5) {
//     System.out.println(j);
//     j++;
// }

// // do-while loop
// int k = 0;
// do {
//     System.out.println(k);
//     k++;
// } while (k < 5);




public class numbers {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // exits the loop when i equals 5
    }
    if (i % 2 == 0) {
        continue; // skips even numbers
    }
    System.out.println(i);
}}}
