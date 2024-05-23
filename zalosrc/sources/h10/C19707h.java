package h10;

import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import e10.InterfaceC18165b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h10.C19714o;
import i10.C20186b;
import i10.InterfaceC20185a;
import j10.C20901a;
import j10.C20902b;
import j10.C20903c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.C21435b;
import k10.InterfaceC21434a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import p10.AbstractC24599c;
import p10.C24603g;
import p10.C24608l;
import p10.EnumC24604h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: h10.h */
/* loaded from: classes5.dex */
public final class C19707h implements C19714o.a, InterfaceC21434a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC18165b f97741a;

    /* renamed from: b */
    private final C24603g f97742b;

    /* renamed from: c */
    private final C21435b f97743c;

    /* renamed from: d */
    private final C19706g f97744d;

    /* renamed from: e */
    private final InterfaceC20185a f97745e;

    /* renamed from: f */
    private final LiveChanelStats f97746f;

    /* renamed from: g */
    private final CoroutineScope f97747g;

    /* renamed from: h */
    private final C20903c f97748h;

    /* renamed from: i */
    private final C20902b f97749i;

    /* renamed from: j */
    private final C20901a f97750j;

    /* renamed from: k */
    private boolean f97751k;

    /* renamed from: l */
    private InterfaceC19713n f97752l;

    /* renamed from: m */
    private Job f97753m;

    /* renamed from: n */
    private String f97754n;

    /* renamed from: o */
    private String f97755o;

    /* renamed from: p */
    private long f97756p;

    /* renamed from: q */
    private boolean f97757q;

    /* renamed from: r */
    private boolean f97758r;

    /* renamed from: s */
    private StreamData f97759s;

    /* renamed from: h10.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97760t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f97761u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f97761u = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f97761u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f97760t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l = this.f97761u;
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(AbstractC29094b.m145339a(true));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m103432r(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* renamed from: r */
        public final Object m103432r(boolean z11, Continuation continuation) {
            return ((b) mo238a(Boolean.valueOf(z11), continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f97762s;

        /* renamed from: t */
        Object f97763t;

        /* renamed from: u */
        /* synthetic */ Object f97764u;

        /* renamed from: w */
        int f97766w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f97764u = obj;
            this.f97766w |= Integer.MIN_VALUE;
            return C19707h.this.m103412w(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97767t;

        /* renamed from: v */
        final /* synthetic */ String f97769v;

        /* renamed from: w */
        final /* synthetic */ List f97770w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f97769v = str;
            this.f97770w = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f97769v, this.f97770w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131187O0;
            AbstractC28298d.m142578e();
            if (this.f97767t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC19713n interfaceC19713n = C19707h.this.f97752l;
                if (interfaceC19713n != null) {
                    String str = this.f97769v;
                    m131187O0 = AbstractC25332a0.m131187O0(this.f97770w);
                    interfaceC19713n.mo53275l(str, m131187O0);
                    return C24848g0.f119245a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f97771s;

        /* renamed from: u */
        int f97773u;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f97771s = obj;
            this.f97773u |= Integer.MIN_VALUE;
            return C19707h.this.m103413y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f97774s;

        /* renamed from: t */
        Object f97775t;

        /* renamed from: u */
        Object f97776u;

        /* renamed from: v */
        boolean f97777v;

        /* renamed from: w */
        boolean f97778w;

        /* renamed from: x */
        /* synthetic */ Object f97779x;

        /* renamed from: z */
        int f97781z;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f97779x = obj;
            this.f97781z |= Integer.MIN_VALUE;
            return C19707h.this.m103395A(null, false, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97782t;

        /* renamed from: v */
        final /* synthetic */ String f97784v;

        /* renamed from: w */
        final /* synthetic */ StreamData.Stat f97785w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, StreamData.Stat stat, Continuation continuation) {
            super(2, continuation);
            this.f97784v = str;
            this.f97785w = stat;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f97784v, this.f97785w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            long j11;
            long j12;
            Long m51699a;
            Long m51700b;
            AbstractC28298d.m142578e();
            if (this.f97782t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC19713n interfaceC19713n = C19707h.this.f97752l;
                if (interfaceC19713n != null) {
                    String str = this.f97784v;
                    StreamData.Stat stat = this.f97785w;
                    if (stat != null && (m51700b = stat.m51700b()) != null) {
                        j11 = m51700b.longValue();
                    } else {
                        j11 = 0;
                    }
                    StreamData.Stat stat2 = this.f97785w;
                    if (stat2 != null && (m51699a = stat2.m51699a()) != null) {
                        j12 = m51699a.longValue();
                    } else {
                        j12 = 2;
                    }
                    interfaceC19713n.mo53271g(str, j11, j12);
                    return C24848g0.f119245a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h10.h$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97786t;

        /* renamed from: v */
        final /* synthetic */ String f97788v;

        /* renamed from: w */
        final /* synthetic */ long f97789w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18509p f97790x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f97788v = str;
            this.f97789w = j11;
            this.f97790x = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f97788v, this.f97789w, this.f97790x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97786t;
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
                InterfaceC18165b interfaceC18165b = C19707h.this.f97741a;
                String str = this.f97788v;
                long j11 = this.f97789w;
                this.f97786t = 1;
                obj = interfaceC18165b.mo96480c(str, j11, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C24608l c24608l = (C24608l) obj;
            InterfaceC18509p interfaceC18509p = this.f97790x;
            if (interfaceC18509p != null) {
                Boolean m145339a = AbstractC29094b.m145339a(c24608l.m128100b());
                this.f97786t = 2;
                if (interfaceC18509p.mo240pC(m145339a, this) == m142578e) {
                    return m142578e;
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

    /* renamed from: h10.h$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97791t;

        /* renamed from: v */
        final /* synthetic */ List f97793v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, Continuation continuation) {
            super(2, continuation);
            this.f97793v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f97793v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            EnumC24604h enumC24604h;
            AbstractC28298d.m142578e();
            if (this.f97791t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC19711l m103391e = C19707h.this.f97744d.m103391e(this.f97793v);
                if (m103391e != null) {
                    enumC24604h = m103391e.mo103449c();
                } else {
                    enumC24604h = null;
                }
                if (enumC24604h == EnumC24604h.f118389t) {
                    C19707h.this.f97743c.m110963i(m103391e.m103451b(), 60000L);
                }
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

    /* renamed from: h10.h$j */
    /* loaded from: classes5.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97794t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97794t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19707h c19707h = C19707h.this;
                String str = c19707h.f97754n;
                this.f97794t = 1;
                if (c19707h.m103395A(str, false, true, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$k */
    /* loaded from: classes5.dex */
    static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97796t;

        k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97796t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19707h c19707h = C19707h.this;
                String str = c19707h.f97754n;
                this.f97796t = 1;
                if (c19707h.m103395A(str, false, true, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m103438r(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* renamed from: r */
        public final Object m103438r(boolean z11, Continuation continuation) {
            return ((k) mo238a(Boolean.valueOf(z11), continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$l */
    /* loaded from: classes5.dex */
    static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97798t;

        /* renamed from: v */
        final /* synthetic */ String f97800v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, Continuation continuation) {
            super(2, continuation);
            this.f97800v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f97800v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f97798t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC19713n interfaceC19713n = C19707h.this.f97752l;
                if (interfaceC19713n != null) {
                    interfaceC19713n.mo53267c(this.f97800v);
                }
                C19707h.this.f97743c.m110965k();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$m */
    /* loaded from: classes5.dex */
    static final class m extends AbstractC19075u implements InterfaceC18505l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m103440a(List list) {
            Object m131207g0;
            AbstractC19074t.m100208f(list, "comments");
            int size = list.size();
            while (true) {
                size--;
                if (-1 < size) {
                    m131207g0 = AbstractC25332a0.m131207g0(list, size);
                    GetCommentLiveRes.CommentData commentData = (GetCommentLiveRes.CommentData) m131207g0;
                    if (commentData != null) {
                        C19707h.this.f97745e.mo105289d(C19701b.Companion.m103382a(commentData));
                    }
                } else {
                    return;
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m103440a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: h10.h$n */
    /* loaded from: classes5.dex */
    static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97802t;

        /* renamed from: v */
        final /* synthetic */ String f97804v;

        /* renamed from: w */
        final /* synthetic */ int f97805w;

        /* renamed from: x */
        final /* synthetic */ int f97806x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC18505l f97807y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h10.h$n$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f97808t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f97809u;

            /* renamed from: v */
            final /* synthetic */ String f97810v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, String str, Continuation continuation) {
                super(2, continuation);
                this.f97809u = interfaceC18505l;
                this.f97810v = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f97809u, this.f97810v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f97808t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f97809u.mo205i9(this.f97810v);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, int i11, int i12, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f97804v = str;
            this.f97805w = i11;
            this.f97806x = i12;
            this.f97807y = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f97804v, this.f97805w, this.f97806x, this.f97807y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97802t;
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
                InterfaceC18165b interfaceC18165b = C19707h.this.f97741a;
                String str = this.f97804v;
                int i12 = this.f97805w;
                int i13 = this.f97806x;
                this.f97802t = 1;
                if (interfaceC18165b.mo96478a(str, i12, i13, this) == m142578e) {
                    return m142578e;
                }
            }
            MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
            a aVar = new a(this.f97807y, this.f97804v, null);
            this.f97802t = 2;
            if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$o */
    /* loaded from: classes5.dex */
    static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC18509p f97811A;

        /* renamed from: B */
        final /* synthetic */ C9440a f97812B;

        /* renamed from: t */
        Object f97813t;

        /* renamed from: u */
        int f97814u;

        /* renamed from: w */
        final /* synthetic */ String f97816w;

        /* renamed from: x */
        final /* synthetic */ String f97817x;

        /* renamed from: y */
        final /* synthetic */ int f97818y;

        /* renamed from: z */
        final /* synthetic */ long f97819z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h10.h$o$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f97820t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f97821u;

            /* renamed from: v */
            final /* synthetic */ C24608l f97822v;

            /* renamed from: w */
            final /* synthetic */ C9440a f97823w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18509p interfaceC18509p, C24608l c24608l, C9440a c9440a, Continuation continuation) {
                super(2, continuation);
                this.f97821u = interfaceC18509p;
                this.f97822v = c24608l;
                this.f97823w = c9440a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f97821u, this.f97822v, this.f97823w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f97820t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f97821u.mo240pC(this.f97822v.m128099a(), this.f97823w);
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
        /* renamed from: h10.h$o$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f97824t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f97825u;

            /* renamed from: v */
            final /* synthetic */ C24608l f97826v;

            /* renamed from: w */
            final /* synthetic */ C9440a f97827w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC18509p interfaceC18509p, C24608l c24608l, C9440a c9440a, Continuation continuation) {
                super(2, continuation);
                this.f97825u = interfaceC18509p;
                this.f97826v = c24608l;
                this.f97827w = c9440a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f97825u, this.f97826v, this.f97827w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f97824t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f97825u.mo240pC(this.f97826v.m128099a(), this.f97827w);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, int i11, long j11, InterfaceC18509p interfaceC18509p, C9440a c9440a, Continuation continuation) {
            super(2, continuation);
            this.f97816w = str;
            this.f97817x = str2;
            this.f97818y = i11;
            this.f97819z = j11;
            this.f97811A = interfaceC18509p;
            this.f97812B = c9440a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(this.f97816w, this.f97817x, this.f97818y, this.f97819z, this.f97811A, this.f97812B, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00ab A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C24608l c24608l;
            Long l11;
            MainCoroutineDispatcher m112681c;
            b bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97814u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c24608l = (C24608l) this.f97813t;
                            AbstractC24862s.m129228b(obj);
                            m112681c = Dispatchers.m112681c();
                            bVar = new b(this.f97811A, c24608l, this.f97812B, null);
                            this.f97813t = null;
                            this.f97814u = 4;
                            if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18165b interfaceC18165b = C19707h.this.f97741a;
                String str = this.f97816w;
                String str2 = this.f97817x;
                int i12 = this.f97818y;
                long j11 = this.f97819z;
                this.f97814u = 1;
                obj = interfaceC18165b.mo96485h(str, str2, i12, j11, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            c24608l = (C24608l) obj;
            GetCommentLiveRes.CommentData commentData = (GetCommentLiveRes.CommentData) c24608l.m128099a();
            if (commentData != null) {
                l11 = commentData.m51643a();
            } else {
                l11 = null;
            }
            if (l11 != null) {
                C19707h.this.f97745e.mo105288c(new C19701b((GetCommentLiveRes.CommentData) c24608l.m128099a()));
                MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
                a aVar = new a(this.f97811A, c24608l, this.f97812B, null);
                this.f97814u = 2;
                if (BuildersKt.m112534g(m112681c2, aVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            this.f97813t = c24608l;
            this.f97814u = 3;
            if (DelayKt.m112666b(500L, this) == m142578e) {
                return m142578e;
            }
            m112681c = Dispatchers.m112681c();
            bVar = new b(this.f97811A, c24608l, this.f97812B, null);
            this.f97813t = null;
            this.f97814u = 4;
            if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$p */
    /* loaded from: classes5.dex */
    static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f97828t;

        /* renamed from: v */
        final /* synthetic */ String f97830v;

        /* renamed from: w */
        final /* synthetic */ boolean f97831w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f97830v = str;
            this.f97831w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f97830v, this.f97831w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:6:0x0052). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            p pVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f97828t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        Object obj2 = m142578e;
                        p pVar2 = this;
                        if (((Boolean) obj).booleanValue()) {
                            return C24848g0.f119245a;
                        }
                        pVar = pVar2;
                        m142578e = obj2;
                        if (!C19707h.this.f97751k) {
                            C19707h c19707h = C19707h.this;
                            pVar.f97828t = 2;
                            Object m103413y = c19707h.m103413y(pVar);
                            if (m103413y == m142578e) {
                                return m142578e;
                            }
                            Object obj3 = m142578e;
                            pVar2 = pVar;
                            obj = m103413y;
                            obj2 = obj3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            return C24848g0.f119245a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19707h c19707h2 = C19707h.this;
                String str = this.f97830v;
                boolean z11 = this.f97831w;
                this.f97828t = 1;
                obj = c19707h2.m103395A(str, z11, false, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C19707h.this.f97757q = true;
            pVar = this;
            if (!C19707h.this.f97751k) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: h10.h$q */
    /* loaded from: classes5.dex */
    static final class q extends AbstractC19075u implements InterfaceC18505l {
        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m103447a(boolean z11) {
            C19707h.this.f97741a.mo96486i();
            JobKt__JobKt.m112768g(C19707h.this.f97747g.mo9207O(), null, 1, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m103447a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public C19707h(InterfaceC18165b interfaceC18165b, C24603g c24603g, C21435b c21435b, C19706g c19706g, InterfaceC20185a interfaceC20185a, LiveChanelStats liveChanelStats, CoroutineScope coroutineScope, C20903c c20903c, C20902b c20902b, C20901a c20901a) {
        AbstractC19074t.m100208f(interfaceC18165b, "liveStreamRepo");
        AbstractC19074t.m100208f(c24603g, "convert");
        AbstractC19074t.m100208f(c21435b, "liveTimer");
        AbstractC19074t.m100208f(c19706g, "dispatcherToUi");
        AbstractC19074t.m100208f(interfaceC20185a, "eventPool");
        AbstractC19074t.m100208f(liveChanelStats, "uptodateStats");
        AbstractC19074t.m100208f(coroutineScope, "scope");
        AbstractC19074t.m100208f(c20903c, "intervalFetchStream");
        AbstractC19074t.m100208f(c20902b, "intervalFetchStats");
        AbstractC19074t.m100208f(c20901a, "intervalFetchComment");
        this.f97741a = interfaceC18165b;
        this.f97742b = c24603g;
        this.f97743c = c21435b;
        this.f97744d = c19706g;
        this.f97745e = interfaceC20185a;
        this.f97746f = liveChanelStats;
        this.f97747g = coroutineScope;
        this.f97748h = c20903c;
        this.f97749i = c20902b;
        this.f97750j = c20901a;
        c21435b.m110960f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m103395A(String str, boolean z11, boolean z12, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        Object obj;
        boolean z13;
        C19707h c19707h;
        C24608l c24608l;
        StreamData streamData;
        String str2;
        StreamData streamData2;
        StreamData.Stat stat;
        MainCoroutineDispatcher m112681c;
        g gVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f97781z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f97781z = i12 - Integer.MIN_VALUE;
                Object obj2 = fVar.f97779x;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f97781z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                StreamData streamData3 = (StreamData) fVar.f97774s;
                                AbstractC24862s.m129228b(obj2);
                                return streamData3;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        streamData2 = (StreamData) fVar.f97776u;
                        str2 = (String) fVar.f97775t;
                        c19707h = (C19707h) fVar.f97774s;
                        AbstractC24862s.m129228b(obj2);
                        streamData = streamData2;
                        str = str2;
                        c19707h.m103397I(str, streamData);
                        if (streamData != null) {
                            stat = streamData.m51694j();
                        } else {
                            stat = null;
                        }
                        m112681c = Dispatchers.m112681c();
                        gVar = new g(str, stat, null);
                        fVar.f97774s = streamData;
                        fVar.f97775t = null;
                        fVar.f97776u = null;
                        fVar.f97781z = 3;
                        if (BuildersKt.m112534g(m112681c, gVar, fVar) == m142578e) {
                            return m142578e;
                        }
                        return streamData;
                    }
                    boolean z14 = fVar.f97778w;
                    z11 = fVar.f97777v;
                    str = (String) fVar.f97775t;
                    C19707h c19707h2 = (C19707h) fVar.f97774s;
                    AbstractC24862s.m129228b(obj2);
                    z13 = z14;
                    c19707h = c19707h2;
                    obj = obj2;
                } else {
                    AbstractC24862s.m129228b(obj2);
                    if (str == null) {
                        return null;
                    }
                    this.f97758r = false;
                    InterfaceC18165b interfaceC18165b = this.f97741a;
                    fVar.f97774s = this;
                    fVar.f97775t = str;
                    fVar.f97777v = z11;
                    fVar.f97778w = z12;
                    fVar.f97781z = 1;
                    Object mo96483f = interfaceC18165b.mo96483f(str, fVar);
                    if (mo96483f == m142578e) {
                        return m142578e;
                    }
                    obj = mo96483f;
                    z13 = z12;
                    c19707h = this;
                }
                c24608l = (C24608l) obj;
                if (!c24608l.m128100b()) {
                    c19707h.f97758r = true;
                }
                streamData = (StreamData) c24608l.m128099a();
                c19707h.f97746f.m51606h(streamData);
                if (streamData != null) {
                    c19707h.f97759s = streamData;
                }
                if (!z11 && !z13) {
                    fVar.f97774s = c19707h;
                    fVar.f97775t = str;
                    fVar.f97776u = streamData;
                    fVar.f97781z = 2;
                    if (c19707h.m103412w(str, fVar) != m142578e) {
                        return m142578e;
                    }
                    str2 = str;
                    streamData2 = streamData;
                    streamData = streamData2;
                    str = str2;
                }
                c19707h.m103397I(str, streamData);
                if (streamData != null) {
                }
                m112681c = Dispatchers.m112681c();
                gVar = new g(str, stat, null);
                fVar.f97774s = streamData;
                fVar.f97775t = null;
                fVar.f97776u = null;
                fVar.f97781z = 3;
                if (BuildersKt.m112534g(m112681c, gVar, fVar) == m142578e) {
                }
            }
        }
        fVar = new f(continuation);
        Object obj22 = fVar.f97779x;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f97781z;
        if (i11 == 0) {
        }
        c24608l = (C24608l) obj;
        if (!c24608l.m128100b()) {
        }
        streamData = (StreamData) c24608l.m128099a();
        c19707h.f97746f.m51606h(streamData);
        if (streamData != null) {
        }
        if (!z11) {
            fVar.f97774s = c19707h;
            fVar.f97775t = str;
            fVar.f97776u = streamData;
            fVar.f97781z = 2;
            if (c19707h.m103412w(str, fVar) != m142578e) {
            }
        }
        c19707h.m103397I(str, streamData);
        if (streamData != null) {
        }
        m112681c = Dispatchers.m112681c();
        gVar = new g(str, stat, null);
        fVar.f97774s = streamData;
        fVar.f97775t = null;
        fVar.f97776u = null;
        fVar.f97781z = 3;
        if (BuildersKt.m112534g(m112681c, gVar, fVar) == m142578e) {
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m103396C(C19707h c19707h, String str, String str2, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC18509p = null;
        }
        c19707h.m103414B(str, str2, interfaceC18509p);
    }

    /* renamed from: I */
    private final void m103397I(String str, StreamData streamData) {
        long j11;
        long j12;
        Long m51687c;
        Long m51695k;
        Long m51690f;
        String str2 = this.f97754n;
        if (str2 != null && str2.length() != 0) {
            long j13 = 2000;
            if (streamData != null && (m51690f = streamData.m51690f()) != null) {
                j11 = m51690f.longValue();
            } else {
                j11 = 2000;
            }
            if (streamData != null) {
                this.f97756p = System.currentTimeMillis();
            }
            if (j11 > 0) {
                this.f97743c.m110962h(str, j11);
            }
            if (streamData != null && (m51695k = streamData.m51695k()) != null) {
                j12 = m51695k.longValue();
            } else {
                j12 = 2000;
            }
            if (j12 > 0) {
                this.f97743c.m110964j(str, j12);
            }
            if (streamData != null && (m51687c = streamData.m51687c()) != null) {
                j13 = m51687c.longValue();
            }
            if (j13 > 0) {
                this.f97743c.m110961g(str, j13);
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m103410u(C19707h c19707h, boolean z11, String str, boolean z12, boolean z13, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = false;
        }
        if ((i11 & 16) != 0) {
            interfaceC18505l = null;
        }
        c19707h.m103429t(z11, str, z12, z13, interfaceC18505l);
    }

    /* renamed from: v */
    private final long m103411v() {
        long j11 = this.f97756p;
        if (j11 <= 0) {
            return 0L;
        }
        return System.currentTimeMillis() - j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m103412w(String str, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C19707h c19707h;
        GetCommentLiveRes getCommentLiveRes;
        List list;
        List list2;
        int m131511r;
        List m51638b;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f97766w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f97766w = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f97764u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f97766w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.f97763t;
                    c19707h = (C19707h) cVar.f97762s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (str != null && str.length() != 0) {
                        InterfaceC18165b interfaceC18165b = this.f97741a;
                        cVar.f97762s = this;
                        cVar.f97763t = str;
                        cVar.f97766w = 1;
                        obj = interfaceC18165b.mo96482e(str, 5, 0L, 0, cVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c19707h = this;
                    } else {
                        return C24848g0.f119245a;
                    }
                }
                getCommentLiveRes = (GetCommentLiveRes) ((C24608l) obj).m128099a();
                c19707h.f97750j.m109352f(getCommentLiveRes);
                if (getCommentLiveRes == null && (m51638b = getCommentLiveRes.m51638b()) != null) {
                    list = AbstractC25332a0.m131225y0(m51638b);
                } else {
                    list = null;
                }
                list2 = list;
                if (list2 == null && !list2.isEmpty()) {
                    InterfaceC20185a interfaceC20185a = c19707h.f97745e;
                    List list3 = list;
                    m131511r = AbstractC25370t.m131511r(list3, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C19701b.Companion.m103382a((GetCommentLiveRes.CommentData) it.next()));
                    }
                    interfaceC20185a.mo105290e(arrayList);
                    MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                    d dVar = new d(str, list, null);
                    cVar.f97762s = null;
                    cVar.f97763t = null;
                    cVar.f97766w = 2;
                    obj = BuildersKt.m112534g(m112681c, dVar, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return obj;
                }
                return C24848g0.f119245a;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f97764u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f97766w;
        if (i11 == 0) {
        }
        getCommentLiveRes = (GetCommentLiveRes) ((C24608l) obj2).m128099a();
        c19707h.f97750j.m109352f(getCommentLiveRes);
        if (getCommentLiveRes == null) {
        }
        list = null;
        list2 = list;
        if (list2 == null) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:            r3 = true ^ (r5 instanceof java.util.concurrent.CancellationException);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m103413y(Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f97773u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f97773u = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f97771s;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f97773u;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21435b c21435b = this.f97743c;
                    eVar.f97773u = 1;
                    if (c21435b.m110957c(eVar) == m142578e) {
                        return m142578e;
                    }
                }
                return AbstractC29094b.m145339a(z11);
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f97771s;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f97773u;
        boolean z112 = true;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(z112);
    }

    /* renamed from: B */
    public final void m103414B(String str, String str2, InterfaceC18509p interfaceC18509p) {
        if (str != null && str.length() != 0) {
            BuildersKt__Builders_commonKt.m112540d(this.f97747g, null, null, new h(str, m103411v(), interfaceC18509p, null), 3, null);
        }
    }

    /* renamed from: D */
    public final void m103415D(String str, int i11, int i12, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        if (str.length() != 0) {
            BuildersKt__Builders_commonKt.m112540d(this.f97747g, null, null, new n(str, i11, i12, interfaceC18505l, null), 3, null);
        }
    }

    /* renamed from: E */
    public final void m103416E() {
        Long m51689e;
        this.f97741a.mo96481d(this);
        String str = this.f97754n;
        if (str != null && str.length() != 0 && this.f97743c.m110958d()) {
            String str2 = this.f97755o;
            if (str2 == null) {
                StreamData streamData = this.f97759s;
                if (streamData != null && (m51689e = streamData.m51689e()) != null) {
                    str2 = m51689e.toString();
                } else {
                    str2 = null;
                }
            }
            m103397I(str2, this.f97759s);
        }
    }

    /* renamed from: F */
    public final void m103417F(String str, String str2, int i11, long j11, C9440a c9440a, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "content");
        AbstractC19074t.m100208f(c9440a, "commentMissId");
        AbstractC19074t.m100208f(interfaceC18509p, "onComplete");
        if (AbstractC19074t.m100204b(str, this.f97754n)) {
            BuildersKt__Builders_commonKt.m112540d(this.f97747g, null, null, new o(str, str2, i11, j11, interfaceC18509p, c9440a, null), 3, null);
        }
    }

    /* renamed from: G */
    public final void m103418G(InterfaceC19708i interfaceC19708i) {
        this.f97744d.m103393k(interfaceC19708i);
    }

    /* renamed from: H */
    public final void m103419H(InterfaceC19713n interfaceC19713n) {
        this.f97752l = interfaceC19713n;
        this.f97748h.m109367f(interfaceC19713n);
        this.f97749i.m109359e(interfaceC19713n);
        this.f97750j.m109353g(interfaceC19713n);
        this.f97744d.m103394l(interfaceC19713n);
    }

    /* renamed from: J */
    public final void m103420J(String str, boolean z11, String str2) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "source");
        this.f97754n = str;
        this.f97757q = false;
        if (this.f97751k) {
            return;
        }
        this.f97751k = true;
        this.f97756p = 0L;
        Job job = this.f97753m;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f97747g, null, null, new p(str, z11, null), 3, null);
        this.f97753m = m112540d;
    }

    /* renamed from: K */
    public final void m103421K(String str) {
        m103410u(this, false, str, false, true, new q(), 5, null);
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: a */
    public Object mo103422a(String str, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new l(str, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: b */
    public Object mo103423b(String str, Continuation continuation) {
        Object m142578e;
        Object m109366e = this.f97748h.m109366e(this.f97754n, str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m109366e == m142578e) {
            return m109366e;
        }
        return C24848g0.f119245a;
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: c */
    public Object mo103424c(Continuation continuation) {
        Object m142578e;
        List take = this.f97745e.take();
        List list = take;
        if (list != null && !list.isEmpty()) {
            Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new i(take, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: d */
    public Object mo103425d(String str, Continuation continuation) {
        Object m142578e;
        Object m109358d = this.f97749i.m109358d(this.f97754n, str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m109358d == m142578e) {
            return m109358d;
        }
        return C24848g0.f119245a;
    }

    @Override // h10.C19714o.a
    /* renamed from: e */
    public void mo103426e(int i11, int i12, String str) {
        AbstractC24599c m128092a = this.f97742b.m128092a(i11, i12, str);
        if (m128092a == null) {
            return;
        }
        this.f97743c.m110959e(m128092a);
        this.f97746f.m51608j(m128092a);
        List mo51711b = m128092a.mo51711b();
        if (mo51711b != null) {
            this.f97745e.mo105286a(mo51711b);
        } else {
            this.f97744d.m103392f(m128092a);
        }
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: f */
    public Object mo103427f(String str, Continuation continuation) {
        Object m142578e;
        Object m109351e = this.f97750j.m109351e(this.f97754n, str, new m(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m109351e == m142578e) {
            return m109351e;
        }
        return C24848g0.f119245a;
    }

    @Override // k10.InterfaceC21434a
    /* renamed from: g */
    public Object mo103428g(String str, Continuation continuation) {
        if (this.f97758r) {
            BuildersKt__Builders_commonKt.m112540d(this.f97747g, null, null, new j(null), 3, null);
        }
        if (!this.f97745e.mo105287b()) {
            m103396C(this, this.f97754n, null, new k(null), 2, null);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: t */
    public final void m103429t(boolean z11, String str, boolean z12, boolean z13, InterfaceC18505l interfaceC18505l) {
        boolean z14;
        if (!z12 && !z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            this.f97750j.m109350d();
            this.f97745e.clear();
            this.f97743c.m110956b();
            this.f97746f.m51599a();
        }
        this.f97751k = false;
        String str2 = this.f97754n;
        if (((!z11 && z14) || z13) && str2 != null) {
            m103414B(str2, str, new b(interfaceC18505l, null));
        } else if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(Boolean.TRUE);
        }
        if (interfaceC18505l == null) {
            this.f97754n = null;
        }
        this.f97755o = str2;
        this.f97752l = null;
        this.f97744d.m103394l(null);
    }

    /* renamed from: x */
    public final LiveChanelStats m103430x() {
        return this.f97746f;
    }

    /* renamed from: z */
    public final boolean m103431z(String str) {
        AbstractC19074t.m100208f(str, "liveId");
        if (AbstractC19074t.m100204b(str, this.f97754n)) {
            return this.f97757q;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C19707h(InterfaceC18165b interfaceC18165b, C24603g c24603g, C21435b c21435b, C19706g c19706g, InterfaceC20185a interfaceC20185a, LiveChanelStats liveChanelStats, CoroutineScope coroutineScope, C20903c c20903c, C20902b c20902b, C20901a c20901a, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18165b, r1, r3, r5, r6, r7, r2, (i11 & 128) != 0 ? new C20903c(interfaceC18165b, r7, r2, null, 8, null) : c20903c, (i11 & 256) != 0 ? new C20902b(interfaceC18165b, r2, null, 4, null) : c20902b, (i11 & 512) != 0 ? new C20901a(interfaceC18165b, r2, null, 4, null) : c20901a);
        C24603g c24603g2 = (i11 & 2) != 0 ? new C24603g(null, null, 3, null) : c24603g;
        C21435b c21435b2 = (i11 & 4) != 0 ? new C21435b(false, 1, null) : c21435b;
        C19706g c19706g2 = (i11 & 8) != 0 ? new C19706g() : c19706g;
        InterfaceC20185a c20186b = (i11 & 16) != 0 ? new C20186b() : interfaceC20185a;
        LiveChanelStats liveChanelStats2 = (i11 & 32) != 0 ? new LiveChanelStats((String) null, (Boolean) null, (Long) null, (Long) null, (Long) null, 31, (AbstractC19060k) null) : liveChanelStats;
        CoroutineScope m112637a = (i11 & 64) != 0 ? CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))) : coroutineScope;
    }
}
