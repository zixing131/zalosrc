package p304ks;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ls.C22644d;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p348mi.AbstractC23304d;
import qm0.AbstractC25332a0;

/* renamed from: ks.w */
/* loaded from: classes4.dex */
public final class C21937w {

    /* renamed from: a */
    public static final C21937w f108027a = new C21937w();

    /* renamed from: b */
    private static final long[] f108028b = {21600000, 0, 15000, 30000, 60000, 900000, 3600000, 21600000, 86400000};

    /* renamed from: c */
    private static C18635e f108029c = new C18635e();

    /* renamed from: d */
    private static final AtomicInteger f108030d = new AtomicInteger(1);

    /* renamed from: e */
    private static long f108031e;

    /* renamed from: f */
    private static boolean f108032f;

    /* renamed from: g */
    private static InterfaceC20094a f108033g;

    /* renamed from: ks.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f108034a;

        a(List list) {
            this.f108034a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42581x7(this.f108034a);
        }
    }

    /* renamed from: ks.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f108035a;

        b(ContactProfile contactProfile) {
            this.f108035a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42401g8(new C22644d(this.f108035a));
        }
    }

    /* renamed from: ks.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42102E0();
        }
    }

    /* renamed from: ks.w$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() == -69) {
                C21937w.f108030d.set(0);
            } else if (C21937w.f108030d.incrementAndGet() >= C21937w.f108028b.length) {
                C21937w.f108030d.set(1);
            }
            C21937w.f108032f = false;
            InterfaceC20094a interfaceC20094a = C21937w.f108033g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.isNull("data")) {
                        jSONArray = null;
                    } else {
                        jSONArray = jSONObject.getJSONArray("data");
                    }
                    if (jSONArray != null) {
                        C21937w.f108027a.m114570h();
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            arrayList.add(new C22644d(jSONArray.getJSONObject(i11)));
                        }
                        C21937w.f108027a.m114567e(arrayList);
                    }
                    InterfaceC20094a interfaceC20094a = C21937w.f108033g;
                    if (interfaceC20094a != null) {
                        interfaceC20094a.mo927b(obj);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC0924m0.m4264uj(System.currentTimeMillis());
                C21937w.f108030d.set(1);
                C21937w.f108032f = false;
            } catch (Throwable th2) {
                AbstractC0924m0.m4264uj(System.currentTimeMillis());
                C21937w.f108030d.set(1);
                C21937w.f108032f = false;
                throw th2;
            }
        }
    }

    /* renamed from: ks.w$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108036a;

        e(String str) {
            this.f108036a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42404gc(new C22644d(this.f108036a));
        }
    }

    private C21937w() {
    }

    /* renamed from: i */
    private final void m114566i() {
        f108032f = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d());
        c0766k.mo1443H5("75", "1", "500");
    }

    /* renamed from: e */
    public final void m114567e(List list) {
        AbstractC19074t.m100208f(list, "hiddenList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f108029c.add(((C22644d) it.next()).m117215a());
        }
        C0824j.m2153b(new a(list));
    }

    /* renamed from: f */
    public final void m114568f(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            f108029c.add(contactProfile);
            C0824j.m2153b(new b(contactProfile));
        }
    }

    /* renamed from: g */
    public final void m114569g() {
        if (!AbstractC23304d.f113427q1.get() && !f108032f && C23055e5.m118273h(false, 1, null) && System.currentTimeMillis() - AbstractC0924m0.m4305w2() >= 86400000 && System.currentTimeMillis() - f108031e >= f108028b[f108030d.get()]) {
            f108031e = System.currentTimeMillis();
            m114566i();
        }
    }

    /* renamed from: h */
    public final void m114570h() {
        f108029c.clear();
        C0824j.m2153b(new c());
    }

    /* renamed from: j */
    public final List m114571j() {
        List m131187O0;
        m131187O0 = AbstractC25332a0.m131187O0(f108029c);
        return m131187O0;
    }

    /* renamed from: k */
    public final void m114572k(InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        f108033g = interfaceC20094a;
        m114566i();
    }

    /* renamed from: l */
    public final void m114573l() {
        m114570h();
        AbstractC0924m0.m4264uj(0L);
    }

    /* renamed from: m */
    public final boolean m114574m(String str) {
        return f108029c.mo98490g(str);
    }

    /* renamed from: n */
    public final void m114575n() {
        List m42420i5 = C7960e.m41971c6().m42420i5();
        if (m42420i5 != null) {
            Iterator it = m42420i5.iterator();
            while (it.hasNext()) {
                f108029c.add(((C22644d) it.next()).m117215a());
            }
        }
    }

    /* renamed from: o */
    public final void m114576o(String str) {
        if (str != null && str.length() != 0) {
            f108029c.m98493m(str);
            C0824j.m2153b(new e(str));
        }
    }
}
