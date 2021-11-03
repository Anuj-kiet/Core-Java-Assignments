package CoreJava;
public class Que1 {

	   private static Que1 singleton = new Que1( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private Que1() { }

	   /* Static 'instance' method */
	   public static Que1 getInstance( ) {
	      return singleton;
	   }
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	}
