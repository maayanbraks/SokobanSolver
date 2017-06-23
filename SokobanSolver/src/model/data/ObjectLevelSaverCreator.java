package model.data;

//OBJECT
public class ObjectLevelSaverCreator extends LevelSaverCreator {
	public ObjectLevelSaverCreator(String path) {
		super(path);
	}

	public LevelSaver create() {
		return new MyObjectLevelSaver();
	}
}
