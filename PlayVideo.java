import java.applet.*;
import java.awt.*;
public class PlayVideo extends Applet
{
	private AudioClip clip;
	public void init()
	{
		clip = getAudioClip(getDocumentBase(),"D:\\koshima\\music\\[Songs.PK] 02 - Zid - Tu Zaroori.mp3");
	}
	public void paint(Graphics g)
	{
		clip.play();
		clip.stop();
		clip.loop();
	}
}