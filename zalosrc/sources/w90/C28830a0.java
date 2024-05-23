package w90;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import c30.C3245i;
import c30.C3247j;
import c30.C3255n;
import cl.C3570a;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.picker.stickerpanel.C12921a;
import com.zing.zalo.p077ui.picker.stickerpanel.C12922b;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12952b;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12957g;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12958h;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12959i;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12960j;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12961k;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12962l;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12963m;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12967q;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12970t;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import me0.AbstractC23080g8;
import nh0.InterfaceC23792b;
import p038bl.C2834f;
import p134el.C18474m;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p268ji.C21270p;
import p268ji.C21272r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p588vw.C28644j;
import p588vw.C28652r;
import p647xj.C29681g;
import p684yk.InterfaceC31005a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vg.C28020b3;
import vm0.AbstractC28298d;
import w90.C28830a0;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import y90.EnumC30858b;
import y90.EnumC30859c;
import y90.EnumC30861e;

/* renamed from: w90.a0 */
/* loaded from: classes6.dex */
public final class C28830a0 extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: j0 */
    private static boolean f133536j0;

    /* renamed from: A */
    private boolean f133537A;

    /* renamed from: B */
    private boolean f133538B;

    /* renamed from: C */
    private float f133539C;

    /* renamed from: D */
    private float f133540D;

    /* renamed from: E */
    private boolean f133541E;

    /* renamed from: F */
    private boolean f133542F;

    /* renamed from: G */
    private int f133543G;

    /* renamed from: H */
    private int f133544H;

    /* renamed from: I */
    private int f133545I;

    /* renamed from: J */
    private int f133546J;

    /* renamed from: K */
    private int f133547K;

    /* renamed from: L */
    private int f133548L;

    /* renamed from: M */
    private int f133549M;

    /* renamed from: N */
    private int f133550N;

    /* renamed from: O */
    private int f133551O;

    /* renamed from: P */
    private int f133552P;

    /* renamed from: Q */
    private final InterfaceC24854k f133553Q;

    /* renamed from: R */
    private final ArrayList f133554R;

    /* renamed from: S */
    private Job f133555S;

    /* renamed from: T */
    private EnumC30858b f133556T;

    /* renamed from: U */
    private C1761c0 f133557U;

    /* renamed from: V */
    private C1761c0 f133558V;

    /* renamed from: W */
    private C1761c0 f133559W;

    /* renamed from: X */
    private C1761c0 f133560X;

    /* renamed from: Y */
    private final C1761c0 f133561Y;

    /* renamed from: Z */
    private final C1761c0 f133562Z;

    /* renamed from: a0 */
    private final C1761c0 f133563a0;

    /* renamed from: b0 */
    private final C1761c0 f133564b0;

    /* renamed from: c0 */
    private final C1761c0 f133565c0;

    /* renamed from: d0 */
    private final C1761c0 f133566d0;

    /* renamed from: e0 */
    private final C1761c0 f133567e0;

    /* renamed from: f0 */
    private final C1761c0 f133568f0;

    /* renamed from: g0 */
    private final C1761c0 f133569g0;

    /* renamed from: h0 */
    private final C1761c0 f133570h0;

    /* renamed from: i0 */
    private final C1761c0 f133571i0;

    /* renamed from: t */
    private final C3570a f133572t;

    /* renamed from: u */
    private final InterfaceC31005a f133573u;

    /* renamed from: v */
    private final InterfaceC23792b f133574v;

    /* renamed from: w */
    private final C1780l0 f133575w;

    /* renamed from: x */
    private final CoroutineDispatcher f133576x;

    /* renamed from: y */
    private boolean f133577y;

    /* renamed from: z */
    private boolean f133578z;

    /* renamed from: w90.a0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: w90.a0$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f133579a;

        static {
            int[] iArr = new int[EnumC30861e.values().length];
            try {
                iArr[EnumC30861e.f142418q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30861e.f142419r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC30861e.f142417p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133579a = iArr;
        }
    }

    /* renamed from: w90.a0$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C28830a0.this.m144266w0();
        }
    }

    /* renamed from: w90.a0$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C28830a0.this.m144269x0();
        }
    }

    /* renamed from: w90.a0$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C28830a0.this.m144182y0();
        }
    }

    /* renamed from: w90.a0$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f133583a;

        /* renamed from: b */
        final /* synthetic */ C28830a0 f133584b;

        /* renamed from: c */
        final /* synthetic */ int f133585c;

        /* renamed from: d */
        final /* synthetic */ C12922b f133586d;

        f(int i11, C28830a0 c28830a0, int i12, C12922b c12922b) {
            this.f133583a = i11;
            this.f133584b = c28830a0;
            this.f133585c = i12;
            this.f133586d = c12922b;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            List m131496e;
            try {
                ArrayList arrayList = AbstractC23304d.f113261C;
                AbstractC19074t.m100207e(arrayList, "stickerList");
                int i11 = this.f133583a;
                C28830a0 c28830a0 = this.f133584b;
                int i12 = this.f133585c;
                C12922b c12922b = this.f133586d;
                synchronized (arrayList) {
                    try {
                        int size = arrayList.size();
                        int size2 = arrayList.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            ArrayList arrayList2 = AbstractC23304d.f113261C;
                            if (((C3245i) arrayList2.get(i13)).m16463e() != -2) {
                                int i14 = size < i13 ? i13 - 1 : i13;
                                if (((C3245i) arrayList2.get(i13)).m16463e() == 0) {
                                    AbstractC23309i.m121618Xu(i14);
                                } else {
                                    if (((C3245i) arrayList2.get(i13)).m16463e() == i11) {
                                        size = i13;
                                    }
                                    C7960e.m41971c6().m42344ae(((C3245i) arrayList2.get(i13)).f13854b, i14);
                                }
                                C28644j.m143238c1(((C3245i) arrayList2.get(i13)).m16463e(), i14);
                            }
                        }
                        if (i11 == 0) {
                            AbstractC23309i.m122629yu(true);
                            C28020b3.f130648a.m141196k(i11, false);
                            SparseArray sparseArray = AbstractC23304d.f113265D;
                            C3245i c3245i = (C3245i) sparseArray.get(i11);
                            if (c3245i != null) {
                                AbstractC19074t.m100205c(c3245i);
                                AbstractC23304d.f113261C.remove(c3245i);
                                sparseArray.remove(c3245i.m16463e());
                            }
                        } else {
                            C7960e m41971c6 = C7960e.m41971c6();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i11);
                            Iterator it = m41971c6.m42273T6(sb2.toString()).iterator();
                            while (it.hasNext()) {
                                C3247j c3247j = (C3247j) it.next();
                                C28020b3.f130648a.m141197l(c3247j.f13890c);
                                AbstractC24006q.m125840K1(c3247j.m16499a());
                            }
                            C28020b3 c28020b3 = C28020b3.f130648a;
                            C28020b3.m141176p(c28020b3, i11, null, 2, null);
                            c28020b3.m141196k(i11, false);
                            SparseArray sparseArray2 = AbstractC23304d.f113265D;
                            C3245i c3245i2 = (C3245i) sparseArray2.get(i11);
                            if (c3245i2 != null) {
                                AbstractC19074t.m100205c(c3245i2);
                                AbstractC23304d.f113261C.remove(c3245i2);
                                sparseArray2.remove(c3245i2.m16463e());
                            }
                        }
                        C28644j.m143233Y().m143292X0();
                        m131496e = AbstractC25366r.m131496e(Integer.valueOf(i11));
                        HashSet hashSet = new HashSet(m131496e);
                        if (c28830a0.m144264v1() == EnumC30861e.f142417p) {
                            if (!C28644j.m143233Y().m143307p0()) {
                                hashSet.add(-2);
                            }
                        } else if (c28830a0.m144264v1() == EnumC30861e.f142418q && !C28644j.m143233Y().m143308q0()) {
                            hashSet.add(-3);
                        }
                        c28830a0.m144157S1(i12, hashSet, c12922b);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: w90.a0$g */
    /* loaded from: classes6.dex */
    public static final class g implements C19516c.c {

        /* renamed from: b */
        final /* synthetic */ C18474m f133588b;

        g(C18474m c18474m) {
            this.f133588b = c18474m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m144278e(int i11, C28830a0 c28830a0, C18474m c18474m) {
            AbstractC19074t.m100208f(c28830a0, "this$0");
            AbstractC19074t.m100208f(c18474m, "$bundle");
            C28020b3.f130648a.m141190S(i11, false);
            c28830a0.f133562Z.mo9224q(c18474m);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m144279f(int i11, ArrayList arrayList, C28830a0 c28830a0, C18474m c18474m) {
            AbstractC19074t.m100208f(arrayList, "$photoQueue");
            AbstractC19074t.m100208f(c28830a0, "this$0");
            AbstractC19074t.m100208f(c18474m, "$bundle");
            C28020b3 c28020b3 = C28020b3.f130648a;
            c28020b3.m141185J(i11);
            c28020b3.m141184I(arrayList);
            c28830a0.f133561Y.mo9224q(c18474m);
            C28644j.m143233Y().m143292X0();
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(final int i11, C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final C28830a0 c28830a0 = C28830a0.this;
            final C18474m c18474m = this.f133588b;
            AbstractC19444a.m101695c(new Runnable() { // from class: w90.b0
                @Override // java.lang.Runnable
                public final void run() {
                    C28830a0.g.m144278e(i11, c28830a0, c18474m);
                }
            });
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(final int i11, final ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "photoQueue");
            final C28830a0 c28830a0 = C28830a0.this;
            final C18474m c18474m = this.f133588b;
            AbstractC19444a.m101695c(new Runnable() { // from class: w90.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C28830a0.g.m144279f(i11, arrayList, c28830a0, c18474m);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w90.a0$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f133589t;

        /* renamed from: u */
        private /* synthetic */ Object f133590u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f133592w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w90.a0$h$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f133593t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f133594u;

            /* renamed from: v */
            final /* synthetic */ C28830a0 f133595v;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: w90.a0$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C33020a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f133596t;

                /* renamed from: u */
                final /* synthetic */ List f133597u;

                /* renamed from: v */
                final /* synthetic */ C28830a0 f133598v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C33020a(List list, C28830a0 c28830a0, Continuation continuation) {
                    super(2, continuation);
                    this.f133597u = list;
                    this.f133598v = c28830a0;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C33020a(this.f133597u, this.f133598v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f133596t == 0) {
                        AbstractC24862s.m129228b(obj);
                        if (!this.f133597u.isEmpty()) {
                            this.f133598v.f133554R.clear();
                            this.f133598v.f133554R.addAll(this.f133597u);
                            this.f133598v.f133569g0.mo9224q(new C19964c(this.f133598v.f133554R));
                            this.f133598v.f133568f0.mo9224q(new C19964c(AbstractC29094b.m145339a(false)));
                        } else if (this.f133598v.f133554R.isEmpty()) {
                            this.f133598v.f133568f0.mo9224q(new C19964c(AbstractC29094b.m145339a(true)));
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C33020a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18494a interfaceC18494a, C28830a0 c28830a0, Continuation continuation) {
                super(2, continuation);
                this.f133594u = interfaceC18494a;
                this.f133595v = c28830a0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f133594u, this.f133595v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f133593t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List list = (List) this.f133594u.mo12V4();
                    CoroutineDispatcher coroutineDispatcher = this.f133595v.f133576x;
                    C33020a c33020a = new C33020a(list, this.f133595v, null);
                    this.f133593t = 1;
                    if (BuildersKt.m112534g(coroutineDispatcher, c33020a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f133592w = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            h hVar = new h(this.f133592w, continuation);
            hVar.f133590u = obj;
            return hVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Job m112540d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f133589t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f133590u;
                C28830a0 c28830a0 = C28830a0.this;
                m112540d = BuildersKt__Builders_commonKt.m112540d(coroutineScope, c28830a0.m144179s1(), null, new a(this.f133592w, C28830a0.this, null), 2, null);
                c28830a0.f133555S = m112540d;
                this.f133589t = 1;
                if (DelayKt.m112666b(100L, this) == m142578e) {
                    return m142578e;
                }
            }
            if (C28830a0.this.f133554R.isEmpty() && C28830a0.this.m144143C1()) {
                C28830a0.this.f133568f0.mo9224q(new C19964c(AbstractC29094b.m145339a(true)));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: w90.a0$i */
    /* loaded from: classes6.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f133599q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorCoroutineDispatcher mo12V4() {
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new ThreadFactoryC18928a("StickerPanelViewModelLoadingPool"));
            AbstractC19074t.m100207e(newFixedThreadPool, "newFixedThreadPool(...)");
            return ExecutorsKt.m112728b(newFixedThreadPool);
        }
    }

    public /* synthetic */ C28830a0(C3570a c3570a, InterfaceC31005a interfaceC31005a, InterfaceC23792b interfaceC23792b, C1780l0 c1780l0, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(c3570a, interfaceC31005a, interfaceC23792b, c1780l0, (i11 & 16) != 0 ? Dispatchers.m112681c() : coroutineDispatcher);
    }

    /* renamed from: A1 */
    private final boolean m144139A1() {
        return C28644j.m143207C();
    }

    /* renamed from: B0 */
    private final boolean m144140B0() {
        if ((m144214X0() & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B1 */
    private final boolean m144141B1() {
        return C28644j.m143209D();
    }

    /* renamed from: C0 */
    private final void m144142C0(int i11, HashSet hashSet, C12922b c12922b) {
        if (i11 != -1) {
            int i12 = this.f133551O;
            if (i11 > i12) {
                if (i12 < 0) {
                    i11 = 0;
                } else {
                    i11 = i12;
                }
            }
            int m144254r0 = m144254r0(i11, c12922b);
            InterfaceC12965o m72776T = c12922b.m72776T(m144254r0);
            if (m72776T instanceof C12967q) {
                int i13 = i11 - m144254r0;
                C12967q c12967q = (C12967q) m72776T;
                int size = c12967q.m72867g().size();
                int i14 = i13;
                int i15 = -1;
                int i16 = -1;
                do {
                    C3245i m72865e = c12967q.m72865e(i13);
                    if (i13 > 0 && i15 == -1 && m72865e != null && hashSet.contains(Integer.valueOf(m72865e.f13854b))) {
                        i13--;
                    } else {
                        i15 = i13;
                    }
                    C3245i m72865e2 = c12967q.m72865e(i14);
                    if (m72865e2 != null && !hashSet.contains(Integer.valueOf(m72865e2.f13854b))) {
                        i16 = i14;
                    } else {
                        i14++;
                    }
                    if (i14 >= size && i16 == -1 && i15 != -1) {
                        i16 = i15;
                    }
                } while (i16 == -1);
                C3245i m72865e3 = c12967q.m72865e(i16);
                if (m72865e3 != null) {
                    this.f133572t.m18133b(m72865e3.f13854b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public final boolean m144143C1() {
        Job job = this.f133555S;
        if (job != null) {
            return job.mo112496c();
        }
        return false;
    }

    /* renamed from: D0 */
    private final int m144144D0(List list, int i11) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC12965o interfaceC12965o = (InterfaceC12965o) list.get(i12);
            if ((interfaceC12965o instanceof AbstractC12964n) && ((AbstractC12964n) interfaceC12965o).m72862c().f13854b == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: D1 */
    private final void m144145D1(InterfaceC18494a interfaceC18494a) {
        if (!m144143C1()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(interfaceC18494a, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m144146H1(C28830a0 c28830a0, int i11, HashSet hashSet, C12922b c12922b) {
        AbstractC19074t.m100208f(c28830a0, "this$0");
        AbstractC19074t.m100208f(hashSet, "$deleteCatesSet");
        AbstractC19074t.m100208f(c12922b, "$pagerAdapter");
        if (f133536j0) {
            return;
        }
        f133536j0 = true;
        c28830a0.m144157S1(i11, hashSet, c12922b);
        f133536j0 = false;
    }

    /* renamed from: J0 */
    private final int m144147J0() {
        return this.f133572t.m18135d();
    }

    /* renamed from: M0 */
    private final List m144148M0(boolean z11) {
        boolean m143309r0;
        int m131511r;
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            if ((m144272z1() && C28644j.m143233Y().m143307p0()) || C28644j.m143233Y().m143296a0(-2, m144272z1()) > 0) {
                m143309r0 = true;
            } else {
                m143309r0 = false;
            }
        } else {
            m143309r0 = C28644j.m143233Y().m143309r0();
        }
        List m118400e = AbstractC23080g8.m118400e(m143309r0, m144272z1());
        AbstractC19074t.m100207e(m118400e, "getListStickerCateDownloadedValidInfoOnMem(...)");
        List<C3245i> list = m118400e;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        for (C3245i c3245i : list) {
            AbstractC19074t.m100205c(c3245i);
            arrayList2.add(new C12952b(c3245i));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: N0 */
    private final boolean m144149N0() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_FORCE_JUMP_SEASONAL_TAB");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: P1 */
    private final void m144152P1() {
        boolean z11;
        C12921a c12921a = (C12921a) m103747M();
        if (c12921a != null) {
            m144252o2(c12921a.m72765o());
            m144253p2(c12921a.m72766p());
            m144225c2(c12921a.m72757g());
            m144222b2(c12921a.m72756f());
            m144178q2(c12921a.m72752b());
            m144233g2(c12921a.m72759i());
            m144237i2(c12921a.m72761k());
            m144245l2(c12921a.m72762l());
            m144247m2(c12921a.m72763m());
            m144213W1(c12921a.m72751a());
            m144218Z1(c12921a.m72755e());
            m144235h2(c12921a.m72760j());
            m144231f2(c12921a.m72758h());
            m144216Y1(c12921a.m72754d());
            m144249n2(c12921a.m72764n());
            m144240j2(m144170g0(m144264v1(), m144214X0()));
            if (m144264v1() != EnumC30861e.f142418q) {
                z11 = true;
            } else {
                z11 = false;
            }
            m144242k2(z11);
            m144164X1(c12921a.m72753c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:            if (r3 == (-1)) goto L24;     */
    /* renamed from: Q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m144154Q1(int i11, int i12, int i13, int i14, int i15, List list) {
        if (i12 == -1) {
            if (i11 != -1) {
                i12 = i11;
            } else {
                i12 = this.f133550N;
            }
        }
        if (i15 == -1) {
            int m18142k = this.f133572t.m18142k();
            if (m18142k != 1) {
                if (m18142k != 4) {
                    if (m18142k != 5) {
                        i11 = m144144D0(list, this.f133572t.m18140i());
                    } else {
                        if (AbstractC23309i.m121791cg()) {
                            i11 = i14;
                        }
                        i11 = i12;
                    }
                    i15 = i11;
                } else {
                    if (m144140B0()) {
                        i11 = i13;
                        i15 = i11;
                    }
                    i11 = i12;
                    i15 = i11;
                }
            }
        }
        if (i15 != -1) {
            return i15;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m144157S1(final int i11, final HashSet hashSet, final C12922b c12922b) {
        if (!AbstractC19444a.m101693a()) {
            m144142C0(i11, hashSet, c12922b);
            C2834f.f11325a.m13686e();
        } else {
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: w90.z
                @Override // java.lang.Runnable
                public final void run() {
                    C28830a0.m144159T1(C28830a0.this, i11, hashSet, c12922b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m144159T1(C28830a0 c28830a0, int i11, HashSet hashSet, C12922b c12922b) {
        AbstractC19074t.m100208f(c28830a0, "this$0");
        AbstractC19074t.m100208f(hashSet, "$deleteCates");
        AbstractC19074t.m100208f(c12922b, "$pagerAdapter");
        c28830a0.m144142C0(i11, hashSet, c12922b);
        C2834f.f11325a.m13686e();
    }

    /* renamed from: X1 */
    private final void m144164X1(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_FORCE_JUMP_SEASONAL_TAB", Boolean.valueOf(z11));
    }

    /* renamed from: d1 */
    private final List m144168d1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = AbstractC23304d.f113273F;
        AbstractC19074t.m100207e(arrayList2, "stickerPromotionList");
        synchronized (arrayList2) {
            try {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C3245i c3245i = (C3245i) AbstractC23304d.f113273F.get(i11);
                    if (!C28644j.m143233Y().m143312x0(c3245i.f13854b)) {
                        String str = c3245i.f13858f;
                        AbstractC19074t.m100207e(str, "iconUrl");
                        if (str.length() != 0) {
                            String m16464f = c3245i.m16464f();
                            AbstractC19074t.m100207e(m16464f, "getName(...)");
                            if (m16464f.length() != 0) {
                                if (c3245i.f13863k == 0) {
                                    AbstractC19074t.m100205c(c3245i);
                                    arrayList.add(new C12959i(c3245i));
                                } else {
                                    AbstractC19074t.m100205c(c3245i);
                                    arrayList.add(new C12960j(c3245i));
                                }
                            }
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C28644j.m143233Y().m143294Z();
        return arrayList;
    }

    /* renamed from: f0 */
    private final void m144169f0(List list) {
        this.f133544H = -1;
        this.f133545I = -1;
        this.f133546J = -1;
        this.f133547K = -1;
        this.f133548L = -1;
        this.f133549M = -1;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC12965o interfaceC12965o = (InterfaceC12965o) list.get(i11);
            if (interfaceC12965o instanceof C12961k) {
                this.f133544H = i11;
            } else if (interfaceC12965o instanceof C12958h) {
                this.f133545I = i11;
            } else if (interfaceC12965o instanceof C12962l) {
                this.f133546J = i11;
            } else if (interfaceC12965o instanceof C12970t) {
                this.f133547K = i11;
            } else if (interfaceC12965o instanceof C12952b) {
                int i12 = ((C12952b) interfaceC12965o).m72862c().f13854b;
                if (i12 != -10) {
                    if (i12 != -2) {
                        if (i12 == 0) {
                            this.f133549M = i11;
                        }
                    } else {
                        this.f133548L = i11;
                    }
                } else {
                    this.f133552P = i11;
                }
            }
        }
    }

    /* renamed from: g0 */
    private final int m144170g0(EnumC30861e enumC30861e, int i11) {
        int i12 = b.f133579a[enumC30861e.ordinal()];
        int i13 = 1;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    if ((i11 & 1) <= 0) {
                        i13 = 0;
                    }
                    if ((i11 & 2) > 0) {
                        i13++;
                    }
                    if ((i11 & 4) > 0) {
                        i13++;
                    }
                    if ((i11 & 8) > 0 || (i11 & 16) > 0) {
                        return i13 + 1;
                    }
                    return i13;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C28652r.m143349v().m143385z(false);
        }
        return -1;
    }

    /* renamed from: h0 */
    private final void m144171h0(List list) {
        Map m131415t;
        Map m131404i;
        Map map = C28644j.f132751v;
        AbstractC19074t.m100207e(map, "trendingKeywordList");
        synchronized (map) {
            try {
                Map map2 = C28644j.f132750u;
                AbstractC19074t.m100207e(map2, "trendingStickerMap");
                m131415t = AbstractC25363p0.m131415t(map2);
                if (!(!m131415t.isEmpty())) {
                    m131404i = AbstractC25363p0.m131404i();
                } else {
                    AbstractC19074t.m100207e(map, "trendingKeywordList");
                    m131404i = AbstractC25363p0.m131415t(map);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m131404i.isEmpty()) {
            C28644j.m143233Y().m143311u0();
        }
        list.add(new C12970t(m131404i, m131415t));
    }

    /* renamed from: i0 */
    private final int m144172i0(int i11, int i12, int i13, List list) {
        if (this.f133572t.m18136e() != EnumC30858b.f142392p) {
            this.f133556T = this.f133572t.m18136e();
            this.f133572t.m18132a();
        } else {
            i12 = -1;
        }
        if (m144140B0() && ((m144149N0() && AbstractC23309i.m122638z2()) || AbstractC23309i.m120932Fa())) {
            AbstractC23309i.m122630yv(false);
        } else {
            i13 = i12;
        }
        int m18137f = this.f133572t.m18137f();
        if (m18137f != -1) {
            this.f133572t.m18133b(-1);
            i13 = m144144D0(list, m18137f);
        }
        EnumC30859c m18138g = this.f133572t.m18138g();
        EnumC30859c enumC30859c = EnumC30859c.f142396p;
        if (m18138g != enumC30859c) {
            this.f133572t.m18134c(enumC30859c);
            return i11;
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:            if (r13 != (-1)) goto L31;     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m144173k0(int i11, int i12, int i13, int i14, int i15) {
        boolean z11;
        C29681g mo150750n = this.f133573u.mo150750n();
        if (mo150750n != null) {
            z11 = mo150750n.m147617d(m144177q0(this.f133572t.m18142k(), this.f133572t.m18140i(), i14, i15, i13, i12));
        } else {
            z11 = false;
        }
        if (mo150750n != null && mo150750n.m147618e() && m144258t1() == 250 && !z11 && this.f133572t.m18141j() > 0 && this.f133574v.mo124314i() - this.f133572t.m18141j() > mo150750n.m147614a()) {
            int m147615b = mo150750n.m147615b();
            if (m147615b != -4) {
                if (m147615b != -2) {
                    if (m147615b != -1) {
                        if (m147615b == 0) {
                            return i11;
                        }
                    } else if (i13 != -1) {
                        LinkedHashMap m143288V = C28644j.m143233Y().m143288V(-2);
                        if (m143288V != null && m143288V.size() >= mo150750n.m147616c()) {
                            return i13;
                        }
                    }
                }
                return i14;
            }
            return i12;
        }
        return -1;
    }

    /* renamed from: m0 */
    private final void m144174m0() {
        if (this.f133538B) {
            this.f133538B = false;
            this.f133557U.mo9224q(C24848g0.f119245a);
        }
    }

    /* renamed from: n0 */
    private final void m144175n0() {
        if (this.f133578z) {
            this.f133578z = false;
            this.f133566d0.mo9224q(C24848g0.f119245a);
        }
        if (this.f133537A) {
            this.f133537A = false;
            this.f133567e0.mo9224q(C24848g0.f119245a);
        }
    }

    /* renamed from: p0 */
    private final void m144176p0() {
        this.f133571i0.mo9224q(C24848g0.f119245a);
    }

    /* renamed from: q0 */
    private final int m144177q0(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 == 5 && i16 != -1) {
                        return -4;
                    }
                } else if (i14 != -1) {
                    return -5;
                }
            } else if (i12 == -2 && i15 != -1) {
                return -1;
            }
        } else if (i13 != -1) {
            return -2;
        }
        return 1;
    }

    /* renamed from: q2 */
    private final void m144178q2(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_AUTO_PLAY_LOOP_ANIM", Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public final ExecutorCoroutineDispatcher m144179s1() {
        return (ExecutorCoroutineDispatcher) this.f133553Q.getValue();
    }

    /* renamed from: s2 */
    private final void m144180s2(InterfaceC12965o interfaceC12965o, int i11, int i12) {
        EnumC30858b enumC30858b = this.f133556T;
        this.f133556T = EnumC30858b.f142392p;
        if (interfaceC12965o instanceof C12962l) {
            this.f133572t.m18148q(i12, m144258t1());
            return;
        }
        if (interfaceC12965o instanceof C12958h) {
            this.f133572t.m18147p(i12, enumC30858b, m144258t1());
            return;
        }
        if (interfaceC12965o instanceof C12957g) {
            this.f133572t.m18146o(((C12957g) interfaceC12965o).m72860c());
            return;
        }
        if (interfaceC12965o instanceof C12970t) {
            this.f133572t.m18150s(i12, m144258t1());
            C21272r.a aVar = C21272r.Companion;
            if (((C21272r) aVar.m122672a()).m110178g()) {
                ((C21272r) aVar.m122672a()).m110182k();
                return;
            }
            return;
        }
        if (interfaceC12965o instanceof C12967q) {
            AbstractC23647d.m123897g("9192");
            C3245i m72865e = ((C12967q) interfaceC12965o).m72865e(m144256s0(i12, i11));
            if (m72865e != null) {
                this.f133572t.m18149r(m72865e, i12, m144258t1());
                return;
            }
            return;
        }
        if (interfaceC12965o instanceof AbstractC12964n) {
            AbstractC23647d.m123897g("9192");
            this.f133572t.m18149r(((AbstractC12964n) interfaceC12965o).m72862c(), i12, m144258t1());
        }
    }

    /* renamed from: x2 */
    private final void m144181x2(InterfaceC12965o interfaceC12965o) {
        int i11;
        int i12 = 0;
        if (interfaceC12965o instanceof C12952b) {
            int i13 = ((C12952b) interfaceC12965o).m72862c().f13854b;
            if (i13 == -2) {
                i11 = 5;
            } else {
                i12 = i13;
                i11 = 7;
            }
        } else if (!(interfaceC12965o instanceof C12959i) && !(interfaceC12965o instanceof C12960j)) {
            if (interfaceC12965o instanceof C12958h) {
                i11 = 1;
            } else if (interfaceC12965o instanceof C12962l) {
                i11 = 2;
            } else if (interfaceC12965o instanceof C12970t) {
                i11 = 4;
            } else {
                i11 = -1;
            }
        } else {
            i12 = ((AbstractC12964n) interfaceC12965o).m72862c().f13854b;
            i11 = 6;
        }
        if (i11 != -1) {
            C21270p.Companion.m110161b().m110152Z(((C21272r) C21272r.Companion.m122672a()).m110174c(), i11, i11 + "_1", i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final List m144182y0() {
        ArrayList arrayList = new ArrayList();
        int m143385z = C28652r.m143349v().m143385z(false);
        for (int i11 = 0; i11 < m143385z; i11++) {
            arrayList.add(new C12957g(i11));
        }
        return arrayList;
    }

    /* renamed from: y1 */
    private final boolean m144183y1() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_AUTO_PLAY_LOOP_ANIM");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: A0 */
    public final boolean m144184A0() {
        if (m144183y1() && C3255n.m16557h()) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    public final String m144185E0() {
        String str = (String) this.f133575w.m9318c("SS_AUTO_PLAY_PREFIX");
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: E1 */
    public final int m144186E1(C24860q c24860q) {
        AbstractC19074t.m100208f(c24860q, "velocities");
        if (Math.abs(((Number) c24860q.m129216d()).intValue()) > 500) {
            if (((Number) c24860q.m129216d()).intValue() > 0) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: F0 */
    public final int m144187F0() {
        return this.f133552P;
    }

    /* renamed from: F1 */
    public final void m144188F1(InterfaceC12965o interfaceC12965o, int i11, int i12, boolean z11, boolean z12) {
        Integer num;
        if (interfaceC12965o != null && z11 && z12) {
            if (interfaceC12965o instanceof C12967q) {
                C3245i m72865e = ((C12967q) interfaceC12965o).m72865e(m144256s0(i12, i11));
                if (m72865e != null) {
                    num = Integer.valueOf(m72865e.m16463e());
                } else {
                    num = null;
                }
                if (num != null) {
                    num.intValue();
                    this.f133560X.mo9224q(num);
                }
            }
            m144181x2(interfaceC12965o);
        }
    }

    /* renamed from: G0 */
    public final int m144189G0() {
        return this.f133545I;
    }

    /* renamed from: G1 */
    public final void m144190G1(Object[] objArr, final C12922b c12922b) {
        AbstractC19074t.m100208f(objArr, "args");
        AbstractC19074t.m100208f(c12922b, "pagerAdapter");
        try {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.util.HashSet<kotlin.Int>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.Int> }");
            final HashSet hashSet = (HashSet) obj;
            final int m144147J0 = m144147J0();
            if (m144264v1() == EnumC30861e.f142417p) {
                if (!C28644j.m143233Y().m143307p0()) {
                    hashSet.add(-2);
                }
            } else if (m144264v1() == EnumC30861e.f142418q && !C28644j.m143233Y().m143308q0()) {
                hashSet.add(-3);
            }
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: w90.y
                @Override // java.lang.Runnable
                public final void run() {
                    C28830a0.m144146H1(C28830a0.this, m144147J0, hashSet, c12922b);
                }
            });
        } catch (Exception unused) {
            AbstractC20110a.f98889a.mo104551d("PARSE WRONG DATA TYPE FROM onReceiveNotiStickerCatesDeleted", new Object[0]);
        }
    }

    /* renamed from: I0 */
    public final int m144191I0() {
        return this.f133544H;
    }

    /* renamed from: I1 */
    public final void m144192I1() {
        this.f133537A = true;
    }

    /* renamed from: J1 */
    public final void m144193J1() {
        this.f133538B = true;
    }

    /* renamed from: K0 */
    public final LiveData m144194K0() {
        return this.f133562Z;
    }

    /* renamed from: K1 */
    public final void m144195K1() {
        this.f133578z = true;
    }

    /* renamed from: L0 */
    public final LiveData m144196L0() {
        return this.f133561Y;
    }

    /* renamed from: L1 */
    public final void m144197L1(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        try {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue != m144261u1()) {
                m144249n2(intValue);
                this.f133570h0.mo9224q(new C19964c(C24848g0.f119245a));
            }
        } catch (Exception unused) {
            AbstractC20110a.f98889a.mo104551d("PARSE WRONG DATA TYPE FROM onReceiveNotiUpdatePanelHeight", new Object[0]);
        }
    }

    /* renamed from: M1 */
    public void m144198M1(C12921a c12921a) {
        super.m103748N(c12921a);
        m144152P1();
    }

    /* renamed from: N1 */
    public final int m144199N1(InterfaceC12965o interfaceC12965o, int i11) {
        AbstractC19074t.m100208f(interfaceC12965o, "selectedCate");
        int i12 = i11 + this.f133550N;
        int i13 = this.f133543G;
        if (i13 == -1) {
            if (interfaceC12965o instanceof C12967q) {
                int m72866f = ((C12967q) interfaceC12965o).m72866f(m144212W0());
                if (m72866f == -1) {
                    m72866f = 0;
                }
                return i12 + m72866f;
            }
            return i12;
        }
        this.f133543G = -1;
        return i13;
    }

    /* renamed from: O0 */
    public final boolean m144200O0() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_GO_TO_STORE_BTN");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: O1 */
    public final void m144201O1() {
        C21272r.a aVar = C21272r.Companion;
        if (((C21272r) aVar.m122672a()).m110178g()) {
            ((C21272r) aVar.m122672a()).m110175d().m122673a().put(1);
        }
        AbstractC23647d.m123897g("9193");
    }

    /* renamed from: P0 */
    public final boolean m144202P0() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_INDICATOR");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Q0 */
    public final boolean m144203Q0() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_SEARCH_GIF_ICON");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: R0 */
    public final boolean m144204R0() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_ENABLE_SETTING_ICON");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: R1 */
    public final int m144205R1(List list) {
        AbstractC19074t.m100208f(list, "indicatorList");
        if (m144264v1() == EnumC30861e.f142419r) {
            int m18139h = this.f133572t.m18139h();
            if (m18139h < 0 || m18139h >= list.size()) {
                return 0;
            }
            return m18139h;
        }
        m144169f0(list);
        int m144172i0 = m144172i0(this.f133547K, this.f133545I, this.f133546J, list);
        if (this.f133577y) {
            this.f133577y = false;
            if (m144172i0 == -1) {
                m144172i0 = m144173k0(this.f133549M, this.f133547K, this.f133548L, this.f133545I, this.f133546J);
            }
        }
        return m144154Q1(this.f133545I, this.f133548L, this.f133546J, this.f133547K, m144172i0, list);
    }

    /* renamed from: S0 */
    public final LiveData m144206S0() {
        return this.f133563a0;
    }

    /* renamed from: T0 */
    public final int m144207T0() {
        Integer num = (Integer) this.f133575w.m9318c("SS_INDICATOR_BACKGROUND_RES");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: U0 */
    public final StickerIndicatorView.C13538e m144208U0() {
        return (StickerIndicatorView.C13538e) this.f133575w.m9318c("SS_INDICATOR_CUSTOM_STYLE");
    }

    /* renamed from: U1 */
    public final void m144209U1() {
        this.f133572t.m18144m();
    }

    /* renamed from: V0 */
    public final List m144210V0(List list) {
        AbstractC19074t.m100208f(list, "pagerList");
        ArrayList arrayList = new ArrayList();
        if (m144203Q0()) {
            arrayList.add(new C12961k());
        }
        this.f133550N = -1;
        this.f133551O = -1;
        if (!list.isEmpty()) {
            this.f133550N = arrayList.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC12965o interfaceC12965o = (InterfaceC12965o) it.next();
                if ((interfaceC12965o instanceof C12958h) || (interfaceC12965o instanceof C12962l) || (interfaceC12965o instanceof C12970t) || (interfaceC12965o instanceof C12957g) || (interfaceC12965o instanceof C12952b)) {
                    arrayList.add(interfaceC12965o);
                } else if (interfaceC12965o instanceof C12967q) {
                    arrayList.addAll(((C12967q) interfaceC12965o).m72867g());
                }
            }
            this.f133551O = arrayList.size() - 1;
        }
        if (m144204R0()) {
            arrayList.add(new C12963m());
        }
        return arrayList;
    }

    /* renamed from: V1 */
    public final void m144211V1(boolean z11, boolean z12, float f11) {
        if (z11) {
            if (this.f133540D == 0.0f) {
                this.f133540D = f11;
            }
            if (this.f133539C == 0.0f) {
                this.f133539C = f11;
            }
            if (!this.f133541E && !this.f133542F) {
                float f12 = this.f133540D;
                if (f11 > f12) {
                    this.f133542F = false;
                    this.f133541E = true;
                } else if (f11 < f12) {
                    this.f133542F = true;
                    this.f133541E = false;
                }
            }
            float f13 = this.f133540D;
            if (f11 > f13) {
                if (this.f133542F && !this.f133541E) {
                    this.f133539C = f11;
                    this.f133542F = false;
                    this.f133541E = true;
                }
            } else if (f11 < f13 && this.f133541E && !this.f133542F) {
                this.f133539C = f11;
                this.f133542F = true;
                this.f133541E = false;
            }
            double d11 = f11 - this.f133539C;
            if (d11 > 10.0d) {
                this.f133558V.mo9224q(C24848g0.f119245a);
                this.f133539C = f11;
                this.f133542F = false;
                this.f133541E = false;
            } else if (d11 < -10.0d) {
                this.f133559W.mo9224q(C24848g0.f119245a);
                this.f133539C = f11;
                this.f133542F = false;
                this.f133541E = false;
            }
            this.f133540D = f11;
            return;
        }
        if (z12) {
            this.f133539C = 0.0f;
            this.f133540D = 0.0f;
            this.f133541E = false;
            this.f133542F = false;
        }
    }

    /* renamed from: W0 */
    public final int m144212W0() {
        return this.f133572t.m18140i();
    }

    /* renamed from: W1 */
    public final void m144213W1(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f133575w.m9321g("SS_AUTO_PLAY_PREFIX", str);
    }

    /* renamed from: X0 */
    public final int m144214X0() {
        Integer num = (Integer) this.f133575w.m9318c("SS_NORMAL_PANEL_COMPONENTS");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: Y0 */
    public final C7110j8.d m144215Y0() {
        return (C7110j8.d) this.f133575w.m9318c("SS_PAGE_ITEM_CUSTOM_STYLE");
    }

    /* renamed from: Y1 */
    public final void m144216Y1(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_GO_TO_STORE_BTN", Boolean.valueOf(z11));
    }

    /* renamed from: Z0 */
    public final int m144217Z0() {
        Integer num = (Integer) this.f133575w.m9318c("SS_PAGE_OFFSET");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: Z1 */
    public final void m144218Z1(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_INDICATOR", Boolean.valueOf(z11));
    }

    /* renamed from: a1 */
    public final LiveData m144219a1() {
        return this.f133559W;
    }

    /* renamed from: b0 */
    public final void m144220b0() {
        m144145D1(new c());
    }

    /* renamed from: b1 */
    public final LiveData m144221b1() {
        return this.f133558V;
    }

    /* renamed from: b2 */
    public final void m144222b2(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_SEARCH_GIF_ICON", Boolean.valueOf(z11));
    }

    /* renamed from: c0 */
    public final void m144223c0() {
        m144145D1(new d());
    }

    /* renamed from: c1 */
    public final LiveData m144224c1() {
        return this.f133569g0;
    }

    /* renamed from: c2 */
    public final void m144225c2(boolean z11) {
        this.f133575w.m9321g("SS_ENABLE_SETTING_ICON", Boolean.valueOf(z11));
    }

    /* renamed from: d2 */
    public final void m144226d2(boolean z11) {
        this.f133577y = z11;
    }

    /* renamed from: e0 */
    public final void m144227e0() {
        m144145D1(new e());
    }

    /* renamed from: e1 */
    public final LiveData m144228e1() {
        return this.f133570h0;
    }

    /* renamed from: e2 */
    public final void m144229e2(int i11) {
        this.f133543G = i11;
    }

    /* renamed from: f1 */
    public final int m144230f1() {
        return this.f133572t.m18142k();
    }

    /* renamed from: f2 */
    public final void m144231f2(int i11) {
        this.f133575w.m9321g("SS_INDICATOR_BACKGROUND_RES", Integer.valueOf(i11));
    }

    /* renamed from: g1 */
    public final LiveData m144232g1() {
        return this.f133567e0;
    }

    /* renamed from: g2 */
    public final void m144233g2(StickerIndicatorView.C13538e c13538e) {
        this.f133575w.m9321g("SS_INDICATOR_CUSTOM_STYLE", c13538e);
    }

    /* renamed from: h1 */
    public final LiveData m144234h1() {
        return this.f133557U;
    }

    /* renamed from: h2 */
    public final void m144235h2(int i11) {
        this.f133575w.m9321g("SS_NORMAL_PANEL_COMPONENTS", Integer.valueOf(i11));
    }

    /* renamed from: i1 */
    public final LiveData m144236i1() {
        return this.f133564b0;
    }

    /* renamed from: i2 */
    public final void m144237i2(C7110j8.d dVar) {
        this.f133575w.m9321g("SS_PAGE_ITEM_CUSTOM_STYLE", dVar);
    }

    /* renamed from: j0 */
    public final void m144238j0(List list) {
        int m144154Q1;
        AbstractC19074t.m100208f(list, "indicatorList");
        if (list.isEmpty() || m144143C1()) {
            return;
        }
        if (m144264v1() == EnumC30861e.f142419r) {
            m144154Q1 = this.f133572t.m18139h();
            if (m144154Q1 < 0 || m144154Q1 >= list.size()) {
                m144154Q1 = 0;
            }
        } else {
            m144154Q1 = m144154Q1(this.f133545I, this.f133548L, this.f133546J, this.f133547K, m144172i0(this.f133547K, this.f133545I, this.f133546J, list), list);
        }
        if (m144154Q1 != -1) {
            this.f133563a0.mo9224q(Integer.valueOf(m144154Q1));
        }
    }

    /* renamed from: j1 */
    public final LiveData m144239j1() {
        return this.f133566d0;
    }

    /* renamed from: j2 */
    public final void m144240j2(int i11) {
        this.f133575w.m9321g("SS_PAGE_OFFSET", Integer.valueOf(i11));
    }

    /* renamed from: k1 */
    public final LiveData m144241k1() {
        return this.f133565c0;
    }

    /* renamed from: k2 */
    public final void m144242k2(boolean z11) {
        this.f133575w.m9321g("SS_SHOULD_SMOOTH_SCROLL_PAGES", Boolean.valueOf(z11));
    }

    /* renamed from: l0 */
    public final void m144243l0() {
        m144175n0();
        m144174m0();
    }

    /* renamed from: l1 */
    public final LiveData m144244l1() {
        return this.f133560X;
    }

    /* renamed from: l2 */
    public final void m144245l2(boolean z11) {
        this.f133575w.m9321g("SS_SHOW_STICKER_ONLY_IN_RECENT", Boolean.valueOf(z11));
    }

    /* renamed from: m1 */
    public final boolean m144246m1() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_SHOULD_SMOOTH_SCROLL_PAGES");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: m2 */
    public final void m144247m2(int i11) {
        this.f133575w.m9321g("SS_SOURCE_FRAGMENT", Integer.valueOf(i11));
    }

    /* renamed from: n1 */
    public final LiveData m144248n1() {
        return this.f133568f0;
    }

    /* renamed from: n2 */
    public final void m144249n2(int i11) {
        this.f133575w.m9321g("SS_STICKER_PANEL_HEIGHT", Integer.valueOf(i11));
    }

    /* renamed from: o0 */
    public final void m144250o0(boolean z11, List list) {
        AbstractC19074t.m100208f(list, "indicatorList");
        if (!list.isEmpty() && !z11) {
            m144238j0(list);
            m144175n0();
            m144174m0();
            m144176p0();
        }
    }

    /* renamed from: o1 */
    public final boolean m144251o1() {
        Boolean bool = (Boolean) this.f133575w.m9318c("SS_SHOW_STICKER_ONLY_IN_RECENT");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: o2 */
    public final void m144252o2(EnumC30861e enumC30861e) {
        AbstractC19074t.m100208f(enumC30861e, "value");
        this.f133575w.m9321g("SS_STICKER_PANEL_TYPE", enumC30861e);
    }

    /* renamed from: p2 */
    public final void m144253p2(int i11) {
        this.f133575w.m9321g("SS_SYSTEM_EMOJI_COLUMN_COUNT", Integer.valueOf(i11));
    }

    /* renamed from: r0 */
    public final int m144254r0(int i11, C12922b c12922b) {
        AbstractC19074t.m100208f(c12922b, "pagerAdapter");
        int i12 = i11 - this.f133550N;
        if (c12922b.m72785c0() != -1 && i12 >= c12922b.m72785c0()) {
            i12 = c12922b.m72785c0();
        }
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    /* renamed from: r2 */
    public final void m144255r2(C17487o0 c17487o0, C3245i c3245i) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(c3245i, "category");
        Bundle bundle = new Bundle();
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putString("contentNeedToShare", c3245i.m16461c());
        c17487o0.m93069k2(ShareView.class, bundle, 0, true);
    }

    /* renamed from: s0 */
    public final int m144256s0(int i11, int i12) {
        return (i11 - i12) - this.f133550N;
    }

    /* renamed from: t0 */
    public final int m144257t0(int i11, int i12) {
        return i11 + i12 + this.f133550N;
    }

    /* renamed from: t1 */
    public final int m144258t1() {
        Integer num = (Integer) this.f133575w.m9318c("SS_SOURCE_FRAGMENT");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: t2 */
    public final void m144259t2(InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(interfaceC12965o, "stickersPageItem");
        m144180s2(interfaceC12965o, i11, i12);
    }

    /* renamed from: u0 */
    public final void m144260u0(C12922b c12922b, int i11) {
        AbstractC19074t.m100208f(c12922b, "pagerAdapter");
        if (i11 == -2) {
            C7960e.m41971c6().m42517r3();
        } else {
            C0824j.m2153b(new f(i11, this, m144147J0(), c12922b));
        }
    }

    /* renamed from: u1 */
    public final int m144261u1() {
        Integer num = (Integer) this.f133575w.m9318c("SS_STICKER_PANEL_HEIGHT");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: u2 */
    public final void m144262u2(C12967q c12967q, int i11, int i12) {
        AbstractC19074t.m100208f(c12967q, "stickersPageItem");
        m144180s2(c12967q, i11, i12);
    }

    /* renamed from: v0 */
    public final void m144263v0(C18474m c18474m) {
        AbstractC19074t.m100208f(c18474m, "bundle");
        C3245i m146933a = c18474m.m97816a().m146933a();
        C19515b.b bVar = C19515b.Companion;
        if (bVar.m102006a().m102001g(m146933a.f13854b) != null) {
            return;
        }
        C28020b3.f130648a.m141190S(m146933a.f13854b, true);
        bVar.m102006a().m102003l(m146933a, 3, 0, -1, new g(c18474m));
    }

    /* renamed from: v1 */
    public final EnumC30861e m144264v1() {
        EnumC30861e enumC30861e = (EnumC30861e) this.f133575w.m9318c("SS_STICKER_PANEL_TYPE");
        if (enumC30861e == null) {
            return EnumC30861e.f142417p;
        }
        return enumC30861e;
    }

    /* renamed from: v2 */
    public final void m144265v2(InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(interfaceC12965o, "selectedPage");
        m144180s2(interfaceC12965o, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:            if (p588vw.C28644j.m143233Y().m143296a0(-3, false) > 0) goto L10;     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m144266w0() {
        boolean z11;
        List m131502j;
        if (!m144139A1()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        if (!C28644j.m143233Y().m143308q0()) {
            z11 = false;
        }
        z11 = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = AbstractC23304d.f113269E;
        AbstractC19074t.m100207e(arrayList2, "stickerDecorList");
        synchronized (arrayList2) {
            try {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C3245i c3245i = (C3245i) it.next();
                    if (c3245i.f13854b == -3) {
                        if (z11) {
                            AbstractC19074t.m100205c(c3245i);
                            arrayList.add(new C12952b(c3245i));
                        }
                    } else {
                        String str = c3245i.f13858f;
                        AbstractC19074t.m100207e(str, "iconUrl");
                        if (str.length() != 0) {
                            String m16464f = c3245i.m16464f();
                            AbstractC19074t.m100207e(m16464f, "getName(...)");
                            if (m16464f.length() != 0) {
                                AbstractC19074t.m100205c(c3245i);
                                arrayList.add(new C12952b(c3245i));
                            }
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList3 = AbstractC23304d.f113261C;
        AbstractC19074t.m100207e(arrayList3, "stickerList");
        synchronized (arrayList3) {
            try {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C3245i c3245i2 = (C3245i) it2.next();
                    int i11 = c3245i2.f13854b;
                    if (i11 != -2) {
                        if (i11 != 0) {
                            String str2 = c3245i2.f13858f;
                            AbstractC19074t.m100207e(str2, "iconUrl");
                            if (str2.length() != 0) {
                                String m16464f2 = c3245i2.m16464f();
                                AbstractC19074t.m100207e(m16464f2, "getName(...)");
                                if (m16464f2.length() == 0) {
                                }
                            }
                        }
                        AbstractC19074t.m100205c(c3245i2);
                        arrayList.add(new C12952b(c3245i2));
                    }
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return arrayList;
    }

    /* renamed from: w1 */
    public final int m144267w1() {
        Integer num = (Integer) this.f133575w.m9318c("SS_SYSTEM_EMOJI_COLUMN_COUNT");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: w2 */
    public final void m144268w2(InterfaceC12965o interfaceC12965o, int i11, int i12) {
        AbstractC19074t.m100208f(interfaceC12965o, "stickersPageItem");
        m144180s2(interfaceC12965o, i11, i12);
    }

    /* renamed from: x0 */
    public final List m144269x0() {
        List m131502j;
        if (!m144141B1()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        if ((m144214X0() & 1) > 0) {
            arrayList.add(new C12958h(null, 1, null));
        }
        if (m144140B0()) {
            arrayList.add(new C12962l());
        }
        if ((m144214X0() & 4) > 0 && AbstractC23309i.m121791cg()) {
            m144171h0(arrayList);
        }
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        if ((m144214X0() & 8) > 0) {
            arrayList2 = m144148M0(m144251o1());
        }
        if ((m144214X0() & 16) > 0) {
            arrayList3 = m144168d1();
        }
        if (arrayList2.size() + arrayList3.size() > 0) {
            arrayList.add(new C12967q(arrayList2, arrayList3));
        }
        return arrayList;
    }

    /* renamed from: x1 */
    public final LiveData m144270x1() {
        return this.f133571i0;
    }

    /* renamed from: z0 */
    public final void m144271z0(boolean z11) {
        if (z11) {
            this.f133564b0.mo9224q(C24848g0.f119245a);
        } else {
            this.f133565c0.mo9224q(C24848g0.f119245a);
        }
    }

    /* renamed from: z1 */
    public final boolean m144272z1() {
        if (m144258t1() == 250) {
            return true;
        }
        return false;
    }

    public C28830a0(C3570a c3570a, InterfaceC31005a interfaceC31005a, InterfaceC23792b interfaceC23792b, C1780l0 c1780l0, CoroutineDispatcher coroutineDispatcher) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c3570a, "stickerPanelRepo");
        AbstractC19074t.m100208f(interfaceC31005a, "stickerRepo");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(coroutineDispatcher, "mainDispatcher");
        this.f133572t = c3570a;
        this.f133573u = interfaceC31005a;
        this.f133574v = interfaceC23792b;
        this.f133575w = c1780l0;
        this.f133576x = coroutineDispatcher;
        this.f133543G = -1;
        this.f133544H = -1;
        this.f133545I = -1;
        this.f133546J = -1;
        this.f133547K = -1;
        this.f133548L = -1;
        this.f133549M = -1;
        this.f133551O = -1;
        this.f133552P = -1;
        m129210a = AbstractC24856m.m129210a(i.f133599q);
        this.f133553Q = m129210a;
        this.f133554R = new ArrayList();
        this.f133556T = EnumC30858b.f142392p;
        this.f133557U = new C1761c0();
        this.f133558V = new C1761c0();
        this.f133559W = new C1761c0();
        this.f133560X = new C1761c0();
        this.f133561Y = new C1761c0();
        this.f133562Z = new C1761c0();
        this.f133563a0 = new C1761c0();
        this.f133564b0 = new C1761c0();
        this.f133565c0 = new C1761c0();
        this.f133566d0 = new C1761c0();
        this.f133567e0 = new C1761c0();
        this.f133568f0 = new C1761c0();
        this.f133569g0 = new C1761c0();
        this.f133570h0 = new C1761c0();
        this.f133571i0 = new C1761c0();
    }
}
