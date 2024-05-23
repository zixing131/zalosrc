package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class vr3 {

    /* renamed from: b */
    private static final Logger f29464b = Logger.getLogger(vr3.class.getName());

    /* renamed from: c */
    private static final List f29465c;

    /* renamed from: d */
    private static final boolean f29466d;

    /* renamed from: e */
    public static final vr3 f29467e;

    /* renamed from: f */
    public static final vr3 f29468f;

    /* renamed from: g */
    public static final vr3 f29469g;

    /* renamed from: h */
    public static final vr3 f29470h;

    /* renamed from: i */
    public static final vr3 f29471i;

    /* renamed from: j */
    public static final vr3 f29472j;

    /* renamed from: k */
    public static final vr3 f29473k;

    /* renamed from: a */
    private final ds3 f29474a;

    static {
        if (zg3.m28501b()) {
            f29465c = m27340b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f29466d = false;
        } else if (ns3.m25005b()) {
            f29465c = m27340b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f29466d = true;
        } else {
            f29465c = new ArrayList();
            f29466d = true;
        }
        f29467e = new vr3(new wr3());
        f29468f = new vr3(new as3());
        f29469g = new vr3(new cs3());
        f29470h = new vr3(new bs3());
        f29471i = new vr3(new xr3());
        f29472j = new vr3(new zr3());
        f29473k = new vr3(new yr3());
    }

    public vr3(ds3 ds3Var) {
        this.f29474a = ds3Var;
    }

    /* renamed from: b */
    public static List m27340b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f29464b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object m27341a(String str) {
        Iterator it = f29465c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f29474a.mo20232a(str, (Provider) it.next());
            } catch (Exception e11) {
                if (exc == null) {
                    exc = e11;
                }
            }
        }
        if (f29466d) {
            return this.f29474a.mo20232a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
