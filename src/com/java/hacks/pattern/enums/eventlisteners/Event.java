package com.java.hacks.pattern.enums.eventlisteners;

public class Event {

	private String name;
	private State state;
	
	public Event() { }
			
	public Event(String name, State state) { 
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
		
}