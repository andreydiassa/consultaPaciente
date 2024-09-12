package br.com.mv.soul.ffch.forms.ConsultaPaciente.services;

import br.com.mv.soul.ffch.forms.ConsultaPaciente.ConsultaPacienteTask;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;

public class ConsultaPacienteServices extends br.com.mv.soul.common.forms.MVCusto.services.MVCustoServices {

	public ConsultaPacienteServices(ISupportCodeContainer container) {
		super(container);
	}

	public ConsultaPacienteTask getTask() {
		return (ConsultaPacienteTask) super.getContainer();
	}

	public br.com.mv.soul.ffch.forms.ConsultaPaciente.model.ConsultaPacienteModel getFormModel() {
		return getTask().getModel();
	}

	public void mvComentarios() {
	}

}
