package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ge3 {

    /* renamed from: b */
    private static final Logger f20567b = Logger.getLogger(ge3.class.getName());

    /* renamed from: a */
    private final ConcurrentMap f20568a;

    public ge3() {
        this.f20568a = new ConcurrentHashMap();
    }

    /* renamed from: f */
    private final synchronized fe3 m22426f(String str) {
        if (this.f20568a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (fe3) this.f20568a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:            r6.f20568a.putIfAbsent(r0, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:            return;     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void m22427g(fe3 fe3Var, boolean z11) {
        try {
            String zzf = fe3Var.zzb().zzf();
            fe3 fe3Var2 = (fe3) this.f20568a.get(zzf);
            if (fe3Var2 != null && !fe3Var2.zzc().equals(fe3Var.zzc())) {
                f20567b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzf, fe3Var2.zzc().getName(), fe3Var.zzc().getName()));
            }
            this.f20568a.put(zzf, fe3Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public final zd3 m22428a(String str, Class cls) {
        fe3 m22426f = m22426f(str);
        if (m22426f.zze().contains(cls)) {
            return m22426f.mo20867a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(m22426f.zzc());
        Set<Class> zze = m22426f.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Class cls2 : zze) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z11 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2.toString());
    }

    /* renamed from: b */
    public final zd3 m22429b(String str) {
        return m22426f(str).zzb();
    }

    /* renamed from: c */
    public final synchronized void m22430c(oj3 oj3Var, zi3 zi3Var) {
        Class zzd;
        try {
            int mo24326e = zi3Var.mo24326e();
            if (yg3.m28203a(1)) {
                if (yg3.m28203a(mo24326e)) {
                    String mo20515c = oj3Var.mo20515c();
                    String mo20515c2 = zi3Var.mo20515c();
                    if (this.f20568a.containsKey(mo20515c) && ((fe3) this.f20568a.get(mo20515c)).zzd() != null && (zzd = ((fe3) this.f20568a.get(mo20515c)).zzd()) != null && !zzd.getName().equals(zi3Var.getClass().getName())) {
                        f20567b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + mo20515c + " with inconsistent public key type " + mo20515c2);
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", oj3Var.getClass().getName(), zzd.getName(), zi3Var.getClass().getName()));
                    }
                    m22427g(new de3(oj3Var, zi3Var), true);
                    m22427g(new ce3(zi3Var), false);
                } else {
                    throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zi3Var.getClass()) + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(oj3Var.getClass()) + " as it is not FIPS compatible.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final synchronized void m22431d(zi3 zi3Var) {
        if (yg3.m28203a(zi3Var.mo24326e())) {
            m22427g(new ce3(zi3Var), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zi3Var.getClass()) + " as it is not FIPS compatible.");
        }
    }

    /* renamed from: e */
    public final boolean m22432e(String str) {
        return this.f20568a.containsKey(str);
    }

    public ge3(ge3 ge3Var) {
        this.f20568a = new ConcurrentHashMap(ge3Var.f20568a);
    }
}
