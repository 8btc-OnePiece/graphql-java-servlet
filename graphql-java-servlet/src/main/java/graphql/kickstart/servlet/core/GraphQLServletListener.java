package graphql.kickstart.servlet.core;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Andrew Potter
 */
public interface GraphQLServletListener {
    default RequestCallback onRequest(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    interface RequestCallback {
        default void onSuccess(HttpServletRequest request, HttpServletResponse response) {}
        default void onError(HttpServletRequest request, HttpServletResponse response, Throwable throwable) {}
        default void onFinally(HttpServletRequest request, HttpServletResponse response) {}
    }
}
