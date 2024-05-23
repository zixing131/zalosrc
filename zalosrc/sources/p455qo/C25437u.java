package p455qo;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import is.C20830x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19384h;
import p398oo.C24346a;
import p398oo.C24362i;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p455qo.C25440x;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p688yo.EnumC31036b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.u */
/* loaded from: classes4.dex */
public final class C25437u extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC24374o f121762a;

    /* renamed from: b */
    private final C25440x f121763b;

    /* renamed from: qo.u$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final EnumC31036b f121764a;

        /* renamed from: b */
        private final boolean f121765b;

        public a(EnumC31036b enumC31036b, boolean z11) {
            AbstractC19074t.m100208f(enumC31036b, "tab");
            this.f121764a = enumC31036b;
            this.f121765b = z11;
        }

        /* renamed from: a */
        public final boolean m131750a() {
            return this.f121765b;
        }

        /* renamed from: b */
        public final EnumC31036b m131751b() {
            return this.f121764a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f121764a == aVar.f121764a && this.f121765b == aVar.f121765b;
        }

        public int hashCode() {
            return (this.f121764a.hashCode() * 31) + AbstractC2144f.m11520a(this.f121765b);
        }

        public String toString() {
            return "Param(tab=" + this.f121764a + ", forceRefresh=" + this.f121765b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.u$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f121766q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f121766q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "[LOAD FEED FLOW] " + this.f121766q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.u$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121767t;

        /* renamed from: u */
        int f121768u;

        /* renamed from: v */
        private /* synthetic */ Object f121769v;

        /* renamed from: x */
        final /* synthetic */ a f121771x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121771x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f121771x, continuation);
            cVar.f121769v = obj;
            return cVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x013a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ff A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: Exception -> 0x0040, TryCatch #1 {Exception -> 0x0040, blocks: (B:18:0x003b, B:19:0x00e7, B:24:0x004a, B:25:0x00c4, B:32:0x0077, B:34:0x009e, B:37:0x00b7), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[Catch: Exception -> 0x0040, TryCatch #1 {Exception -> 0x0040, blocks: (B:18:0x003b, B:19:0x00e7, B:24:0x004a, B:25:0x00c4, B:32:0x0077, B:34:0x009e, B:37:0x00b7), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            Exception e11;
            FlowCollector flowCollector2;
            AbstractC25468a.a aVar;
            AbstractC25468a.b bVar;
            C24362i mo127472d;
            C25440x c25440x;
            C25440x.a aVar2;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121768u;
            try {
                try {
                } catch (Exception e12) {
                    e = e12;
                    flowCollector = r12;
                    e11 = e;
                    if (!(e11 instanceof ExceptionFeed)) {
                    }
                    if (C24346a.f117452a.m127219b(e11)) {
                    }
                    aVar = new AbstractC25468a.a(e11);
                    this.f121769v = null;
                    this.f121767t = null;
                    this.f121768u = 7;
                    if (flowCollector.mo12109b(aVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } catch (Exception e13) {
                e = e13;
                e11 = e;
                if (!(e11 instanceof ExceptionFeed)) {
                }
                if (C24346a.f117452a.m127219b(e11)) {
                }
                aVar = new AbstractC25468a.a(e11);
                this.f121769v = null;
                this.f121767t = null;
                this.f121768u = 7;
                if (flowCollector.mo12109b(aVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector3 = (FlowCollector) this.f121769v;
                    try {
                        bVar = AbstractC25468a.b.f122049a;
                        this.f121769v = flowCollector3;
                        this.f121768u = 1;
                    } catch (Exception e14) {
                        e11 = e14;
                        flowCollector = flowCollector3;
                        if (!(e11 instanceof ExceptionFeed)) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                        if (C24346a.f117452a.m127219b(e11)) {
                            C25407f c25407f = new C25407f(null, null, 3, null);
                            this.f121769v = flowCollector;
                            this.f121767t = e11;
                            this.f121768u = 6;
                            if (c25407f.m101503a(this) == m142578e) {
                                return m142578e;
                            }
                            flowCollector2 = flowCollector;
                            flowCollector = flowCollector2;
                        }
                        aVar = new AbstractC25468a.a(e11);
                        this.f121769v = null;
                        this.f121767t = null;
                        this.f121768u = 7;
                        if (flowCollector.mo12109b(aVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector3;
                    C25437u.this.m131748j(String.valueOf(this.f121771x));
                    mo127472d = C25437u.this.f121762a.mo127472d(this.f121771x.m131751b().m150864c());
                    if (!this.f121771x.m131750a()) {
                        C25437u.this.m131747i(this.f121771x.m131751b());
                        this.f121769v = flowCollector;
                        this.f121767t = mo127472d;
                        this.f121768u = 2;
                        if (mo127472d.m127401h(this) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        this.f121769v = flowCollector;
                        this.f121767t = mo127472d;
                        this.f121768u = 3;
                        if (mo127472d.m127416w(this) == m142578e) {
                            return m142578e;
                        }
                    }
                    c25440x = C25437u.this.f121763b;
                    aVar2 = new C25440x.a(this.f121771x.m131751b().m150864c());
                    this.f121769v = flowCollector;
                    this.f121767t = mo127472d;
                    this.f121768u = 4;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                        return m142578e;
                    }
                    cVar = new AbstractC25468a.c(C25437u.this.m131746h(mo127472d));
                    this.f121769v = flowCollector;
                    this.f121767t = null;
                    this.f121768u = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                    FlowCollector flowCollector4 = (FlowCollector) this.f121769v;
                    AbstractC24862s.m129228b(obj);
                    flowCollector = flowCollector4;
                    C25437u.this.m131748j(String.valueOf(this.f121771x));
                    mo127472d = C25437u.this.f121762a.mo127472d(this.f121771x.m131751b().m150864c());
                    if (!this.f121771x.m131750a()) {
                    }
                    c25440x = C25437u.this.f121763b;
                    aVar2 = new C25440x.a(this.f121771x.m131751b().m150864c());
                    this.f121769v = flowCollector;
                    this.f121767t = mo127472d;
                    this.f121768u = 4;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                    }
                    cVar = new AbstractC25468a.c(C25437u.this.m131746h(mo127472d));
                    this.f121769v = flowCollector;
                    this.f121767t = null;
                    this.f121768u = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 2:
                    mo127472d = (C24362i) this.f121767t;
                    flowCollector = (FlowCollector) this.f121769v;
                    AbstractC24862s.m129228b(obj);
                    c25440x = C25437u.this.f121763b;
                    aVar2 = new C25440x.a(this.f121771x.m131751b().m150864c());
                    this.f121769v = flowCollector;
                    this.f121767t = mo127472d;
                    this.f121768u = 4;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                    }
                    cVar = new AbstractC25468a.c(C25437u.this.m131746h(mo127472d));
                    this.f121769v = flowCollector;
                    this.f121767t = null;
                    this.f121768u = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 3:
                    mo127472d = (C24362i) this.f121767t;
                    flowCollector = (FlowCollector) this.f121769v;
                    AbstractC24862s.m129228b(obj);
                    c25440x = C25437u.this.f121763b;
                    aVar2 = new C25440x.a(this.f121771x.m131751b().m150864c());
                    this.f121769v = flowCollector;
                    this.f121767t = mo127472d;
                    this.f121768u = 4;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                    }
                    cVar = new AbstractC25468a.c(C25437u.this.m131746h(mo127472d));
                    this.f121769v = flowCollector;
                    this.f121767t = null;
                    this.f121768u = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 4:
                    mo127472d = (C24362i) this.f121767t;
                    flowCollector = (FlowCollector) this.f121769v;
                    AbstractC24862s.m129228b(obj);
                    cVar = new AbstractC25468a.c(C25437u.this.m131746h(mo127472d));
                    this.f121769v = flowCollector;
                    this.f121767t = null;
                    this.f121768u = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 5:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 6:
                    e11 = (Exception) this.f121767t;
                    flowCollector2 = (FlowCollector) this.f121769v;
                    AbstractC24862s.m129228b(obj);
                    flowCollector = flowCollector2;
                    aVar = new AbstractC25468a.a(e11);
                    this.f121769v = null;
                    this.f121767t = null;
                    this.f121768u = 7;
                    if (flowCollector.mo12109b(aVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 7:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25437u(InterfaceC24374o interfaceC24374o, C25440x c25440x, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o, c25440x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final List m131746h(C24362i c24362i) {
        List m127405l = c24362i.m127405l();
        int size = m127405l.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList m14335h0 = ((C3000l0) m127405l.get(i11)).m14335h0();
            if (m14335h0 != null) {
                Iterator it = m14335h0.iterator();
                while (it.hasNext()) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                    String str = itemAlbumMobile.f42609y;
                    AbstractC19074t.m100207e(str, "localPath");
                    if (str.length() > 0) {
                        itemAlbumMobile.f42609y = "";
                        itemAlbumMobile.f42611z = "";
                        itemAlbumMobile.f42550D = "";
                    }
                }
            }
        }
        return m127405l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m131747i(EnumC31036b enumC31036b) {
        C20830x0.f102390a.m108870n(enumC31036b, 0);
        AbstractC20833z.m108895J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m131748j(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "LOAD_FEED_TIMELINE_USE_CASE", new b(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C25437u(InterfaceC24374o interfaceC24374o, C25440x c25440x) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        AbstractC19074t.m100208f(c25440x, "preloadFeedAdsUseCase");
        this.f121762a = interfaceC24374o;
        this.f121763b = c25440x;
    }
}
