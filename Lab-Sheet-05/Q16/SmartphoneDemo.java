interface Camera { void takePhoto(); }
interface MusicPlayer { void playMusic(); }
class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Photo captured"); }
    public void playMusic() { System.out.println("Music is playing"); }
}
public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.takePhoto();
        s.playMusic();
    }
}
