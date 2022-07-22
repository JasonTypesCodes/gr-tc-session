package gr.tc.session

import javax.servlet.annotation.WebListener
import javax.servlet.http.HttpSessionEvent
import javax.servlet.http.HttpSessionListener

@WebListener
class NewSessionListener implements HttpSessionListener {
    void sessionCreated(HttpSessionEvent sessionEvent) {
        sessionEvent.session.setMaxInactiveInterval(3)
    }
}
