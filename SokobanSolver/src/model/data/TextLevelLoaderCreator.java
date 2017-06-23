package model.data;

public class TextLevelLoaderCreator extends LevelLoaderCreator {

	public TextLevelLoaderCreator(String path) {
		super(path);

	}

	@Override
	public LevelLoader create() {

		return new MyTextLevelLoader();
	}
}
