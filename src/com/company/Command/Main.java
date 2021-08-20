package com.company.Command;

public class Main {

    public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff); // 커맨드 로딩
		remote.setCommand(1, kitchenOn, kitchenOff);
		remote.setCommand(2, stereoOnWithCD, stereoOff);

		System.out.println(remote);

		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
    }
}
