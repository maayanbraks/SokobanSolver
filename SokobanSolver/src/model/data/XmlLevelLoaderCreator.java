package model.data;

// XML File
public class XmlLevelLoaderCreator extends LevelLoaderCreator {
	public XmlLevelLoaderCreator(String path) {
		super(path);
	}

	public LevelLoader create() {
		return new MyXMLLevelLoader();
	}
}
