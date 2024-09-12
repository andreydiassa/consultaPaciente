package br.com.mv.soul.ffch.forms.ConsultaPaciente;

import java.util.Hashtable;
import br.com.mv.soul.common.forms.DefaultTask;

public class ConsultaPacienteTask extends DefaultTask {
	public ConsultaPacienteTask(String taskName) {
		super(taskName);
	}
	
	public ConsultaPacienteTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public br.com.mv.soul.ffch.forms.ConsultaPaciente.model.ConsultaPacienteModel getModel() {
		return (br.com.mv.soul.ffch.forms.ConsultaPaciente.model.ConsultaPacienteModel)super.getModel();
	}
	
	public br.com.mv.soul.ffch.forms.ConsultaPaciente.services.ConsultaPacienteServices getServices() {
		return (br.com.mv.soul.ffch.forms.ConsultaPaciente.services.ConsultaPacienteServices)getSupportCodeManager().getServices();
	}
	
	// Attached Libraries
	
	public br.com.mv.soul.common.libs.Autentica.AutenticaServices getAutentica() {
		return (br.com.mv.soul.common.libs.Autentica.AutenticaServices)getSupportCodeManager().getLibrary("AUTENTICA");
	}
	
	public br.com.mv.soul.common.libs.Mv2000.Mv2000Services getMv2000() {
		return (br.com.mv.soul.common.libs.Mv2000.Mv2000Services)getSupportCodeManager().getLibrary("MV2000");
	}
	
	public br.com.mv.soul.common.libs.Ofgtel.OfgtelServices getOfgtel() {
		return (br.com.mv.soul.common.libs.Ofgtel.OfgtelServices)getSupportCodeManager().getLibrary("OFGTEL");
	}
	
	public br.com.mv.soul.common.libs.Ofgmes.OfgmesServices getOfgmes() {
		return (br.com.mv.soul.common.libs.Ofgmes.OfgmesServices)getSupportCodeManager().getLibrary("OFGMES");
	}
	
	public br.com.mv.soul.common.libs.MvAdm.MvAdmServices getMvAdm() {
		return (br.com.mv.soul.common.libs.MvAdm.MvAdmServices)getSupportCodeManager().getLibrary("MV_ADM");
	}
	
	public br.com.mv.soul.common.libs.MvRegMaq.MvRegMaqServices getMvRegMaq() {
		return (br.com.mv.soul.common.libs.MvRegMaq.MvRegMaqServices)getSupportCodeManager().getLibrary("MV_REG_MAQ");
	}
}
