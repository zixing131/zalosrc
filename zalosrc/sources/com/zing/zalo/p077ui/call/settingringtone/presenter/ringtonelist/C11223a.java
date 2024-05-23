package com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonelist;

import ag0.C0815e1;
import am.AbstractC0924m0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionInCall;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.C21473a;
import k50.C21474b;
import k50.C21475c;
import k50.C21476d;
import k50.C21477e;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import l50.C22082d;
import l50.C22083e;
import l50.C22084f;
import l50.C22085g;
import l50.C22086h;
import l50.C22088j;
import l50.C22091m;
import l50.C22093o;
import l50.C22095q;
import l50.C22096r;
import me0.AbstractC23136l9;
import me0.C23212s8;
import n50.AbstractC23574h;
import n50.C23569c;
import n50.C23570d;
import n50.C23571e;
import n50.C23572f;
import n50.C23573g;
import n50.C23575i;
import n50.InterfaceC23567a;
import n50.InterfaceC23568b;
import on0.AbstractC24341v;
import p205hc.C19964c;
import p361nb.C23648e;
import p426pp.AbstractC24900c;
import p534u1.AbstractC26941a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import r50.AbstractC25664a;
import un0.AbstractC27323a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a */
/* loaded from: classes5.dex */
public final class C11223a extends AbstractC1796t0 implements InterfaceC23568b {
    public static final h Companion = new h(null);

    /* renamed from: A */
    private final InterfaceC24854k f56389A;

    /* renamed from: B */
    private final InterfaceC24854k f56390B;

    /* renamed from: C */
    private final InterfaceC24854k f56391C;

    /* renamed from: D */
    private final InterfaceC24854k f56392D;

    /* renamed from: E */
    private final InterfaceC24854k f56393E;

    /* renamed from: F */
    private final InterfaceC24854k f56394F;

    /* renamed from: G */
    private final InterfaceC24854k f56395G;

    /* renamed from: H */
    private final MutableStateFlow f56396H;

    /* renamed from: I */
    private final MutableStateFlow f56397I;

    /* renamed from: J */
    private final MutableStateFlow f56398J;

    /* renamed from: K */
    private final MutableStateFlow f56399K;

    /* renamed from: L */
    private final C1761c0 f56400L;

    /* renamed from: M */
    private final C1761c0 f56401M;

    /* renamed from: N */
    private final C1761c0 f56402N;

    /* renamed from: O */
    private final C1761c0 f56403O;

    /* renamed from: P */
    private final C1761c0 f56404P;

    /* renamed from: Q */
    private final C1761c0 f56405Q;

    /* renamed from: R */
    private String f56406R;

    /* renamed from: s */
    private boolean f56407s = true;

    /* renamed from: t */
    private boolean f56408t = true;

    /* renamed from: u */
    private int f56409u;

    /* renamed from: v */
    private Job f56410v;

    /* renamed from: w */
    private RingtoneData f56411w;

    /* renamed from: x */
    private RingtoneData f56412x;

    /* renamed from: y */
    private Job f56413y;

    /* renamed from: z */
    private final InterfaceC24854k f56414z;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$a */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$a0 */
    /* loaded from: classes5.dex */
    static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a0 f56415q = new a0();

        a0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22088j mo12V4() {
            return new C22088j(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$b */
    /* loaded from: classes5.dex */
    public static final class b implements a {

        /* renamed from: a */
        public static final b f56416a = new b();

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$b0 */
    /* loaded from: classes5.dex */
    public static final class b0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56417t;

        /* renamed from: v */
        final /* synthetic */ RingtoneData f56419v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$b0$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C11223a f56420p;

            /* renamed from: q */
            final /* synthetic */ RingtoneData f56421q;

            a(C11223a c11223a, RingtoneData ringtoneData) {
                this.f56420p = c11223a;
                this.f56421q = ringtoneData;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                int i11;
                String str;
                if (abstractC24900c instanceof AbstractC24900c.b) {
                    this.f56420p.m58815b1(this.f56421q.m58732d());
                } else if (abstractC24900c instanceof AbstractC24900c.a) {
                    C11223a.m58817c1(this.f56420p, null, 1, null);
                    C1761c0 m58836A0 = this.f56420p.m58836A0();
                    Exception m129473a = ((AbstractC24900c.a) abstractC24900c).m129473a();
                    if (AbstractC19074t.m100204b(m129473a, ExceptionNoNetwork.f56345p)) {
                        i11 = AbstractC8020f0.str_call_no_internet;
                        str = "1";
                    } else if (AbstractC19074t.m100204b(m129473a, ExceptionRingtoneNotFound.f56347p)) {
                        i11 = AbstractC8020f0.str_call_ringtone_no_longer_exist;
                        str = "2";
                    } else {
                        i11 = AbstractC8020f0.str_call_ringtone_general_error;
                        str = "4";
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(i11);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    m58836A0.mo9221n(new C19964c(new o(m118743r0)));
                    C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", "3", str), false);
                } else if (abstractC24900c instanceof AbstractC24900c.c) {
                    this.f56420p.m58805W0(this.f56421q, (String) ((AbstractC24900c.c) abstractC24900c).m129474a());
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(RingtoneData ringtoneData, Continuation continuation) {
            super(2, continuation);
            this.f56419v = ringtoneData;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b0(this.f56419v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56417t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C11223a.this.m58828p0().m101509a(this.f56419v.m58732d());
                if (flow != null) {
                    a aVar = new a(C11223a.this, this.f56419v);
                    this.f56417t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements a {

        /* renamed from: a */
        public static final c f56422a = new c();

        private c() {
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$c0 */
    /* loaded from: classes5.dex */
    static final class c0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56423t;

        /* renamed from: u */
        private /* synthetic */ Object f56424u;

        /* renamed from: w */
        final /* synthetic */ C23573g f56426w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(C23573g c23573g, Continuation continuation) {
            super(2, continuation);
            this.f56426w = c23573g;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c0 c0Var = new c0(this.f56426w, continuation);
            c0Var.f56424u = obj;
            return c0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56423t;
            if (i11 != 0) {
                if (i11 == 1) {
                    coroutineScope = (CoroutineScope) this.f56424u;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f56424u;
                this.f56424u = coroutineScope2;
                this.f56423t = 1;
                if (DelayKt.m112666b(500L, this) == m142578e) {
                    return m142578e;
                }
                coroutineScope = coroutineScope2;
            }
            if (CoroutineScopeKt.m112642f(coroutineScope)) {
                C11223a.this.f56398J.setValue(this.f56426w);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$d */
    /* loaded from: classes5.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final List f56427a;

        public d(List list) {
            AbstractC19074t.m100208f(list, "list");
            this.f56427a = list;
        }

        /* renamed from: a */
        public final List m58855a() {
            return this.f56427a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$d0 */
    /* loaded from: classes5.dex */
    public static final class d0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56428t;

        /* renamed from: u */
        final /* synthetic */ RingtoneData f56429u;

        /* renamed from: v */
        final /* synthetic */ C11223a f56430v;

        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$d0$a */
        /* loaded from: classes5.dex */
        public static final class a implements C22096r.a {

            /* renamed from: a */
            final /* synthetic */ C11223a f56431a;

            /* renamed from: b */
            final /* synthetic */ RingtoneData f56432b;

            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$d0$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static final class C32747a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f56433t;

                /* renamed from: u */
                final /* synthetic */ C11223a f56434u;

                /* renamed from: v */
                final /* synthetic */ RingtoneData f56435v;

                /* renamed from: w */
                final /* synthetic */ Exception f56436w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32747a(C11223a c11223a, RingtoneData ringtoneData, Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.f56434u = c11223a;
                    this.f56435v = ringtoneData;
                    this.f56436w = exc;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32747a(this.f56434u, this.f56435v, this.f56436w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    int i11;
                    String str;
                    AbstractC28298d.m142578e();
                    if (this.f56433t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C11223a.m58813a1(this.f56434u, this.f56435v.m58732d(), false, 0, false, 4, null);
                        C1761c0 m58836A0 = this.f56434u.m58836A0();
                        Exception exc = this.f56436w;
                        if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f56345p)) {
                            i11 = AbstractC8020f0.str_call_no_internet;
                            str = "1";
                        } else {
                            if (AbstractC19074t.m100204b(exc, ExceptionInCall.f56343p)) {
                                i11 = AbstractC8020f0.str_sticky_player_conflict_call;
                            } else if (AbstractC19074t.m100204b(exc, ExceptionRingtoneNotFound.f56347p)) {
                                i11 = AbstractC8020f0.str_call_ringtone_no_longer_exist;
                                str = "2";
                            } else {
                                i11 = AbstractC8020f0.str_call_ringtone_general_error;
                            }
                            str = "4";
                        }
                        String m118743r0 = AbstractC23136l9.m118743r0(i11);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        m58836A0.mo9224q(new C19964c(new o(m118743r0)));
                        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", "4", str), false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32747a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$d0$a$b */
            /* loaded from: classes5.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f56437t;

                /* renamed from: u */
                final /* synthetic */ C11223a f56438u;

                /* renamed from: v */
                final /* synthetic */ RingtoneData f56439v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C11223a c11223a, RingtoneData ringtoneData, Continuation continuation) {
                    super(2, continuation);
                    this.f56438u = c11223a;
                    this.f56439v = ringtoneData;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f56438u, this.f56439v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f56437t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C11223a.m58813a1(this.f56438u, this.f56439v.m58732d(), false, 0, false, 4, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C11223a c11223a, RingtoneData ringtoneData) {
                this.f56431a = c11223a;
                this.f56432b = ringtoneData;
            }

            @Override // l50.C22096r.a
            /* renamed from: a */
            public void mo58857a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f56431a), Dispatchers.m112681c(), null, new C32747a(this.f56431a, this.f56432b, exc, null), 2, null);
            }

            @Override // l50.C22096r.a
            /* renamed from: b */
            public void mo58858b(String str) {
                C22096r.a.C32880a.m115298b(this, str);
            }

            @Override // l50.C22096r.a
            /* renamed from: c */
            public void mo58859c(C21477e c21477e, LyricRender lyricRender) {
                C22096r.a.C32880a.m115297a(this, c21477e, lyricRender);
            }

            @Override // l50.C22096r.a
            /* renamed from: d */
            public void mo58860d(C21477e c21477e, int i11) {
                AbstractC19074t.m100208f(c21477e, "ringtoneStreaming");
                this.f56431a.m58811Z0(this.f56432b.m58732d(), true, i11, false);
            }

            @Override // l50.C22096r.a
            /* renamed from: e */
            public void mo58861e(C21477e c21477e, int i11, int i12) {
                C22096r.a.C32880a.m115299c(this, c21477e, i11, i12);
            }

            @Override // l50.C22096r.a
            /* renamed from: f */
            public void mo58862f(C21477e c21477e) {
                AbstractC19074t.m100208f(c21477e, "ringtoneStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f56431a), Dispatchers.m112681c(), null, new b(this.f56431a, this.f56432b, null), 2, null);
            }

            @Override // l50.C22096r.a
            /* renamed from: g */
            public void mo58863g(C21477e c21477e) {
                AbstractC19074t.m100208f(c21477e, "ringtoneStreaming");
                this.f56431a.m58811Z0(this.f56432b.m58732d(), true, 0, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(RingtoneData ringtoneData, C11223a c11223a, Continuation continuation) {
            super(2, continuation);
            this.f56429u = ringtoneData;
            this.f56430v = c11223a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d0(this.f56429u, this.f56430v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56428t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C22096r c22096r = new C22096r();
                C22096r.b bVar = new C22096r.b(this.f56429u.m58732d(), false, false, false, 0, new a(this.f56430v, this.f56429u), 26, null);
                this.f56428t = 1;
                if (c22096r.m101507a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$e */
    /* loaded from: classes5.dex */
    public static final class e implements a {

        /* renamed from: a */
        public static final e f56440a = new e();

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$e0 */
    /* loaded from: classes5.dex */
    public static final class e0 extends AbstractC29096d {

        /* renamed from: s */
        Object f56441s;

        /* renamed from: t */
        /* synthetic */ Object f56442t;

        /* renamed from: v */
        int f56444v;

        e0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f56442t = obj;
            this.f56444v |= Integer.MIN_VALUE;
            return C11223a.this.m58803V0(null, this);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$f */
    /* loaded from: classes5.dex */
    public static final class f implements a {

        /* renamed from: a */
        public static final f f56445a = new f();

        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$f0 */
    /* loaded from: classes5.dex */
    public static final class f0 implements FlowCollector {
        f0() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
            Object obj;
            String str = "0";
            if (abstractC24900c instanceof AbstractC24900c.c) {
                C0815e1 m2075D = C0815e1.m2075D();
                String[] strArr = new String[1];
                AbstractC24900c.c cVar = (AbstractC24900c.c) abstractC24900c;
                if (true ^ ((C21476d) cVar.m129474a()).m111091b().isEmpty()) {
                    str = "1";
                }
                strArr[0] = str;
                m2075D.m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_search_result", strArr), false);
                C11223a.this.f56399K.setValue(cVar.m129474a());
                C11223a.this.m58836A0().mo9224q(new C19964c(m.f56465a));
            } else if (abstractC24900c instanceof AbstractC24900c.b) {
                C11223a.this.f56396H.setValue(b.f56416a);
                C11223a.this.f56397I.setValue(r.f56468a);
            } else if (abstractC24900c instanceof AbstractC24900c.a) {
                MutableStateFlow mutableStateFlow = C11223a.this.f56396H;
                if (AbstractC19074t.m100204b(((AbstractC24900c.a) abstractC24900c).m129473a(), ExceptionNoNetwork.f56345p)) {
                    C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", "1", "1"), false);
                    obj = f.f56445a;
                } else {
                    C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", "1", "3"), false);
                    C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_search_result", "0"), false);
                    obj = e.f56440a;
                }
                mutableStateFlow.setValue(obj);
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$g */
    /* loaded from: classes5.dex */
    public static final class g implements q {

        /* renamed from: a */
        private final List f56447a;

        /* renamed from: b */
        private final int f56448b;

        /* renamed from: c */
        private final int f56449c;

        public g(List list, int i11) {
            Object obj;
            Object m131206f0;
            int i12;
            AbstractC19074t.m100208f(list, "lstRingtoneCategory");
            this.f56447a = list;
            this.f56448b = i11;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C21473a) obj).m111074f() == this.f56448b) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f56447a);
                C21473a c21473a = (C21473a) m131206f0;
                if (c21473a != null) {
                    i12 = c21473a.m111074f();
                } else {
                    i12 = -1;
                }
            } else {
                i12 = this.f56448b;
            }
            this.f56449c = i12;
        }

        /* renamed from: a */
        public final int m58867a() {
            return this.f56449c;
        }

        /* renamed from: b */
        public final List m58868b() {
            return this.f56447a;
        }

        /* renamed from: c */
        public final C21473a m58869c() {
            Object obj;
            Object m131206f0;
            Iterator it = this.f56447a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C21473a) obj).m111074f() == this.f56449c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C21473a c21473a = (C21473a) obj;
            if (c21473a == null) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f56447a);
                return (C21473a) m131206f0;
            }
            return c21473a;
        }

        /* renamed from: d */
        public final g m58870d(C21473a c21473a) {
            int m131511r;
            AbstractC19074t.m100208f(c21473a, "ringtoneCategory");
            List<C21473a> list = this.f56447a;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            for (C21473a c21473a2 : list) {
                if (c21473a2.m111074f() == c21473a.m111074f()) {
                    c21473a2 = c21473a;
                }
                arrayList.add(c21473a2);
            }
            return new g(arrayList, this.f56449c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC19074t.m100204b(this.f56447a, gVar.f56447a) && this.f56448b == gVar.f56448b;
        }

        public int hashCode() {
            return (this.f56447a.hashCode() * 31) + this.f56448b;
        }

        public String toString() {
            return "CategoryControl(lstRingtoneCategory=" + this.f56447a + ", idSelectedParam=" + this.f56448b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$g0 */
    /* loaded from: classes5.dex */
    static final class g0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g0 f56450q = new g0();

        g0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22091m mo12V4() {
            return new C22091m();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$h */
    /* loaded from: classes5.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$h0 */
    /* loaded from: classes5.dex */
    public static final class h0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56451t;

        /* renamed from: u */
        final /* synthetic */ RingtoneData f56452u;

        /* renamed from: v */
        final /* synthetic */ String f56453v;

        /* renamed from: w */
        final /* synthetic */ C11223a f56454w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$h0$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ String f56455p;

            /* renamed from: q */
            final /* synthetic */ RingtoneData f56456q;

            /* renamed from: r */
            final /* synthetic */ C11223a f56457r;

            a(String str, RingtoneData ringtoneData, C11223a c11223a) {
                this.f56455p = str;
                this.f56456q = ringtoneData;
                this.f56457r = c11223a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                int i11;
                String str;
                RingtoneData m58730a;
                if (abstractC24900c instanceof AbstractC24900c.c) {
                    AbstractC0924m0.m3497Up(this.f56455p);
                    AbstractC0924m0.m3323Op(3);
                    AbstractC27323a.a aVar = AbstractC27323a.f128573d;
                    m58730a = r1.m58730a((r20 & 1) != 0 ? r1.f56350a : null, (r20 & 2) != 0 ? r1.f56351b : null, (r20 & 4) != 0 ? r1.f56352c : null, (r20 & 8) != 0 ? r1.f56353d : null, (r20 & 16) != 0 ? r1.f56354e : false, (r20 & 32) != 0 ? r1.f56355f : 0, (r20 & 64) != 0 ? r1.f56356g : false, (r20 & 128) != 0 ? r1.f56357h : false, (r20 & 256) != 0 ? this.f56456q.f56358i : false);
                    aVar.mo131586a();
                    AbstractC0924m0.m4326wn(aVar.mo131597b(RingtoneData.Companion.serializer(), m58730a));
                    this.f56457r.m58836A0().mo9221n(new C19964c(i.f56458b));
                    this.f56457r.m58849w0().mo9221n(new C19964c(AbstractC29094b.m145339a(true)));
                } else if (abstractC24900c instanceof AbstractC24900c.a) {
                    C11223a.m58817c1(this.f56457r, null, 1, null);
                    C1761c0 m58836A0 = this.f56457r.m58836A0();
                    if (AbstractC19074t.m100204b(((AbstractC24900c.a) abstractC24900c).m129473a(), ExceptionNoNetwork.f56345p)) {
                        i11 = AbstractC8020f0.str_call_no_internet;
                        str = "1";
                    } else {
                        i11 = AbstractC8020f0.str_call_ringtone_general_error;
                        str = "4";
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(i11);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    m58836A0.mo9221n(new C19964c(new o(m118743r0)));
                    C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", "3", str), false);
                } else {
                    boolean z11 = abstractC24900c instanceof AbstractC24900c.b;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(RingtoneData ringtoneData, String str, C11223a c11223a, Continuation continuation) {
            super(2, continuation);
            this.f56452u = ringtoneData;
            this.f56453v = str;
            this.f56454w = c11223a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h0(this.f56452u, this.f56453v, this.f56454w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56451t;
            int i12 = 1;
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
                C22093o c22093o = new C22093o(null, i12, 0 == true ? 1 : 0);
                C22093o.a aVar = new C22093o.a(3, this.f56452u.m58732d());
                this.f56451t = 1;
                obj = c22093o.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f56453v, this.f56452u, this.f56454w);
                this.f56451t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$i */
    /* loaded from: classes5.dex */
    public static final class i extends j {

        /* renamed from: b */
        public static final i f56458b = new i();

        private i() {
            super(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$i0 */
    /* loaded from: classes5.dex */
    static final class i0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i0 f56459q = new i0();

        i0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22095q mo12V4() {
            return new C22095q();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$j */
    /* loaded from: classes5.dex */
    public static abstract class j implements k {

        /* renamed from: a */
        private final boolean f56460a;

        public j(boolean z11) {
            this.f56460a = z11;
        }

        /* renamed from: a */
        public final boolean m58875a() {
            return this.f56460a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$j0 */
    /* loaded from: classes5.dex */
    public static final class j0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56461t;

        /* renamed from: v */
        final /* synthetic */ String f56463v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(String str, Continuation continuation) {
            super(2, continuation);
            this.f56463v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j0(this.f56463v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            RingtoneData m58730a;
            AbstractC28298d.m142578e();
            if (this.f56461t == 0) {
                AbstractC24862s.m129228b(obj);
                List list = (List) C11223a.this.m58850x0().mo9215f();
                if (list != null) {
                    C11223a c11223a = C11223a.this;
                    String str = this.f56463v;
                    C1761c0 m58850x0 = c11223a.m58850x0();
                    List<Object> list2 = list;
                    m131511r = AbstractC25370t.m131511r(list2, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    for (Object obj2 : list2) {
                        if (obj2 instanceof C23570d) {
                            C23570d c23570d = (C23570d) obj2;
                            m58730a = r6.m58730a((r20 & 1) != 0 ? r6.f56350a : null, (r20 & 2) != 0 ? r6.f56351b : null, (r20 & 4) != 0 ? r6.f56352c : null, (r20 & 8) != 0 ? r6.f56353d : null, (r20 & 16) != 0 ? r6.f56354e : false, (r20 & 32) != 0 ? r6.f56355f : 0, (r20 & 64) != 0 ? r6.f56356g : false, (r20 & 128) != 0 ? r6.f56357h : AbstractC19074t.m100204b(c23570d.m123635c().m58732d(), str), (r20 & 256) != 0 ? c23570d.m123635c().f56358i : false);
                            obj2 = c23570d.m123634b(m58730a);
                        }
                        arrayList.add(obj2);
                    }
                    m58850x0.mo9224q(arrayList);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$k */
    /* loaded from: classes5.dex */
    public interface k {
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$l */
    /* loaded from: classes5.dex */
    public static final class l implements k {

        /* renamed from: a */
        private final int f56464a;

        public l(int i11) {
            this.f56464a = i11;
        }

        /* renamed from: a */
        public final int m58877a() {
            return this.f56464a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$m */
    /* loaded from: classes5.dex */
    public static final class m implements k {

        /* renamed from: a */
        public static final m f56465a = new m();

        private m() {
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$n */
    /* loaded from: classes5.dex */
    public static final class n extends j {

        /* renamed from: b */
        public static final n f56466b = new n();

        private n() {
            super(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$o */
    /* loaded from: classes5.dex */
    public static final class o implements k {

        /* renamed from: a */
        private final String f56467a;

        public o(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f56467a = str;
        }

        /* renamed from: a */
        public final String m58878a() {
            return this.f56467a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$p */
    /* loaded from: classes5.dex */
    public static final class p implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C11223a();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$q */
    /* loaded from: classes5.dex */
    public interface q {
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$r */
    /* loaded from: classes5.dex */
    public static final class r implements q {

        /* renamed from: a */
        public static final r f56468a = new r();

        private r() {
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$s */
    /* loaded from: classes5.dex */
    static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final s f56469q = new s();

        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22082d mo12V4() {
            return new C22082d();
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$t */
    /* loaded from: classes5.dex */
    static final class t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final t f56470q = new t();

        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22083e mo12V4() {
            return new C22083e(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$u */
    /* loaded from: classes5.dex */
    static final class u extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final u f56471q = new u();

        u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22084f mo12V4() {
            return new C22084f(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$v */
    /* loaded from: classes5.dex */
    static final class v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final v f56472q = new v();

        v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22085g mo12V4() {
            return new C22085g(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$w */
    /* loaded from: classes5.dex */
    static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final w f56473q = new w();

        w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22086h mo12V4() {
            return new C22086h(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$x */
    /* loaded from: classes5.dex */
    public static final class x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56474t;

        /* renamed from: u */
        private /* synthetic */ Object f56475u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$x$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f56477t;

            /* renamed from: u */
            final /* synthetic */ C11223a f56478u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11223a c11223a, Continuation continuation) {
                super(2, continuation);
                this.f56478u = c11223a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f56478u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f56477t == 0) {
                    AbstractC24862s.m129228b(obj);
                    Integer num = (Integer) this.f56478u.m58829q0().m101509a(AbstractC29094b.m145339a(true));
                    if (num != null && num.intValue() == 3) {
                        C11223a c11223a = this.f56478u;
                        c11223a.f56412x = (RingtoneData) c11223a.m58832t0().m101506a();
                    }
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$x$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C11223a f56479p;

            b(C11223a c11223a) {
                this.f56479p = c11223a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                String str;
                if (abstractC24900c instanceof AbstractC24900c.c) {
                    this.f56479p.m58807X0(new g((List) ((AbstractC24900c.c) abstractC24900c).m129474a(), this.f56479p.f56409u));
                } else if (abstractC24900c instanceof AbstractC24900c.a) {
                    C0815e1 m2075D = C0815e1.m2075D();
                    String[] strArr = new String[2];
                    strArr[0] = "2";
                    if (((AbstractC24900c.a) abstractC24900c).m129473a() instanceof ExceptionNoNetwork) {
                        str = "1";
                    } else {
                        str = "4";
                    }
                    strArr[1] = str;
                    m2075D.m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_error", strArr), false);
                    this.f56479p.f56396H.setValue(c.f56422a);
                } else if (abstractC24900c instanceof AbstractC24900c.b) {
                    this.f56479p.f56396H.setValue(b.f56416a);
                    this.f56479p.f56397I.setValue(r.f56468a);
                }
                return C24848g0.f119245a;
            }
        }

        x(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            x xVar = new x(continuation);
            xVar.f56475u = obj;
            return xVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56474t;
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
                BuildersKt__Builders_commonKt.m112540d((CoroutineScope) this.f56475u, null, null, new a(C11223a.this, null), 3, null);
                C22084f m58830r0 = C11223a.this.m58830r0();
                this.f56474t = 1;
                obj = m58830r0.m101503a(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                b bVar = new b(C11223a.this);
                this.f56474t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((x) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y */
    /* loaded from: classes5.dex */
    public static final class y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56480t;

        /* renamed from: u */
        private /* synthetic */ Object f56481u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f56483t;

            /* renamed from: u */
            final /* synthetic */ C11223a f56484u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32748a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C11223a f56485p;

                C32748a(C11223a c11223a) {
                    this.f56485p = c11223a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(q qVar, Continuation continuation) {
                    if (qVar instanceof g) {
                        this.f56485p.m58797S0((g) qVar);
                    } else if (qVar instanceof r) {
                        this.f56485p.m58799T0();
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11223a c11223a, Continuation continuation) {
                super(2, continuation);
                this.f56484u = c11223a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f56484u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f56483t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f56484u.f56397I;
                    C32748a c32748a = new C32748a(this.f56484u);
                    this.f56483t = 1;
                    if (mutableStateFlow.mo97893a(c32748a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f56486t;

            /* renamed from: u */
            final /* synthetic */ C11223a f56487u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$b$a */
            /* loaded from: classes5.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C11223a f56488p;

                a(C11223a c11223a) {
                    this.f56488p = c11223a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(a aVar, Continuation continuation) {
                    if (aVar instanceof d) {
                        this.f56488p.m58801U0(((d) aVar).m58855a());
                    } else if (aVar instanceof b) {
                        new Exception().printStackTrace();
                        this.f56488p.m58827n0();
                    } else if (aVar instanceof c) {
                        this.f56488p.m58824k0();
                    } else if (aVar instanceof e) {
                        this.f56488p.m58825l0();
                    } else if (aVar instanceof f) {
                        this.f56488p.m58826m0();
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C11223a c11223a, Continuation continuation) {
                super(2, continuation);
                this.f56487u = c11223a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f56487u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f56486t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f56487u.f56396H;
                    a aVar = new a(this.f56487u);
                    this.f56486t = 1;
                    if (mutableStateFlow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f56489t;

            /* renamed from: u */
            final /* synthetic */ C11223a f56490u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$c$a */
            /* loaded from: classes5.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C11223a f56491p;

                a(C11223a c11223a) {
                    this.f56491p = c11223a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C21476d c21476d, Continuation continuation) {
                    Object dVar;
                    if (c21476d != null) {
                        MutableStateFlow mutableStateFlow = this.f56491p.f56396H;
                        if (c21476d.m111091b().isEmpty()) {
                            dVar = e.f56440a;
                        } else {
                            dVar = new d(c21476d.m111091b());
                        }
                        mutableStateFlow.setValue(dVar);
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C11223a c11223a, Continuation continuation) {
                super(2, continuation);
                this.f56490u = c11223a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f56490u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f56489t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f56490u.f56399K;
                    a aVar = new a(this.f56490u);
                    this.f56489t = 1;
                    if (mutableStateFlow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$d */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f56492t;

            /* renamed from: u */
            final /* synthetic */ C11223a f56493u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$y$d$a */
            /* loaded from: classes5.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C11223a f56494p;

                a(C11223a c11223a) {
                    this.f56494p = c11223a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C23573g c23573g, Continuation continuation) {
                    Object m142578e;
                    if (c23573g.m123676d() == 1) {
                        Object m58803V0 = this.f56494p.m58803V0(c23573g.m123675c(), continuation);
                        m142578e = AbstractC28298d.m142578e();
                        if (m58803V0 == m142578e) {
                            return m58803V0;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C11223a c11223a, Continuation continuation) {
                super(2, continuation);
                this.f56493u = c11223a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new d(this.f56493u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f56492t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f56493u.f56398J;
                    a aVar = new a(this.f56493u);
                    this.f56492t = 1;
                    if (mutableStateFlow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        y(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            y yVar = new y(continuation);
            yVar.f56481u = obj;
            return yVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f56480t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f56481u;
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new a(C11223a.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new b(C11223a.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new c(C11223a.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new d(C11223a.this, null), 3, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$z */
    /* loaded from: classes5.dex */
    public static final class z extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56495t;

        /* renamed from: v */
        final /* synthetic */ C21473a f56497v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonelist.a$z$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C11223a f56498p;

            a(C11223a c11223a) {
                this.f56498p = c11223a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                g gVar;
                if (abstractC24900c instanceof AbstractC24900c.c) {
                    Object value = this.f56498p.f56397I.getValue();
                    if (value instanceof g) {
                        gVar = (g) value;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        this.f56498p.m58807X0(gVar.m58870d((C21473a) ((AbstractC24900c.c) abstractC24900c).m129474a()));
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(C21473a c21473a, Continuation continuation) {
            super(2, continuation);
            this.f56497v = c21473a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new z(this.f56497v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56495t;
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
                C22088j m58833u0 = C11223a.this.m58833u0();
                C22088j.a aVar = new C22088j.a(this.f56497v);
                this.f56495t = 1;
                obj = m58833u0.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C11223a.this);
                this.f56495t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((z) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C11223a() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        m129210a = AbstractC24856m.m129210a(t.f56470q);
        this.f56414z = m129210a;
        m129210a2 = AbstractC24856m.m129210a(w.f56473q);
        this.f56389A = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(u.f56471q);
        this.f56390B = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(a0.f56415q);
        this.f56391C = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(v.f56472q);
        this.f56392D = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(g0.f56450q);
        this.f56393E = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(s.f56469q);
        this.f56394F = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(i0.f56459q);
        this.f56395G = m129210a8;
        this.f56396H = StateFlowKt.m113503a(b.f56416a);
        this.f56397I = StateFlowKt.m113503a(r.f56468a);
        this.f56398J = StateFlowKt.m113503a(new C23573g("", 1));
        this.f56399K = StateFlowKt.m113503a(null);
        this.f56400L = new C1761c0();
        this.f56401M = new C1761c0();
        this.f56402N = new C1761c0();
        this.f56403O = new C1761c0();
        this.f56404P = new C1761c0();
        this.f56405Q = new C1761c0();
        this.f56406R = "";
        m58785C0();
    }

    /* renamed from: B0 */
    private final void m58784B0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new x(null), 3, null);
    }

    /* renamed from: C0 */
    private final void m58785C0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new y(null), 3, null);
    }

    /* renamed from: D0 */
    private final boolean m58786D0(String str) {
        if (str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    private final void m58787E0(C21473a c21473a) {
        if (c21473a.m111073e()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new z(c21473a, null), 3, null);
        }
    }

    /* renamed from: G0 */
    private final void m58788G0(RingtoneData ringtoneData) {
        if (ringtoneData.m58737i()) {
            m58809Y0();
        } else {
            m58795R0(ringtoneData);
        }
    }

    /* renamed from: R0 */
    private final void m58795R0(RingtoneData ringtoneData) {
        RingtoneData m58730a;
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 0, "call_play_ringtone", "2"), false);
        this.f56411w = ringtoneData;
        C1761c0 c1761c0 = this.f56402N;
        m58730a = ringtoneData.m58730a((r20 & 1) != 0 ? ringtoneData.f56350a : null, (r20 & 2) != 0 ? ringtoneData.f56351b : null, (r20 & 4) != 0 ? ringtoneData.f56352c : null, (r20 & 8) != 0 ? ringtoneData.f56353d : null, (r20 & 16) != 0 ? ringtoneData.f56354e : false, (r20 & 32) != 0 ? ringtoneData.f56355f : 0, (r20 & 64) != 0 ? ringtoneData.f56356g : true, (r20 & 128) != 0 ? ringtoneData.f56357h : false, (r20 & 256) != 0 ? ringtoneData.f56358i : false);
        c1761c0.mo9224q(new C23570d(m58730a));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d0(ringtoneData, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m58797S0(g gVar) {
        int m131511r;
        boolean z11;
        C1761c0 c1761c0 = this.f56401M;
        List<C21473a> m58868b = gVar.m58868b();
        m131511r = AbstractC25370t.m131511r(m58868b, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (C21473a c21473a : m58868b) {
            String m111075g = c21473a.m111075g();
            String m111078j = c21473a.m111078j();
            if (gVar.m58867a() == c21473a.m111074f()) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new C23569c(new C21474b(c21473a, m111075g, m111078j, z11)));
        }
        c1761c0.mo9224q(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public final void m58799T0() {
        List m131502j;
        C1761c0 c1761c0 = this.f56401M;
        m131502j = AbstractC25368s.m131502j();
        c1761c0.mo9224q(m131502j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final void m58801U0(List list) {
        int m131511r;
        String str;
        C1761c0 c1761c0 = this.f56400L;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            RingtoneData m132549a = AbstractC25664a.m132549a((C21475c) it.next());
            String m58732d = m132549a.m58732d();
            RingtoneData ringtoneData = this.f56412x;
            if (ringtoneData != null) {
                str = ringtoneData.m58732d();
            } else {
                str = null;
            }
            m132549a.m58740l(AbstractC19074t.m100204b(m58732d, str));
            arrayList.add(new C23570d(m132549a));
        }
        c1761c0.mo9221n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58803V0(String str, Continuation continuation) {
        e0 e0Var;
        Object m142578e;
        int i11;
        C11223a c11223a;
        Flow flow;
        if (continuation instanceof e0) {
            e0Var = (e0) continuation;
            int i12 = e0Var.f56444v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                e0Var.f56444v = i12 - Integer.MIN_VALUE;
                Object obj = e0Var.f56442t;
                m142578e = AbstractC28298d.m142578e();
                i11 = e0Var.f56444v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11223a = (C11223a) e0Var.f56441s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (m58786D0(str)) {
                        m58784B0();
                        return C24848g0.f119245a;
                    }
                    C22091m m58834y0 = m58834y0();
                    C22091m.b bVar = new C22091m.b(str, false);
                    e0Var.f56441s = this;
                    e0Var.f56444v = 1;
                    obj = m58834y0.m101498a(bVar, e0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c11223a = this;
                }
                flow = (Flow) obj;
                if (flow != null) {
                    f0 f0Var = new f0();
                    e0Var.f56441s = null;
                    e0Var.f56444v = 2;
                    if (flow.mo97893a(f0Var, e0Var) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        e0Var = new e0(continuation);
        Object obj2 = e0Var.f56442t;
        m142578e = AbstractC28298d.m142578e();
        i11 = e0Var.f56444v;
        if (i11 == 0) {
        }
        flow = (Flow) obj2;
        if (flow != null) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public final Job m58805W0(RingtoneData ringtoneData, String str) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h0(ringtoneData, str, this, null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final void m58807X0(g gVar) {
        C21475c c21475c;
        this.f56409u = gVar.m58867a();
        this.f56397I.setValue(gVar);
        C21473a m58869c = gVar.m58869c();
        if (m58869c != null) {
            MutableStateFlow mutableStateFlow = this.f56396H;
            List m111077i = m58869c.m111077i();
            ArrayList arrayList = new ArrayList();
            Iterator it = m111077i.iterator();
            while (it.hasNext()) {
                C22085g.a aVar = (C22085g.a) m58831s0().m101509a((String) it.next());
                if (aVar != null) {
                    c21475c = aVar.m115231a();
                } else {
                    c21475c = null;
                }
                if (c21475c != null) {
                    arrayList.add(c21475c);
                }
            }
            mutableStateFlow.setValue(new d(arrayList));
        }
        C1761c0 c1761c0 = this.f56404P;
        Iterator it2 = gVar.m58868b().iterator();
        int i11 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((C21473a) it2.next()).m111074f() == gVar.m58867a()) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        c1761c0.mo9224q(new C19964c(new l(i11)));
    }

    /* renamed from: Y0 */
    private final void m58809Y0() {
        m58835z0().m101504a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public final void m58811Z0(String str, boolean z11, int i11, boolean z12) {
        String str2;
        Object obj;
        RingtoneData m58730a;
        Object obj2;
        RingtoneData m123635c;
        RingtoneData m58730a2;
        RingtoneData m123635c2;
        C23570d c23570d = (C23570d) this.f56402N.mo9215f();
        C23570d c23570d2 = null;
        if (c23570d != null && (m123635c2 = c23570d.m123635c()) != null) {
            str2 = m123635c2.m58732d();
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str2, str)) {
            C23570d c23570d3 = (C23570d) this.f56402N.mo9215f();
            if (c23570d3 != null && (m123635c = c23570d3.m123635c()) != null) {
                C1761c0 c1761c0 = this.f56402N;
                m58730a2 = m123635c.m58730a((r20 & 1) != 0 ? m123635c.f56350a : null, (r20 & 2) != 0 ? m123635c.f56351b : null, (r20 & 4) != 0 ? m123635c.f56352c : null, (r20 & 8) != 0 ? m123635c.f56353d : null, (r20 & 16) != 0 ? m123635c.f56354e : z11, (r20 & 32) != 0 ? m123635c.f56355f : i11, (r20 & 64) != 0 ? m123635c.f56356g : z12, (r20 & 128) != 0 ? m123635c.f56357h : false, (r20 & 256) != 0 ? m123635c.f56358i : false);
                c1761c0.mo9224q(new C23570d(m58730a2));
                return;
            }
            return;
        }
        List list = (List) this.f56400L.mo9215f();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    AbstractC23574h abstractC23574h = (AbstractC23574h) obj2;
                    if ((abstractC23574h instanceof C23570d) && AbstractC19074t.m100204b(str, ((C23570d) abstractC23574h).m123635c().m58732d())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            obj = (AbstractC23574h) obj2;
        } else {
            obj = null;
        }
        if (obj instanceof C23570d) {
            c23570d2 = (C23570d) obj;
        }
        if (c23570d2 != null) {
            C1761c0 c1761c02 = this.f56402N;
            m58730a = r4.m58730a((r20 & 1) != 0 ? r4.f56350a : null, (r20 & 2) != 0 ? r4.f56351b : null, (r20 & 4) != 0 ? r4.f56352c : null, (r20 & 8) != 0 ? r4.f56353d : null, (r20 & 16) != 0 ? r4.f56354e : z11, (r20 & 32) != 0 ? r4.f56355f : i11, (r20 & 64) != 0 ? r4.f56356g : z12, (r20 & 128) != 0 ? r4.f56357h : false, (r20 & 256) != 0 ? c23570d2.m123635c().f56358i : false);
            c1761c02.mo9224q(new C23570d(m58730a));
        }
    }

    /* renamed from: a1 */
    static /* synthetic */ void m58813a1(C11223a c11223a, String str, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        c11223a.m58811Z0(str, z11, i11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public final Job m58815b1(String str) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new j0(str, null), 2, null);
        return m112540d;
    }

    /* renamed from: c1 */
    static /* synthetic */ Job m58817c1(C11223a c11223a, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return c11223a.m58815b1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m58824k0() {
        List m131496e;
        C1761c0 c1761c0 = this.f56400L;
        C23571e c23571e = new C23571e(false, 1, null);
        c23571e.m123641F(1);
        c23571e.m123640E(true);
        c23571e.m123670y(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c23571e.m123643H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        c23571e.m123671z(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        c23571e.m123636A(AbstractC16803z.im_connect);
        c23571e.m123644I(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c23571e.m123638C(0);
        c23571e.m123637B(AbstractC23136l9.m118742r(0.0f));
        c23571e.m123639D(AbstractC23136l9.m118742r(0.0f));
        c23571e.m123642G(1);
        m131496e = AbstractC25366r.m131496e(new C23572f(c23571e));
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m58825l0() {
        List m131496e;
        C1761c0 c1761c0 = this.f56400L;
        C23571e c23571e = new C23571e(false, 1, null);
        c23571e.m123640E(true);
        c23571e.m123670y(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c23571e.m123671z(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_search_no_result));
        c23571e.m123636A(AbstractC16803z.ic_empty_no_music);
        c23571e.m123638C(0);
        c23571e.m123637B(AbstractC23136l9.m118742r(0.0f));
        c23571e.m123639D(AbstractC23136l9.m118742r(0.0f));
        m131496e = AbstractC25366r.m131496e(new C23572f(c23571e));
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m58826m0() {
        List m131496e;
        C1761c0 c1761c0 = this.f56400L;
        C23571e c23571e = new C23571e(false, 1, null);
        c23571e.m123640E(true);
        c23571e.m123670y(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c23571e.m123671z(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        c23571e.m123636A(AbstractC16803z.ic_empty_no_music);
        c23571e.m123638C(0);
        c23571e.m123637B(AbstractC23136l9.m118742r(0.0f));
        c23571e.m123639D(AbstractC23136l9.m118742r(0.0f));
        c23571e.m123644I(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c23571e.m123642G(1);
        c23571e.m123645J(1);
        m131496e = AbstractC25366r.m131496e(new C23572f(c23571e));
        c1761c0.mo9221n(m131496e);
        MutableStateFlow mutableStateFlow = this.f56398J;
        mutableStateFlow.setValue(C23573g.m123673b((C23573g) mutableStateFlow.getValue(), null, 2, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m58827n0() {
        List m131496e;
        C1761c0 c1761c0 = this.f56400L;
        m131496e = AbstractC25366r.m131496e(C23575i.f114397b);
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public final C22082d m58828p0() {
        return (C22082d) this.f56394F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final C22083e m58829q0() {
        return (C22083e) this.f56414z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final C22084f m58830r0() {
        return (C22084f) this.f56390B.getValue();
    }

    /* renamed from: s0 */
    private final C22085g m58831s0() {
        return (C22085g) this.f56392D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public final C22086h m58832t0() {
        return (C22086h) this.f56389A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public final C22088j m58833u0() {
        return (C22088j) this.f56391C.getValue();
    }

    /* renamed from: y0 */
    private final C22091m m58834y0() {
        return (C22091m) this.f56393E.getValue();
    }

    /* renamed from: z0 */
    private final C22095q m58835z0() {
        return (C22095q) this.f56395G.getValue();
    }

    /* renamed from: A0 */
    public final C1761c0 m58836A0() {
        return this.f56404P;
    }

    /* renamed from: F0 */
    public final void m58837F0(C21474b c21474b) {
        AbstractC19074t.m100208f(c21474b, "categoryData");
        q qVar = (q) this.f56397I.getValue();
        if (qVar instanceof g) {
            m58807X0(new g(((g) qVar).m58868b(), c21474b.m111080b().m111074f()));
            this.f56404P.mo9224q(new C19964c(m.f56465a));
        }
    }

    /* renamed from: I0 */
    public final void m58838I0(RingtoneData ringtoneData) {
        boolean m127128x;
        String valueOf;
        Job m112540d;
        Job job;
        AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
        if (!ringtoneData.m58738j() && !ringtoneData.m58739k()) {
            C0815e1 m2075D = C0815e1.m2075D();
            String[] strArr = new String[3];
            strArr[0] = ringtoneData.m58732d();
            strArr[1] = ringtoneData.m58733e();
            m127128x = AbstractC24341v.m127128x(this.f56406R);
            if (!m127128x) {
                valueOf = "0";
            } else {
                valueOf = String.valueOf(this.f56409u);
            }
            strArr[2] = valueOf;
            m2075D.m2100V(new C23648e(28, "setting_call_ringtone", 0, "call_setting_ringtone_selected_zing", strArr), false);
            Job job2 = this.f56413y;
            if (job2 != null && job2.mo112496c() && (job = this.f56413y) != null) {
                Job.DefaultImpls.m112740a(job, null, 1, null);
            }
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b0(ringtoneData, null), 2, null);
            this.f56413y = m112540d;
        }
    }

    /* renamed from: J0 */
    public final void m58839J0() {
        Job job;
        Job job2 = this.f56413y;
        if (job2 != null && job2.mo112496c() && (job = this.f56413y) != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m58809Y0();
    }

    /* renamed from: K0 */
    public final void m58840K0(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "keyword");
        this.f56404P.mo9224q(new C19964c(n.f56466b));
        this.f56406R = str;
        C23573g c23573g = new C23573g(str, 1);
        Job job = this.f56410v;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        if (!m58786D0(str)) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c0(c23573g, null), 3, null);
            this.f56410v = m112540d;
        } else {
            this.f56398J.setValue(c23573g);
        }
    }

    /* renamed from: L0 */
    public final void m58841L0() {
        m58784B0();
    }

    /* renamed from: M0 */
    public final void m58842M0() {
        this.f56404P.mo9224q(new C19964c(i.f56458b));
    }

    /* renamed from: N0 */
    public final void m58843N0(int i11, int i12) {
        boolean m127128x;
        String valueOf;
        g gVar;
        C21473a m58869c;
        if (i11 >= i12 - 5) {
            Object value = this.f56397I.getValue();
            if (value instanceof g) {
                gVar = (g) value;
            } else {
                gVar = null;
            }
            if (gVar != null && (m58869c = gVar.m58869c()) != null) {
                m58787E0(m58869c);
            }
        }
        if (this.f56408t) {
            this.f56408t = false;
            C0815e1 m2075D = C0815e1.m2075D();
            String[] strArr = new String[1];
            m127128x = AbstractC24341v.m127128x(this.f56406R);
            if (true ^ m127128x) {
                valueOf = "0";
            } else {
                valueOf = String.valueOf(this.f56409u);
            }
            strArr[0] = valueOf;
            m2075D.m2100V(new C23648e(28, "setting_call_ringtone", 1, "call_ringtone_scroll", strArr), false);
        }
    }

    /* renamed from: O0 */
    public final void m58844O0() {
        if (this.f56407s) {
            this.f56407s = false;
        }
    }

    /* renamed from: P0 */
    public final void m58845P0() {
        this.f56408t = true;
    }

    /* renamed from: Q0 */
    public final void m58846Q0() {
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 0, "call_ringtone_click_search", new String[0]), false);
    }

    @Override // n50.InterfaceC23568b
    /* renamed from: i5 */
    public void mo58771i5(InterfaceC23567a interfaceC23567a) {
        AbstractC19074t.m100208f(interfaceC23567a, "event");
        if (interfaceC23567a instanceof RingtoneData.C11204a) {
            m58838I0(((RingtoneData.C11204a) interfaceC23567a).m58741a());
            return;
        }
        if (interfaceC23567a instanceof RingtoneData.C11206c) {
            m58838I0(((RingtoneData.C11206c) interfaceC23567a).m58743a());
        } else if (interfaceC23567a instanceof RingtoneData.C11205b) {
            m58788G0(((RingtoneData.C11205b) interfaceC23567a).m58742a());
        } else if (interfaceC23567a instanceof C21474b.a) {
            m58837F0(((C21474b.a) interfaceC23567a).m111083a());
        }
    }

    /* renamed from: o0 */
    public final C1761c0 m58847o0() {
        return this.f56401M;
    }

    public final void onPause() {
        m58809Y0();
    }

    /* renamed from: v0 */
    public final C1761c0 m58848v0() {
        return this.f56402N;
    }

    /* renamed from: w0 */
    public final C1761c0 m58849w0() {
        return this.f56403O;
    }

    /* renamed from: x0 */
    public final C1761c0 m58850x0() {
        return this.f56400L;
    }
}
