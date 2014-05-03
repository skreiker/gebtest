package gebtest
import geb.Browser

class TestController {

	def index() { 
			Browser.drive {
				go "https://landing.kapitall.com/home"
				println $("div").size()
				$("input",name:"user_id").value("username")
				render "OK"
			}
	}
}
