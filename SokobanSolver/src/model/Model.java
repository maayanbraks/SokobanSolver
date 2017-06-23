package model;

import model.data.Level2D;
import model.data.LevelLoaderCreator;
import model.data.LevelSaverCreator;
import model.data.Position2D;
import model.policy.MySokobanPolicy;

public interface Model {

	public Level2D getLevel();

	public boolean move(Position2D dest);

	public void setLevel(Level2D lvl);

	public void save(LevelSaverCreator ls);

	public MySokobanPolicy getPolicy();

	public void exit();

	public void load(LevelLoaderCreator lc);

}
