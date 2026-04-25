/*Write a Java program to simulate a Music Playlist using LinkedList<String>. Perform the
following operations:
1. Add songs to the playlist.
2. Display the full playlist.
3. Play the first song (remove from front).
4. Skip the last song (remove from end).
5. Display the updated playlist after each operation. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist after adding songs:");
        System.out.println(playlist);

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        // 3. Play first song (remove from front)
        System.out.println("\nPlaying: " + playlist.removeFirst());

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song (remove from end)
        System.out.println("\nSkipping last song: " + playlist.removeLast());

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
