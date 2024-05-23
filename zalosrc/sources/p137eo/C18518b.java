package p137eo;

import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p137eo.AbstractC18522f;
import p735do.C18034b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: eo.b */
/* loaded from: classes4.dex */
public final class C18518b implements InterfaceC18519c {

    /* renamed from: a */
    private final C18034b f93107a;

    /* renamed from: b */
    private final MutableSharedFlow f93108b;

    /* renamed from: eo.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f93109s;

        /* renamed from: t */
        Object f93110t;

        /* renamed from: u */
        Object f93111u;

        /* renamed from: v */
        long f93112v;

        /* renamed from: w */
        int f93113w;

        /* renamed from: x */
        /* synthetic */ Object f93114x;

        /* renamed from: z */
        int f93116z;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93114x = obj;
            this.f93116z |= Integer.MIN_VALUE;
            return C18518b.this.mo97891j(null, 0L, 0, this);
        }
    }

    /* renamed from: eo.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f93117s;

        /* renamed from: t */
        /* synthetic */ Object f93118t;

        /* renamed from: v */
        int f93120v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93118t = obj;
            this.f93120v |= Integer.MIN_VALUE;
            return C18518b.this.mo97886a(null, 0L, 0, null, null, this);
        }
    }

    /* renamed from: eo.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: A */
        int f93121A;

        /* renamed from: s */
        Object f93122s;

        /* renamed from: t */
        Object f93123t;

        /* renamed from: u */
        Object f93124u;

        /* renamed from: v */
        Object f93125v;

        /* renamed from: w */
        Object f93126w;

        /* renamed from: x */
        Object f93127x;

        /* renamed from: y */
        /* synthetic */ Object f93128y;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93128y = obj;
            this.f93121A |= Integer.MIN_VALUE;
            return C18518b.this.mo97890i(null, 0L, 0, null, null, null, null, this);
        }
    }

    /* renamed from: eo.b$d */
    /* loaded from: classes4.dex */
    public static final class d implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f93130p;

        /* renamed from: q */
        final /* synthetic */ String f93131q;

        /* renamed from: r */
        final /* synthetic */ int f93132r;

        /* renamed from: s */
        final /* synthetic */ long f93133s;

        /* renamed from: eo.b$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f93134p;

            /* renamed from: q */
            final /* synthetic */ String f93135q;

            /* renamed from: r */
            final /* synthetic */ int f93136r;

            /* renamed from: s */
            final /* synthetic */ long f93137s;

            /* renamed from: eo.b$d$a$a */
            /* loaded from: classes4.dex */
            public static final class C32816a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f93138s;

                /* renamed from: t */
                int f93139t;

                public C32816a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f93138s = obj;
                    this.f93139t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector, String str, int i11, long j11) {
                this.f93134p = flowCollector;
                this.f93135q = str;
                this.f93136r = i11;
                this.f93137s = j11;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C32816a c32816a;
                Object m142578e;
                int i11;
                if (continuation instanceof C32816a) {
                    c32816a = (C32816a) continuation;
                    int i12 = c32816a.f93139t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c32816a.f93139t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c32816a.f93138s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32816a.f93139t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f93134p;
                            InterfaceC18527k interfaceC18527k = (InterfaceC18527k) obj;
                            if (AbstractC19074t.m100204b(interfaceC18527k.mo97915b(), this.f93135q)) {
                                int mo97916c = interfaceC18527k.mo97916c();
                                int i13 = this.f93136r;
                                if (mo97916c == i13 && (i13 != 5 || interfaceC18527k.mo97914a() == this.f93137s)) {
                                    c32816a.f93139t = 1;
                                    if (flowCollector.mo12109b(obj, c32816a) == m142578e) {
                                        return m142578e;
                                    }
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c32816a = new C32816a(continuation);
                Object obj22 = c32816a.f93138s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c32816a.f93139t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public d(Flow flow, String str, int i11, long j11) {
            this.f93130p = flow;
            this.f93131q = str;
            this.f93132r = i11;
            this.f93133s = j11;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f93130p.mo97893a(new a(flowCollector, this.f93131q, this.f93132r, this.f93133s), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: eo.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f93141s;

        /* renamed from: t */
        Object f93142t;

        /* renamed from: u */
        Object f93143u;

        /* renamed from: v */
        /* synthetic */ Object f93144v;

        /* renamed from: x */
        int f93146x;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93144v = obj;
            this.f93146x |= Integer.MIN_VALUE;
            return C18518b.this.mo97892k(null, 0, 0L, 0L, 0, null, null, this);
        }
    }

    /* renamed from: eo.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f93147s;

        /* renamed from: t */
        Object f93148t;

        /* renamed from: u */
        Object f93149u;

        /* renamed from: v */
        Object f93150v;

        /* renamed from: w */
        /* synthetic */ Object f93151w;

        /* renamed from: y */
        int f93153y;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f93151w = obj;
            this.f93153y |= Integer.MIN_VALUE;
            return C18518b.this.mo97888g(null, null, null, this);
        }
    }

    public C18518b(C18034b c18034b) {
        AbstractC19074t.m100208f(c18034b, "albumDetailCache");
        this.f93107a = c18034b;
        this.f93108b = SharedFlowKt.m113478b(0, 0, null, 7, null);
    }

    /* renamed from: c */
    private final void m97883c(ProfileAlbumItem profileAlbumItem, String str) {
        AbstractC20826v0.m108835t(str, profileAlbumItem, 3, true);
    }

    /* renamed from: d */
    private final void m97884d(ProfileAlbumItem profileAlbumItem, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m97883c(profileAlbumItem, (String) it.next());
        }
        m97885e(profileAlbumItem, list.size());
    }

    /* renamed from: e */
    private final void m97885e(ProfileAlbumItem profileAlbumItem, int i11) {
        ProfileAlbumHeader m46300c = profileAlbumItem.m46300c();
        m46300c.m46272F(m46300c.m46287o() - i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p137eo.InterfaceC18519c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97886a(String str, long j11, int i11, List list, ProfileAlbumItem profileAlbumItem, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f93120v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f93120v = i13 - Integer.MIN_VALUE;
                Object obj = bVar.f93118t;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar.f93120v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        profileAlbumItem = (ProfileAlbumItem) bVar.f93117s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18526j c18526j = new C18526j(str, i11, j11);
                    m97884d(profileAlbumItem, list);
                    this.f93107a.put(c18526j, profileAlbumItem);
                    MutableSharedFlow mutableSharedFlow = this.f93108b;
                    C18529m c18529m = new C18529m(str, profileAlbumItem);
                    bVar.f93117s = profileAlbumItem;
                    bVar.f93120v = 1;
                    if (mutableSharedFlow.mo12109b(c18529m, bVar) == m142578e) {
                        return m142578e;
                    }
                }
                return new AbstractC18522f.b(profileAlbumItem);
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f93118t;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar.f93120v;
        if (i12 == 0) {
        }
        return new AbstractC18522f.b(profileAlbumItem);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: b */
    public Object mo97887b(String str, long j11, int i11, Continuation continuation) {
        return new d(this.f93108b, str, i11, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p137eo.InterfaceC18519c
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97888g(String str, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        C18518b c18518b;
        String str2;
        C18526j c18526j;
        AbstractC18522f abstractC18522f;
        AbstractC18522f abstractC18522f2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f93153y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f93153y = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f93151w;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f93153y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            abstractC18522f2 = (AbstractC18522f) fVar.f93147s;
                            AbstractC24862s.m129228b(obj);
                            return abstractC18522f2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c18526j = (C18526j) fVar.f93150v;
                    profileAlbumItem = (ProfileAlbumItem) fVar.f93149u;
                    str2 = (String) fVar.f93148t;
                    c18518b = (C18518b) fVar.f93147s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18526j c18526j2 = new C18526j(str, profileAlbumItem.m46300c().m46288p(), profileAlbumItem.m46300c().m46277e());
                    C18517a c18517a = C18517a.f93095a;
                    long m46277e = profileAlbumItem.m46300c().m46277e();
                    PrivacyInfo m46282j = profileAlbumItem.m46300c().m46282j();
                    fVar.f93147s = this;
                    fVar.f93148t = str;
                    fVar.f93149u = profileAlbumItem;
                    fVar.f93150v = c18526j2;
                    fVar.f93153y = 1;
                    Object m97882j = c18517a.m97882j(m46277e, m46282j, trackingSource, fVar);
                    if (m97882j == m142578e) {
                        return m142578e;
                    }
                    c18518b = this;
                    str2 = str;
                    c18526j = c18526j2;
                    obj = m97882j;
                }
                abstractC18522f = (AbstractC18522f) obj;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    c18518b.f93107a.put(c18526j, profileAlbumItem);
                    MutableSharedFlow mutableSharedFlow = c18518b.f93108b;
                    C18529m c18529m = new C18529m(str2, profileAlbumItem);
                    fVar.f93147s = abstractC18522f;
                    fVar.f93148t = null;
                    fVar.f93149u = null;
                    fVar.f93150v = null;
                    fVar.f93153y = 2;
                    if (mutableSharedFlow.mo12109b(c18529m, fVar) == m142578e) {
                        return m142578e;
                    }
                    abstractC18522f2 = abstractC18522f;
                    return abstractC18522f2;
                }
                return abstractC18522f;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f93151w;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f93153y;
        if (i11 == 0) {
        }
        abstractC18522f = (AbstractC18522f) obj2;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: h */
    public Object mo97889h(String str, ProfileAlbumItem profileAlbumItem, String str2, int i11, Continuation continuation) {
        return C18517a.f93095a.m97877e(profileAlbumItem.m46300c().m46277e(), str2, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // p137eo.InterfaceC18519c
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97890i(String str, long j11, int i11, String str2, String str3, ThemeItem themeItem, TrackingSource trackingSource, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i12;
        String str4;
        String str5;
        C18518b c18518b;
        String str6;
        C18526j c18526j;
        ThemeItem themeItem2;
        AbstractC18522f abstractC18522f;
        ProfileAlbumItem profileAlbumItem;
        ProfileAlbumItem profileAlbumItem2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i13 = cVar.f93121A;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f93121A = i13 - Integer.MIN_VALUE;
                Object obj = cVar.f93128y;
                m142578e = AbstractC28298d.m142578e();
                i12 = cVar.f93121A;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            profileAlbumItem2 = (ProfileAlbumItem) cVar.f93122s;
                            AbstractC24862s.m129228b(obj);
                            profileAlbumItem = profileAlbumItem2;
                            return new AbstractC18522f.b(profileAlbumItem);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c18526j = (C18526j) cVar.f93127x;
                    themeItem2 = (ThemeItem) cVar.f93126w;
                    str5 = (String) cVar.f93125v;
                    str4 = (String) cVar.f93124u;
                    str6 = (String) cVar.f93123t;
                    c18518b = (C18518b) cVar.f93122s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18526j c18526j2 = new C18526j(str, i11, j11);
                    C18517a c18517a = C18517a.f93095a;
                    cVar.f93122s = this;
                    cVar.f93123t = str;
                    cVar.f93124u = str2;
                    cVar.f93125v = str3;
                    cVar.f93126w = themeItem;
                    cVar.f93127x = c18526j2;
                    cVar.f93121A = 1;
                    Object m97874b = c18517a.m97874b(j11, str2, str3, themeItem, 0L, trackingSource, cVar);
                    if (m97874b == m142578e) {
                        return m142578e;
                    }
                    str4 = str2;
                    str5 = str3;
                    c18518b = this;
                    str6 = str;
                    c18526j = c18526j2;
                    obj = m97874b;
                    themeItem2 = themeItem;
                }
                abstractC18522f = (AbstractC18522f) obj;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    ProfileAlbumItem profileAlbumItem3 = (ProfileAlbumItem) c18518b.f93107a.get(c18526j);
                    profileAlbumItem = null;
                    if (profileAlbumItem3 != null) {
                        profileAlbumItem3.m46300c().m46271D(str4);
                        profileAlbumItem3.m46300c().m46291u(str5);
                        profileAlbumItem3.m46300c().m46270C(themeItem2);
                        c18518b.f93107a.put(c18526j, profileAlbumItem3);
                        MutableSharedFlow mutableSharedFlow = c18518b.f93108b;
                        C18529m c18529m = new C18529m(str6, profileAlbumItem3);
                        cVar.f93122s = profileAlbumItem3;
                        cVar.f93123t = null;
                        cVar.f93124u = null;
                        cVar.f93125v = null;
                        cVar.f93126w = null;
                        cVar.f93127x = null;
                        cVar.f93121A = 2;
                        if (mutableSharedFlow.mo12109b(c18529m, cVar) == m142578e) {
                            return m142578e;
                        }
                        profileAlbumItem2 = profileAlbumItem3;
                        profileAlbumItem = profileAlbumItem2;
                    }
                    return new AbstractC18522f.b(profileAlbumItem);
                }
                if (abstractC18522f instanceof AbstractC18522f.a) {
                    return new AbstractC18522f.a(((AbstractC18522f.a) abstractC18522f).m97905b());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f93128y;
        m142578e = AbstractC28298d.m142578e();
        i12 = cVar.f93121A;
        if (i12 == 0) {
        }
        abstractC18522f = (AbstractC18522f) obj2;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p137eo.InterfaceC18519c
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97891j(String str, long j11, int i11, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i12;
        C18518b c18518b;
        String str2;
        C18526j c18526j;
        AbstractC18522f abstractC18522f;
        AbstractC18522f abstractC18522f2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f93116z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f93116z = i13 - Integer.MIN_VALUE;
                Object obj = aVar.f93114x;
                m142578e = AbstractC28298d.m142578e();
                i12 = aVar.f93116z;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            abstractC18522f2 = (AbstractC18522f) aVar.f93109s;
                            AbstractC24862s.m129228b(obj);
                            return abstractC18522f2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = aVar.f93113w;
                    j11 = aVar.f93112v;
                    c18526j = (C18526j) aVar.f93111u;
                    str2 = (String) aVar.f93110t;
                    c18518b = (C18518b) aVar.f93109s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18526j c18526j2 = new C18526j(str, i11, j11);
                    C18517a c18517a = C18517a.f93095a;
                    aVar.f93109s = this;
                    aVar.f93110t = str;
                    aVar.f93111u = c18526j2;
                    aVar.f93112v = j11;
                    aVar.f93113w = i11;
                    aVar.f93116z = 1;
                    Object m97873a = c18517a.m97873a(j11, aVar);
                    if (m97873a == m142578e) {
                        return m142578e;
                    }
                    c18518b = this;
                    str2 = str;
                    c18526j = c18526j2;
                    obj = m97873a;
                }
                abstractC18522f = (AbstractC18522f) obj;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    c18518b.f93107a.remove(c18526j);
                    MutableSharedFlow mutableSharedFlow = c18518b.f93108b;
                    C18528l c18528l = new C18528l(str2, j11, i11);
                    aVar.f93109s = abstractC18522f;
                    aVar.f93110t = null;
                    aVar.f93111u = null;
                    aVar.f93116z = 2;
                    if (mutableSharedFlow.mo12109b(c18528l, aVar) == m142578e) {
                        return m142578e;
                    }
                    abstractC18522f2 = abstractC18522f;
                    return abstractC18522f2;
                }
                return abstractC18522f;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f93114x;
        m142578e = AbstractC28298d.m142578e();
        i12 = aVar.f93116z;
        if (i12 == 0) {
        }
        abstractC18522f = (AbstractC18522f) obj2;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // p137eo.InterfaceC18519c
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97892k(String str, int i11, long j11, long j12, int i12, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i13;
        long j13;
        C18518b c18518b;
        C18526j c18526j;
        AbstractC18522f abstractC18522f;
        AbstractC18522f abstractC18522f2;
        String str2 = str;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i14 = eVar.f93146x;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f93146x = i14 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f93144v;
                m142578e = AbstractC28298d.m142578e();
                i13 = eVar2.f93146x;
                if (i13 == 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            abstractC18522f2 = (AbstractC18522f) eVar2.f93141s;
                            AbstractC24862s.m129228b(obj);
                            return abstractC18522f2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c18526j = (C18526j) eVar2.f93143u;
                    String str3 = (String) eVar2.f93142t;
                    c18518b = (C18518b) eVar2.f93141s;
                    AbstractC24862s.m129228b(obj);
                    str2 = str3;
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (profileAlbumItem != null) {
                        j13 = profileAlbumItem.m46300c().m46277e();
                    } else {
                        j13 = j12;
                    }
                    C18526j c18526j2 = new C18526j(str2, i12, j13);
                    C18517a c18517a = C18517a.f93095a;
                    eVar2.f93141s = this;
                    eVar2.f93142t = str2;
                    eVar2.f93143u = c18526j2;
                    eVar2.f93146x = 1;
                    obj = c18517a.m97875c(str, i11, j11, j12, i12, profileAlbumItem, trackingSource, eVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c18518b = this;
                    c18526j = c18526j2;
                }
                abstractC18522f = (AbstractC18522f) obj;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    AbstractC18522f.b bVar = (AbstractC18522f.b) abstractC18522f;
                    c18518b.f93107a.put(c18526j, bVar.m97906b());
                    MutableSharedFlow mutableSharedFlow = c18518b.f93108b;
                    C18529m c18529m = new C18529m(str2, (ProfileAlbumItem) bVar.m97906b());
                    eVar2.f93141s = abstractC18522f;
                    eVar2.f93142t = null;
                    eVar2.f93143u = null;
                    eVar2.f93146x = 2;
                    if (mutableSharedFlow.mo12109b(c18529m, eVar2) == m142578e) {
                        return m142578e;
                    }
                    abstractC18522f2 = abstractC18522f;
                    return abstractC18522f2;
                }
                return abstractC18522f;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.f93144v;
        m142578e = AbstractC28298d.m142578e();
        i13 = eVar22.f93146x;
        if (i13 == 0) {
        }
        abstractC18522f = (AbstractC18522f) obj2;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }
}
