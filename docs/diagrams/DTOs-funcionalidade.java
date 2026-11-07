//classe analisador preventivo
public void analisaTelemetria(TelemetriaDTO dados);
public boolean verificaAnomalia();

//classe gerenciador de alerta
public void gerarAlerta(AlertaDTO alerta);
public ResultadoOperacaoDTO salvaAlerta(AlertaDTO alerta);

//classe TimescaleDB
public ResultadoOperacaoDTO salvaTelemetria(TelemetriaDTO dados);
public ResultadoOperacaoDTO salvaAlerta(AlertaDTO alerta);

//class Grafana
public void notificarAlerta(AlertaDTO alerta);
public void atualizaDashboard();