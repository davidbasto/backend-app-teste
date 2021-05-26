#######################################################################
# Utiliza a imagem base do Widlfy - SIGEP-JT
#######################################################################

FROM registry.csjt.redejt/sigep-jt/base-wildfly:22.0.1.Final-csjt-1

# Deploy
COPY --chown=jboss:jboss deploy/backend-template-ear.ear $JBOSS_HOME/standalone/deployments/

ENTRYPOINT ["/opt/jboss/wildfly/bin/standalone.sh"]
CMD ["-b", "0.0.0.0"]