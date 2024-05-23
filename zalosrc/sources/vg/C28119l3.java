package vg;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mm0.AbstractC23349d;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p588vw.C28647m;
import p588vw.C28655u;

/* renamed from: vg.l3 */
/* loaded from: classes.dex */
public class C28119l3 {

    /* renamed from: q */
    static volatile C28119l3 f131111q;

    /* renamed from: a */
    int f131112a = 0;

    /* renamed from: b */
    int f131113b = 1;

    /* renamed from: c */
    int f131114c = 1;

    /* renamed from: d */
    boolean f131115d = false;

    /* renamed from: e */
    boolean f131116e = false;

    /* renamed from: f */
    boolean f131117f = false;

    /* renamed from: g */
    int f131118g = 0;

    /* renamed from: h */
    String f131119h = "";

    /* renamed from: i */
    String f131120i = "";

    /* renamed from: j */
    String f131121j = "";

    /* renamed from: k */
    String f131122k = "";

    /* renamed from: l */
    String f131123l = "";

    /* renamed from: m */
    String f131124m = "";

    /* renamed from: n */
    String f131125n = "";

    /* renamed from: o */
    String f131126o = "";

    /* renamed from: p */
    String f131127p = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.l3$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == -69) {
                C28119l3.this.f131112a = 6;
            } else {
                C28119l3.this.f131112a++;
            }
            AbstractC23309i.m122329qq(System.currentTimeMillis());
            AbstractC23309i.m122669zx(5);
            C28119l3.this.f131115d = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int m122166mc;
            String str;
            try {
                AbstractC23309i.m122329qq(System.currentTimeMillis());
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                String jSONObject = optJSONObject.toString();
                AbstractC23309i.m120793Bj(jSONObject);
                C28119l3.this.m141605e(jSONObject);
                optJSONObject.optJSONObject("features");
                if (!TextUtils.isEmpty(C28119l3.this.f131124m) && TextUtils.isEmpty(CoreUtility.f89233i) && (m122166mc = AbstractC23309i.m122166mc()) != 3 && m122166mc != 6 && m122166mc != 4) {
                    AbstractC23309i.m122669zx(4);
                    if (!TextUtils.isEmpty(C28119l3.this.f131124m)) {
                        String str2 = "";
                        if (C28647m.m143325c().m143328b().get(C28119l3.this.f131124m) == null) {
                            str = "";
                        } else {
                            str = ((C28655u) C28647m.m143325c().m143328b().get(C28119l3.this.f131124m)).f132864b;
                        }
                        if (C28647m.m143325c().m143328b().get(C28119l3.this.f131124m) != null) {
                            str2 = ((C28655u) C28647m.m143325c().m143328b().get(C28119l3.this.f131124m)).f132865c;
                        }
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            AbstractC23309i.m121870ej(str2);
                            AbstractC23309i.m122587xp(str);
                            AbstractC20887g.m109229g(125030, 125033, str);
                        }
                        C23744a.m124114c().m124116d(37, new Object[0]);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (AbstractC23309i.m122166mc() != 4) {
                    AbstractC23309i.m122669zx(5);
                }
                C28119l3.this.f131112a++;
            }
            C28119l3.this.f131115d = false;
        }
    }

    C28119l3() {
    }

    /* renamed from: c */
    public static synchronized C28119l3 m141601c() {
        C28119l3 c28119l3;
        synchronized (C28119l3.class) {
            try {
                if (f131111q == null) {
                    synchronized (C28119l3.class) {
                        try {
                            if (f131111q == null) {
                                f131111q = new C28119l3();
                            }
                        } finally {
                        }
                    }
                }
                c28119l3 = f131111q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28119l3;
    }

    /* renamed from: a */
    public void m141602a() {
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            if (this.f131115d || !TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            int m122166mc = AbstractC23309i.m122166mc();
            if (!this.f131116e) {
                String m122415t1 = AbstractC23309i.m122415t1();
                if (!TextUtils.isEmpty(m122415t1)) {
                    m141605e(m122415t1);
                    if (!TextUtils.isEmpty(this.f131124m) && TextUtils.isEmpty(CoreUtility.f89233i) && m122166mc != 3 && m122166mc != 6 && m122166mc != 4) {
                        if (!TextUtils.isEmpty(this.f131124m)) {
                            if (C28647m.m143325c().m143328b().get(this.f131124m) == null) {
                                str3 = "";
                            } else {
                                str3 = ((C28655u) C28647m.m143325c().m143328b().get(this.f131124m)).f132864b;
                            }
                            if (C28647m.m143325c().m143328b().get(this.f131124m) == null) {
                                str4 = "";
                            } else {
                                str4 = ((C28655u) C28647m.m143325c().m143328b().get(this.f131124m)).f132865c;
                            }
                            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                                AbstractC23309i.m121870ej(str4);
                                AbstractC23309i.m122587xp(str3);
                                AbstractC20887g.m109229g(125030, 125031, str3);
                            }
                            C23744a.m124114c().m124116d(37, new Object[0]);
                            AbstractC23309i.m122669zx(4);
                            m122166mc = 4;
                        } else {
                            AbstractC23309i.m122669zx(5);
                        }
                    }
                }
                this.f131116e = true;
            }
            if (!this.f131117f && TextUtils.isEmpty(this.f131121j) && m122166mc != 3 && m122166mc != 6 && m122166mc != 4 && m122166mc != 1) {
                this.f131117f = true;
                String m143329d = C28647m.m143325c().m143329d();
                this.f131121j = m143329d;
                if (!TextUtils.isEmpty(m143329d)) {
                    C28655u c28655u = (C28655u) C28647m.m143325c().m143328b().get(this.f131121j);
                    if (c28655u != null) {
                        String str5 = c28655u.f132864b;
                        this.f131119h = str5;
                        this.f131120i = c28655u.f132865c;
                        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(this.f131120i)) {
                            AbstractC23309i.m122587xp(this.f131119h);
                            AbstractC23309i.m121870ej(this.f131120i);
                            AbstractC20887g.m109229g(125030, 125032, this.f131119h);
                            AbstractC23309i.m122669zx(1);
                        } else {
                            AbstractC23309i.m122669zx(2);
                        }
                    }
                } else {
                    AbstractC23309i.m122669zx(2);
                }
            }
            if (this.f131112a <= 5 && this.f131118g <= 10) {
                if (System.currentTimeMillis() - AbstractC23309i.m121482U5() > AbstractC23160o0.m119261j0(this.f131112a, 500L)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((m122166mc != 3 || m122166mc != 6 || m122166mc != 4) && TextUtils.isEmpty(this.f131122k) && TextUtils.isEmpty(this.f131124m) && z11 && C23055e5.m118271f()) {
                    this.f131115d = true;
                    String str6 = "0";
                    try {
                        str = AbstractC23309i.m121037I4();
                        try {
                            str6 = AbstractC23349d.m122766d() + "";
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                            str2 = "";
                            C0766k c0766k = new C0766k();
                            c0766k.mo1704o8(new a());
                            this.f131118g++;
                            c0766k.mo1538T4(str6, str, str2, "");
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = "";
                    }
                    if (!TextUtils.isEmpty(this.f131119h)) {
                        str2 = this.f131119h;
                        C0766k c0766k2 = new C0766k();
                        c0766k2.mo1704o8(new a());
                        this.f131118g++;
                        c0766k2.mo1538T4(str6, str, str2, "");
                    }
                    str2 = "";
                    C0766k c0766k22 = new C0766k();
                    c0766k22.mo1704o8(new a());
                    this.f131118g++;
                    c0766k22.mo1538T4(str6, str, str2, "");
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
            this.f131115d = false;
        }
    }

    /* renamed from: b */
    public String m141603b() {
        if (!TextUtils.isEmpty(this.f131124m)) {
            return this.f131124m;
        }
        if (!TextUtils.isEmpty(this.f131121j)) {
            return this.f131121j;
        }
        return "vi";
    }

    /* renamed from: d */
    public String m141604d() {
        String m141577b = AbstractC28102j5.m141577b();
        String m141603b = m141603b();
        m141603b.hashCode();
        if (m141603b.equals("MM")) {
            return "my";
        }
        return m141577b;
    }

    /* renamed from: e */
    public void m141605e(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.f131113b = optJSONObject.optInt("login_layout");
            this.f131114c = optJSONObject.optInt("update_info_layout");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mcc_mnc");
            this.f131123l = optJSONObject2.optString("isocountrycodes");
            this.f131122k = optJSONObject2.optString("countrycode");
            this.f131125n = optJSONObject2.optString("country");
            this.f131126o = optJSONObject2.optString("mcc");
            this.f131127p = optJSONObject2.optString("mnc");
            if (!TextUtils.isEmpty(this.f131123l) && this.f131123l.split("/").length > 1) {
                str2 = this.f131123l.split("/")[0];
            } else {
                str2 = "";
            }
            this.f131124m = str2;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
