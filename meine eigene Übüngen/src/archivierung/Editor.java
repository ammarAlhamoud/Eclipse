package archivierung;
import java.io.Serializable;                      // Serializable هنا قمنا باستدعاء الإنترفيس
public class Editor implements Serializable
	{public String language;
	public String encoding;
	public String fontSize;
	public String fontFamily;
	public boolean autoSave;
	public boolean autoComplete;
	public transient String direction;
	
	}
