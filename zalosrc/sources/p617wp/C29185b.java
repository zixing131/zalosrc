package p617wp;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p142ey.C18635e;
import p142ey.C18644n;
import p142ey.InterfaceC18632b;
import p185gc.AbstractC19377a;
import p458qr.AbstractC25468a;
import p461qu.AbstractC25495a;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p582vp.C28567c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: wp.b */
/* loaded from: classes4.dex */
public final class C29185b extends AbstractC19377a {

    /* renamed from: a */
    private final C28567c f135195a;

    /* renamed from: b */
    private final InterfaceC18632b f135196b;

    /* renamed from: c */
    private final InterfaceC26357f f135197c;

    /* renamed from: wp.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f135198a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "userId");
            this.f135198a = str;
        }

        /* renamed from: a */
        public final String m145700a() {
            return this.f135198a;
        }
    }

    /* renamed from: wp.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f135199q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f135199q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start executing use case: " + this.f135199q;
        }
    }

    /* renamed from: wp.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f135200t;

        /* renamed from: u */
        private /* synthetic */ Object f135201u;

        /* renamed from: w */
        final /* synthetic */ a f135203w;

        /* renamed from: wp.b$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f135204q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Emitting state loading";
            }
        }

        /* renamed from: wp.b$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ boolean f135205q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11) {
                super(0);
                this.f135205q = z11;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed success. Emitting result: " + this.f135205q;
            }
        }

        /* renamed from: wp.b$c$c */
        /* loaded from: classes4.dex */
        public static final class C33043c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Exception f135206q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33043c(Exception exc) {
                super(0);
                this.f135206q = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed fail. Emitting error: " + this.f135206q;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f135203w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f135203w, continuation);
            cVar.f135201u = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(3:(1:(1:7)(2:11|12))(3:13|14|15)|8|9)(8:21|22|23|24|25|(1:27)|8|9))(1:31))(2:77|(1:79))|32|33|34|(2:(4:44|(1:46)|47|(1:49))(1:37)|38)(9:50|(4:53|(2:59|60)|61|51)|65|66|(2:69|67)|70|71|(1:73)|74)|39|(1:41)(5:42|25|(0)|8|9)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0178, code lost:            return r2;     */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x009d, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x009e, code lost:            r5 = r11;     */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0178 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0159 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            List m131187O0;
            int m131511r;
            List m131187O02;
            Object m142985h;
            FlowCollector flowCollector3;
            AbstractC25468a.c cVar;
            AbstractC25468a.a aVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f135200t;
            int i12 = 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            flowCollector2 = (FlowCollector) this.f135201u;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e11) {
                                e = e11;
                                C29185b.this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", new C33043c(e));
                                aVar = new AbstractC25468a.a(e);
                                this.f135201u = null;
                                this.f135200t = 4;
                                if (flowCollector2.mo12109b(aVar, this) == m142578e) {
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector3 = (FlowCollector) this.f135201u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m142985h = obj;
                        boolean booleanValue = ((Boolean) m142985h).booleanValue();
                        C29185b.this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", new b(booleanValue));
                        cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                        this.f135201u = flowCollector3;
                        this.f135200t = 3;
                        if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        flowCollector2 = flowCollector3;
                        C29185b.this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", new C33043c(e));
                        aVar = new AbstractC25468a.a(e);
                        this.f135201u = null;
                        this.f135200t = 4;
                        if (flowCollector2.mo12109b(aVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f135201u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f135201u;
                C29185b.this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", a.f135204q);
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f135201u = flowCollector;
                this.f135200t = 1;
                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            FlowCollector flowCollector4 = flowCollector;
            String m145700a = this.f135203w.m145700a();
            int m142982e = C29185b.this.f135195a.m142982e();
            m131187O0 = AbstractC25332a0.m131187O0(C29185b.this.f135195a.m142981d());
            if (m142982e != 0) {
                if (m142982e == 2) {
                    if (m131187O0.contains(m145700a)) {
                        m131187O0.remove(m145700a);
                    }
                    if (m131187O0.isEmpty()) {
                    }
                }
                i12 = m142982e;
            } else {
                C18635e mo98465a = C29185b.this.f135196b.mo98465a(null, false);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : mo98465a) {
                    ContactProfile contactProfile = (ContactProfile) obj2;
                    if (!AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i) && !AbstractC25495a.m132086k(contactProfile.f42434r) && !contactProfile.m40372J0()) {
                        arrayList.add(obj2);
                    }
                }
                m131511r = AbstractC25370t.m131511r(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ContactProfile) it.next()).f42434r);
                }
                m131187O02 = AbstractC25332a0.m131187O0(arrayList2);
                if (m131187O02.contains(m145700a)) {
                    m131187O02.remove(m145700a);
                }
                m131187O0.clear();
                m131187O0.addAll(m131187O02);
                i12 = 2;
            }
            C28567c c28567c = C29185b.this.f135195a;
            this.f135201u = flowCollector4;
            this.f135200t = 2;
            m142985h = c28567c.m142985h(i12, m131187O0, this);
            if (m142985h == m142578e) {
                return m142578e;
            }
            flowCollector3 = flowCollector4;
            boolean booleanValue2 = ((Boolean) m142985h).booleanValue();
            C29185b.this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", new b(booleanValue2));
            cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue2));
            this.f135201u = flowCollector3;
            this.f135200t = 3;
            if (flowCollector3.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C29185b(C28567c c28567c, InterfaceC18632b interfaceC18632b, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this(c28567c, interfaceC18632b, (i11 & 4) != 0 ? C26359h.f125209a : interfaceC26357f);
        c28567c = (i11 & 1) != 0 ? C28567c.a.m142987c(C28567c.Companion, null, null, null, 7, null) : c28567c;
        if ((i11 & 2) != 0) {
            interfaceC18632b = C18644n.m98531l();
            AbstractC19074t.m100207e(interfaceC18632b, "getInstance(...)");
        }
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: f */
    public Object mo451b(a aVar, Continuation continuation) {
        this.f135197c.mo135685a("SETTING_INLINE", "USE_CASE_FOLLOW_NEW_FEED_NOTIFICATION", new b(aVar));
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C29185b(C28567c c28567c, InterfaceC18632b interfaceC18632b, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28567c, "repository");
        AbstractC19074t.m100208f(interfaceC18632b, "zaloFriendManager");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f135195a = c28567c;
        this.f135196b = interfaceC18632b;
        this.f135197c = interfaceC26357f;
    }
}
