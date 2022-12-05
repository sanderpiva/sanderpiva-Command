package model;

import view.Equipment;

public class ReceiverCommandStereo {
	
	private String rStereoPower=null;
	private int rStereoSoundVolume=0;
	private String rStereoDesc=null;
	
	public void action(Equipment orderStereo) {
		
		rStereoDesc = orderStereo.getDesc();
		rStereoPower = orderStereo.getPower();
		rStereoSoundVolume = orderStereo.getFeatures();		
		
	}
	

	public void undo(Equipment orderStereo) {

		rStereoDesc = orderStereo.getDesc();
		rStereoPower = orderStereo.getPower();
		rStereoSoundVolume = orderStereo.getFeatures();

	}

	public String getrStereoPower() {
		return rStereoPower;
	}

	public int getrStereoSoundVolume() {
		return rStereoSoundVolume;
	}

	public String getrStereoDesc() {
		return rStereoDesc;
	}

}
