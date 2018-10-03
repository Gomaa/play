package core;

import java.util.List;

import model.BasicInformation;
import model.Meeting;

public class MeetingMatcherImpl implements IDMatcher {

	@Override
	public BasicInformation match(Integer id, List<Meeting> meetingList) {
		for(Meeting meeting : meetingList)
			if(meeting.getId().equals(id))
				return meeting;
		return null;
		
	}

}
