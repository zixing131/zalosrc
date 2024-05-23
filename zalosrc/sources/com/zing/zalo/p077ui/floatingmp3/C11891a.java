package com.zing.zalo.p077ui.floatingmp3;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import androidx.core.text.AbstractC1463b;
import androidx.lifecycle.AbstractC1791r;
import androidx.lifecycle.AbstractC1803x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8950c;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.libbubbleview.FloatingItemView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.VipMessagesView;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gb.C19375a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import o70.C24099q0;
import p173fz.C19172a;
import p207he.C20024r;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25379x0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import v00.C27415j;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import yt.AbstractC31072b;
import yt.C31071a;
import yt.C31081k;
import z60.C31698a;

/* renamed from: com.zing.zalo.ui.floatingmp3.a */
/* loaded from: classes.dex */
public final class C11891a extends AbstractC8950c {
    public static final b Companion = new b(null);

    /* renamed from: F */
    private static C11891a f61945F;

    /* renamed from: G */
    private static int f61946G;

    /* renamed from: H */
    private static final InterfaceC24854k f61947H;

    /* renamed from: D */
    private AbstractC31072b f61948D;

    /* renamed from: E */
    private boolean f61949E;

    /* renamed from: com.zing.zalo.ui.floatingmp3.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f61950q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Set mo12V4() {
            Set m131555i;
            m131555i = AbstractC25379x0.m131555i(MainTabView.class, ChatView.class, VipMessagesView.class);
            return m131555i;
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: com.zing.zalo.ui.floatingmp3.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {
            public a(CoroutineExceptionHandler.Key key) {
                super(key);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            /* renamed from: G */
            public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
                AbstractC20110a.f98889a.mo104552e(th2);
            }
        }

        /* renamed from: com.zing.zalo.ui.floatingmp3.a$b$b */
        /* loaded from: classes5.dex */
        public static final class C32758b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f61951t;

            /* renamed from: u */
            final /* synthetic */ ZaloActivity f61952u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32758b(ZaloActivity zaloActivity, Continuation continuation) {
                super(2, continuation);
                this.f61952u = zaloActivity;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32758b(this.f61952u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C11891a c11891a;
                ZaloActivity m47790K;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f61951t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    b bVar = C11891a.Companion;
                    ZaloActivity zaloActivity = this.f61952u;
                    this.f61951t = 1;
                    obj = bVar.m66082b(zaloActivity, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    b bVar2 = C11891a.Companion;
                    if (bVar2.m66091m()) {
                        bVar2.m66084d();
                    }
                    return C24848g0.f119245a;
                }
                b bVar3 = C11891a.Companion;
                if (bVar3.m66091m() && (c11891a = C11891a.f61945F) != null && (m47790K = c11891a.m47790K()) != null && m47790K.equals(this.f61952u)) {
                    C11891a c11891a2 = C11891a.f61945F;
                    if (c11891a2 != null) {
                        c11891a2.m66074r0();
                    }
                } else {
                    bVar3.m66086f(this.f61952u).mo47804f(new C31698a(), true);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32758b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: com.zing.zalo.ui.floatingmp3.a$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f61953t;

            c(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                boolean z11;
                AbstractC28298d.m142578e();
                if (this.f61953t == 0) {
                    AbstractC24862s.m129228b(obj);
                    if (System.currentTimeMillis() - AbstractC0924m0.m3359Q3() > C19172a.m100600k("floating_mp3@dismiss_duration", 86400) * 1000) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return AbstractC29094b.m145339a(z11);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ C11891a m66078g(b bVar, ZaloActivity zaloActivity, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                zaloActivity = null;
            }
            return bVar.m66086f(zaloActivity);
        }

        /* renamed from: h */
        private final Set m66079h() {
            return (Set) C11891a.f61947H.getValue();
        }

        /* renamed from: o */
        private final boolean m66080o(Class cls, C17487o0 c17487o0) {
            if (c17487o0 != null) {
                try {
                    ZaloView m92993D0 = c17487o0.m92993D0(cls);
                    if (m92993D0 != null && m92993D0.m92672lJ() && !m92993D0.mo60294yp()) {
                        if (m92993D0 instanceof MainTabView) {
                            int i11 = C11891a.f61946G;
                            C24099q0.b bVar = C24099q0.Companion;
                            if (i11 == bVar.m125984a().m125977u() && !C11891a.Companion.m66092n()) {
                                return false;
                            }
                            if (C11891a.f61946G == bVar.m125984a().m125966g() && !C11891a.Companion.m66088j()) {
                                return false;
                            }
                        }
                        if (m92993D0 instanceof ChatView) {
                            if (((ChatView) m92993D0).mo59925ZG() || ((ChatView) m92993D0).mo60072jt() || ((ChatView) m92993D0).mo59873Vj() || (((ChatView) m92993D0).m60020gQ() != null && ((ChatView) m92993D0).m60020gQ().mo60583J0())) {
                                return false;
                            }
                            ZaloView m92993D02 = ((ChatView) m92993D0).m92649TI().m92993D0(ChatInfoView.class);
                            if (m92993D02 != null) {
                                AbstractC19074t.m100206d(m92993D02, "null cannot be cast to non-null type com.zing.zalo.ui.chat.rightmenu.ChatInfoView");
                                if (((ChatInfoView) m92993D02).mo65168QC()) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void m66081a(ZaloActivity zaloActivity) {
            AbstractC19074t.m100208f(zaloActivity, "activity");
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(zaloActivity), new a(CoroutineExceptionHandler.f105837l), null, new C32758b(zaloActivity, null), 2, null);
        }

        /* renamed from: b */
        public final Object m66082b(Context context, Continuation continuation) {
            if (context == null) {
                return AbstractC29094b.m145339a(false);
            }
            if (!m66090l()) {
                return AbstractC29094b.m145339a(false);
            }
            if (!AbstractC23152n3.m119071u(context, "com.zing.mp3")) {
                return AbstractC29094b.m145339a(false);
            }
            return m66089k(continuation);
        }

        /* renamed from: c */
        public final boolean m66083c() {
            if (!m66087i() || C20024r.m103942k(false)) {
                return false;
            }
            C16786d.a aVar = C16786d.Companion;
            if (aVar.m89649f() && C16786d.a.m89644c(aVar, null, 1, null).m89639f0()) {
                return false;
            }
            return !C27415j.Companion.m140376c();
        }

        /* renamed from: d */
        public final void m66084d() {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: close", new Object[0]);
            C11891a c11891a = C11891a.f61945F;
            if (c11891a != null) {
                c11891a.m66071h0();
            }
        }

        /* renamed from: e */
        public final ZaloActivity m66085e() {
            C11891a c11891a = C11891a.f61945F;
            if (c11891a != null) {
                return c11891a.m47790K();
            }
            return null;
        }

        /* renamed from: f */
        public final C11891a m66086f(ZaloActivity zaloActivity) {
            C11891a c11891a;
            ZaloActivity m47790K;
            if (C11891a.f61945F == null) {
                C11891a.f61945F = new C11891a();
            }
            if (zaloActivity != null && ((c11891a = C11891a.f61945F) == null || (m47790K = c11891a.m47790K()) == null || !m47790K.equals(zaloActivity))) {
                C11891a c11891a2 = C11891a.f61945F;
                if (c11891a2 != null) {
                    c11891a2.mo47802W(zaloActivity);
                }
                C11891a c11891a3 = C11891a.f61945F;
                if (c11891a3 != null) {
                    c11891a3.m47805g();
                }
                C11891a c11891a4 = C11891a.f61945F;
                if (c11891a4 != null) {
                    c11891a4.m47803X(zaloActivity);
                }
                C11891a c11891a5 = C11891a.f61945F;
                if (c11891a5 != null) {
                    c11891a5.m47797R(false);
                }
            }
            C11891a c11891a6 = C11891a.f61945F;
            AbstractC19074t.m100205c(c11891a6);
            return c11891a6;
        }

        /* renamed from: i */
        public final boolean m66087i() {
            C17487o0 c17487o0;
            ZaloActivity m66085e = m66085e();
            if (m66085e != null) {
                c17487o0 = m66085e.mo35579p();
            } else {
                c17487o0 = null;
            }
            Iterator it = m66079h().iterator();
            while (it.hasNext()) {
                if (m66080o((Class) it.next(), c17487o0)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public final boolean m66088j() {
            if (C19172a.m100600k("floating_mp3@discovery_tab_allowed", 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public final Object m66089k(Continuation continuation) {
            return BuildersKt.m112534g(Dispatchers.m112680b(), new c(null), continuation);
        }

        /* renamed from: l */
        public final boolean m66090l() {
            if (C19172a.m100600k("floating_mp3@enable", 0) != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        public final boolean m66091m() {
            if (C11891a.f61945F != null) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final boolean m66092n() {
            if (C19172a.m100600k("floating_mp3@timeline_tab_allowed", 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public final boolean m66093p(Class cls) {
            AbstractC19074t.m100208f(cls, "zaloView");
            return m66079h().contains(cls);
        }

        /* renamed from: q */
        public final void m66094q(int i11) {
            if (C11891a.f61946G != i11) {
                C11891a.f61946G = i11;
                C11891a c11891a = C11891a.f61945F;
                if (c11891a != null) {
                    c11891a.m66074r0();
                }
            }
        }

        /* renamed from: r */
        public final void m66095r(ZaloActivity zaloActivity) {
            ZaloActivity m47790K;
            C11891a c11891a;
            AbstractC19074t.m100208f(zaloActivity, "activity");
            C11891a c11891a2 = C11891a.f61945F;
            if (c11891a2 != null && (m47790K = c11891a2.m47790K()) != null && m47790K.equals(zaloActivity) && (c11891a = C11891a.f61945F) != null) {
                c11891a.m66075s0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends Enum {

        /* renamed from: p */
        public static final c f61954p = new c("STOP", 0);

        /* renamed from: q */
        public static final c f61955q = new c("RESUME", 1);

        /* renamed from: r */
        private static final /* synthetic */ c[] f61956r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f61957s;

        static {
            c[] m66098b = m66098b();
            f61956r = m66098b;
            f61957s = AbstractC30166b.m148796a(m66098b);
        }

        private c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m66098b() {
            return new c[]{f61954p, f61955q};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f61956r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61958t;

        /* renamed from: u */
        final /* synthetic */ float f61959u;

        /* renamed from: v */
        final /* synthetic */ float f61960v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f11, float f12, Continuation continuation) {
            super(2, continuation);
            this.f61959u = f11;
            this.f61960v = f12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f61959u, this.f61960v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f61958t == 0) {
                AbstractC24862s.m129228b(obj);
                float f11 = (float) 1000000000;
                AbstractC0924m0.m3405Rk(this.f61959u * f11);
                AbstractC0924m0.m3434Sk(this.f61960v * f11);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f61950q);
        f61947H = m129210a;
    }

    /* renamed from: i0 */
    public static final void m66064i0(C11891a c11891a) {
        View view;
        AbstractC19074t.m100208f(c11891a, "this$0");
        C31081k m47789J = c11891a.m47789J();
        if (m47789J != null) {
            view = m47789J.m151009l();
        } else {
            view = null;
        }
        if (view instanceof FloatingMp3PlayerView) {
            ((FloatingMp3PlayerView) view).m66019D();
        }
    }

    /* renamed from: j0 */
    public static final void m66065j0(C11891a c11891a) {
        AbstractC19074t.m100208f(c11891a, "this$0");
        if (C20024r.m103942k(false)) {
            c11891a.m66075s0();
        } else {
            c11891a.m66074r0();
        }
    }

    /* renamed from: k0 */
    public static final void m66066k0(Object[] objArr, C11891a c11891a) {
        AbstractC19074t.m100208f(objArr, "$args");
        AbstractC19074t.m100208f(c11891a, "this$0");
        Object obj = objArr[0];
        if (AbstractC19074t.m100204b(obj, Integer.valueOf(c.f61954p.ordinal()))) {
            c11891a.m66075s0();
        } else if (AbstractC19074t.m100204b(obj, Integer.valueOf(c.f61955q.ordinal()))) {
            c11891a.m66074r0();
        }
    }

    /* renamed from: m0 */
    public static final C11891a m66067m0(ZaloActivity zaloActivity) {
        return Companion.m66086f(zaloActivity);
    }

    /* renamed from: n0 */
    public static final boolean m66068n0() {
        return Companion.m66091m();
    }

    /* renamed from: o0 */
    private final void m66069o0() {
        View view;
        String m118749t0;
        C17487o0 mo35579p;
        ZaloView m93012K0;
        ZaloActivity m47790K = m47790K();
        RobotoTextView robotoTextView = null;
        if (m47790K != null && (mo35579p = m47790K.mo35579p()) != null && (m93012K0 = mo35579p.m93012K0()) != null) {
            view = m93012K0.m92656bJ();
        } else {
            view = null;
        }
        if (view != null) {
            int m92930a = AbstractC23222t7.f112553c0 + AbstractC17484n.Companion.m92930a();
            if (C19375a.f96216a.m101497a()) {
                m118749t0 = AbstractC23136l9.m118749t0(view.getContext(), AbstractC8020f0.str_floating_mp3_closed_while_playing);
            } else {
                m118749t0 = AbstractC23136l9.m118749t0(view.getContext(), AbstractC8020f0.str_floating_mp3_closed_while_paused);
            }
            AbstractC19074t.m100205c(m118749t0);
            Snackbar.C16925c c16925c = Snackbar.Companion;
            Spanned m7440a = AbstractC1463b.m7440a(m118749t0, 63);
            AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
            Snackbar m90669d = c16925c.m90669d(view, m7440a, 0);
            Snackbar.SnackbarLayout m90658q = m90669d.m90658q();
            if (m90658q != null) {
                robotoTextView = m90658q.getMessageView();
            }
            if (robotoTextView != null) {
                robotoTextView.setTextAlignment(4);
            }
            m90669d.m90641G(true);
            m90669d.m90645K(m92930a);
            m90669d.m90648N();
        }
    }

    /* renamed from: p0 */
    public static final void m66070p0(int i11) {
        Companion.m66094q(i11);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: Q */
    public void mo47796Q(float f11, float f12) {
        AbstractC1791r m9388a;
        ZaloActivity m66085e = Companion.m66085e();
        if (m66085e != null && (m9388a = AbstractC1803x.m9388a(m66085e)) != null) {
            BuildersKt__Builders_commonKt.m112540d(m9388a, Dispatchers.m112680b(), null, new d(f11, f12, null), 2, null);
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: W */
    public void mo47802W(ZaloActivity zaloActivity) {
        AbstractC19074t.m100208f(zaloActivity, "zaloActivity");
        super.mo47802W(zaloActivity);
        Context context = zaloActivity.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C31081k m47789J = m47789J();
        AbstractC19074t.m100205c(m47789J);
        FloatingItemView.InterfaceC8946b m47813s = m47813s();
        C31071a m47791L = m47791L();
        AbstractC19074t.m100205c(m47791L);
        m47798S(new C11892b(context, m47789J, m47813s, m47791L));
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 15003);
        bVar.m124119a().m124115b(this, 1001);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: f */
    public void mo47804f(Object obj, boolean z11) {
        C11892b c11892b;
        AbstractC19074t.m100208f(obj, "itemInfo");
        AbstractC31072b abstractC31072b = (AbstractC31072b) obj;
        this.f61948D = abstractC31072b;
        if (abstractC31072b != null) {
            C8949b m47814u = m47814u();
            if (m47814u instanceof C11892b) {
                c11892b = (C11892b) m47814u;
            } else {
                c11892b = null;
            }
            if (c11892b != null) {
                c11892b.m66109v(abstractC31072b);
            }
        }
    }

    /* renamed from: h0 */
    public final void m66071h0() {
        View view;
        C31081k m47789J;
        C31081k m47789J2 = m47789J();
        if (m47789J2 != null) {
            view = m47789J2.m151009l();
        } else {
            view = null;
        }
        if ((view instanceof FloatingMp3PlayerView) && (m47789J = m47789J()) != null) {
            m47789J.m151012p();
        }
        AbstractC8950c.Companion.m47819a(this);
        f61945F = null;
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 15003);
        bVar.m124119a().m124117e(this, 1001);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: j */
    public void mo47808j(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        super.mo47808j(abstractC31072b);
        m66069o0();
        m66071h0();
    }

    /* renamed from: l0 */
    public final void m66072l0() {
        this.f61949E = true;
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: q */
    public C31071a mo47812q() {
        return new C31071a(0.0f, 0.0f, 0.0f, 58.0f, 58.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 917479, null);
    }

    /* renamed from: q0 */
    public final void m66073q0() {
        AbstractC31072b abstractC31072b;
        C11892b c11892b;
        if (this.f61949E && (abstractC31072b = this.f61948D) != null) {
            this.f61949E = false;
            C8949b m47814u = m47814u();
            if (m47814u instanceof C11892b) {
                c11892b = (C11892b) m47814u;
            } else {
                c11892b = null;
            }
            if (c11892b != null) {
                c11892b.m66109v(abstractC31072b);
            }
        }
    }

    /* renamed from: r0 */
    public final void m66074r0() {
        View view;
        C31081k m47789J = m47789J();
        if (m47789J != null) {
            view = m47789J.m151009l();
        } else {
            view = null;
        }
        if (view instanceof FloatingMp3PlayerView) {
            ((FloatingMp3PlayerView) view).m66021F();
        }
    }

    /* renamed from: s0 */
    public final void m66075s0() {
        View view;
        C31081k m47789J = m47789J();
        if (m47789J != null) {
            view = m47789J.m151009l();
        } else {
            view = null;
        }
        if (view instanceof FloatingMp3PlayerView) {
            FloatingMp3PlayerView floatingMp3PlayerView = (FloatingMp3PlayerView) view;
            if (floatingMp3PlayerView.m66025z()) {
                return;
            }
            floatingMp3PlayerView.m66023K();
        }
    }

    /* renamed from: t0 */
    public final void m66076t0() {
        View view;
        C31081k m47789J = m47789J();
        if (m47789J != null) {
            view = m47789J.m151009l();
        } else {
            view = null;
        }
        if (view instanceof FloatingMp3PlayerView) {
            FloatingMp3PlayerView floatingMp3PlayerView = (FloatingMp3PlayerView) view;
            if (floatingMp3PlayerView.m66025z()) {
                return;
            }
            floatingMp3PlayerView.m66022I();
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 1001) {
            if (i11 != 9006) {
                if (i11 != 15003 || objArr.length == 0) {
                    return;
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: z60.d

                    /* renamed from: p */
                    public final /* synthetic */ Object[] f145658p;

                    /* renamed from: q */
                    public final /* synthetic */ C11891a f145659q;

                    public /* synthetic */ RunnableC31701d(Object[] objArr2, C11891a this) {
                        r1 = objArr2;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C11891a.m66066k0(r1, r2);
                    }
                });
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: z60.b
                public /* synthetic */ RunnableC31699b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C11891a.m66064i0(C11891a.this);
                }
            });
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: z60.c
            public /* synthetic */ RunnableC31700c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C11891a.m66065j0(C11891a.this);
            }
        });
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: y */
    public float mo47817y() {
        try {
            return ((float) AbstractC0924m0.m3272N3()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: z */
    public float mo47818z() {
        try {
            return ((float) AbstractC0924m0.m3301O3()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
