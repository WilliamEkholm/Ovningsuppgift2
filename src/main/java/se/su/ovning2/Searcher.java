package se.su.ovning2;

import java.util.*;

public class Searcher implements SearchOperations {

  private Set<Recording> recordings;
  private Set<String> artists;
  private Set<String> genres;
  private Map<String, Set<Recording>> artistMap; // Artist -> Set of Recordings
  private Map<String, Set<Recording>> genreMap;  // Genre -> Set of Recordings
  private Map<String, Recording> titleMap;       // Title -> Recording

  public Searcher(Collection<Recording> data) {
    Collection<Recording> recordingsTemp = data;
    recordings = new HashSet<>();
    artists = new HashSet<>();
    genres = new HashSet<>();
    artistMap = new HashMap<>();
    genreMap = new HashMap<>();
    titleMap = new HashMap<>();

    for(Recording recording: data){
      recordings.add(recording);
      artists.add(recording.getArtist());
      genres.addAll(recording.getGenre());

      String artist = recording.getArtist();

      if(!artistMap.containsKey(artist)){
        Set<Recording> artistRecordings= new HashSet<>();
        artistMap.put(artist, artistRecordings);
      }

      artistMap.get(artist).add(recording);

      Collection<String> RecordingGenres = recording.getGenre();

      for(String g: RecordingGenres) {
        if (!genreMap.containsKey(g)) {
          Set<Recording> genre = new HashSet<>();
          genreMap.put(g, genre);
        }
        genreMap.get(g).add(recording);
      }

      titleMap.put(recording.getTitle(), recording);

    }
  }



  @Override
  public long numberOfArtists() {
    System.out.println(artists);
    throw new UnsupportedOperationException("Unimplemented method 'numberOfArtists'");
  }

  @Override
  public long numberOfGenres() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfGenres'");
  }

  @Override
  public long numberOfTitles() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfTitles'");
  }

  @Override
  public boolean doesArtistExist(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'doesArtistExist'");
  }

  @Override
  public Collection<String> getGenres() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}
