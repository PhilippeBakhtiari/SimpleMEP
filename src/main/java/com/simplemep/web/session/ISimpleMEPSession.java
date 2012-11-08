package com.simplemep.web.session;

import java.util.List;

import com.simplemep.model.IImpact;
import com.simplemep.model.IMEP;

public interface ISimpleMEPSession {
	public List<IImpact> getImpactList();

	public void setImpactList(List<IImpact> impactList);

	public List<IMEP> getMepList();

	public void setMepList(List<IMEP> mepList);
}
