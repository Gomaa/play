package model;

import java.util.List;

public class Meeting extends Item{
	
	
	private List<Agenda> agendaList;

	public List<Agenda> getAgendaList() {
		return agendaList;
	}

	public void setAgendaList(List<Agenda> agendaList) {
		this.agendaList = agendaList;
	}
	
}
