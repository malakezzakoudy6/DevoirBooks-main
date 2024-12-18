package emsi.Devoir.Book.mapper;

import emsi.Devoir.Book.Dto.BookDTO;
import emsi.Devoir.Book.Entities.Book;
import org.modelmapper.ModelMapper;

public class bookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromAvionDtoToAvion(BookDTO bookdto){
        return mapper.map(bookdto, Book.class);
    }
    public BookDTO fromAvionToAvionDto(Book book){
        return mapper.map(book, BookDTO.class);
    }

}
