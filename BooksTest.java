import org.junit.*;
import static org.junit.Assert.*;


/**
 * Created by Smady91 on 27.04.2017.
 */
public class BooksTest {
    Books book;
    @Before
    public void setUp() throws Exception {
         book = new Books(112233,"Mark","Book Name",123456,1,2017);
    }

    @Test
    public void addTest() throws Exception {
        Books.add(book);
        assertEquals(1,Books.getAnzahl());
        Books.add(book);
        assertEquals(2,Books.getAnzahl());
    }

    @Test
    public void editTest() throws Exception {
        Books.edit(1,new Books(112233,"Mark","Book Name",123456,1,2016));
        assertEquals(2,Books.getBook(1).getErscheinungsjahr(),2016);
    }

    @Test
    public void readTest() throws Exception {
        Books.read(1);
    }

    @Test
    public void entfernenTest() throws Exception {
        Books.entfernen(0);
        assertEquals(1,Books.getAnzahl());
    }

    @Test
    public void readAllTest() throws Exception {
        Books.readAll();
    }

    @Test
    public void toStringTest() throws Exception {
        System.out.println(Books.getBook(0).toString());
    }

}