package Day1.Adapter;

interface MediaPlayer {
    public void play();
}

class MP3Player implements MediaPlayer {
    public void play() {
        System.out.println("Playing MP3..!");
    }
}

class MP4Player{
    public void playVideo() {
        System.out.println("Playing MP4..!");
    }
}

class MediaAdapter implements MediaPlayer {
    MP4Player mp4;
    MediaAdapter(MP4Player mp4) {
        this.mp4 = mp4;
    }

    public void play() {
        mp4.playVideo();
    }
}

public class AdapterSolution {
    public static void main(String args[]) {
        MP3Player mp3 = new MP3Player();
        mp3.play();
        MP4Player mp4 = new MP4Player();
        mp4.playVideo();
        MediaAdapter mp4to3 = new MediaAdapter(mp4);
        mp4to3.play();
    }
}