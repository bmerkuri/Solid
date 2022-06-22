package i.done;

import java.time.LocalDateTime;

public interface LibraryBorrower {
    LocalDateTime getBorrowDate();

    String getBorrower();
    String getLibraryId();

}
