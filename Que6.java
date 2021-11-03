package CoreJava;
abstract class Persistence{
	abstract void persist();
	
}
class FilePersistence extends Persistence{
	public void persist() {
		System.out.print("Persist is in FilePersistence\n");
		
	}
	
}
class DatabasePersistence extends Persistence{
	public void persist() {
		System.out.print("Persist is in DatabasePersistence");
		
	}
	
}
public class Que6 {
	public static void main(String args[]) {
		FilePersistence fp = new FilePersistence();
		fp.persist();
		DatabasePersistence dp =new DatabasePersistence();
		dp.persist();
	}

}
