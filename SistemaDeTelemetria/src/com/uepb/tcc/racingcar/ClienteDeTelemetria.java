package com.uepb.tcc.racingcar;

import java.util.Random;

public class ClienteDeTelemetria {
	public static final String MENSAGEM_DE_DIAGNOSTICO = "AT#UD";

	private boolean onlineStatus;
	private String resultadoMensagemDeDiagnostico = "";

	private final Random conexaoSimuladorDeEventos = new Random(42);

	public boolean getOnlineStatus() {
		return onlineStatus;
	}

	public void connectar(String stringConexaoServidorTelemetria) {
		if (stringConexaoServidorTelemetria == null || "".equals(stringConexaoServidorTelemetria)) {
			throw new IllegalArgumentException();
		}

		// simula a operação em um modem real
		boolean sucesso = conexaoSimuladorDeEventos.nextInt(10) <= 8;

		onlineStatus = sucesso;
	}

	public void desconnectar() {
		onlineStatus = false;
	}

	public void enviar(String mensagem) {
		if (mensagem == null || "".equals(mensagem)) {
			throw new IllegalArgumentException();
		}

		if (mensagem == MENSAGEM_DE_DIAGNOSTICO) {
			// simula um relatório de status
			resultadoMensagemDeDiagnostico = "ULTIMA taxa TX.............. 100 MBPS\r\n"
					+ "MAIOR taxa TX............... 100 MBPS\r\n" + "UTIMA taxa RX............... 100 MBPS\r\n"
					+ "MAIOR taxa RX............... 100 MBPS\r\n" + "TAXA DE BIT................. 100000000\r\n"
					+ "PALAVRA LEN................. 16\r\n" + "PALAVRA/ARMACAO............. 511\r\n"
					+ "BITS/ARMACAO................ 8192\r\n" + "TIPO DE MODULACAO........... PCM/FM\r\n"
					+ "TX Digital Los.............. 0.75\r\n" + "RX Digital Los.............. 0.10\r\n"
					+ "BEP Teste................... -5\r\n" + "Contagem Rtrn Local......... 00\r\n"
					+ "Contagem Remota Rtrn ....... 00";

			return;
		}

		// aqui deve ir operação de envio real (não é necessário para este exercício)
	}

	public String recebe() {
		String mensagem;

		if (resultadoMensagemDeDiagnostico == null || "".equals(resultadoMensagemDeDiagnostico)) {
			// simula uma mensagem recebida (apenas para ilustração - (não é necessário para
			// este exercício)
			mensagem = "";
			int tamanhoMensagem = conexaoSimuladorDeEventos.nextInt(50) + 60;
			for (int i = tamanhoMensagem; i >= 0; --i) {
				mensagem += (char) conexaoSimuladorDeEventos.nextInt(40) + 86;
			}

		} else {
			mensagem = resultadoMensagemDeDiagnostico;
			resultadoMensagemDeDiagnostico = "";
		}

		return mensagem;
	}
}
