package com.infy.service;

import com.infy.dao.CandidateDAO;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public class CandidateService {

	// can have result as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) {
		if(candidate.getResult()=='P' && (candidate.getMark1()<50 || candidate.getMark2()<50 || candidate.getMark3()<50)) 
			return "Result should be 'F' (Fail) if student scores less than 50 in any one subject" ;
		else {	
			CandidateDAO cDAO = new CandidateDAO();
			return cDAO.addCandidate(candidate);	
		}
		
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		if(candidateReportTO.getResult()=='F' )
			return "NA" ;
		else {
			int avg = (candidateReportTO.getMark1()+candidateReportTO.getMark2()+candidateReportTO.getMark3())/3;
			if(avg>=85) return "A";
			else if(avg<85 && avg >=75) return "B";
			else return "C";
		}
	}

	// populating String[] by calling calculateGrade(candidateReportTO) and returning the same.
	public String[] getGradesForAllCandidates() {
		CandidateDAO cDAO = new CandidateDAO();
		CandidateReport[] canArray = cDAO.getAllCandidates();
		int len = canArray.length;
		String[] resultArray = new String[len];
		for(int i=0;i<len;i++) {
			resultArray[i]=canArray[i].getCandidateId()+":"+canArray[i].getCandidateName();
				
		}
		 return resultArray;
	}
}
