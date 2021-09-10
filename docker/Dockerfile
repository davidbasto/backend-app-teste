#######################################################################
# Utiliza a imagem base do Widlfy - SIGEP-JT
#######################################################################

FROM registry.csjt.redejt/sigep-jt/base-wildfly:22.0.1.Final-csjt-2

# Deploy
COPY --chown=jboss:jboss deploy/backend-template-api.war $JBOSS_HOME/standalone/deployments/
