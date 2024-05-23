package ug0;

import am.AbstractC0924m0;
import bn0.AbstractC2933b;
import ch0.AbstractC3488c;
import com.zing.zalo.zalocloud.backup.GetBackupMetadataException;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import lg0.C22479c;
import p056cj.AbstractC3536d;
import p239ih.C20556f;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p487rl.C25823d;
import p487rl.EnumC25825f;
import p613wl.AbstractC29087c;
import p698yz.AbstractC31111g;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import sg0.C26245a;
import si.C26263i;
import th.AbstractC26687h;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zg0.C31831a;

/* renamed from: ug0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC27254i {

    /* renamed from: a */
    private static final InterfaceC24854k f128096a;

    /* renamed from: b */
    private static final InterfaceC18505l f128097b;

    /* renamed from: ug0.i$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f128098s;

        /* renamed from: t */
        Object f128099t;

        /* renamed from: u */
        boolean f128100u;

        /* renamed from: v */
        /* synthetic */ Object f128101v;

        /* renamed from: w */
        int f128102w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128101v = obj;
            this.f128102w |= Integer.MIN_VALUE;
            return AbstractC27254i.m139450b(null, false, false, null, this);
        }
    }

    /* renamed from: ug0.i$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f128103q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C17945a0 c17945a0) {
            boolean z11;
            AbstractC19074t.m100208f(c17945a0, "it");
            if (!AbstractC29087c.m145334b(c17945a0) && C31831a.Companion.m152940a().m152936s(c17945a0) && c17945a0.m95072Z4() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: ug0.i$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f128104s;

        /* renamed from: t */
        int f128105t;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128104s = obj;
            this.f128105t |= Integer.MIN_VALUE;
            return AbstractC27254i.m139453e(null, null, false, this);
        }
    }

    /* renamed from: ug0.i$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f128106q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22479c mo12V4() {
            return AbstractC23306f.m120637Z();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(d.f128106q);
        f128096a = m129210a;
        f128097b = b.f128103q;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m139450b(C17945a0 c17945a0, boolean z11, boolean z12, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        Object m129218b;
        boolean z13;
        String str;
        EnumC25825f enumC25825f;
        String m94983Q3;
        String str2;
        String str3;
        C20556f c20556f;
        Object obj;
        String str4;
        C17990p0 c17990p0;
        C17945a0 c17945a02 = c17945a0;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f128102w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f128102w = i12 - Integer.MIN_VALUE;
                Object obj2 = aVar.f128101v;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f128102w;
                Object obj3 = null;
                if (i11 == 0) {
                    if (i11 == 1) {
                        boolean z14 = aVar.f128100u;
                        String str5 = (String) aVar.f128099t;
                        C17945a0 c17945a03 = (C17945a0) aVar.f128098s;
                        AbstractC24862s.m129228b(obj2);
                        z13 = z14;
                        c17945a02 = c17945a03;
                        str = str5;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    if (!((Boolean) interfaceC18505l.mo205i9(c17945a02)).booleanValue()) {
                        return null;
                    }
                    try {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(c17945a0.m95293x2());
                    } catch (Throwable th2) {
                        C24861r.a aVar3 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    }
                    if (C24861r.m129223g(m129218b)) {
                        m129218b = null;
                    }
                    String str6 = (String) m129218b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    aVar.f128098s = c17945a02;
                    aVar.f128099t = str6;
                    z13 = z12;
                    aVar.f128100u = z13;
                    aVar.f128102w = 1;
                    Object m139453e = m139453e(c17945a02, str6, z11, aVar);
                    if (m139453e == m142578e) {
                        return m142578e;
                    }
                    str = str6;
                    obj2 = m139453e;
                }
                enumC25825f = (EnumC25825f) obj2;
                if (enumC25825f != null || (enumC25825f == EnumC25825f.f123211t && !z13)) {
                    return null;
                }
                if (c17945a02.m95306y8()) {
                    m94983Q3 = c17945a02.m95177k5();
                } else {
                    m94983Q3 = c17945a02.m94983Q3();
                }
                String str7 = m94983Q3;
                if (c17945a02.m95276v6()) {
                    C17969i0 m94929K2 = c17945a02.m94929K2();
                    if (m94929K2 instanceof C17990p0) {
                        c17990p0 = (C17990p0) m94929K2;
                    } else {
                        c17990p0 = null;
                    }
                    if (c17990p0 != null) {
                        str2 = c17990p0.f91114C;
                        if (str2 == null && (enumC25825f == EnumC25825f.f123208q || enumC25825f == EnumC25825f.f123209r)) {
                            c20556f = new C20556f(str7);
                            if (c20556f.m106830b()) {
                                try {
                                    C24861r.a aVar4 = C24861r.f119264q;
                                    InputStream m106838k = c20556f.m106838k();
                                    if (m106838k != null) {
                                        try {
                                            str4 = C26245a.m134940o(C26245a.f124654a, m106838k, 0, 2, null);
                                            AbstractC2933b.m13890a(m106838k, null);
                                        } finally {
                                        }
                                    } else {
                                        str4 = null;
                                    }
                                    obj = C24861r.m129218b(str4);
                                } catch (Throwable th3) {
                                    C24861r.a aVar5 = C24861r.f119264q;
                                    obj = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                                }
                                if (!C24861r.m129223g(obj)) {
                                    obj3 = obj;
                                }
                                str3 = (String) obj3;
                                String m41043D = c17945a02.m95029V3().m41043D();
                                String mo95039W2 = c17945a02.mo95039W2();
                                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                                AbstractC19074t.m100205c(str7);
                                return new C25823d(m41043D, mo95039W2, str7, str, c17945a02.m94974P4(), enumC25825f, c17945a02.m95041W4(), c17945a02.m95170j6(), c17945a02.m94847A6(), c17945a02.m95072Z4(), null, AbstractC3536d.m17981c(c17945a02), str3, AbstractC3488c.m17483f(c17945a02), 1024, null);
                            }
                        }
                        str3 = str2;
                        String m41043D2 = c17945a02.m95029V3().m41043D();
                        String mo95039W22 = c17945a02.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                        AbstractC19074t.m100205c(str7);
                        return new C25823d(m41043D2, mo95039W22, str7, str, c17945a02.m94974P4(), enumC25825f, c17945a02.m95041W4(), c17945a02.m95170j6(), c17945a02.m94847A6(), c17945a02.m95072Z4(), null, AbstractC3536d.m17981c(c17945a02), str3, AbstractC3488c.m17483f(c17945a02), 1024, null);
                    }
                }
                str2 = null;
                if (str2 == null) {
                    c20556f = new C20556f(str7);
                    if (c20556f.m106830b()) {
                    }
                }
                str3 = str2;
                String m41043D22 = c17945a02.m95029V3().m41043D();
                String mo95039W222 = c17945a02.mo95039W2();
                AbstractC19074t.m100207e(mo95039W222, "getOwnerId(...)");
                AbstractC19074t.m100205c(str7);
                return new C25823d(m41043D22, mo95039W222, str7, str, c17945a02.m94974P4(), enumC25825f, c17945a02.m95041W4(), c17945a02.m95170j6(), c17945a02.m94847A6(), c17945a02.m95072Z4(), null, AbstractC3536d.m17981c(c17945a02), str3, AbstractC3488c.m17483f(c17945a02), 1024, null);
            }
        }
        aVar = new a(continuation);
        Object obj22 = aVar.f128101v;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f128102w;
        Object obj32 = null;
        if (i11 == 0) {
        }
        enumC25825f = (EnumC25825f) obj22;
        if (enumC25825f != null) {
        }
        return null;
    }

    /* renamed from: c */
    public static final Object m139451c(C17945a0 c17945a0, boolean z11, boolean z12, Continuation continuation) {
        return m139450b(c17945a0, z11, z12, f128097b, continuation);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m139452d(C17945a0 c17945a0, boolean z11, boolean z12, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return m139451c(c17945a0, z11, z12, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:12:0x0073, B:35:0x0064), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m139453e(C17945a0 c17945a0, String str, boolean z11, Continuation continuation) {
        c cVar;
        Object obj;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i12 = cVar.f128105t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    cVar.f128105t = i12 - Integer.MIN_VALUE;
                    obj = cVar.f128104s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = cVar.f128105t;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (!m139455g(c17945a0) && str != null && str.length() != 0) {
                            return EnumC25825f.f123208q;
                        }
                        if (c17945a0.m95240r6()) {
                            return EnumC25825f.f123209r;
                        }
                        if (!c17945a0.m94871D7() || !C22447s.m116057s(C26263i.m135058w())) {
                            return null;
                        }
                        if (!z11) {
                            C22479c m139454f = m139454f();
                            cVar.f128105t = 1;
                            obj = m139454f.m116232d(c17945a0, cVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                        } else {
                            return EnumC25825f.f123211t;
                        }
                    }
                    if (obj != null) {
                        return null;
                    }
                    return EnumC25825f.f123210s;
                }
            }
            if (i11 == 0) {
            }
            if (obj != null) {
            }
        } catch (Exception e11) {
            if ((e11 instanceof GetBackupMetadataException) && AbstractC27253h.m139446k((GetBackupMetadataException) e11)) {
                return EnumC25825f.f123211t;
            }
            throw e11;
        }
        cVar = new c(continuation);
        obj = cVar.f128104s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f128105t;
    }

    /* renamed from: f */
    private static final C22479c m139454f() {
        return (C22479c) f128096a.getValue();
    }

    /* renamed from: g */
    public static final boolean m139455g(C17945a0 c17945a0) {
        C17990p0 c17990p0;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        long m89769e = AbstractC23306f.m120633X1().m89801i().m89769e() * 86400000;
        long m151129j = AbstractC31111g.m151129j() * 86400000;
        if (c17945a0.m95276v6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17990p0) {
                c17990p0 = (C17990p0) m94929K2;
            } else {
                c17990p0 = null;
            }
            if (c17990p0 == null) {
                return false;
            }
            long j11 = c17990p0.f91113B;
            if (AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
                if (AbstractC26687h.m137065f(c17945a0.mo95039W2(), j11) && mo124314i - c17945a0.m94974P4() >= AbstractC31111g.m151128i()) {
                    return true;
                }
                return false;
            }
            if (j11 >= AbstractC0924m0.m3152J()) {
                if (mo124314i - c17945a0.m94974P4() >= m151129j) {
                    return true;
                }
            } else if (mo124314i - c17945a0.m94974P4() >= m89769e) {
                return true;
            }
        } else if ((c17945a0.m94871D7() || c17945a0.m95120e6() || c17945a0.m95306y8() || c17945a0.m95316z8()) && !AbstractC25495a.m132078c(c17945a0.mo95039W2()) && mo124314i - c17945a0.m94974P4() >= m89769e) {
            return true;
        }
        return false;
    }
}
