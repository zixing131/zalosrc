package aq;

import ag0.AbstractC0837p0;
import am.C0943w;
import ar.C2297a;
import ar.C2300b0;
import ar.C2304e;
import ar.C2306g;
import ar.C2308i;
import ar.C2316q;
import ar.C2318s;
import ar.C2320u;
import bg0.C2797c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.C23055e5;
import on0.AbstractC24342w;
import p083cq.C17555b;
import p083cq.C17557d;
import p083cq.C17559f;
import p083cq.C17561h;
import p083cq.C17562i;
import p083cq.C17564k;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p236ic.AbstractC20504a;
import p304ks.C21927m;
import p361nb.AbstractC23647d;
import p458qr.AbstractC25468a;
import p458qr.C25479l;
import p510sq.C26365a;
import p604wb.C28905e;
import p653xp.C30190a;
import p716zh.C31973j5;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32078q7;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import vg.C28023b6;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: aq.g */
/* loaded from: classes4.dex */
public final class C2287g extends AbstractC19962a implements InterfaceC2283c {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final C2288h f9647t;

    /* renamed from: u */
    private List f9648u;

    /* renamed from: v */
    private long f9649v;

    /* renamed from: w */
    private final AtomicBoolean f9650w;

    /* renamed from: x */
    private final InterfaceC24854k f9651x;

    /* renamed from: aq.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: aq.g$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9652t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: aq.g$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C2287g f9654p;

            a(C2287g c2287g) {
                this.f9654p = c2287g;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                List m131187O0;
                long j11;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    C2287g c2287g = this.f9654p;
                    m131187O0 = AbstractC25332a0.m131187O0((Collection) ((AbstractC25468a.c) abstractC25468a).m131935a());
                    c2287g.f9648u = m131187O0;
                    if (!this.f9654p.f9648u.isEmpty()) {
                        ((InterfaceC2284d) this.f9654p.m103742Dp()).mo12049c6(this.f9654p.f9648u);
                    }
                    ((InterfaceC2284d) this.f9654p.m103742Dp()).mo12041EG(false, !this.f9654p.f9648u.isEmpty());
                    if (!this.f9654p.f9648u.isEmpty()) {
                        j11 = 500;
                    } else {
                        j11 = 0;
                    }
                    this.f9654p.mo12024M7(j11);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    AbstractC20110a.f98889a.mo104552e(((AbstractC25468a.a) abstractC25468a).m131934a());
                } else {
                    boolean z11 = abstractC25468a instanceof AbstractC25468a.b;
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
            int i11 = this.f9652t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) new C17561h(C2287g.this.f9647t, C2287g.this.m12089hq()).m101506a();
                if (flow != null) {
                    a aVar = new a(C2287g.this);
                    this.f9652t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
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
    /* renamed from: aq.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9655t;

        /* renamed from: v */
        final /* synthetic */ long f9657v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: aq.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f9658t;

            /* renamed from: u */
            final /* synthetic */ long f9659u;

            /* renamed from: v */
            final /* synthetic */ C2287g f9660v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, C2287g c2287g, Continuation continuation) {
                super(2, continuation);
                this.f9659u = j11;
                this.f9660v = c2287g;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f9659u, this.f9660v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f9658t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    long j11 = this.f9659u;
                    this.f9658t = 1;
                    if (DelayKt.m112666b(j11, this) == m142578e) {
                        return m142578e;
                    }
                }
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                if (str.length() == 0) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_general_error_code, new Object[]{AbstractC29094b.m145341c(102)}));
                    ((InterfaceC2284d) this.f9660v.m103742Dp()).finish();
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: aq.g$c$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C2287g f9661p;

            /* renamed from: q */
            final /* synthetic */ long f9662q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: aq.g$c$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC29096d {

                /* renamed from: s */
                Object f9663s;

                /* renamed from: t */
                Object f9664t;

                /* renamed from: u */
                /* synthetic */ Object f9665u;

                /* renamed from: w */
                int f9667w;

                a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f9665u = obj;
                    this.f9667w |= Integer.MIN_VALUE;
                    return b.this.mo12109b(null, this);
                }
            }

            b(C2287g c2287g, long j11) {
                this.f9661p = c2287g;
                this.f9662q = j11;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(C17562i.a aVar, Continuation continuation) {
                a aVar2;
                Object m142578e;
                int i11;
                b bVar;
                int i12;
                b bVar2;
                List m131187O0;
                if (continuation instanceof a) {
                    aVar2 = (a) continuation;
                    int i13 = aVar2.f9667w;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        aVar2.f9667w = i13 - Integer.MIN_VALUE;
                        Object obj = aVar2.f9665u;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = aVar2.f9667w;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    aVar = (C17562i.a) aVar2.f9664t;
                                    bVar2 = (b) aVar2.f9663s;
                                    AbstractC24862s.m129228b(obj);
                                    C2287g c2287g = bVar2.f9661p;
                                    m131187O0 = AbstractC25332a0.m131187O0(((C17562i.a.b) aVar).m93518a());
                                    c2287g.f9648u = m131187O0;
                                    if (((InterfaceC2284d) bVar2.f9661p.m103742Dp()).mo45894h0()) {
                                        ((InterfaceC2284d) bVar2.f9661p.m103742Dp()).mo12049c6(bVar2.f9661p.f9648u);
                                        ((InterfaceC2284d) bVar2.f9661p.m103742Dp()).mo12041EG(false, !bVar2.f9661p.f9648u.isEmpty());
                                    }
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (C17562i.a) aVar2.f9664t;
                            bVar = (b) aVar2.f9663s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            AbstractC24862s.m129228b(obj);
                            this.f9661p.f9650w.set(false);
                            long j11 = this.f9662q;
                            aVar2.f9663s = this;
                            aVar2.f9664t = aVar;
                            aVar2.f9667w = 1;
                            if (DelayKt.m112666b(j11, aVar2) == m142578e) {
                                return m142578e;
                            }
                            bVar = this;
                        }
                        if (!(aVar instanceof C17562i.a.b)) {
                            long m12088fq = bVar.f9661p.m12088fq();
                            aVar2.f9663s = bVar;
                            aVar2.f9664t = aVar;
                            aVar2.f9667w = 2;
                            if (DelayKt.m112666b(m12088fq, aVar2) == m142578e) {
                                return m142578e;
                            }
                            bVar2 = bVar;
                            C2287g c2287g2 = bVar2.f9661p;
                            m131187O0 = AbstractC25332a0.m131187O0(((C17562i.a.b) aVar).m93518a());
                            c2287g2.f9648u = m131187O0;
                            if (((InterfaceC2284d) bVar2.f9661p.m103742Dp()).mo45894h0()) {
                            }
                            return C24848g0.f119245a;
                        }
                        if (aVar instanceof C17562i.a.C32798a) {
                            C20096c m93517a = ((C17562i.a.C32798a) aVar).m93517a();
                            if (m93517a != null) {
                                i12 = m93517a.m104491c();
                            } else {
                                i12 = -1;
                            }
                            if (i12 == 18028) {
                                new C17557d(bVar.f9661p.f9647t, bVar.f9661p.m12089hq()).m101506a();
                                bVar.f9661p.f9648u.clear();
                            }
                            if (((InterfaceC2284d) bVar.f9661p.m103742Dp()).mo45894h0()) {
                                ((InterfaceC2284d) bVar.f9661p.m103742Dp()).mo12056wh(i12, !bVar.f9661p.f9648u.isEmpty());
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                aVar2 = new a(continuation);
                Object obj2 = aVar2.f9665u;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar2.f9667w;
                if (i11 == 0) {
                }
                if (!(aVar instanceof C17562i.a.b)) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, Continuation continuation) {
            super(2, continuation);
            this.f9657v = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f9657v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9655t;
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
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(this.f9657v, C2287g.this, null);
                this.f9655t = 1;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            ((InterfaceC2284d) C2287g.this.m103742Dp()).mo12041EG(true, !C2287g.this.f9648u.isEmpty());
            C2287g.this.f9649v = System.currentTimeMillis();
            Flow flow = (Flow) new C17562i(C2287g.this.f9647t, C2287g.this.m12089hq()).m101506a();
            if (flow != null) {
                b bVar = new b(C2287g.this, this.f9657v);
                this.f9655t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
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

    /* renamed from: aq.g$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9668t;

        /* renamed from: v */
        final /* synthetic */ C32078q7 f9670v;

        /* renamed from: w */
        final /* synthetic */ int f9671w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: aq.g$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32078q7 f9672p;

            /* renamed from: q */
            final /* synthetic */ C2287g f9673q;

            /* renamed from: r */
            final /* synthetic */ int f9674r;

            a(C32078q7 c32078q7, C2287g c2287g, int i11) {
                this.f9672p = c32078q7;
                this.f9673q = c2287g;
                this.f9674r = i11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    try {
                        this.f9672p.f147742H = false;
                        int size = this.f9673q.f9648u.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                break;
                            }
                            if (AbstractC19074t.m100204b(((C32078q7) this.f9673q.f9648u.get(i11)).m154738A(), this.f9672p.m154738A()) && ((C32078q7) this.f9673q.f9648u.get(i11)).m154749L() == this.f9672p.m154749L()) {
                                ((C32078q7) this.f9673q.f9648u.get(i11)).f147742H = false;
                                break;
                            }
                            i11++;
                        }
                        ((InterfaceC2284d) this.f9673q.m103742Dp()).mo12049c6(this.f9673q.f9648u);
                        int m154743F = this.f9672p.m154743F();
                        if (this.f9673q.m12097qq(this.f9672p)) {
                            ArrayList m154758n = this.f9672p.m154758n();
                            if (m154758n != null) {
                                int size2 = m154758n.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    int m56406u = ((C10866e) m154758n.get(i12)).m56406u();
                                    String m56393i = ((C10866e) m154758n.get(i12)).m56393i();
                                    if (m56393i != null && m56393i.length() > 0) {
                                        if (m56406u == 1) {
                                            this.f9673q.m12100tq(m56393i, this.f9672p);
                                        } else if (m56406u == 2) {
                                            this.f9673q.m12102vq(m56393i, this.f9672p);
                                        }
                                    }
                                }
                            }
                        } else if (m154743F != 5) {
                            if (m154743F == 6) {
                                this.f9673q.m12099sq(this.f9672p);
                            } else if (m154743F == 1621) {
                                this.f9673q.m12093mq(this.f9674r, this.f9672p);
                            } else if (m154743F != 1622) {
                                switch (m154743F) {
                                    case 8:
                                        this.f9673q.m12098rq(this.f9672p);
                                        break;
                                    case 9:
                                        this.f9673q.m12091jq(this.f9672p);
                                        break;
                                    case 10:
                                        this.f9673q.m12090iq(this.f9672p);
                                        break;
                                    default:
                                        switch (m154743F) {
                                            case 12:
                                                this.f9673q.m12101uq(this.f9672p);
                                                break;
                                            case 13:
                                                this.f9673q.m12105kq(this.f9672p);
                                                break;
                                            case 14:
                                                this.f9673q.m12092lq();
                                                break;
                                            case 15:
                                                this.f9673q.m12094nq(this.f9672p);
                                                break;
                                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                this.f9673q.m12096pq(this.f9672p);
                                                break;
                                        }
                                }
                            } else {
                                this.f9673q.m12095oq(this.f9674r, this.f9672p);
                            }
                        } else {
                            this.f9673q.m12106wq(this.f9672p);
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    AbstractC20110a.f98889a.mo104552e(((AbstractC25468a.a) abstractC25468a).m131934a());
                } else {
                    boolean z11 = abstractC25468a instanceof AbstractC25468a.b;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C32078q7 c32078q7, int i11, Continuation continuation) {
            super(2, continuation);
            this.f9670v = c32078q7;
            this.f9671w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f9670v, this.f9671w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9668t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) new C17564k(C2287g.this.f9647t, C2287g.this.m12089hq()).m101509a(new C17564k.a(this.f9670v));
                if (flow != null) {
                    a aVar = new a(this.f9670v, C2287g.this, this.f9671w);
                    this.f9668t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
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

    /* renamed from: aq.g$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9675t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: aq.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C2287g f9677p;

            a(C2287g c2287g) {
                this.f9677p = c2287g;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                List m131187O0;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    C2287g c2287g = this.f9677p;
                    m131187O0 = AbstractC25332a0.m131187O0((Collection) ((AbstractC25468a.c) abstractC25468a).m131935a());
                    c2287g.f9648u = m131187O0;
                    if (!this.f9677p.f9648u.isEmpty()) {
                        ((InterfaceC2284d) this.f9677p.m103742Dp()).mo12049c6(this.f9677p.f9648u);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    AbstractC20110a.f98889a.mo104552e(((AbstractC25468a.a) abstractC25468a).m131934a());
                } else {
                    boolean z11 = abstractC25468a instanceof AbstractC25468a.b;
                }
                return C24848g0.f119245a;
            }
        }

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9675t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) new C17561h(C2287g.this.f9647t, C2287g.this.m12089hq()).m101506a();
                if (flow != null) {
                    a aVar = new a(C2287g.this);
                    this.f9675t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: aq.g$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f9678q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2287g(InterfaceC2284d interfaceC2284d, C2288h c2288h) {
        super(interfaceC2284d);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC2284d, "mvpView");
        AbstractC19074t.m100208f(c2288h, "repository");
        this.f9647t = c2288h;
        this.f9648u = new ArrayList();
        this.f9650w = new AtomicBoolean(false);
        m129210a = AbstractC24856m.m129210a(f.f9678q);
        this.f9651x = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fq */
    public final long m12088fq() {
        if (System.currentTimeMillis() - this.f9649v < 500) {
            return 500L;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public final C2797c m12089hq() {
        return (C2797c) this.f9651x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public final void m12090iq(C32078q7 c32078q7) {
        C2318s.a m12261b = C2318s.m12261b();
        String m154738A = c32078q7.m154738A();
        AbstractC19074t.m100207e(m154738A, "getNotificationObj(...)");
        C2318s m12263a = m12261b.m12264b(Integer.parseInt(m154738A)).m12263a();
        if (m12263a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12051fC(m12263a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jq */
    public final void m12091jq(C32078q7 c32078q7) {
        C2300b0 m12156a = C2300b0.m12154b().m12157b(c32078q7.m154738A()).m12156a();
        if (m12156a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12039Ce(m12156a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lq */
    public final void m12092lq() {
        C2316q m12259a = C2316q.m12257b().m12260b(C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_OPEN_INPUT)).m12259a();
        if (m12259a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12052ov(m12259a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mq */
    public final void m12093mq(int i11, C32078q7 c32078q7) {
        ((InterfaceC2284d) m103742Dp()).mo12044J5(i11, c32078q7, false);
        AbstractC23647d.m123906p("49150043");
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nq */
    public final void m12094nq(C32078q7 c32078q7) {
        String mo17218d = c32078q7.mo17218d();
        if (mo17218d.length() == 0) {
            mo17218d = "";
        }
        ((InterfaceC2284d) m103742Dp()).mo12050ez(new C2320u(mo17218d, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oq */
    public final void m12095oq(int i11, C32078q7 c32078q7) {
        ((InterfaceC2284d) m103742Dp()).mo12044J5(i11, c32078q7, true);
        AbstractC23647d.m123906p("49150043");
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public final void m12096pq(C32078q7 c32078q7) {
        ((InterfaceC2284d) m103742Dp()).mo12040Di(c32078q7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qq */
    public final boolean m12097qq(C32078q7 c32078q7) {
        int m154743F = c32078q7.m154743F();
        if (1 > m154743F || m154743F >= 5) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public final void m12098rq(C32078q7 c32078q7) {
        String m154738A = c32078q7.m154738A();
        if (m154738A != null) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(m154738A);
            ContactProfile contactProfile = new ContactProfile("group_" + m154738A);
            if (m4472f != null) {
                contactProfile.f42428p = 1;
                contactProfile.f42437s = m4472f.m153793y();
                contactProfile.f42446v = m4472f.m153756e();
                C2297a m12144a = C2297a.m12139b().m12147d(true).m12146c(m4472f).m12145b(contactProfile).m12144a();
                if (m12144a != null) {
                    ((InterfaceC2284d) m103742Dp()).mo12048Z3(m12144a);
                    return;
                }
                return;
            }
            ToastUtils.m89260h(17002, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sq */
    public final void m12099sq(C32078q7 c32078q7) {
        String m154744G = c32078q7.m154744G();
        if (m154744G != null) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, m154744G, null, 2, null);
            if (m141798e == null) {
                m141798e = new ContactProfile(m154744G);
            }
            C2297a m12144a = C2297a.m12139b().m12147d(false).m12145b(m141798e).m12144a();
            if (m12144a != null) {
                ((InterfaceC2284d) m103742Dp()).mo12048Z3(m12144a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tq */
    public final void m12100tq(String str, C32078q7 c32078q7) {
        List m127132B0;
        m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"/"}, false, 0, 6, null);
        String str2 = (String) m127132B0.get(0);
        String str3 = (String) m127132B0.get(1);
        C31987k4 c31987k4 = new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        c31987k4.m154202a("appID", c32078q7.m154763t());
        c31987k4.m154202a("actID", Integer.valueOf(c32078q7.m154749L()));
        c31987k4.m154202a("feedSrcNotification", Integer.valueOf(c32078q7.f147762b0));
        C2304e m12174a = C2304e.m12167b().m12176c(str3).m12179f(str2).m12178e(c32078q7.m154769z()).m12180g(2).m12175b(C32002l4.Companion.m154289c(c31987k4).m154277l()).m12177d(c32078q7.m154759o()).m12174a();
        if (m12174a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12043Im(m12174a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uq */
    public final void m12101uq(C32078q7 c32078q7) {
        int i11 = c32078q7.f147745K;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    String str = c32078q7.f147744J;
                    AbstractC19074t.m100207e(str, "nPackageName");
                    if (str.length() == 0 && c32078q7.f147746L > 0) {
                        C28905e.m144373n().m144396r(2, 82, String.valueOf(c32078q7.f147746L), "", "");
                    }
                }
            } else {
                String str2 = c32078q7.f147747M;
                AbstractC19074t.m100207e(str2, "nGameParams");
                if (str2.length() > 0) {
                    C28905e.m144373n().m144396r(0, 82, String.valueOf(c32078q7.f147746L), "", "");
                }
            }
        } else {
            C28905e.m144373n().m144396r(2, 82, String.valueOf(c32078q7.f147746L), "", "");
        }
        C2306g m12188a = C2306g.m12181b().m12189b(c32078q7.f147745K).m12190c(c32078q7.f147746L).m12194g(15).m12191d(c32078q7.f147747M).m12193f(c32078q7.f147744J).m12192e(c32078q7.f147743I).m12188a();
        if (m12188a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12055t7(m12188a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public final void m12102vq(String str, C32078q7 c32078q7) {
        List m127132B0;
        m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"/"}, false, 0, 6, null);
        String str2 = (String) m127132B0.get(0);
        String str3 = (String) m127132B0.get(1);
        C31987k4 c31987k4 = new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        c31987k4.m154202a("appID", c32078q7.m154763t());
        c31987k4.m154202a("actID", Integer.valueOf(c32078q7.m154749L()));
        c31987k4.m154202a("feedSrcNotification", Integer.valueOf(c32078q7.f147762b0));
        C2308i m12203a = C2308i.m12195b().m12210h(str2).m12208f(str3).m12207e(c32078q7.m154769z()).m12205c(c32078q7.m154766w()).m12206d(c32078q7.m154759o()).m12209g(2).m12204b(C32002l4.Companion.m154289c(c31987k4).m154277l()).m12203a();
        if (m12203a != null) {
            ((InterfaceC2284d) m103742Dp()).mo12042Hs(m12203a);
        }
    }

    /* renamed from: xq */
    private final void m12103xq(long j11) {
        Object obj;
        Iterator it = this.f9648u.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C32078q7) obj).m154769z() == j11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C32078q7 c32078q7 = (C32078q7) obj;
        if (c32078q7 != null) {
            this.f9648u.remove(c32078q7);
        }
        ((InterfaceC2284d) m103742Dp()).mo12049c6(this.f9648u);
        C17559f c17559f = new C17559f(this.f9647t, m12089hq());
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        c17559f.m101509a(new C17559f.a(str, j11));
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Ci */
    public void mo12022Ci() {
        String m118743r0;
        if (!C23055e5.m118273h(false, 1, null)) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_network_short);
            AbstractC19074t.m100205c(m118743r0);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
            AbstractC19074t.m100205c(m118743r0);
        }
        ((InterfaceC2284d) m103742Dp()).mo12057zF(new C25479l(m118743r0, -1, "", -1));
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Ei */
    public void mo12023Ei(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f9648u.size()) {
                    BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new d((C32078q7) this.f9648u.get(i11), i11, null), 3, null);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: M7 */
    public void mo12024M7(long j11) {
        try {
            if (this.f9650w.compareAndSet(false, true)) {
                BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new c(j11, null), 3, null);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: M9 */
    public void mo12025M9(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "photoId");
        if (!this.f9648u.isEmpty() && z11) {
            if (str.length() > 0 || str2.length() > 0) {
                List list = this.f9648u;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean z12 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C32078q7 c32078q7 = (C32078q7) next;
                    boolean m12097qq = m12097qq(c32078q7);
                    if ((str.length() <= 0 || !AbstractC19074t.m100204b(m12104gq(c32078q7), str)) && (str2.length() <= 0 || !AbstractC19074t.m100204b(c32078q7.m154745H(), str2))) {
                        z12 = false;
                    }
                    if (m12097qq && z12) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f9648u.removeAll(arrayList);
                    ((InterfaceC2284d) m103742Dp()).mo12049c6(this.f9648u);
                }
            }
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Mg */
    public void mo12026Mg(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        InterfaceC2284d interfaceC2284d = (InterfaceC2284d) m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_turn_on_feed_notification_success);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC2284d.mo12057zF(new C25479l(m118743r0, -1, "", -1));
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        new C17555b(this.f9647t, m12089hq()).m101506a();
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Pe */
    public void mo12027Pe(List list) {
        if (list != null && (!list.isEmpty())) {
            for (C32078q7 c32078q7 : this.f9648u) {
                if (c32078q7.m154743F() == 1621) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC19074t.m100204b(c32078q7.m154738A(), (String) it.next())) {
                                c32078q7.f147742H = false;
                                break;
                            }
                        }
                    }
                }
            }
            ((InterfaceC2284d) m103742Dp()).mo12049c6(this.f9648u);
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Sc */
    public void mo12028Sc() {
        ((InterfaceC2284d) m103742Dp()).mo12041EG(true, !this.f9648u.isEmpty());
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new b(null), 3, null);
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Um */
    public void mo12029Um(long j11) {
        m12103xq(j11);
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: Wn */
    public void mo12030Wn(C32078q7 c32078q7) {
        AbstractC19074t.m100208f(c32078q7, "notificationItem");
        ((InterfaceC2284d) m103742Dp()).mo12045Rc(c32078q7);
        ((InterfaceC2284d) m103742Dp()).mo12053r9(c32078q7);
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: ca */
    public void mo12031ca(String str) {
        AbstractC19074t.m100208f(str, "userId");
        String m148859d = C30190a.f140233a.m148859d(str);
        InterfaceC2284d interfaceC2284d = (InterfaceC2284d) m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_setting_undo);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC2284d.mo12057zF(new C25479l(m148859d, 0, m118743r0, 1001));
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: cc */
    public void mo12032cc(String str) {
        AbstractC19074t.m100208f(str, "uId");
        if (!this.f9648u.isEmpty() && str.length() > 0) {
            List list = this.f9648u;
            ArrayList<C32078q7> arrayList = new ArrayList();
            for (Object obj : list) {
                C32078q7 c32078q7 = (C32078q7) obj;
                if (m12097qq(c32078q7) && c32078q7.m154744G().equals(str)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f9648u.removeAll(arrayList);
                ((InterfaceC2284d) m103742Dp()).mo12049c6(this.f9648u);
                for (C32078q7 c32078q72 : arrayList) {
                    C17559f c17559f = new C17559f(this.f9647t, m12089hq());
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    c17559f.m101509a(new C17559f.a(str2, c32078q72.m154769z()));
                }
            }
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: gm */
    public void mo12033gm() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new e(null), 3, null);
    }

    /* renamed from: gq */
    public final String m12104gq(C32078q7 c32078q7) {
        List m127132B0;
        AbstractC19074t.m100208f(c32078q7, "notificationItem");
        ArrayList m154758n = c32078q7.m154758n();
        if (m154758n != null) {
            Iterator it = m154758n.iterator();
            while (it.hasNext()) {
                C10866e c10866e = (C10866e) it.next();
                if (c10866e != null) {
                    int m56406u = c10866e.m56406u();
                    String m56393i = c10866e.m56393i();
                    if (m56393i != null && m56406u == 1) {
                        m127132B0 = AbstractC24342w.m127132B0(m56393i, new String[]{"/"}, false, 0, 6, null);
                        return (String) m127132B0.get(1);
                    }
                }
            }
            return "";
        }
        return "";
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: id */
    public void mo12034id(long j11) {
        InterfaceC2284d interfaceC2284d = (InterfaceC2284d) m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_feed_notification_notification_deleted);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC2284d.mo12057zF(new C25479l(m118743r0, -1, "", -1));
        m12103xq(j11);
    }

    /* renamed from: kq */
    public void m12105kq(C32078q7 c32078q7) {
        AbstractC19074t.m100208f(c32078q7, "notificationItem");
        ((InterfaceC2284d) m103742Dp()).mo12047V9(c32078q7);
        String m154738A = c32078q7.m154738A();
        if (m154738A != null && m154738A.length() > 0) {
            C28023b6.m141250h0().m141290I(Integer.parseInt(m154738A));
        }
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: vm */
    public void mo12035vm(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        InterfaceC2284d interfaceC2284d = (InterfaceC2284d) m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_turn_off_feed_notification_success);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_turn_on);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        interfaceC2284d.mo12057zF(new C25479l(m118743r0, 0, m118743r02, 1000));
    }

    /* renamed from: wq */
    public final void m12106wq(C32078q7 c32078q7) {
        AbstractC19074t.m100208f(c32078q7, "notificationItem");
        C21927m.m114302u().m114330e0(c32078q7.m154744G(), new TrackingSource(15));
        C31987k4 c31987k4 = new C31987k4(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        c31987k4.m154202a("appID", c32078q7.m154763t());
        c31987k4.m154202a("actID", Integer.valueOf(c32078q7.m154749L()));
        c31987k4.m154202a("feedSrcNotification", Integer.valueOf(c32078q7.f147762b0));
        ((InterfaceC2284d) m103742Dp()).mo12038A0(new C26365a.b(c32078q7.m154744G(), C32002l4.Companion.m154289c(c31987k4)).m135743b());
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: xm */
    public void mo12036xm(int i11) {
        if (i11 != 1000) {
            if (i11 == 1001) {
                ((InterfaceC2284d) m103742Dp()).mo12054ry();
                return;
            }
            return;
        }
        ((InterfaceC2284d) m103742Dp()).mo12046T6();
    }

    @Override // aq.InterfaceC2283c
    /* renamed from: yf */
    public void mo12037yf(String str) {
        AbstractC19074t.m100208f(str, "userId");
        ((InterfaceC2284d) m103742Dp()).mo12057zF(new C25479l(C30190a.f140233a.m148858c(str), -1, "", -1));
    }
}
