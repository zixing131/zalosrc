package k10;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DelayKt;
import p10.AbstractC24599c;
import p10.EnumC24604h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s00.AbstractC26080o;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: k10.b */
/* loaded from: classes5.dex */
public final class C21435b {

    /* renamed from: a */
    private boolean f104427a;

    /* renamed from: b */
    private int f104428b;

    /* renamed from: c */
    private final boolean f104429c;

    /* renamed from: d */
    private InterfaceC21434a f104430d;

    /* renamed from: e */
    private String f104431e;

    /* renamed from: f */
    private final C21436c f104432f;

    /* renamed from: g */
    private final C21436c f104433g;

    /* renamed from: h */
    private final C21436c f104434h;

    /* renamed from: i */
    private final C21436c f104435i;

    /* renamed from: k10.b$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f104436a;

        static {
            int[] iArr = new int[EnumC24604h.values().length];
            try {
                iArr[EnumC24604h.f118392w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24604h.f118393x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24604h.f118391v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104436a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k10.b$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f104437s;

        /* renamed from: t */
        long f104438t;

        /* renamed from: u */
        /* synthetic */ Object f104439u;

        /* renamed from: w */
        int f104441w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f104439u = obj;
            this.f104441w |= Integer.MIN_VALUE;
            return C21435b.this.m110957c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k10.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f104442t;

        /* renamed from: u */
        /* synthetic */ Object f104443u;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f104443u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104442t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = (String) this.f104443u;
                InterfaceC21434a interfaceC21434a = C21435b.this.f104430d;
                if (interfaceC21434a != null) {
                    this.f104442t = 1;
                    if (interfaceC21434a.mo103425d(str, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(String str, Continuation continuation) {
            return ((c) mo238a(str, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k10.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f104445t;

        /* renamed from: u */
        /* synthetic */ Object f104446u;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f104446u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104445t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = (String) this.f104446u;
                InterfaceC21434a interfaceC21434a = C21435b.this.f104430d;
                if (interfaceC21434a != null) {
                    this.f104445t = 1;
                    if (interfaceC21434a.mo103423b(str, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(String str, Continuation continuation) {
            return ((d) mo238a(str, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k10.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f104448t;

        /* renamed from: u */
        /* synthetic */ Object f104449u;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(continuation);
            eVar.f104449u = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104448t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = (String) this.f104449u;
                InterfaceC21434a interfaceC21434a = C21435b.this.f104430d;
                if (interfaceC21434a != null) {
                    this.f104448t = 1;
                    if (interfaceC21434a.mo103427f(str, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(String str, Continuation continuation) {
            return ((e) mo238a(str, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k10.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f104451t;

        /* renamed from: u */
        /* synthetic */ Object f104452u;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            f fVar = new f(continuation);
            fVar.f104452u = obj;
            return fVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104451t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = (String) this.f104452u;
                InterfaceC21434a interfaceC21434a = C21435b.this.f104430d;
                if (interfaceC21434a != null) {
                    this.f104451t = 1;
                    if (interfaceC21434a.mo103422a(str, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(String str, Continuation continuation) {
            return ((f) mo238a(str, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C21435b(boolean z11) {
        this.f104427a = z11;
        this.f104428b = AbstractC26080o.a.f124275b;
        this.f104429c = true;
        this.f104431e = "";
        this.f104432f = new C21436c(null, 0L, 0L, false, 15, null);
        this.f104433g = new C21436c(null, 0L, 0L, false, 15, null);
        this.f104434h = new C21436c(null, 0L, 0L, false, 15, null);
        this.f104435i = new C21436c(null, 0L, 0L, false, 15, null);
    }

    /* renamed from: b */
    public final void m110956b() {
        this.f104432f.m110972c();
        this.f104433g.m110972c();
        this.f104434h.m110972c();
        this.f104435i.m110972c();
        this.f104428b = AbstractC26080o.a.f124275b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0129 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m110957c(Continuation continuation) {
        b bVar;
        Object m142578e;
        long j11;
        C21435b c21435b;
        C21435b c21435b2;
        C21436c c21436c;
        f fVar;
        C21436c c21436c2;
        e eVar;
        C21436c c21436c3;
        d dVar;
        C21436c c21436c4;
        c cVar;
        InterfaceC21434a interfaceC21434a;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f104441w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f104441w = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f104439u;
                m142578e = AbstractC28298d.m142578e();
                switch (bVar.f104441w) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        this.f104428b = 0;
                        if (!this.f104427a) {
                            this.f104427a = true;
                            return C24848g0.f119245a;
                        }
                        j11 = 0;
                        c21435b = this;
                        if (j11 < 5000) {
                            bVar.f104437s = c21435b;
                            bVar.f104438t = j11;
                            bVar.f104441w = 1;
                            if (DelayKt.m112666b(1000L, bVar) == m142578e) {
                                return m142578e;
                            }
                            c21435b2 = c21435b;
                            interfaceC21434a = c21435b2.f104430d;
                            if (interfaceC21434a != null) {
                                bVar.f104437s = c21435b2;
                                bVar.f104438t = j11;
                                bVar.f104441w = 2;
                                if (interfaceC21434a.mo103424c(bVar) == m142578e) {
                                    return m142578e;
                                }
                            }
                            if (c21435b2.f104429c) {
                                int i12 = c21435b2.f104428b + 1000;
                                c21435b2.f104428b = i12;
                                if (i12 >= 5000) {
                                    c21435b2.f104428b = 0;
                                    InterfaceC21434a interfaceC21434a2 = c21435b2.f104430d;
                                    if (interfaceC21434a2 != null) {
                                        String str = c21435b2.f104431e;
                                        bVar.f104437s = c21435b2;
                                        bVar.f104438t = j11;
                                        bVar.f104441w = 3;
                                        if (interfaceC21434a2.mo103428g(str, bVar) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                }
                            }
                            c21436c4 = c21435b2.f104432f;
                            cVar = new c(null);
                            bVar.f104437s = c21435b2;
                            bVar.f104438t = j11;
                            bVar.f104441w = 4;
                            if (c21436c4.m110978i(cVar, bVar) == m142578e) {
                                return m142578e;
                            }
                            c21436c3 = c21435b2.f104433g;
                            dVar = new d(null);
                            bVar.f104437s = c21435b2;
                            bVar.f104438t = j11;
                            bVar.f104441w = 5;
                            if (c21436c3.m110978i(dVar, bVar) == m142578e) {
                                return m142578e;
                            }
                            c21436c2 = c21435b2.f104434h;
                            eVar = new e(null);
                            bVar.f104437s = c21435b2;
                            bVar.f104438t = j11;
                            bVar.f104441w = 6;
                            if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                                return m142578e;
                            }
                            c21436c = c21435b2.f104435i;
                            fVar = new f(null);
                            bVar.f104437s = c21435b2;
                            bVar.f104438t = j11;
                            bVar.f104441w = 7;
                            if (c21436c.m110978i(fVar, bVar) == m142578e) {
                                return m142578e;
                            }
                            c21435b = c21435b2;
                            j11 += 1000;
                            if (j11 < 5000) {
                                return C24848g0.f119245a;
                            }
                        }
                    case 1:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        interfaceC21434a = c21435b2.f104430d;
                        if (interfaceC21434a != null) {
                        }
                        if (c21435b2.f104429c) {
                        }
                        c21436c4 = c21435b2.f104432f;
                        cVar = new c(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 4;
                        if (c21436c4.m110978i(cVar, bVar) == m142578e) {
                        }
                        c21436c3 = c21435b2.f104433g;
                        dVar = new d(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 5;
                        if (c21436c3.m110978i(dVar, bVar) == m142578e) {
                        }
                        c21436c2 = c21435b2.f104434h;
                        eVar = new e(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 6;
                        if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                        }
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 2:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        if (c21435b2.f104429c) {
                        }
                        c21436c4 = c21435b2.f104432f;
                        cVar = new c(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 4;
                        if (c21436c4.m110978i(cVar, bVar) == m142578e) {
                        }
                        c21436c3 = c21435b2.f104433g;
                        dVar = new d(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 5;
                        if (c21436c3.m110978i(dVar, bVar) == m142578e) {
                        }
                        c21436c2 = c21435b2.f104434h;
                        eVar = new e(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 6;
                        if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                        }
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 3:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        c21436c4 = c21435b2.f104432f;
                        cVar = new c(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 4;
                        if (c21436c4.m110978i(cVar, bVar) == m142578e) {
                        }
                        c21436c3 = c21435b2.f104433g;
                        dVar = new d(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 5;
                        if (c21436c3.m110978i(dVar, bVar) == m142578e) {
                        }
                        c21436c2 = c21435b2.f104434h;
                        eVar = new e(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 6;
                        if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                        }
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 4:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        c21436c3 = c21435b2.f104433g;
                        dVar = new d(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 5;
                        if (c21436c3.m110978i(dVar, bVar) == m142578e) {
                        }
                        c21436c2 = c21435b2.f104434h;
                        eVar = new e(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 6;
                        if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                        }
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 5:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        c21436c2 = c21435b2.f104434h;
                        eVar = new e(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 6;
                        if (c21436c2.m110978i(eVar, bVar) == m142578e) {
                        }
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 6:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        c21436c = c21435b2.f104435i;
                        fVar = new f(null);
                        bVar.f104437s = c21435b2;
                        bVar.f104438t = j11;
                        bVar.f104441w = 7;
                        if (c21436c.m110978i(fVar, bVar) == m142578e) {
                        }
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    case 7:
                        j11 = bVar.f104438t;
                        c21435b2 = (C21435b) bVar.f104437s;
                        AbstractC24862s.m129228b(obj);
                        c21435b = c21435b2;
                        j11 += 1000;
                        if (j11 < 5000) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f104439u;
        m142578e = AbstractC28298d.m142578e();
        switch (bVar.f104441w) {
        }
    }

    /* renamed from: d */
    public final boolean m110958d() {
        if (this.f104432f.m110970a() && this.f104433g.m110970a() && this.f104434h.m110970a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m110959e(AbstractC24599c abstractC24599c) {
        AbstractC19074t.m100208f(abstractC24599c, "event");
        int i11 = a.f104436a[abstractC24599c.m128088a().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f104434h.m110971b();
                    return;
                }
                return;
            }
            this.f104432f.m110971b();
            return;
        }
        this.f104433g.m110971b();
    }

    /* renamed from: f */
    public final void m110960f(InterfaceC21434a interfaceC21434a) {
        AbstractC19074t.m100208f(interfaceC21434a, "listener");
        this.f104430d = interfaceC21434a;
    }

    /* renamed from: g */
    public final void m110961g(String str, long j11) {
        if (str != null && j11 > 0) {
            this.f104434h.m110973d(true);
            this.f104434h.m110976g(str);
            this.f104434h.m110974e(0L);
            this.f104434h.m110975f(j11);
        }
    }

    /* renamed from: h */
    public final void m110962h(String str, long j11) {
        if (str != null && j11 > 0) {
            this.f104433g.m110973d(true);
            this.f104433g.m110976g(str);
            this.f104433g.m110974e(0L);
            this.f104433g.m110975f(j11);
        }
    }

    /* renamed from: i */
    public final void m110963i(String str, long j11) {
        if (str != null && j11 > 0) {
            this.f104435i.m110973d(true);
            this.f104435i.m110976g(str);
            this.f104435i.m110974e(0L);
            this.f104435i.m110975f(j11);
        }
    }

    /* renamed from: j */
    public final void m110964j(String str, long j11) {
        if (str != null && j11 > 0) {
            this.f104432f.m110973d(true);
            this.f104432f.m110976g(str);
            this.f104432f.m110974e(0L);
            this.f104432f.m110975f(j11);
        }
    }

    /* renamed from: k */
    public final void m110965k() {
        this.f104435i.m110977h();
    }

    public /* synthetic */ C21435b(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
