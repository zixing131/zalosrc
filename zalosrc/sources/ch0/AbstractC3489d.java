package ch0;

import b90.EnumC2667d;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24250a;
import og0.EnumC24251b;
import og0.EnumC24253d;
import on0.AbstractC24342w;
import p279jw.C21373a;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import pm.C24832c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import tg0.C26676b;
import th.C26686g;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: ch0.d */
/* loaded from: classes.dex */
public abstract class AbstractC3489d {

    /* renamed from: ch0.d$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14604a;

        static {
            int[] iArr = new int[EnumC24250a.values().length];
            try {
                iArr[EnumC24250a.f117141p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24250a.f117142q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24250a.f117143r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14604a = iArr;
        }
    }

    /* renamed from: ch0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        int f14605s;

        /* renamed from: t */
        int f14606t;

        /* renamed from: u */
        long f14607u;

        /* renamed from: v */
        long f14608v;

        /* renamed from: w */
        double f14609w;

        /* renamed from: x */
        Object f14610x;

        /* renamed from: y */
        /* synthetic */ Object f14611y;

        /* renamed from: z */
        int f14612z;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f14611y = obj;
            this.f14612z |= Integer.MIN_VALUE;
            return AbstractC3489d.m17497e(0, 0L, 0L, 0.0d, null, this);
        }
    }

    /* renamed from: ch0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f14613t;

        /* renamed from: u */
        int f14614u;

        /* renamed from: v */
        final /* synthetic */ C17945a0 f14615v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f14616w;

        /* renamed from: ch0.d$c$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f14617t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f14618u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18494a interfaceC18494a, Continuation continuation) {
                super(2, continuation);
                this.f14618u = interfaceC18494a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f14618u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f14617t == 0) {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18494a interfaceC18494a = this.f14618u;
                    if (interfaceC18494a != null) {
                        return interfaceC18494a.mo12V4();
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17945a0 c17945a0, InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f14615v = c17945a0;
            this.f14616w = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f14615v, this.f14616w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            EnumC24253d m95216o5;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f14614u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m95216o5 = (EnumC24253d) this.f14613t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                m95216o5 = this.f14615v.m95216o5();
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                C17945a0 c17945a0 = this.f14615v;
                this.f14613t = m95216o5;
                this.f14614u = 1;
                obj = m120679j2.m124821o0(c17945a0, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            EnumC24250a enumC24250a = (EnumC24250a) obj;
            if (AbstractC3489d.m17496d(m95216o5, AbstractC3489d.m17499g(enumC24250a, this.f14615v), this.f14615v, enumC24250a)) {
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(this.f14616w, null);
                this.f14613t = null;
                this.f14614u = 2;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: c */
    public static final boolean m17495c(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (!AbstractC25495a.m132078c(str) && (!m17502j() || m17506n())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m17496d(EnumC24253d enumC24253d, EnumC24253d enumC24253d2, C17945a0 c17945a0, EnumC24250a enumC24250a) {
        if (enumC24253d != enumC24253d2) {
            c17945a0.m94910Hb(enumC24253d2);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cf -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17497e(int i11, long j11, long j12, double d11, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        int i13;
        long j13;
        double d12;
        InterfaceC18505l interfaceC18505l2;
        b bVar2;
        Object obj;
        int i14;
        long j14;
        InterfaceC18505l interfaceC18505l3;
        int i15;
        long j15;
        long j16;
        int i16;
        long m116585h;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i17 = bVar.f14612z;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                bVar.f14612z = i17 - Integer.MIN_VALUE;
                Object obj2 = bVar.f14611y;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar.f14612z;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            j16 = bVar.f14608v;
                            i16 = bVar.f14606t;
                            d12 = bVar.f14609w;
                            j15 = bVar.f14607u;
                            i15 = bVar.f14605s;
                            interfaceC18505l3 = (InterfaceC18505l) bVar.f14610x;
                            AbstractC24862s.m129228b(obj2);
                            i13 = i15;
                            i14 = i16 + 1;
                            m116585h = AbstractC22543l.m116585h((long) (j16 * d12), j15);
                            interfaceC18505l2 = interfaceC18505l3;
                            long j17 = j15;
                            bVar2 = bVar;
                            obj = m142578e;
                            j14 = m116585h;
                            j13 = j17;
                            if (i14 >= i13) {
                                try {
                                } catch (Exception unused) {
                                    interfaceC18505l3 = interfaceC18505l2;
                                    i16 = i14;
                                    i15 = i13;
                                    long j18 = j14;
                                    bVar = bVar2;
                                    m142578e = obj;
                                    j15 = j13;
                                    j16 = j18;
                                    AbstractC23350e.m122777g("Attempt " + i16 + " failed. Retrying in " + j16 + " ms...", new Object[0]);
                                    bVar.f14610x = interfaceC18505l3;
                                    bVar.f14605s = i15;
                                    bVar.f14607u = j15;
                                    bVar.f14609w = d12;
                                    bVar.f14606t = i16;
                                    bVar.f14608v = j16;
                                    bVar.f14612z = 2;
                                    if (DelayKt.m112666b(j16, bVar) == m142578e) {
                                        return m142578e;
                                    }
                                    i13 = i15;
                                    i14 = i16 + 1;
                                    m116585h = AbstractC22543l.m116585h((long) (j16 * d12), j15);
                                    interfaceC18505l2 = interfaceC18505l3;
                                    long j172 = j15;
                                    bVar2 = bVar;
                                    obj = m142578e;
                                    j14 = m116585h;
                                    j13 = j172;
                                    if (i14 >= i13) {
                                    }
                                }
                                bVar2.f14610x = interfaceC18505l2;
                                bVar2.f14605s = i13;
                                bVar2.f14607u = j13;
                                bVar2.f14609w = d12;
                                bVar2.f14606t = i14;
                                bVar2.f14608v = j14;
                                bVar2.f14612z = 1;
                                if (interfaceC18505l2.mo205i9(bVar2) == obj) {
                                    return obj;
                                }
                                interfaceC18505l3 = interfaceC18505l2;
                                i16 = i14;
                                i15 = i13;
                                long j19 = j14;
                                bVar = bVar2;
                                m142578e = obj;
                                j15 = j13;
                                j16 = j19;
                                return C24848g0.f119245a;
                            }
                            C26676b.m136953c(new RuntimeException("Exceeded maximum number of retries."));
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j16 = bVar.f14608v;
                    i16 = bVar.f14606t;
                    d12 = bVar.f14609w;
                    j15 = bVar.f14607u;
                    i15 = bVar.f14605s;
                    interfaceC18505l3 = (InterfaceC18505l) bVar.f14610x;
                    try {
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (CancellationException e11) {
                            throw e11;
                        }
                    } catch (Exception unused2) {
                        AbstractC23350e.m122777g("Attempt " + i16 + " failed. Retrying in " + j16 + " ms...", new Object[0]);
                        bVar.f14610x = interfaceC18505l3;
                        bVar.f14605s = i15;
                        bVar.f14607u = j15;
                        bVar.f14609w = d12;
                        bVar.f14606t = i16;
                        bVar.f14608v = j16;
                        bVar.f14612z = 2;
                        if (DelayKt.m112666b(j16, bVar) == m142578e) {
                        }
                        i13 = i15;
                        i14 = i16 + 1;
                        m116585h = AbstractC22543l.m116585h((long) (j16 * d12), j15);
                        interfaceC18505l2 = interfaceC18505l3;
                        long j1722 = j15;
                        bVar2 = bVar;
                        obj = m142578e;
                        j14 = m116585h;
                        j13 = j1722;
                        if (i14 >= i13) {
                        }
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj2);
                i13 = i11;
                j13 = j12;
                d12 = d11;
                interfaceC18505l2 = interfaceC18505l;
                bVar2 = bVar;
                obj = m142578e;
                i14 = 0;
                j14 = j11;
                if (i14 >= i13) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj22 = bVar.f14611y;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar.f14612z;
        if (i12 == 0) {
        }
    }

    /* renamed from: f */
    public static final long m17498f() {
        if (C24832c.m129124d()) {
            return System.currentTimeMillis();
        }
        return AbstractC23306f.m120579F1().mo124314i();
    }

    /* renamed from: g */
    public static final EnumC24253d m17499g(EnumC24250a enumC24250a, C17945a0 c17945a0) {
        CloudQuotaUsage m41245b;
        C26686g m110803r = C21373a.f104231a.m110803r();
        if (c17945a0.m94889F6() && !m17503k()) {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            m41245b = C23870a.m124755z0(m120679j2, null, null, 3, null);
        } else {
            C23870a m120679j22 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j22, "provideZaloCloudRepo(...)");
            m41245b = C23870a.m124718I0(m120679j22, false, null, null, 6, null).m41245b();
        }
        int i11 = a.f14604a[enumC24250a.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                return EnumC24253d.f117153p;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (c17945a0.m95089b4() != 0 && !c17945a0.m95054X6()) {
            if (c17945a0.m95022U7()) {
                return EnumC24253d.f117157t;
            }
            if (!m17501i() && c17945a0.m95238r3() > m110803r.m137053a()) {
                return EnumC24253d.f117154q;
            }
            EnumC24250a enumC24250a2 = EnumC24250a.f117141p;
            if (enumC24250a == enumC24250a2 && c17945a0.m94889F6() && AbstractC23463h.m123180h(m41245b, m17501i()) != EnumC2667d.f10680v) {
                return EnumC24253d.f117153p;
            }
            if (m41245b.m41235k()) {
                return EnumC24253d.f117155r;
            }
            if (enumC24250a == enumC24250a2) {
                return EnumC24253d.f117153p;
            }
            return EnumC24253d.f117156s;
        }
        return EnumC24253d.f117153p;
    }

    /* renamed from: h */
    private static final boolean m17500h(C17945a0 c17945a0) {
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (m17495c(mo95039W2) && c17945a0.m95162i8()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m17501i() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2461l()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m17502j() {
        if (m17501i() && C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m17503k() {
        if (m17501i() && C24252c.f117152a.m126600f(EnumC24251b.f117147r)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m17504l() {
        if (m17513u() && AbstractC23306f.m120636Y1().m128530o()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m17505m() {
        return AbstractC23306f.m120691m2().m2463n();
    }

    /* renamed from: n */
    public static final boolean m17506n() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2464o()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m17507o() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2465p()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m17508p() {
        return C22447s.f109797a.m116077t0();
    }

    /* renamed from: q */
    public static final boolean m17509q() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2466q()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m17510r() {
        if (m17509q() && !AbstractC23306f.m120636Y1().m128532q()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static final boolean m17511s() {
        if (AbstractC23306f.m120679j2().m124786P0() && !AbstractC23306f.m120655d2().m112079n()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static final boolean m17512t() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2467r()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final boolean m17513u() {
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2468s()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static final boolean m17514v() {
        if (m17513u() && m17508p()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static final boolean m17515w() {
        if (m17513u() && !m17508p()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static final C24860q m17516x(String str) {
        int m127173b0;
        int m127173b02;
        String substring;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m127173b0 = AbstractC24342w.m127173b0(str, "?e2esession=", 0, false, 6, null);
        int i11 = 1;
        if (m127173b0 != -1) {
            m127173b02 = AbstractC24342w.m127173b0(str, "&version=", 0, false, 6, null);
            if (m127173b02 != -1) {
                String substring2 = str.substring(m127173b02 + 9);
                AbstractC19074t.m100207e(substring2, "substring(...)");
                i11 = Integer.parseInt(substring2);
                substring = str.substring(m127173b0 + 12, m127173b02);
                AbstractC19074t.m100207e(substring, "substring(...)");
            } else {
                substring = str.substring(m127173b0 + 12);
                AbstractC19074t.m100207e(substring, "substring(...)");
            }
            return new C24860q(substring, Integer.valueOf(i11));
        }
        return new C24860q("", 1);
    }

    /* renamed from: y */
    public static final void m17517y(C17945a0 c17945a0, InterfaceC18494a interfaceC18494a) {
        EnumC24253d enumC24253d;
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!m17500h(c17945a0)) {
            if (m17496d(c17945a0.m95216o5(), EnumC24253d.f117153p, c17945a0, null) && interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
                return;
            }
            return;
        }
        C31831a m120687l2 = AbstractC23306f.m120687l2();
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (m120687l2.m152935p(mo95039W2) && !c17945a0.m95298x8()) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new c(c17945a0, interfaceC18494a, null), 3, null);
            return;
        }
        EnumC24253d m95216o5 = c17945a0.m95216o5();
        if (c17945a0.m95022U7()) {
            enumC24253d = EnumC24253d.f117157t;
        } else {
            enumC24253d = EnumC24253d.f117156s;
        }
        if (m17496d(m95216o5, enumC24253d, c17945a0, null) && interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }
}
