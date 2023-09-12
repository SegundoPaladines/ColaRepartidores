package cola;


public class Cola {	
     
    public Nodo pri,ult;    
    
    public Cola () {
        pri  =null;
        ult = null;
    }
    
    
    public void insertar(Nodo nue) {
    	
        nue.sig = null;

        if (pri==null)
        {            
            pri = nue;
            ult = pri;
        }
        else
        {
            nue.sig = pri;
            pri = nue;
            
        }
    }

    public String extraer ()
    {
        if (pri!=null)
        {
            String informacion = "Extrayendo: "+pri.repartidor.toString();
            pri = pri.sig;
            return informacion;            
        }
        else
        {
            return "Cola Vacia";
        }
    }
    
    public String[][] imprimir() {
        String info [][] = new String [17][3];
        info[0][0]="No Hay Datos";
        info[0][1]="No Hay Datos";
        info[0][2]="No Hay Datos";
        if (pri!=null)
       	{        
	        Nodo aux=pri;
            int contador=0;	        
	        while (aux!=null) {

                info[contador][0]=aux.repartidor.cod_seguridad+"";
                info[contador][1]=aux.repartidor.nombre;
                info[contador][2]=aux.repartidor.nom_empresa;

                aux=aux.sig;
                contador++;
	        }
	    }

        return info;
    }
    
    
    public void vaciarCola() {
        if (pri!=null)
       	{        
	        pri = null;
            ult = null;         
	    }    
        
    }   
}
