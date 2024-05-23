package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p345m9.C22961h;
import p384o9.AbstractC24137g;
import p384o9.C24135e;
import p441q9.C25197k;

/* loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    /* renamed from: a */
    static Object m34177a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m117700j(httpRequest.getRequestLine().getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            return httpClient.execute(httpHost, httpRequest, new C24135e(responseHandler, timer, m117692c));
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: b */
    static Object m34178b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m117700j(httpRequest.getRequestLine().getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            return httpClient.execute(httpHost, httpRequest, new C24135e(responseHandler, timer, m117692c), httpContext);
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: c */
    static Object m34179c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpUriRequest.getURI().toString()).m117700j(httpUriRequest.getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpUriRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            return httpClient.execute(httpUriRequest, new C24135e(responseHandler, timer, m117692c));
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: d */
    static Object m34180d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpUriRequest.getURI().toString()).m117700j(httpUriRequest.getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpUriRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            return httpClient.execute(httpUriRequest, new C24135e(responseHandler, timer, m117692c), httpContext);
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: e */
    static HttpResponse m34181e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m117700j(httpRequest.getRequestLine().getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117701k(execute.getStatusLine().getStatusCode());
            Long m126107a2 = AbstractC24137g.m126107a(execute);
            if (m126107a2 != null) {
                m117692c.m117706p(m126107a2.longValue());
            }
            String m126108b = AbstractC24137g.m126108b(execute);
            if (m126108b != null) {
                m117692c.m117705o(m126108b);
            }
            m117692c.m117696b();
            return execute;
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m34183g(httpClient, httpUriRequest, new Timer(), C25197k.m130415k());
    }

    /* renamed from: f */
    static HttpResponse m34182f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m117700j(httpRequest.getRequestLine().getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117701k(execute.getStatusLine().getStatusCode());
            Long m126107a2 = AbstractC24137g.m126107a(execute);
            if (m126107a2 != null) {
                m117692c.m117706p(m126107a2.longValue());
            }
            String m126108b = AbstractC24137g.m126108b(execute);
            if (m126108b != null) {
                m117692c.m117705o(m126108b);
            }
            m117692c.m117696b();
            return execute;
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: g */
    static HttpResponse m34183g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpUriRequest.getURI().toString()).m117700j(httpUriRequest.getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpUriRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117701k(execute.getStatusLine().getStatusCode());
            Long m126107a2 = AbstractC24137g.m126107a(execute);
            if (m126107a2 != null) {
                m117692c.m117706p(m126107a2.longValue());
            }
            String m126108b = AbstractC24137g.m126108b(execute);
            if (m126108b != null) {
                m117692c.m117705o(m126108b);
            }
            m117692c.m117696b();
            return execute;
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: h */
    static HttpResponse m34184h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, C25197k c25197k) {
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            m117692c.m117710w(httpUriRequest.getURI().toString()).m117700j(httpUriRequest.getMethod());
            Long m126107a = AbstractC24137g.m126107a(httpUriRequest);
            if (m126107a != null) {
                m117692c.m117703m(m126107a.longValue());
            }
            timer.m34295g();
            m117692c.m117704n(timer.m34294e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117701k(execute.getStatusLine().getStatusCode());
            Long m126107a2 = AbstractC24137g.m126107a(execute);
            if (m126107a2 != null) {
                m117692c.m117706p(m126107a2.longValue());
            }
            String m126108b = AbstractC24137g.m126108b(execute);
            if (m126108b != null) {
                m117692c.m117705o(m126108b);
            }
            m117692c.m117696b();
            return execute;
        } catch (IOException e11) {
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m34184h(httpClient, httpUriRequest, httpContext, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) m34179c(httpClient, httpUriRequest, responseHandler, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m34180d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m34181e(httpClient, httpHost, httpRequest, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m34182f(httpClient, httpHost, httpRequest, httpContext, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) m34177a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), C25197k.m130415k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m34178b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), C25197k.m130415k());
    }
}
