package br.com.mv.soul.ffch.forms.ConsultaPaciente.model;

import java.util.Hashtable;

import br.com.mv.soul.common.forms.model.DefaultFormModel;
import morphis.foundations.core.appsupportlib.model.IDBBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.ITask;


public class ConsultaPacienteModel extends DefaultFormModel {
	
	public ConsultaPacienteModel(ITask task, Hashtable parameters) {
		super(task, parameters);
	}

	public IDBBusinessObject getPaciente() {
		return (IDBBusinessObject) getBusinessObject("PACIENTE");
	}

	public IDBBusinessObject getAtendime() {
		return (IDBBusinessObject) getBusinessObject("ATENDIME");
	}
}