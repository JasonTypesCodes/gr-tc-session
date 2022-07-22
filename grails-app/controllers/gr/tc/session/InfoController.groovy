package gr.tc.session

class InfoController {

    def index() {
        render "Session: ${session.id} expires in: ${session.getMaxInactiveInterval()}s"
    }
}
