package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p345m9.C22961h;
import p384o9.AbstractC24137g;
import p441q9.C25197k;
import p476r9.C25705m;

/* loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    /* renamed from: a */
    static Object m34186a(C25705m c25705m, C25197k c25197k, Timer timer) {
        timer.m34295g();
        long m34294e = timer.m34294e();
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            URLConnection m132619a = c25705m.m132619a();
            if (m132619a instanceof HttpsURLConnection) {
                return new C6696b((HttpsURLConnection) m132619a, timer, m117692c).getContent();
            }
            if (m132619a instanceof HttpURLConnection) {
                return new C6695a((HttpURLConnection) m132619a, timer, m117692c).getContent();
            }
            return m132619a.getContent();
        } catch (IOException e11) {
            m117692c.m117704n(m34294e);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117710w(c25705m.toString());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: b */
    static Object m34187b(C25705m c25705m, Class[] clsArr, C25197k c25197k, Timer timer) {
        timer.m34295g();
        long m34294e = timer.m34294e();
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            URLConnection m132619a = c25705m.m132619a();
            if (m132619a instanceof HttpsURLConnection) {
                return new C6696b((HttpsURLConnection) m132619a, timer, m117692c).getContent(clsArr);
            }
            if (m132619a instanceof HttpURLConnection) {
                return new C6695a((HttpURLConnection) m132619a, timer, m117692c).getContent(clsArr);
            }
            return m132619a.getContent(clsArr);
        } catch (IOException e11) {
            m117692c.m117704n(m34294e);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117710w(c25705m.toString());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    /* renamed from: c */
    static InputStream m34188c(C25705m c25705m, C25197k c25197k, Timer timer) {
        timer.m34295g();
        long m34294e = timer.m34294e();
        C22961h m117692c = C22961h.m117692c(c25197k);
        try {
            URLConnection m132619a = c25705m.m132619a();
            if (m132619a instanceof HttpsURLConnection) {
                return new C6696b((HttpsURLConnection) m132619a, timer, m117692c).getInputStream();
            }
            if (m132619a instanceof HttpURLConnection) {
                return new C6695a((HttpURLConnection) m132619a, timer, m117692c).getInputStream();
            }
            return m132619a.getInputStream();
        } catch (IOException e11) {
            m117692c.m117704n(m34294e);
            m117692c.m117708t(timer.m34292c());
            m117692c.m117710w(c25705m.toString());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return m34186a(new C25705m(url), C25197k.m130415k(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C6696b((HttpsURLConnection) obj, new Timer(), C22961h.m117692c(C25197k.m130415k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new C6695a((HttpURLConnection) obj, new Timer(), C22961h.m117692c(C25197k.m130415k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return m34188c(new C25705m(url), C25197k.m130415k(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return m34187b(new C25705m(url), clsArr, C25197k.m130415k(), new Timer());
    }
}
