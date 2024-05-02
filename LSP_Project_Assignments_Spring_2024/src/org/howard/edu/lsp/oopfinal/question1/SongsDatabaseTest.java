package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SongsDatabaseTest {
    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        Set<String> expectedSongs = new HashSet<String>(Arrays.asList("Savage", "Gin and Juice"));
        assertEquals(expectedSongs, db.getSongs("Rap"));
    }
}
