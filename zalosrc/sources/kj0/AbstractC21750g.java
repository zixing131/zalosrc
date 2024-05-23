package kj0;

import com.android.billingclient.api.C3918k;
import fn0.AbstractC19074t;
import kj0.InterfaceC21747d;
import kotlin.coroutines.Continuation;
import lj0.AbstractC22500a;
import lj0.C22501b;
import pm0.AbstractC24862s;
import pm0.C24860q;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;

/* renamed from: kj0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC21750g {

    /* renamed from: kj0.g$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC21747d.a {

        /* renamed from: a */
        final /* synthetic */ Continuation f105613a;

        a(Continuation continuation) {
            this.f105613a = continuation;
        }

        @Override // kj0.InterfaceC21747d.a
        /* renamed from: a */
        public void mo112194a(C3918k c3918k) {
            AbstractC19074t.m100208f(c3918k, "br");
            Continuation continuation = this.f105613a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new C24860q(c3918k, null)));
        }

        @Override // kj0.InterfaceC21747d.a
        public void onSuccess(Object obj) {
            Continuation continuation = this.f105613a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new C24860q(AbstractC22500a.m116343c(0, null, 2, null), obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj0.g$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: A */
        long f105614A;

        /* renamed from: B */
        /* synthetic */ Object f105615B;

        /* renamed from: C */
        int f105616C;

        /* renamed from: s */
        Object f105617s;

        /* renamed from: t */
        Object f105618t;

        /* renamed from: u */
        Object f105619u;

        /* renamed from: v */
        Object f105620v;

        /* renamed from: w */
        Object f105621w;

        /* renamed from: x */
        int f105622x;

        /* renamed from: y */
        int f105623y;

        /* renamed from: z */
        int f105624z;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f105615B = obj;
            this.f105616C |= Integer.MIN_VALUE;
            return AbstractC21750g.m112197c(null, null, null, 0, 0L, null, this);
        }
    }

    /* renamed from: a */
    private static final Object m112195a(InterfaceC21747d interfaceC21747d, long j11, C22501b c22501b, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        try {
            interfaceC21747d.mo112193b(new a(c27317h));
        } catch (Throwable th2) {
            c22501b.mo104552e(th2);
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(new C24860q(AbstractC22500a.m116342b(6, th2.toString()), null)));
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: b */
    static /* synthetic */ Object m112196b(InterfaceC21747d interfaceC21747d, long j11, C22501b c22501b, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        return m112195a(interfaceC21747d, j11, c22501b, continuation);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0132. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0151. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0102 -> B:11:0x0111). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m112197c(InterfaceC21747d interfaceC21747d, InterfaceC21747d interfaceC21747d2, InterfaceC21747d.a aVar, int i11, long j11, C22501b c22501b, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        InterfaceC21747d interfaceC21747d3;
        long j12;
        C22501b c22501b2;
        b bVar2;
        Object obj;
        Object obj2;
        C3918k c3918k;
        int i13;
        int i14;
        InterfaceC21747d interfaceC21747d4;
        int i15;
        InterfaceC21747d interfaceC21747d5;
        int i16;
        C24860q c24860q;
        b bVar3;
        long j13;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i17 = bVar.f105616C;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                bVar.f105616C = i17 - Integer.MIN_VALUE;
                Object obj3 = bVar.f105615B;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar.f105616C;
                int i18 = 1;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int i19 = bVar.f105624z;
                            int i21 = bVar.f105623y;
                            long j14 = bVar.f105614A;
                            int i22 = bVar.f105622x;
                            Object obj4 = bVar.f105621w;
                            C3918k c3918k2 = (C3918k) bVar.f105620v;
                            C22501b c22501b3 = (C22501b) bVar.f105619u;
                            InterfaceC21747d interfaceC21747d6 = (InterfaceC21747d) bVar.f105618t;
                            InterfaceC21747d interfaceC21747d7 = (InterfaceC21747d) bVar.f105617s;
                            AbstractC24862s.m129228b(obj3);
                            c24860q = (C24860q) obj3;
                            bVar3 = bVar;
                            j13 = j14;
                            obj2 = obj4;
                            c3918k = c3918k2;
                            interfaceC21747d4 = interfaceC21747d6;
                            obj = m142578e;
                            i14 = i19;
                            interfaceC21747d5 = interfaceC21747d7;
                            i16 = i21;
                            i15 = i22;
                            c22501b2 = c22501b3;
                            C3918k c3918k3 = (C3918k) c24860q.m129213a();
                            Object m129214b = c24860q.m129214b();
                            if (i14 != 0) {
                                int m18652b = c3918k3.m18652b();
                                if (m18652b != 12) {
                                    switch (m18652b) {
                                        case -2:
                                        case 1:
                                        case 3:
                                        case 4:
                                        case 5:
                                            if (obj2 != null) {
                                            }
                                            break;
                                        case -1:
                                            i13 = i16 + 1;
                                            bVar2 = bVar3;
                                            interfaceC21747d3 = interfaceC21747d5;
                                            j12 = j13;
                                            i18 = 1;
                                            break;
                                        case 0:
                                        case 2:
                                        case 6:
                                            break;
                                        case 7:
                                        case 8:
                                            i16++;
                                        default:
                                            i13 = i16;
                                            bVar2 = bVar3;
                                            interfaceC21747d3 = interfaceC21747d5;
                                            j12 = j13;
                                            i18 = 1;
                                            break;
                                    }
                                }
                                i13 = i16 + 1;
                                bVar2 = bVar3;
                                interfaceC21747d3 = interfaceC21747d5;
                                i14 = 0;
                                j12 = j13;
                                i18 = 1;
                            } else {
                                int m18652b2 = c3918k3.m18652b();
                                if (m18652b2 != 12) {
                                    switch (m18652b2) {
                                        case -2:
                                        case 0:
                                        case 1:
                                        case 3:
                                        case 4:
                                        case 5:
                                            obj2 = m129214b;
                                            c3918k = c3918k3;
                                            if (obj2 != null) {
                                                return new C24860q(AbstractC22500a.m116343c(0, null, 2, null), obj2);
                                            }
                                            if (c3918k == null) {
                                                c3918k = AbstractC22500a.m116342b(-1, "");
                                            }
                                            return new C24860q(c3918k, null);
                                        case -1:
                                            i13 = i16 + 1;
                                            obj2 = m129214b;
                                            bVar2 = bVar3;
                                            c3918k = c3918k3;
                                            interfaceC21747d3 = interfaceC21747d5;
                                            i14 = 1;
                                            j12 = j13;
                                            i18 = 1;
                                            break;
                                        case 2:
                                        case 6:
                                            break;
                                        case 7:
                                        case 8:
                                            i16++;
                                        default:
                                            i13 = i16;
                                            obj2 = m129214b;
                                            bVar2 = bVar3;
                                            c3918k = c3918k3;
                                            interfaceC21747d3 = interfaceC21747d5;
                                            j12 = j13;
                                            i18 = 1;
                                            break;
                                    }
                                }
                                i13 = i16 + 1;
                                obj2 = m129214b;
                                bVar2 = bVar3;
                                c3918k = c3918k3;
                                interfaceC21747d3 = interfaceC21747d5;
                                j12 = j13;
                                i18 = 1;
                            }
                            if (i13 < i15) {
                                if (i14 != 0) {
                                    bVar2.f105617s = interfaceC21747d3;
                                    bVar2.f105618t = interfaceC21747d4;
                                    bVar2.f105619u = c22501b2;
                                    bVar2.f105620v = c3918k;
                                    bVar2.f105621w = obj2;
                                    bVar2.f105622x = i15;
                                    bVar2.f105614A = j12;
                                    bVar2.f105623y = i13;
                                    bVar2.f105624z = i14;
                                    bVar2.f105616C = i18;
                                    Object obj5 = obj2;
                                    C3918k c3918k4 = c3918k;
                                    int i23 = i13;
                                    int i24 = i14;
                                    Object obj6 = obj;
                                    long j15 = j12;
                                    Object m112196b = m112196b(interfaceC21747d4, 0L, c22501b2, bVar2, 2, null);
                                    if (m112196b == obj6) {
                                        return obj6;
                                    }
                                    interfaceC21747d5 = interfaceC21747d3;
                                    InterfaceC21747d interfaceC21747d8 = interfaceC21747d4;
                                    b bVar4 = bVar2;
                                    i16 = i23;
                                    c24860q = (C24860q) m112196b;
                                    bVar3 = bVar4;
                                    j13 = j15;
                                    obj2 = obj5;
                                    interfaceC21747d4 = interfaceC21747d8;
                                    obj = obj6;
                                    i15 = i15;
                                    c3918k = c3918k4;
                                    i14 = i24;
                                    c22501b2 = c22501b2;
                                    C3918k c3918k32 = (C3918k) c24860q.m129213a();
                                    Object m129214b2 = c24860q.m129214b();
                                    if (i14 != 0) {
                                    }
                                    if (i13 < i15) {
                                    }
                                } else {
                                    Object obj7 = obj2;
                                    C3918k c3918k5 = c3918k;
                                    int i25 = i13;
                                    int i26 = i14;
                                    Object obj8 = obj;
                                    long j16 = j12;
                                    bVar2.f105617s = interfaceC21747d3;
                                    bVar2.f105618t = interfaceC21747d4;
                                    bVar2.f105619u = c22501b2;
                                    bVar2.f105620v = c3918k5;
                                    bVar2.f105621w = obj7;
                                    bVar2.f105622x = i15;
                                    bVar2.f105614A = j16;
                                    bVar2.f105623y = i25;
                                    bVar2.f105624z = i26;
                                    bVar2.f105616C = 2;
                                    Object m112195a = m112195a(interfaceC21747d3, j16, c22501b2, bVar2);
                                    if (m112195a == obj8) {
                                        return obj8;
                                    }
                                    interfaceC21747d6 = interfaceC21747d4;
                                    c22501b3 = c22501b2;
                                    bVar = bVar2;
                                    c3918k2 = c3918k5;
                                    i19 = i26;
                                    interfaceC21747d7 = interfaceC21747d3;
                                    i21 = i25;
                                    obj3 = m112195a;
                                    obj4 = obj7;
                                    i22 = i15;
                                    m142578e = obj8;
                                    j14 = j16;
                                    c24860q = (C24860q) obj3;
                                    bVar3 = bVar;
                                    j13 = j14;
                                    obj2 = obj4;
                                    c3918k = c3918k2;
                                    interfaceC21747d4 = interfaceC21747d6;
                                    obj = m142578e;
                                    i14 = i19;
                                    interfaceC21747d5 = interfaceC21747d7;
                                    i16 = i21;
                                    i15 = i22;
                                    c22501b2 = c22501b3;
                                    C3918k c3918k322 = (C3918k) c24860q.m129213a();
                                    Object m129214b22 = c24860q.m129214b();
                                    if (i14 != 0) {
                                    }
                                    if (i13 < i15) {
                                    }
                                }
                            } else if (obj2 != null) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        int i27 = bVar.f105624z;
                        i16 = bVar.f105623y;
                        long j17 = bVar.f105614A;
                        int i28 = bVar.f105622x;
                        Object obj9 = bVar.f105621w;
                        C3918k c3918k6 = (C3918k) bVar.f105620v;
                        C22501b c22501b4 = (C22501b) bVar.f105619u;
                        InterfaceC21747d interfaceC21747d9 = (InterfaceC21747d) bVar.f105618t;
                        interfaceC21747d5 = (InterfaceC21747d) bVar.f105617s;
                        AbstractC24862s.m129228b(obj3);
                        c24860q = (C24860q) obj3;
                        bVar3 = bVar;
                        j13 = j17;
                        obj2 = obj9;
                        interfaceC21747d4 = interfaceC21747d9;
                        obj = m142578e;
                        i15 = i28;
                        c3918k = c3918k6;
                        i14 = i27;
                        c22501b2 = c22501b4;
                        C3918k c3918k3222 = (C3918k) c24860q.m129213a();
                        Object m129214b222 = c24860q.m129214b();
                        if (i14 != 0) {
                        }
                        if (i13 < i15) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj3);
                    interfaceC21747d3 = interfaceC21747d;
                    j12 = j11;
                    c22501b2 = c22501b;
                    bVar2 = bVar;
                    obj = m142578e;
                    obj2 = null;
                    c3918k = null;
                    i13 = 1;
                    i14 = 0;
                    interfaceC21747d4 = interfaceC21747d2;
                    i15 = i11;
                    if (i13 < i15) {
                    }
                }
            }
        }
        bVar = new b(continuation);
        Object obj32 = bVar.f105615B;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar.f105616C;
        int i182 = 1;
        if (i12 == 0) {
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Object m112198d(InterfaceC21747d interfaceC21747d, InterfaceC21747d interfaceC21747d2, InterfaceC21747d.a aVar, int i11, long j11, C22501b c22501b, Continuation continuation, int i12, Object obj) {
        InterfaceC21747d.a aVar2;
        int i13;
        long j12;
        if ((i12 & 4) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i12 & 8) != 0) {
            i13 = 3;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            j12 = 1000;
        } else {
            j12 = j11;
        }
        return m112197c(interfaceC21747d, interfaceC21747d2, aVar2, i13, j12, c22501b, continuation);
    }
}
