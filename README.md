# Explicação da funcionalidade

A funcionalidade escolida foi a de Notificação de Alertas e Detecção de Anomalias tem como objetivo identificar possíveis problemas 
nas máquinas industriais por meio dos dados de temperatura e vibração coletados pelos sensores.

Quando o algoritmo identifica um comportamento anormal fora do padrao, ele envia um evento pelo Apache Kafka para o Gerenciador de Alertas, 
que registra as informações no TimescaleDB. Em seguida, o Grafana apresenta o alerta em seu dashboard, permitindo que os responsáveis 
acompanhem os problemas e realizem manutenções preventivas. Dessa forma, o sistema ajuda a identificar possíveis falhas antecipadamente, 
reduzindo o risco de paradas inesperadas nas máquinas.
