package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import p229i5.AbstractC20290k;

/* loaded from: classes2.dex */
public final class o13 {

    /* renamed from: f */
    private static final Object f25397f = new Object();

    /* renamed from: a */
    private final Context f25398a;

    /* renamed from: b */
    private final SharedPreferences f25399b;

    /* renamed from: c */
    private final String f25400c;

    /* renamed from: d */
    private final b13 f25401d;

    /* renamed from: e */
    private boolean f25402e;

    public o13(Context context, int i11, b13 b13Var, boolean z11) {
        this.f25402e = false;
        this.f25398a = context;
        this.f25400c = Integer.toString(i11 - 1);
        this.f25399b = context.getSharedPreferences("pcvmspf", 0);
        this.f25401d = b13Var;
        this.f25402e = z11;
    }

    /* renamed from: e */
    private final File m25056e(String str) {
        return new File(new File(this.f25398a.getDir("pccache", 0), this.f25400c), str);
    }

    /* renamed from: f */
    private static String m25057f(C4611ig c4611ig) {
        C4684kg m24270I = C4721lg.m24270I();
        m24270I.m23942v(c4611ig.m23244H().m24284O());
        m24270I.m23938q(c4611ig.m23244H().m24283N());
        m24270I.m23939r(c4611ig.m23244H().m24280F());
        m24270I.m23941u(c4611ig.m23244H().m24282H());
        m24270I.m23940s(c4611ig.m23244H().m24281G());
        return AbstractC20290k.m105936a(((C4721lg) m24270I.m25898n()).mo27347h().m24738k());
    }

    /* renamed from: g */
    private final String m25058g() {
        return "FBAMTD".concat(String.valueOf(this.f25400c));
    }

    /* renamed from: h */
    private final String m25059h() {
        return "LATMTD".concat(String.valueOf(this.f25400c));
    }

    /* renamed from: i */
    private final void m25060i(int i11, long j11) {
        b13 b13Var = this.f25401d;
        if (b13Var != null) {
            b13Var.zza(i11, j11);
        }
    }

    /* renamed from: j */
    private final void m25061j(int i11, long j11, String str) {
        b13 b13Var = this.f25401d;
        if (b13Var != null) {
            b13Var.zzb(i11, j11, str);
        }
    }

    /* renamed from: k */
    private final C4721lg m25062k(int i11) {
        String string;
        gu3 m22616b;
        if (i11 == 1) {
            string = this.f25399b.getString(m25059h(), null);
        } else {
            string = this.f25399b.getString(m25058g(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            mt3 m24726I = mt3.m24726I(AbstractC20290k.m105938c(string));
            if (this.f25402e) {
                m22616b = gu3.m22615a();
            } else {
                m22616b = gu3.m22616b();
            }
            return C4721lg.m24274M(m24726I, m22616b);
        } catch (zzgrq unused) {
            return null;
        } catch (NullPointerException unused2) {
            m25060i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m25060i(2032, currentTimeMillis);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m25063a(C4611ig c4611ig) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25397f) {
            try {
                if (!k13.m23805e(new File(m25056e(c4611ig.m23244H().m24284O()), "pcbc"), c4611ig.m23245I().m24738k())) {
                    m25060i(4020, currentTimeMillis);
                    return false;
                }
                String m25057f = m25057f(c4611ig);
                SharedPreferences.Editor edit = this.f25399b.edit();
                edit.putString(m25059h(), m25057f);
                boolean commit = edit.commit();
                if (commit) {
                    m25060i(5015, currentTimeMillis);
                } else {
                    m25060i(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m25064b(C4611ig c4611ig, n13 n13Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25397f) {
            try {
                C4721lg m25062k = m25062k(1);
                String m24284O = c4611ig.m23244H().m24284O();
                if (m25062k != null && m25062k.m24284O().equals(m24284O)) {
                    m25060i(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File m25056e = m25056e(m24284O);
                if (m25056e.exists()) {
                    String str = "1";
                    if (true != m25056e.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != m25056e.isFile()) {
                        str2 = "0";
                    }
                    m25061j(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    m25060i(4015, currentTimeMillis2);
                } else if (!m25056e.mkdirs()) {
                    String str3 = "1";
                    if (true != m25056e.canWrite()) {
                        str3 = "0";
                    }
                    m25061j(4024, currentTimeMillis2, "cw:".concat(str3));
                    m25060i(4015, currentTimeMillis2);
                    return false;
                }
                File m25056e2 = m25056e(m24284O);
                File file = new File(m25056e2, "pcam.jar");
                File file2 = new File(m25056e2, "pcbc");
                if (!k13.m23805e(file, c4611ig.m23246J().m24738k())) {
                    m25060i(4016, currentTimeMillis);
                    return false;
                }
                if (!k13.m23805e(file2, c4611ig.m23245I().m24738k())) {
                    m25060i(4017, currentTimeMillis);
                    return false;
                }
                if (n13Var != null && !n13Var.mo21692a(file)) {
                    m25060i(4018, currentTimeMillis);
                    k13.m23804d(m25056e2);
                    return false;
                }
                String m25057f = m25057f(c4611ig);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.f25399b.getString(m25059h(), null);
                SharedPreferences.Editor edit = this.f25399b.edit();
                edit.putString(m25059h(), m25057f);
                if (string != null) {
                    edit.putString(m25058g(), string);
                }
                if (!edit.commit()) {
                    m25060i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C4721lg m25062k2 = m25062k(1);
                if (m25062k2 != null) {
                    hashSet.add(m25062k2.m24284O());
                }
                C4721lg m25062k3 = m25062k(2);
                if (m25062k3 != null) {
                    hashSet.add(m25062k3.m24284O());
                }
                for (File file3 : new File(this.f25398a.getDir("pccache", 0), this.f25400c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        k13.m23804d(file3);
                    }
                }
                m25060i(5014, currentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final i13 m25065c(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25397f) {
            try {
                C4721lg m25062k = m25062k(1);
                if (m25062k == null) {
                    m25060i(4022, currentTimeMillis);
                    return null;
                }
                File m25056e = m25056e(m25062k.m24284O());
                File file = new File(m25056e, "pcam.jar");
                if (!file.exists()) {
                    file = new File(m25056e, "pcam");
                }
                File file2 = new File(m25056e, "pcbc");
                File file3 = new File(m25056e, "pcopt");
                m25060i(5016, currentTimeMillis);
                return new i13(m25062k, file, file2, file3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m25066d(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25397f) {
            try {
                C4721lg m25062k = m25062k(1);
                if (m25062k == null) {
                    m25060i(4025, currentTimeMillis);
                    return false;
                }
                File m25056e = m25056e(m25062k.m24284O());
                if (!new File(m25056e, "pcam.jar").exists()) {
                    m25060i(4026, currentTimeMillis);
                    return false;
                }
                if (!new File(m25056e, "pcbc").exists()) {
                    m25060i(4027, currentTimeMillis);
                    return false;
                }
                m25060i(5019, currentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
