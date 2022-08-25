import java.io.*;
import java.util.*;

public class Birmingham {
    public static void main(String[] args) {
        create();    // creates a file
        write();    // writes data to the file
        read();        // reads data in the file
        store();    // stores data in an array
        return;

    }


            // implementations:



            private static void write ()
            // writes data to a file
            {
                try
                {

                    int numero=0;

                    // defines the filename
                    String filename = ("data.txt");
                    // creates new PrintWriter object for writing file
                    PrintWriter out = new PrintWriter (filename);
                    int ñ= 0;
                    int L=0;
                    int numel = 7;
                    int S=0;
                    int Delta_con= L + S + ñ;
                    String msg = "writing %d numbers ... ";
                    System.out.printf(msg, numel);
                    // writes the integers in the range [0, 256)

                    List<Integer> Yuca = new ArrayList<>(); // se crea una lista
                    for (int i = 0; i != numel; ++i) {
                        numero = (int) (Math.random() * 50 + 1);
                        System.out.println(numero);
                        Yuca.add(numero);
                    }
                    long t1= System.nanoTime();
                    //ordenamiento de la lista
                    for (int z= 0; z < Yuca.size() - 1; z++){
                         L=L+1;
                        for (int y = 0; z < Yuca.size() - z - 1; y++){
                            S=S+1;
                            if (Yuca.get(y+1) < Yuca.get(y)){
                                int coge = Yuca.get(y+1);
                                Yuca.set(y+1,Yuca.get(y));
                                Yuca.set(y,coge);
                            }
                        }
                    }
                    System.out.println(Yuca);
                        int contador=0;
                        int aux= Yuca.get(0); //se almacena el primer valor del arreglo

                        for (int x=0;x<Yuca.size();x++){
                            ñ=ñ+1;
                            if (aux==Yuca.get(x)){
                                contador++;
                            }else{
                                System.out.println("El numero "+ aux + " se repite " + contador +" veces");
                                contador=1;
                                aux=Yuca.get(x);

                                long t2= System.nanoTime();
                                long T_total= t2-t1;
                            }

                        }
                    System.out.println(Delta_con);
                    System.out.println("El numero "+ aux + " se repite " + contador +" veces");

                    System.out.println("done");

                    System.out.printf("closing file ... ");
                    out.close();	// closes the output stream
                    System.out.println("done");
                    int camo= Delta_con;
                    String T_total;
                }
                catch (FileNotFoundException err)
                {
                    // complains if file does not exist
                    err.printStackTrace();
                }

                return;
            }
    private static void create ()
    // creates a file
    {
        try
        {
            // defines the filename
            String fname = ("/Escritorio/Birmingham.txt");
            String contenido=(""+T_total+""+camo);
            // creates a new File object
            File f = new File (fname);
            // Si el archivo no existe es creado
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();


        }
        catch (IOException err)
        {
            // complains if there is an Input/Output Error
            err.printStackTrace();
        }

        return;
    }


            private static void read ()
            // reads the file contents and prints them to the console
            {
                // defines the filename
                String filename = ("data.txt");
                // creates a File object
                File f = new File (filename);
                try
                {
                    // attempts to create a Scanner object
                    Scanner in = new Scanner (f);

                    System.out.printf("\nnumbers in file:\n");

                    int x;
                    int count = 0;
                    // reads integers in file until EOF
                    while ( in.hasNextInt() )
                    {
                        // reads  number and prints it
                        x = in.nextInt();
                        System.out.printf("%4d\n", x);
                        ++count;
                    }

                    String msg = ("%d numbers have been read\n");
                    System.out.printf(msg, count);

                    in.close();	// closes the input stream

                }
                catch (FileNotFoundException err)
                {
                    // complains if file does not exist
                    err.printStackTrace();
                }


                return;
            }


            private static void store ()
            // stores the file contents into an array and prints the array
            {
                String filename = "data.txt";
                File f = new File (filename);

                try
                {
                    Scanner in = new Scanner (f);

                    // allocates list for storing the numbers in file
                    int size = lines (filename);
                    int [] list = new int [size];

                    int count = 0;
                    // reads numbers into array
                    while ( in.hasNextInt() )
                    {
                        list[count] = in.nextInt();
                        ++count;
                    }

                    System.out.printf("\nnumbers in array:\n");
                    for (int i = 0; i != size; ++i)
                        System.out.printf("%4d\n", list[i]);

                    String msg = ("array stores %d numbers\n");
                    System.out.printf(msg, count);

                    in.close();	// closes the input stream

                }
                catch (FileNotFoundException err)
                {
                    // complains if file does not exist
                    err.printStackTrace();
                }


                return;
            }


            private static int lines (String filename)
            // counts number of lines (or records) in a file
            {

                int count = 0;
                // creates a File object
                File f = new File (filename);
                try
                {
                    // attempts to create a Scanner object
                    Scanner in = new Scanner (f);

                    // reads integers in file until EOF for counting
                    while ( in.hasNextInt() )
                    {
                        in.nextInt();
                        ++count;
                    }

                    in.close();	// closes the input stream
                }
                catch (FileNotFoundException err)
                {
                    // complains if file does not exist
                    err.printStackTrace();
                }

                return count;
            }

        }

