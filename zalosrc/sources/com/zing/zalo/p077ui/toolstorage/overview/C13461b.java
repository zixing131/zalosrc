package com.zing.zalo.p077ui.toolstorage.overview;

import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import hn0.AbstractC20104d;
import hu.C20128b;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p213hl.C20087c;
import p716zh.C32034n6;
import pm.C24831b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24865v;
import qm0.AbstractC25332a0;
import ua0.C27214a;
import vi0.C28264b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import za0.C31747a;

/* renamed from: com.zing.zalo.ui.toolstorage.overview.b */
/* loaded from: classes6.dex */
public final class C13461b extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f68840A;

    /* renamed from: B */
    private final C1761c0 f68841B;

    /* renamed from: C */
    private final C1761c0 f68842C;

    /* renamed from: D */
    private final C1761c0 f68843D;

    /* renamed from: E */
    private final C1761c0 f68844E;

    /* renamed from: F */
    private final C1761c0 f68845F;

    /* renamed from: G */
    private final C1761c0 f68846G;

    /* renamed from: H */
    private final C1761c0 f68847H;

    /* renamed from: I */
    private final C1761c0 f68848I;

    /* renamed from: J */
    private final LiveData f68849J;

    /* renamed from: K */
    private float f68850K;

    /* renamed from: L */
    private final C1761c0 f68851L;

    /* renamed from: M */
    private final LiveData f68852M;

    /* renamed from: N */
    private final long f68853N;

    /* renamed from: t */
    private final C1780l0 f68854t;

    /* renamed from: u */
    private final C20087c f68855u;

    /* renamed from: v */
    private final C19669z f68856v;

    /* renamed from: w */
    private final C32034n6 f68857w;

    /* renamed from: x */
    private final C27214a f68858x;

    /* renamed from: y */
    private final C1761c0 f68859y;

    /* renamed from: z */
    private final C1761c0 f68860z;

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f68861s;

        /* renamed from: t */
        /* synthetic */ Object f68862t;

        /* renamed from: v */
        int f68864v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f68862t = obj;
            this.f68864v |= Integer.MIN_VALUE;
            return C13461b.this.m75417j0(this);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$c */
    /* loaded from: classes6.dex */
    public static final class c implements FlowCollector {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object mo12109b(C27214a.b bVar, Continuation continuation) {
            List m131187O0;
            Object m142578e;
            if (!(bVar instanceof C27214a.b.C32988b)) {
                if (bVar instanceof C27214a.b.c) {
                    C13461b.this.f68851L.mo9221n(AbstractC29094b.m145341c((int) Math.floor((((C27214a.b.c) bVar).m139312a() * 0.9f) + 10.0f)));
                } else {
                    if (bVar instanceof C27214a.b.d) {
                        List m139313a = ((C27214a.b.d) bVar).m139313a();
                        C20087c c20087c = C13461b.this.f68855u;
                        m131187O0 = AbstractC25332a0.m131187O0(m139313a);
                        c20087c.m104465n(m131187O0);
                        Object m75394J0 = C13461b.this.m75394J0(m139313a, continuation);
                        m142578e = AbstractC28298d.m142578e();
                        if (m75394J0 == m142578e) {
                            return m75394J0;
                        }
                        return C24848g0.f119245a;
                    }
                    boolean z11 = bVar instanceof C27214a.b.a;
                }
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68866t;

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
            AbstractC28298d.m142578e();
            if (this.f68866t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145342d(C13461b.this.f68857w.m154501e());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f68868t;

        /* renamed from: u */
        int f68869u;

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
            Boolean bool;
            int m104529e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f68869u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) this.f68868t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                bool = (Boolean) C13461b.this.f68854t.m9318c("EXTRA_IS_LOADED_DATA");
                C13461b c13461b = C13461b.this;
                this.f68868t = bool;
                this.f68869u = 1;
                obj = c13461b.m75391B0(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C13461b.this.f68842C.mo9221n(AbstractC29094b.m145342d(((Number) obj).longValue()));
            C13461b.this.f68850K = 10.0f;
            C1761c0 c1761c0 = C13461b.this.f68851L;
            m104529e = AbstractC20104d.m104529e(C13461b.this.f68850K);
            c1761c0.mo9221n(AbstractC29094b.m145341c(m104529e));
            if (AbstractC19074t.m100204b(bool, AbstractC29094b.m145339a(true))) {
                C13461b.this.m75426M0();
            } else {
                C13461b.this.f68855u.m104464l();
                C13461b c13461b2 = C13461b.this;
                this.f68868t = null;
                this.f68869u = 2;
                if (c13461b2.m75419y0(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68871t;

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
            AbstractC28298d.m142578e();
            if (this.f68871t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145342d(C20128b.m104764k());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68872t;

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f68872t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145342d(C20128b.m104766m());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68873t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int i11;
            int i12;
            int i13;
            AbstractC28298d.m142578e();
            if (this.f68873t == 0) {
                AbstractC24862s.m129228b(obj);
                C13461b.this.f68848I.mo9221n(new C19964c(ToolStorageView.EnumC13439a.f68816p));
                long m104775v = C20128b.m104775v() + C28264b.Companion.m142373a().m142372o();
                C24831b c24831b = C24831b.f119222a;
                if (c24831b.m129118d()) {
                    try {
                        File[] listFiles = new File(C20131e.m104912E()).listFiles();
                        if (listFiles != null) {
                            i11 = listFiles.length;
                        } else {
                            i11 = 0;
                        }
                        File[] listFiles2 = new File(C20131e.m104913G()).listFiles();
                        if (listFiles2 != null) {
                            i12 = listFiles2.length;
                        } else {
                            i12 = 0;
                        }
                        File[] listFiles3 = new File(C20131e.m104923r()).listFiles();
                        if (listFiles3 != null) {
                            i13 = listFiles3.length;
                        } else {
                            i13 = 0;
                        }
                        int i14 = i11 + i12 + i13;
                        long m129115a = c24831b.m129115a();
                        int i15 = i14;
                        for (long j11 = 1; j11 < m129115a; j11++) {
                            m104775v += C20128b.m104775v();
                            i15 += i14;
                        }
                        C31747a.m152704c("SMLToolStorage", "Total cache file: " + i15, false, 4, null);
                    } catch (Exception unused) {
                    }
                }
                return AbstractC29094b.m145342d(m104775v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68875t;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f68875t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145342d(C20128b.m104778y());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f68876t;

        /* renamed from: u */
        int f68877u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f68879w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f68879w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f68879w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f68877u;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.f68876t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Long l11 = (Long) C13461b.this.m75428m0().mo9215f();
                if (l11 == null) {
                    l11 = AbstractC29094b.m145342d(0L);
                }
                long longValue = l11.longValue();
                C13461b c13461b = C13461b.this;
                this.f68876t = longValue;
                this.f68877u = 1;
                obj = c13461b.m75418k0(this);
                if (obj == m142578e) {
                    return m142578e;
                }
                j11 = longValue;
            }
            C31747a.m152713l(((Number) obj).longValue());
            C13461b.this.f68842C.mo9221n(AbstractC29094b.m145342d(0L));
            C13461b.this.m75426M0();
            this.f68879w.mo205i9(AbstractC29094b.m145342d(j11));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68880t;

        /* renamed from: v */
        final /* synthetic */ long f68882v;

        /* renamed from: w */
        final /* synthetic */ long f68883w;

        /* renamed from: x */
        final /* synthetic */ long f68884x;

        /* renamed from: y */
        final /* synthetic */ long f68885y;

        /* renamed from: z */
        final /* synthetic */ long f68886z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j11, long j12, long j13, long j14, long j15, Continuation continuation) {
            super(2, continuation);
            this.f68882v = j11;
            this.f68883w = j12;
            this.f68884x = j13;
            this.f68885y = j14;
            this.f68886z = j15;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f68882v, this.f68883w, this.f68884x, this.f68885y, this.f68886z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f68880t == 0) {
                AbstractC24862s.m129228b(obj);
                C13461b.this.f68848I.mo9221n(new C19964c(ToolStorageView.EnumC13439a.f68818r));
                long j11 = this.f68882v;
                long j12 = j11 - this.f68883w;
                long j13 = this.f68884x;
                long j14 = j12 - j13;
                C13461b.this.f68844E.mo9221n(AbstractC29094b.m145342d((j13 - this.f68885y) - this.f68886z));
                C13461b.this.f68843D.mo9221n(AbstractC29094b.m145342d(this.f68886z));
                C13461b.this.f68845F.mo9221n(new C24865v(AbstractC29094b.m145342d(this.f68884x), AbstractC29094b.m145340b((((float) j13) * 100) / ((float) j11)), AbstractC29094b.m145342d(this.f68883w)));
                C13461b.this.f68846G.mo9221n(new C24865v(AbstractC29094b.m145342d(this.f68884x), AbstractC29094b.m145342d(j14), AbstractC29094b.m145342d(this.f68883w)));
                C1761c0 c1761c0 = C13461b.this.f68847H;
                C13461b c13461b = C13461b.this;
                c1761c0.mo9221n(c13461b.m75395L0(c13461b.f68855u.m104460h()));
                C13461b.this.f68854t.m9321g("EXTRA_IS_LOADED_DATA", AbstractC29094b.m145339a(true));
                C31747a.m152715n(System.currentTimeMillis() - C13461b.this.f68853N, this.f68882v, this.f68883w, this.f68884x, this.f68885y, this.f68886z, j14);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC29096d {

        /* renamed from: s */
        Object f68887s;

        /* renamed from: t */
        long f68888t;

        /* renamed from: u */
        long f68889u;

        /* renamed from: v */
        long f68890v;

        /* renamed from: w */
        /* synthetic */ Object f68891w;

        /* renamed from: y */
        int f68893y;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f68891w = obj;
            this.f68893y |= Integer.MIN_VALUE;
            return C13461b.this.m75394J0(null, this);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.b$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68894t;

        m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f68894t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C13461b c13461b = C13461b.this;
                List m104461i = c13461b.f68855u.m104461i();
                this.f68894t = 1;
                if (c13461b.m75394J0(m104461i, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13461b(C1780l0 c1780l0, C20087c c20087c, C19669z c19669z, C32034n6 c32034n6, C27214a c27214a) {
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(c20087c, "toolStorageRepo");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c32034n6, "localFileCleaner");
        AbstractC19074t.m100208f(c27214a, "loadAllMediaUseCase");
        this.f68854t = c1780l0;
        this.f68855u = c20087c;
        this.f68856v = c19669z;
        this.f68857w = c32034n6;
        this.f68858x = c27214a;
        this.f68859y = new C1761c0();
        this.f68860z = new C1761c0();
        this.f68840A = new C1761c0();
        this.f68841B = new C1761c0();
        this.f68842C = new C1761c0();
        this.f68843D = new C1761c0();
        this.f68844E = new C1761c0();
        this.f68845F = new C1761c0();
        this.f68846G = new C1761c0();
        this.f68847H = new C1761c0();
        C1761c0 c1761c0 = new C1761c0();
        this.f68848I = c1761c0;
        this.f68849J = c1761c0;
        C1761c0 c1761c02 = new C1761c0(0);
        this.f68851L = c1761c02;
        this.f68852M = c1761c02;
        this.f68853N = System.currentTimeMillis();
        m75415i();
    }

    /* renamed from: A0 */
    private final Object m75390A0(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new g(null), continuation);
    }

    /* renamed from: B0 */
    public final Object m75391B0(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new h(null), continuation);
    }

    /* renamed from: C0 */
    private final Object m75392C0(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new i(null), continuation);
    }

    /* renamed from: I0 */
    private final Object m75393I0(long j11, long j12, long j13, long j14, long j15, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new k(j13, j14, j15, j11, j12, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m75394J0(List list, Continuation continuation) {
        l lVar;
        Object obj;
        Object m142578e;
        int i11;
        long m104463k;
        C13461b c13461b;
        long j11;
        long longValue;
        long longValue2;
        Long l11;
        long longValue3;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i12 = lVar.f68893y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f68893y = i12 - Integer.MIN_VALUE;
                l lVar2 = lVar;
                obj = lVar2.f68891w;
                m142578e = AbstractC28298d.m142578e();
                i11 = lVar2.f68893y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            long j12 = lVar2.f68890v;
                            long j13 = lVar2.f68889u;
                            long j14 = lVar2.f68888t;
                            c13461b = (C13461b) lVar2.f68887s;
                            AbstractC24862s.m129228b(obj);
                            m104463k = j14;
                            longValue = j12;
                            j11 = j13;
                            longValue2 = ((Number) obj).longValue();
                            l11 = (Long) c13461b.m75428m0().mo9215f();
                            if (l11 == null) {
                                l11 = AbstractC29094b.m145342d(0L);
                            }
                            longValue3 = l11.longValue();
                            lVar2.f68887s = null;
                            lVar2.f68893y = 4;
                            if (c13461b.m75393I0(longValue3, m104463k, j11, longValue, longValue2, lVar2) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        j11 = lVar2.f68889u;
                        m104463k = lVar2.f68888t;
                        c13461b = (C13461b) lVar2.f68887s;
                        AbstractC24862s.m129228b(obj);
                        longValue = ((Number) obj).longValue();
                        lVar2.f68887s = c13461b;
                        lVar2.f68888t = m104463k;
                        lVar2.f68889u = j11;
                        lVar2.f68890v = longValue;
                        lVar2.f68893y = 3;
                        obj = c13461b.m75392C0(lVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        longValue2 = ((Number) obj).longValue();
                        l11 = (Long) c13461b.m75428m0().mo9215f();
                        if (l11 == null) {
                        }
                        longValue3 = l11.longValue();
                        lVar2.f68887s = null;
                        lVar2.f68893y = 4;
                        if (c13461b.m75393I0(longValue3, m104463k, j11, longValue, longValue2, lVar2) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    long j15 = lVar2.f68888t;
                    c13461b = (C13461b) lVar2.f68887s;
                    AbstractC24862s.m129228b(obj);
                    m104463k = j15;
                } else {
                    AbstractC24862s.m129228b(obj);
                    Iterator it = list.iterator();
                    long j16 = 0;
                    while (it.hasNext()) {
                        j16 += ((ThreadStorageInfo) it.next()).m74770F();
                    }
                    m104463k = j16 + this.f68855u.m104463k();
                    lVar2.f68887s = this;
                    lVar2.f68888t = m104463k;
                    lVar2.f68893y = 1;
                    obj = m75390A0(lVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c13461b = this;
                }
                long longValue4 = ((Number) obj).longValue();
                lVar2.f68887s = c13461b;
                lVar2.f68888t = m104463k;
                lVar2.f68889u = longValue4;
                lVar2.f68893y = 2;
                obj = c13461b.m75420z0(lVar2);
                if (obj != m142578e) {
                    return m142578e;
                }
                j11 = longValue4;
                longValue = ((Number) obj).longValue();
                lVar2.f68887s = c13461b;
                lVar2.f68888t = m104463k;
                lVar2.f68889u = j11;
                lVar2.f68890v = longValue;
                lVar2.f68893y = 3;
                obj = c13461b.m75392C0(lVar2);
                if (obj == m142578e) {
                }
                longValue2 = ((Number) obj).longValue();
                l11 = (Long) c13461b.m75428m0().mo9215f();
                if (l11 == null) {
                }
                longValue3 = l11.longValue();
                lVar2.f68887s = null;
                lVar2.f68893y = 4;
                if (c13461b.m75393I0(longValue3, m104463k, j11, longValue, longValue2, lVar2) == m142578e) {
                }
                return C24848g0.f119245a;
            }
        }
        lVar = new l(continuation);
        l lVar22 = lVar;
        obj = lVar22.f68891w;
        m142578e = AbstractC28298d.m142578e();
        i11 = lVar22.f68893y;
        if (i11 == 0) {
        }
        long longValue42 = ((Number) obj).longValue();
        lVar22.f68887s = c13461b;
        lVar22.f68888t = m104463k;
        lVar22.f68889u = longValue42;
        lVar22.f68893y = 2;
        obj = c13461b.m75420z0(lVar22);
        if (obj != m142578e) {
        }
    }

    /* renamed from: L0 */
    public final C24860q m75395L0(List list) {
        List m131179G0;
        m131179G0 = AbstractC25332a0.m131179G0(list, 4);
        ArrayList arrayList = new ArrayList(m131179G0);
        if (list.size() >= 5) {
            arrayList.add(new C13380a(2, String.valueOf(list.size() - 4), false, false, null, null, 0L, 124, null));
        }
        Iterator it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((C13380a) it.next()).m75087i();
        }
        return new C24860q(Long.valueOf(j11), arrayList);
    }

    /* renamed from: i */
    private final void m75415i() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m75417j0(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C13461b c13461b;
        Flow flow;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f68864v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f68864v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f68862t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f68864v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c13461b = (C13461b) bVar.f68861s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C27214a c27214a = this.f68858x;
                    bVar.f68861s = this;
                    bVar.f68864v = 1;
                    obj = c27214a.m101503a(bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c13461b = this;
                }
                flow = (Flow) obj;
                if (flow == null) {
                    c cVar = new c();
                    bVar.f68861s = null;
                    bVar.f68864v = 2;
                    if (flow.mo97893a(cVar, bVar) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f68862t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f68864v;
        if (i11 == 0) {
        }
        flow = (Flow) obj2;
        if (flow == null) {
        }
    }

    /* renamed from: k0 */
    public final Object m75418k0(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(null), continuation);
    }

    /* renamed from: y0 */
    public final Object m75419y0(Continuation continuation) {
        Object m142578e;
        this.f68848I.mo9221n(new C19964c(ToolStorageView.EnumC13439a.f68817q));
        Object m75417j0 = m75417j0(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m75417j0 == m142578e) {
            return m75417j0;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: z0 */
    private final Object m75420z0(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new f(null), continuation);
    }

    /* renamed from: D0 */
    public final void m75421D0() {
        this.f68860z.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: E0 */
    public final void m75422E0() {
        this.f68859y.mo9221n(new C19964c(0));
    }

    /* renamed from: F0 */
    public final void m75423F0(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onDone");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j(interfaceC18505l, null), 3, null);
    }

    /* renamed from: G0 */
    public final void m75424G0() {
        this.f68840A.mo9221n(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: K0 */
    public void m75425K0(C13460a c13460a) {
        super.m103748N(c13460a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onStart(): ");
        sb2.append(c13460a);
    }

    /* renamed from: M0 */
    public final void m75426M0() {
        if (AbstractC19074t.m100204b(this.f68854t.m9318c("EXTRA_IS_LOADED_DATA"), Boolean.TRUE)) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new m(null), 3, null);
        }
    }

    /* renamed from: l0 */
    public final long m75427l0() {
        Long l11 = (Long) m75428m0().mo9215f();
        if (l11 == null) {
            l11 = 0L;
        }
        return l11.longValue();
    }

    /* renamed from: m0 */
    public final LiveData m75428m0() {
        return this.f68842C;
    }

    /* renamed from: n0 */
    public final LiveData m75429n0() {
        return this.f68849J;
    }

    /* renamed from: o0 */
    public final LiveData m75430o0() {
        return this.f68843D;
    }

    /* renamed from: p0 */
    public final LiveData m75431p0() {
        return this.f68846G;
    }

    /* renamed from: q0 */
    public final LiveData m75432q0() {
        return this.f68847H;
    }

    /* renamed from: r0 */
    public final LiveData m75433r0() {
        return this.f68852M;
    }

    /* renamed from: s0 */
    public final LiveData m75434s0() {
        return this.f68844E;
    }

    /* renamed from: t0 */
    public final LiveData m75435t0() {
        return this.f68860z;
    }

    /* renamed from: u0 */
    public final LiveData m75436u0() {
        return this.f68840A;
    }

    /* renamed from: v0 */
    public final LiveData m75437v0() {
        return this.f68859y;
    }

    /* renamed from: w0 */
    public final LiveData m75438w0() {
        return this.f68841B;
    }

    /* renamed from: x0 */
    public final LiveData m75439x0() {
        return this.f68845F;
    }
}
