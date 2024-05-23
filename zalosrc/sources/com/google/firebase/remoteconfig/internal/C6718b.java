package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C6729m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p541u9.AbstractC27194b;
import p541u9.InterfaceC27195c;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* loaded from: classes3.dex */
public class C6718b {

    /* renamed from: a */
    private final Set f36964a;

    /* renamed from: b */
    private final HttpURLConnection f36965b;

    /* renamed from: c */
    private final C6729m f36966c;

    /* renamed from: d */
    private final C6722f f36967d;

    /* renamed from: e */
    private final InterfaceC27195c f36968e;

    /* renamed from: f */
    private final ScheduledExecutorService f36969f;

    /* renamed from: g */
    private final Random f36970g = new Random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f36971p;

        /* renamed from: q */
        final /* synthetic */ long f36972q;

        a(int i11, long j11) {
            this.f36971p = i11;
            this.f36972q = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6718b.this.m34361d(this.f36971p, this.f36972q);
        }
    }

    public C6718b(HttpURLConnection httpURLConnection, C6729m c6729m, C6722f c6722f, Set set, InterfaceC27195c interfaceC27195c, ScheduledExecutorService scheduledExecutorService) {
        this.f36965b = httpURLConnection;
        this.f36966c = c6729m;
        this.f36967d = c6722f;
        this.f36964a = set;
        this.f36968e = interfaceC27195c;
        this.f36969f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m34353b(int i11, long j11) {
        if (i11 == 0) {
            m34360k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f36969f.schedule(new a(i11, j11), this.f36970g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    private synchronized void m34354c(AbstractC27194b abstractC27194b) {
        Iterator it = this.f36964a.iterator();
        while (it.hasNext()) {
            ((InterfaceC27195c) it.next()).mo34493b(abstractC27194b);
        }
    }

    /* renamed from: e */
    private static Boolean m34355e(C6729m.a aVar, long j11) {
        boolean z11 = false;
        if (aVar.m34426d() != null) {
            if (aVar.m34426d().m34387i() >= j11) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
        if (aVar.m34428f() == 1) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:            r5 = new org.json.JSONObject(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:            if (r5.has("featureDisabled") == false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:            if (r5.getBoolean("featureDisabled") == false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:            r9.f36968e.mo34492a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_UNAVAILABLE));     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:            if (m34357g() == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:            if (r5.has("latestTemplateVersionNumber") == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:            r6 = r9.f36966c.m34422r();        r4 = r5.getLong("latestTemplateVersionNumber");     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:            if (r4 <= r6) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:            m34353b(3, r4);     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m34356f(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                str = str + readLine;
                if (readLine.contains("}")) {
                    str = m34359j(str);
                    if (!str.isEmpty()) {
                        try {
                            break;
                        } catch (JSONException e11) {
                            m34360k(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e11.getCause(), FirebaseRemoteConfigException.EnumC6713a.CONFIG_UPDATE_MESSAGE_INVALID));
                        }
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    /* renamed from: g */
    private synchronized boolean m34357g() {
        return this.f36964a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ AbstractC22888j m34358h(AbstractC22888j abstractC22888j, AbstractC22888j abstractC22888j2, long j11, int i11, AbstractC22888j abstractC22888j3) {
        if (!abstractC22888j.mo117588q()) {
            return AbstractC22894m.m117603e(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", abstractC22888j.mo117583l()));
        }
        if (!abstractC22888j2.mo117588q()) {
            return AbstractC22894m.m117603e(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", abstractC22888j2.mo117583l()));
        }
        C6729m.a aVar = (C6729m.a) abstractC22888j.mo117584m();
        C6723g c6723g = (C6723g) abstractC22888j2.mo117584m();
        if (!m34355e(aVar, j11).booleanValue()) {
            m34353b(i11, j11);
            return AbstractC22894m.m117604f(null);
        }
        if (aVar.m34426d() == null) {
            return AbstractC22894m.m117604f(null);
        }
        if (c6723g == null) {
            c6723g = C6723g.m34381j().m34388a();
        }
        Set m34383e = c6723g.m34383e(aVar.m34426d());
        if (m34383e.isEmpty()) {
            return AbstractC22894m.m117604f(null);
        }
        m34354c(AbstractC27194b.m139265a(m34383e));
        return AbstractC22894m.m117604f(null);
    }

    /* renamed from: j */
    private String m34359j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: k */
    private synchronized void m34360k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f36964a.iterator();
        while (it.hasNext()) {
            ((InterfaceC27195c) it.next()).mo34492a(firebaseRemoteConfigException);
        }
    }

    /* renamed from: d */
    public synchronized AbstractC22888j m34361d(int i11, final long j11) {
        final int i12;
        final AbstractC22888j m34421n;
        final AbstractC22888j m34371e;
        i12 = i11 - 1;
        m34421n = this.f36966c.m34421n(C6729m.b.REALTIME, 3 - i12);
        m34371e = this.f36967d.m34371e();
        return AbstractC22894m.m117608j(m34421n, m34371e).mo117581j(this.f36969f, new InterfaceC22874c() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j) {
                AbstractC22888j m34358h;
                m34358h = C6718b.this.m34358h(m34421n, m34371e, j11, i12, abstractC22888j);
                return m34358h;
            }
        });
    }

    /* renamed from: i */
    public void m34362i() {
        HttpURLConnection httpURLConnection = this.f36965b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            m34356f(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f36965b.disconnect();
            throw th2;
        }
        this.f36965b.disconnect();
    }
}
