package com.example.demo.strategyandcmd;

public interface Device extends Switchable{
	// 频道+
    public void channelUp();
    // 频道-
    public void channelDown();
    // 音量+
    public void volumeUp();
    // 音量-
    public void volumeDown();
}
