package com.simplemep.business;

import java.util.Date;
import java.util.List;

import com.simplemep.model.IImpact;
import com.simplemep.model.IMEP;

public interface IMEPBusinessController {
	public List<IMEP> getMEPList();
	public void addMEP(String name, Date date, List<IImpact> impactList);
	public void deleteMEP(Integer id);
}
