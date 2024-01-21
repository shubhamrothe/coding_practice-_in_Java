/*  ABCDEFGHIJKLMNOPQRST
    ACEGIKMOQS
    ADGJMPS
    AEIMQ    */

    import static java.lang.System.out;
    public class Day3_6
    {
        public static void main(String[] args)
        {
            for(int c=0;c<4;c++)
            {
                for(int j=65;j<=84; )
                {
                    if(c==0)
                   {out.print((char)j);
                     j+=1;}
                     
                     if(c==1)
                     {out.print((char)j);
                        j+=2;}
                        
                     if(c==2)
                        { out.print((char)j);
                            j+=3;}
                           
                     if(c==3)
                            { out.print((char)j);
                                j+=4;}  
                }
                            out.println();
            }
        } 
    }
    
    
    
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*{
        int i,j,k,l;
        for(i=65;i<=84;i++)
            out.print((char)i);
            out.println();
        for(j=65;j<=84;j+=2)
            out.print((char)j);
            out.println();
        for(k=65;k<=84;k+=3)
           out.print((char)k);
           out.println();
        for(l=65;l<=84;l+=4)
           out.print((char)l);
    } */