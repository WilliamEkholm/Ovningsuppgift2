package se.su.ovning2;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public class Recording {
  private final int year;
  private final String artist;
  private final String title;
  private final String type;
  private final Set<String> genre;

  public Recording(String title, String artist, int year, String type, Set<String> genre) {
    this.title = title;
    this.year = year;
    this.artist = artist;
    this.type = type;
    this.genre = genre;
  }

  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    }
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Recording other = (Recording) obj;
    if(Objects.equals(other.title, title)&& Objects.equals(other.artist, artist) && year == other.year){
      return true;
    }
    return false;
  }

  public int hashCode(){
    return Objects.hash(title, artist, year);
  }

  public String getArtist() {
    return artist;
  }

  public Collection<String> getGenre() {
    return genre;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return String.format("{ %s | %s | %s | %d | %s }", artist, title, genre, year, type);
  }
}
