package com.mp.classes;

import com.mp.interfaces.IKnight;
import com.mp.interfaces.IQuest;

public class BraveKnight implements IKnight {
private IQuest quest;

	public BraveKnight(IQuest quest) {
	this.quest = quest;
}

	public void embarkOnQuest() {
		quest.embark();
	}

}
