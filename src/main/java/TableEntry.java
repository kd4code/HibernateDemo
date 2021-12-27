

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TableEntry {
    
    public static void main(String[] args) {
    	 System.out.println("Please Enter the Data ..");
    	 Marks ms=new Marks();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Roll no:");
		 ms.setRoll(sc.nextInt());
		 System.out.println("Enter the Name:");
		 sc.nextLine();
		 ms.setName(sc.nextLine());
		 ms.setMarks();
		 AverageClass ac=new AverageClass();
		 ms.avg= ac.average(ms.getMarks());
		 
		 SessionFactory sf;
		 Session s; 
		 
	     Configuration cf=new Configuration();
		 cf.configure();
	     sf=cf.buildSessionFactory();
//		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("").build();  
//         Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
//         sf = meta.getSessionFactoryBuilder().build();  
		 s=sf.openSession();
		 Transaction ts=s.beginTransaction();
		 
		 s.save(ms);
		 ts.commit();
		 System.out.println("Data Added Successfully");
		 s.close();
		 sf.close();
		 
	}
}
