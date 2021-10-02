#######################################################################
# Utiliza a imagem base do Widlfy - SIGEP-JT
#######################################################################

FROM registry.csjt.redejt/sigep-jt/base-wildfly:22.0.1.Final-csjt-3

ENV URL_BANCO=jdbc:oracle:thin:@host:porta/SID
ENV USUARIO_BANCO=user
ENV SENHA_BANCO=senha

# Deploy
COPY --chown=jboss:jboss deploy/backend-template-api.war $JBOSS_HOME/standalone/deployments/

COPY --chown=jboss:jboss customization/cli /cli
RUN /opt/jboss/wildfly/customization/executar-cli.sh /cli

RUN rm -rf /cli/*
