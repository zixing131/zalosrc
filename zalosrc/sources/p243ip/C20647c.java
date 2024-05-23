package p243ip;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.likedetail.model.ExceptionGetLikeDetail;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.AbstractC21339c;
import jp.C21337a;
import jp.C21338b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p236ic.AbstractC20504a;
import p304ks.AbstractC21935u;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p330lp.C22636d;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p556ur.C27360c;
import p584vr.C28605b;
import p584vr.C28606c;
import p584vr.C28607d;
import p584vr.C28608e;
import p584vr.InterfaceC28604a;
import p619wr.C29198e;
import p619wr.InterfaceC29195b;
import p716zh.C32002l4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: ip.c */
/* loaded from: classes4.dex */
public final class C20647c extends AbstractC19962a implements InterfaceC20645a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private String f101570A;

    /* renamed from: B */
    private int f101571B;

    /* renamed from: C */
    private String f101572C;

    /* renamed from: D */
    private C21338b f101573D;

    /* renamed from: E */
    private C21337a f101574E;

    /* renamed from: F */
    private Job f101575F;

    /* renamed from: t */
    private final C22634b f101576t;

    /* renamed from: u */
    private final C22635c f101577u;

    /* renamed from: v */
    private final C22633a f101578v;

    /* renamed from: w */
    private final C22636d f101579w;

    /* renamed from: x */
    private int f101580x;

    /* renamed from: y */
    private String f101581y;

    /* renamed from: z */
    private String f101582z;

    /* renamed from: ip.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ip.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101583t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ip.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20647c f101585p;

            a(C20647c c20647c) {
                this.f101585p = c20647c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f101585p.f101574E = (C21337a) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    InterfaceC20646b interfaceC20646b = (InterfaceC20646b) this.f101585p.m103742Dp();
                    C20647c c20647c = this.f101585p;
                    interfaceC20646b.mo42994dC(C20647c.m107608Yp(c20647c, false, false, c20647c.f101574E.m110520m(), this.f101585p.f101574E.m110515h(), null, 16, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    InterfaceC20646b interfaceC20646b2 = (InterfaceC20646b) this.f101585p.m103742Dp();
                    C20647c c20647c2 = this.f101585p;
                    interfaceC20646b2.mo42994dC(c20647c2.m107607Xp(false, true, c20647c2.f101574E.m110520m(), this.f101585p.f101574E.m110515h(), this.f101585p.m107616gq(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    InterfaceC20646b interfaceC20646b3 = (InterfaceC20646b) this.f101585p.m103742Dp();
                    C20647c c20647c3 = this.f101585p;
                    interfaceC20646b3.mo42994dC(C20647c.m107608Yp(c20647c3, true, false, c20647c3.f101574E.m110520m(), this.f101585p.f101574E.m110515h(), null, 16, null));
                }
                return C24848g0.f119245a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101583t;
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
                C20647c.this.f101574E.m110521n(C20647c.this.f101570A);
                C20647c.this.f101574E.m110522o(C20647c.this.f101581y);
                C20647c.this.f101574E.m110526s(C20647c.this.f101582z);
                C22633a c22633a = C20647c.this.f101578v;
                C22633a.a aVar = new C22633a.a(C20647c.this.f101574E);
                this.f101583t = 1;
                obj = c22633a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C20647c.this);
                this.f101583t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ip.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101586t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ip.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20647c f101588p;

            a(C20647c c20647c) {
                this.f101588p = c20647c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f101588p.f101573D = (C21338b) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    InterfaceC20646b interfaceC20646b = (InterfaceC20646b) this.f101588p.m103742Dp();
                    C20647c c20647c = this.f101588p;
                    interfaceC20646b.mo42994dC(C20647c.m107608Yp(c20647c, false, false, c20647c.f101573D.m110537j(), this.f101588p.f101573D.m110534g(), null, 16, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    InterfaceC20646b interfaceC20646b2 = (InterfaceC20646b) this.f101588p.m103742Dp();
                    C20647c c20647c2 = this.f101588p;
                    interfaceC20646b2.mo42994dC(c20647c2.m107607Xp(false, true, c20647c2.f101573D.m110537j(), this.f101588p.f101573D.m110534g(), this.f101588p.m107616gq(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    InterfaceC20646b interfaceC20646b3 = (InterfaceC20646b) this.f101588p.m103742Dp();
                    C20647c c20647c3 = this.f101588p;
                    interfaceC20646b3.mo42994dC(C20647c.m107608Yp(c20647c3, true, false, c20647c3.f101573D.m110537j(), this.f101588p.f101573D.m110534g(), null, 16, null));
                }
                return C24848g0.f119245a;
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101586t;
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
                C22634b c22634b = C20647c.this.f101576t;
                C22634b.a aVar = new C22634b.a(C20647c.this.f101573D);
                this.f101586t = 1;
                obj = c22634b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C20647c.this);
                this.f101586t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ip.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101589t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ip.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20647c f101591p;

            a(C20647c c20647c) {
                this.f101591p = c20647c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f101591p.f101573D = (C21338b) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    InterfaceC20646b interfaceC20646b = (InterfaceC20646b) this.f101591p.m103742Dp();
                    C20647c c20647c = this.f101591p;
                    interfaceC20646b.mo42994dC(C20647c.m107608Yp(c20647c, false, false, c20647c.f101573D.m110537j(), this.f101591p.f101573D.m110534g(), null, 16, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    InterfaceC20646b interfaceC20646b2 = (InterfaceC20646b) this.f101591p.m103742Dp();
                    C20647c c20647c2 = this.f101591p;
                    interfaceC20646b2.mo42994dC(c20647c2.m107607Xp(false, true, c20647c2.f101573D.m110537j(), this.f101591p.f101573D.m110534g(), this.f101591p.m107616gq(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    InterfaceC20646b interfaceC20646b3 = (InterfaceC20646b) this.f101591p.m103742Dp();
                    C20647c c20647c3 = this.f101591p;
                    interfaceC20646b3.mo42994dC(C20647c.m107608Yp(c20647c3, true, false, c20647c3.f101573D.m110537j(), this.f101591p.f101573D.m110534g(), null, 16, null));
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
            int i11 = this.f101589t;
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
                C22635c c22635c = C20647c.this.f101577u;
                C22635c.a aVar = new C22635c.a(C20647c.this.f101573D);
                this.f101589t = 1;
                obj = c22635c.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C20647c.this);
                this.f101589t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20647c(InterfaceC20646b interfaceC20646b, C22634b c22634b, C22635c c22635c, C22633a c22633a, C22636d c22636d) {
        super(interfaceC20646b);
        AbstractC19074t.m100208f(interfaceC20646b, "mvpView");
        AbstractC19074t.m100208f(c22634b, "getListLikeFeed");
        AbstractC19074t.m100208f(c22635c, "getListLikePhoto");
        AbstractC19074t.m100208f(c22633a, "getListLikeComment");
        AbstractC19074t.m100208f(c22636d, "textProvider");
        this.f101576t = c22634b;
        this.f101577u = c22635c;
        this.f101578v = c22633a;
        this.f101579w = c22636d;
        this.f101581y = "";
        this.f101582z = "";
        this.f101570A = "";
        this.f101572C = "";
        this.f101573D = new C21338b(null, 0, null, 0, null, false, 0, 127, null);
        this.f101574E = new C21337a(null, 0, null, null, null, 0, 0, 0, null, false, 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xp */
    public final C20649e m107607Xp(boolean z11, boolean z12, int i11, List list, String str) {
        int i12;
        int i13;
        String str2;
        int i14;
        boolean z13 = false;
        int i15 = -1;
        if (!list.isEmpty()) {
            if (z11) {
                i14 = 1;
            } else if (z12) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            i15 = i14;
            i13 = -1;
        } else {
            if (z11) {
                i12 = 11;
            } else if (z12) {
                i12 = 12;
            } else {
                i12 = 10;
            }
            i13 = i12;
        }
        if (!z11 && !z12) {
            str2 = this.f101579w.m117196a(i11, this.f101580x);
        } else {
            str2 = "";
        }
        String str3 = str2;
        if ((m107611bq() || m107612cq()) && this.f101572C.length() > 0 && AbstractC19074t.m100204b(this.f101572C, CoreUtility.f89233i)) {
            z13 = true;
        }
        return new C20649e(i15, i13, str3, list, str, !z13);
    }

    /* renamed from: Yp */
    static /* synthetic */ C20649e m107608Yp(C20647c c20647c, boolean z11, boolean z12, int i11, List list, String str, int i12, Object obj) {
        int i13;
        if ((i12 & 4) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            list = new ArrayList();
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            str = "";
        }
        return c20647c.m107607Xp(z11, z12, i13, list2, str);
    }

    /* renamed from: Zp */
    private final void m107609Zp() {
        try {
            switch (this.f101571B) {
                case 1000:
                    AbstractC23647d.m123897g("4915600");
                    break;
                case 1001:
                    AbstractC23647d.m123897g("4915601");
                    break;
                case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                    AbstractC23647d.m123897g("4915602");
                    break;
                case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                    AbstractC23647d.m123897g("4915603");
                    break;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aq */
    private final boolean m107610aq() {
        Job job = this.f101575F;
        if (job != null) {
            return job.mo112496c();
        }
        return false;
    }

    /* renamed from: bq */
    private final boolean m107611bq() {
        return this.f101580x == 0;
    }

    /* renamed from: cq */
    private final boolean m107612cq() {
        return this.f101580x == 1;
    }

    /* renamed from: dq */
    private final void m107613dq() {
        Job m112540d;
        if (!m107610aq()) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new b(null), 3, null);
            this.f101575F = m112540d;
        }
    }

    /* renamed from: eq */
    private final void m107614eq() {
        Job m112540d;
        if (m107610aq()) {
            return;
        }
        if (this.f101581y.length() == 0) {
            m107609Zp();
            ((InterfaceC20646b) m103742Dp()).mo42994dC(m107608Yp(this, false, true, 0, null, m107616gq(ExceptionGetLikeDetail.f46296p), 12, null));
        } else {
            this.f101573D.m110539l(this.f101581y);
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new c(null), 3, null);
            this.f101575F = m112540d;
        }
    }

    /* renamed from: fq */
    private final void m107615fq() {
        Job m112540d;
        if (m107610aq()) {
            return;
        }
        if (this.f101582z.length() == 0) {
            m107609Zp();
            ((InterfaceC20646b) m103742Dp()).mo42994dC(m107608Yp(this, false, true, 0, null, m107616gq(ExceptionGetLikeDetail.f46296p), 12, null));
        } else {
            this.f101573D.m110539l(this.f101582z);
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new d(null), 3, null);
            this.f101575F = m112540d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gq */
    public final String m107616gq(Exception exc) {
        int i11;
        if (exc instanceof ExceptionGetLikeDetail) {
            i11 = AbstractC8020f0.str_likes_dialog_error;
        } else {
            i11 = AbstractC8020f0.unknown_error;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: iq */
    private final void m107617iq(InterfaceC27218a interfaceC27218a, InterfaceC29195b interfaceC29195b, C32002l4 c32002l4) {
        if (interfaceC29195b instanceof C29198e) {
            C29198e c29198e = (C29198e) interfaceC29195b;
            if (c29198e.m145765c()) {
                ((InterfaceC20646b) m103742Dp()).mo42995jB(c29198e.m145768f());
            } else {
                m107619kq(interfaceC27218a, interfaceC29195b, c32002l4);
            }
        }
    }

    /* renamed from: jq */
    private final void m107618jq(InterfaceC27218a interfaceC27218a, InterfaceC29195b interfaceC29195b) {
        if (interfaceC29195b instanceof C29198e) {
            FeedActionZUtils.m47567y(interfaceC27218a, ((C29198e) interfaceC29195b).m145768f());
        }
    }

    /* renamed from: kq */
    private final void m107619kq(InterfaceC27218a interfaceC27218a, InterfaceC29195b interfaceC29195b, C32002l4 c32002l4) {
        if (interfaceC29195b instanceof C29198e) {
            FeedActionZUtils.m47568z(interfaceC27218a, ((C29198e) interfaceC29195b).m145768f(), null, c32002l4);
        }
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: C7 */
    public C29198e mo107587C7(LikeContactItem likeContactItem) {
        int i11;
        AbstractC19074t.m100208f(likeContactItem, "item");
        if (this.f101580x != 2 && likeContactItem.m56332c() != 0) {
            i11 = likeContactItem.m56332c();
        } else {
            i11 = 1;
        }
        String m56333d = likeContactItem.m56333d();
        AbstractC19074t.m100207e(m56333d, "getUserId(...)");
        String m56330a = likeContactItem.m56330a();
        AbstractC19074t.m100207e(m56330a, "getAvatar(...)");
        String m56331b = likeContactItem.m56331b();
        AbstractC19074t.m100207e(m56331b, "getDisplayName(...)");
        boolean m115116F = AbstractC22055v0.m115116F(likeContactItem.m56333d(), false);
        boolean m115115E = AbstractC22055v0.m115115E(likeContactItem.m56333d(), false);
        String m114542i = AbstractC21935u.m114542i(likeContactItem.m56333d(), likeContactItem.m56331b());
        AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
        return new C29198e(m56333d, m56330a, m56331b, i11, m115116F, m115115E, m114542i);
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: K9 */
    public void mo107588K9(InterfaceC28604a interfaceC28604a, InterfaceC27218a interfaceC27218a, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(interfaceC28604a, "event");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (interfaceC28604a instanceof C28608e) {
            mo107594wb();
            return;
        }
        if (interfaceC28604a instanceof C28606c) {
            m107618jq(interfaceC27218a, ((C28606c) interfaceC28604a).m143022a());
        } else if (interfaceC28604a instanceof C28607d) {
            m107619kq(interfaceC27218a, ((C28607d) interfaceC28604a).m143023a(), c32002l4);
        } else if (interfaceC28604a instanceof C28605b) {
            m107617iq(interfaceC27218a, ((C28605b) interfaceC28604a).m143020a(), c32002l4);
        }
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: S0 */
    public void mo107589S0() {
        this.f101573D = new C21338b(null, 0, null, 0, null, false, 0, 127, null);
        this.f101574E = new C21337a(null, 0, null, null, null, 0, 0, 0, null, false, 1023, null);
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: c5 */
    public void mo107590c5(List list, String str) {
        AbstractC19074t.m100208f(list, "feedReactionDataList");
        AbstractC19074t.m100208f(str, "uid");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27360c c27360c = (C27360c) it.next();
            if ((c27360c.m140157a() instanceof C29198e) && AbstractC19074t.m100204b(((C29198e) c27360c.m140157a()).m145768f(), str)) {
                ((C29198e) c27360c.m140157a()).m145770h(AbstractC22055v0.m115116F(((C29198e) c27360c.m140157a()).m145768f(), false));
                ((C29198e) c27360c.m140157a()).m145769g(AbstractC22055v0.m115115E(((C29198e) c27360c.m140157a()).m145768f(), false));
                return;
            }
        }
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: ec */
    public void mo107591ec() {
        mo107593r1();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: hq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C20648d c20648d, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c20648d, interfaceC19968g);
        if (c20648d != null) {
            int i11 = c20648d.f101592a;
            this.f101580x = i11;
            this.f101581y = c20648d.f101593b;
            String str = c20648d.f101594c;
            this.f101582z = str;
            if (i11 == 2 && str.length() == 0) {
                this.f101582z = "0";
            }
            this.f101571B = c20648d.f101596e;
            this.f101570A = c20648d.f101595d;
            this.f101572C = c20648d.f101597f;
        }
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: n */
    public void mo107592n() {
        CoroutineScopeKt.m112639c(AbstractC20504a.m106544a(this), null, 1, null);
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: r1 */
    public void mo107593r1() {
        if (this.f101580x == 0) {
            AbstractC23647d.m123897g("18300");
        }
        int i11 = this.f101580x;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m107613dq();
                    return;
                }
                return;
            }
            m107615fq();
            return;
        }
        m107614eq();
    }

    @Override // p243ip.InterfaceC20645a
    /* renamed from: wb */
    public void mo107594wb() {
        mo107593r1();
    }
}
