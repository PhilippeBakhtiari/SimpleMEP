package com.simplemep.web.session.impl;

import java.util.List;

import com.simplemep.model.IImpact;
import com.simplemep.model.IMEP;
import com.simplemep.web.session.ISimpleMEPSession;

public class SimpleMEPSession implements ISimpleMEPSession {
	private List<IImpact> impactList = null;
	private List<IMEP> mepList = null;

	public List<IMEP> getMepList() {
		return mepList;
	}

	public void setMepList(List<IMEP> mepList) {
		this.mepList = mepList;
	}

	public SimpleMEPSession() {

	}

	public List<IImpact> getImpactList() {
		return impactList;
	}

	public void setImpactList(List<IImpact> impactList) {
		this.impactList = impactList;
	}

}
