package com.gemserk.games.angryships.components;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.gemserk.prototypes.pixmap.PixmapHelper;

// could be named something like PixmapManager instead if it will be globally used.

public class PixmapWorld implements Disposable {
	
	Array<PixmapHelper> pixmaps = new Array<PixmapHelper>();

	public PixmapWorld() {
		pixmaps = new Array<PixmapHelper>();
	}
	
	public void addPixmap(PixmapHelper pixmap) {
		pixmaps.add(pixmap);
	}
	
	public Array<PixmapHelper> getPixmaps() {
		return pixmaps;
	}

	@Override
	public void dispose() {
		for (int i = 0; i < pixmaps.size; i++) 
			pixmaps.get(i).dispose();
		pixmaps.clear();
	}

	public void reload() {
		for (int i = 0; i < pixmaps.size; i++) 
			pixmaps.get(i).reload();
	}
	
}
