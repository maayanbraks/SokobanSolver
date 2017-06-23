package model.data;

public class TextLevelSaverCreator extends LevelSaverCreator {

	public TextLevelSaverCreator(String path) {
		super(path);
	}

	public LevelSaver create() {
		return new MyTextLevelSaver();

	}
}
