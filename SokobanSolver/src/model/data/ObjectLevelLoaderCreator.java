package model.data;

// Object File
public class ObjectLevelLoaderCreator extends LevelLoaderCreator {

	public ObjectLevelLoaderCreator(String path) {
		super(path);
	}

	public LevelLoader create() {
		return new MyObjectLevelLoader();
	}
}
