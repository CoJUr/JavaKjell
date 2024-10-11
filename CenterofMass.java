public class CenterofMass {
    // this program accepts a list of masses and positions from the user into doubles. It then calculates the center of mass of the system and reports it to the user.
    // the program is written in a way that also allows it to be called from the commandline with an input file to read the numbers from and produce the calculation to the console.


    public static void main(String[] args) 
    {
        // if there are no arguments, we will read from the console
        if (args.length == 0) {
            // read the number of masses from the user
            System.out.println("Enter the number of masses: ");
            int n = IO.readInt();
            // create arrays to store the masses and positions
            double[] masses = new double[n];
            double[] positions = new double[n];
            // read the masses and positions from the user
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the mass of object " + (i + 1) + ": ");
                masses[i] = IO.readDouble();
                System.out.println("Enter the position of object " + (i + 1) + ": ");
                positions[i] = IO.readDouble();
                            }
                        }
                    }
                }
            }
            // calculate the center of mass

            double totalMass = 0;
            double totalPosition = 0;
            for (int i = 0; i < n; i++) {
                totalMass += masses[i];
                totalPosition += masses[i] * positions[i];
            }
            double centerOfMass = totalPosition / totalMass;
            // report the center of mass to the user
            System.out.println("The center of mass is at position " + centerOfMass);
        } else {
            // if there are arguments, we will read from a file
            // read the filename from the arguments
            String filename = args[0];
            // open the file
            IO.openFile(filename);
            // read the number of masses from the file
            int n = IO.readInt();
            // create arrays to store the masses and positions
            double[] masses = new double[n];
            double[] positions = new double[n];
            // read the masses and positions from the file
            for (int i = 0; i < n; i++) {
                masses[i] = IO.readDouble();
                positions[i] = IO.readDouble();
            }
            // calculate the center of mass
            double totalMass = 0;
            double totalPosition = 0;
            for (int i = 0; i < n; i++) {
                totalMass += masses[i];
                totalPosition += masses[i] * positions[i];
            }
            double centerOfMass = totalPosition / totalMass;
            // report the center of mass to the console
            System.out.println("The center of mass is at position " + centerOfMass);
            // close the file
            IO.closeFile();

}
