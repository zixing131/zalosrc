package p137eo;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p735do.C18035c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: eo.h */
/* loaded from: classes4.dex */
public final class C18524h implements InterfaceC18525i {

    /* renamed from: a */
    private final C18035c f93160a;

    /* renamed from: b */
    private final MutableSharedFlow f93161b;

    /* renamed from: eo.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f93162a;

        /* renamed from: b */
        private final int f93163b;

        public a(String str, int i11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f93162a = str;
            this.f93163b = i11;
        }

        /* renamed from: a */
        public final int m97908a() {
            return this.f93163b;
        }

        /* renamed from: b */
        public final String m97909b() {
            return this.f93162a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f93162a, aVar.f93162a) && this.f93163b == aVar.f93163b;
        }

        public int hashCode() {
            return (this.f93162a.hashCode() * 31) + this.f93163b;
        }

        public String toString() {
            return "RequestParam(userId=" + this.f93162a + ", typeAlbum=" + this.f93163b + ")";
        }
    }

    /* renamed from: eo.h$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f93164a;

        /* renamed from: b */
        private String f93165b;

        /* renamed from: c */
        private int f93166c;

        /* renamed from: d */
        private C8676a f93167d;

        /* renamed from: e */
        private C20096c f93168e;

        public b(boolean z11, String str, int i11, C8676a c8676a, C20096c c20096c) {
            AbstractC19074t.m100208f(str, "viewerId");
            AbstractC19074t.m100208f(c8676a, "profilePreviewAlbumCollection");
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f93164a = z11;
            this.f93165b = str;
            this.f93166c = i11;
            this.f93167d = c8676a;
            this.f93168e = c20096c;
        }

        /* renamed from: a */
        public final C8676a m97910a() {
            return this.f93167d;
        }

        /* renamed from: b */
        public final int m97911b() {
            return this.f93166c;
        }

        /* renamed from: c */
        public final String m97912c() {
            return this.f93165b;
        }

        /* renamed from: d */
        public final boolean m97913d() {
            return this.f93164a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f93164a == bVar.f93164a && AbstractC19074t.m100204b(this.f93165b, bVar.f93165b) && this.f93166c == bVar.f93166c && AbstractC19074t.m100204b(this.f93167d, bVar.f93167d) && AbstractC19074t.m100204b(this.f93168e, bVar.f93168e);
        }

        public int hashCode() {
            return (((((((AbstractC2144f.m11520a(this.f93164a) * 31) + this.f93165b.hashCode()) * 31) + this.f93166c) * 31) + this.f93167d.hashCode()) * 31) + this.f93168e.hashCode();
        }

        public String toString() {
            return "ResultListAlbum(isSuccess=" + this.f93164a + ", viewerId=" + this.f93165b + ", typeAlbum=" + this.f93166c + ", profilePreviewAlbumCollection=" + this.f93167d + ", errorMessage=" + this.f93168e + ")";
        }

        public /* synthetic */ b(boolean z11, String str, int i11, C8676a c8676a, C20096c c20096c, int i12, AbstractC19060k abstractC19060k) {
            this(z11, str, i11, c8676a, (i12 & 16) != 0 ? new C20096c(-1, "") : c20096c);
        }
    }

    /* renamed from: eo.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f93169s;

        /* renamed from: t */
        Object f93170t;

        /* renamed from: u */
        long f93171u;

        /* renamed from: v */
        /* synthetic */ Object f93172v;

        /* renamed from: x */
        int f93174x;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93172v = obj;
            this.f93174x |= Integer.MIN_VALUE;
            return C18524h.this.mo97899c(null, 0L, this);
        }
    }

    /* renamed from: eo.h$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f93175s;

        /* renamed from: t */
        Object f93176t;

        /* renamed from: u */
        Object f93177u;

        /* renamed from: v */
        Object f93178v;

        /* renamed from: w */
        int f93179w;

        /* renamed from: x */
        /* synthetic */ Object f93180x;

        /* renamed from: z */
        int f93182z;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93180x = obj;
            this.f93182z |= Integer.MIN_VALUE;
            return C18524h.this.mo97901e(null, 0, 0, null, this);
        }
    }

    /* renamed from: eo.h$e */
    /* loaded from: classes4.dex */
    public static final class e implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f93183p;

        /* renamed from: q */
        final /* synthetic */ String f93184q;

        /* renamed from: r */
        final /* synthetic */ int f93185r;

        /* renamed from: eo.h$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f93186p;

            /* renamed from: q */
            final /* synthetic */ String f93187q;

            /* renamed from: r */
            final /* synthetic */ int f93188r;

            /* renamed from: eo.h$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C32817a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f93189s;

                /* renamed from: t */
                int f93190t;

                public C32817a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f93189s = obj;
                    this.f93190t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector, String str, int i11) {
                this.f93186p = flowCollector;
                this.f93187q = str;
                this.f93188r = i11;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C32817a c32817a;
                Object m142578e;
                int i11;
                if (continuation instanceof C32817a) {
                    c32817a = (C32817a) continuation;
                    int i12 = c32817a.f93190t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c32817a.f93190t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c32817a.f93189s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32817a.f93190t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f93186p;
                            b bVar = (b) obj;
                            if (AbstractC19074t.m100204b(bVar.m97912c(), this.f93187q) && bVar.m97911b() == this.f93188r) {
                                c32817a.f93190t = 1;
                                if (flowCollector.mo12109b(obj, c32817a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c32817a = new C32817a(continuation);
                Object obj22 = c32817a.f93189s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c32817a.f93190t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public e(Flow flow, String str, int i11) {
            this.f93183p = flow;
            this.f93184q = str;
            this.f93185r = i11;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f93183p.mo97893a(new a(flowCollector, this.f93184q, this.f93185r), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: eo.h$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f93192s;

        /* renamed from: t */
        Object f93193t;

        /* renamed from: u */
        Object f93194u;

        /* renamed from: v */
        /* synthetic */ Object f93195v;

        /* renamed from: x */
        int f93197x;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93195v = obj;
            this.f93197x |= Integer.MIN_VALUE;
            return C18524h.this.mo97900d(null, null, this);
        }
    }

    public C18524h(C18035c c18035c) {
        AbstractC19074t.m100208f(c18035c, "previewAlbumListCache");
        this.f93160a = c18035c;
        this.f93161b = SharedFlowKt.m113478b(0, 0, null, 7, null);
    }

    /* renamed from: a */
    private final Object m97907a(a aVar, long j11, int i11, Continuation continuation) {
        return C18517a.f93095a.m97876d(aVar.m97909b(), aVar.m97908a(), j11, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p137eo.InterfaceC18525i
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97899c(String str, long j11, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        Iterator it;
        C18524h c18524h;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f93174x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f93174x = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f93172v;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f93174x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        long j12 = cVar.f93171u;
                        Iterator it2 = (Iterator) cVar.f93170t;
                        c18524h = (C18524h) cVar.f93169s;
                        AbstractC24862s.m129228b(obj);
                        it = it2;
                        j11 = j12;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18035c c18035c = this.f93160a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : c18035c.entrySet()) {
                        if (AbstractC19074t.m100204b(((a) entry.getKey()).m97909b(), str)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    it = linkedHashMap.entrySet().iterator();
                    c18524h = this;
                }
                while (it.hasNext()) {
                    b bVar = (b) ((Map.Entry) it.next()).getValue();
                    bVar.m97910a().m46333d(j11);
                    MutableSharedFlow mutableSharedFlow = c18524h.f93161b;
                    cVar.f93169s = c18524h;
                    cVar.f93170t = it;
                    cVar.f93171u = j11;
                    cVar.f93174x = 1;
                    if (mutableSharedFlow.mo12109b(bVar, cVar) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f93172v;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f93174x;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p137eo.InterfaceC18525i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97900d(String str, ProfileAlbumItem profileAlbumItem, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        Iterator it;
        C18524h c18524h;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f93197x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f93197x = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f93195v;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f93197x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) fVar.f93194u;
                        profileAlbumItem = (ProfileAlbumItem) fVar.f93193t;
                        c18524h = (C18524h) fVar.f93192s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18035c c18035c = this.f93160a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : c18035c.entrySet()) {
                        if (AbstractC19074t.m100204b(((a) entry.getKey()).m97909b(), str)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    it = linkedHashMap.entrySet().iterator();
                    c18524h = this;
                }
                while (it.hasNext()) {
                    b bVar = (b) ((Map.Entry) it.next()).getValue();
                    bVar.m97910a().m46332c(profileAlbumItem.m46300c().m46277e(), profileAlbumItem.m46300c().m46286n(), profileAlbumItem.m46300c().m46282j(), profileAlbumItem.m46300c().m46285m());
                    MutableSharedFlow mutableSharedFlow = c18524h.f93161b;
                    fVar.f93192s = c18524h;
                    fVar.f93193t = profileAlbumItem;
                    fVar.f93194u = it;
                    fVar.f93197x = 1;
                    if (mutableSharedFlow.mo12109b(bVar, fVar) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f93195v;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f93197x;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // p137eo.InterfaceC18525i
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97901e(String str, int i11, int i12, C8676a c8676a, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i13;
        C18524h c18524h;
        String str2;
        int i14;
        a aVar;
        C18524h c18524h2;
        String str3;
        int i15;
        C8676a c8676a2;
        String str4;
        int i16;
        b bVar;
        MutableSharedFlow mutableSharedFlow;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i17 = dVar.f93182z;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                dVar.f93182z = i17 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f93180x;
                m142578e = AbstractC28298d.m142578e();
                i13 = dVar2.f93182z;
                if (i13 == 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i16 = dVar2.f93179w;
                            aVar = (a) dVar2.f93177u;
                            str4 = (String) dVar2.f93176t;
                            c18524h = (C18524h) dVar2.f93175s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                bVar = new b(true, str4, i16, (C8676a) obj, null, 16, null);
                            } catch (Exception unused) {
                                i14 = i16;
                                str2 = str4;
                                bVar = new b(false, str2, i14, new C8676a(), null, 16, null);
                                c18524h2 = c18524h;
                                c18524h2.f93160a.put(aVar, bVar);
                                mutableSharedFlow = c18524h2.f93161b;
                                dVar2.f93175s = null;
                                dVar2.f93176t = null;
                                dVar2.f93177u = null;
                                dVar2.f93178v = null;
                                dVar2.f93182z = 3;
                                if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                                }
                                return C24848g0.f119245a;
                            }
                            c18524h2 = c18524h;
                            c18524h2.f93160a.put(aVar, bVar);
                            mutableSharedFlow = c18524h2.f93161b;
                            dVar2.f93175s = null;
                            dVar2.f93176t = null;
                            dVar2.f93177u = null;
                            dVar2.f93178v = null;
                            dVar2.f93182z = 3;
                            if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                                return m142578e;
                            }
                        }
                    } else {
                        i15 = dVar2.f93179w;
                        aVar = (a) dVar2.f93178v;
                        c8676a2 = (C8676a) dVar2.f93177u;
                        str3 = (String) dVar2.f93176t;
                        c18524h2 = (C18524h) dVar2.f93175s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            C8676a c8676a3 = (C8676a) obj;
                            c8676a3.m46331a(c8676a2);
                            bVar = new b(true, str3, i15, c8676a3, null, 16, null);
                        } catch (Exception unused2) {
                            i14 = i15;
                            str2 = str3;
                            c18524h = c18524h2;
                            bVar = new b(false, str2, i14, new C8676a(), null, 16, null);
                            c18524h2 = c18524h;
                            c18524h2.f93160a.put(aVar, bVar);
                            mutableSharedFlow = c18524h2.f93161b;
                            dVar2.f93175s = null;
                            dVar2.f93176t = null;
                            dVar2.f93177u = null;
                            dVar2.f93178v = null;
                            dVar2.f93182z = 3;
                            if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                            }
                            return C24848g0.f119245a;
                        }
                        c18524h2.f93160a.put(aVar, bVar);
                        mutableSharedFlow = c18524h2.f93161b;
                        dVar2.f93175s = null;
                        dVar2.f93176t = null;
                        dVar2.f93177u = null;
                        dVar2.f93178v = null;
                        dVar2.f93182z = 3;
                        if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    a aVar2 = new a(str, i11);
                    if (c8676a != null) {
                        try {
                        } catch (Exception unused3) {
                            c18524h = this;
                            str2 = str;
                            i14 = i11;
                            aVar = aVar2;
                            bVar = new b(false, str2, i14, new C8676a(), null, 16, null);
                            c18524h2 = c18524h;
                            c18524h2.f93160a.put(aVar, bVar);
                            mutableSharedFlow = c18524h2.f93161b;
                            dVar2.f93175s = null;
                            dVar2.f93176t = null;
                            dVar2.f93177u = null;
                            dVar2.f93178v = null;
                            dVar2.f93182z = 3;
                            if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                            }
                            return C24848g0.f119245a;
                        }
                        if (c8676a.m46334e()) {
                            long m46336g = c8676a.m46336g();
                            int m46337h = c8676a.m46337h() + 1;
                            dVar2.f93175s = this;
                            dVar2.f93176t = str;
                            dVar2.f93177u = c8676a;
                            dVar2.f93178v = aVar2;
                            dVar2.f93179w = i11;
                            dVar2.f93182z = 1;
                            obj = m97907a(aVar2, m46336g, m46337h, dVar2);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            c18524h2 = this;
                            str3 = str;
                            i15 = i11;
                            c8676a2 = c8676a;
                            aVar = aVar2;
                            C8676a c8676a32 = (C8676a) obj;
                            c8676a32.m46331a(c8676a2);
                            bVar = new b(true, str3, i15, c8676a32, null, 16, null);
                            c18524h2.f93160a.put(aVar, bVar);
                            mutableSharedFlow = c18524h2.f93161b;
                            dVar2.f93175s = null;
                            dVar2.f93176t = null;
                            dVar2.f93177u = null;
                            dVar2.f93178v = null;
                            dVar2.f93182z = 3;
                            if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                            }
                        }
                    }
                    dVar2.f93175s = this;
                    dVar2.f93176t = str;
                    dVar2.f93177u = aVar2;
                    dVar2.f93179w = i11;
                    dVar2.f93182z = 2;
                    obj = m97907a(aVar2, 0L, i12, dVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c18524h = this;
                    str4 = str;
                    i16 = i11;
                    aVar = aVar2;
                    bVar = new b(true, str4, i16, (C8676a) obj, null, 16, null);
                    c18524h2 = c18524h;
                    c18524h2.f93160a.put(aVar, bVar);
                    mutableSharedFlow = c18524h2.f93161b;
                    dVar2.f93175s = null;
                    dVar2.f93176t = null;
                    dVar2.f93177u = null;
                    dVar2.f93178v = null;
                    dVar2.f93182z = 3;
                    if (mutableSharedFlow.mo12109b(bVar, dVar2) == m142578e) {
                    }
                }
                return C24848g0.f119245a;
            }
        }
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f93180x;
        m142578e = AbstractC28298d.m142578e();
        i13 = dVar22.f93182z;
        if (i13 == 0) {
        }
        return C24848g0.f119245a;
    }

    @Override // p137eo.InterfaceC18525i
    /* renamed from: f */
    public Flow mo97902f(String str, int i11) {
        AbstractC19074t.m100208f(str, "userId");
        return new e(this.f93161b, str, i11);
    }
}
