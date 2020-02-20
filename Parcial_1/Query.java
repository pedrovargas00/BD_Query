import java.util.*;

class Query{

  public Query(){

  }

  public void consulta(String linea){


  }

  public ArrayList<String> divide(BufferedReader bf)throws IOException {

    ArrayList<String> entrada = new ArrayList();
    String[] in;
    String auxiliar;

    while((auxiliar = bf.readLine()) != null){
      in = auxiliar.split(",");
      for(int i = 0; i < in.length; i++)
        entrada.add(in[i]);
    }

    return entrada;
  }

  public void read(String nombre)throws IOException, FileNotFoundException {

    BufferedReader bf = new BufferedReader(new FileReader(nombre));
    ArrayList<String> entrada = new ArrayList();
    int j = 0;

    if(bf.ready() == false){
      System.out.println("El archivo está vacío");
    }

    entrada.addAll(divide(bf));

    }

}
