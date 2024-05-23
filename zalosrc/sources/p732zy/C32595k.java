package p732zy;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import me0.AbstractC23041d2;
import me0.AbstractC23078g6;
import me0.AbstractC23136l9;
import nh0.C23793c;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import on0.C24321d;
import on0.C24329j;
import org.json.JSONObject;
import p716zh.C31944h6;
import p732zy.C32596l;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25750p;

/* renamed from: zy.k */
/* loaded from: classes4.dex */
public final class C32595k extends AbstractC1796t0 {
    public static final b Companion = new b(null);

    /* renamed from: T */
    private static final InterfaceC24854k f150602T;

    /* renamed from: A */
    private final C1761c0 f150603A;

    /* renamed from: B */
    private final C1761c0 f150604B;

    /* renamed from: C */
    private final C1761c0 f150605C;

    /* renamed from: D */
    private final C1761c0 f150606D;

    /* renamed from: E */
    private final C1761c0 f150607E;

    /* renamed from: F */
    private final C1761c0 f150608F;

    /* renamed from: G */
    private final C1761c0 f150609G;

    /* renamed from: H */
    private final C1761c0 f150610H;

    /* renamed from: I */
    private final C1761c0 f150611I;

    /* renamed from: J */
    private final C1761c0 f150612J;

    /* renamed from: K */
    private final C1761c0 f150613K;

    /* renamed from: L */
    private final C1761c0 f150614L;

    /* renamed from: M */
    private final C1761c0 f150615M;

    /* renamed from: N */
    private boolean f150616N;

    /* renamed from: O */
    private boolean f150617O;

    /* renamed from: P */
    private boolean f150618P;

    /* renamed from: Q */
    private boolean f150619Q;

    /* renamed from: R */
    private int f150620R;

    /* renamed from: S */
    private C24230h f150621S;

    /* renamed from: s */
    private final int f150622s;

    /* renamed from: t */
    private final InterfaceC24854k f150623t;

    /* renamed from: u */
    private final InterfaceC24854k f150624u;

    /* renamed from: v */
    private C32596l f150625v;

    /* renamed from: w */
    private C32596l f150626w;

    /* renamed from: x */
    private String f150627x;

    /* renamed from: y */
    private String f150628y;

    /* renamed from: z */
    private final InterfaceC24854k f150629z;

    /* renamed from: zy.k$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f150630q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24329j mo12V4() {
            return new C24329j("^[a-zA-Z0-9]+$");
        }
    }

    /* renamed from: zy.k$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C24329j m157822b() {
            return (C24329j) C32595k.f150602T.getValue();
        }
    }

    /* renamed from: zy.k$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f150631q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m4220t4());
        }
    }

    /* renamed from: zy.k$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return (C32595k.this.m157788q0() / 1000) + "." + ((C32595k.this.m157788q0() % 1000) / 100);
        }
    }

    /* renamed from: zy.k$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C32595k.this.f150607E.mo9221n(m104492d);
            }
            C32595k.this.f150616N = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_successfully), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            C32595k.this.f150606D.mo9221n(Boolean.TRUE);
            C32595k.this.f150616N = false;
        }
    }

    /* renamed from: zy.k$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC24232j {
        f() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            AbstractC19074t.m100208f(bVar, "uploadSuccess");
            C32595k.this.f150619Q = false;
            if (C32595k.this.f150625v != null) {
                C32596l c32596l = C32595k.this.f150625v;
                if (c32596l != null) {
                    C32595k c32595k = C32595k.this;
                    c32595k.m157777Y0(c32596l.m157830e(), c32595k.f150626w, bVar.m132889b());
                    return;
                }
                return;
            }
            C32595k c32595k2 = C32595k.this;
            c32595k2.m157785k0(c32595k2.f150626w.m157831f(), C32595k.this.m157790t0(), bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            AbstractC19074t.m100208f(aVar, "uploadFailure");
            C32595k.this.f150619Q = false;
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            C32595k.this.f150607E.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_fail));
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* renamed from: zy.k$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {
        g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C32595k.this.f150618P = false;
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            if (c20096c != null) {
                C32595k.this.f150607E.mo9221n(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            C32595k.this.f150606D.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: zy.k$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f150636q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return CoreUtility.f89233i + "_" + C23793c.Companion.m124321a().mo124310e();
        }
    }

    /* renamed from: zy.k$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C32595k.this.f150607E.mo9221n(m104492d);
            }
            C32595k.this.f150617O = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32595k.this.f150613K.mo9221n(Boolean.FALSE);
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_successfully), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            C32595k.this.f150606D.mo9221n(Boolean.TRUE);
            C32595k.this.f150617O = false;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f150630q);
        f150602T = m129210a;
    }

    public C32595k() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        int m4249u4 = AbstractC0924m0.m4249u4();
        this.f150622s = m4249u4;
        m129210a = AbstractC24856m.m129210a(c.f150631q);
        this.f150623t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new d());
        this.f150624u = m129210a2;
        this.f150626w = new C32596l(-1L, 0, "", null, null, 0L, 0L, 120, null);
        this.f150627x = "";
        this.f150628y = "";
        m129210a3 = AbstractC24856m.m129210a(h.f150636q);
        this.f150629z = m129210a3;
        this.f150603A = new C1761c0();
        this.f150604B = new C1761c0();
        this.f150605C = new C1761c0();
        Boolean bool = Boolean.FALSE;
        this.f150606D = new C1761c0(bool);
        this.f150607E = new C1761c0();
        this.f150608F = new C1761c0();
        this.f150609G = new C1761c0();
        this.f150610H = new C1761c0();
        this.f150611I = new C1761c0();
        this.f150612J = new C1761c0();
        this.f150613K = new C1761c0(bool);
        this.f150614L = new C1761c0(bool);
        this.f150615M = new C1761c0(Integer.valueOf(m4249u4));
    }

    /* renamed from: A0 */
    private final void m157756A0(long j11) {
        C32596l c32596l = this.f150625v;
        if (c32596l != null && c32596l != null && c32596l.m157830e() == j11 && !this.f150618P && AbstractC19074t.m100204b(this.f150606D.mo9215f(), Boolean.FALSE)) {
            this.f150607E.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_fail));
            this.f150606D.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: B0 */
    private final void m157757B0(long j11) {
        C32596l c32596l = this.f150625v;
        if (c32596l != null && c32596l != null && c32596l.m157830e() == j11 && AbstractC19074t.m100204b(this.f150606D.mo9215f(), Boolean.FALSE)) {
            this.f150607E.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_notify_update));
            C32596l m157925n = C32600p.f150676a.m157898e().m157925n(j11);
            if (m157925n != null) {
                C32596l m157826a = m157925n.m157826a();
                m157787n0(m157826a);
                this.f150625v = m157826a;
            }
        }
    }

    /* renamed from: D0 */
    private final boolean m157758D0(String str) {
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        if (bytes.length > m157788q0()) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    private final boolean m157759E0(String str) {
        return Companion.m157822b().m127018f(str);
    }

    /* renamed from: O0 */
    private final void m157763O0(long j11) {
        this.f150613K.mo9221n(Boolean.TRUE);
        this.f150618P = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", "qm_edit");
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1536Sa(j11, jSONObject2);
    }

    /* renamed from: P0 */
    private final void m157765P0(long j11) {
        C32596l m157925n = C32600p.f150676a.m157898e().m157925n(j11);
        if (m157925n != null) {
            C32596l m157826a = m157925n.m157826a();
            this.f150625v = m157826a;
            if (m157826a != null) {
                this.f150610H.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_editing_title));
                m157787n0(m157925n);
                m157784i0();
                this.f150608F.mo9221n(Boolean.TRUE);
            }
        }
    }

    /* renamed from: R0 */
    private final void m157768R0(String str) {
        if (this.f150626w.m157834i() == null) {
            this.f150626w.m157837l(new C32596l.d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        }
        C32596l.d m157834i = this.f150626w.m157834i();
        if (m157834i != null) {
            m157834i.m157858c(str);
        }
    }

    /* renamed from: S0 */
    private final void m157770S0(String str) {
        if (str.length() <= 0 || (!C31944h6.m153519D(str) && !AbstractC23041d2.m118194A(str))) {
            str = "";
        }
        this.f150627x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m157777Y0(long j11, C32596l c32596l, AbstractC25751q abstractC25751q) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this.f150617O) {
            return;
        }
        this.f150613K.mo9221n(Boolean.TRUE);
        int i11 = 1;
        this.f150617O = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i());
        C32596l.b m157833h = c32596l.m157833h();
        int m157835j = c32596l.m157835j();
        if (m157793y0()) {
            if (abstractC25751q != null && (abstractC25751q instanceof C25750p)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C32596l.c((C25750p) abstractC25751q));
                C24848g0 c24848g0 = C24848g0.f119245a;
                m157833h = new C32596l.b("", 1, arrayList);
            } else {
                i11 = 0;
                m157833h = null;
            }
        } else {
            i11 = m157835j;
        }
        String m157831f = c32596l.m157831f();
        C32596l.d m157834i = c32596l.m157834i();
        if (m157834i != null) {
            jSONObject = m157834i.m157859d();
        } else {
            jSONObject = null;
        }
        if (m157833h != null) {
            jSONObject2 = m157833h.m157841d();
        } else {
            jSONObject2 = null;
        }
        c0766k.mo1612c7(j11, m157831f, i11, jSONObject, jSONObject2, "");
    }

    /* renamed from: f0 */
    private final void m157781f0(final String str) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.i
            @Override // java.lang.Runnable
            public final void run() {
                C32595k.m157782g0(C32595k.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m157782g0(final C32595k c32595k, String str) {
        AbstractC19074t.m100208f(c32595k, "this$0");
        AbstractC19074t.m100208f(str, "$path");
        try {
            c32595k.m157770S0(AbstractC23078g6.Companion.m118386a(str));
            AbstractC19444a.m101697e(new Runnable() { // from class: zy.j
                @Override // java.lang.Runnable
                public final void run() {
                    C32595k.m157783h0(C32595k.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m157783h0(C32595k c32595k) {
        AbstractC19074t.m100208f(c32595k, "this$0");
        c32595k.f150612J.mo9221n(c32595k.f150627x);
        c32595k.m157784i0();
    }

    /* renamed from: i0 */
    private final void m157784i0() {
        boolean z11;
        if (!m157759E0(this.f150626w.m157831f())) {
            C1761c0 c1761c0 = this.f150614L;
            if (this.f150626w.m157831f().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c1761c0.mo9221n(Boolean.valueOf(z11));
            this.f150603A.mo9221n(Boolean.FALSE);
            return;
        }
        C1761c0 c1761c02 = this.f150614L;
        Boolean bool = Boolean.FALSE;
        c1761c02.mo9221n(bool);
        if (m157790t0().length() == 0 && this.f150627x.length() == 0) {
            this.f150603A.mo9221n(bool);
        } else {
            this.f150603A.mo9221n(Boolean.valueOf(m157791w0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m157785k0(String str, String str2, AbstractC25751q abstractC25751q) {
        JSONObject jSONObject;
        int i11;
        boolean z11;
        if (this.f150616N) {
            return;
        }
        this.f150613K.mo9221n(Boolean.TRUE);
        boolean z12 = true;
        this.f150616N = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e());
        JSONObject jSONObject2 = null;
        byte b11 = 0;
        if (abstractC25751q != null && (abstractC25751q instanceof C25750p)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C32596l.c((C25750p) abstractC25751q));
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject = new C32596l.b("", 1, arrayList).m157841d();
            i11 = 1;
        } else {
            jSONObject = null;
            i11 = 0;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("src", this.f150628y);
        if (str2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        jSONObject3.put("text", z11);
        jSONObject3.put("link", C31944h6.m153544j(str2));
        if (i11 != 1) {
            z12 = false;
        }
        jSONObject3.put("attachment", z12);
        jSONObject3.put("sessionId", m157818u0());
        String jSONObject4 = jSONObject3.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        c0766k.mo1774x5(str, i11, new C32596l.d(str2, jSONObject2, 2, b11 == true ? 1 : 0).m157859d(), jSONObject, jSONObject4);
    }

    /* renamed from: l0 */
    private final void m157786l0() {
        if (this.f150619Q) {
            return;
        }
        this.f150613K.mo9221n(Boolean.TRUE);
        this.f150619Q = true;
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        this.f150620R = nextInt;
        C24226d.b bVar = C24226d.Companion;
        C24230h m126433h = C24226d.b.m126433h(bVar, nextInt, EnumC24229g.f116973L, this.f150627x, null, null, null, 5000L, false, 56, null);
        this.f150621S = m126433h;
        if (m126433h != null) {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            m126433h.m126482B0(str);
        }
        C24230h c24230h = this.f150621S;
        if (c24230h != null) {
            c24230h.m126505h(new f());
        }
        C24230h c24230h2 = this.f150621S;
        if (c24230h2 != null) {
            bVar.m126442j(c24230h2);
        }
    }

    /* renamed from: n0 */
    private final void m157787n0(C32596l c32596l) {
        String str;
        C32596l.c.C33080c m157839b;
        this.f150626w = c32596l.m157826a();
        C1761c0 c1761c0 = this.f150615M;
        int length = m157790t0().length();
        int i11 = this.f150622s;
        if (length > i11) {
            i11 = Integer.MAX_VALUE;
        }
        c1761c0.mo9221n(Integer.valueOf(i11));
        C32596l.b m157833h = this.f150626w.m157833h();
        if (m157833h == null || (m157839b = m157833h.m157839b()) == null || (str = m157839b.m157851f()) == null) {
            str = "";
        }
        m157770S0(str);
        this.f150604B.mo9221n(this.f150626w.m157831f());
        this.f150605C.mo9221n(m157790t0());
        this.f150612J.mo9221n(this.f150627x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final int m157788q0() {
        return ((Number) this.f150623t.getValue()).intValue();
    }

    /* renamed from: r0 */
    private final String m157789r0() {
        return (String) this.f150624u.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public final String m157790t0() {
        String m157857b;
        C32596l.d m157834i = this.f150626w.m157834i();
        if (m157834i == null || (m157857b = m157834i.m157857b()) == null) {
            return "";
        }
        return m157857b;
    }

    /* renamed from: w0 */
    private final boolean m157791w0() {
        if (!m157792x0() && !m157794z0() && !m157793y0()) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    private final boolean m157792x0() {
        String str;
        C32596l c32596l = this.f150625v;
        if (c32596l == null || (str = c32596l.m157831f()) == null) {
            str = "";
        }
        return !AbstractC19074t.m100204b(str, this.f150626w.m157831f());
    }

    /* renamed from: y0 */
    private final boolean m157793y0() {
        String str;
        C32596l.c.C33080c m157839b;
        C32596l.b m157833h = this.f150626w.m157833h();
        if (m157833h == null || (m157839b = m157833h.m157839b()) == null || (str = m157839b.m157851f()) == null) {
            str = "";
        }
        return !AbstractC19074t.m100204b(str, this.f150627x);
    }

    /* renamed from: z0 */
    private final boolean m157794z0() {
        String str;
        C32596l.d m157834i;
        C32596l c32596l = this.f150625v;
        if (c32596l == null || (m157834i = c32596l.m157834i()) == null || (str = m157834i.m157857b()) == null) {
            str = "";
        }
        return !AbstractC19074t.m100204b(str, m157790t0());
    }

    /* renamed from: C0 */
    public final void m157795C0(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("EXTRA_QUICK_MESSAGE_ID")) {
                m157765P0(bundle.getLong("EXTRA_QUICK_MESSAGE_ID"));
            }
            if (bundle.containsKey("EXTRA_QUICK_MESSAGE_KEYWORD")) {
                this.f150604B.mo9221n(bundle.getString("EXTRA_QUICK_MESSAGE_KEYWORD", ""));
            }
            if (bundle.containsKey("EXTRA_QUICK_MESSAGE_TEXT")) {
                this.f150605C.mo9221n(bundle.getString("EXTRA_QUICK_MESSAGE_TEXT", ""));
            }
            if (bundle.containsKey("EXTRA_QUICK_MESSAGE_PHOTO_LOCAL_PATH")) {
                String string = bundle.getString("EXTRA_QUICK_MESSAGE_PHOTO_LOCAL_PATH", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                m157781f0(string);
            }
        }
        m157784i0();
    }

    /* renamed from: F0 */
    public final void m157796F0() {
        C32596l c32596l = this.f150625v;
        if (c32596l != null) {
            m157763O0(c32596l.m157830e());
        }
    }

    /* renamed from: G0 */
    public final void m157797G0() {
        if (this.f150625v != null) {
            this.f150609G.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: I0 */
    public final void m157798I0() {
        if (m157792x0() && C32600p.f150676a.m157898e().m157931u(this.f150626w.m157831f())) {
            this.f150607E.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_keyword_is_exist));
            return;
        }
        if (m157758D0(m157790t0())) {
            C1761c0 c1761c0 = this.f150607E;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_reach_message_limit_byte);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m157789r0()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            c1761c0.mo9221n(format);
            return;
        }
        C32596l c32596l = this.f150625v;
        if (c32596l != null) {
            if (c32596l != null) {
                if (m157793y0() && this.f150627x.length() > 0 && AbstractC23041d2.m118194A(this.f150627x)) {
                    m157786l0();
                    return;
                } else {
                    m157777Y0(c32596l.m157830e(), this.f150626w, null);
                    return;
                }
            }
            return;
        }
        if (C32600p.f150676a.m157895b(true)) {
            return;
        }
        if (this.f150627x.length() == 0 || !AbstractC23041d2.m118194A(this.f150627x)) {
            m157785k0(this.f150626w.m157831f(), m157790t0(), null);
        } else {
            m157786l0();
        }
    }

    /* renamed from: J0 */
    public final void m157799J0(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        this.f150626w.m157836k(str);
        m157784i0();
    }

    /* renamed from: K0 */
    public final void m157800K0(String str) {
        AbstractC19074t.m100208f(str, "message");
        m157768R0(str);
        m157784i0();
    }

    /* renamed from: L0 */
    public final void m157801L0() {
        m157770S0("");
        this.f150612J.mo9221n(this.f150627x);
        m157784i0();
    }

    /* renamed from: M0 */
    public final void m157802M0() {
        this.f150611I.mo9221n(Boolean.TRUE);
    }

    /* renamed from: N0 */
    public final LiveData m157803N0() {
        return this.f150611I;
    }

    /* renamed from: Q0 */
    public final LiveData m157804Q0() {
        return this.f150615M;
    }

    /* renamed from: T0 */
    public final void m157805T0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f150628y = str;
    }

    /* renamed from: U0 */
    public final LiveData m157806U0() {
        return this.f150608F;
    }

    /* renamed from: V0 */
    public final LiveData m157807V0() {
        return this.f150609G;
    }

    /* renamed from: W0 */
    public final LiveData m157808W0() {
        return this.f150613K;
    }

    /* renamed from: X0 */
    public final LiveData m157809X0() {
        return this.f150607E;
    }

    /* renamed from: Z0 */
    public final LiveData m157810Z0() {
        return this.f150614L;
    }

    /* renamed from: c0 */
    public final LiveData m157811c0() {
        return this.f150612J;
    }

    /* renamed from: e0 */
    public final LiveData m157812e0() {
        return this.f150610H;
    }

    /* renamed from: j0 */
    public final LiveData m157813j0() {
        return this.f150606D;
    }

    /* renamed from: m0 */
    public final LiveData m157814m0() {
        return this.f150603A;
    }

    /* renamed from: o0 */
    public final LiveData m157815o0() {
        return this.f150604B;
    }

    public final void onActivityResult(int i11, int i12, Intent intent) {
        if (i12 == -1 && i11 == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("EXTRA_PHOTO_PATH");
            if (stringExtra == null) {
                stringExtra = "";
            }
            AbstractC19074t.m100205c(stringExtra);
            m157781f0(stringExtra);
        }
    }

    /* renamed from: p0 */
    public final LiveData m157816p0() {
        return this.f150605C;
    }

    /* renamed from: s0 */
    public final int m157817s0() {
        return this.f150622s;
    }

    /* renamed from: u0 */
    public final String m157818u0() {
        return (String) this.f150629z.getValue();
    }

    /* renamed from: v0 */
    public final void m157819v0(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 162) {
            if (i11 == 163) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                m157756A0(((Long) obj).longValue());
                return;
            }
            return;
        }
        Object obj2 = objArr[0];
        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Long");
        m157757B0(((Long) obj2).longValue());
    }
}
