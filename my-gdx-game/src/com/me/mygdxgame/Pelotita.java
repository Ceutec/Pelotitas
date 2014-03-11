package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	public Pelotita() {
		super(new Texture("data/pelotita.png"));
		this.addListener(new MiInput());
	}

}
