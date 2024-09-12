package br.com.mv.soul.ffch.forms.ConsultaPaciente.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;

public class PacienteAdapter extends BaseRowAdapter {

	public PacienteAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NNumber getCdPaciente() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("CD_PACIENTE"));
		return v;
	}
	
	public void setCdPaciente(NNumber value) {
		this.setValue("CD_PACIENTE", value.getValue());
	}

	public NString getNmPaciente() {
		NString v = new NString((String)this.getValue("NM_PACIENTE"));
		return v;
	}
	
	public void setNmPaciente(NString value) {
		this.setValue("NM_PACIENTE", value.getValue());
	}

	public NString getTpSexo() {
		NString v = new NString((String)this.getValue("TP_SEXO"));
		return v;
	}
	
	public void setTpSexo(NString value) {
		this.setValue("TP_SEXO", value.getValue());
	}

	public NDate getDtNascimento() {
		NDate v = new NDate((java.util.Date)this.getValue("DT_NASCIMENTO"));
		return v;
	}
	
	public void setDtNascimento(NDate value) {
		this.setValue("DT_NASCIMENTO", value.getValue());
	}

	public NString getNrCpf() {
		NString v = new NString((String)this.getValue("NR_CPF"));
		return v;
	}
	
	public void setNrCpf(NString value) {
		this.setValue("NR_CPF", value.getValue());
	}

	public NString getCdPacientePesquisa() {
		NString v = new NString((String) this.getValue("CD_PACIENTE_PESQUISA"));
		return v;
	}

	public void setCdPacientePesquisa(NString value) {
		this.setValue("CD_PACIENTE_PESQUISA", value.getValue());
	}

	public NString getBtnPesquisaPaciente() {
		NString v = new NString((String) this.getValue("BTN_PESQUISA_PACIENTE"));
		return v;
	}

	public void setBtnPesquisaPaciente(NString value) {
		this.setValue("BTN_PESQUISA_PACIENTE", value.getValue());
	}

}