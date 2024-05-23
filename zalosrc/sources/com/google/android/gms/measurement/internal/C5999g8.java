package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p230i6.C20307b;
import p230i6.EnumC20305a;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* loaded from: classes.dex */
public final class C5999g8 extends AbstractC6208z8 {

    /* renamed from: d */
    private final Map f34038d;

    /* renamed from: e */
    public final C6203z3 f34039e;

    /* renamed from: f */
    public final C6203z3 f34040f;

    /* renamed from: g */
    public final C6203z3 f34041g;

    /* renamed from: h */
    public final C6203z3 f34042h;

    /* renamed from: i */
    public final C6203z3 f34043i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5999g8(C6055l9 c6055l9) {
        super(c6055l9);
        this.f34038d = new HashMap();
        C5950c4 m31374F = this.f34158a.m31374F();
        m31374F.getClass();
        this.f34039e = new C6203z3(m31374F, "last_delete_stale", 0L);
        C5950c4 m31374F2 = this.f34158a.m31374F();
        m31374F2.getClass();
        this.f34040f = new C6203z3(m31374F2, "backoff", 0L);
        C5950c4 m31374F3 = this.f34158a.m31374F();
        m31374F3.getClass();
        this.f34041g = new C6203z3(m31374F3, "last_upload", 0L);
        C5950c4 m31374F4 = this.f34158a.m31374F();
        m31374F4.getClass();
        this.f34042h = new C6203z3(m31374F4, "last_upload_attempt", 0L);
        C5950c4 m31374F5 = this.f34158a.m31374F();
        m31374F5.getClass();
        this.f34043i = new C6203z3(m31374F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* renamed from: l */
    final Pair m30947l(String str) {
        C5988f8 c5988f8;
        AdvertisingIdClient.Info info;
        mo31036g();
        long mo105914b = this.f34158a.mo31031a().mo105914b();
        C5988f8 c5988f82 = (C5988f8) this.f34038d.get(str);
        if (c5988f82 != null && mo105914b < c5988f82.f34004c) {
            return new Pair(c5988f82.f34002a, Boolean.valueOf(c5988f82.f34003b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long m30927q = this.f34158a.m31401z().m30927q(str, AbstractC5972e3.f33911c) + mo105914b;
        try {
            long m30927q2 = this.f34158a.m31401z().m30927q(str, AbstractC5972e3.f33913d);
            if (m30927q2 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.f34158a.mo31032b());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c5988f82 != null && mo105914b < c5988f82.f34004c + m30927q2) {
                        return new Pair(c5988f82.f34002a, Boolean.valueOf(c5988f82.f34003b));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.f34158a.mo31032b());
            }
        } catch (Exception e11) {
            this.f34158a.mo31033c().m31196p().m31109b("Unable to get advertising id", e11);
            c5988f8 = new C5988f8("", false, m30927q);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            c5988f8 = new C5988f8(id2, info.isLimitAdTrackingEnabled(), m30927q);
        } else {
            c5988f8 = new C5988f8("", info.isLimitAdTrackingEnabled(), m30927q);
        }
        this.f34038d.put(str, c5988f8);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c5988f8.f34002a, Boolean.valueOf(c5988f8.f34003b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final Pair m30948m(String str, C20307b c20307b) {
        if (c20307b.m106014i(EnumC20305a.AD_STORAGE)) {
            return m30947l(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final String m30949n(String str, boolean z11) {
        String str2;
        mo31036g();
        if (z11) {
            str2 = (String) m30947l(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest m31311s = C6121r9.m31311s();
        if (m31311s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m31311s.digest(str2.getBytes())));
    }
}
