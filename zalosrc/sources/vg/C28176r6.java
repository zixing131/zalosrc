package vg;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31961i8;

/* renamed from: vg.r6 */
/* loaded from: classes3.dex */
public class C28176r6 {

    /* renamed from: i */
    static volatile C28176r6 f131273i = null;

    /* renamed from: j */
    public static boolean f131274j = false;

    /* renamed from: a */
    private int f131275a = 20;

    /* renamed from: b */
    private int f131276b = 2;

    /* renamed from: c */
    private boolean f131277c = false;

    /* renamed from: d */
    private boolean f131278d = false;

    /* renamed from: e */
    Map f131279e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    Set f131280f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    Set f131281g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    public Map f131282h = Collections.synchronizedMap(new HashMap());

    /* renamed from: vg.r6$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f131283a;

        /* renamed from: b */
        final /* synthetic */ String f131284b;

        /* renamed from: c */
        final /* synthetic */ String f131285c;

        a(String str, String str2, String str3) {
            this.f131283a = str;
            this.f131284b = str2;
            this.f131285c = str3;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                try {
                    C31961i8 m42106E6 = C7960e.m41971c6().m42106E6(this.f131283a, this.f131284b);
                    if (m42106E6 != null) {
                        C28176r6.this.f131279e.put(this.f131285c, m42106E6);
                        C23744a.m124114c().m124116d(4, this.f131283a);
                    } else {
                        C28176r6.this.m141706g(this.f131284b, this.f131283a);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C28176r6.this.f131280f.remove(this.f131285c);
            } catch (Throwable th2) {
                C28176r6.this.f131280f.remove(this.f131285c);
                throw th2;
            }
        }
    }

    /* renamed from: vg.r6$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131287a;

        /* renamed from: b */
        final /* synthetic */ String f131288b;

        /* renamed from: c */
        final /* synthetic */ String f131289c;

        b(String str, String str2, String str3) {
            this.f131287a = str;
            this.f131288b = str2;
            this.f131289c = str3;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C31961i8 c31961i8;
            if (c20096c != null) {
                try {
                    try {
                        if (c20096c.m104491c() == -17204 && (c31961i8 = (C31961i8) C28176r6.this.f131279e.get(this.f131288b)) != null && !TextUtils.isEmpty(c31961i8.f146880a) && c31961i8.f146880a.equals(this.f131289c)) {
                            C28176r6.this.f131279e.remove(this.f131288b);
                            C7960e.m41971c6().m42345b4(this.f131287a, this.f131289c);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                } finally {
                    C28176r6.this.f131281g.remove(this.f131288b);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null && C28176r6.this.m141711l(new C31961i8(optJSONObject))) {
                        C23744a.m124114c().m124116d(5, this.f131287a);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                C28176r6.this.f131281g.remove(this.f131288b);
            }
        }
    }

    public C28176r6() {
        m141710k();
    }

    /* renamed from: b */
    public static void m141700b() {
        f131274j = false;
    }

    /* renamed from: c */
    private String m141701c(String str, String str2) {
        return str + "_" + str2;
    }

    /* renamed from: d */
    public static synchronized C28176r6 m141702d() {
        C28176r6 c28176r6;
        synchronized (C28176r6.class) {
            try {
                if (f131273i == null) {
                    synchronized (C28176r6.class) {
                        try {
                            if (f131273i == null) {
                                f131273i = new C28176r6();
                            }
                        } finally {
                        }
                    }
                }
                c28176r6 = f131273i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28176r6;
    }

    /* renamed from: a */
    public void m141703a() {
        this.f131279e.clear();
        m141700b();
    }

    /* renamed from: e */
    public int m141704e() {
        return this.f131275a;
    }

    /* renamed from: f */
    public int m141705f() {
        return this.f131276b;
    }

    /* renamed from: g */
    void m141706g(String str, String str2) {
        String m141701c = m141701c(str2, str);
        if (this.f131281g.contains(m141701c)) {
            return;
        }
        this.f131281g.add(m141701c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(str2, m141701c, str));
        c0766k.mo1506P4(str);
    }

    /* renamed from: h */
    public C31961i8 m141707h(String str, String str2, long j11) {
        String m141701c = m141701c(str, str2);
        C31961i8 c31961i8 = (C31961i8) this.f131279e.get(m141701c);
        if (c31961i8 == null) {
            if (!this.f131280f.contains(m141701c)) {
                this.f131280f.add(m141701c);
                C0824j.m2153b(new a(str, str2, m141701c));
                return null;
            }
            return null;
        }
        if (str2.equals(c31961i8.f146880a)) {
            long j12 = c31961i8.f146895p;
            if (j11 > j12 || (j11 == j12 && (c31961i8.f146900u || !c31961i8.m153670h()))) {
                m141706g(str2, str);
            }
            if (j11 >= c31961i8.f146895p) {
                return c31961i8;
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public boolean m141708i() {
        return this.f131277c;
    }

    /* renamed from: j */
    public boolean m141709j() {
        return this.f131278d;
    }

    /* renamed from: k */
    public void m141710k() {
        boolean z11;
        try {
            String m121823da = AbstractC23309i.m121823da();
            if (!TextUtils.isEmpty(m121823da)) {
                JSONObject jSONObject = new JSONObject(m121823da);
                boolean z12 = false;
                if (jSONObject.optInt("enable") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f131277c = z11;
                if (jSONObject.optInt("expandSetting", 0) >= 1) {
                    z12 = true;
                }
                this.f131278d = z12;
                int optInt = jSONObject.optInt("minOptions");
                int optInt2 = jSONObject.optInt("maxOptions");
                if (optInt >= 0) {
                    this.f131276b = optInt;
                }
                if (optInt2 >= 0) {
                    this.f131275a = optInt2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public synchronized boolean m141711l(C31961i8 c31961i8) {
        String m141701c = m141701c("group_" + c31961i8.f146883d, c31961i8.f146880a);
        C31961i8 c31961i82 = (C31961i8) this.f131279e.get(m141701c);
        if (c31961i82 != null && c31961i82.f146880a.equals(c31961i8.f146880a) && c31961i82.f146895p > c31961i8.f146895p) {
            return false;
        }
        this.f131279e.put(m141701c, c31961i8);
        C7960e.m41971c6().m42255R8(c31961i8);
        if (c31961i82 != null && c31961i82.m153670h() && !c31961i8.m153670h()) {
            c31961i8.m153665b(c31961i82);
            c31961i8.f146900u = true;
        }
        C23744a.m124114c().m124116d(3100, c31961i8);
        return true;
    }
}
