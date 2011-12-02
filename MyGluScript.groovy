class MyGluScript {
	def port
	def serverType
	
	
	def install = {
		println "installing..."
	}
	
	def configure = {
		println "configuring..."		
	}
	
	def start = {
		println "starting..."		
		serverType = 'uname -a'.execute().text
	}
	
	def stop = {
		println "stopping..."
	}
	
	def unconfigure = {
		println "un-configuring..."
	}
	
	def uninstall = {
		println "uninstalling... we were never here..."
	}	
}