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
include $(DOMAIN)/build/domain.mk
include $(EVENT)/build/event.mk
include $(CMI)/build/cmi.mk

#######################################################################
# Defines the build classpath for this build component.
# Only those jars that are needed to build this component should be 
# referenced.
# 
#######################################################################
CLIENT_COMMON_CLASSPATH=$(CLIENT_COMMON_CLASS):$(CMI_IDL_JAR):$(CLIENT_INTERFACES_BUILD_JAR):$(DOMAIN_INTERFACES_BUILD_JAR):$(EVENT_INTERFACES_BUILD_JAR):$(COMMONFACILITIES_BUILD_JAR):$(FFJAR):$(CLIENT_IDL_BUILD_JAR):$(ROJAR):$(SERVER_PROXIES_JAR)



#######################################################################
# The dependencies for this component.  This is intended to be used 
# in the dependency list in Makefile targets.
# 
#######################################################################
CLIENT_COMMON_DEPENDS=$(filter %.jar,$(subst :, ,$(CLIENT_COMMON_CLASSPATH)))

