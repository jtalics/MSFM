#######################################################################
# All macros defined in this file should be globally unique across
# all release and build components
#
#######################################################################

#######################################################################
# include external component definitions
# These are references to components other than the current component
#
#######################################################################
include $(COMMONFACILITIES)/build/CommonFacilities.mk
include $(SESSIONMANAGEMENTSERVICE)/build/SessionManagementService.mk
include $(DOMAIN)/build/domain.mk
include $(SERVER)/build/server.mk
include $(EVENT)/build/event.mk
include $(SYSTEMHEALTHMONITOR)/build/SystemHealthMonitor.mk
include $(ICS)/build/ics.mk
include $(CMI)/build/cmi.mk

#######################################################################
# Defines the build classpath for this build component.
# Only those jars that are needed to build this component should be 
# referenced.
# 
#######################################################################
CLIENT_INSTRUMENTATIONTRANSLATOR_CLASSPATH=$(CLIENT_INSTRUMENTATIONTRANSLATOR_CLASS):$(CMI_IDL_JAR):$(DOMAIN_XML_BUILD_JAR):$(CLIENT_COMMON_BUILD_JAR):$(CLIENT_COMMONTRANSLATOR_BUILD_JAR):$(ICS_IDL_BUILD_JAR):$(ICS_INTERFACES_BUILD_JAR):$(ICS_IMPLS_BUILD_JAR):$(SYSTEMHEALTHMONITOR_INTERFACES_BUILD_JAR):$(CLIENT_INTERFACES_BUILD_JAR):$(SERVER_INTERFACES_BUILD_JAR):$(DOMAIN_IDL_BUILD_JAR):$(DOMAIN_INTERFACES_BUILD_JAR):$(DOMAIN_IMPLS_BUILD_JAR):$(EVENT_INTERFACES_BUILD_JAR):$(EVENT_IMPLS_BUILD_JAR):$(COMMONFACILITIES_BUILD_JAR):$(FFJAR):$(JUNITJAR):$(JUNIT37JAR):$(CLIENT_IDL_BUILD_JAR):$(SERVER_IDL_BUILD_JAR):$(SERVER_IDL_BUILD_JAR):$(OBJWAVEJAR):$(JGLCLASSES):$(IVIDLCLASSESJAR):$(SESSIONMANAGEMENTSERVICE_BUILD_JAR):$(OMGBASECLASSESJAR):$(OMGSERVICECLASSESJAR):$(MSIMPJAR):$(MSINTJAR):$(SSINTJAR):$(CMJAR):$(IVJAR):$(LGINTCLASSESJAR)


#######################################################################
# The dependencies for this component.  This is intended to be used 
# in the dependency list in Makefile targets.
# 
#######################################################################
CLIENT_INSTRUMENTATIONTRANSLATOR_DEPENDS=$(filter %.jar,$(subst :, ,$(CLIENT_INSTRUMENTATIONTRANSLATOR_CLASSPATH)))

