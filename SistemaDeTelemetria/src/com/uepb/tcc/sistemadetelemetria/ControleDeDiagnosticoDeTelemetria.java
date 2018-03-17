package com.uepb.tcc.sistemadetelemetria;

public class ControleDeDiagnosticoDeTelemetria {	

	private final String StringDeConexaoCanalDeDiagnostico = "*111#";

	private final ClienteDeTelemetria clienteDeTelemetria;
	private String infoDiagnostico = "";

	public ControleDeDiagnosticoDeTelemetria() {
		clienteDeTelemetria = new ClienteDeTelemetria();
	}

	public String getInfoDiagnostico() {
		return infoDiagnostico;
	}

	public void setInfoDiagnostico(String infoDiagnostico) {
		this.infoDiagnostico = infoDiagnostico;
	}

	public void checkTransmissao() throws Exception {
		infoDiagnostico = "";

		clienteDeTelemetria.desconnectar();

		int tenteNovamente = 3;
		while (clienteDeTelemetria.getOnlineStatus() == false && tenteNovamente > 0) {
			clienteDeTelemetria.connectar(StringDeConexaoCanalDeDiagnostico);
			tenteNovamente -= 1;
		}

		if (clienteDeTelemetria.getOnlineStatus() == false) {
			throw new Exception("Incapaz de conectar.");
		}

		clienteDeTelemetria.enviar(ClienteDeTelemetria.MENSAGEM_DE_DIAGNOSTICO);
		infoDiagnostico = clienteDeTelemetria.recebe();
	}
}
