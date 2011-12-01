class MyGluScript {
	def port
	def pid
	
	def install = {
		println "installing..."
	}
	
	def configure = {
		println "configuring..."		
	}
	
	def start = {
		println "starting..."		
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