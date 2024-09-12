package br.com.mv.soul.ffch.forms.ConsultaPaciente.controller;

import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import br.com.mv.soul.common.forms.controller.DefaultBlockController;
import br.com.mv.soul.ffch.forms.ConsultaPaciente.ConsultaPacienteTask;
import br.com.mv.soul.ffch.forms.ConsultaPaciente.model.ConsultaPacienteModel;

public class AtendimeController extends DefaultBlockController {

	public AtendimeController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ConsultaPacienteTask getTask() {
		return (ConsultaPacienteTask) super.getTask();
	}

	public ConsultaPacienteModel getFormModel() {
		return getTask().getModel();
	}
	
}