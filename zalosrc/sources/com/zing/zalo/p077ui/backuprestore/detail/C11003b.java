package com.zing.zalo.p077ui.backuprestore.detail;

import ag0.AbstractC0837p0;
import ag0.C0809c1;
import ag0.C0815e1;
import ah0.C0860a;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import b50.C2553a;
import b50.C2556d;
import c50.C3297h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.detail.C11003b;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ke0.C21699a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import m40.InterfaceC22830a;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import org.json.JSONObject;
import p128ed.C18389d;
import p205hc.AbstractC19962a;
import p236ic.AbstractC20504a;
import p297kd.C21690e;
import p320ld.C22432d;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p387oc.C24199c;
import p420pb.C24709a;
import p421pc.C24720a;
import p443qc.AbstractC25219c;
import p479rc.C25724a;
import p484ri.C25804a;
import p484ri.C25806c;
import p487rl.C25826g;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import p579vl.C28290a;
import p716zh.C31986k3;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25361o0;
import s00.AbstractC26084s;
import sc.C26220b;
import si.C26263i;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.backuprestore.detail.b */
/* loaded from: classes5.dex */
public final class C11003b extends AbstractC19962a implements InterfaceC11002a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private String[] f55560A;

    /* renamed from: B */
    private int f55561B;

    /* renamed from: C */
    private int f55562C;

    /* renamed from: D */
    private int f55563D;

    /* renamed from: E */
    private final InterfaceC24854k f55564E;

    /* renamed from: F */
    private boolean f55565F;

    /* renamed from: G */
    private boolean f55566G;

    /* renamed from: H */
    private boolean f55567H;

    /* renamed from: I */
    private boolean f55568I;

    /* renamed from: t */
    private final C25806c f55569t;

    /* renamed from: u */
    private final C25804a f55570u;

    /* renamed from: v */
    private final C24720a f55571v;

    /* renamed from: w */
    private final C24199c f55572w;

    /* renamed from: x */
    private final C25724a f55573x;

    /* renamed from: y */
    private final InterfaceC24854k f55574y;

    /* renamed from: z */
    private final C26701b f55575z;

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f55576p = new b("INIT_LOAD", 0);

        /* renamed from: q */
        public static final b f55577q = new b("CHANGE_ACCOUNT", 1);

        /* renamed from: r */
        public static final b f55578r = new b("BACKUP_DONE", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f55579s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f55580t;

        static {
            b[] m57447b = m57447b();
            f55579s = m57447b;
            f55580t = AbstractC30166b.m148796a(m57447b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m57447b() {
            return new b[]{f55576p, f55577q, f55578r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f55579s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f55581a;

        /* renamed from: b */
        final /* synthetic */ C11003b f55582b;

        c(boolean z11, C11003b c11003b) {
            this.f55581a = z11;
            this.f55582b = c11003b;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Integer num;
            C23651h m123961i;
            C23669z c23669z;
            try {
                if (this.f55581a) {
                    if (this.f55582b.m57419eq().containsKey("1") && (c23669z = (C23669z) this.f55582b.m57419eq().get("1")) != null) {
                        c23669z.f114660g = false;
                        return;
                    }
                    return;
                }
                if (this.f55582b.m57419eq().containsKey("1")) {
                    C23669z c23669z2 = (C23669z) this.f55582b.m57419eq().get("1");
                    if (c23669z2 instanceof C23651h) {
                        if (((C23651h) c23669z2).f114659f == null || !((C23651h) c23669z2).m123964l() || ((C23651h) c23669z2).f114660g) {
                            return;
                        }
                        ((C23651h) c23669z2).f114660g = true;
                        String str = ((C23651h) c23669z2).f114659f[0];
                        if (str == null || str.length() == 0) {
                            str = "1";
                        }
                        ((C23651h) c23669z2).f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                    }
                } else {
                    C2556d m12981o = C2556d.m12981o();
                    C11007f c11007f = (C11007f) this.f55582b.m103744Fp();
                    if (c11007f != null) {
                        num = Integer.valueOf(c11007f.m57465e());
                    } else {
                        num = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(num);
                    String[] m13000q = m12981o.m13000q("1", "3", sb2.toString());
                    if (m13000q == null || (m123961i = C23651h.m123961i(30, (String[]) Arrays.copyOf(m13000q, m13000q.length))) == null) {
                        return;
                    }
                    m123961i.f114656c = System.currentTimeMillis();
                    m123961i.f114654a = 3;
                    m123961i.f114655b = 1;
                    m123961i.f114657d = 30;
                    m123961i.f114660g = true;
                    this.f55582b.m57419eq().put("1", m123961i);
                }
                C23669z c23669z3 = (C23669z) this.f55582b.m57419eq().get("1");
                if (c23669z3 != null) {
                    C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(c23669z3);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55583t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55585t;

            /* renamed from: u */
            final /* synthetic */ C11003b f55586u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11003b c11003b, Continuation continuation) {
                super(2, continuation);
                this.f55586u = c11003b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55586u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55585t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ((InterfaceC22830a) this.f55586u.m103742Dp()).mo57316eB(this.f55586u.f55570u.m133001t());
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

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55583t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25804a c25804a = C11003b.this.f55570u;
                this.f55583t = 1;
                obj = c25804a.m132999r(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C11003b.this.f55570u.m132990I(((Number) obj).longValue(), C11003b.this.f55571v.m128422r(), C11003b.this.f55571v.m128423s());
            MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
            a aVar = new a(C11003b.this, null);
            this.f55583t = 2;
            if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55587t;

        /* renamed from: u */
        final /* synthetic */ C21699a f55588u;

        /* renamed from: v */
        final /* synthetic */ C11003b f55589v;

        /* renamed from: w */
        final /* synthetic */ C11003b f55590w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C21699a c21699a, C11003b c11003b, Continuation continuation, C11003b c11003b2) {
            super(2, continuation);
            this.f55588u = c21699a;
            this.f55589v = c11003b;
            this.f55590w = c11003b2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f55588u, this.f55589v, continuation, this.f55590w);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map m131401f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55587t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21699a c21699a = this.f55588u;
                m131401f = AbstractC25361o0.m131401f(new C24860q(EnumC24251b.f117148s, new C25826g(true)));
                this.f55587t = 1;
                obj = c21699a.m101498a(m131401f, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (AbstractC19074t.m100204b((Boolean) obj, AbstractC29094b.m145339a(true))) {
                this.f55589v.f55568I = false;
                C23744a.Companion.m124119a().m124116d(150809, new Object[0]);
                if (!this.f55590w.f55568I) {
                    this.f55590w.f55567H = true;
                    this.f55590w.f55568I = false;
                }
                this.f55590w.f55571v.m128407Y(12);
                this.f55590w.mo57380p0();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f55592r;

        /* renamed from: s */
        final /* synthetic */ int f55593s;

        /* renamed from: t */
        final /* synthetic */ C7924a f55594t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, int i11, C7924a c7924a) {
            super(1);
            this.f55592r = z11;
            this.f55593s = i11;
            this.f55594t = c7924a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m57453d(C11003b c11003b, C7924a c7924a, boolean z11, int i11) {
            AbstractC19074t.m100208f(c11003b, "this$0");
            AbstractC19074t.m100208f(c7924a, "$backupInfoServer");
            if (((InterfaceC22830a) c11003b.m103742Dp()).mo45894h0()) {
                c11003b.m57414Zp(c7924a);
                c11003b.m57437xq(0);
                if (z11) {
                    C26220b.m134827j("updateBackupInfo - dataProcessed success", null, 2, null);
                    if (!C22438j.m115948p(i11)) {
                        c11003b.m57395Eq(c7924a, i11, true);
                    } else {
                        c11003b.m57443Gq(c7924a, i11);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m57454e(C11003b c11003b, C7924a c7924a) {
            AbstractC19074t.m100208f(c11003b, "this$0");
            if (!((InterfaceC22830a) c11003b.m103742Dp()).mo45894h0()) {
                return;
            }
            AbstractC20110a.f98889a.mo104548a("get info success invalid", new Object[0]);
            c11003b.m57414Zp(c7924a);
            c11003b.m57437xq(1);
        }

        /* renamed from: c */
        public final void m57455c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                final C7924a c7924a = new C7924a(jSONObject);
                if (c7924a.m40975d()) {
                    C22447s.m116065x0(jSONObject);
                    C26263i.m135055u().m135092z0(c7924a, jSONObject.toString());
                    InterfaceC22830a interfaceC22830a = (InterfaceC22830a) C11003b.this.m103742Dp();
                    final C11003b c11003b = C11003b.this;
                    final boolean z11 = this.f55592r;
                    final int i11 = this.f55593s;
                    interfaceC22830a.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.backuprestore.detail.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11003b.f.m57453d(C11003b.this, c7924a, z11, i11);
                        }
                    });
                } else {
                    InterfaceC22830a interfaceC22830a2 = (InterfaceC22830a) C11003b.this.m103742Dp();
                    final C11003b c11003b2 = C11003b.this;
                    final C7924a c7924a2 = this.f55594t;
                    interfaceC22830a2.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.backuprestore.detail.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11003b.f.m57454e(C11003b.this, c7924a2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57455c((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C7924a f55596r;

        /* renamed from: s */
        final /* synthetic */ boolean f55597s;

        /* renamed from: t */
        final /* synthetic */ int f55598t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C7924a c7924a, boolean z11, int i11) {
            super(2);
            this.f55596r = c7924a;
            this.f55597s = z11;
            this.f55598t = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m57457c(C11003b c11003b, int i11, C7924a c7924a, boolean z11, int i12) {
            AbstractC19074t.m100208f(c11003b, "this$0");
            try {
                if (!((InterfaceC22830a) c11003b.m103742Dp()).mo45894h0()) {
                    return;
                }
                if (i11 == 1001) {
                    c11003b.m57414Zp(c7924a);
                    c11003b.m57437xq(1);
                    if (z11) {
                        C26220b.m134827j("updateBackupInfo - ErrorData - 1001", null, 2, null);
                        if (!C22438j.m115948p(i12)) {
                            c11003b.m57395Eq(null, i12, false);
                        }
                    }
                } else if (c7924a == null || !c7924a.m40975d()) {
                    c11003b.m57414Zp(c7924a);
                    c11003b.m57437xq(1);
                } else {
                    c11003b.m57414Zp(c7924a);
                    c11003b.m57437xq(0);
                    ((InterfaceC22830a) c11003b.m103742Dp()).mo57332u3();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final void m57458b(final int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            InterfaceC22830a interfaceC22830a = (InterfaceC22830a) C11003b.this.m103742Dp();
            final C11003b c11003b = C11003b.this;
            final C7924a c7924a = this.f55596r;
            final boolean z11 = this.f55597s;
            final int i12 = this.f55598t;
            interfaceC22830a.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.backuprestore.detail.e
                @Override // java.lang.Runnable
                public final void run() {
                    C11003b.g.m57457c(C11003b.this, i11, c7924a, z11, i12);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m57458b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11;
            if ((C11003b.this.mo57375lb() || AbstractC3489d.m17512t()) && C11003b.this.m57445rq()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.b$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f55600q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11003b(InterfaceC22830a interfaceC22830a, C25806c c25806c, C25804a c25804a, C24720a c24720a, C24199c c24199c, C25724a c25724a) {
        super(interfaceC22830a);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC22830a, "mvpView");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(c24199c, "backupRestoreManager");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        this.f55569t = c25806c;
        this.f55570u = c25804a;
        this.f55571v = c24720a;
        this.f55572w = c24199c;
        this.f55573x = c25724a;
        m129210a = AbstractC24856m.m129210a(i.f55600q);
        this.f55574y = m129210a;
        this.f55575z = C26701b.Companion.m137270a();
        this.f55563D = 8;
        m129210a2 = AbstractC24856m.m129210a(new h());
        this.f55564E = m129210a2;
        this.f55565F = true;
        this.f55566G = true;
    }

    /* renamed from: Bq */
    private final boolean m57394Bq(C21690e c21690e) {
        if (!c21690e.m143172f() && !c21690e.m143171e() && !c21690e.mo96995c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eq */
    public final void m57395Eq(C7924a c7924a, int i11, boolean z11) {
        TargetBackupInfo m135059x = C26263i.m135059x(c7924a);
        if (z11 && m57434uq(i11, m135059x)) {
            this.f55561B = i11;
            this.f55565F = true;
            ((InterfaceC22830a) m103742Dp()).mo57323m3();
        } else if (m57432sq() && this.f55573x.m132668G()) {
            m57396Hq();
        } else {
            this.f55563D = i11;
            ((InterfaceC22830a) m103742Dp()).mo57327r0(i11, m135059x);
        }
    }

    /* renamed from: Hq */
    private final void m57396Hq() {
        this.f55573x.m132679U();
        if (this.f55567H && !AbstractC3489d.m17512t()) {
            C28989l.m144729K(C28989l.Companion.m144769a(), 1, false, false, 6, null);
        } else {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: m40.c
                @Override // java.lang.Runnable
                public final void run() {
                    C11003b.m57398Iq();
                }
            });
        }
        this.f55567H = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Iq */
    public static final void m57398Iq() {
        C26263i.m135055u().m135085r0(16);
    }

    /* renamed from: Jq */
    private final boolean m57400Jq() {
        if (AbstractC3489d.m17505m()) {
            return false;
        }
        if (AbstractC3489d.m17514v()) {
            if (!this.f55573x.m132668G()) {
                C26220b.m134827j("Empty backup cloud show -> using legacy protection method! (password, default)", null, 2, null);
            }
            if (AbstractC3489d.m17509q() && !this.f55573x.m132667F()) {
                C26220b.m134827j("Empty backup cloud show -> backup key doesn't match cloud key", null, 2, null);
            }
            if (!C26263i.m135012E()) {
                C26220b.m134827j("Empty backup cloud show -> backup is stored on Zalo Server!", null, 2, null);
            }
        } else {
            C26220b.m134827j("Empty backup cloud show -> paid and opt-out backup!", null, 2, null);
        }
        if ((!AbstractC3489d.m17514v() || (this.f55573x.m132668G() && ((this.f55573x.m132667F() || !AbstractC3489d.m17509q()) && C26263i.m135012E()))) && !AbstractC3489d.m17515w()) {
            return false;
        }
        return true;
    }

    /* renamed from: Kq */
    private final boolean m57402Kq() {
        if (this.f55569t.m133056r() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zp */
    public final void m57414Zp(C7924a c7924a) {
        if (c7924a != null && c7924a.m40975d()) {
            C22447s.m116032f(c7924a.f42886u, this.f55575z);
            ((InterfaceC22830a) m103742Dp()).mo57336z2(this.f55575z);
            TargetBackupInfo targetBackupInfo = c7924a.f42886u;
            if (targetBackupInfo != null) {
                ((InterfaceC22830a) m103742Dp()).mo57294I5(targetBackupInfo.m40948d(), targetBackupInfo.m40960p());
            }
        } else {
            ((InterfaceC22830a) m103742Dp()).mo57296J2();
        }
        ((InterfaceC22830a) m103742Dp()).mo57314a4();
    }

    /* renamed from: aq */
    private final boolean m57415aq() {
        if (!this.f55571v.m128398O() || !C22447s.m116047m0(C26263i.m135058w(), false, 2, null)) {
            return false;
        }
        ((InterfaceC22830a) m103742Dp()).mo57299M();
        return true;
    }

    /* renamed from: bq */
    private final void m57416bq() {
        ((InterfaceC22830a) m103742Dp()).mo57293I0();
        C2556d.m12981o().m12984B();
    }

    /* renamed from: cq */
    private final void m57417cq() {
        ((InterfaceC22830a) m103742Dp()).mo57300M0();
    }

    /* renamed from: dq */
    private final void m57418dq() {
        ((InterfaceC22830a) m103742Dp()).mo57335z0();
        C22436h.f109760a.m115917l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eq */
    public final HashMap m57419eq() {
        return (HashMap) this.f55574y.getValue();
    }

    /* renamed from: fq */
    private final int m57420fq(boolean z11) {
        return z11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gq */
    public static final void m57421gq(int i11) {
        C26263i.m135055u().m135085r0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public static final void m57422hq(C11003b c11003b, C11007f c11007f) {
        AbstractC19074t.m100208f(c11003b, "this$0");
        AbstractC19074t.m100208f(c11007f, "$it");
        ((InterfaceC22830a) c11003b.m103742Dp()).mo57329s1(c11007f.m57464d(), c11007f.m57466f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public static final void m57423iq(C11003b c11003b) {
        AbstractC19074t.m100208f(c11003b, "this$0");
        c11003b.m57442Fq(15);
    }

    /* renamed from: jq */
    private final void m57424jq(boolean z11, int i11) {
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (!C22447s.m116017S(m135087t)) {
            this.f55569t.m133049i(new f(z11, i11, m135087t), new g(m135087t, z11, i11));
            m57437xq(2);
        } else {
            AbstractC19074t.m100205c(m135087t);
            m57414Zp(m135087t);
            m57437xq(0);
        }
    }

    /* renamed from: kq */
    private final void m57425kq() {
        ((InterfaceC22830a) m103742Dp()).mo57301M1();
    }

    /* renamed from: lq */
    private final boolean m57426lq() {
        if (C18389d.m97401a()) {
            m57425kq();
            return true;
        }
        m57417cq();
        return false;
    }

    /* renamed from: mq */
    private final boolean m57427mq() {
        try {
            C22436h c22436h = C22436h.f109760a;
            if (c22436h.m115922r()) {
                ((InterfaceC22830a) m103742Dp()).mo57288C3(c22436h.m115924w());
                c22436h.m115925y();
                return true;
            }
            ((InterfaceC22830a) m103742Dp()).mo57335z0();
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: nq */
    private final void m57428nq(C21690e c21690e) {
        int m115997D = C22447s.m115997D(c21690e);
        int m115991A = C22447s.m115991A(c21690e, c21690e.f105269f);
        int m115993B = C22447s.m115993B(c21690e.f105269f);
        ((InterfaceC22830a) m103742Dp()).mo57292H1(C3297h.m16738h(C22442n.m115988d(m115993B, m115997D, 0, m115991A, c21690e.m111869G()), c21690e), C22447s.m116061v(m115997D, m115993B));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:11:0x0028, B:14:0x0032), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:11:0x0028, B:14:0x0032), top: B:2:0x0001 }] */
    /* renamed from: oq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m57429oq() {
        boolean z11;
        boolean z12;
        C2553a.a m13001r;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (C2556d.m12981o().m12998l() && (m13001r = C2556d.m12981o().m13001r()) != null) {
            if (!m13001r.m12947a()) {
                z11 = true;
                z12 = false;
                if (!z11) {
                    ((InterfaceC22830a) m103742Dp()).mo57295J0(z12);
                    return true;
                }
                ((InterfaceC22830a) m103742Dp()).mo57293I0();
                return false;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        z12 = true;
        if (!z11) {
        }
    }

    /* renamed from: pq */
    private final boolean m57430pq() {
        C11007f c11007f = (C11007f) m103744Fp();
        if (c11007f == null || c11007f.m57461a() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: qq */
    private final boolean m57431qq() {
        C21690e m133053o = this.f55569t.m133053o();
        if (m133053o == null || m133053o.m143172f() || m133053o.mo96995c()) {
            return false;
        }
        return true;
    }

    /* renamed from: sq */
    private final boolean m57432sq() {
        return ((Boolean) this.f55564E.getValue()).booleanValue();
    }

    /* renamed from: tq */
    private final void m57433tq() {
        if (m57402Kq()) {
            this.f55569t.m133034N(0);
        }
    }

    /* renamed from: uq */
    private final boolean m57434uq(int i11, TargetBackupInfo targetBackupInfo) {
        if (!C22438j.m115946n(i11) || !this.f55571v.m128398O() || !C22447s.m116047m0(targetBackupInfo, false, 2, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: vq */
    private final void m57435vq() {
        final C21690e m133053o = this.f55569t.m133053o();
        if (m133053o != null) {
            if (!m133053o.mo96995c()) {
                m133053o.m143173h(true);
                m133053o.m143176k(true);
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: m40.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11003b.m57436wq(C11003b.this, m133053o);
                    }
                });
                return;
            }
            AbstractC20110a.f98889a.mo104548a("lastSyncSessionInfo is already canceled !!! Ignore", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wq */
    public static final void m57436wq(C11003b c11003b, C21690e c21690e) {
        AbstractC19074t.m100208f(c11003b, "this$0");
        AbstractC19074t.m100208f(c21690e, "$it");
        c11003b.f55569t.m133036P(c21690e.mo96996g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xq */
    public final void m57437xq(int i11) {
        AbstractC20110a.f98889a.mo104548a("onChangeBackupInfoState, state=" + i11, new Object[0]);
        C21690e m133053o = this.f55569t.m133053o();
        if (m133053o != null) {
            if (!m133053o.m143171e() && !m133053o.mo96995c()) {
                ((InterfaceC22830a) m103742Dp()).mo57328s0(true);
                if (i11 != 3 && m57394Bq(m133053o)) {
                    i11 = 4;
                }
                ((InterfaceC22830a) m103742Dp()).mo57312Y0();
                if (m133053o.m143172f()) {
                    mo57343Bj(b.f55578r);
                    ((InterfaceC22830a) m103742Dp()).mo57322m2(C22442n.m115985a(m133053o));
                    m133053o.m111886X(true);
                } else {
                    m57428nq(m133053o);
                }
            } else {
                ((InterfaceC22830a) m103742Dp()).mo57328s0(false);
            }
        }
        if ((i11 == 0 || i11 == 1) && m57444Lq() && !C26263i.m135055u().m135071M()) {
            ((InterfaceC22830a) m103742Dp()).mo57333w3();
        } else {
            ((InterfaceC22830a) m103742Dp()).mo57307R1(i11);
        }
    }

    /* renamed from: zq */
    private final void m57438zq(String str, BaseZaloView baseZaloView) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC27218a m92692wK = baseZaloView.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C22447s.m116007J(0, 2, null, m92692wK, false, false, 48, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("name", baseZaloView.m92652XI(AbstractC8020f0.str_change_account));
        hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_change_account));
        arrayList.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", baseZaloView.m92652XI(AbstractC8020f0.str_not_use_gdrvie_account));
        hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_not_use_gdrvie_account));
        arrayList.add(hashMap2);
        ((InterfaceC22830a) m103742Dp()).mo57304N3(str, arrayList);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: A2 */
    public void mo57342A2() {
        AbstractC23647d.m123897g("5580107");
        this.f55570u.m132982A("", -2);
        ((InterfaceC22830a) m103742Dp()).mo57317g4("");
    }

    /* renamed from: Aq */
    public void m57439Aq() {
        AbstractC23647d.m123897g("5580101");
        mo57386s2(true);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: Bj */
    public void mo57343Bj(b bVar) {
        AbstractC19074t.m100208f(bVar, "loadState");
        this.f55570u.m133004w(bVar);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: C2 */
    public void mo57344C2() {
        boolean z11;
        InterfaceC22830a interfaceC22830a = (InterfaceC22830a) m103742Dp();
        if (!this.f55569t.m133023A() && !C31986k3.f147083a.m154111U1()) {
            z11 = false;
        } else {
            z11 = true;
        }
        interfaceC22830a.mo57319j4(z11);
    }

    /* renamed from: Cq */
    public void m57440Cq(int i11) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C28290a.f131979a.m142554l(true);
        this.f55570u.m133007z();
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (C22447s.m116017S(m135087t)) {
            C26220b.m134827j("onTriggerBackup", null, 2, null);
            m57395Eq(m135087t, i11, true);
        } else {
            m57424jq(true, i11);
        }
    }

    /* renamed from: Dq */
    public void m57441Dq() {
        m57395Eq(C26263i.m135055u().m135087t(), this.f55561B, false);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: F */
    public void mo57345F() {
        AbstractC26084s.m134268p(1, ((InterfaceC22830a) m103742Dp()).mo57324o0(), true);
    }

    /* renamed from: Fq */
    public void m57442Fq(int i11) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (C22447s.m116017S(m135087t)) {
            C26220b.m134827j("onTriggerRestore", null, 2, null);
            m57443Gq(m135087t, i11);
        } else {
            m57424jq(true, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: G1 */
    public void mo57346G1(boolean z11) {
        if (!((InterfaceC22830a) m103742Dp()).mo57311V0()) {
            return;
        }
        if (C26263i.m135053s()) {
            ((InterfaceC22830a) m103742Dp()).mo57290F();
            AbstractC23647d.m123897g("711301");
            AbstractC23647d.m123897g("711309");
        } else {
            this.f55566G = z11;
            if (!m57415aq()) {
                mo57378o0();
            }
        }
        if (z11) {
            AbstractC26084s.m134269q(0, 112);
            C0815e1.m2079N(112, 1, 0, 0, 0);
        } else {
            C2556d.m12981o().m12990O("5", "");
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: G3 */
    public void mo57347G3() {
        C26263i.m135055u().m135082n();
        AbstractC23647d.m123897g("5811300");
    }

    /* renamed from: Gq */
    public void m57443Gq(C7924a c7924a, int i11) {
        ((InterfaceC22830a) m103742Dp()).mo57297K3();
        TargetBackupInfo m135059x = C26263i.m135059x(c7924a);
        if (m135059x != null) {
            ((InterfaceC22830a) m103742Dp()).mo57305O0(i11, m135059x);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: I0 */
    public void mo57348I0() {
        if (!this.f55571v.m128395L()) {
            ((InterfaceC22830a) m103742Dp()).mo57303N1();
        } else {
            ((InterfaceC22830a) m103742Dp()).mo57317g4(this.f55570u.m132993i());
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: I1 */
    public void mo57349I1() {
        if (!m57444Lq() && !m57430pq()) {
            ((InterfaceC22830a) m103742Dp()).mo57298L1();
            m57433tq();
            return;
        }
        ((InterfaceC22830a) m103742Dp()).mo57333w3();
        if (m57402Kq()) {
            ((InterfaceC22830a) m103742Dp()).mo57308S2();
        } else {
            ((InterfaceC22830a) m103742Dp()).mo57289E1();
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: J2 */
    public void mo57350J2() {
        AbstractC23775p0.m124197b("db");
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: K */
    public void mo57351K() {
        m57424jq(false, 1);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: K1 */
    public void mo57352K1() {
        try {
            AbstractC23647d.m123897g("580101");
            C26220b.m134826i("SMLSettingBackupRestoreView", "onClick onClickBackupManual", null, 4, null);
            C0815e1.m2079N(60, 1, 0, 0, 0);
            m57440Cq(8);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: L0 */
    public void mo57353L0() {
        try {
            C26220b.m134826i("SMLSettingBackupRestoreView", "onClick restore message", null, 4, null);
            m57442Fq(14);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:            r9 = 10;     */
    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: L2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo57354L2(int i11, int i12, Intent intent) {
        String str = null;
        int i13 = 0;
        boolean z11 = false;
        r4 = 0;
        int i14 = 0;
        if (i11 != 18054) {
            if (i11 != 18055) {
                if (i11 != 18061) {
                    switch (i11) {
                        case 1804:
                            ((InterfaceC22830a) m103742Dp()).mo57314a4();
                            if (i12 == -1 && intent != null && intent.getIntExtra("extra_action", 0) == 3 && this.f55571v.m128395L()) {
                                ((InterfaceC22830a) m103742Dp()).mo57317g4("");
                                return;
                            }
                            return;
                        case 1805:
                            ((InterfaceC22830a) m103742Dp()).mo57314a4();
                            int i15 = 2;
                            if (intent != null) {
                                i15 = intent.getIntExtra("extra_entry_point", 2);
                            }
                            if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                                i14 = 1;
                            }
                            if (i12 == -1) {
                                if (i14 == 0) {
                                    C26263i.m135055u().m135085r0(i15);
                                    return;
                                }
                                try {
                                    ((InterfaceC22830a) m103742Dp()).mo57317g4("");
                                    return;
                                } catch (Exception e11) {
                                    AbstractC20110a.f98889a.mo104552e(e11);
                                    return;
                                }
                            }
                            return;
                        case 1806:
                            if (i12 == -1) {
                                ((InterfaceC22830a) m103742Dp()).mo57298L1();
                                if (intent != null) {
                                    try {
                                        str = intent.getStringExtra("extra_acc_local_auth");
                                    } catch (Exception e12) {
                                        AbstractC20110a.f98889a.mo104552e(e12);
                                        return;
                                    }
                                }
                                if (intent != null) {
                                    z11 = intent.getBooleanExtra("return_setted_pass", false);
                                }
                                if (str != null && str.length() != 0) {
                                    m57446yq(str);
                                    break;
                                }
                                final int i16 = this.f55563D;
                                if (m57432sq()) {
                                    m57396Hq();
                                    return;
                                } else {
                                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: m40.b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C11003b.m57421gq(i16);
                                        }
                                    });
                                    return;
                                }
                            }
                            if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                                ((InterfaceC22830a) m103742Dp()).mo57317g4("");
                                return;
                            }
                            return;
                        case 1807:
                            if (i12 == -1) {
                                String m132993i = this.f55570u.m132993i();
                                if (!TextUtils.isEmpty(m132993i)) {
                                    ((InterfaceC22830a) m103742Dp()).mo57317g4(m132993i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                if (i12 == -1) {
                    if (intent != null) {
                        str = intent.getStringExtra("extra_acc_local_auth");
                    }
                    if (str != null) {
                        m57446yq(str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == -1) {
                if (intent != null) {
                    str = intent.getStringExtra("extra_acc_local_auth");
                }
                if (intent != null) {
                    i13 = intent.getIntExtra("extra_from_pos", 0);
                }
                if (str != null) {
                    m57446yq(str);
                    if (i13 != 1) {
                        ((InterfaceC22830a) m103742Dp()).mo57326r(3, i13);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("extra_acc_local_auth");
            }
            if (str != null && str.length() != 0) {
                m57446yq(str);
                ((InterfaceC22830a) m103742Dp()).mo57326r(4, 0);
            }
        }
    }

    /* renamed from: Lq */
    public boolean m57444Lq() {
        if ((C22447s.m116055r() || m57431qq() || mo57381q0()) && !m57400Jq() && !m57430pq()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: M */
    public void mo57355M() {
        try {
            if (this.f55562C != 0) {
                AbstractC23647d.m123897g("5580110");
            } else {
                AbstractC23647d.m123897g("5580109");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: M0 */
    public void mo57356M0() {
        try {
            ((InterfaceC22830a) m103742Dp()).mo57335z0();
            C22436h.f109760a.m115914F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: N */
    public void mo57357N() {
        ((InterfaceC22830a) m103742Dp()).mo57306Q();
        AbstractC26084s.m134269q(0, 128);
        C0815e1.m2079N(128, 1, 0, 0, 0);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: P1 */
    public void mo57358P1(boolean z11) {
        this.f55569t.m133031K(z11 ? 1 : 0);
        ((InterfaceC22830a) m103742Dp()).mo57319j4(z11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: P2 */
    public void mo57359P2() {
        try {
            C11007f c11007f = (C11007f) m103744Fp();
            if (c11007f != null && c11007f.m57467g()) {
                if (!mo57381q0()) {
                    m57440Cq(7);
                }
                ((InterfaceC22830a) m103742Dp()).mo57313Y3("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: Q1 */
    public void mo57360Q1() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_only);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_3g);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f55560A = new String[]{m118743r0, m118743r02};
        this.f55562C = !this.f55569t.m133024B() ? 1 : 0;
        InterfaceC22830a interfaceC22830a = (InterfaceC22830a) m103742Dp();
        String[] strArr = this.f55560A;
        if (strArr == null) {
            AbstractC19074t.m100223u("arrayConditionWifi");
            strArr = null;
        }
        interfaceC22830a.mo57287B(strArr[this.f55562C]);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: R2 */
    public void mo57361R2() {
        try {
            if (((InterfaceC22830a) m103742Dp()).mo57318j2()) {
                return;
            }
            C0809c1.m2050b(new c(!((InterfaceC22830a) m103742Dp()).mo57334w4(), this));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: R9 */
    public void mo57362R9() {
        if (m57445rq()) {
            this.f55568I = true;
            C23744a.Companion.m124119a().m124116d(150809, new Object[0]);
            if (!this.f55568I) {
                this.f55567H = true;
                this.f55568I = false;
            }
            this.f55571v.m128407Y(12);
            mo57380p0();
            return;
        }
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new e(new C21699a(m120679j2), this, null, this), 3, null);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: S3 */
    public boolean mo57363S3() {
        return C22447s.m116020V();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: T2 */
    public void mo57364T2() {
        AbstractC26084s.m134269q(0, 58);
        C0815e1.m2079N(58, 1, 0, 0, 0);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: U3 */
    public String mo57365U3() {
        String m118743r0;
        try {
            if (!C22447s.m116057s(C26263i.m135058w())) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_remind_restore_login_msg);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_remind_restore_login_msg_media);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: Y3 */
    public void mo57366Y3(int i11, InterfaceC27218a interfaceC27218a, int i12) {
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        if (i11 == 7) {
            AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_RESTORE", new Runnable() { // from class: m40.f
                @Override // java.lang.Runnable
                public final void run() {
                    C11003b.m57423iq(C11003b.this);
                }
            }, 1000L);
        } else {
            C22447s.m116011M(i11, interfaceC27218a, 0, i12);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: Z0 */
    public void mo57367Z0() {
        AbstractC23647d.m123897g("5811301");
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: Z1 */
    public void mo57368Z1() {
        C22432d.f109743a.m115880h(true);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: g0 */
    public void mo57369g0() {
        try {
            AbstractC23647d.m123897g("5580108");
            InterfaceC22830a interfaceC22830a = (InterfaceC22830a) m103742Dp();
            String[] strArr = this.f55560A;
            if (strArr == null) {
                AbstractC19074t.m100223u("arrayConditionWifi");
                strArr = null;
            }
            interfaceC22830a.mo57291H(strArr, this.f55562C);
            AbstractC26084s.m134269q(0, 60);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: go */
    public boolean mo57370go() {
        return this.f55572w.m126159l();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: io */
    public LiveData mo57371io() {
        return this.f55570u.m133003v();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: k2 */
    public void mo57372k2() {
        final C11007f c11007f = (C11007f) m103744Fp();
        if (c11007f != null && c11007f.m57468h() && !TextUtils.isEmpty(c11007f.m57464d()) && !TextUtils.isEmpty(c11007f.m57466f())) {
            ((InterfaceC22830a) m103742Dp()).mo78955kl(new Runnable() { // from class: m40.d
                @Override // java.lang.Runnable
                public final void run() {
                    C11003b.m57422hq(C11003b.this, c11007f);
                }
            }, 300L);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: k3 */
    public void mo57373k3() {
        ((InterfaceC22830a) m103742Dp()).mo57321l3();
        AbstractC26084s.m134269q(0, 58);
        C0815e1.m2079N(58, 1, 0, 0, 0);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: kn */
    public void mo57374kn() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new d(null), 3, null);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: lb */
    public boolean mo57375lb() {
        if (AbstractC23306f.m120633X1().m89807v() && C0860a.Companion.m2473a().m2461l()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: m2 */
    public void mo57376m2() {
        if (this.f55565F) {
            m57441Dq();
        } else {
            m57439Aq();
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: n3 */
    public void mo57377n3() {
        if (this.f55571v.m128398O() && C22447s.m116047m0(C26263i.m135058w(), false, 2, null)) {
            this.f55565F = false;
            ((InterfaceC22830a) m103742Dp()).mo57323m3();
        } else {
            m57439Aq();
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: o0 */
    public void mo57378o0() {
        ((InterfaceC22830a) m103742Dp()).mo57309U(m57420fq(!this.f55566G));
        AbstractC23647d.m123897g("711300");
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: p */
    public void mo57379p() {
        m57414Zp(C26263i.m135055u().m135087t());
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: p0 */
    public void mo57380p0() {
        try {
            m57395Eq(null, 8, false);
            if (this.f55569t.m133056r() == 1) {
                this.f55569t.m133034N(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: q0 */
    public boolean mo57381q0() {
        return C26263i.m135055u().m135071M();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: q3 */
    public void mo57382q3(BaseZaloView baseZaloView) {
        AbstractC19074t.m100208f(baseZaloView, "zaloView");
        if (mo57381q0()) {
            return;
        }
        String m132993i = this.f55570u.m132993i();
        if (!TextUtils.isEmpty(m132993i)) {
            AbstractC23647d.m123897g("5580106");
        } else {
            AbstractC23647d.m123897g("5580105");
        }
        m57438zq(m132993i, baseZaloView);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: r */
    public boolean mo57383r() {
        return this.f55571v.m128403T();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: r0 */
    public boolean mo57384r0() {
        return C26263i.m135053s();
    }

    /* renamed from: rq */
    public boolean m57445rq() {
        return C24252c.f117152a.m126600f(EnumC24251b.f117148s);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: s0 */
    public void mo57385s0(int i11) {
        try {
            this.f55562C = i11;
            InterfaceC22830a interfaceC22830a = (InterfaceC22830a) m103742Dp();
            String[] strArr = this.f55560A;
            if (strArr == null) {
                AbstractC19074t.m100223u("arrayConditionWifi");
                strArr = null;
            }
            interfaceC22830a.mo57287B(strArr[i11]);
            if (i11 == 0) {
                AbstractC23647d.m123897g("5580109");
                this.f55569t.m133039T(true);
            } else {
                AbstractC23647d.m123897g("5580110");
                this.f55569t.m133039T(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: s2 */
    public void mo57386s2(boolean z11) {
        if (z11) {
            this.f55571v.m128407Y(2);
        } else {
            this.f55571v.m128407Y(-1);
        }
        ((InterfaceC22830a) m103742Dp()).mo57302N0(z11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: u3 */
    public void mo57387u3(int i11) {
        try {
            if (mo57381q0()) {
                AbstractC20110a.f98889a.mo104548a("invalidateDataBannersChanged: don't show any banner when syncing -> return", new Object[0]);
                return;
            }
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104548a("invalidateDataBannersChanged: bannerTypeTrigger=%s", Integer.valueOf(i11));
            if (mo57375lb() && !AbstractC23306f.m120636Y1().m128529n()) {
                m57418dq();
                m57417cq();
                m57416bq();
                ((InterfaceC22830a) m103742Dp()).mo57315bB();
                aVar.mo104548a("invalidateDataBannersChanged, hide all banners remind", new Object[0]);
                return;
            }
            if (((InterfaceC22830a) m103742Dp()).mo57330t0()) {
                m57418dq();
                m57417cq();
                m57416bq();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind setting", new Object[0]);
                return;
            }
            if (m57427mq()) {
                m57417cq();
                m57416bq();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind restore", new Object[0]);
            } else if (m57426lq()) {
                m57416bq();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind auth google", new Object[0]);
            } else if (m57429oq()) {
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind backup password", new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: ul */
    public boolean mo57388ul() {
        if (AbstractC23306f.m120633X1().m89807v() && C0860a.Companion.m2473a().m2468s()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: v2 */
    public void mo57389v2() {
        m57435vq();
        mo57351K();
        C22436h.m115891B(C22436h.f109760a, 3, false, 2, null);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: w0 */
    public boolean mo57390w0() {
        return this.f55565F;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: w1 */
    public void mo57391w1() {
        if (this.f55571v.m128392I()) {
            ((InterfaceC22830a) m103742Dp()).mo57302N0(true);
        } else {
            ((InterfaceC22830a) m103742Dp()).mo57302N0(false);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: x3 */
    public void mo57392x3(Bundle bundle) {
        if (bundle == null) {
            C26263i.m135055u().m135077j0(true);
        }
    }

    /* renamed from: yq */
    public final void m57446yq(String str) {
        AbstractC19074t.m100208f(str, "emailAuthen");
        this.f55570u.m133006y();
        ((InterfaceC22830a) m103742Dp()).mo57317g4(str);
        ((InterfaceC22830a) m103742Dp()).mo57300M0();
        this.f55570u.m132982A(str, 1);
        mo57374kn();
        mo57343Bj(b.f55577q);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.detail.InterfaceC11002a
    /* renamed from: zh */
    public AbstractC25219c mo57393zh() {
        return this.f55570u.m133001t();
    }
}
