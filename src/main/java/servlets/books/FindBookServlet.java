package servlets.books;

import dao.BookDAO;
import dao.BookshelfDAO;
import dao.impl.BookDAOImpl;
import dao.impl.BookshelfDAOImpl;
import entity.BookEntity;
import entity.BookshelfEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/findBook")
public class FindBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestEnc="ISO-8859-1";
        String clientEnc=req.getParameter("charset");
        if(clientEnc==null) clientEnc="Cp1251";

        //Получение параметра
        String query=req.getParameter("query");
        if(query!=null) {
            query = new String(query.getBytes(requestEnc), clientEnc).toLowerCase();
            List<BookEntity> findBooks = new ArrayList<BookEntity>();
            BookDAO bookDAO = new BookDAOImpl();
            for(BookEntity bs:bookDAO.getAllBooks()){
               if(bs.getNameB().toLowerCase().contains(query) || bs.getBookshelfByIdBs().getNameBs().toLowerCase().contains(query)){
                   findBooks.add(bs);
               }
            }
            req.getSession().setAttribute("books", findBooks);
            req.getRequestDispatcher("books.jsp").forward(req,resp);
        }
    }
}
