package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class MiInputMala extends MiInput {
	MiInputMala(Pelotita param){
		super(param);
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
		System.exit(0);
		return true;
	}
	

}
