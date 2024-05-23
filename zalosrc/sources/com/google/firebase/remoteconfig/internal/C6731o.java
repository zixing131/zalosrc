package com.google.firebase.remoteconfig.internal;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import p229i5.InterfaceC20283d;
import p541u9.InterfaceC27202j;

/* renamed from: com.google.firebase.remoteconfig.internal.o */
/* loaded from: classes3.dex */
public class C6731o {

    /* renamed from: e */
    public static final Charset f37033e = Charset.forName("UTF-8");

    /* renamed from: f */
    static final Pattern f37034f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    static final Pattern f37035g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set f37036a = new HashSet();

    /* renamed from: b */
    private final Executor f37037b;

    /* renamed from: c */
    private final C6722f f37038c;

    /* renamed from: d */
    private final C6722f f37039d;

    public C6731o(Executor executor, C6722f c6722f, C6722f c6722f2) {
        this.f37037b = executor;
        this.f37038c = c6722f;
        this.f37039d = c6722f2;
    }

    /* renamed from: c */
    private void m34431c(final String str, final C6723g c6723g) {
        if (c6723g == null) {
            return;
        }
        synchronized (this.f37036a) {
            try {
                for (final InterfaceC20283d interfaceC20283d : this.f37036a) {
                    this.f37037b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC20283d.this.mo105911a(str, c6723g);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    private static C6723g m34432e(C6722f c6722f) {
        return c6722f.m34372f();
    }

    /* renamed from: f */
    private static Set m34433f(C6722f c6722f) {
        HashSet hashSet = new HashSet();
        C6723g m34432e = m34432e(c6722f);
        if (m34432e == null) {
            return hashSet;
        }
        Iterator<String> keys = m34432e.m34384f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: g */
    private static String m34434g(C6722f c6722f, String str) {
        C6723g m34432e = m34432e(c6722f);
        if (m34432e == null) {
            return null;
        }
        try {
            return m34432e.m34384f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static void m34436j(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    /* renamed from: b */
    public void m34437b(InterfaceC20283d interfaceC20283d) {
        synchronized (this.f37036a) {
            this.f37036a.add(interfaceC20283d);
        }
    }

    /* renamed from: d */
    public Map m34438d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m34433f(this.f37038c));
        hashSet.addAll(m34433f(this.f37039d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, m34439h(str));
        }
        return hashMap;
    }

    /* renamed from: h */
    public InterfaceC27202j m34439h(String str) {
        String m34434g = m34434g(this.f37038c, str);
        if (m34434g != null) {
            m34431c(str, m34432e(this.f37038c));
            return new C6738v(m34434g, 2);
        }
        String m34434g2 = m34434g(this.f37039d, str);
        if (m34434g2 != null) {
            return new C6738v(m34434g2, 1);
        }
        m34436j(str, "FirebaseRemoteConfigValue");
        return new C6738v("", 0);
    }
}
