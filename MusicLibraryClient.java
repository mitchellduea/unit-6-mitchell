public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album( "a",  "People",  11, 40);
        Album a5 = new Album( "b",  "People",  5, 27);
        Album a6 = new Album( "c",  "People",  14, 50);
        Album a7 = new Album( "d",  "People",  18, 62);
        Album a8 = new Album( "e",  "People",  13, 42);
        Album a9 = new Album( "d",  "People",  12, 44);
        Album a10 = new Album( "f",  "People",  8, 43);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        myLibrary.add(a10);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
/*
        myLibrary.doubleSize();

        System.out.println(myLibrary);
*/
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test selection sort");
        System.out.println("a".compareTo("b"));
        myLibrary.sortByTitle();

        myLibrary.remove(1);
       myLibrary.add(a3);
       System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
         int loc = myLibrary.findTitle("first");
        System.out.println("Found 'first' at index:" + loc);
        System.out.println(myLibrary.getAlbum(loc));

           loc = myLibrary.findTitle("Second");
        System.out.println("Found 'second' at index:" + loc);
        System.out.println(myLibrary.getAlbum(loc));
    }
}
