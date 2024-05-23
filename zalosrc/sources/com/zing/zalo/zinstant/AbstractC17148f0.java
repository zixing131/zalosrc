package com.zing.zalo.zinstant;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import ck0.C3568b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.ScriptHelperImpl;
import dk0.C18020c;
import hk0.AbstractC20084b;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.AbstractC20595r;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20599v;
import ik0.InterfaceC20578a0;
import ik0.InterfaceC20585h;
import lk0.C22504b;
import lk0.C22505c;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import pj0.C24777c;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24791q;
import vj0.C28273g;

/* renamed from: com.zing.zalo.zinstant.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC17148f0 {

    /* renamed from: a */
    private static final String f87665a = "f0";

    /* renamed from: b */
    private static C17177r0 f87666b;

    /* renamed from: c */
    private static C17152g1 f87667c;

    /* renamed from: d */
    static final SparseArray f87668d = new a();

    /* renamed from: com.zing.zalo.zinstant.f0$a */
    /* loaded from: classes.dex */
    class a extends SparseArray {
        a() {
            put(0, new C17104b1(0, 0, 0, 0, 0));
            put(2, new C17104b1(2, 2, 111023, 0, 110023));
            put(1, new C17104b1(1, 1, 111018, 112018, 110018));
            put(7, new C17104b1(7, 3, 111024, 112024, 110024));
            put(9, new C17104b1(9, 4, 111025, 112025, 110025));
            put(8, new C17104b1(8, 5, 111026, 112026, 110026));
            put(29, new C17104b1(29, 12, 111037, 112037, 110037));
            put(31, new C17104b1(31, 13, 111038, 112038, 110038));
            put(19, new C17104b1(19, 8, 111033, 112033, 110033));
            put(20, new C17104b1(20, 7, 111032, 112032, 110032));
            put(23, new C17104b1(23, 9, 111034, 112034, 110034));
            put(24, new C17104b1(24, 10, 111035, 112035, 110035));
            put(27, new C17104b1(27, 11, 111036, 112036, 110036));
            put(35, new C17104b1(35, 14, 111039, 112039, 110039));
            put(37, new C17104b1(37, 15, 111040, 112040, 110040));
            put(39, new C17104b1(39, 17, 111042, 112042, 110042));
            put(41, new C17104b1(41, 18, 111043, 112043, 110043));
            put(43, new C17104b1(43, 19, 111044, 112044, 110044));
            put(45, new C17104b1(45, 20, 111045, 112045, 110045));
            put(47, new C17104b1(47, 21, 111046, 112046, 110046));
            put(49, new C17104b1(49, 22, 111047, 112047, 110047));
            put(51, new C17104b1(51, 23, 111048, 112048, 110048));
            put(53, new C17104b1(53, 24, 111049, 112049, 110049));
            put(55, new C17104b1(55, 25, 111050, 112050, 110050));
            put(57, new C17104b1(57, 26, 111051, 112051, 110051));
            put(58, new C17104b1(58, 27, 111052, 112052, 110052));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.f0$b */
    /* loaded from: classes7.dex */
    public class b implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f87669a;

        /* renamed from: b */
        final /* synthetic */ int f87670b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC20083a f87671c;

        b(InterfaceC22508f interfaceC22508f, int i11, InterfaceC20083a interfaceC20083a) {
            this.f87669a = interfaceC22508f;
            this.f87670b = i11;
            this.f87671c = interfaceC20083a;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            this.f87671c.mo15332c(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC20084b.m104428b(this.f87669a, this.f87670b, AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), AbstractC17148f0.m91685d(), this.f87671c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.f0$c */
    /* loaded from: classes7.dex */
    public class c implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f87672a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24775a f87673b;

        /* renamed from: com.zing.zalo.zinstant.f0$c$a */
        /* loaded from: classes7.dex */
        class a implements InterfaceC20083a {
            a() {
            }

            @Override // hk0.InterfaceC20083a
            /* renamed from: a */
            public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
                c.this.f87673b.onSuccess(null);
            }

            @Override // hk0.InterfaceC20083a
            /* renamed from: c */
            public void mo15332c(Exception exc) {
                c.this.f87673b.mo15338c(exc);
            }
        }

        c(InterfaceC22508f interfaceC22508f, InterfaceC24775a interfaceC24775a) {
            this.f87672a = interfaceC22508f;
            this.f87673b = interfaceC24775a;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            this.f87673b.mo15338c(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC20084b.m104427a(this.f87672a, AbstractC17201m.m91816h(AbstractC17158i1.m91742a()), -1, AbstractC17158i1.f87698h, AbstractC17158i1.m91746e(), AbstractC17148f0.m91685d(), new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.f0$d */
    /* loaded from: classes7.dex */
    public class d implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C17244x0 f87675a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24775a f87676b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f87677c;

        d(C17244x0 c17244x0, InterfaceC24775a interfaceC24775a, JSONObject jSONObject) {
            this.f87675a = c17244x0;
            this.f87676b = interfaceC24775a;
            this.f87677c = jSONObject;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            this.f87676b.mo15338c(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            InterfaceC22508f interfaceC22508f;
            try {
                C17244x0 c17244x0 = this.f87675a;
                if (c17244x0 != null) {
                    interfaceC22508f = c17244x0.m92064b();
                } else {
                    interfaceC22508f = null;
                }
                if (interfaceC22508f == null) {
                    this.f87676b.mo15338c(new IllegalArgumentException("Invalid ZinstantDataModel"));
                    return;
                }
                if (interfaceC22508f instanceof C22505c) {
                    C22505c c22505c = (C22505c) interfaceC22508f;
                    JSONObject jSONObject = this.f87677c;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("originalData", c22505c.m116357d());
                    AbstractC17148f0.m91688g().mo91708a(c22505c.getFeatureType(), c22505c.m116360g(), c22505c.getZinstantDataId(), c22505c.m116358e(), c22505c.m116359f(), C20599v.m107204a().m107212d(), jSONObject.toString().trim(), this.f87676b);
                    return;
                }
                if (interfaceC22508f instanceof C22504b) {
                    this.f87676b.onSuccess((C22504b) interfaceC22508f);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122775e("ZaloZinstant", "Error when getZinstantData()", e11);
                this.f87676b.mo15338c(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.f0$e */
    /* loaded from: classes.dex */
    public static class e implements InterfaceC20585h {
        @Override // ik0.InterfaceC20585h
        /* renamed from: a */
        public void mo91700a(AbstractC20601x abstractC20601x, Exception exc) {
            String str;
            C17104b1 c17104b1 = (C17104b1) AbstractC17148f0.f87668d.get(abstractC20601x.mo107090i());
            if (c17104b1 != null) {
                AbstractC20597t mo107100s = abstractC20601x.mo107100s();
                if (mo107100s != null) {
                    str = mo107100s.mo107080h();
                } else {
                    AbstractC20595r mo107098q = abstractC20601x.mo107098q();
                    if (mo107098q != null) {
                        str = mo107098q.mo107048g();
                    } else {
                        str = null;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(String.format("%s", str));
                }
                AbstractC17153h.m91719k(new Exception(String.format("%s - %s", sb2, exc.getMessage())));
                AbstractC20110a.m104543l(AbstractC17148f0.f87665a).mo104550c(exc, "onSkeletonErrored: featureConfig.qosLayoutRequest: %s", Integer.valueOf(c17104b1.f87480e));
            }
        }

        @Override // ik0.InterfaceC20585h
        /* renamed from: b */
        public void mo91701b(AbstractC20601x abstractC20601x, Exception exc) {
            String str;
            C17104b1 c17104b1 = (C17104b1) AbstractC17148f0.f87668d.get(abstractC20601x.mo107090i());
            if (c17104b1 != null) {
                AbstractC20597t mo107100s = abstractC20601x.mo107100s();
                if (mo107100s != null) {
                    str = mo107100s.mo107080h();
                } else {
                    AbstractC20595r mo107098q = abstractC20601x.mo107098q();
                    if (mo107098q != null) {
                        str = mo107098q.mo107048g();
                    } else {
                        str = null;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = abstractC20601x.mo107099r();
                }
                String format = String.format("%s|%s|%s", Integer.valueOf(c17104b1.f87480e % 100), str, exc.getMessage());
                Exception exc2 = new Exception(format);
                int m91698q = AbstractC17148f0.m91698q(c17104b1.f87480e);
                AbstractC17153h.m91715g(m91698q, exc2);
                AbstractC20110a.m104543l("Zinstant").mo104548a("onErrored: featureConfig.qosLayoutRequest:" + m91698q + " | Msg: " + format, new Object[0]);
            }
        }

        @Override // ik0.InterfaceC20585h
        /* renamed from: c */
        public void mo91702c(AbstractC20601x abstractC20601x, long j11, long j12) {
            C17104b1 c17104b1 = (C17104b1) AbstractC17148f0.f87668d.get(abstractC20601x.mo107090i());
            if (c17104b1 != null) {
                int m91698q = AbstractC17148f0.m91698q(c17104b1.f87480e);
                AbstractC17153h.m91722n(m91698q, j11, j12);
                AbstractC20110a.m104543l("Zinstant").mo104548a("onLayouted: qos: %s - Start(%s) End(%s) Duration(%s)", Integer.valueOf(m91698q), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j11 - j12));
            }
        }

        @Override // ik0.InterfaceC20585h
        /* renamed from: d */
        public void mo91703d(AbstractC20601x abstractC20601x) {
            C17104b1 c17104b1 = (C17104b1) AbstractC17148f0.f87668d.get(abstractC20601x.mo107090i());
            AbstractC17153h.m91720l();
            AbstractC20110a.m104543l(AbstractC17148f0.f87665a).mo104548a("onSkeletonLayouted: featureConfig.qosLayoutRequest:%s", Integer.valueOf(c17104b1.f87480e));
        }
    }

    /* renamed from: c */
    public static int m91684c() {
        return AbstractC17158i1.m91746e();
    }

    /* renamed from: d */
    public static synchronized C17177r0 m91685d() {
        C17177r0 c17177r0;
        synchronized (AbstractC17148f0.class) {
            try {
                if (f87666b == null) {
                    f87666b = new C17177r0();
                }
                c17177r0 = f87666b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17177r0;
    }

    /* renamed from: e */
    public static void m91686e(C17244x0 c17244x0, JSONObject jSONObject, InterfaceC24775a interfaceC24775a) {
        C3568b.m18124b().m18127d(new d(c17244x0, interfaceC24775a, jSONObject));
    }

    /* renamed from: f */
    public static int m91687f(int i11) {
        C17104b1 c17104b1 = (C17104b1) f87668d.get(i11);
        if (c17104b1 == null) {
            return 110000;
        }
        return m91698q(c17104b1.f87478c);
    }

    /* renamed from: g */
    public static synchronized C17152g1 m91688g() {
        C17152g1 c17152g1;
        synchronized (AbstractC17148f0.class) {
            try {
                if (f87667c == null) {
                    f87667c = new C17152g1();
                }
                c17152g1 = f87667c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17152g1;
    }

    /* renamed from: h */
    public static int m91689h(int i11) {
        C17104b1 c17104b1 = (C17104b1) f87668d.get(i11);
        if (c17104b1 == null) {
            return 110000;
        }
        return m91698q(c17104b1.f87479d);
    }

    /* renamed from: i */
    public static int m91690i(int i11) {
        C17104b1 c17104b1 = (C17104b1) f87668d.get(i11);
        if (c17104b1 == null) {
            return 0;
        }
        return c17104b1.f87477b;
    }

    /* renamed from: j */
    public static void m91691j() {
        AbstractC17158i1.m91749h(AbstractC23136l9.m118663M(AbstractC16803z.ic_loading_24), AbstractC23136l9.m118663M(AbstractC16803z.icn_csc_error));
    }

    /* renamed from: k */
    public static void m91692k(Context context) {
        AbstractC17158i1.m91748g(context);
        AbstractC17158i1.f87692b = new C17156i();
        AbstractC17153h.m91716h(new C17150g());
    }

    /* renamed from: l */
    public static void m91693l() {
        try {
            C24777c.m128780t().m128791x();
            C18020c.m95817m().m95823A();
            C20599v.m107204a().m107216i();
            InterfaceC24791q zinstantPreferencesData = ScriptHelperImpl.getZinstantPreferencesData();
            if (zinstantPreferencesData instanceof C17141d1) {
                ((C17141d1) zinstantPreferencesData).m91659n();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m91694m(InterfaceC22508f interfaceC22508f, int i11, InterfaceC20083a interfaceC20083a) {
        try {
            if (i11 <= 0) {
                interfaceC20083a.mo15332c(new Exception("TargetWidth is invalid"));
            } else {
                C3568b.m18124b().m18127d(new b(interfaceC22508f, i11, interfaceC20083a));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            interfaceC20083a.mo15332c(e11);
        }
    }

    /* renamed from: n */
    public static void m91695n(InterfaceC22508f interfaceC22508f, InterfaceC24775a interfaceC24775a) {
        C3568b.m18124b().m18127d(new c(interfaceC22508f, interfaceC24775a));
    }

    /* renamed from: o */
    public static void m91696o(float f11) {
        C28273g.m142453z(f11);
    }

    /* renamed from: p */
    public static void m91697p(int i11) {
        AbstractC17158i1.m91750i(i11);
    }

    /* renamed from: q */
    public static int m91698q(int i11) {
        int i12 = (i11 % 10000) / 1000;
        if (i12 != 1) {
            if (i12 != 2) {
                return i11;
            }
            return 112099;
        }
        return 111099;
    }

    /* renamed from: r */
    public static void m91699r() {
        float f11;
        if (C13778s1.m76966g()) {
            f11 = C13778s1.m76962c();
        } else {
            f11 = 1.0f;
        }
        C28273g.m142453z(f11);
        if (C13778s1.m76960a()) {
            C28273g.m142430B(2);
        } else {
            C28273g.m142430B(0);
        }
    }
}
