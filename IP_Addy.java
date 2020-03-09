import java.util.Scanner;
/**
 * Write a description of class IP_Address here.
 *
 *4
00000000000000000000000000000000
00000011100000001111111111111111
11001011100001001110010110000000
01010000000100000000000000000001
 *
 *
 * Saulo Bosquez
 * v1.1
 */
public class IP_Addy
{
    private static final int BITS_BYTE=8;
    public static void main()
    {
        System.out.print('\u000c');
        Scanner datos=new Scanner(System.in);
        int num=datos.nextInt();
        for (int k=0;k<num;k++)
        {
            Scanner address=new Scanner(System.in);
            String ipAdd=address.nextLine();
            String newIpAdd=ipAdd.replaceAll("\\s+","");
            for(int i=0;i<newIpAdd.length();i+=BITS_BYTE)
            {
                String bits = newIpAdd.substring(i,i+BITS_BYTE);                
                int deci=Integer.parseInt(bits,2);
                if(i==0)
                {
                    System.out.print(deci);
                }
                else if(i!=0)
                {
                    if(i%32==0)
                    {
                        k++;
                        System.out.println();
                        System.out.print(deci);
                    }
                    else
                    {
                        System.out.print(".");
                        System.out.print(deci);
                    }
                }
            }
            System.out.println();
        }
    }
}