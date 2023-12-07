package graphql.kickstart.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

interface HttpRequestHandler {

  String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";
  String APPLICATION_EVENT_STREAM_UTF8 = "text/event-stream;charset=UTF-8";

  int STATUS_OK = 200;
  int STATUS_BAD_REQUEST = 400;

  void handle(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
