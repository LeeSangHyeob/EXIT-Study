public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song slow = this;
        Song fast = this;
        
        while(fast.nextSong != null && fast.nextSong.nextSong != null){
            slow = slow.nextSong;
            fast = fast.nextSong.nextSong;
            if(slow == fast) return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
