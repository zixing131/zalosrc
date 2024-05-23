package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public abstract class df3 {

    /* renamed from: a */
    private static final Logger f19204a = Logger.getLogger(df3.class.getName());

    /* renamed from: b */
    private static final AtomicReference f19205b = new AtomicReference(new ge3());

    /* renamed from: c */
    private static final ConcurrentMap f19206c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f19207d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f19208e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f19209f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap f19210g = new ConcurrentHashMap();

    /* renamed from: a */
    public static sd3 m21367a(String str) {
        if (str != null) {
            ConcurrentMap concurrentMap = f19208e;
            Locale locale = Locale.US;
            AbstractC30228a.m149044a(concurrentMap.get(str.toLowerCase(locale)));
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                        if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                            if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                if (str.toLowerCase(locale).startsWith("tink")) {
                                    format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                                }
                            } else {
                                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                            }
                        } else {
                            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                        }
                    } else {
                        format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                    }
                } else {
                    format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                }
            } else {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static zd3 m21368b(String str) {
        return ((ge3) f19205b.get()).m22429b(str);
    }

    /* renamed from: c */
    public static synchronized jp3 m21369c(pp3 pp3Var) {
        jp3 mo20495d;
        synchronized (df3.class) {
            zd3 m21368b = m21368b(pp3Var.m25511J());
            if (((Boolean) f19207d.get(pp3Var.m25511J())).booleanValue()) {
                mo20495d = m21368b.mo20495d(pp3Var.m25510I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(pp3Var.m25511J())));
            }
        }
        return mo20495d;
    }

    /* renamed from: d */
    public static synchronized zv3 m21370d(pp3 pp3Var) {
        zv3 mo20494c;
        synchronized (df3.class) {
            zd3 m21368b = m21368b(pp3Var.m25511J());
            if (((Boolean) f19207d.get(pp3Var.m25511J())).booleanValue()) {
                mo20494c = m21368b.mo20494c(pp3Var.m25510I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(pp3Var.m25511J())));
            }
        }
        return mo20494c;
    }

    /* renamed from: e */
    public static Class m21371e(Class cls) {
        af3 af3Var = (af3) f19209f.get(cls);
        if (af3Var == null) {
            return null;
        }
        return af3Var.zza();
    }

    /* renamed from: f */
    public static Object m21372f(jp3 jp3Var, Class cls) {
        return m21373g(jp3Var.m23718J(), jp3Var.m23717I(), cls);
    }

    /* renamed from: g */
    public static Object m21373g(String str, mt3 mt3Var, Class cls) {
        return ((ge3) f19205b.get()).m22428a(str, cls).mo20492a(mt3Var);
    }

    /* renamed from: h */
    public static Object m21374h(String str, zv3 zv3Var, Class cls) {
        return ((ge3) f19205b.get()).m22428a(str, cls).mo20493b(zv3Var);
    }

    /* renamed from: i */
    public static Object m21375i(ze3 ze3Var, Class cls) {
        af3 af3Var = (af3) f19209f.get(cls);
        if (af3Var != null) {
            if (af3Var.zza().equals(ze3Var.m28489c())) {
                return af3Var.mo20104a(ze3Var);
            }
            throw new GeneralSecurityException("Wrong input primitive class, expected " + af3Var.zza().toString() + ", got " + ze3Var.m28489c().toString());
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(ze3Var.m28489c().getName()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static synchronized Map m21376j() {
        Map unmodifiableMap;
        synchronized (df3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f19210g);
        }
        return unmodifiableMap;
    }

    /* renamed from: k */
    public static synchronized void m21377k(oj3 oj3Var, zi3 zi3Var, boolean z11) {
        synchronized (df3.class) {
            try {
                AtomicReference atomicReference = f19205b;
                ge3 ge3Var = new ge3((ge3) atomicReference.get());
                ge3Var.m22430c(oj3Var, zi3Var);
                String mo20515c = oj3Var.mo20515c();
                String mo20515c2 = zi3Var.mo20515c();
                m21380n(mo20515c, oj3Var.mo20513a().mo20116c(), true);
                m21380n(mo20515c2, Collections.emptyMap(), false);
                if (!((ge3) atomicReference.get()).m22432e(mo20515c)) {
                    f19206c.put(mo20515c, new cf3(oj3Var));
                    m21381o(oj3Var.mo20515c(), oj3Var.mo20513a().mo20116c());
                }
                ConcurrentMap concurrentMap = f19207d;
                concurrentMap.put(mo20515c, Boolean.TRUE);
                concurrentMap.put(mo20515c2, Boolean.FALSE);
                atomicReference.set(ge3Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public static synchronized void m21378l(zi3 zi3Var, boolean z11) {
        synchronized (df3.class) {
            try {
                AtomicReference atomicReference = f19205b;
                ge3 ge3Var = new ge3((ge3) atomicReference.get());
                ge3Var.m22431d(zi3Var);
                String mo20515c = zi3Var.mo20515c();
                m21380n(mo20515c, zi3Var.mo20513a().mo20116c(), true);
                if (!((ge3) atomicReference.get()).m22432e(mo20515c)) {
                    f19206c.put(mo20515c, new cf3(zi3Var));
                    m21381o(mo20515c, zi3Var.mo20513a().mo20116c());
                }
                f19207d.put(mo20515c, Boolean.TRUE);
                atomicReference.set(ge3Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public static synchronized void m21379m(af3 af3Var) {
        synchronized (df3.class) {
            try {
                if (af3Var != null) {
                    Class zzb = af3Var.zzb();
                    ConcurrentMap concurrentMap = f19209f;
                    if (concurrentMap.containsKey(zzb)) {
                        af3 af3Var2 = (af3) concurrentMap.get(zzb);
                        if (!af3Var.getClass().getName().equals(af3Var2.getClass().getName())) {
                            f19204a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                            throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), af3Var2.getClass().getName(), af3Var.getClass().getName()));
                        }
                    }
                    concurrentMap.put(zzb, af3Var);
                } else {
                    throw new IllegalArgumentException("wrapper must be non-null");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private static synchronized void m21380n(String str, Map map, boolean z11) {
        synchronized (df3.class) {
            if (z11) {
                try {
                    ConcurrentMap concurrentMap = f19207d;
                    if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                    if (((ge3) f19205b.get()).m22432e(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!f19210g.containsKey(entry.getKey())) {
                                throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (f19210g.containsKey(entry2.getKey())) {
                                throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zv3, java.lang.Object] */
    /* renamed from: o */
    private static void m21381o(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f19210g.put((String) entry.getKey(), ie3.m23234e(str, ((xi3) entry.getValue()).f30478a.mo27346a(), ((xi3) entry.getValue()).f30479b));
        }
    }
}
