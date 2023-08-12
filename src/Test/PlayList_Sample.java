package Test;

import java.util.LinkedList;

public class PlayList_Sample
{
	    private LinkedList<String> songs;
	    private int capacity;

	    public PlayList_Sample(int capacity) {
	        this.capacity = capacity;
	        songs = new LinkedList<>();
	    }

	    public void playSong(String song) {
	        if (songs.size() >= capacity) {
	            songs.removeFirst(); // Remove the oldest song
	        }
	        songs.addLast(song); // Add the new song to the end
	    }

	    public void printPlaylist() {
	        for (String song : songs) {
	            System.out.println(song);
	        }
	    }

	    public static void main(String[] args) {
	        PlayList_Sample playlist = new PlayList_Sample(3);

	        playlist.playSong("S1");
	        playlist.playSong("S2");
	        playlist.playSong("S3");

	        System.out.println("Playlist after first 3 songs:");
	        playlist.printPlaylist();

	        playlist.playSong("S4");
	        System.out.println("\nPlaylist after playing S4:");
	        playlist.printPlaylist();

	        playlist.playSong("S2");
	        System.out.println("\nPlaylist after playing S2:");
	        playlist.printPlaylist();

	        playlist.playSong("S1");
	        System.out.println("\nPlaylist after playing S1:");
	        playlist.printPlaylist();
	    }
	}

	


