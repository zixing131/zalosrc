package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.AbstractC0924m0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p077ui.zviews.AbstractC15426a6;
import com.zing.zalo.zinstant.C17244x0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import lk0.InterfaceC22508f;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import p405ov.C24561c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public final class k31 extends AbstractC1796t0 {
    public static final C15796a Companion = new C15796a(null);

    /* renamed from: s */
    private final C1761c0 f80849s;

    /* renamed from: t */
    private final LiveData f80850t;

    /* renamed from: u */
    private AtomicBoolean f80851u;

    /* renamed from: v */
    private final C1761c0 f80852v;

    /* renamed from: w */
    private final LiveData f80853w;

    /* renamed from: x */
    private final InterfaceC24854k f80854x;

    /* renamed from: com.zing.zalo.ui.zviews.k31$a */
    /* loaded from: classes6.dex */
    public static final class C15796a {
        private C15796a() {
        }

        public /* synthetic */ C15796a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.k31$b */
    /* loaded from: classes6.dex */
    static final class C15797b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C15797b f80855q = new C15797b();

        C15797b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11 = false;
            if (C19172a.m100600k("features@mediaBoxConfig@enable_zinstant_suggested_oa", 0) == 1) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.k31$c */
    /* loaded from: classes6.dex */
    public static final class C15798c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80856t;

        C15798c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15798c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f80856t == 0) {
                AbstractC24862s.m129228b(obj);
                if (k31.this.m87311X()) {
                    if (k31.this.m87310V()) {
                        k31.this.m87316f0();
                    } else {
                        k31.this.f80849s.mo9221n(k31.this.m87312Y());
                    }
                } else {
                    k31.this.f80849s.mo9221n(AbstractC15426a6.b.f79784a);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15798c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.k31$d */
    /* loaded from: classes6.dex */
    public static final class C15799d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80858t;

        C15799d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15799d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f80858t == 0) {
                AbstractC24862s.m129228b(obj);
                if (k31.this.m87311X() && k31.this.m87310V()) {
                    k31.this.m87316f0();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15799d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.k31$e */
    /* loaded from: classes6.dex */
    public static final class C15800e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80860t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f80861u;

        /* renamed from: v */
        final /* synthetic */ k31 f80862v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15800e(JSONObject jSONObject, k31 k31Var, Continuation continuation) {
            super(2, continuation);
            this.f80861u = jSONObject;
            this.f80862v = k31Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15800e(this.f80861u, this.f80862v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f80860t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m2911Aj(AbstractC23306f.m120579F1().mo124314i());
                AbstractC0924m0.m2938Bh(this.f80861u.optLong("expired_time_ms", 3600000L));
                JSONObject optJSONObject = this.f80861u.optJSONObject("zalo_video");
                if (optJSONObject != null) {
                    k31 k31Var = this.f80862v;
                    if (optJSONObject.optInt("enable") == 1) {
                        int optInt = optJSONObject.optInt("position");
                        int optInt2 = optJSONObject.optInt("max_oa_item");
                        String optString = optJSONObject.optString("ZInstantAPIInfo");
                        AbstractC0924m0.m2970Ck(optInt);
                        AbstractC0924m0.m2941Bk(optInt2);
                        AbstractC0924m0.m2999Dk(optString);
                    } else {
                        AbstractC0924m0.m2999Dk("");
                    }
                    k31Var.f80849s.mo9221n(k31Var.m87312Y());
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15800e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.k31$f */
    /* loaded from: classes6.dex */
    public static final class C15801f implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.k31$f$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f80864t;

            /* renamed from: u */
            final /* synthetic */ k31 f80865u;

            /* renamed from: v */
            final /* synthetic */ C20096c f80866v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k31 k31Var, C20096c c20096c, Continuation continuation) {
                super(2, continuation);
                this.f80865u = k31Var;
                this.f80866v = c20096c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f80865u, this.f80866v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f80864t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f80865u.f80849s.mo9221n(this.f80865u.m87312Y());
                    AbstractC0924m0.m2911Aj(AbstractC23306f.m120579F1().mo124314i());
                    C24559a.m127933c("VipMessagesViewModel", "Pull channel data failed | " + this.f80866v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C15801f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(k31.this), Dispatchers.m112679a(), null, new a(k31.this, c20096c, null), 2, null);
            k31.this.f80851u.set(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String optString;
            String str = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (optString = jSONObject.optString("data")) != null) {
                if (optString.length() > 0) {
                    str = optString;
                }
                if (str != null) {
                    try {
                        k31.this.m87315e0(new JSONObject(str));
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("VipMessagesViewModel", e11);
                    }
                }
            }
            k31.this.f80851u.set(false);
        }
    }

    public k31() {
        InterfaceC24854k m129210a;
        C1761c0 c1761c0 = new C1761c0();
        c1761c0.mo9224q(AbstractC15426a6.b.f79784a);
        this.f80849s = c1761c0;
        this.f80850t = c1761c0;
        this.f80851u = new AtomicBoolean(false);
        C1761c0 c1761c02 = new C1761c0();
        this.f80852v = c1761c02;
        this.f80853w = c1761c02;
        m129210a = AbstractC24856m.m129210a(C15797b.f80855q);
        this.f80854x = m129210a;
        m87313Z();
        if (m87319W()) {
            m87314a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final boolean m87310V() {
        if (AbstractC23306f.m120579F1().mo124314i() > AbstractC0924m0.m2952C2() + AbstractC0924m0.m3677b1()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final boolean m87311X() {
        if (C19172a.m100601l("features@mediaBoxConfig@enable_pull_section_data", 0, 2, null) != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public final AbstractC15426a6 m87312Y() {
        String m2953C3 = AbstractC0924m0.m2953C3();
        AbstractC19074t.m100205c(m2953C3);
        if (m2953C3.length() > 0) {
            try {
                return new AbstractC15426a6.a(AbstractC0924m0.m2924B3(), AbstractC0924m0.m2895A3(), new JSONObject(m2953C3));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return AbstractC15426a6.b.f79784a;
    }

    /* renamed from: Z */
    private final Job m87313Z() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112679a(), null, new C15798c(null), 2, null);
        return m112540d;
    }

    /* renamed from: a0 */
    private final void m87314a0() {
        try {
            C24848g0 c24848g0 = null;
            InterfaceC22508f m92064b = new C17244x0(57, new JSONObject(C19172a.m100608s("features@mediaBoxConfig@zinstant_suggested_oa_template", null, 2, null))).m92064b();
            if (m92064b != null) {
                C24561c.m127942b("QRWallet", "Success build zinstant data suggested oa");
                this.f80852v.mo9221n(m92064b);
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                C24561c.m127942b("VipMessagesViewModel", "Error build zinstant data suggested oa");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VipMessagesViewModel", e11);
            C24561c.m127942b("VipMessagesViewModel", "Error build zinstant data suggested oa, " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final Job m87315e0(JSONObject jSONObject) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112679a(), null, new C15800e(jSONObject, this, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m87316f0() {
        if (!this.f80851u.compareAndSet(false, true)) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15801f());
        c0766k.m1856l0();
    }

    /* renamed from: T */
    public final LiveData m87317T() {
        return this.f80850t;
    }

    /* renamed from: U */
    public final LiveData m87318U() {
        return this.f80853w;
    }

    /* renamed from: W */
    public final boolean m87319W() {
        return ((Boolean) this.f80854x.getValue()).booleanValue();
    }

    /* renamed from: b0 */
    public final void m87320b0() {
        m87313Z();
    }

    /* renamed from: c0 */
    public final Job m87321c0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112679a(), null, new C15799d(null), 2, null);
        return m112540d;
    }
}
