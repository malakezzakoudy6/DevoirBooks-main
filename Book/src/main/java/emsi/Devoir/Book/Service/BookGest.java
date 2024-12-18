package emsi.Devoir.Book.Service;

import emsi.Devoir.Book.Dto.BookDTO;
import emsi.Devoir.Book.Entities.Book;
import emsi.Devoir.Book.mapper.bookMapper;

public class BookGest {

    private bookrepo bookrepository;
    private bookMapper bookMapper;





    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        bookMapper bookMapper = null;
        Book book = bookMapper.fromAvionDtoToAvion(bookDTO);
        avion = avionRepository.save(avion);
        avionDto = avionMapper.fromAvionToAvionDto(avion);
        return avionDto;

        //return avionMapper.fromAvionToAvionDto(avionRepository.save(avionMapper.fromAvionDtoToAvion(avionDto)));
    }
}
