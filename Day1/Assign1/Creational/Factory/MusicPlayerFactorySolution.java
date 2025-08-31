package Day1.Assign1.Creational.Factory;

interface AudioPlayer {
    public void play();
}

class MP3_Player implements AudioPlayer {
    public void play() {
        System.out.println("Playing an MP3 song file..!");
    }
}

class WAV_Player implements AudioPlayer {
    public void play() {
        System.out.println("Playing an WAV song file..!");
    }
}

class AAC_Player implements AudioPlayer {
    public void play() {
        System.out.println("Playing an .AAC song file..!");
    }
}

class AudioPlayerFactory {
    public static AudioPlayer getPlayer(String type) {
        switch (type) {
            case ".mp3":
                return new MP3_Player();
            case ".wav":
                return new WAV_Player();
            case ".aac":
                return new AAC_Player();
        }
        return null;
    }
}

public class MusicPlayerFactorySolution {
    public static void main(String[] args) {
        AudioPlayer ap = AudioPlayerFactory.getPlayer(".mp3");
        ap.play();
        ap = AudioPlayerFactory.getPlayer(".wav");
        ap.play();
        ap = AudioPlayerFactory.getPlayer(".aac");
        ap.play();
    }
}
