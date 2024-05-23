package p554up;

import ac.C0732w;
import ag0.C0815e1;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import bo.AbstractC3012n2;
import bo.C2982h2;
import bo.C3007m2;
import bo.C3017o2;
import bo.C3022p2;
import bo.C3029r;
import bo.C3054x;
import bo.InterfaceC3045u2;
import bo.InterfaceC3058y;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.mvp.music.data.ExceptionInCall;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p205hc.C19964c;
import p361nb.C23648e;
import p426pp.AbstractC24900c;
import p426pp.C24899b;
import p426pp.C24901d;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25452d;
import p456qp.C25454f;
import p456qp.C25456h;
import p456qp.C25458j;
import p456qp.C25460l;
import p456qp.C25464p;
import p534u1.AbstractC26941a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: up.d */
/* loaded from: classes4.dex */
public final class C27356d extends AbstractC1796t0 implements InterfaceC3045u2 {
    public static final h Companion = new h(null);

    /* renamed from: A */
    private final InterfaceC24854k f128781A;

    /* renamed from: B */
    private final InterfaceC24854k f128782B;

    /* renamed from: C */
    private final InterfaceC24854k f128783C;

    /* renamed from: D */
    private final MutableStateFlow f128784D;

    /* renamed from: E */
    private final MutableStateFlow f128785E;

    /* renamed from: F */
    private final MutableSharedFlow f128786F;

    /* renamed from: G */
    private final MutableSharedFlow f128787G;

    /* renamed from: H */
    private final C1761c0 f128788H;

    /* renamed from: I */
    private final C1761c0 f128789I;

    /* renamed from: J */
    private final C1761c0 f128790J;

    /* renamed from: K */
    private final C1761c0 f128791K;

    /* renamed from: L */
    private final C1761c0 f128792L;

    /* renamed from: M */
    private final C1761c0 f128793M;

    /* renamed from: N */
    private String f128794N;

    /* renamed from: s */
    private final MusicSelectParam f128795s;

    /* renamed from: t */
    private boolean f128796t;

    /* renamed from: u */
    private boolean f128797u;

    /* renamed from: v */
    private final C32002l4 f128798v;

    /* renamed from: w */
    private int f128799w;

    /* renamed from: x */
    private Job f128800x;

    /* renamed from: y */
    private SongData f128801y;

    /* renamed from: z */
    private final InterfaceC24854k f128802z;

    /* renamed from: up.d$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends AbstractC29096d {

        /* renamed from: s */
        Object f128803s;

        /* renamed from: t */
        Object f128804t;

        /* renamed from: u */
        /* synthetic */ Object f128805u;

        /* renamed from: w */
        int f128807w;

        a0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128805u = obj;
            this.f128807w |= Integer.MIN_VALUE;
            return C27356d.this.m140067O0(null, this);
        }
    }

    /* renamed from: up.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a */
        public static final b f128808a = new b();

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 implements FlowCollector {

        /* renamed from: q */
        final /* synthetic */ String f128810q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.d$b0$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29096d {

            /* renamed from: s */
            Object f128811s;

            /* renamed from: t */
            /* synthetic */ Object f128812t;

            /* renamed from: v */
            int f128814v;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f128812t = obj;
                this.f128814v |= Integer.MIN_VALUE;
                return b0.this.mo12109b(null, this);
            }
        }

        b0(String str) {
            this.f128810q = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
            a aVar;
            Object m142578e;
            int i11;
            Object obj;
            b0 b0Var;
            String str;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f128814v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f128814v = i12 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f128812t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = aVar.f128814v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            b0Var = (b0) aVar.f128811s;
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        if (abstractC24900c instanceof AbstractC24900c.c) {
                            C0815e1 m2075D = C0815e1.m2075D();
                            C23648e m154345T = C32017m4.m154326S().m154345T(C27356d.this.f128798v.m154284u(67));
                            if (m154345T != null) {
                                String str2 = this.f128810q;
                                String[] m123919l = m154345T.m123919l();
                                if (!((C24899b) ((AbstractC24900c.c) abstractC24900c).m129474a()).m129471b().isEmpty()) {
                                    str = "1";
                                } else {
                                    str = "0";
                                }
                                m123919l[0] = str;
                                m154345T.m123919l()[1] = str2;
                            } else {
                                m154345T = null;
                            }
                            m2075D.m2100V(m154345T, false);
                            MutableSharedFlow mutableSharedFlow = C27356d.this.f128787G;
                            Object m129474a = ((AbstractC24900c.c) abstractC24900c).m129474a();
                            aVar.f128811s = this;
                            aVar.f128814v = 1;
                            if (mutableSharedFlow.mo12109b(m129474a, aVar) == m142578e) {
                                return m142578e;
                            }
                            b0Var = this;
                        } else {
                            if (abstractC24900c instanceof AbstractC24900c.b) {
                                C27356d.this.f128784D.setValue(b.f128808a);
                                C27356d.this.f128785E.setValue(r.f128830a);
                            } else if (abstractC24900c instanceof AbstractC24900c.a) {
                                MutableStateFlow mutableStateFlow = C27356d.this.f128784D;
                                if (AbstractC19074t.m100204b(((AbstractC24900c.a) abstractC24900c).m129473a(), ExceptionNoNetwork.f46313p)) {
                                    obj = e.f128818a;
                                } else {
                                    obj = d.f128817a;
                                }
                                mutableStateFlow.setValue(obj);
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    C27356d.this.m140113s0().mo9224q(new C19964c(m.f128826a));
                    return C24848g0.f119245a;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f128812t;
            m142578e = AbstractC28298d.m142578e();
            i11 = aVar.f128814v;
            if (i11 == 0) {
            }
            C27356d.this.m140113s0().mo9224q(new C19964c(m.f128826a));
            return C24848g0.f119245a;
        }
    }

    /* renamed from: up.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a */
        public static final c f128815a = new c();

        private c() {
        }
    }

    /* renamed from: up.d$c0 */
    /* loaded from: classes4.dex */
    static final class c0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c0 f128816q = new c0();

        c0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25460l mo12V4() {
            return new C25460l();
        }
    }

    /* renamed from: up.d$d */
    /* loaded from: classes4.dex */
    public static final class d implements a {

        /* renamed from: a */
        public static final d f128817a = new d();

        private d() {
        }
    }

    /* renamed from: up.d$e */
    /* loaded from: classes4.dex */
    public static final class e implements a {

        /* renamed from: a */
        public static final e f128818a = new e();

        private e() {
        }
    }

    /* renamed from: up.d$f */
    /* loaded from: classes4.dex */
    public static final class f implements a {

        /* renamed from: a */
        private final List f128819a;

        public f(List list) {
            AbstractC19074t.m100208f(list, "list");
            this.f128819a = list;
        }

        /* renamed from: a */
        public final List m140120a() {
            return this.f128819a;
        }
    }

    /* renamed from: up.d$g */
    /* loaded from: classes4.dex */
    public static final class g implements q {

        /* renamed from: a */
        private final List f128820a;

        /* renamed from: b */
        private final int f128821b;

        /* renamed from: c */
        private final int f128822c;

        public g(List list, int i11) {
            Object obj;
            Object m131206f0;
            int i12;
            AbstractC19074t.m100208f(list, "lstSongCategory");
            this.f128820a = list;
            this.f128821b = i11;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C24901d) obj).m129480f() == this.f128821b) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f128820a);
                C24901d c24901d = (C24901d) m131206f0;
                if (c24901d != null) {
                    i12 = c24901d.m129480f();
                } else {
                    i12 = -1;
                }
            } else {
                i12 = this.f128821b;
            }
            this.f128822c = i12;
        }

        /* renamed from: a */
        public final int m140121a() {
            return this.f128822c;
        }

        /* renamed from: b */
        public final List m140122b() {
            return this.f128820a;
        }

        /* renamed from: c */
        public final C24901d m140123c() {
            Object obj;
            Object m131206f0;
            Iterator it = this.f128820a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C24901d) obj).m129480f() == this.f128822c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C24901d c24901d = (C24901d) obj;
            if (c24901d == null) {
                m131206f0 = AbstractC25332a0.m131206f0(this.f128820a);
                return (C24901d) m131206f0;
            }
            return c24901d;
        }

        /* renamed from: d */
        public final g m140124d(C24901d c24901d) {
            int m131511r;
            AbstractC19074t.m100208f(c24901d, "songCategory");
            List<C24901d> list = this.f128820a;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            for (C24901d c24901d2 : list) {
                if (c24901d2.m129480f() == c24901d.m129480f()) {
                    c24901d2 = c24901d;
                }
                arrayList.add(c24901d2);
            }
            return new g(arrayList, this.f128822c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC19074t.m100204b(this.f128820a, gVar.f128820a) && this.f128821b == gVar.f128821b;
        }

        public int hashCode() {
            return (this.f128820a.hashCode() * 31) + this.f128821b;
        }

        public String toString() {
            return "CategoryControl(lstSongCategory=" + this.f128820a + ", idSelectedParam=" + this.f128821b + ")";
        }
    }

    /* renamed from: up.d$h */
    /* loaded from: classes4.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: up.d$i */
    /* loaded from: classes4.dex */
    public static final class i extends j {

        /* renamed from: b */
        public static final i f128823b = new i();

        private i() {
            super(true);
        }
    }

    /* renamed from: up.d$j */
    /* loaded from: classes4.dex */
    public static abstract class j implements k {

        /* renamed from: a */
        private final boolean f128824a;

        public j(boolean z11) {
            this.f128824a = z11;
        }

        /* renamed from: a */
        public final boolean m140125a() {
            return this.f128824a;
        }
    }

    /* renamed from: up.d$k */
    /* loaded from: classes4.dex */
    public interface k {
    }

    /* renamed from: up.d$l */
    /* loaded from: classes4.dex */
    public static final class l implements k {

        /* renamed from: a */
        private final int f128825a;

        public l(int i11) {
            this.f128825a = i11;
        }

        /* renamed from: a */
        public final int m140126a() {
            return this.f128825a;
        }
    }

    /* renamed from: up.d$m */
    /* loaded from: classes4.dex */
    public static final class m implements k {

        /* renamed from: a */
        public static final m f128826a = new m();

        private m() {
        }
    }

    /* renamed from: up.d$n */
    /* loaded from: classes4.dex */
    public static final class n extends j {

        /* renamed from: b */
        public static final n f128827b = new n();

        private n() {
            super(false);
        }
    }

    /* renamed from: up.d$o */
    /* loaded from: classes4.dex */
    public static final class o implements k {

        /* renamed from: a */
        private final String f128828a;

        public o(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f128828a = str;
        }

        /* renamed from: a */
        public final String m140127a() {
            return this.f128828a;
        }
    }

    /* renamed from: up.d$p */
    /* loaded from: classes4.dex */
    public static final class p implements C1802w0.b {

        /* renamed from: a */
        private final MusicSelectParam f128829a;

        public p(MusicSelectParam musicSelectParam) {
            AbstractC19074t.m100208f(musicSelectParam, "param");
            this.f128829a = musicSelectParam;
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C27356d(this.f128829a);
        }
    }

    /* renamed from: up.d$q */
    /* loaded from: classes4.dex */
    public interface q {
    }

    /* renamed from: up.d$r */
    /* loaded from: classes4.dex */
    public static final class r implements q {

        /* renamed from: a */
        public static final r f128830a = new r();

        private r() {
        }
    }

    /* renamed from: up.d$s */
    /* loaded from: classes4.dex */
    static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final s f128831q = new s();

        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25452d mo12V4() {
            return new C25452d(null, 1, null);
        }
    }

    /* renamed from: up.d$t */
    /* loaded from: classes4.dex */
    static final class t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final t f128832q = new t();

        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25454f mo12V4() {
            return new C25454f(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128833t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.d$u$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27356d f128835p;

            a(C27356d c27356d) {
                this.f128835p = c27356d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                if (abstractC24900c instanceof AbstractC24900c.c) {
                    this.f128835p.m140071Q0(new g((List) ((AbstractC24900c.c) abstractC24900c).m129474a(), this.f128835p.f128799w));
                } else if (abstractC24900c instanceof AbstractC24900c.a) {
                    this.f128835p.f128784D.setValue(c.f128815a);
                } else if (abstractC24900c instanceof AbstractC24900c.b) {
                    this.f128835p.f128784D.setValue(b.f128808a);
                    this.f128835p.f128785E.setValue(r.f128830a);
                }
                return C24848g0.f119245a;
            }
        }

        u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new u(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128833t;
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
                C25452d m140092k0 = C27356d.this.m140092k0();
                this.f128833t = 1;
                obj = m140092k0.m101503a(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(C27356d.this);
                this.f128833t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128836t;

        /* renamed from: u */
        private /* synthetic */ Object f128837u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.d$v$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f128839t;

            /* renamed from: u */
            final /* synthetic */ C27356d f128840u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: up.d$v$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33004a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C27356d f128841p;

                C33004a(C27356d c27356d) {
                    this.f128841p = c27356d;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(q qVar, Continuation continuation) {
                    if (qVar instanceof g) {
                        this.f128841p.m140061L0((g) qVar);
                    } else if (qVar instanceof r) {
                        this.f128841p.m140063M0();
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C27356d c27356d, Continuation continuation) {
                super(2, continuation);
                this.f128840u = c27356d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f128840u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f128839t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f128840u.f128785E;
                    C33004a c33004a = new C33004a(this.f128840u);
                    this.f128839t = 1;
                    if (mutableStateFlow.mo97893a(c33004a, this) == m142578e) {
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
        /* renamed from: up.d$v$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f128842t;

            /* renamed from: u */
            final /* synthetic */ C27356d f128843u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: up.d$v$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C27356d f128844p;

                a(C27356d c27356d) {
                    this.f128844p = c27356d;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(a aVar, Continuation continuation) {
                    if (aVar instanceof f) {
                        this.f128844p.m140065N0(((f) aVar).m140120a());
                    } else if (aVar instanceof b) {
                        this.f128844p.m140091i0();
                    } else if (aVar instanceof c) {
                        this.f128844p.m140088f0();
                    } else if (aVar instanceof d) {
                        this.f128844p.m140089g0();
                    } else if (aVar instanceof e) {
                        this.f128844p.m140090h0();
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C27356d c27356d, Continuation continuation) {
                super(2, continuation);
                this.f128843u = c27356d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f128843u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f128842t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableStateFlow mutableStateFlow = this.f128843u.f128784D;
                    a aVar = new a(this.f128843u);
                    this.f128842t = 1;
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
        /* renamed from: up.d$v$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f128845t;

            /* renamed from: u */
            final /* synthetic */ C27356d f128846u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: up.d$v$c$a */
            /* loaded from: classes4.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C27356d f128847p;

                a(C27356d c27356d) {
                    this.f128847p = c27356d;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C24899b c24899b, Continuation continuation) {
                    Object fVar;
                    if (c24899b != null) {
                        MutableStateFlow mutableStateFlow = this.f128847p.f128784D;
                        if (c24899b.m129471b().isEmpty()) {
                            fVar = d.f128817a;
                        } else {
                            fVar = new f(c24899b.m129471b());
                        }
                        mutableStateFlow.setValue(fVar);
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C27356d c27356d, Continuation continuation) {
                super(2, continuation);
                this.f128846u = c27356d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f128846u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f128845t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f128846u.f128787G;
                    a aVar = new a(this.f128846u);
                    this.f128845t = 1;
                    if (mutableSharedFlow.mo97893a(aVar, this) == m142578e) {
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
        /* renamed from: up.d$v$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f128848t;

            /* renamed from: u */
            final /* synthetic */ C27356d f128849u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: up.d$v$d$a */
            /* loaded from: classes4.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C27356d f128850p;

                a(C27356d c27356d) {
                    this.f128850p = c27356d;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(String str, Continuation continuation) {
                    Object m142578e;
                    Object m140067O0 = this.f128850p.m140067O0(str, continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (m140067O0 == m142578e) {
                        return m140067O0;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C27356d c27356d, Continuation continuation) {
                super(2, continuation);
                this.f128849u = c27356d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new d(this.f128849u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f128848t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f128849u.f128786F;
                    a aVar = new a(this.f128849u);
                    this.f128848t = 1;
                    if (mutableSharedFlow.mo97893a(aVar, this) == m142578e) {
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

        v(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            v vVar = new v(continuation);
            vVar.f128837u = obj;
            return vVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f128836t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f128837u;
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new a(C27356d.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new b(C27356d.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new c(C27356d.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new d(C27356d.this, null), 3, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: up.d$w */
    /* loaded from: classes4.dex */
    static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final w f128851q = new w();

        w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25456h mo12V4() {
            return new C25456h(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128852t;

        /* renamed from: v */
        final /* synthetic */ C24901d f128854v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.d$x$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27356d f128855p;

            a(C27356d c27356d) {
                this.f128855p = c27356d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                g gVar;
                if (abstractC24900c instanceof AbstractC24900c.c) {
                    Object value = this.f128855p.f128785E.getValue();
                    if (value instanceof g) {
                        gVar = (g) value;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        this.f128855p.m140071Q0(gVar.m140124d((C24901d) ((AbstractC24900c.c) abstractC24900c).m129474a()));
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(C24901d c24901d, Continuation continuation) {
            super(2, continuation);
            this.f128854v = c24901d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new x(this.f128854v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128852t;
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
                C25456h m140094m0 = C27356d.this.m140094m0();
                C25456h.a aVar = new C25456h.a(this.f128854v);
                this.f128852t = 1;
                obj = m140094m0.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C27356d.this);
                this.f128852t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
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

    /* renamed from: up.d$y */
    /* loaded from: classes4.dex */
    static final class y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128856t;

        /* renamed from: u */
        private /* synthetic */ Object f128857u;

        y(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            y yVar = new y(continuation);
            yVar.f128857u = obj;
            return yVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128856t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f128857u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                coroutineScope = (CoroutineScope) this.f128857u;
                this.f128857u = coroutineScope;
                this.f128856t = 1;
                if (DelayKt.m112666b(500L, this) == m142578e) {
                    return m142578e;
                }
            }
            if (CoroutineScopeKt.m112642f(coroutineScope)) {
                MutableSharedFlow mutableSharedFlow = C27356d.this.f128786F;
                String m140111p0 = C27356d.this.m140111p0();
                this.f128857u = null;
                this.f128856t = 2;
                if (mutableSharedFlow.mo12109b(m140111p0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.d$z */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128859t;

        /* renamed from: u */
        final /* synthetic */ SongData f128860u;

        /* renamed from: v */
        final /* synthetic */ C27356d f128861v;

        /* renamed from: up.d$z$a */
        /* loaded from: classes4.dex */
        public static final class a implements C25458j.a {

            /* renamed from: a */
            final /* synthetic */ C27356d f128862a;

            /* renamed from: b */
            final /* synthetic */ SongData f128863b;

            /* renamed from: up.d$z$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C33005a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128864t;

                /* renamed from: u */
                final /* synthetic */ C27356d f128865u;

                /* renamed from: v */
                final /* synthetic */ SongData f128866v;

                /* renamed from: w */
                final /* synthetic */ Exception f128867w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C33005a(C27356d c27356d, SongData songData, Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.f128865u = c27356d;
                    this.f128866v = songData;
                    this.f128867w = exc;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C33005a(this.f128865u, this.f128866v, this.f128867w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    int i11;
                    AbstractC28298d.m142578e();
                    if (this.f128864t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C27356d.m140077T0(this.f128865u, this.f128866v.m45160e(), false, 0, false, 4, null);
                        C1761c0 m140113s0 = this.f128865u.m140113s0();
                        Exception exc = this.f128867w;
                        if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p)) {
                            i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                        } else if (AbstractC19074t.m100204b(exc, ExceptionInCall.f46308p)) {
                            i11 = AbstractC8020f0.str_sticky_player_conflict_call;
                        } else {
                            i11 = AbstractC8020f0.str_music_download_song_error;
                        }
                        String m118743r0 = AbstractC23136l9.m118743r0(i11);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        m140113s0.mo9224q(new C19964c(new o(m118743r0)));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C33005a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: up.d$z$a$b */
            /* loaded from: classes4.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128868t;

                /* renamed from: u */
                final /* synthetic */ C27356d f128869u;

                /* renamed from: v */
                final /* synthetic */ SongData f128870v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C27356d c27356d, SongData songData, Continuation continuation) {
                    super(2, continuation);
                    this.f128869u = c27356d;
                    this.f128870v = songData;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f128869u, this.f128870v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128868t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128869u.m140075S0(this.f128870v.m45160e(), true, 0, false);
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

            /* renamed from: up.d$z$a$c */
            /* loaded from: classes4.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128871t;

                /* renamed from: u */
                final /* synthetic */ C27356d f128872u;

                /* renamed from: v */
                final /* synthetic */ SongData f128873v;

                /* renamed from: w */
                final /* synthetic */ int f128874w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C27356d c27356d, SongData songData, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f128872u = c27356d;
                    this.f128873v = songData;
                    this.f128874w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f128872u, this.f128873v, this.f128874w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128871t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128872u.m140075S0(this.f128873v.m45160e(), true, this.f128874w, false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: up.d$z$a$d */
            /* loaded from: classes4.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128875t;

                /* renamed from: u */
                final /* synthetic */ C27356d f128876u;

                /* renamed from: v */
                final /* synthetic */ SongData f128877v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C27356d c27356d, SongData songData, Continuation continuation) {
                    super(2, continuation);
                    this.f128876u = c27356d;
                    this.f128877v = songData;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f128876u, this.f128877v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128875t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C27356d.m140077T0(this.f128876u, this.f128877v.m45160e(), false, 0, false, 4, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C27356d c27356d, SongData songData) {
                this.f128862a = c27356d;
                this.f128863b = songData;
            }

            @Override // p456qp.C25458j.a
            /* renamed from: a */
            public void mo104656a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128862a), null, null, new C33005a(this.f128862a, this.f128863b, exc, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: b */
            public void mo104657b(String str) {
                C25458j.a.C32958a.m131876d(this, str);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: c */
            public void mo104658c(C24903f c24903f, int i11, int i12) {
                C25458j.a.C32958a.m131877e(this, c24903f, i11, i12);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: d */
            public void mo104659d(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128862a), null, null, new b(this.f128862a, this.f128863b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: e */
            public void mo104660e(C24903f c24903f, int i11) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128862a), null, null, new c(this.f128862a, this.f128863b, i11, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: f */
            public void mo104661f(C24903f c24903f) {
                C25458j.a.C32958a.m131874b(this, c24903f);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: g */
            public void mo104662g(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128862a), null, null, new d(this.f128862a, this.f128863b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: h */
            public void mo104663h(C24902e c24902e) {
                C25458j.a.C32958a.m131878f(this, c24902e);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: i */
            public void mo104664i(C24903f c24903f, LyricRender lyricRender) {
                C25458j.a.C32958a.m131875c(this, c24903f, lyricRender);
            }

            @Override // p456qp.C25458j.a
            public void onAudioFocusChange(int i11) {
                C25458j.a.C32958a.m131873a(this, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(SongData songData, C27356d c27356d, Continuation continuation) {
            super(2, continuation);
            this.f128860u = songData;
            this.f128861v = c27356d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new z(this.f128860u, this.f128861v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128859t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j c25458j = new C25458j(null, 1, null);
                C25458j.b bVar = new C25458j.b(this.f128860u.m45160e(), false, false, null, false, 0, new a(this.f128861v, this.f128860u), 58, null);
                this.f128859t = 1;
                if (c25458j.m101507a(bVar, this) == m142578e) {
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

    public C27356d(MusicSelectParam musicSelectParam) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(musicSelectParam, "param");
        this.f128795s = musicSelectParam;
        this.f128796t = true;
        this.f128797u = true;
        C32002l4 m154287a = C32002l4.Companion.m154287a(10026);
        m154287a.m154273c(musicSelectParam.m45745b());
        this.f128798v = m154287a;
        this.f128799w = musicSelectParam.m45744a();
        m129210a = AbstractC24856m.m129210a(s.f128831q);
        this.f128802z = m129210a;
        m129210a2 = AbstractC24856m.m129210a(w.f128851q);
        this.f128781A = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(t.f128832q);
        this.f128782B = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(c0.f128816q);
        this.f128783C = m129210a4;
        this.f128784D = StateFlowKt.m113503a(b.f128808a);
        this.f128785E = StateFlowKt.m113503a(r.f128830a);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f128786F = SharedFlowKt.m113477a(1, 1, bufferOverflow);
        this.f128787G = SharedFlowKt.m113477a(1, 1, bufferOverflow);
        this.f128788H = new C1761c0();
        this.f128789I = new C1761c0();
        this.f128790J = new C1761c0();
        this.f128791K = new C1761c0();
        this.f128792L = new C1761c0();
        this.f128793M = new C1761c0();
        this.f128794N = "";
        m140097u0();
        m140096t0();
    }

    /* renamed from: K0 */
    private final void m140060K0(SongData songData) {
        SongData m45157a;
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(this.f128798v.m154284u(61)), false);
        this.f128801y = songData;
        C1761c0 c1761c0 = this.f128790J;
        m45157a = songData.m45157a((r20 & 1) != 0 ? songData.f45978p : null, (r20 & 2) != 0 ? songData.f45979q : null, (r20 & 4) != 0 ? songData.f45980r : null, (r20 & 8) != 0 ? songData.f45981s : null, (r20 & 16) != 0 ? songData.f45982t : null, (r20 & 32) != 0 ? songData.f45983u : null, (r20 & 64) != 0 ? songData.f45984v : false, (r20 & 128) != 0 ? songData.f45985w : 0, (r20 & 256) != 0 ? songData.f45986x : true);
        c1761c0.mo9224q(new C3022p2(m45157a));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new z(songData, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public final void m140061L0(g gVar) {
        int m131511r;
        boolean z11;
        C1761c0 c1761c0 = this.f128789I;
        List<C24901d> m140122b = gVar.m140122b();
        m131511r = AbstractC25370t.m131511r(m140122b, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (C24901d c24901d : m140122b) {
            String m129481g = c24901d.m129481g();
            String m129484j = c24901d.m129484j();
            if (gVar.m140121a() == c24901d.m129480f()) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new C2982h2(new C3029r(c24901d, m129481g, m129484j, z11)));
        }
        c1761c0.mo9224q(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public final void m140063M0() {
        List m131502j;
        C1761c0 c1761c0 = this.f128789I;
        m131502j = AbstractC25368s.m131502j();
        c1761c0.mo9224q(m131502j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public final void m140065N0(List list) {
        int m131511r;
        C1761c0 c1761c0 = this.f128788H;
        List<C24902e> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (C24902e c24902e : list2) {
            arrayList.add(new C3022p2(new SongData(c24902e.m129490f(), c24902e.m129494j(), c24902e.m129492h(), c24902e.m129487c(), null, null, false, 0, false, 368, null)));
        }
        c1761c0.mo9221n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m140067O0(String str, Continuation continuation) {
        a0 a0Var;
        Object m142578e;
        int i11;
        C27356d c27356d;
        Flow flow;
        if (continuation instanceof a0) {
            a0Var = (a0) continuation;
            int i12 = a0Var.f128807w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                a0Var.f128807w = i12 - Integer.MIN_VALUE;
                Object obj = a0Var.f128805u;
                m142578e = AbstractC28298d.m142578e();
                i11 = a0Var.f128807w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) a0Var.f128804t;
                    c27356d = (C27356d) a0Var.f128803s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (m140114v0(str)) {
                        m140096t0();
                        return C24848g0.f119245a;
                    }
                    C25460l m140095q0 = m140095q0();
                    C25460l.b bVar = new C25460l.b(str, false);
                    a0Var.f128803s = this;
                    a0Var.f128804t = str;
                    a0Var.f128807w = 1;
                    obj = m140095q0.m101498a(bVar, a0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c27356d = this;
                }
                flow = (Flow) obj;
                if (flow != null) {
                    b0 b0Var = new b0(str);
                    a0Var.f128803s = null;
                    a0Var.f128804t = null;
                    a0Var.f128807w = 2;
                    if (flow.mo97893a(b0Var, a0Var) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        a0Var = new a0(continuation);
        Object obj2 = a0Var.f128805u;
        m142578e = AbstractC28298d.m142578e();
        i11 = a0Var.f128807w;
        if (i11 == 0) {
        }
        flow = (Flow) obj2;
        if (flow != null) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: P0 */
    private final C23648e m140069P0(C23648e c23648e) {
        String str;
        if (c23648e != null) {
            q qVar = (q) this.f128785E.getValue();
            String[] m123919l = c23648e.m123919l();
            if (qVar instanceof g) {
                str = String.valueOf(((g) qVar).m140121a());
            } else {
                str = "0";
            }
            m123919l[0] = str;
        }
        return c23648e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public final void m140071Q0(g gVar) {
        C24902e c24902e;
        this.f128799w = gVar.m140121a();
        this.f128785E.setValue(gVar);
        C24901d m140123c = gVar.m140123c();
        if (m140123c != null) {
            MutableStateFlow mutableStateFlow = this.f128784D;
            List m129483i = m140123c.m129483i();
            ArrayList arrayList = new ArrayList();
            Iterator it = m129483i.iterator();
            while (it.hasNext()) {
                C25454f.a aVar = (C25454f.a) m140093l0().m101509a((String) it.next());
                if (aVar != null) {
                    c24902e = aVar.m131848a();
                } else {
                    c24902e = null;
                }
                if (c24902e != null) {
                    arrayList.add(c24902e);
                }
            }
            mutableStateFlow.setValue(new f(arrayList));
        }
        C1761c0 c1761c0 = this.f128792L;
        Iterator it2 = gVar.m140122b().iterator();
        int i11 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((C24901d) it2.next()).m129480f() == gVar.m140121a()) {
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

    /* renamed from: R0 */
    private final void m140073R0() {
        new C25464p().m101508a(new C25464p.b(false, null, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m140075S0(String str, boolean z11, int i11, boolean z12) {
        Object obj;
        SongData m45157a;
        Object obj2;
        List list = (List) this.f128788H.mo9215f();
        C3022p2 c3022p2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    AbstractC3012n2 abstractC3012n2 = (AbstractC3012n2) obj2;
                    if ((abstractC3012n2 instanceof C3022p2) && str.equals(((C3022p2) abstractC3012n2).m14543b().m45160e())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            obj = (AbstractC3012n2) obj2;
        } else {
            obj = null;
        }
        if (obj instanceof C3022p2) {
            c3022p2 = (C3022p2) obj;
        }
        if (c3022p2 != null) {
            C1761c0 c1761c0 = this.f128790J;
            m45157a = r4.m45157a((r20 & 1) != 0 ? r4.f45978p : null, (r20 & 2) != 0 ? r4.f45979q : null, (r20 & 4) != 0 ? r4.f45980r : null, (r20 & 8) != 0 ? r4.f45981s : null, (r20 & 16) != 0 ? r4.f45982t : null, (r20 & 32) != 0 ? r4.f45983u : null, (r20 & 64) != 0 ? r4.f45984v : z11, (r20 & 128) != 0 ? r4.f45985w : i11, (r20 & 256) != 0 ? c3022p2.m14543b().f45986x : z12);
            c1761c0.mo9224q(new C3022p2(m45157a));
        }
    }

    /* renamed from: T0 */
    static /* synthetic */ void m140077T0(C27356d c27356d, String str, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        c27356d.m140075S0(str, z11, i11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m140088f0() {
        List m131496e;
        C1761c0 c1761c0 = this.f128788H;
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14664V(1);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        c3054x.m14657O(AbstractC16803z.im_connect);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c3054x.m14661S(0);
        c3054x.m14660R(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14662T(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14665W(1);
        m131496e = AbstractC25366r.m131496e(new C3007m2(c3054x));
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m140089g0() {
        List m131496e;
        C1761c0 c1761c0 = this.f128788H;
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_search_empty_msg));
        c3054x.m14657O(AbstractC16803z.ic_empty_no_music);
        c3054x.m14661S(0);
        c3054x.m14660R(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14662T(AbstractC23136l9.m118742r(0.0f));
        m131496e = AbstractC25366r.m131496e(new C3007m2(c3054x));
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m140090h0() {
        List m131496e;
        C1761c0 c1761c0 = this.f128788H;
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        c3054x.m14657O(AbstractC16803z.ic_empty_no_music);
        c3054x.m14661S(0);
        c3054x.m14660R(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14662T(AbstractC23136l9.m118742r(0.0f));
        m131496e = AbstractC25366r.m131496e(new C3007m2(c3054x));
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m140091i0() {
        List m131496e;
        C1761c0 c1761c0 = this.f128788H;
        m131496e = AbstractC25366r.m131496e(C3017o2.f12006b);
        c1761c0.mo9221n(m131496e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final C25452d m140092k0() {
        return (C25452d) this.f128802z.getValue();
    }

    /* renamed from: l0 */
    private final C25454f m140093l0() {
        return (C25454f) this.f128782B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public final C25456h m140094m0() {
        return (C25456h) this.f128781A.getValue();
    }

    /* renamed from: q0 */
    private final C25460l m140095q0() {
        return (C25460l) this.f128783C.getValue();
    }

    /* renamed from: t0 */
    private final void m140096t0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new u(null), 3, null);
    }

    /* renamed from: u0 */
    private final void m140097u0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new v(null), 3, null);
    }

    /* renamed from: w0 */
    private final void m140098w0(C24901d c24901d) {
        if (c24901d.m129479e()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new x(c24901d, null), 3, null);
        }
    }

    /* renamed from: A0 */
    public final void m140099A0(SongData songData) {
        AbstractC19074t.m100208f(songData, "songData");
        if (songData.m45166k()) {
            m140073R0();
        } else {
            m140060K0(songData);
        }
    }

    /* renamed from: B0 */
    public final void m140100B0() {
        m140073R0();
    }

    /* renamed from: C0 */
    public final void m140101C0(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "keyword");
        this.f128792L.mo9224q(new C19964c(n.f128827b));
        this.f128794N = str;
        Job job = this.f128800x;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        if (!m140114v0(str)) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new y(null), 3, null);
            this.f128800x = m112540d;
        } else {
            this.f128786F.mo113433d(this.f128794N);
        }
    }

    /* renamed from: D0 */
    public final void m140102D0() {
        m140096t0();
    }

    /* renamed from: E0 */
    public final void m140103E0() {
        this.f128792L.mo9224q(new C19964c(i.f128823b));
        if (this.f128797u) {
            this.f128797u = false;
            C0815e1.m2075D().m2100V(m140069P0(C32017m4.m154326S().m154345T(this.f128798v.m154284u(64))), false);
        }
    }

    /* renamed from: F0 */
    public final void m140104F0(int i11, int i12) {
        g gVar;
        C24901d m140123c;
        if (i11 >= i12 - 5) {
            Object value = this.f128785E.getValue();
            if (value instanceof g) {
                gVar = (g) value;
            } else {
                gVar = null;
            }
            if (gVar != null && (m140123c = gVar.m140123c()) != null) {
                m140098w0(m140123c);
            }
        }
    }

    /* renamed from: G0 */
    public final void m140105G0() {
        if (this.f128796t) {
            this.f128796t = false;
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(this.f128798v.m154284u(63)), false);
        }
    }

    /* renamed from: I0 */
    public final void m140106I0() {
        this.f128797u = true;
    }

    /* renamed from: J0 */
    public final void m140107J0() {
        C0732w.m1177r(C0732w.Companion.m1189a(), "click_search_input", null, null, null, 14, null);
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(this.f128798v.m154284u(65)), false);
    }

    /* renamed from: j0 */
    public final C1761c0 m140108j0() {
        return this.f128789I;
    }

    /* renamed from: n0 */
    public final C1761c0 m140109n0() {
        return this.f128790J;
    }

    /* renamed from: o0 */
    public final C1761c0 m140110o0() {
        return this.f128791K;
    }

    /* renamed from: p0 */
    public final String m140111p0() {
        return this.f128794N;
    }

    /* renamed from: r0 */
    public final C1761c0 m140112r0() {
        return this.f128788H;
    }

    @Override // bo.InterfaceC3045u2
    /* renamed from: rG */
    public void mo14631rG(InterfaceC3058y interfaceC3058y) {
        AbstractC19074t.m100208f(interfaceC3058y, "event");
        if (interfaceC3058y instanceof SongData.C8469b) {
            m140115x0(((SongData.C8469b) interfaceC3058y).m45176a());
            return;
        }
        if (interfaceC3058y instanceof SongData.C8471d) {
            m140099A0(((SongData.C8471d) interfaceC3058y).m45178a());
        } else if (interfaceC3058y instanceof SongData.C8470c) {
            m140117z0(((SongData.C8470c) interfaceC3058y).m45177a());
        } else if (interfaceC3058y instanceof C3029r.a) {
            m140116y0(((C3029r.a) interfaceC3058y).m14583a());
        }
    }

    /* renamed from: s0 */
    public final C1761c0 m140113s0() {
        return this.f128792L;
    }

    /* renamed from: v0 */
    public final boolean m140114v0(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    public final void m140115x0(SongData songData) {
        AbstractC19074t.m100208f(songData, "songData");
        C0732w.m1177r(C0732w.Companion.m1189a(), "click_button_select_song", null, null, null, 14, null);
        C0815e1.m2075D().m2100V(m140069P0(C32017m4.m154326S().m154345T(this.f128798v.m154284u(66))), false);
        C23648e m140069P0 = m140069P0(C32017m4.m154326S().m154345T(this.f128798v.m154284u(83)));
        if (m140069P0 != null) {
            m140069P0.m123919l()[1] = songData.m45164i();
        }
        C0815e1.m2075D().m2100V(m140069P0, false);
        this.f128792L.mo9224q(new C19964c(i.f128823b));
        this.f128791K.mo9221n(new C19964c(new MusicSelectResult(true, songData.m45160e(), this.f128799w)));
    }

    /* renamed from: y0 */
    public final void m140116y0(C3029r c3029r) {
        AbstractC19074t.m100208f(c3029r, "categoryData");
        C0732w.m1177r(C0732w.Companion.m1189a(), "click_tab_song_category", null, null, null, 14, null);
        q qVar = (q) this.f128785E.getValue();
        if (qVar instanceof g) {
            m140071Q0(new g(((g) qVar).m140122b(), c3029r.m14580b().m129480f()));
            this.f128792L.mo9224q(new C19964c(m.f128826a));
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(this.f128798v.m154284u(62)), false);
            C23648e m154345T = C32017m4.m154326S().m154345T(this.f128798v.m154284u(82));
            if (m154345T != null) {
                m154345T.m123919l()[0] = String.valueOf(c3029r.m14580b().m129480f());
            }
            C0815e1.m2075D().m2100V(m154345T, false);
        }
    }

    /* renamed from: z0 */
    public final void m140117z0(SongData songData) {
        AbstractC19074t.m100208f(songData, "songData");
        if (songData.m45166k()) {
            m140073R0();
        } else {
            m140060K0(songData);
        }
    }
}
