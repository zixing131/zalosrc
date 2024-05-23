package p296kc;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import bg0.C2797c;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import lc.EnumC22425a;
import me0.AbstractC23160o0;
import nc.C23676a;
import nc.C23677b;
import nc.C23678c;
import nc.C23679d;
import nc.C23680e;
import nc.C23681f;
import nc.C23683h;
import nc.C23684i;
import nh0.InterfaceC23792b;
import ni.C23795b;
import p268ji.C21270p;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: kc.h */
/* loaded from: classes3.dex */
public final class C21661h {

    /* renamed from: a */
    public static final C21661h f105066a = new C21661h();

    /* renamed from: b */
    private static final InterfaceC24854k f105067b;

    /* renamed from: c */
    private static final InterfaceC24854k f105068c;

    /* renamed from: d */
    private static final InterfaceC24854k f105069d;

    /* renamed from: e */
    private static final InterfaceC24854k f105070e;

    /* renamed from: f */
    private static final InterfaceC24854k f105071f;

    /* renamed from: g */
    private static final InterfaceC24854k f105072g;

    /* renamed from: h */
    private static final InterfaceC24854k f105073h;

    /* renamed from: i */
    private static final InterfaceC24854k f105074i;

    /* renamed from: j */
    private static final InterfaceC24854k f105075j;

    /* renamed from: k */
    private static final InterfaceC24854k f105076k;

    /* renamed from: kc.h$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f105077q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* renamed from: kc.h$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f105078q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23678c mo12V4() {
            return AbstractC23306f.m120689m0();
        }
    }

    /* renamed from: kc.h$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f105079q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23679d mo12V4() {
            return AbstractC23306f.m120693n0();
        }
    }

    /* renamed from: kc.h$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f105080q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23680e mo12V4() {
            return AbstractC23306f.m120697o0();
        }
    }

    /* renamed from: kc.h$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f105081q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23681f mo12V4() {
            return AbstractC23306f.m120701p0();
        }
    }

    /* renamed from: kc.h$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f105082q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(false);
        }
    }

    /* renamed from: kc.h$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f105083q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23795b mo12V4() {
            return AbstractC23306f.m120625V();
        }
    }

    /* renamed from: kc.h$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f105084q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23683h mo12V4() {
            return AbstractC23306f.m120666g1();
        }
    }

    /* renamed from: kc.h$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105085t;

        /* renamed from: u */
        private /* synthetic */ Object f105086u;

        /* renamed from: v */
        final /* synthetic */ String f105087v;

        /* renamed from: w */
        final /* synthetic */ String f105088w;

        /* renamed from: kc.h$i$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f105089t;

            /* renamed from: u */
            final /* synthetic */ Map.Entry f105090u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry entry, Continuation continuation) {
                super(2, continuation);
                this.f105090u = entry;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f105090u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f105089t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C23676a.b bVar = (C23676a.b) AbstractC23306f.m120706r().m101509a(new C23676a.a((String) this.f105090u.getKey(), (Map) this.f105090u.getValue()));
                    if (bVar != null) {
                        C0815e1.m2075D().m2100V(bVar.m124012a(), false);
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f105087v = str;
            this.f105088w = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            i iVar = new i(this.f105087v, this.f105088w, continuation);
            iVar.f105086u = obj;
            return iVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Job m112540d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105085t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f105086u;
                    Map m124336b = C21661h.f105066a.m111621r().m124336b(this.f105087v, 0, this.f105088w);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = m124336b.entrySet().iterator();
                    while (it.hasNext()) {
                        m112540d = BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new a((Map.Entry) it.next(), null), 3, null);
                        arrayList.add(m112540d);
                    }
                    this.f105085t = 1;
                    if (AwaitKt.m112522b(arrayList, this) == m142578e) {
                        return m142578e;
                    }
                }
                C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done get all logs type 0 before " + this.f105088w);
                C21661h.f105066a.m111621r().m124339f(this.f105087v, 0, this.f105088w);
                C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done remove all logs type 0 before " + this.f105088w);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc.h$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105091t;

        /* renamed from: u */
        final /* synthetic */ long f105092u;

        /* renamed from: v */
        final /* synthetic */ long f105093v;

        /* renamed from: w */
        final /* synthetic */ String f105094w;

        /* renamed from: x */
        final /* synthetic */ String f105095x;

        /* renamed from: kc.h$j$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f105096t;

            /* renamed from: u */
            final /* synthetic */ String f105097u;

            /* renamed from: v */
            final /* synthetic */ String f105098v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f105097u = str;
                this.f105098v = str2;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f105097u, this.f105098v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f105096t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21661h c21661h = C21661h.f105066a;
                    String str = this.f105097u;
                    AbstractC19074t.m100207e(str, "$currentUserId");
                    String str2 = this.f105098v;
                    this.f105096t = 1;
                    if (c21661h.m111601O(str, str2, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: kc.h$j$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f105099t;

            /* renamed from: u */
            final /* synthetic */ String f105100u;

            /* renamed from: v */
            final /* synthetic */ String f105101v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f105100u = str;
                this.f105101v = str2;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f105100u, this.f105101v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f105099t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21661h c21661h = C21661h.f105066a;
                    String str = this.f105100u;
                    AbstractC19074t.m100207e(str, "$currentUserId");
                    String str2 = this.f105101v;
                    this.f105099t = 1;
                    if (c21661h.m111602Q(str, str2, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j11, long j12, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f105092u = j11;
            this.f105093v = j12;
            this.f105094w = str;
            this.f105095x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f105092u, this.f105093v, this.f105094w, this.f105095x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Job m112540d;
            Job m112540d2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105091t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100205c(str);
                if (str.length() == 0) {
                    C21661h.f105066a.m111598K().set(false);
                    return C24848g0.f119245a;
                }
                C24559a.m127933c("[SubmitAutoDLLogDaily]", "Begin submit:\n+ Current time: " + this.f105092u + "\n+ Last time: " + this.f105093v + "\n+ Current date: " + this.f105094w + "\n+ Last date: " + this.f105095x + "\n");
                m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(str, this.f105094w, null), 3, null);
                m112540d2 = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new b(str, this.f105094w, null), 3, null);
                Job[] jobArr = {m112540d, m112540d2};
                this.f105091t = 1;
                if (AwaitKt.m112523c(jobArr, this) == m142578e) {
                    return m142578e;
                }
            }
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done submit logs.");
            C21661h c21661h = C21661h.f105066a;
            AbstractC0924m0.m3755dj(c21661h.m111623t().mo124314i());
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done update submit time.");
            c21661h.m111598K().set(false);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc.h$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105102t;

        /* renamed from: u */
        private /* synthetic */ Object f105103u;

        /* renamed from: v */
        final /* synthetic */ String f105104v;

        /* renamed from: w */
        final /* synthetic */ String f105105w;

        /* renamed from: kc.h$k$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f105106t;

            /* renamed from: u */
            final /* synthetic */ Map.Entry f105107u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry entry, Continuation continuation) {
                super(2, continuation);
                this.f105107u = entry;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f105107u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f105106t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C23677b.b bVar = (C23677b.b) AbstractC23306f.m120709s().m101509a(new C23677b.a((String) this.f105107u.getKey(), (Map) this.f105107u.getValue()));
                    if (bVar != null) {
                        C0815e1.m2075D().m2100V(bVar.m124027a(), false);
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f105104v = str;
            this.f105105w = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            k kVar = new k(this.f105104v, this.f105105w, continuation);
            kVar.f105103u = obj;
            return kVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Job m112540d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105102t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f105103u;
                    Map m124336b = C21661h.f105066a.m111621r().m124336b(this.f105104v, 1, this.f105105w);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = m124336b.entrySet().iterator();
                    while (it.hasNext()) {
                        m112540d = BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new a((Map.Entry) it.next(), null), 3, null);
                        arrayList.add(m112540d);
                    }
                    this.f105102t = 1;
                    if (AwaitKt.m112522b(arrayList, this) == m142578e) {
                        return m142578e;
                    }
                }
                C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done get all logs type 1 before " + this.f105105w);
                C21661h.f105066a.m111621r().m124339f(this.f105104v, 1, this.f105105w);
                C24559a.m127933c("[SubmitAutoDLLogDaily]", "Done remove all logs type 1 before " + this.f105105w);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc.h$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f105108q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* renamed from: kc.h$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f105109q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23684i mo12V4() {
            return AbstractC23306f.m120621T1();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        InterfaceC24854k m129210a10;
        m129210a = AbstractC24856m.m129210a(l.f105108q);
        f105067b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(g.f105083q);
        f105068c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(a.f105077q);
        f105069d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(f.f105082q);
        f105070e = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(d.f105080q);
        f105071f = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(b.f105078q);
        f105072g = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(h.f105084q);
        f105073h = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(e.f105081q);
        f105074i = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(c.f105079q);
        f105075j = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(m.f105109q);
        f105076k = m129210a10;
    }

    private C21661h() {
    }

    /* renamed from: A */
    private final void m111592A(List list, C21270p.a aVar) {
        if (list.isEmpty()) {
            return;
        }
        m111616m().mo13474a(new Runnable() { // from class: kc.d

            /* renamed from: q */
            public final /* synthetic */ List f105061q;

            public /* synthetic */ RunnableC21657d(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21661h.m111593B(C21270p.a.this, r2);
            }
        });
    }

    /* renamed from: B */
    public static final void m111593B(C21270p.a aVar, List list) {
        AbstractC19074t.m100208f(aVar, "$logState");
        AbstractC19074t.m100208f(list, "$msgList");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Insert multi logs while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Log type: " + aVar + "\n+ Log size: " + list.size());
        }
        c21661h.m111617n().m101508a(new C23678c.a(m119227X, aVar, list));
    }

    /* renamed from: C */
    private final void m111594C(ArrayList arrayList, C21270p.a aVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        m111616m().mo13474a(new Runnable() { // from class: kc.e

            /* renamed from: q */
            public final /* synthetic */ ArrayList f105063q;

            public /* synthetic */ RunnableC21658e(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21661h.m111595D(C21270p.a.this, r2);
            }
        });
    }

    /* renamed from: D */
    public static final void m111595D(C21270p.a aVar, ArrayList arrayList) {
        AbstractC19074t.m100208f(aVar, "$logState");
        AbstractC19074t.m100208f(arrayList, "$msgList");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Insert multi sync logs while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Log type: " + aVar + "\n+ Log size: " + arrayList.size());
        }
        c21661h.m111618o().m101508a(new C23679d.a(m119227X, aVar, arrayList));
    }

    /* renamed from: I */
    private final void m111596I(C17945a0 c17945a0, C21270p.a aVar) {
        m111616m().mo13474a(new Runnable() { // from class: kc.c

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f105059q;

            public /* synthetic */ RunnableC21656c(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21661h.m111597J(C21270p.a.this, r2);
            }
        });
    }

    /* renamed from: J */
    public static final void m111597J(C21270p.a aVar, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(aVar, "$logState");
        AbstractC19074t.m100208f(c17945a0, "$msg");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Insert single sync log while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Log type: " + aVar + "\n+ Msg hash: " + c17945a0.m95029V3().hashCode() + "\n+ Msg type: " + c17945a0.m95041W4() + "\n");
        }
        c21661h.m111620q().m101508a(new C23681f.a(m119227X, aVar, c17945a0));
    }

    /* renamed from: K */
    public final AtomicBoolean m111598K() {
        return (AtomicBoolean) f105070e.getValue();
    }

    /* renamed from: L */
    private final void m111599L(List list) {
        if (list.isEmpty()) {
            return;
        }
        m111616m().mo13474a(new Runnable() { // from class: kc.f

            /* renamed from: p */
            public final /* synthetic */ List f105064p;

            public /* synthetic */ RunnableC21659f(List list2) {
                r1 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21661h.m111600M(r1);
            }
        });
    }

    /* renamed from: M */
    public static final void m111600M(List list) {
        AbstractC19074t.m100208f(list, "$removedList");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Reset queued type while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Log size: " + list.size() + "\n");
        }
        c21661h.m111622s().m101508a(new C23683h.a(m119227X, list));
    }

    /* renamed from: O */
    public final Object m111601O(String str, String str2, Continuation continuation) {
        Object m142578e;
        Object m112640d = CoroutineScopeKt.m112640d(new i(str, str2, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112640d == m142578e) {
            return m112640d;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: Q */
    public final Object m111602Q(String str, String str2, Continuation continuation) {
        Object m142578e;
        Object m112640d = CoroutineScopeKt.m112640d(new k(str, str2, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112640d == m142578e) {
            return m112640d;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: S */
    public static final void m111603S(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$msgList");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Update enqueue log re-download while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Msg count: " + arrayList.size() + "\n");
        }
        c21661h.m111624u().m101508a(new C23684i.a(m119227X, arrayList));
    }

    /* renamed from: T */
    private final boolean m111604T() {
        String m2951C1 = AbstractC0924m0.m2951C1();
        AbstractC19074t.m100205c(m2951C1);
        if (m2951C1.length() <= 0) {
            return true;
        }
        String m119227X = AbstractC23160o0.m119227X(AbstractC23306f.m120579F1().mo124314i());
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (AbstractC19074t.m100204b(m2951C1, m119227X)) {
            return false;
        }
        AbstractC0924m0.m2910Ai("");
        return true;
    }

    /* renamed from: m */
    private final C2797c m111616m() {
        return (C2797c) f105069d.getValue();
    }

    /* renamed from: n */
    private final C23678c m111617n() {
        return (C23678c) f105072g.getValue();
    }

    /* renamed from: o */
    private final C23679d m111618o() {
        return (C23679d) f105075j.getValue();
    }

    /* renamed from: p */
    private final C23680e m111619p() {
        return (C23680e) f105071f.getValue();
    }

    /* renamed from: q */
    private final C23681f m111620q() {
        return (C23681f) f105074i.getValue();
    }

    /* renamed from: r */
    public final C23795b m111621r() {
        return (C23795b) f105068c.getValue();
    }

    /* renamed from: s */
    private final C23683h m111622s() {
        return (C23683h) f105073h.getValue();
    }

    /* renamed from: t */
    public final InterfaceC23792b m111623t() {
        return (InterfaceC23792b) f105067b.getValue();
    }

    /* renamed from: u */
    private final C23684i m111624u() {
        return (C23684i) f105076k.getValue();
    }

    /* renamed from: v */
    private final void m111625v(C17945a0 c17945a0, C21270p.a aVar, EnumC22425a enumC22425a) {
        m111616m().mo13474a(new Runnable() { // from class: kc.b

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f105056q;

            /* renamed from: r */
            public final /* synthetic */ EnumC22425a f105057r;

            public /* synthetic */ RunnableC21655b(C17945a0 c17945a02, EnumC22425a enumC22425a2) {
                r2 = c17945a02;
                r3 = enumC22425a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21661h.m111626w(C21270p.a.this, r2, r3);
            }
        });
    }

    /* renamed from: w */
    public static final void m111626w(C21270p.a aVar, C17945a0 c17945a0, EnumC22425a enumC22425a) {
        AbstractC19074t.m100208f(aVar, "$logState");
        AbstractC19074t.m100208f(c17945a0, "$msg");
        C21661h c21661h = f105066a;
        long mo124314i = c21661h.m111623t().mo124314i();
        String m119227X = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        if (c21661h.m111598K().get()) {
            C24559a.m127933c("[SubmitAutoDLLogDaily]", "Insert single log while submitting:\n+ Current time: " + mo124314i + "\n+ Current date: " + m119227X + "\n+ Log type: " + aVar + "\n+ Msg hash: " + c17945a0.m95029V3().hashCode() + "\n+ Msg type: " + c17945a0.m95041W4() + "\n+ Tracking type: " + enumC22425a + "\n");
        }
        c21661h.m111619p().m101508a(new C23680e.a(m119227X, aVar, c17945a0, enumC22425a));
    }

    /* renamed from: E */
    public final void m111627E(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "msgList");
        if (m111604T()) {
            m111594C(arrayList, C21270p.a.f103624q);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            C21270p m110161b = C21270p.Companion.m110161b();
            AbstractC19074t.m100205c(c17945a0);
            m110161b.m110154c0(c17945a0, C21270p.a.f103624q);
        }
    }

    /* renamed from: F */
    public final void m111628F(ArrayList arrayList) {
        boolean z11;
        AbstractC19074t.m100208f(arrayList, "rolledList");
        if (m111604T()) {
            m111592A(arrayList, C21270p.a.f103627t);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            C21270p m110161b = C21270p.Companion.m110161b();
            AbstractC19074t.m100205c(c17945a0);
            C21270p.a aVar = C21270p.a.f103627t;
            if (c17945a0.m95020U4() == EnumC22425a.f109726q) {
                z11 = true;
            } else {
                z11 = false;
            }
            m110161b.m110145M(c17945a0, aVar, z11);
        }
    }

    /* renamed from: G */
    public final void m111629G(C17945a0 c17945a0, C21270p.a aVar, EnumC22425a enumC22425a) {
        boolean z11;
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(aVar, "logState");
        if (m111604T()) {
            m111625v(c17945a0, aVar, enumC22425a);
            return;
        }
        C21270p m110161b = C21270p.Companion.m110161b();
        if (enumC22425a == EnumC22425a.f109726q) {
            z11 = true;
        } else {
            z11 = false;
        }
        m110161b.m110145M(c17945a0, aVar, z11);
    }

    /* renamed from: H */
    public final void m111630H(C17945a0 c17945a0, C21270p.a aVar) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(aVar, "logState");
        if (m111604T()) {
            m111596I(c17945a0, aVar);
        } else {
            C21270p.Companion.m110161b().m110154c0(c17945a0, aVar);
        }
    }

    /* renamed from: N */
    public final void m111631N(List list) {
        AbstractC19074t.m100208f(list, "removedList");
        if (m111604T()) {
            m111599L(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21270p.Companion.m110161b().m110157n0((C17945a0) it.next());
        }
    }

    /* renamed from: P */
    public final void m111632P() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return;
        }
        long m3768e2 = AbstractC0924m0.m3768e2();
        String m119227X = AbstractC23160o0.m119227X(m3768e2);
        AbstractC19074t.m100207e(m119227X, "getDateTimeUSLocale(...)");
        long mo124314i = m111623t().mo124314i();
        String m119227X2 = AbstractC23160o0.m119227X(mo124314i);
        AbstractC19074t.m100207e(m119227X2, "getDateTimeUSLocale(...)");
        if (mo124314i > m3768e2 && !AbstractC19074t.m100204b(m119227X, m119227X2) && !m111598K().getAndSet(true)) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new j(mo124314i, m3768e2, m119227X2, m119227X, null), 3, null);
        }
    }

    /* renamed from: R */
    public final void m111633R(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "msgList");
        if ((!arrayList.isEmpty()) && m111604T()) {
            m111616m().mo13474a(new Runnable() { // from class: kc.g

                /* renamed from: p */
                public final /* synthetic */ ArrayList f105065p;

                public /* synthetic */ RunnableC21660g(ArrayList arrayList2) {
                    r1 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21661h.m111603S(r1);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m111634l() {
        m111616m().m13483f();
    }

    /* renamed from: x */
    public final void m111635x(C17945a0 c17945a0, EnumC22425a enumC22425a) {
        boolean z11;
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (m111604T()) {
            m111625v(c17945a0, C21270p.a.f103624q, enumC22425a);
            return;
        }
        C21270p m110161b = C21270p.Companion.m110161b();
        C21270p.a aVar = C21270p.a.f103624q;
        if (enumC22425a == EnumC22425a.f109726q) {
            z11 = true;
        } else {
            z11 = false;
        }
        m110161b.m110145M(c17945a0, aVar, z11);
    }

    /* renamed from: y */
    public final void m111636y(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (m111604T()) {
            m111625v(c17945a0, C21270p.a.f103623p, null);
        } else {
            C21270p.Companion.m110161b().m110145M(c17945a0, C21270p.a.f103623p, false);
        }
    }

    /* renamed from: z */
    public final void m111637z(List list, C21270p.a aVar) {
        boolean z11;
        AbstractC19074t.m100208f(list, "msgList");
        AbstractC19074t.m100208f(aVar, "logState");
        if (m111604T()) {
            m111592A(list, aVar);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            C21270p m110161b = C21270p.Companion.m110161b();
            if (c17945a0.m95020U4() == EnumC22425a.f109726q) {
                z11 = true;
            } else {
                z11 = false;
            }
            m110161b.m110145M(c17945a0, aVar, z11);
        }
    }
}
