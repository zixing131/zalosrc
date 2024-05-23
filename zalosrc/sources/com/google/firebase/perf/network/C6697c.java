package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import p319l9.C22152a;
import p345m9.C22961h;
import p384o9.AbstractC24137g;
import p384o9.C24131a;
import p384o9.C24132b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.perf.network.c */
/* loaded from: classes3.dex */
public class C6697c {

    /* renamed from: f */
    private static final C22152a f36867f = C22152a.m115524e();

    /* renamed from: a */
    private final HttpURLConnection f36868a;

    /* renamed from: b */
    private final C22961h f36869b;

    /* renamed from: c */
    private long f36870c = -1;

    /* renamed from: d */
    private long f36871d = -1;

    /* renamed from: e */
    private final Timer f36872e;

    public C6697c(HttpURLConnection httpURLConnection, Timer timer, C22961h c22961h) {
        this.f36868a = httpURLConnection;
        this.f36869b = c22961h;
        this.f36872e = timer;
        c22961h.m117710w(httpURLConnection.getURL().toString());
    }

    /* renamed from: a0 */
    private void m34189a0() {
        if (this.f36870c == -1) {
            this.f36872e.m34295g();
            long m34294e = this.f36872e.m34294e();
            this.f36870c = m34294e;
            this.f36869b.m117704n(m34294e);
        }
        String m34195F = m34195F();
        if (m34195F != null) {
            this.f36869b.m117700j(m34195F);
        } else if (m34231o()) {
            this.f36869b.m117700j("POST");
        } else {
            this.f36869b.m117700j("GET");
        }
    }

    /* renamed from: A */
    public boolean m34190A() {
        return this.f36868a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m34191B() {
        m34189a0();
        return this.f36868a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m34192C() {
        try {
            OutputStream outputStream = this.f36868a.getOutputStream();
            if (outputStream != null) {
                return new C24132b(outputStream, this.f36869b, this.f36872e);
            }
            return outputStream;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: D */
    public Permission m34193D() {
        try {
            return this.f36868a.getPermission();
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: E */
    public int m34194E() {
        return this.f36868a.getReadTimeout();
    }

    /* renamed from: F */
    public String m34195F() {
        return this.f36868a.getRequestMethod();
    }

    /* renamed from: G */
    public Map m34196G() {
        return this.f36868a.getRequestProperties();
    }

    /* renamed from: H */
    public String m34197H(String str) {
        return this.f36868a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m34198I() {
        m34189a0();
        if (this.f36871d == -1) {
            long m34292c = this.f36872e.m34292c();
            this.f36871d = m34292c;
            this.f36869b.m117709u(m34292c);
        }
        try {
            int responseCode = this.f36868a.getResponseCode();
            this.f36869b.m117701k(responseCode);
            return responseCode;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: J */
    public String m34199J() {
        m34189a0();
        if (this.f36871d == -1) {
            long m34292c = this.f36872e.m34292c();
            this.f36871d = m34292c;
            this.f36869b.m117709u(m34292c);
        }
        try {
            String responseMessage = this.f36868a.getResponseMessage();
            this.f36869b.m117701k(this.f36868a.getResponseCode());
            return responseMessage;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: K */
    public URL m34200K() {
        return this.f36868a.getURL();
    }

    /* renamed from: L */
    public boolean m34201L() {
        return this.f36868a.getUseCaches();
    }

    /* renamed from: M */
    public void m34202M(boolean z11) {
        this.f36868a.setAllowUserInteraction(z11);
    }

    /* renamed from: N */
    public void m34203N(int i11) {
        this.f36868a.setChunkedStreamingMode(i11);
    }

    /* renamed from: O */
    public void m34204O(int i11) {
        this.f36868a.setConnectTimeout(i11);
    }

    /* renamed from: P */
    public void m34205P(boolean z11) {
        this.f36868a.setDefaultUseCaches(z11);
    }

    /* renamed from: Q */
    public void m34206Q(boolean z11) {
        this.f36868a.setDoInput(z11);
    }

    /* renamed from: R */
    public void m34207R(boolean z11) {
        this.f36868a.setDoOutput(z11);
    }

    /* renamed from: S */
    public void m34208S(int i11) {
        this.f36868a.setFixedLengthStreamingMode(i11);
    }

    /* renamed from: T */
    public void m34209T(long j11) {
        this.f36868a.setFixedLengthStreamingMode(j11);
    }

    /* renamed from: U */
    public void m34210U(long j11) {
        this.f36868a.setIfModifiedSince(j11);
    }

    /* renamed from: V */
    public void m34211V(boolean z11) {
        this.f36868a.setInstanceFollowRedirects(z11);
    }

    /* renamed from: W */
    public void m34212W(int i11) {
        this.f36868a.setReadTimeout(i11);
    }

    /* renamed from: X */
    public void m34213X(String str) {
        this.f36868a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m34214Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f36869b.m117711x(str2);
        }
        this.f36868a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m34215Z(boolean z11) {
        this.f36868a.setUseCaches(z11);
    }

    /* renamed from: a */
    public void m34216a(String str, String str2) {
        this.f36868a.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void m34217b() {
        if (this.f36870c == -1) {
            this.f36872e.m34295g();
            long m34294e = this.f36872e.m34294e();
            this.f36870c = m34294e;
            this.f36869b.m117704n(m34294e);
        }
        try {
            this.f36868a.connect();
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: b0 */
    public boolean m34218b0() {
        return this.f36868a.usingProxy();
    }

    /* renamed from: c */
    public void m34219c() {
        this.f36869b.m117708t(this.f36872e.m34292c());
        this.f36869b.m117696b();
        this.f36868a.disconnect();
    }

    /* renamed from: d */
    public boolean m34220d() {
        return this.f36868a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m34221e() {
        return this.f36868a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f36868a.equals(obj);
    }

    /* renamed from: f */
    public Object m34222f() {
        m34189a0();
        this.f36869b.m117701k(this.f36868a.getResponseCode());
        try {
            Object content = this.f36868a.getContent();
            if (content instanceof InputStream) {
                this.f36869b.m117705o(this.f36868a.getContentType());
                return new C24131a((InputStream) content, this.f36869b, this.f36872e);
            }
            this.f36869b.m117705o(this.f36868a.getContentType());
            this.f36869b.m117706p(this.f36868a.getContentLength());
            this.f36869b.m117708t(this.f36872e.m34292c());
            this.f36869b.m117696b();
            return content;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: g */
    public Object m34223g(Class[] clsArr) {
        m34189a0();
        this.f36869b.m117701k(this.f36868a.getResponseCode());
        try {
            Object content = this.f36868a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f36869b.m117705o(this.f36868a.getContentType());
                return new C24131a((InputStream) content, this.f36869b, this.f36872e);
            }
            this.f36869b.m117705o(this.f36868a.getContentType());
            this.f36869b.m117706p(this.f36868a.getContentLength());
            this.f36869b.m117708t(this.f36872e.m34292c());
            this.f36869b.m117696b();
            return content;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }

    /* renamed from: h */
    public String m34224h() {
        m34189a0();
        return this.f36868a.getContentEncoding();
    }

    public int hashCode() {
        return this.f36868a.hashCode();
    }

    /* renamed from: i */
    public int m34225i() {
        m34189a0();
        return this.f36868a.getContentLength();
    }

    /* renamed from: j */
    public long m34226j() {
        long contentLengthLong;
        m34189a0();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = this.f36868a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    /* renamed from: k */
    public String m34227k() {
        m34189a0();
        return this.f36868a.getContentType();
    }

    /* renamed from: l */
    public long m34228l() {
        m34189a0();
        return this.f36868a.getDate();
    }

    /* renamed from: m */
    public boolean m34229m() {
        return this.f36868a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m34230n() {
        return this.f36868a.getDoInput();
    }

    /* renamed from: o */
    public boolean m34231o() {
        return this.f36868a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m34232p() {
        m34189a0();
        try {
            this.f36869b.m117701k(this.f36868a.getResponseCode());
        } catch (IOException unused) {
            f36867f.m115525a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f36868a.getErrorStream();
        if (errorStream != null) {
            return new C24131a(errorStream, this.f36869b, this.f36872e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long m34233q() {
        m34189a0();
        return this.f36868a.getExpiration();
    }

    /* renamed from: r */
    public String m34234r(int i11) {
        m34189a0();
        return this.f36868a.getHeaderField(i11);
    }

    /* renamed from: s */
    public String m34235s(String str) {
        m34189a0();
        return this.f36868a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m34236t(String str, long j11) {
        m34189a0();
        return this.f36868a.getHeaderFieldDate(str, j11);
    }

    public String toString() {
        return this.f36868a.toString();
    }

    /* renamed from: u */
    public int m34237u(String str, int i11) {
        m34189a0();
        return this.f36868a.getHeaderFieldInt(str, i11);
    }

    /* renamed from: v */
    public String m34238v(int i11) {
        m34189a0();
        return this.f36868a.getHeaderFieldKey(i11);
    }

    /* renamed from: w */
    public long m34239w(String str, long j11) {
        long headerFieldLong;
        m34189a0();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = this.f36868a.getHeaderFieldLong(str, j11);
            return headerFieldLong;
        }
        return 0L;
    }

    /* renamed from: x */
    public Map m34240x() {
        m34189a0();
        return this.f36868a.getHeaderFields();
    }

    /* renamed from: y */
    public long m34241y() {
        return this.f36868a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m34242z() {
        m34189a0();
        this.f36869b.m117701k(this.f36868a.getResponseCode());
        this.f36869b.m117705o(this.f36868a.getContentType());
        try {
            InputStream inputStream = this.f36868a.getInputStream();
            if (inputStream != null) {
                return new C24131a(inputStream, this.f36869b, this.f36872e);
            }
            return inputStream;
        } catch (IOException e11) {
            this.f36869b.m117708t(this.f36872e.m34292c());
            AbstractC24137g.m126110d(this.f36869b);
            throw e11;
        }
    }
}
