package com.zing.zalo.calls.ringbacktone.presentation;

import ag0.C0815e1;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import bp0.AbstractC3082b0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackToneNoNetwork;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackToneNotVipUser;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionInCall;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.C21228a;
import je.C21229b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me0.AbstractC23136l9;
import ne.AbstractC23730a;
import p205hc.C19964c;
import p207he.C20024r;
import p321le.C22450a;
import p321le.C22456g;
import p321le.C22457h;
import p321le.C22458i;
import p361nb.C23648e;
import p389oe.AbstractC24241h;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d */
/* loaded from: classes3.dex */
public final class C7459d extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C22450a f40426s;

    /* renamed from: t */
    private final C22458i f40427t;

    /* renamed from: u */
    private final C22457h f40428u;

    /* renamed from: v */
    private final C22456g f40429v;

    /* renamed from: w */
    private MutableStateFlow f40430w;

    /* renamed from: x */
    private C1761c0 f40431x;

    /* renamed from: y */
    private C1761c0 f40432y;

    /* renamed from: z */
    private C1761c0 f40433z;

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f40434a;

        /* renamed from: b */
        private final Object f40435b;

        /* renamed from: c */
        private final Object f40436c;

        public b(String str, Object obj, Object obj2) {
            AbstractC19074t.m100208f(str, "event");
            this.f40434a = str;
            this.f40435b = obj;
            this.f40436c = obj2;
        }

        /* renamed from: a */
        public final Object m37773a() {
            return this.f40435b;
        }

        /* renamed from: b */
        public final String m37774b() {
            return this.f40434a;
        }

        /* renamed from: c */
        public final Object m37775c() {
            return this.f40436c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f40434a, bVar.f40434a) && AbstractC19074t.m100204b(this.f40435b, bVar.f40435b) && AbstractC19074t.m100204b(this.f40436c, bVar.f40436c);
        }

        public int hashCode() {
            int hashCode = this.f40434a.hashCode() * 31;
            Object obj = this.f40435b;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f40436c;
            return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            return "EventData(event=" + this.f40434a + ", data=" + this.f40435b + ", subData=" + this.f40436c + ")";
        }

        public /* synthetic */ b(String str, Object obj, Object obj2, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : obj2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: p */
        public static final c f40437p = new c("VALID", 0);

        /* renamed from: q */
        public static final c f40438q = new c("VALID_UNTIL", 1);

        /* renamed from: r */
        public static final c f40439r = new c("SUSPENDED_DUE_TO_UPDATING", 2);

        /* renamed from: s */
        public static final c f40440s = new c("SUSPENDED", 3);

        /* renamed from: t */
        private static final /* synthetic */ c[] f40441t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f40442u;

        static {
            c[] m37776b = m37776b();
            f40441t = m37776b;
            f40442u = AbstractC30166b.m148796a(m37776b);
        }

        private c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m37776b() {
            return new c[]{f40437p, f40438q, f40439r, f40440s};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f40441t.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40443t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C7459d f40445p;

            a(C7459d c7459d) {
                this.f40445p = c7459d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                int m131511r;
                List m131496e;
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    List list = (List) this.f40445p.f40431x.mo9215f();
                    Object obj = null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((AbstractC24241h) next) instanceof AbstractC24241h.c) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (AbstractC24241h) obj;
                    }
                    if (obj == null) {
                        C1761c0 c1761c0 = this.f40445p.f40431x;
                        m131496e = AbstractC25366r.m131496e(AbstractC24241h.d.f117087b);
                        c1761c0.mo9221n(m131496e);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f40445p.m37750i0(((AbstractC25468a.a) abstractC25468a).m131934a());
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    AbstractC25468a.c cVar = (AbstractC25468a.c) abstractC25468a;
                    c m37749b0 = this.f40445p.m37749b0(((C21229b) cVar.m131935a()).m110017d(), ((C21229b) cVar.m131935a()).m110014a());
                    this.f40445p.f40430w.setValue(new b("UPDATE_STATE_RBT", m37749b0, AbstractC29094b.m145342d(((C21229b) cVar.m131935a()).m110014a())));
                    C1761c0 c1761c02 = this.f40445p.f40431x;
                    ArrayList m110016c = ((C21229b) cVar.m131935a()).m110016c();
                    m131511r = AbstractC25370t.m131511r(m110016c, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    Iterator it2 = m110016c.iterator();
                    while (true) {
                        boolean z11 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        C21228a c21228a = (C21228a) it2.next();
                        if (m37749b0 != c.f40437p && m37749b0 != c.f40438q) {
                            z11 = false;
                        }
                        arrayList.add(AbstractC23730a.m124076b(c21228a, z11));
                    }
                    c1761c02.mo9221n(arrayList);
                    this.f40445p.f40432y.mo9221n(new C19964c(new b("LIST_RBT_SCROLL_TO_ITEM", AbstractC29094b.m145341c(((C21229b) cVar.m131935a()).m110015b()), null, 4, null)));
                    C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 1, "call_rbt_list", "0", String.valueOf(((C21229b) cVar.m131935a()).m110016c().size() - 1)), false);
                }
                return C24848g0.f119245a;
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
            int i11 = this.f40443t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C7459d.this.f40426s.m101506a();
                if (flow != null) {
                    a aVar = new a(C7459d.this);
                    this.f40443t = 1;
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
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40446t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f40446t == 0) {
                AbstractC24862s.m129228b(obj);
                C7459d.this.f40432y.mo9224q(new C19964c(new b("open_zing_mp3", null, null, 6, null)));
                C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_open_zalo_melody", new String[0]), false);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40448t;

        /* renamed from: v */
        final /* synthetic */ AbstractC24241h.c f40450v;

        /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$f$a */
        /* loaded from: classes3.dex */
        public static final class a implements C22458i.a {

            /* renamed from: a */
            final /* synthetic */ C7459d f40451a;

            a(C7459d c7459d) {
                this.f40451a = c7459d;
            }

            @Override // p321le.C22458i.a
            /* renamed from: a */
            public void mo37781a(String str, int i11) {
                AbstractC19074t.m100208f(str, "id");
                C7459d.m37733B0(this.f40451a, str, Boolean.TRUE, Integer.valueOf(i11), Boolean.FALSE, null, null, 48, null);
            }

            @Override // p321le.C22458i.a
            /* renamed from: b */
            public void mo37782b(String str) {
                C22458i.a.C32886a.m116110a(this, str);
            }

            @Override // p321le.C22458i.a
            /* renamed from: c */
            public void mo37783c(String str, int i11, int i12) {
                C22458i.a.C32886a.m116111b(this, str, i11, i12);
            }

            @Override // p321le.C22458i.a
            /* renamed from: d */
            public void mo37784d(String str) {
                AbstractC19074t.m100208f(str, "id");
                C7459d.m37733B0(this.f40451a, str, Boolean.TRUE, 0, Boolean.FALSE, null, null, 48, null);
                this.f40451a.m37753l0("1");
            }

            @Override // p321le.C22458i.a
            /* renamed from: e */
            public void mo37785e(String str, Exception exc) {
                AbstractC19074t.m100208f(str, "id");
                AbstractC19074t.m100208f(exc, "exception");
                AbstractC3082b0.m15424f("SettingRBTViewModel", "onPlayError id " + str + " with ex " + exc);
                C7459d c7459d = this.f40451a;
                Boolean bool = Boolean.FALSE;
                C7459d.m37733B0(c7459d, str, bool, 0, bool, null, null, 48, null);
                this.f40451a.m37751j0(exc);
            }

            @Override // p321le.C22458i.a
            /* renamed from: f */
            public void mo37786f(String str) {
                AbstractC19074t.m100208f(str, "id");
                C7459d c7459d = this.f40451a;
                Boolean bool = Boolean.FALSE;
                C7459d.m37733B0(c7459d, str, bool, 0, bool, null, null, 48, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC24241h.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f40450v = cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f40450v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f40448t == 0) {
                AbstractC24862s.m129228b(obj);
                C7459d.m37733B0(C7459d.this, this.f40450v.m126548e(), AbstractC29094b.m145339a(false), AbstractC29094b.m145341c(0), AbstractC29094b.m145339a(true), null, null, 48, null);
                C7459d.this.f40427t.m101508a(new C22458i.b(this.f40450v.m126548e(), this.f40450v.m126551h(), new a(C7459d.this)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40452t;

        /* renamed from: v */
        final /* synthetic */ String f40454v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation continuation) {
            super(2, continuation);
            this.f40454v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f40454v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            AbstractC28298d.m142578e();
            if (this.f40452t == 0) {
                AbstractC24862s.m129228b(obj);
                List list = (List) C7459d.this.f40431x.mo9215f();
                if (list != null) {
                    C7459d c7459d = C7459d.this;
                    String str = this.f40454v;
                    C1761c0 c1761c0 = c7459d.f40431x;
                    List<Object> list2 = list;
                    m131511r = AbstractC25370t.m131511r(list2, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    for (Object obj2 : list2) {
                        if (obj2 instanceof AbstractC24241h.c) {
                            AbstractC24241h.c cVar = (AbstractC24241h.c) obj2;
                            obj2 = cVar.m126546b((r24 & 1) != 0 ? cVar.f117076b : null, (r24 & 2) != 0 ? cVar.f117077c : null, (r24 & 4) != 0 ? cVar.f117078d : null, (r24 & 8) != 0 ? cVar.f117079e : null, (r24 & 16) != 0 ? cVar.f117080f : null, (r24 & 32) != 0 ? cVar.f117081g : false, (r24 & 64) != 0 ? cVar.f117082h : false, (r24 & 128) != 0 ? cVar.f117083i : 0, (r24 & 256) != 0 ? cVar.f117084j : AbstractC19074t.m100204b(cVar.m126548e(), str), (r24 & 512) != 0 ? cVar.f117085k : false, (r24 & 1024) != 0 ? cVar.f117086l : false);
                        }
                        arrayList.add(obj2);
                    }
                    c1761c0.mo9224q(arrayList);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40455t;

        /* renamed from: u */
        final /* synthetic */ AbstractC24241h.c f40456u;

        /* renamed from: v */
        final /* synthetic */ C7459d f40457v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$h$a */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C7459d f40458p;

            /* renamed from: q */
            final /* synthetic */ AbstractC24241h.c f40459q;

            a(C7459d c7459d, AbstractC24241h.c cVar) {
                this.f40458p = c7459d;
                this.f40459q = cVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    C7459d.m37733B0(this.f40458p, this.f40459q.m126548e(), null, null, null, AbstractC29094b.m145339a(true), AbstractC29094b.m145339a(false), 14, null);
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f40458p.m37754m0("0");
                    this.f40458p.m37756v0(this.f40459q.m126548e());
                    C7459d c7459d = this.f40458p;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_rbt_changed);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    c7459d.m37757x0(m118743r0);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    C7459d.m37733B0(this.f40458p, this.f40459q.m126548e(), null, null, null, AbstractC29094b.m145339a(false), null, 46, null);
                    this.f40458p.m37752k0(((AbstractC25468a.a) abstractC25468a).m131934a());
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AbstractC24241h.c cVar, C7459d c7459d, Continuation continuation) {
            super(2, continuation);
            this.f40456u = cVar;
            this.f40457v = c7459d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f40456u, this.f40457v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f40455t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (!this.f40456u.m126557n()) {
                    this.f40457v.m37758y0();
                    this.f40457v.m37772z0();
                    Flow flow = (Flow) this.f40457v.f40429v.m101509a(new C22456g.b(AbstractC23730a.m124075a(this.f40456u), 1));
                    if (flow != null) {
                        a aVar = new a(this.f40457v, this.f40456u);
                        this.f40455t = 1;
                        if (flow.mo97893a(aVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                } else {
                    return C24848g0.f119245a;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f40460t;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f40460t == 0) {
                AbstractC24862s.m129228b(obj);
                C7459d.this.f40432y.mo9224q(new C19964c(new b("stop_default_zalo_ring_back", null, null, 6, null)));
                C7459d.m37733B0(C7459d.this, "0", AbstractC29094b.m145339a(false), null, null, null, null, 60, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.calls.ringbacktone.presentation.d$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ Boolean f40462A;

        /* renamed from: t */
        int f40463t;

        /* renamed from: v */
        final /* synthetic */ String f40465v;

        /* renamed from: w */
        final /* synthetic */ Integer f40466w;

        /* renamed from: x */
        final /* synthetic */ Boolean f40467x;

        /* renamed from: y */
        final /* synthetic */ Boolean f40468y;

        /* renamed from: z */
        final /* synthetic */ Boolean f40469z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Continuation continuation) {
            super(2, continuation);
            this.f40465v = str;
            this.f40466w = num;
            this.f40467x = bool;
            this.f40468y = bool2;
            this.f40469z = bool3;
            this.f40462A = bool4;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f40465v, this.f40466w, this.f40467x, this.f40468y, this.f40469z, this.f40462A, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v4, types: [oe.h] */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v6, types: [oe.h$c] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            AbstractC28298d.m142578e();
            if (this.f40463t == 0) {
                AbstractC24862s.m129228b(obj);
                List list = (List) C7459d.this.f40431x.mo9215f();
                if (list != null) {
                    C7459d c7459d = C7459d.this;
                    String str = this.f40465v;
                    Integer num = this.f40466w;
                    Boolean bool = this.f40467x;
                    Boolean bool2 = this.f40468y;
                    Boolean bool3 = this.f40469z;
                    Boolean bool4 = this.f40462A;
                    C1761c0 c1761c0 = c7459d.f40431x;
                    List<??> list2 = list;
                    m131511r = AbstractC25370t.m131511r(list2, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    for (?? r102 : list2) {
                        if (r102 instanceof AbstractC24241h.c) {
                            AbstractC24241h.c cVar = (AbstractC24241h.c) r102;
                            if (AbstractC19074t.m100204b(cVar.m126548e(), str)) {
                                r102 = cVar.m126546b((r24 & 1) != 0 ? cVar.f117076b : null, (r24 & 2) != 0 ? cVar.f117077c : null, (r24 & 4) != 0 ? cVar.f117078d : null, (r24 & 8) != 0 ? cVar.f117079e : null, (r24 & 16) != 0 ? cVar.f117080f : null, (r24 & 32) != 0 ? cVar.f117081g : false, (r24 & 64) != 0 ? cVar.f117082h : false, (r24 & 128) != 0 ? cVar.f117083i : 0, (r24 & 256) != 0 ? cVar.f117084j : false, (r24 & 512) != 0 ? cVar.f117085k : false, (r24 & 1024) != 0 ? cVar.f117086l : false);
                                if (num != null) {
                                    r102.m126561r(num.intValue());
                                }
                                if (bool != null) {
                                    r102.m126560q(bool.booleanValue());
                                }
                                if (bool2 != null) {
                                    r102.m126559p(bool2.booleanValue());
                                }
                                if (bool3 != null) {
                                    r102.m126563t(bool3.booleanValue());
                                }
                                if (bool4 != null) {
                                    r102.m126562s(bool4.booleanValue());
                                }
                            }
                        }
                        arrayList.add(r102);
                    }
                    c1761c0.mo9224q(arrayList);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C7459d(C22450a c22450a, C22458i c22458i, C22457h c22457h, C22456g c22456g) {
        AbstractC19074t.m100208f(c22450a, "getAllRingBackTones");
        AbstractC19074t.m100208f(c22458i, "previewRingBackTone");
        AbstractC19074t.m100208f(c22457h, "stopPreviewRingBackTone");
        AbstractC19074t.m100208f(c22456g, "saveRingBackToneUseCase");
        this.f40426s = c22450a;
        this.f40427t = c22458i;
        this.f40428u = c22457h;
        this.f40429v = c22456g;
        this.f40430w = StateFlowKt.m113503a(new b("UPDATE_STATE_RBT", c.f40437p, null, 4, null));
        this.f40431x = new C1761c0();
        this.f40432y = new C1761c0();
        this.f40433z = new C1761c0();
    }

    /* renamed from: A0 */
    private final Job m37732A0(String str, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new j(str, num, bool, bool2, bool3, bool4, null), 2, null);
        return m112540d;
    }

    /* renamed from: B0 */
    static /* synthetic */ Job m37733B0(C7459d c7459d, String str, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
        Boolean bool5;
        Integer num2;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8 = null;
        if ((i11 & 2) != 0) {
            bool5 = null;
        } else {
            bool5 = bool;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i11 & 8) != 0) {
            bool6 = null;
        } else {
            bool6 = bool2;
        }
        if ((i11 & 16) != 0) {
            bool7 = null;
        } else {
            bool7 = bool3;
        }
        if ((i11 & 32) == 0) {
            bool8 = bool4;
        }
        return c7459d.m37732A0(str, bool5, num2, bool6, bool7, bool8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final c m37749b0(int i11, long j11) {
        if (i11 == 0) {
            return c.f40440s;
        }
        if (i11 < 0) {
            return c.f40439r;
        }
        if (j11 > 0) {
            return c.f40438q;
        }
        return c.f40437p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m37750i0(Exception exc) {
        List m131496e;
        String str;
        List m131496e2;
        if (exc instanceof ExceptionRingBackToneNoNetwork) {
            C1761c0 c1761c0 = this.f40431x;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_no_internet);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m131496e2 = AbstractC25366r.m131496e(new AbstractC24241h.b(m118743r0));
            c1761c0.mo9221n(m131496e2);
            str = "1";
        } else {
            C1761c0 c1761c02 = this.f40431x;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_rbt_unable_load);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m131496e = AbstractC25366r.m131496e(new AbstractC24241h.b(m118743r02));
            c1761c02.mo9221n(m131496e);
            str = "2";
        }
        AbstractC3082b0.m15424f("SettingRBTViewModel", "handleFetchingError with ex " + exc);
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 1, "call_rbt_list", str), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m37751j0(Exception exc) {
        if (exc instanceof ExceptionNoNetwork) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_no_internet);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m37757x0(m118743r0);
        } else if (exc instanceof ExceptionInCall) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m37757x0(m118743r02);
        } else {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            m37757x0(m118743r03);
        }
        m37753l0("2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m37752k0(Exception exc) {
        if (exc instanceof ExceptionRingBackToneNoNetwork) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_no_internet);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m37757x0(m118743r0);
            m37754m0("1");
        } else if (exc instanceof ExceptionRingBackToneNotVipUser) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m37757x0(m118743r02);
            m37759c0();
            m37754m0("2");
        } else {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            m37757x0(m118743r03);
            m37754m0("3");
        }
        AbstractC3082b0.m15424f("SettingRBTViewModel", "handleSelectRingBackToneException with ex " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m37753l0(String str) {
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_preview_rbt", str), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m37754m0(String str) {
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 0, "call_set_rbt", str), false);
    }

    /* renamed from: u0 */
    private final Job m37755u0(AbstractC24241h.c cVar) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new f(cVar, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public final Job m37756v0(String str) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new g(str, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public final void m37757x0(String str) {
        this.f40433z.mo9221n(new C19964c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m37758y0() {
        this.f40428u.m101504a();
    }

    /* renamed from: c0 */
    public final Job m37759c0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(null), 3, null);
        return m112540d;
    }

    /* renamed from: e0 */
    public final LiveData m37760e0() {
        return this.f40432y;
    }

    /* renamed from: f0 */
    public final StateFlow m37761f0() {
        return this.f40430w;
    }

    /* renamed from: g0 */
    public final LiveData m37762g0() {
        return this.f40431x;
    }

    /* renamed from: h0 */
    public final LiveData m37763h0() {
        return this.f40433z;
    }

    /* renamed from: n0 */
    public final void m37764n0(AbstractC24241h.c cVar) {
        String str;
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        if (cVar.m126556m()) {
            m37772z0();
            return;
        }
        m37758y0();
        if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            this.f40432y.mo9224q(new C19964c(new b("play_default_zalo_ring_back", null, null, 6, null)));
            m37733B0(this, cVar.m126548e(), Boolean.TRUE, null, null, null, null, 60, null);
            str = "1";
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m37757x0(m118743r0);
            str = "2";
        }
        m37753l0(str);
    }

    /* renamed from: o0 */
    public final void m37765o0(AbstractC24241h.c cVar) {
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        if (cVar.m126556m()) {
            m37758y0();
        } else {
            m37772z0();
            m37755u0(cVar);
        }
    }

    /* renamed from: p0 */
    public final void m37766p0() {
        m37733B0(this, "0", Boolean.FALSE, null, null, null, null, 60, null);
    }

    /* renamed from: q0 */
    public final Job m37767q0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new e(null), 2, null);
        return m112540d;
    }

    /* renamed from: r0 */
    public final void m37768r0(int i11) {
        m37733B0(this, "0", null, Integer.valueOf(i11), null, null, null, 58, null);
    }

    /* renamed from: s0 */
    public final void m37769s0() {
        m37759c0();
    }

    /* renamed from: t0 */
    public final void m37770t0() {
        m37772z0();
        m37758y0();
    }

    /* renamed from: w0 */
    public final Job m37771w0(AbstractC24241h.c cVar) {
        Job m112540d;
        AbstractC19074t.m100208f(cVar, "ringBackTone");
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new h(cVar, this, null), 2, null);
        return m112540d;
    }

    /* renamed from: z0 */
    public final Job m37772z0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new i(null), 2, null);
        return m112540d;
    }
}
