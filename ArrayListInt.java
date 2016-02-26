
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //Contains all the object int
    private int[] enteros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        enteros = new int[0];
    }

    /**
     * Create a new object in the Class
     * @param elemento the value of the new object
     */
    public void add(int elemento){
        int[] aux = new int[enteros.length + 1];
        for(int cont = 0; cont < enteros.length; cont++){
            aux[cont] = enteros[cont];
        }
        aux [enteros.length] = elemento;
        enteros = aux;
    }

    /**
     * Create a new object in the Class
     * @param elemento the value of the new object
     */
    public void add(int index,int elemento){
        if(index <= enteros.length){
            int[] aux = new int[enteros.length + 1];
            int cont2 = 0;
            for(int cont = 0; cont <= enteros.length; cont++){
                if(cont == index){
                    aux[cont2] = elemento;
                    cont++;
                }
                aux[cont] = enteros[cont2];
                cont2++;
            }
            enteros = aux;
        }
    }
}
