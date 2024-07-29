            //   1
            //  121
            // 12321
        //      121
        //       1
            package practice02.NestedForLoop;
            import static java.lang.System.out;
            
            public class Demo1_8
            {
                public static void main(String[] args)
                {
                    int i,j;
                    for(i=1;i<=3;i++)
                    {
                        for(int s=3  ;s>i  ;s--  )
                        {
                            out.print(" ");
                        }
                        for(j=1;j<=i;j++)
                        {
                            out.print(j);
                        }
                        for(int r=i-1;r>=1;r--)
                        out.print(r);
                        out.println();
                    }

                    for(int k=2;k>=1;k--)
                    {
                         for(int m=k;m<=2;m++)
                         out.print(" ");
                        for(int l=1 ;l<=k ;l++)
                        {
                            out.print(l);
                        }
                        for(int n=k-1;n>=1;n--)
                        {
                            out.print(n);
                        }
                        out.println();                                               
                    }
                }  
            }
            