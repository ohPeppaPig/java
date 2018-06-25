package hw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class demo01 {

	public static void main(String[] args) {
		Books books=new Books();
	      Book book=new Book();
	      Book book2=new Book();
	      List<Book>b=new ArrayList<>();
	      book.setName("红楼梦");
	      book.setPrice(123);
	      book2.setName("西游记");
	      book2.setPrice(456);
	      b.add(book);
	      b.add(book2);
	      books.setBooks(b);
	      books.setManage("张三");
	      
		
		try {
			JAXBContext context = JAXBContext.newInstance(Books.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); 
			System.out.println("......");
			marshaller.marshal(books, new File("3.xml") );
			//marshaller.marshal(books, new ObjectOutputStream(new FileOutputStream("2.xml")));
			System.out.println("!!!!!!!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
