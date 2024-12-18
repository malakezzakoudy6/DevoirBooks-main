package emsi.Devoir.Book.dao.entities.Entities;

import java.util.Date;

public class Book {
        private int id_Book;
        private String title;
        private String resume;
        private String publisher;
        private Date datePublication;
    
        public int getId_Book() {
            return id_Book;
        }
    
        public void setId_Book(int id_Book) {
            this.id_Book = id_Book;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getResume() {
            return resume;
        }
    
        public void setResume(String resume) {
            this.resume = resume;
        }
    
        public String getPublisher() {
            return publisher;
        }
    
        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
    
        public Date getDatePublication() {
            return datePublication;
        }
    
        public void setDatePublication(Date datePublication) {
            this.datePublication = datePublication;
        }
    }
}
