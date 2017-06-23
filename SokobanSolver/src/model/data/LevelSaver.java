package model.data;

import java.io.IOException;
import java.io.OutputStream;


public interface LevelSaver {
	public void SaveLevel(OutputStream out,Level2D lvl) throws IOException;

}
