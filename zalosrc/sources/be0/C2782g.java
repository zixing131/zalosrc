package be0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mh.C23298d;
import p185gc.AbstractC19382f;
import p716zh.C32033n5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28081h4;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: be0.g */
/* loaded from: classes4.dex */
public final class C2782g extends AbstractC19382f {

    /* renamed from: a */
    private final C23298d f11053a;

    /* renamed from: b */
    private final C28081h4 f11054b;

    /* renamed from: be0.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C17945a0 f11055a;

        public a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "messageToMigrate");
            this.f11055a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m13404a() {
            return this.f11055a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f11055a, ((a) obj).f11055a);
        }

        public int hashCode() {
            return this.f11055a.hashCode();
        }

        public String toString() {
            return "Params(messageToMigrate=" + this.f11055a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f11056s;

        /* renamed from: t */
        Object f11057t;

        /* renamed from: u */
        Object f11058u;

        /* renamed from: v */
        /* synthetic */ Object f11059v;

        /* renamed from: x */
        int f11061x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f11059v = obj;
            this.f11061x |= Integer.MIN_VALUE;
            return C2782g.this.mo13397b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f11062t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f11063u;

        /* renamed from: v */
        final /* synthetic */ C2782g f11064v;

        /* renamed from: w */
        final /* synthetic */ a f11065w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C19059j0 c19059j0, C2782g c2782g, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f11063u = c19059j0;
            this.f11064v = c2782g;
            this.f11065w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f11063u, this.f11064v, this.f11065w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f11062t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f11063u.f94941p = this.f11064v.f11054b.m141543c(this.f11065w.m13404a().m95029V3().m41045i());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f11066t;

        /* renamed from: v */
        final /* synthetic */ a f11068v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f11068v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f11068v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f11066t == 0) {
                AbstractC24862s.m129228b(obj);
                C2782g.this.f11054b.m141547h(this.f11068v.m13404a().m95029V3().m41045i(), true);
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

    public C2782g(C23298d c23298d, C28081h4 c28081h4) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(c28081h4, "oldGroupDeliveredSeenManager");
        this.f11053a = c23298d;
        this.f11054b = c28081h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // p185gc.AbstractC19382f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo13397b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C2782g c2782g;
        a aVar2;
        C19059j0 c19059j0;
        C32033n5 c32033n5;
        a aVar3;
        C2782g c2782g2;
        CoroutineDispatcher m112680b;
        d dVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f11061x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f11061x = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f11059v;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f11061x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (a) bVar.f11057t;
                        c2782g2 = (C2782g) bVar.f11056s;
                        AbstractC24862s.m129228b(obj);
                        aVar2 = aVar3;
                        c2782g = c2782g2;
                        m112680b = Dispatchers.m112680b();
                        dVar = new d(aVar2, null);
                        bVar.f11056s = null;
                        bVar.f11057t = null;
                        bVar.f11058u = null;
                        bVar.f11061x = 3;
                        if (BuildersKt.m112534g(m112680b, dVar, bVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    c19059j0 = (C19059j0) bVar.f11058u;
                    a aVar4 = (a) bVar.f11057t;
                    C2782g c2782g3 = (C2782g) bVar.f11056s;
                    AbstractC24862s.m129228b(obj);
                    aVar2 = aVar4;
                    c2782g = c2782g3;
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19059j0 c19059j02 = new C19059j0();
                    CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                    c cVar = new c(c19059j02, this, aVar, null);
                    bVar.f11056s = this;
                    bVar.f11057t = aVar;
                    bVar.f11058u = c19059j02;
                    bVar.f11061x = 1;
                    if (BuildersKt.m112534g(m112680b2, cVar, bVar) == m142578e) {
                        return m142578e;
                    }
                    c2782g = this;
                    aVar2 = aVar;
                    c19059j0 = c19059j02;
                }
                c32033n5 = (C32033n5) c19059j0.f94941p;
                if (c32033n5 != null) {
                    C23298d c23298d = c2782g.f11053a;
                    String m94853B3 = aVar2.m13404a().m94853B3();
                    AbstractC19074t.m100207e(m94853B3, "getGroupId(...)");
                    MessageId m95029V3 = aVar2.m13404a().m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    List list = c32033n5.f147500d;
                    AbstractC19074t.m100207e(list, "deliveredUids");
                    List list2 = c32033n5.f147499c;
                    AbstractC19074t.m100207e(list2, "seenUids");
                    bVar.f11056s = c2782g;
                    bVar.f11057t = aVar2;
                    bVar.f11058u = null;
                    bVar.f11061x = 2;
                    if (c23298d.m120479o(m94853B3, m95029V3, list, list2, bVar) == m142578e) {
                        return m142578e;
                    }
                    aVar3 = aVar2;
                    c2782g2 = c2782g;
                    aVar2 = aVar3;
                    c2782g = c2782g2;
                }
                m112680b = Dispatchers.m112680b();
                dVar = new d(aVar2, null);
                bVar.f11056s = null;
                bVar.f11057t = null;
                bVar.f11058u = null;
                bVar.f11061x = 3;
                if (BuildersKt.m112534g(m112680b, dVar, bVar) == m142578e) {
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f11059v;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f11061x;
        if (i11 == 0) {
        }
        c32033n5 = (C32033n5) c19059j0.f94941p;
        if (c32033n5 != null) {
        }
        m112680b = Dispatchers.m112680b();
        dVar = new d(aVar2, null);
        bVar.f11056s = null;
        bVar.f11057t = null;
        bVar.f11058u = null;
        bVar.f11061x = 3;
        if (BuildersKt.m112534g(m112680b, dVar, bVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
