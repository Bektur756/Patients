package schedule;

import com.sun.net.httpserver.HttpExchange;
import server.BasicServer;
import model.MonthCalendar;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Schedule extends BasicServer {
    MonthCalendar monthCalendar = new MonthCalendar();
    public Schedule(String host, int port) throws IOException {
        super(host, port);
        registerGet("/", this::mainPageHandeler);

        registerGet("/login", this::loginGet);
        registerPost("/login", this::loginPost);
        registerPost("/logout", this::logoutPost);
        registerGet("/register", this::signUpGet);
        registerPost("/register", this::signUpPost);

        registerGet("/dayDetail", this::dayDetailHandler);
        registerGet("/patientDetail", this::patientDetail);

        registerPost("/patientAdd", this::patientAddHandler);
        registerPost("/patientDelete", this::patientDeleteHandler);
    }

    private void patientDeleteHandler(HttpExchange exchange) {
    }

    private void patientAddHandler(HttpExchange exchange) {
    }

    private void patientDetail(HttpExchange exchange) {

    }

    private void logoutPost(HttpExchange exchange) {
    }

    private void loginPost(HttpExchange exchange) {

    }

    private void loginGet(HttpExchange exchange) {

    }

    private void dayDetailHandler(HttpExchange exchange) {
    }

    private void signUpPost(HttpExchange exchange) {
    }

    private void signUpGet(HttpExchange exchange) {

    }

    private void mainPageHandeler(HttpExchange exchange) {
        Map<String, Object> data = new HashMap<>();
        data.put("calendar", monthCalendar.getCalendar());
        renderTemplate(exchange, "index.ftlh", data);
    }
}
