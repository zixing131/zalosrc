package tn;

import android.text.TextUtils;
import bo.C3000l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: tn.v */
/* loaded from: classes4.dex */
public class C26767v {

    /* renamed from: c */
    private static C26767v f126972c;

    /* renamed from: a */
    private final Object f126973a = new Object();

    /* renamed from: b */
    private final Map f126974b = new LinkedHashMap();

    private C26767v() {
    }

    /* renamed from: d */
    public static synchronized C26767v m137782d() {
        C26767v c26767v;
        synchronized (C26767v.class) {
            try {
                if (f126972c == null) {
                    f126972c = new C26767v();
                }
                c26767v = f126972c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26767v;
    }

    /* renamed from: a */
    public void m137783a(C3000l0 c3000l0) {
        if (c3000l0 != null && c3000l0.f11895q != null) {
            try {
                synchronized (this.f126973a) {
                    try {
                        if (!this.f126974b.containsKey(c3000l0.f11895q)) {
                            this.f126974b.put(c3000l0.f11895q, c3000l0);
                        } else {
                            throw new IllegalArgumentException("Feed already existed: " + c3000l0.f11895q);
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void m137784b() {
        try {
            this.f126974b.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public C3000l0 m137785c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126973a) {
                    try {
                        if (this.f126974b.containsKey(str)) {
                            return (C3000l0) this.f126974b.get(str);
                        }
                        return null;
                    } finally {
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public ArrayList m137786e() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this.f126973a) {
            try {
                if (this.f126974b != null) {
                    return new ArrayList(this.f126974b.values());
                }
                return arrayList;
            } finally {
            }
        }
    }

    /* renamed from: f */
    public int m137787f() {
        return this.f126974b.size();
    }

    /* renamed from: g */
    public void m137788g(String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f126974b.containsKey(str)) {
                C3000l0 c3000l0 = (C3000l0) this.f126974b.get(str);
                if (c3000l0 != null) {
                    m137789h(c3000l0.f11895q);
                    m137783a(c3000l0);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveFeedToTop; Invalid feed id : ");
            if (str == null) {
                str = "NULL";
            }
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m137789h(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f126973a) {
                    this.f126974b.remove(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
