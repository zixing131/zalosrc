package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import p229i5.AbstractC20290k;

/* loaded from: classes2.dex */
public final class j13 {

    /* renamed from: a */
    private final File f22593a;

    /* renamed from: b */
    final File f22594b;

    /* renamed from: c */
    private final SharedPreferences f22595c;

    /* renamed from: d */
    private final int f22596d;

    public j13(Context context, int i11) {
        this.f22595c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        k13.m23801a(dir, false);
        this.f22593a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        k13.m23801a(dir2, true);
        this.f22594b = dir2;
        this.f22596d = i11;
    }

    /* renamed from: a */
    static String m23501a(C4721lg c4721lg) {
        return AbstractC20290k.m105936a(c4721lg.mo27347h().m24738k());
    }

    /* renamed from: e */
    private final File m23502e() {
        File file = new File(this.f22593a, Integer.toString(this.f22596d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m23503f() {
        int i11 = this.f22596d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(i11 - 1);
        return sb2.toString();
    }

    /* renamed from: g */
    private final String m23504g() {
        int i11 = this.f22596d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(i11 - 1);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m23505b(C4611ig c4611ig, n13 n13Var) {
        boolean z11;
        C4721lg m23506c;
        C4721lg m23506c2;
        String m24284O = c4611ig.m23244H().m24284O();
        byte[] m24738k = c4611ig.m23246J().m24738k();
        byte[] m24738k2 = c4611ig.m23245I().m24738k();
        if (!TextUtils.isEmpty(m24284O) && m24738k2 != null && m24738k2.length != 0) {
            k13.m23804d(this.f22594b);
            this.f22594b.mkdirs();
            k13.m23803c(m24284O, this.f22594b).mkdirs();
            File m23802b = k13.m23802b(m24284O, "pcam.jar", this.f22594b);
            if ((m24738k == null || m24738k.length <= 0 || k13.m23805e(m23802b, m24738k)) && k13.m23805e(k13.m23802b(m24284O, "pcbc", this.f22594b), m24738k2)) {
                File m23802b2 = k13.m23802b(c4611ig.m23244H().m24284O(), "pcam.jar", this.f22594b);
                if (m23802b2.exists() && n13Var != null && !n13Var.mo21692a(m23802b2)) {
                    return false;
                }
                String m24284O2 = c4611ig.m23244H().m24284O();
                if (!TextUtils.isEmpty(m24284O2)) {
                    File m23802b3 = k13.m23802b(m24284O2, "pcam.jar", this.f22594b);
                    File m23802b4 = k13.m23802b(m24284O2, "pcbc", this.f22594b);
                    File m23802b5 = k13.m23802b(m24284O2, "pcam.jar", m23502e());
                    File m23802b6 = k13.m23802b(m24284O2, "pcbc", m23502e());
                    if ((!m23802b3.exists() || m23802b3.renameTo(m23802b5)) && m23802b4.exists() && m23802b4.renameTo(m23802b6)) {
                        C4684kg m24270I = C4721lg.m24270I();
                        m24270I.m23942v(c4611ig.m23244H().m24284O());
                        m24270I.m23938q(c4611ig.m23244H().m24283N());
                        m24270I.m23939r(c4611ig.m23244H().m24280F());
                        m24270I.m23941u(c4611ig.m23244H().m24282H());
                        m24270I.m23940s(c4611ig.m23244H().m24281G());
                        C4721lg c4721lg = (C4721lg) m24270I.m25898n();
                        C4721lg m23506c3 = m23506c(1);
                        SharedPreferences.Editor edit = this.f22595c.edit();
                        if (m23506c3 != null && !c4721lg.m24284O().equals(m23506c3.m24284O())) {
                            edit.putString(m23503f(), m23501a(m23506c3));
                        }
                        edit.putString(m23504g(), m23501a(c4721lg));
                        if (edit.commit()) {
                            z11 = true;
                            HashSet hashSet = new HashSet();
                            m23506c = m23506c(1);
                            if (m23506c != null) {
                                hashSet.add(m23506c.m24284O());
                            }
                            m23506c2 = m23506c(2);
                            if (m23506c2 != null) {
                                hashSet.add(m23506c2.m24284O());
                            }
                            for (File file : m23502e().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    k13.m23804d(k13.m23803c(name, m23502e()));
                                }
                            }
                            return z11;
                        }
                    }
                }
                z11 = false;
                HashSet hashSet2 = new HashSet();
                m23506c = m23506c(1);
                if (m23506c != null) {
                }
                m23506c2 = m23506c(2);
                if (m23506c2 != null) {
                }
                while (r4 < r1) {
                }
                return z11;
            }
        }
        return false;
    }

    /* renamed from: c */
    final C4721lg m23506c(int i11) {
        String string;
        if (i11 == 1) {
            string = this.f22595c.getString(m23504g(), null);
        } else {
            string = this.f22595c.getString(m23503f(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            C4721lg m24273L = C4721lg.m24273L(mt3.m24726I(AbstractC20290k.m105938c(string)));
            String m24284O = m24273L.m24284O();
            File m23802b = k13.m23802b(m24284O, "pcam.jar", m23502e());
            if (!m23802b.exists()) {
                m23802b = k13.m23802b(m24284O, "pcam", m23502e());
            }
            File m23802b2 = k13.m23802b(m24284O, "pcbc", m23502e());
            if (m23802b.exists()) {
                if (m23802b2.exists()) {
                    return m24273L;
                }
            }
        } catch (zzgrq unused) {
        }
        return null;
    }

    /* renamed from: d */
    public final i13 m23507d(int i11) {
        C4721lg m23506c = m23506c(1);
        if (m23506c == null) {
            return null;
        }
        String m24284O = m23506c.m24284O();
        File m23802b = k13.m23802b(m24284O, "pcam.jar", m23502e());
        if (!m23802b.exists()) {
            m23802b = k13.m23802b(m24284O, "pcam", m23502e());
        }
        return new i13(m23506c, m23802b, k13.m23802b(m24284O, "pcbc", m23502e()), k13.m23802b(m24284O, "pcopt", m23502e()));
    }
}
