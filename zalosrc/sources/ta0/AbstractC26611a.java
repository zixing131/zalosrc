package ta0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import eu.AbstractC18611a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kw.C21956b;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wa0.AbstractC28862a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import za0.C31747a;

/* renamed from: ta0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC26611a extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private C1761c0 f125949A;

    /* renamed from: B */
    private final C1761c0 f125950B;

    /* renamed from: C */
    private final LiveData f125951C;

    /* renamed from: D */
    private final C1761c0 f125952D;

    /* renamed from: E */
    private final LiveData f125953E;

    /* renamed from: F */
    private boolean f125954F;

    /* renamed from: G */
    private String f125955G;

    /* renamed from: H */
    private final LiveData f125956H;

    /* renamed from: s */
    private final C1761c0 f125957s = new C1761c0();

    /* renamed from: t */
    private final C1761c0 f125958t;

    /* renamed from: u */
    private final LiveData f125959u;

    /* renamed from: v */
    private final HashSet f125960v;

    /* renamed from: w */
    private final C1761c0 f125961w;

    /* renamed from: x */
    private final LiveData f125962x;

    /* renamed from: y */
    private final C1761c0 f125963y;

    /* renamed from: z */
    private final LiveData f125964z;

    /* renamed from: ta0.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ta0.a$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f125965a;

        static {
            int[] iArr = new int[C31747a.a.values().length];
            try {
                iArr[C31747a.a.f145820q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C31747a.a.f145821r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C31747a.a.f145822s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C31747a.a.f145823t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C31747a.a.f145824u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C31747a.a.f145825v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f125965a = iArr;
        }
    }

    /* renamed from: ta0.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125966t;

        /* renamed from: v */
        final /* synthetic */ C31747a.a f125968v;

        /* renamed from: w */
        final /* synthetic */ List f125969w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C31747a.a aVar, List list, Continuation continuation) {
            super(2, continuation);
            this.f125968v = aVar;
            this.f125969w = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f125968v, this.f125969w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131185M0;
            AbstractC28298d.m142578e();
            if (this.f125966t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC26611a abstractC26611a = AbstractC26611a.this;
                C31747a.a aVar = this.f125968v;
                m131185M0 = AbstractC25332a0.m131185M0(this.f125969w);
                abstractC26611a.m136581v0(aVar, m131185M0);
                AbstractC26611a.this.m136602r0(AbstractC26611a.this.mo111798R(this.f125969w));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ta0.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125970t;

        /* renamed from: v */
        final /* synthetic */ C31747a.a f125972v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f125973w;

        /* renamed from: x */
        final /* synthetic */ List f125974x;

        /* renamed from: y */
        final /* synthetic */ ToolStorageDetailPage.EnumC13333a f125975y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C31747a.a aVar, InterfaceC18494a interfaceC18494a, List list, ToolStorageDetailPage.EnumC13333a enumC13333a, Continuation continuation) {
            super(2, continuation);
            this.f125972v = aVar;
            this.f125973w = interfaceC18494a;
            this.f125974x = list;
            this.f125975y = enumC13333a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f125972v, this.f125973w, this.f125974x, this.f125975y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125970t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC26611a.this.f125957s.mo9221n(AbstractC29094b.m145339a(true));
                List m136587Y = AbstractC26611a.this.m136587Y();
                List list = this.f125974x;
                ToolStorageDetailPage.EnumC13333a enumC13333a = this.f125975y;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m136587Y) {
                    if (list.contains(((C13380a) obj2).m75084f(enumC13333a))) {
                        arrayList.add(obj2);
                    }
                }
                AbstractC26611a abstractC26611a = AbstractC26611a.this;
                C31747a.a aVar = this.f125972v;
                this.f125970t = 1;
                if (abstractC26611a.m136579S(aVar, arrayList, this) == m142578e) {
                    return m142578e;
                }
            }
            this.f125973w.mo12V4();
            AbstractC26611a.this.f125957s.mo9221n(AbstractC29094b.m145339a(false));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ta0.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125976t;

        /* renamed from: v */
        final /* synthetic */ C31747a.a f125978v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f125979w;

        /* renamed from: ta0.a$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f125980t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f125981u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18494a interfaceC18494a, Continuation continuation) {
                super(2, continuation);
                this.f125981u = interfaceC18494a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f125981u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f125980t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f125981u.mo12V4();
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
        e(C31747a.a aVar, InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f125978v = aVar;
            this.f125979w = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f125978v, this.f125979w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125976t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        AbstractC26611a.this.f125957s.mo9221n(AbstractC29094b.m145339a(false));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC26611a.this.f125957s.mo9221n(AbstractC29094b.m145339a(true));
                AbstractC26611a abstractC26611a = AbstractC26611a.this;
                C31747a.a aVar = this.f125978v;
                ArrayList arrayList = new ArrayList(AbstractC26611a.this.f125960v);
                this.f125976t = 1;
                if (abstractC26611a.m136579S(aVar, arrayList, this) == m142578e) {
                    return m142578e;
                }
            }
            MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
            a aVar2 = new a(this.f125979w, null);
            this.f125976t = 2;
            if (BuildersKt.m112534g(m112681c, aVar2, this) == m142578e) {
                return m142578e;
            }
            AbstractC26611a.this.f125957s.mo9221n(AbstractC29094b.m145339a(false));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ta0.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125982t;

        /* renamed from: ta0.a$f$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f125984t;

            a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f125984t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_notexist));
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

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125982t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C13380a c13380a = (C13380a) new ArrayList(AbstractC26611a.this.f125960v).get(0);
                C17945a0 m75089k = c13380a.m75089k();
                if (m75089k == null) {
                    m75089k = AbstractC23306f.m120584H0().m2635r(c13380a.m75090l());
                }
                AbstractC26611a.this.f125952D.mo9221n(m75089k);
                if (m75089k == null) {
                    MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                    a aVar = new a(null);
                    this.f125982t = 1;
                    if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ta0.a$g */
    /* loaded from: classes6.dex */
    public static final class g implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f125985p;

        g(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f125985p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f125985p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f125985p.mo205i9(obj);
        }
    }

    /* renamed from: ta0.a$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31747a.a f125986A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC18509p f125987B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC18505l f125988C;

        /* renamed from: t */
        Object f125989t;

        /* renamed from: u */
        Object f125990u;

        /* renamed from: v */
        Object f125991v;

        /* renamed from: w */
        Object f125992w;

        /* renamed from: x */
        Object f125993x;

        /* renamed from: y */
        int f125994y;

        /* renamed from: ta0.a$h$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f125996q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Long mo205i9(C13380a c13380a) {
                long m75087i;
                AbstractC19074t.m100208f(c13380a, "it");
                if (!c13380a.m75071A() && !c13380a.m75097s()) {
                    m75087i = 0;
                } else {
                    m75087i = c13380a.m75087i();
                }
                return Long.valueOf(m75087i);
            }
        }

        /* renamed from: ta0.a$h$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f125997q = new b();

            b() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Long mo205i9(C13380a c13380a) {
                long j11;
                AbstractC19074t.m100208f(c13380a, "it");
                if (c13380a.m75075E()) {
                    j11 = c13380a.m75087i();
                } else {
                    j11 = 0;
                }
                return Long.valueOf(j11);
            }
        }

        /* renamed from: ta0.a$h$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f125998q = new c();

            c() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Long mo205i9(C13380a c13380a) {
                long j11;
                AbstractC19074t.m100208f(c13380a, "it");
                if (c13380a.m75076F()) {
                    j11 = c13380a.m75087i();
                } else {
                    j11 = 0;
                }
                return Long.valueOf(j11);
            }
        }

        /* renamed from: ta0.a$h$d */
        /* loaded from: classes6.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final d f125999q = new d();

            d() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Long mo205i9(C13380a c13380a) {
                long j11;
                AbstractC19074t.m100208f(c13380a, "it");
                if (c13380a.m75100v()) {
                    j11 = c13380a.m75087i();
                } else {
                    j11 = 0;
                }
                return Long.valueOf(j11);
            }
        }

        /* renamed from: ta0.a$h$e */
        /* loaded from: classes6.dex */
        public static final class e extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f126000t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f126001u;

            /* renamed from: v */
            final /* synthetic */ List f126002v;

            /* renamed from: w */
            final /* synthetic */ C19055h0 f126003w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(InterfaceC18509p interfaceC18509p, List list, C19055h0 c19055h0, Continuation continuation) {
                super(2, continuation);
                this.f126001u = interfaceC18509p;
                this.f126002v = list;
                this.f126003w = c19055h0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new e(this.f126001u, this.f126002v, this.f126003w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f126000t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f126001u.mo240pC(AbstractC29094b.m145341c(this.f126002v.size()), AbstractC29094b.m145341c(this.f126003w.f94931p));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: ta0.a$h$f */
        /* loaded from: classes6.dex */
        public static final class f extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f126004t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f126005u;

            /* renamed from: v */
            final /* synthetic */ List f126006v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(InterfaceC18505l interfaceC18505l, List list, Continuation continuation) {
                super(2, continuation);
                this.f126005u = interfaceC18505l;
                this.f126006v = list;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new f(this.f126005u, this.f126006v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f126004t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f126005u.mo205i9(AbstractC29094b.m145341c(this.f126006v.size()));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: ta0.a$h$g */
        /* loaded from: classes6.dex */
        public /* synthetic */ class g {

            /* renamed from: a */
            public static final /* synthetic */ int[] f126007a;

            static {
                int[] iArr = new int[C31747a.a.values().length];
                try {
                    iArr[C31747a.a.f145824u.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C31747a.a.f145825v.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f126007a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C31747a.a aVar, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f125986A = aVar;
            this.f125987B = interfaceC18509p;
            this.f125988C = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f125986A, this.f125987B, this.f125988C, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131185M0;
            C19055h0 c19055h0;
            List list;
            Iterator it;
            InterfaceC18509p interfaceC18509p;
            SensitiveData sensitiveData;
            h hVar;
            int i11;
            int i12;
            LinkedHashMap linkedHashMap;
            int i13;
            int i14;
            m142578e = AbstractC28298d.m142578e();
            int i15 = this.f125994y;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f125993x;
                interfaceC18509p = (InterfaceC18509p) this.f125992w;
                sensitiveData = (SensitiveData) this.f125991v;
                list = (List) this.f125990u;
                c19055h0 = (C19055h0) this.f125989t;
                AbstractC24862s.m129228b(obj);
                hVar = this;
            } else {
                AbstractC24862s.m129228b(obj);
                HashSet hashSet = AbstractC26611a.this.f125960v;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : hashSet) {
                    String m75091m = ((C13380a) obj2).m75091m();
                    Object obj3 = linkedHashMap2.get(m75091m);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap2.put(m75091m, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList();
                for (String str : linkedHashMap2.keySet()) {
                    List list2 = (List) linkedHashMap2.get(str);
                    if (list2 == null) {
                        linkedHashMap = linkedHashMap2;
                    } else {
                        List<C13380a> list3 = list2;
                        boolean z11 = list3 instanceof Collection;
                        if (z11 && list3.isEmpty()) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (C13380a c13380a : list3) {
                                if (c13380a.m75071A() || c13380a.m75097s()) {
                                    i11++;
                                    if (i11 < 0) {
                                        AbstractC25368s.m131508p();
                                    }
                                }
                            }
                        }
                        long j11 = i11;
                        List list4 = list2;
                        long m98345a = AbstractC18611a.m98345a(list4, a.f125996q);
                        if (z11 && list3.isEmpty()) {
                            linkedHashMap = linkedHashMap2;
                            i12 = 0;
                        } else {
                            Iterator it2 = list3.iterator();
                            i12 = 0;
                            while (it2.hasNext()) {
                                if (((C13380a) it2.next()).m75075E() && (i12 = i12 + 1) < 0) {
                                    AbstractC25368s.m131508p();
                                }
                            }
                            linkedHashMap = linkedHashMap2;
                        }
                        long j12 = i12;
                        long m98345a2 = AbstractC18611a.m98345a(list4, b.f125997q);
                        if (z11 && list3.isEmpty()) {
                            i13 = 0;
                        } else {
                            Iterator it3 = list3.iterator();
                            i13 = 0;
                            while (it3.hasNext()) {
                                if (((C13380a) it3.next()).m75076F() && (i13 = i13 + 1) < 0) {
                                    AbstractC25368s.m131508p();
                                }
                            }
                        }
                        long j13 = i13;
                        long m98345a3 = AbstractC18611a.m98345a(list4, c.f125998q);
                        if (z11 && list3.isEmpty()) {
                            i14 = 0;
                        } else {
                            Iterator it4 = list3.iterator();
                            i14 = 0;
                            while (it4.hasNext()) {
                                if (((C13380a) it4.next()).m75100v() && (i14 = i14 + 1) < 0) {
                                    AbstractC25368s.m131508p();
                                }
                            }
                        }
                        arrayList.add(new ThreadStorageInfo(str, null, null, 0L, 0L, 0L, j11, m98345a, j13, m98345a3, j12, m98345a2, i14, AbstractC18611a.m98345a(list4, d.f125999q), 0L, 0L, 0L, 0L, 245822, null));
                    }
                    linkedHashMap2 = linkedHashMap;
                }
                int i16 = g.f126007a[this.f125986A.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        C31747a.m152717p(this.f125986A, arrayList);
                    } else {
                        C26676b.f126324a.m136996i0(false, arrayList);
                    }
                } else {
                    C26676b.f126324a.m136996i0(true, arrayList);
                }
                C19055h0 c19055h02 = new C19055h0();
                m131185M0 = AbstractC25332a0.m131185M0(AbstractC26611a.this.f125960v);
                List m144302a = AbstractC28862a.m144302a(m131185M0);
                SensitiveData sensitiveData2 = new SensitiveData("gallery_save_media_tool_storage", "tool_storage", null, 4, null);
                InterfaceC18509p interfaceC18509p2 = this.f125987B;
                c19055h0 = c19055h02;
                list = m144302a;
                it = m144302a.iterator();
                interfaceC18509p = interfaceC18509p2;
                sensitiveData = sensitiveData2;
                hVar = this;
            }
            while (it.hasNext()) {
                C17945a0 c17945a0 = (C17945a0) it.next();
                if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                    if (c17945a0.m95306y8()) {
                        c17945a0.m95084aa(false, sensitiveData);
                    } else if (c17945a0.m95316z8()) {
                        c17945a0.m95102ca(-1, "", AbstractC29094b.m145339a(false));
                    } else if (c17945a0.m95276v6()) {
                        c17945a0.m95194m2(c17945a0.m94983Q3(), false);
                    }
                } else if (c17945a0.m94864C6()) {
                    c17945a0.m95222p2(false, sensitiveData);
                } else {
                    c17945a0.m95231q2(false, sensitiveData);
                }
                c19055h0.f94931p++;
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                e eVar = new e(interfaceC18509p, list, c19055h0, null);
                hVar.f125989t = c19055h0;
                hVar.f125990u = list;
                hVar.f125991v = sensitiveData;
                hVar.f125992w = interfaceC18509p;
                hVar.f125993x = it;
                hVar.f125994y = 1;
                if (BuildersKt.m112534g(m112681c, eVar, hVar) == m142578e) {
                    return m142578e;
                }
            }
            MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
            f fVar = new f(hVar.f125988C, list, null);
            hVar.f125989t = null;
            hVar.f125990u = null;
            hVar.f125991v = null;
            hVar.f125992w = null;
            hVar.f125993x = null;
            hVar.f125994y = 2;
            if (BuildersKt.m112534g(m112681c2, fVar, hVar) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ta0.a$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C13380a f126008q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C13380a c13380a) {
            super(1);
            this.f126008q = c13380a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c13380a.m75081a(), this.f126008q.m75081a()));
        }
    }

    /* renamed from: ta0.a$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f126009q = new j();

        j() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Long mo205i9(C13380a c13380a) {
            long m75087i;
            AbstractC19074t.m100208f(c13380a, "it");
            if (!c13380a.m75071A() && !c13380a.m75097s()) {
                m75087i = 0;
            } else {
                m75087i = c13380a.m75087i();
            }
            return Long.valueOf(m75087i);
        }
    }

    /* renamed from: ta0.a$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f126010q = new k();

        k() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Long mo205i9(C13380a c13380a) {
            long j11;
            AbstractC19074t.m100208f(c13380a, "it");
            if (c13380a.m75075E()) {
                j11 = c13380a.m75087i();
            } else {
                j11 = 0;
            }
            return Long.valueOf(j11);
        }
    }

    /* renamed from: ta0.a$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f126011q = new l();

        l() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Long mo205i9(C13380a c13380a) {
            long j11;
            AbstractC19074t.m100208f(c13380a, "it");
            if (c13380a.m75076F()) {
                j11 = c13380a.m75087i();
            } else {
                j11 = 0;
            }
            return Long.valueOf(j11);
        }
    }

    /* renamed from: ta0.a$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final m f126012q = new m();

        m() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Long mo205i9(C13380a c13380a) {
            long j11;
            AbstractC19074t.m100208f(c13380a, "it");
            if (c13380a.m75100v()) {
                j11 = c13380a.m75087i();
            } else {
                j11 = 0;
            }
            return Long.valueOf(j11);
        }
    }

    /* renamed from: ta0.a$n */
    /* loaded from: classes6.dex */
    public static final class n extends C1755a0 {

        /* renamed from: m */
        private List f126013m;

        /* renamed from: n */
        private String f126014n = "Largest";

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ta0.a$n$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {
            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m136630a(List list) {
                n.this.m136629v(list);
                n nVar = n.this;
                nVar.mo9224q(AbstractC24866w.m129235a(nVar.m136626s(), list));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136630a((List) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ta0.a$n$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {
            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m136631a(String str) {
                n nVar = n.this;
                AbstractC19074t.m100205c(str);
                nVar.m136628u(str);
                n nVar2 = n.this;
                nVar2.mo9224q(AbstractC24866w.m129235a(str, nVar2.m136627t()));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136631a((String) obj);
                return C24848g0.f119245a;
            }
        }

        n(AbstractC26611a abstractC26611a) {
            m9256r(abstractC26611a.m136594g0(), new g(new a()));
            m9256r(abstractC26611a.m136585W(), new g(new b()));
        }

        /* renamed from: s */
        public final String m136626s() {
            return this.f126014n;
        }

        /* renamed from: t */
        public final List m136627t() {
            return this.f126013m;
        }

        /* renamed from: u */
        public final void m136628u(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f126014n = str;
        }

        /* renamed from: v */
        public final void m136629v(List list) {
            this.f126013m = list;
        }
    }

    public AbstractC26611a() {
        C1761c0 c1761c0 = new C1761c0();
        this.f125958t = c1761c0;
        this.f125959u = c1761c0;
        this.f125960v = new HashSet();
        C1761c0 c1761c02 = new C1761c0(new C24860q(0, ""));
        this.f125961w = c1761c02;
        this.f125962x = c1761c02;
        C1761c0 c1761c03 = new C1761c0("Largest");
        this.f125963y = c1761c03;
        this.f125964z = c1761c03;
        Boolean bool = Boolean.FALSE;
        this.f125949A = new C1761c0(bool);
        C1761c0 c1761c04 = new C1761c0(bool);
        this.f125950B = c1761c04;
        this.f125951C = c1761c04;
        C1761c0 c1761c05 = new C1761c0(null);
        this.f125952D = c1761c05;
        this.f125953E = c1761c05;
        this.f125955G = "All";
        this.f125956H = new n(this);
    }

    /* renamed from: S */
    public final Object m136579S(C31747a.a aVar, List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new c(aVar, list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: m0 */
    private final void m136580m0() {
        int size = this.f125960v.size();
        Iterator it = this.f125960v.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((C13380a) it.next()).m75087i();
        }
        this.f125961w.mo9221n(new C24860q(Integer.valueOf(size), C21459a.m111038f(j11, 0, 2, null)));
    }

    /* renamed from: v0 */
    public final void m136581v0(C31747a.a aVar, List list) {
        Object m131206f0;
        int i11;
        int i12;
        int i13;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String m75091m = ((C13380a) obj).m75091m();
                Object obj2 = linkedHashMap.get(m75091m);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m75091m, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.keySet().iterator();
            while (true) {
                int i14 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                List list2 = (List) linkedHashMap.get(str);
                if (list2 != null) {
                    List<C13380a> list3 = list2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (C13380a c13380a : list3) {
                            if (c13380a.m75071A() || c13380a.m75097s()) {
                                i11++;
                                if (i11 < 0) {
                                    AbstractC25368s.m131508p();
                                }
                            }
                        }
                    }
                    long j11 = i11;
                    long m98345a = AbstractC18611a.m98345a(list2, j.f126009q);
                    List list4 = list2;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        i12 = 0;
                    } else {
                        Iterator it2 = list4.iterator();
                        i12 = 0;
                        while (it2.hasNext()) {
                            if (((C13380a) it2.next()).m75075E() && (i12 = i12 + 1) < 0) {
                                AbstractC25368s.m131508p();
                            }
                        }
                    }
                    long j12 = i12;
                    long m98345a2 = AbstractC18611a.m98345a(list2, k.f126010q);
                    List list5 = list2;
                    if ((list5 instanceof Collection) && list5.isEmpty()) {
                        i13 = 0;
                    } else {
                        Iterator it3 = list5.iterator();
                        i13 = 0;
                        while (it3.hasNext()) {
                            if (((C13380a) it3.next()).m75076F() && (i13 = i13 + 1) < 0) {
                                AbstractC25368s.m131508p();
                            }
                        }
                    }
                    long j13 = i13;
                    long m98345a3 = AbstractC18611a.m98345a(list2, l.f126011q);
                    List list6 = list2;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it4 = list6.iterator();
                        while (it4.hasNext()) {
                            if (((C13380a) it4.next()).m75100v() && (i14 = i14 + 1) < 0) {
                                AbstractC25368s.m131508p();
                            }
                        }
                    }
                    arrayList.add(new ThreadStorageInfo(str, null, null, 0L, 0L, 0L, j11, m98345a, j13, m98345a3, j12, m98345a2, i14, AbstractC18611a.m98345a(list2, m.f126012q), 0L, 0L, 0L, 0L, 245822, null));
                }
            }
            switch (b.f125965a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    C31747a.m152714m(aVar, arrayList, true);
                    return;
                case 4:
                    m131206f0 = AbstractC25332a0.m131206f0(arrayList);
                    ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) m131206f0;
                    if (threadStorageInfo == null) {
                        return;
                    }
                    C21956b.m114660j(threadStorageInfo);
                    return;
                case 5:
                    C26676b.f126324a.m136995h0(true, arrayList);
                    return;
                case 6:
                    C26676b.f126324a.m136995h0(false, arrayList);
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("StorageDetailManagementViewModelBase", e11);
        }
    }

    /* renamed from: R */
    public abstract List mo111798R(List list);

    /* renamed from: T */
    public final void m136582T(C31747a.a aVar, List list, ToolStorageDetailPage.EnumC13333a enumC13333a, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(list, "ids");
        AbstractC19074t.m100208f(enumC13333a, "accessFlow");
        AbstractC19074t.m100208f(interfaceC18494a, "onComplete");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(aVar, interfaceC18494a, list, enumC13333a, null), 3, null);
    }

    /* renamed from: U */
    public final void m136583U(C31747a.a aVar, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(interfaceC18494a, "onComplete");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(aVar, interfaceC18494a, null), 3, null);
    }

    /* renamed from: V */
    public final String m136584V() {
        return this.f125955G;
    }

    /* renamed from: W */
    public final LiveData m136585W() {
        return this.f125964z;
    }

    /* renamed from: X */
    public final String m136586X() {
        String str = (String) this.f125964z.mo9215f();
        if (str == null) {
            return "Largest";
        }
        return str;
    }

    /* renamed from: Y */
    public final List m136587Y() {
        List m131502j;
        List list = (List) this.f125959u.mo9215f();
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    /* renamed from: Z */
    public final LiveData m136588Z() {
        return this.f125953E;
    }

    /* renamed from: a0 */
    public final C24860q m136589a0() {
        C24860q c24860q = (C24860q) this.f125962x.mo9215f();
        if (c24860q == null) {
            return new C24860q(0, "");
        }
        return c24860q;
    }

    /* renamed from: b0 */
    public final HashSet m136590b0() {
        return this.f125960v;
    }

    /* renamed from: c0 */
    public final LiveData m136591c0() {
        return this.f125962x;
    }

    /* renamed from: e0 */
    public final LiveData m136592e0() {
        return this.f125957s;
    }

    /* renamed from: f0 */
    public final LiveData m136593f0() {
        return this.f125951C;
    }

    /* renamed from: g0 */
    public final LiveData m136594g0() {
        return this.f125959u;
    }

    /* renamed from: h0 */
    public final LiveData m136595h0() {
        return this.f125956H;
    }

    /* renamed from: i0 */
    public final boolean m136596i0() {
        return this.f125954F;
    }

    /* renamed from: j0 */
    public final LiveData m136597j0() {
        return this.f125949A;
    }

    /* renamed from: k0 */
    public final void m136598k0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new f(null), 2, null);
    }

    /* renamed from: l0 */
    public final void m136599l0(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f125958t.mo9221n(list);
    }

    /* renamed from: n0 */
    public final void m136600n0(C31747a.a aVar, InterfaceC18494a interfaceC18494a, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(aVar, "sourceType");
        AbstractC19074t.m100208f(interfaceC18494a, "onStart");
        AbstractC19074t.m100208f(interfaceC18509p, "onDownloadedItem");
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        interfaceC18494a.mo12V4();
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new h(aVar, interfaceC18509p, interfaceC18505l, null), 2, null);
    }

    /* renamed from: o0 */
    public void mo111804o0(String str) {
        AbstractC19074t.m100208f(str, "tabType");
        this.f125955G = str;
    }

    /* renamed from: p0 */
    public final void m136601p0(boolean z11) {
        this.f125954F = z11;
    }

    /* renamed from: q0 */
    public void mo111805q0(String str) {
        AbstractC19074t.m100208f(str, "filterType");
        this.f125963y.mo9221n(str);
    }

    /* renamed from: r0 */
    public final void m136602r0(List list) {
        AbstractC19074t.m100208f(list, "newList");
        this.f125958t.mo9221n(list);
        m136580m0();
    }

    /* renamed from: s0 */
    public final void m136603s0(List list, boolean z11) {
        if (z11) {
            HashSet hashSet = this.f125960v;
            if (list == null) {
                list = AbstractC25368s.m131502j();
            }
            hashSet.addAll(list);
        } else {
            Iterator it = this.f125960v.iterator();
            while (it.hasNext()) {
                ((C13380a) it.next()).m75079I(false);
            }
            this.f125960v.clear();
        }
        m136607y0(z11);
        m136580m0();
    }

    /* renamed from: t0 */
    public final void m136604t0(C13380a c13380a) {
        AbstractC19074t.m100208f(c13380a, "storageUsageDetailItem");
        if (!c13380a.m75073C()) {
            AbstractC25378x.m131541C(this.f125960v, new i(c13380a));
        } else {
            this.f125960v.add(c13380a);
        }
        m136580m0();
    }

    /* renamed from: u0 */
    public final void m136605u0(boolean z11) {
        this.f125950B.mo9221n(Boolean.valueOf(z11));
    }

    /* renamed from: w0 */
    public abstract List mo111806w0(List list);

    /* renamed from: x0 */
    public final void m136606x0(MessageId messageId, String str, boolean z11) {
        C17945a0 m75089k;
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "path");
        List m136587Y = m136587Y();
        ArrayList<C13380a> arrayList = new ArrayList();
        for (Object obj : m136587Y) {
            if (AbstractC19074t.m100204b(((C13380a) obj).m75090l(), messageId)) {
                arrayList.add(obj);
            }
        }
        for (C13380a c13380a : arrayList) {
            if (!z11 && (m75089k = c13380a.m75089k()) != null) {
                m75089k.m94934Ka(str);
            }
        }
    }

    /* renamed from: y0 */
    public final void m136607y0(boolean z11) {
        if (!AbstractC19074t.m100204b(m136597j0().mo9215f(), Boolean.valueOf(z11))) {
            this.f125949A.mo9221n(Boolean.valueOf(z11));
        }
    }
}
