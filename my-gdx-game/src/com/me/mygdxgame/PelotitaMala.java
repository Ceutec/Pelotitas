package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;

public class PelotitaMala extends Pelotita{
	
	public PelotitaMala(int x, int y)
	{
		super(x,y, new Texture("data/heartblack.png"));
		this.addListener(new MiInputMala(this));
		this.setX(x);
		this.setY(y);
	}

}
