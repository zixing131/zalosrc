package p497rz;

import ae.C0766k;
import ag0.AbstractC0826k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0824j;
import ag0.C0843s0;
import am.AbstractC0900b0;
import am.AbstractC0939u;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.report_v2.reportsuccess.C9337a;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.C20834z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import mz.C23493c;
import nz.C23965b;
import nz.C23966c;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21914b;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21937w;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p405ov.C24561c;
import p409oz.C24585b;
import p461qu.AbstractC25495a;
import p497rz.C26041f;
import p716zh.C31853b5;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vg.C28203u6;

/* renamed from: rz.f */
/* loaded from: classes4.dex */
public final class C26041f extends AbstractC19962a implements InterfaceC26036a {

    /* renamed from: A */
    private volatile boolean f124174A;

    /* renamed from: B */
    private volatile String f124175B;

    /* renamed from: C */
    private volatile boolean f124176C;

    /* renamed from: D */
    private volatile boolean f124177D;

    /* renamed from: E */
    private volatile boolean f124178E;

    /* renamed from: t */
    private final C24585b f124179t;

    /* renamed from: u */
    private String f124180u;

    /* renamed from: v */
    private String f124181v;

    /* renamed from: w */
    private C23966c f124182w;

    /* renamed from: x */
    private volatile List f124183x;

    /* renamed from: y */
    private volatile List f124184y;

    /* renamed from: z */
    private volatile ContactProfile f124185z;

    /* renamed from: rz.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f124186a;

        a(ContactProfile contactProfile) {
            this.f124186a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C21914b.f107731a.m114195e(this.f124186a);
        }
    }

    /* renamed from: rz.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f124187a;

        b(ContactProfile contactProfile) {
            this.f124187a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21912a.m114159g().m114162b(this.f124187a);
        }
    }

    /* renamed from: rz.f$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f124189b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f124190c;

        /* renamed from: rz.f$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f124191a;

            /* renamed from: b */
            final /* synthetic */ String f124192b;

            a(ContactProfile contactProfile, String str) {
                this.f124191a = contactProfile;
                this.f124192b = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f124191a, true);
                C7960e.m41971c6().m42234Pb(this.f124192b);
            }
        }

        c(String str, ContactProfile contactProfile) {
            this.f124189b = str;
            this.f124190c = contactProfile;
        }

        /* renamed from: e */
        public static final void m134138e(C26041f c26041f) {
            AbstractC19074t.m100208f(c26041f, "this$0");
            if (((InterfaceC26038c) c26041f.m103742Dp()).mo45894h0()) {
                InterfaceC26038c interfaceC26038c = (InterfaceC26038c) c26041f.m103742Dp();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC26038c.mo78936E(m118743r0);
                c26041f.m134127cq();
            }
        }

        /* renamed from: f */
        public static final void m134139f() {
            try {
                AbstractC23088h5.m118426g();
            } catch (Exception e11) {
                AbstractC0900b0.m2786b("[REPORT_V2]", e11.toString());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int m104491c;
            if (c20096c != null) {
                try {
                    try {
                        m104491c = c20096c.m104491c();
                    } catch (Exception e11) {
                        AbstractC0900b0.m2786b("[REPORT_V2]", e11.toString());
                    }
                } catch (Throwable th2) {
                    C26041f.this.m134134eq(false);
                    ((InterfaceC26038c) C26041f.this.m103742Dp()).mo78960q3();
                    throw th2;
                }
            } else {
                m104491c = -1000;
            }
            ToastUtils.m89259g(m104491c);
            C26041f.this.m134134eq(false);
            ((InterfaceC26038c) C26041f.this.m103742Dp()).mo78960q3();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[Catch: all -> 0x0028, Exception -> 0x0046, TryCatch #2 {Exception -> 0x0046, blocks: (B:3:0x000c, B:11:0x0041, B:15:0x0049, B:17:0x005b, B:19:0x0067, B:20:0x0069, B:22:0x007f, B:24:0x008f, B:25:0x00a8, B:27:0x00cf, B:28:0x00d2, B:33:0x0030), top: B:2:0x000c, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x0028, Exception -> 0x0046, TryCatch #2 {Exception -> 0x0046, blocks: (B:3:0x000c, B:11:0x0041, B:15:0x0049, B:17:0x005b, B:19:0x0067, B:20:0x0069, B:22:0x007f, B:24:0x008f, B:25:0x00a8, B:27:0x00cf, B:28:0x00d2, B:33:0x0030), top: B:2:0x000c, outer: #1 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    jSONObject = (JSONObject) obj;
                    try {
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104551d("[REPORT_V2]", e11.toString());
                    }
                } catch (Exception e12) {
                    AbstractC0900b0.m2786b("[REPORT_V2]", e12.toString());
                }
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                    if (!jSONObject2.isNull("code")) {
                        i11 = jSONObject2.getInt("code");
                    } else {
                        i11 = -999;
                    }
                    if (i11 == 0) {
                        ToastUtils.m89259g(i11);
                    } else {
                        boolean m114558y = AbstractC21935u.m114558y(this.f124189b);
                        ContactProfile m98552o = C18644n.m98531l().m98552o(this.f124189b);
                        if (m98552o == null) {
                            m98552o = C28203u6.m141798e(C28203u6.f131407a, this.f124189b, null, 2, null);
                        }
                        if (m98552o == null) {
                            m98552o = this.f124190c;
                        }
                        m98552o.f42403c1 = false;
                        C28203u6.f131407a.m141824w(m98552o);
                        C21927m.m114302u().m114350o0(this.f124189b);
                        if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f124189b)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(Integer.parseInt(this.f124189b)));
                            C21927m.m114302u().m114338i0(arrayList);
                        }
                        C0824j.m2153b(new a(m98552o, this.f124189b));
                        ((InterfaceC26038c) C26041f.this.m103742Dp()).mo70710wy(new Runnable() { // from class: rz.g
                            public /* synthetic */ RunnableC26042g() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C26041f.c.m134138e(C26041f.this);
                            }
                        });
                        C19669z.Companion.m103232a().m103198O0();
                        if (m114558y) {
                            C18644n.m98524E();
                        }
                        ((InterfaceC26038c) C26041f.this.m103742Dp()).mo70710wy(new Runnable() { // from class: rz.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                C26041f.c.m134139f();
                            }
                        });
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
            } finally {
                C26041f.this.m134134eq(false);
                ((InterfaceC26038c) C26041f.this.m103742Dp()).mo78960q3();
            }
        }
    }

    /* renamed from: rz.f$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f124193a;

        d(ContactProfile contactProfile) {
            this.f124193a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C21937w.f108027a.m114568f(this.f124193a);
            C20834z0.f102412a.m108928g(true);
        }
    }

    /* renamed from: rz.f$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0826k.c {
        e(String str, TrackingSource trackingSource) {
            super(str, trackingSource);
        }

        /* renamed from: c */
        public static final void m134141c(C26041f c26041f, ContactProfile contactProfile) {
            AbstractC19074t.m100208f(c26041f, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$profileNetwork");
            c26041f.f124185z = contactProfile;
            c26041f.m134121Tp();
        }

        @Override // ag0.AbstractC0826k.c, ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            JSONObject jSONObject;
            C24848g0 c24848g0;
            super.mo2158a(obj);
            String str = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                C26041f c26041f = C26041f.this;
                ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                String str2 = contactProfile.f42434r;
                String str3 = c26041f.f124180u;
                if (str3 == null) {
                    AbstractC19074t.m100223u("reportUid");
                    str3 = null;
                }
                if (AbstractC19074t.m100204b(str2, str3)) {
                    ((InterfaceC26038c) c26041f.m103742Dp()).mo70710wy(new Runnable() { // from class: rz.i

                        /* renamed from: q */
                        public final /* synthetic */ ContactProfile f124201q;

                        public /* synthetic */ RunnableC26044i(ContactProfile contactProfile2) {
                            r2 = contactProfile2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26041f.e.m134141c(C26041f.this, r2);
                        }
                    });
                }
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                String str4 = C26041f.this.f124180u;
                if (str4 == null) {
                    AbstractC19074t.m100223u("reportUid");
                } else {
                    str = str4;
                }
                C24561c.m127942b("[REPORT_V2]", "fetch profileNetwork fail, " + str);
            }
        }
    }

    /* renamed from: rz.f$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f124195a;

        /* renamed from: b */
        final /* synthetic */ boolean f124196b;

        /* renamed from: c */
        final /* synthetic */ ContactProfile f124197c;

        /* renamed from: d */
        final /* synthetic */ C26041f f124198d;

        f(String str, boolean z11, ContactProfile contactProfile, C26041f c26041f) {
            this.f124195a = str;
            this.f124196b = z11;
            this.f124197c = contactProfile;
            this.f124198d = c26041f;
        }

        /* renamed from: e */
        public static final void m134144e(C26041f c26041f) {
            AbstractC19074t.m100208f(c26041f, "this$0");
            if (((InterfaceC26038c) c26041f.m103742Dp()).mo45894h0()) {
                InterfaceC26038c interfaceC26038c = (InterfaceC26038c) c26041f.m103742Dp();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC26038c.mo78936E(m118743r0);
                c26041f.m134127cq();
            }
        }

        /* renamed from: f */
        public static final void m134145f() {
            try {
                AbstractC23088h5.m118426g();
            } catch (Exception e11) {
                AbstractC0900b0.m2788d("[REPORT_V2]", e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("[REPORT_V2]", e11);
                }
            } finally {
                this.f124198d.m134135fq(false);
                ((InterfaceC26038c) this.f124198d.m103742Dp()).mo78960q3();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[Catch: all -> 0x002b, Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:7:0x0037, B:11:0x003f, B:14:0x0079, B:15:0x0080, B:17:0x0095, B:18:0x00ae, B:20:0x00b6, B:22:0x00be, B:24:0x00ca, B:25:0x00d6, B:26:0x00df, B:32:0x00f3, B:33:0x00f4, B:35:0x011c, B:36:0x0136, B:40:0x0188, B:41:0x0189, B:46:0x002f), top: B:45:0x002f, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[Catch: all -> 0x002b, Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:7:0x0037, B:11:0x003f, B:14:0x0079, B:15:0x0080, B:17:0x0095, B:18:0x00ae, B:20:0x00b6, B:22:0x00be, B:24:0x00ca, B:25:0x00d6, B:26:0x00df, B:32:0x00f3, B:33:0x00f4, B:35:0x011c, B:36:0x0136, B:40:0x0188, B:41:0x0189, B:46:0x002f), top: B:45:0x002f, outer: #2 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            int i11;
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    jSONObject = (JSONObject) obj;
                } catch (Exception e11) {
                    try {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    } catch (Exception e12) {
                        AbstractC0900b0.m2788d("[REPORT_V2]", e12);
                    }
                }
                if (jSONObject.has("data")) {
                    String string = new JSONObject(jSONObject.getString("data")).getString("code");
                    AbstractC19074t.m100207e(string, "getString(...)");
                    i11 = Integer.parseInt(string);
                    if (i11 == 0) {
                        ToastUtils.m89259g(i11);
                    } else {
                        C7960e.m41971c6().m42136Gd(this.f124195a, false);
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        c28203u6.m141827z(this.f124195a, false);
                        ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f124195a);
                        ContactProfile m98552o = C18644n.m98531l().m98552o(this.f124195a);
                        C18644n.m98531l().m98540I(this.f124195a);
                        c28203u6.m141804B(this.f124195a, 0);
                        if (m153138j == null && m98552o != null) {
                            C7960e.m41971c6().m42221O7(m98552o, false);
                        }
                        C21927m.m114302u().m114350o0(this.f124195a);
                        if (C7960e.m41971c6().m42096D9(this.f124195a)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(Integer.parseInt(this.f124195a)));
                            C21927m.m114302u().m114338i0(arrayList);
                        }
                        if (!AbstractC25495a.m132084i(this.f124195a) && AbstractC21935u.m114515E(this.f124195a) && AbstractC23306f.m120562A().m2529X(this.f124195a)) {
                            C7959d.Companion.m41850e().m41774b3(this.f124195a, 2);
                        }
                        Map map = AbstractC23304d.f113421p;
                        AbstractC19074t.m100207e(map, "mapRecentClickUids");
                        String str = this.f124195a;
                        synchronized (map) {
                            try {
                                if (map.containsKey(str)) {
                                    C7960e.m41971c6().m42376e4(str);
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                        AbstractC21935u.m114533W(this.f124195a, -1, "");
                        AbstractC23059e9.m118317F(this.f124195a);
                        C21927m.m114302u().m114352p0(this.f124195a);
                        C7960e.m41971c6().m42099Dc(this.f124195a);
                        AbstractC0852x.m2332I(this.f124195a);
                        if (this.f124196b) {
                            AbstractC0852x.m2355l(MainApplication.Companion.m35500c(), this.f124197c.f42455y, new SensitiveData("phonebook_delete_after_report", "phonebook_delete", null, 4, null));
                        }
                        ((InterfaceC26038c) this.f124198d.m103742Dp()).mo70710wy(new Runnable() { // from class: rz.j
                            public /* synthetic */ RunnableC26045j() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C26041f.f.m134144e(C26041f.this);
                            }
                        });
                        C19669z.Companion.m103232a().m103198O0();
                        C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
                        C21920f.m114270a().m114272c(this.f124195a);
                        ((InterfaceC26038c) this.f124198d.m103742Dp()).mo70710wy(new Runnable() { // from class: rz.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                C26041f.f.m134145f();
                            }
                        });
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
            } finally {
                this.f124198d.m134135fq(false);
                ((InterfaceC26038c) this.f124198d.m103742Dp()).mo78960q3();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26041f(InterfaceC26038c interfaceC26038c, C24585b c24585b) {
        super(interfaceC26038c);
        AbstractC19074t.m100208f(interfaceC26038c, "view");
        AbstractC19074t.m100208f(c24585b, "reportRepo");
        this.f124179t = c24585b;
        this.f124175B = "";
        this.f124176C = true;
    }

    /* renamed from: Tp */
    public final void m134121Tp() {
        if (this.f124185z != null) {
            C23493c c23493c = C23493c.f114055a;
            String str = this.f124181v;
            String str2 = null;
            if (str == null) {
                AbstractC19074t.m100223u("reportObjectName");
                str = null;
            }
            String str3 = this.f124180u;
            if (str3 == null) {
                AbstractC19074t.m100223u("reportUid");
            } else {
                str2 = str3;
            }
            this.f124175B = c23493c.m123319f(str, str2, this.f124185z);
            ((InterfaceC26038c) m103742Dp()).mo70710wy(new Runnable() { // from class: rz.e
                public /* synthetic */ RunnableC26040e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26041f.m134122Wp(C26041f.this);
                }
            });
        }
    }

    /* renamed from: Wp */
    public static final void m134122Wp(C26041f c26041f) {
        AbstractC19074t.m100208f(c26041f, "this$0");
        ((InterfaceC26038c) c26041f.m103742Dp()).mo50279jc(c26041f.f124175B);
        if (c26041f.f124174A) {
            ((InterfaceC26038c) c26041f.m103742Dp()).mo50277dA(c26041f.f124184y, c26041f.f124175B);
        }
    }

    /* renamed from: Xp */
    public static final void m134123Xp(C26041f c26041f) {
        AbstractC19074t.m100208f(c26041f, "this$0");
        C28203u6 c28203u6 = C28203u6.f131407a;
        String str = c26041f.f124180u;
        String str2 = null;
        if (str == null) {
            AbstractC19074t.m100223u("reportUid");
            str = null;
        }
        ContactProfile m141800i = C28203u6.m141800i(c28203u6, str, false, 2, null);
        if (m141800i == null) {
            String str3 = c26041f.f124180u;
            if (str3 == null) {
                AbstractC19074t.m100223u("reportUid");
                str3 = null;
            }
            ContactProfile m141798e = C28203u6.m141798e(c28203u6, str3, null, 2, null);
            if (m141798e == null) {
                C0843s0 m2286r = C0843s0.m2286r();
                String str4 = c26041f.f124180u;
                if (str4 == null) {
                    AbstractC19074t.m100223u("reportUid");
                } else {
                    str2 = str4;
                }
                m2286r.m2294e(new e(str2, new TrackingSource((short) 1062)));
            } else {
                c26041f.f124185z = m141798e;
            }
        } else {
            c26041f.f124185z = m141800i;
        }
        c26041f.m134124Yp();
        c26041f.m134121Tp();
    }

    /* renamed from: Yp */
    private final void m134124Yp() {
        C23965b m128040s;
        C23966c c23966c = this.f124182w;
        if (c23966c == null) {
            AbstractC19074t.m100223u("reportObjectConfig");
            c23966c = null;
        }
        for (String str : c23966c.m125422a()) {
            if (str.length() > 0 && (m128040s = this.f124179t.m128040s(str)) != null) {
                if (this.f124183x == null) {
                    this.f124183x = new ArrayList();
                }
                List list = this.f124183x;
                if (list != null) {
                    list.add(m128040s);
                }
            }
        }
        this.f124184y = m134128dq(this.f124183x, true);
        this.f124174A = true;
    }

    /* renamed from: Zp */
    private final boolean m134125Zp() {
        return (this.f124180u == null || this.f124181v == null || this.f124182w == null) ? false : true;
    }

    /* renamed from: aq */
    private final boolean m134126aq() {
        return AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a);
    }

    /* renamed from: cq */
    public final void m134127cq() {
        this.f124184y = m134128dq(this.f124183x, false);
        ((InterfaceC26038c) m103742Dp()).mo50277dA(this.f124184y, this.f124175B);
    }

    /* renamed from: dq */
    private final List m134128dq(List list, boolean z11) {
        boolean z12;
        boolean m114554u;
        int i11;
        Integer valueOf;
        String m125417l;
        int i12;
        int i13;
        boolean z13 = false;
        ArrayList arrayList = null;
        if (list != null) {
            int size = list.size();
            ArrayList arrayList2 = null;
            int i14 = 0;
            while (i14 < size) {
                C23965b c23965b = (C23965b) list.get(i14);
                if (c23965b.m125406a().length() != 0 && C23493c.f114055a.m123322k(c23965b.m125406a())) {
                    try {
                        String m125406a = c23965b.m125406a();
                        if (AbstractC19074t.m100204b(m125406a, "person.block")) {
                            C31853b5 m114312J = C21927m.m114302u().m114312J();
                            String str = this.f124180u;
                            if (str == null) {
                                AbstractC19074t.m100223u("reportUid");
                                str = null;
                            }
                            m114554u = !m114312J.m153137g(str);
                            if (m114554u) {
                                i13 = AbstractC23322a.zds_ic_ban_line_24;
                            } else {
                                i13 = AbstractC23322a.zds_ic_check_line_24;
                            }
                            valueOf = Integer.valueOf(i13);
                        } else if (AbstractC19074t.m100204b(m125406a, "person.unfriend")) {
                            String str2 = this.f124180u;
                            if (str2 == null) {
                                AbstractC19074t.m100223u("reportUid");
                                str2 = null;
                            }
                            m114554u = AbstractC21935u.m114554u(str2);
                            if (z11 && !m114554u) {
                                this.f124176C = z13;
                            }
                            if (this.f124176C) {
                                if (m114554u) {
                                    i11 = AbstractC23322a.zds_ic_delete_line_24;
                                } else {
                                    i11 = AbstractC23322a.zds_ic_check_line_24;
                                }
                                valueOf = Integer.valueOf(i11);
                            }
                        }
                        boolean z14 = m114554u;
                        Integer num = valueOf;
                        if (z14) {
                            if (m134126aq()) {
                                m125417l = c23965b.m125420o();
                            } else {
                                m125417l = c23965b.m125419n();
                            }
                        } else if (m134126aq()) {
                            m125417l = c23965b.m125418m();
                        } else {
                            m125417l = c23965b.m125417l();
                        }
                        String str3 = m125417l;
                        String m125413h = c23965b.m125413h();
                        if (AbstractC19074t.m100204b(m125413h, "normal")) {
                            if (z14) {
                                i12 = AbstractC2807a.text_01;
                            } else {
                                i12 = AbstractC2807a.text_02;
                            }
                        } else if (AbstractC19074t.m100204b(m125413h, "negative")) {
                            if (z14) {
                                i12 = AbstractC2807a.button_primary_danger_background;
                            } else {
                                i12 = AbstractC2807a.text_02;
                            }
                        } else {
                            i12 = AbstractC2807a.text_01;
                        }
                        if (str3.length() > 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(new C26037b(c23965b.m125406a(), num, Integer.valueOf(i12), z14, str3, false, c23965b, 32, null));
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
                i14++;
                z13 = false;
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                C26037b c26037b = (C26037b) arrayList.get(i15);
                if (i15 != arrayList.size() - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c26037b.m134114h(z12);
            }
        }
        return arrayList;
    }

    @Override // p497rz.InterfaceC26036a
    /* renamed from: Pg */
    public void mo134103Pg(C26037b c26037b, String str) {
        String m125411f;
        String m125407b;
        String m125409d;
        AbstractC19074t.m100208f(c26037b, "actionItem");
        AbstractC19074t.m100208f(str, "title");
        if (!c26037b.m134112f()) {
            return;
        }
        C23965b m134108b = c26037b.m134108b();
        if (m134126aq()) {
            m125411f = m134108b.m125412g();
        } else {
            m125411f = m134108b.m125411f();
        }
        String str2 = m125411f;
        if (m134126aq()) {
            m125407b = m134108b.m125408c();
        } else {
            m125407b = m134108b.m125407b();
        }
        String str3 = m125407b;
        if (m134126aq()) {
            m125409d = m134108b.m125410e();
        } else {
            m125409d = m134108b.m125409d();
        }
        String str4 = m125409d;
        ContactProfile contactProfile = this.f124185z;
        String m134107a = c26037b.m134107a();
        if (AbstractC19074t.m100204b(m134107a, "person.block")) {
            if (contactProfile != null) {
                ((InterfaceC26038c) m103742Dp()).mo50280zt(m134108b, str, str2, str3, str4, contactProfile);
            }
        } else if (AbstractC19074t.m100204b(m134107a, "person.unfriend") && contactProfile != null) {
            ((InterfaceC26038c) m103742Dp()).mo50276Lt(m134108b, str, str2, str3, str4, contactProfile);
        }
    }

    /* renamed from: Pp */
    public final void m134129Pp(ContactProfile contactProfile) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(contactProfile, "cp");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(contactProfile));
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1739t3(m131500h, 17);
    }

    /* renamed from: Qp */
    public final void m134130Qp(ContactProfile contactProfile) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(contactProfile, "cp");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(contactProfile));
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1481M3(m131500h.toString(), new TrackingSource(17));
    }

    /* renamed from: Rp */
    public final void m134131Rp(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profileBlock");
        if (this.f124177D) {
            return;
        }
        ((InterfaceC26038c) m103742Dp()).mo46829Y();
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(str, contactProfile));
        this.f124177D = true;
        c0766k.mo1479L9(str, 17);
    }

    /* renamed from: Sp */
    public final void m134132Sp(ContactProfile contactProfile) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(contactProfile, "cp");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(contactProfile));
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1400C3(m131500h.toString(), new TrackingSource(17));
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: bq */
    public void mo995Nd(C9337a c9337a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c9337a, interfaceC19968g);
        if (c9337a == null) {
            ((InterfaceC26038c) m103742Dp()).mo50275I();
            return;
        }
        String m50282b = c9337a.m50282b();
        if (m50282b.length() == 0) {
            ((InterfaceC26038c) m103742Dp()).mo50275I();
            return;
        }
        String m50281a = c9337a.m50281a();
        if (m50281a.length() == 0) {
            ((InterfaceC26038c) m103742Dp()).mo50275I();
            return;
        }
        C23966c m128035k = this.f124179t.m128035k(m50281a);
        if (m128035k == null) {
            ((InterfaceC26038c) m103742Dp()).mo50275I();
            return;
        }
        this.f124180u = m50282b;
        this.f124181v = m50281a;
        this.f124182w = m128035k;
    }

    @Override // p497rz.InterfaceC26036a
    /* renamed from: c6 */
    public void mo134104c6(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "profileReport");
        if (this.f124178E) {
            return;
        }
        ((InterfaceC26038c) m103742Dp()).mo46829Y();
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(str, z11, contactProfile, this));
        this.f124178E = true;
        c0766k.mo1791z6(str, 36);
    }

    @Override // p497rz.InterfaceC26036a
    /* renamed from: d */
    public void mo134105d() {
        if (!m134125Zp()) {
            return;
        }
        InterfaceC26038c interfaceC26038c = (InterfaceC26038c) m103742Dp();
        C23493c c23493c = C23493c.f114055a;
        String str = this.f124181v;
        if (str == null) {
            AbstractC19074t.m100223u("reportObjectName");
            str = null;
        }
        interfaceC26038c.mo50278hB(c23493c.m123320h(str));
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rz.d
            public /* synthetic */ RunnableC26039d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26041f.m134123Xp(C26041f.this);
            }
        });
    }

    /* renamed from: eq */
    public final void m134134eq(boolean z11) {
        this.f124177D = z11;
    }

    /* renamed from: fq */
    public final void m134135fq(boolean z11) {
        this.f124178E = z11;
    }

    @Override // p497rz.InterfaceC26036a
    /* renamed from: rm */
    public void mo134106rm(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profileBlock");
        m134131Rp(contactProfile);
        m134129Pp(contactProfile);
        m134130Qp(contactProfile);
        m134132Sp(contactProfile);
    }
}
