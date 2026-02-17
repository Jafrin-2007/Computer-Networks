Client.java
import java.lang.*; 
import java.io.*; 
import java.net.*;
import java.net.InetAddress;
class client
{
public static void main(String args[])
{
Socket sock=null; 
DataInputStream dis=null; 
PrintStream ps=null;
System.out.println(" Trying to connect"); 
try
{
sock= new Socket(InetAddress.getLocalHost(),Server.PORT); 
ps= new PrintStream(sock.getOutputStream());
ps.println(" Hi from client");
DataInputStream is = new DataInputStream(sock.getInputStream()); 
System.out.println(is.readLine());
}
catch(SocketException e)
{
System.out.println("SocketException " + e);
}
catch(IOException e)
}
Finally 
System.out.println("IOException " + e);
{
try
{
Sock.close();
}
catch(IOException ie)
{
System.out.println(" Close Error :" + ie.getMessage());
}
}
}
}
