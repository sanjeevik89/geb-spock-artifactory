class ConfigReader {

	def static environ = "notset"

	static ConfigObject getConfiguration() {
        def env = System.getProperty("env")

		if(env) {
			environ = env
		}

		def config = new ConfigSlurper(environ).parse(new File('src//test//resources//ArtifactoryConfig.groovy').toURI().toURL())
		def loginFlowConfig = new ConfigSlurper(environ).parse(new File('src//test//resources//LoginFlowConfig.groovy').toURI().toURL())
		def searchFlowConfig = new ConfigSlurper(environ).parse(new File('src//test//resources//SearchFlowConfig.groovy').toURI().toURL())
		config.loginFlowConfig = loginFlowConfig
		config.searchFlowConfig = searchFlowConfig
		config
	}
}