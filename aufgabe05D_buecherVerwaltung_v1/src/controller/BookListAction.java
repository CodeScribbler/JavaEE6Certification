package controller;

import model.Book;
import model.BookService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookListAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService = BookService.getInstance();
        List<Book> bookList = bookService.getBookList();
        request.setAttribute("bookList", bookList);
        request.getRequestDispatcher("/bookList.jsp").forward(request, response);
    }

}
