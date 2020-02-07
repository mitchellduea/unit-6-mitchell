public class MusicLibrary{
   private Album[] library;
   public MusicLibrary(){
     library = new Album[10];
   }
   public boolean add(Album album){
     for(int i = 0; i < library.length; i++){
       if(library[i] == null){
       library[i] = album;
       return true;
     }
     }
     return false;
   }
   public boolean remove(int index){
     if (index >= 0 && index< library.length && library[index] != null){
       library[index] = null;
       return true;
     }
     return false;
   }
   public String toString(){
     String result = "";
     for(Album album : library){
       if(album != null)
        result += album.toString() + "\n";
     }
     return result;
   }
}
