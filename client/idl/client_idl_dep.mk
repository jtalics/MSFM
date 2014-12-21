#######################################################################
# All macros defined in this file should be globally unique across
# all release and build components
#
# This makefile makes reference to macros defined elsewhere.  Please
# define the following when including this file
#
#######################################################################

#######################################################################
# include external component definitions
#
#######################################################################
include $(CMI)/build/cmi.mk

#######################################################################
# Defines the build classpath for this build component.
# Only those jars that are needed to build this component should be 
# referenced.
# 
#######################################################################
CLIENT_IDL_CLASSPATH =$(CLIENT_IDL_CLASS):$(CMI_IDL_JAR):$(OMGBASECLASSESJAR):$(OMGSERVICECLASSESJAR):$(MSIMPJAR):$(SSINTJAR):$(IVIDLCLASSESJAR)


#######################################################################
# The dependencies for this component.  This is intended to be used 
# in the dependency list in Makefile targets.
# 
#######################################################################
CLIENT_IDL_DEPENDS=$(filter %.jar,$(subst :, ,$(CLIENT_IDL_CLASSPATH)))


