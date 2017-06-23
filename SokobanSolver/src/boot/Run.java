package boot;

import java.io.*;
import java.util.HashMap;

import model.MyModel;
import model.data.Level2D;
import model.data.LevelLoaderCreator;
import model.data.ObjectLevelLoaderCreator;
import model.data.TextLevelLoaderCreator;
import model.data.XmlLevelLoaderCreator;
import sokobanSolver.SokoSolution;
import sokobanSolver.SokobanSolver;

public class Run {

	public static void main(String[] args) {

		MyModel model = new MyModel();
		HashMap<String, LevelLoaderCreator> loadHM = new HashMap<String, LevelLoaderCreator>();

		if (args != null && args.length >= 2) {

			String loadPath = args[0];
			String savePath = args[1];

			// initialize HashMaps
			loadHM.put("txt", new TextLevelLoaderCreator(loadPath));
			loadHM.put("xml", new XmlLevelLoaderCreator(loadPath));
			loadHM.put("obj", new ObjectLevelLoaderCreator(loadPath));

			String loadArgType = "";
			loadArgType = args[0].substring(args[0].length() - 3, args[0].length());

			LevelLoaderCreator lc = loadHM.get(loadArgType);
			model.load(lc);
			Level2D level = model.getLevel();

			try {
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(savePath)));

				SokobanSolver solver = new SokobanSolver();
				SokoSolution solution;
				solution = solver.solveLevel(level);
				System.out.println("OK");

				writer.write("********************\n" + "******" + level.getId() + "******" + "\n");
				writer.write(solution.toString());
				writer.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
