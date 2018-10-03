package core;

import java.util.List;

import model.BasicInformation;
import model.Meeting;

public interface IDMatcher {

	
	public BasicInformation match(Integer id, List <Meeting> meetingList);
}
