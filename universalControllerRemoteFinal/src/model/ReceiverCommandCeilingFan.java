package model;

import view.Equipment;

public class ReceiverCommandCeilingFan {

	private String rCeilingFanPower=null;
	private int rCeilingFanSpeed=0;
	private String rCeilingFanDesc=null;

	public void action(Equipment orderStereo) {

		rCeilingFanDesc = orderStereo.getDesc();
		rCeilingFanPower = orderStereo.getPower();
		rCeilingFanSpeed = orderStereo.getFeatures();		

	}

	public void undo(Equipment orderStereo) {

		rCeilingFanDesc = orderStereo.getDesc();
		rCeilingFanPower = orderStereo.getPower();
		rCeilingFanSpeed = orderStereo.getFeatures();
		rCeilingFanPower="off";
		rCeilingFanSpeed=0;

	}

	public String getrCeilingPower() {
		return rCeilingFanPower;
	}

	public int getrCeilingSpeed() {
		return rCeilingFanSpeed;
	}

	public String getRceilingDesc() {
		return rCeilingFanDesc;
	}

}
