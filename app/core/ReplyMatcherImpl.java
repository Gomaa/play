package core;

import java.util.List;

import model.Agenda;
import model.BasicInformation;
import model.Meeting;
import model.Reply;

public class ReplyMatcherImpl implements IDMatcher{

	@Override
	public BasicInformation match(Integer id, List<Meeting> meetingList) {
		
		for(Meeting meeting : meetingList)
			for(Agenda agenda : meeting.getAgendaList())
				for(Reply reply : agenda.getReplyList())
					if(reply.getId().equals(id))
						return reply;
		
		
		return null;
	}

}
