package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import p345m9.C22961h;

/* renamed from: com.google.firebase.perf.network.a */
/* loaded from: classes3.dex */
public final class C6695a extends HttpURLConnection {

    /* renamed from: a */
    private final C6697c f36864a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6695a(HttpURLConnection httpURLConnection, Timer timer, C22961h c22961h) {
        super(httpURLConnection.getURL());
        this.f36864a = new C6697c(httpURLConnection, timer, c22961h);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f36864a.m34216a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f36864a.m34217b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f36864a.m34219c();
    }

    public boolean equals(Object obj) {
        return this.f36864a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f36864a.m34220d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f36864a.m34221e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f36864a.m34222f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f36864a.m34224h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f36864a.m34225i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f36864a.m34226j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f36864a.m34227k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f36864a.m34228l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f36864a.m34229m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f36864a.m34230n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f36864a.m34231o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f36864a.m34232p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f36864a.m34233q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f36864a.m34234r(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f36864a.m34236t(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f36864a.m34237u(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f36864a.m34238v(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f36864a.m34239w(str, j11);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f36864a.m34240x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f36864a.m34241y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f36864a.m34242z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f36864a.m34190A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f36864a.m34191B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f36864a.m34192C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f36864a.m34193D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f36864a.m34194E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f36864a.m34195F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f36864a.m34196G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f36864a.m34197H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f36864a.m34198I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f36864a.m34199J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f36864a.m34200K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f36864a.m34201L();
    }

    public int hashCode() {
        return this.f36864a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f36864a.m34202M(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f36864a.m34203N(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f36864a.m34204O(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f36864a.m34205P(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f36864a.m34206Q(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f36864a.m34207R(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f36864a.m34208S(i11);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f36864a.m34210U(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f36864a.m34211V(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f36864a.m34212W(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f36864a.m34213X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f36864a.m34214Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f36864a.m34215Z(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f36864a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f36864a.m34218b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f36864a.m34223g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f36864a.m34235s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f36864a.m34209T(j11);
    }
}
