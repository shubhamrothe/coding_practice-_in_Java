                //  1
            //      23
            //      456

                package practice02.NestedForLoop;
                import static java.lang.System.out;
                
                public class Demo1_4
                {
                    public static void main(String[] args)
                    {
                        int i,j, k=1;
                        for(i=1;i<=3;i++)
                        {
                            for(j=1;j<=i;j++)
                            {
                                out.print(k);
                                k++;
                            }
                            out.println();
                        }
                    }   
                }
                