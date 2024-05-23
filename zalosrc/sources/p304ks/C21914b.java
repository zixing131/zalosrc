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

/* renamed from: ks.b */
/* loaded from: classes4.dex */
public final class C21914b {

    /* renamed from: a */
    public static final C21914b f107731a = new C21914b();

    /* renamed from: b */
    private static final long[] f107732b = {21600000, 0, 15000, 30000, 60000, 900000, 3600000, 21600000, 86400000};

    /* renamed from: c */
    private static C18635e f107733c = new C18635e();

    /* renamed from: d */
    private static final AtomicInteger f107734d = new AtomicInteger(1);

    /* renamed from: e */
    private static long f107735e;

    /* renamed from: f */
    private static boolean f107736f;

    /* renamed from: ks.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f107737a;

        a(List list) {
            this.f107737a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42532s7(this.f107737a);
        }
    }

    /* renamed from: ks.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f107738a;

        b(ContactProfile contactProfile) {
            this.f107738a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42107E7(new C22644d(this.f107738a));
        }
    }

    /* renamed from: ks.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42516r0();
        }
    }

    /* renamed from: ks.b$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f107739a;

        d(InterfaceC20094a interfaceC20094a) {
            this.f107739a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() == -69) {
                C21914b.f107734d.set(0);
            } else if (C21914b.f107734d.incrementAndGet() >= C21914b.f107732b.length) {
                C21914b.f107734d.set(1);
            }
            C21914b.f107736f = false;
            InterfaceC20094a interfaceC20094a = this.f107739a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20094a interfaceC20094a;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("expireTime", 0);
                        if (optInt < 1) {
                            optInt = 86400;
                        }
                        AbstractC0924m0.m4407zh(optInt * 1000);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                        if (optJSONArray != null) {
                            C21914b.f107731a.m114197g();
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                arrayList.add(new C22644d(optJSONArray.getJSONObject(i11)));
                            }
                            C21914b.f107731a.m114194d(arrayList);
                        }
                    }
                    AbstractC0924m0.m4145qj(System.currentTimeMillis());
                    C21914b.f107734d.set(1);
                    C21914b.f107736f = false;
                    interfaceC20094a = this.f107739a;
                    if (interfaceC20094a == null) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AbstractC0924m0.m4145qj(System.currentTimeMillis());
                    C21914b.f107734d.set(1);
                    C21914b.f107736f = false;
                    interfaceC20094a = this.f107739a;
                    if (interfaceC20094a == null) {
                        return;
                    }
                }
                interfaceC20094a.mo927b(obj);
            } catch (Throwable th2) {
                AbstractC0924m0.m4145qj(System.currentTimeMillis());
                C21914b.f107734d.set(1);
                C21914b.f107736f = false;
                InterfaceC20094a interfaceC20094a2 = this.f107739a;
                if (interfaceC20094a2 != null) {
                    interfaceC20094a2.mo927b(obj);
                }
                throw th2;
            }
        }
    }

    /* renamed from: ks.b$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f107740a;

        /* renamed from: b */
        final /* synthetic */ String f107741b;

        e(InterfaceC20094a interfaceC20094a, String str) {
            this.f107740a = interfaceC20094a;
            this.f107741b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            InterfaceC20094a interfaceC20094a = this.f107740a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C21914b.f107731a.m114203n(this.f107741b);
            InterfaceC20094a interfaceC20094a = this.f107740a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(obj);
            }
        }
    }

    /* renamed from: ks.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107742a;

        f(String str) {
            this.f107742a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42203Mb(new C22644d(this.f107742a));
        }
    }

    private C21914b() {
    }

    /* renamed from: h */
    private final void m114193h(InterfaceC20094a interfaceC20094a) {
        f107736f = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(interfaceC20094a));
        c0766k.mo1566W8();
    }

    /* renamed from: d */
    public final void m114194d(List list) {
        AbstractC19074t.m100208f(list, "blockCallList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f107733c.add(((C22644d) it.next()).m117215a());
        }
        C0824j.m2153b(new a(list));
    }

    /* renamed from: e */
    public final void m114195e(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            f107733c.add(contactProfile);
            C0824j.m2153b(new b(contactProfile));
        }
    }

    /* renamed from: f */
    public final void m114196f(boolean z11, InterfaceC20094a interfaceC20094a) {
        if (AbstractC23304d.f113427q1.get()) {
            return;
        }
        if (f107736f && !z11) {
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(50001, null));
            }
        } else {
            if (!z11 && System.currentTimeMillis() - AbstractC0924m0.m4188s2() < AbstractC0924m0.m3617Z0()) {
                return;
            }
            if (z11 || System.currentTimeMillis() - f107735e >= f107732b[f107734d.get()]) {
                f107735e = System.currentTimeMillis();
                m114193h(interfaceC20094a);
            }
        }
    }

    /* renamed from: g */
    public final void m114197g() {
        f107733c.clear();
        C0824j.m2153b(new c());
    }

    /* renamed from: i */
    public final List m114198i() {
        List m131187O0;
        m131187O0 = AbstractC25332a0.m131187O0(f107733c);
        return m131187O0;
    }

    /* renamed from: j */
    public final void m114199j() {
        m114197g();
        AbstractC0924m0.m4145qj(0L);
    }

    /* renamed from: k */
    public final boolean m114200k(String str) {
        return f107733c.mo98490g(str);
    }

    /* renamed from: l */
    public final void m114201l() {
        List m42261S4 = C7960e.m41971c6().m42261S4();
        if (m42261S4 != null) {
            Iterator it = m42261S4.iterator();
            while (it.hasNext()) {
                f107733c.add(((C22644d) it.next()).m117215a());
            }
        }
    }

    /* renamed from: m */
    public final void m114202m(String str, int i11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(interfaceC20094a, str));
        c0766k.mo1509P7(str, i11);
    }

    /* renamed from: n */
    public final void m114203n(String str) {
        if (str != null && str.length() != 0) {
            f107733c.m98493m(str);
            C0824j.m2153b(new f(str));
        }
    }
}
