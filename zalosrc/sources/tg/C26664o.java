package tg;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p348mi.AbstractC23304d;

/* renamed from: tg.o */
/* loaded from: classes3.dex */
public class C26664o {

    /* renamed from: f */
    private static volatile C26664o f126188f;

    /* renamed from: a */
    Set f126189a = new HashSet();

    /* renamed from: b */
    Map f126190b = new HashMap();

    /* renamed from: c */
    private String f126191c = "";

    /* renamed from: d */
    final Object f126192d = new Object();

    /* renamed from: e */
    final Object f126193e = new Object();

    /* renamed from: a */
    public static C26664o m136836a() {
        if (f126188f == null) {
            synchronized (C26664o.class) {
                try {
                    if (f126188f == null) {
                        f126188f = new C26664o();
                    }
                } finally {
                }
            }
        }
        return f126188f;
    }

    /* renamed from: b */
    public boolean m136837b(String str) {
        return this.f126191c.equals(str);
    }

    /* renamed from: c */
    public boolean m136838c() {
        return !this.f126191c.isEmpty();
    }

    /* renamed from: d */
    public boolean m136839d(String str) {
        boolean containsKey;
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126193e) {
                    containsKey = this.f126190b.containsKey(str);
                }
                return containsKey;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public void m136840e(C26663n c26663n) {
        try {
            synchronized (this.f126192d) {
                if (c26663n != null) {
                    try {
                        if (c26663n.m136829e()) {
                            AtomicInteger atomicInteger = AbstractC23304d.f113357a;
                            for (C26663n c26663n2 : this.f126189a) {
                                c26663n2.m136830h(true);
                                if (AbstractC23304d.f113300L2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Single Mode -- Cancel effect--");
                                    sb2.append(c26663n2.f126181b);
                                }
                            }
                            this.f126189a.clear();
                            this.f126189a.add(c26663n);
                        } else {
                            AtomicInteger atomicInteger2 = AbstractC23304d.f113357a;
                            this.f126189a.add(c26663n);
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m136841f(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126193e) {
                    this.f126190b.put(str, str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m136842g(C26663n c26663n) {
        try {
            synchronized (this.f126192d) {
                try {
                    this.f126189a.remove(c26663n);
                    if (AbstractC23304d.f113300L2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("removeEffect --");
                        sb2.append(c26663n.f126181b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m136843h(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126193e) {
                    this.f126190b.remove(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m136844i(String str) {
        this.f126191c = str;
    }
}
