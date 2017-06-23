package model.data;

public class XMLLevelSaverCreator extends LevelSaverCreator {
	public XMLLevelSaverCreator(String path) {
		super(path);
	}

	public LevelSaver create() {
		return new MyXMLLevelSaver();
	}

}
