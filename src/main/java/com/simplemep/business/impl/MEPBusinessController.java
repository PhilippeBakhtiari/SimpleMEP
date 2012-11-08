package com.simplemep.business.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.simplemep.business.IMEPBusinessController;
import com.simplemep.model.IImpact;
import com.simplemep.model.IMEP;

@Service("mepBusinessController")
public class MEPBusinessController implements IMEPBusinessController {
	@Override
	public List<IMEP> getMEPList() {
		return null;
	}

	@Override
	public void addMEP(String name, Date date, List<IImpact> impactList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMEP(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
