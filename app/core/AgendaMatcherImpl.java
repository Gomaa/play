package core;

import java.util.List;

import model.Agenda;
import model.BasicInformation;
import model.Meeting;

public class AgendaMatcherImpl implements IDMatcher {

	@Override
	public BasicInformation match(Integer id, List<Meeting> meetingList) {
		for(Meeting meeting : meetingList)
			for(Agenda agenda : meeting.getAgendaList())
				if(agenda.getId().equals(id))
					return agenda;
		return null;
		
	}

}
