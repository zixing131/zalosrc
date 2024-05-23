package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class p13 {

    /* renamed from: g */
    private static final HashMap f26032g = new HashMap();

    /* renamed from: a */
    private final Context f26033a;

    /* renamed from: b */
    private final q13 f26034b;

    /* renamed from: c */
    private final xz2 f26035c;

    /* renamed from: d */
    private final sz2 f26036d;

    /* renamed from: e */
    private h13 f26037e;

    /* renamed from: f */
    private final Object f26038f = new Object();

    public p13(Context context, q13 q13Var, xz2 xz2Var, sz2 sz2Var) {
        this.f26033a = context;
        this.f26034b = q13Var;
        this.f26035c = xz2Var;
        this.f26036d = sz2Var;
    }

    /* renamed from: d */
    private final synchronized Class m25377d(i13 i13Var) {
        try {
            String m24284O = i13Var.m23110a().m24284O();
            HashMap hashMap = f26032g;
            Class cls = (Class) hashMap.get(m24284O);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.f26036d.m26458a(i13Var.m23112c())) {
                    try {
                        File m23111b = i13Var.m23111b();
                        if (!m23111b.exists()) {
                            m23111b.mkdirs();
                        }
                        Class<?> loadClass = new DexClassLoader(i13Var.m23112c().getAbsolutePath(), m23111b.getAbsolutePath(), null, this.f26033a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        hashMap.put(m24284O, loadClass);
                        return loadClass;
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        throw new zzfou(2008, e);
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        throw new zzfou(2008, e);
                    } catch (SecurityException e13) {
                        e = e13;
                        throw new zzfou(2008, e);
                    }
                }
                throw new zzfou(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e14) {
                throw new zzfou(2026, e14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public final b03 m25378a() {
        h13 h13Var;
        synchronized (this.f26038f) {
            h13Var = this.f26037e;
        }
        return h13Var;
    }

    /* renamed from: b */
    public final i13 m25379b() {
        synchronized (this.f26038f) {
            try {
                h13 h13Var = this.f26037e;
                if (h13Var != null) {
                    return h13Var.m22679f();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m25380c(i13 i13Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                h13 h13Var = new h13(m25377d(i13Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f26033a, "msa-r", i13Var.m23114e(), null, new Bundle(), 2), i13Var, this.f26034b, this.f26035c);
                if (h13Var.m22681h()) {
                    int m22678e = h13Var.m22678e();
                    if (m22678e == 0) {
                        synchronized (this.f26038f) {
                            h13 h13Var2 = this.f26037e;
                            if (h13Var2 != null) {
                                try {
                                    h13Var2.m22680g();
                                } catch (zzfou e11) {
                                    this.f26035c.m28094c(e11.m28814a(), -1L, e11);
                                }
                            }
                            this.f26037e = h13Var;
                        }
                        this.f26035c.m28095d(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfou(4001, "ci: " + m22678e);
                }
                throw new zzfou(4000, "init failed");
            } catch (Exception e12) {
                throw new zzfou(ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, e12);
            }
        } catch (zzfou e13) {
            this.f26035c.m28094c(e13.m28814a(), System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        } catch (Exception e14) {
            this.f26035c.m28094c(4010, System.currentTimeMillis() - currentTimeMillis, e14);
            return false;
        }
    }
}
