package i.done;

import java.time.LocalDateTime;

public interface LibraryItem {

    int getPages();

    String getTitle();
    LocalDateTime getDueDate();
}
