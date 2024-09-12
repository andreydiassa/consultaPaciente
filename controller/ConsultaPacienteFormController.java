package br.com.mv.soul.ffch.forms.ConsultaPaciente.controller;

import static morphis.foundations.core.appsupportlib.Globals.getGlobal;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.goItem;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.enterQuery;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.goBlock;
import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import static morphis.foundations.core.util.globals.Globals.setGlobalDefault;

import java.util.EventObject;

import br.com.mv.soul.common.dbservices.PkgMv2000;
import br.com.mv.soul.common.forms.controller.DefaultFormController;
import br.com.mv.soul.ffch.forms.ConsultaPaciente.ConsultaPacienteTask;
import br.com.mv.soul.ffch.forms.ConsultaPaciente.model.ConsultaPacienteModel;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.events.TaskEnded;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStarted;
import morphis.foundations.core.types.NString;
	



public class ConsultaPacienteFormController extends DefaultFormController {

public ConsultaPacienteFormController(ITask task) {
	super(task);
}

@Override
public ConsultaPacienteTask getTask() {
	return (ConsultaPacienteTask) super.getTask();
}

public ConsultaPacienteModel getFormModel() {
	return this.getTask().getModel();
}

@TaskEnded
public void ConsultaPaciente_TaskEnded(EventObject args)

{
	
}


@TaskStarted
public void ConsultaPaciente_TaskStarted(EventObject args)
{      
		
		NString vTitulo = NString.getNull();
		setGlobalDefault("GLOBAL.vDS_MULTI_EMPRESA", "DESCRICAO DA EMPRESA");
		this.getFormModel().setParam("CD_MULTI_EMPRESA", PkgMv2000.leEmpresa(null, null));
		this.getFormModel().setParam("DS_MULTI_EMPRESA", getGlobal("VDS_MULTI_EMPRESA"));
		setGlobal("CG$HP_HPATH", toStr("\\MV2000\\FCCH\\"));
		setGlobal("CG$HP_HFILE", getGlobal("CG$HP_HPATH").append("FFCH.HLP"));
		setGlobal("HELP_ID", getTask().getAutentica().veAutorizacao(toNumber(null)));
		enterQuery();
	
		goItem(toStr("PACIENTE.CD_PACIENTE_PESQUISA"));
}

}
