package br.com.mv.soul.ffch.forms.ConsultaPaciente.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;

public class AtendimeAdapter extends BaseRowAdapter {

	public AtendimeAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NNumber getCdAtendimento() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("CD_ATENDIMENTO"));
		return v;
	}
	
	public void setCdAtendimento(NNumber value) {
		this.setValue("CD_ATENDIMENTO", value.getValue());
	}

	public NNumber getCdConvenio() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("CD_CONVENIO"));
		return v;
	}
	
	public void setCdConvenio(NNumber value) {
		this.setValue("CD_CONVENIO", value.getValue());
		
	}

	public NString getNmConvenio() {
		NString v = new NString((String)this.getValue("NM_CONVENIO"));
		return v;
	}
	
	public void setNmConvenio(NString value) {
		this.setValue("NM_CONVENIO", value.getValue());
		
	}
	
	public NDate getDtAtendimento() {
		NDate v = new NDate((java.util.Date)this.getValue("DT_ATENDIMENTO"));
		return v;
	}
	
	public void setDtAtendimento(NDate value) {
		this.setValue("DT_ATENDIMENTO", value.getValue());
	}

	public NDate getHrAtendimento() {
		NDate v = new NDate((java.util.Date)this.getValue("HR_ATENDIMENTO"));
		return v;
	}
	
	public void setHrAtendimento(NDate value) {
		this.setValue("HR_ATENDIMENTO", value.getValue());
	}

	public NNumber getCdPaciente() {
		NNumber v = new NNumber((BigDecimal) this.getValue("CD_PACIENTE"));
		return v;
	}

	public void setCdPaciente(NNumber value) {
		this.setValue("CD_PACIENTE", value.getValue());
	}

}