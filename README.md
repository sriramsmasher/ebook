DEVELOPED IN B.S.ABDUR RAHMAN UNIVERSITY---EBOOK MANAGEMENT SYSTEM 

INSTRUCTOR
Dr. Sabiyath Fathima 

TEAM MEMBERS 

B.SRIRAM
120071602004
E-BOOK MANAGEMENT SYSTEM
Add books from a single directory: Opens a file chooser dialog and allows you to specify which books in a
directory should be added. This action is context sensitive, i.e. it depends on which catalog (page 10) you have
selected. If you have selected the Library, books will be added to the library. If you have selected the ebook
reader device, the books will be uploaded to the device, and so on.

2. Add books from directories, including sub-directories (One book per directory, assumes every ebook file
is the same book in a different format): Allows you to choose a directory. The directory and all its subdirectories
are scanned recursively, and any ebooks found are added to the library. calibre assumes that each
directory contains a single book. All ebook files in a directory are assumed to be the same book in different
formats. This action is the inverse of the Save to disk (page 8) action, i.e. you can Save to disk, delete the books
and re-add them with no lost information except for the date (this assumes you have not changed any of the
setting for the Save to disk action).

3. Add books from directories, including sub-directories (Multiple books per directory, assumes every ebook
file is a different book): Allows you to choose a directory. The directory and all its sub-directories are scanned
recursively and any ebooks found are added to the library. calibre assumes that each directory contains many
books. All ebook files with the same name in a directory are assumed to be the same book in different formats.
Ebooks with different names are added as different books.

4. Add multiple books from archive (ZIP/RAR): Allows you to add multiple ebooks that are stored inside the
selected ZIP or RAR files. It is a convenient shortcut that avoids having to first unzip the archive and then add
the books via one of the above two options.

5. Add empty book. (Book Entry with no formats): Allows you to create a blank book record. This can be used
to then manually fill out the information about a book that you may not have yet in your collection.

6. Add from ISBN: Allows you to add one or more books by entering their ISBNs.

7. Add files to selected book records: Allows you to add or update the files associated with an existing book in
your library.
The Add books action can read metadata from a wide variety of ebook formats. In addition, it tries to guess metadata
from the filename. See the Guessing metadata from file names

The project was developed as a part of the curriculum for the course IP lab(CS405).

