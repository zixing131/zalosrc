package p726zr;

import com.zing.zalo.control.TrackingSource;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24861r;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: zr.e */
/* loaded from: classes4.dex */
public final class C32549e {

    /* renamed from: a */
    public static final C32549e f150403a = new C32549e();

    /* renamed from: b */
    private static final C32545a f150404b = new C32545a();

    /* renamed from: c */
    private static final Set f150405c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zr.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f150406s;

        /* renamed from: t */
        Object f150407t;

        /* renamed from: u */
        /* synthetic */ Object f150408u;

        /* renamed from: w */
        int f150410w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f150408u = obj;
            this.f150410w |= Integer.MIN_VALUE;
            return C32549e.this.m157617c(null, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zr.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f150411s;

        /* renamed from: t */
        Object f150412t;

        /* renamed from: u */
        /* synthetic */ Object f150413u;

        /* renamed from: w */
        int f150415w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f150413u = obj;
            this.f150415w |= Integer.MIN_VALUE;
            return C32549e.this.m157618d(null, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zr.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f150416s;

        /* renamed from: t */
        Object f150417t;

        /* renamed from: u */
        /* synthetic */ Object f150418u;

        /* renamed from: w */
        int f150420w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f150418u = obj;
            this.f150420w |= Integer.MIN_VALUE;
            return C32549e.this.m157619f(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zr.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f150421s;

        /* renamed from: t */
        Object f150422t;

        /* renamed from: u */
        /* synthetic */ Object f150423u;

        /* renamed from: w */
        int f150425w;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f150423u = obj;
            this.f150425w |= Integer.MIN_VALUE;
            return C32549e.this.m157620g(null, null, this);
        }
    }

    static {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        f150405c = synchronizedSet;
    }

    private C32549e() {
    }

    /* renamed from: b */
    private final void m157614b(String str) {
        Set set = f150405c;
        synchronized (set) {
            set.add(str);
        }
    }

    /* renamed from: e */
    private final void m157615e(String str) {
        Set set = f150405c;
        synchronized (set) {
            set.remove(str);
        }
    }

    /* renamed from: a */
    public final boolean m157616a(String str) {
        boolean contains;
        AbstractC19074t.m100208f(str, "id");
        Set set = f150405c;
        synchronized (set) {
            contains = set.contains(str);
        }
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m157617c(String str, int i11, TrackingSource trackingSource, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i12;
        String str2;
        Throwable th2;
        C32549e c32549e;
        Throwable m129221e;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f150410w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f150410w = i13 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.f150408u;
                m142578e = AbstractC28298d.m142578e();
                i12 = aVar2.f150410w;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c32549e = (C32549e) aVar2.f150407t;
                        str2 = (String) aVar2.f150406s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar3 = C24861r.f119264q;
                            m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                            if (m129221e != null) {
                                return AbstractC29094b.m145339a(false);
                            }
                            f150403a.m157615e(str2);
                            throw m129221e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        C24861r.a aVar4 = C24861r.f119264q;
                        m157614b(str);
                        C32545a c32545a = f150404b;
                        aVar2.f150406s = str;
                        aVar2.f150407t = this;
                        aVar2.f150410w = 1;
                        obj = c32545a.m157603a(str, true, i11, trackingSource, aVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        str2 = str;
                        c32549e = this;
                    } catch (Throwable th4) {
                        str2 = str;
                        th2 = th4;
                        C24861r.a aVar32 = C24861r.f119264q;
                        m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                        if (m129221e != null) {
                        }
                    }
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c32549e.m157615e(str2);
                return AbstractC29094b.m145339a(booleanValue);
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.f150408u;
        m142578e = AbstractC28298d.m142578e();
        i12 = aVar22.f150410w;
        if (i12 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        c32549e.m157615e(str2);
        return AbstractC29094b.m145339a(booleanValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m157618d(String str, int i11, TrackingSource trackingSource, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        String str2;
        Throwable th2;
        C32549e c32549e;
        Throwable m129221e;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f150415w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f150415w = i13 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f150413u;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar2.f150415w;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c32549e = (C32549e) bVar2.f150412t;
                        str2 = (String) bVar2.f150411s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar = C24861r.f119264q;
                            m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                            if (m129221e != null) {
                                return AbstractC29094b.m145339a(false);
                            }
                            f150403a.m157615e(str2);
                            throw m129221e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m157614b(str);
                        C32545a c32545a = f150404b;
                        bVar2.f150411s = str;
                        bVar2.f150412t = this;
                        bVar2.f150415w = 1;
                        obj = c32545a.m157604b(str, true, i11, trackingSource, bVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        str2 = str;
                        c32549e = this;
                    } catch (Throwable th4) {
                        str2 = str;
                        th2 = th4;
                        C24861r.a aVar3 = C24861r.f119264q;
                        m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                        if (m129221e != null) {
                        }
                    }
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c32549e.m157615e(str2);
                return AbstractC29094b.m145339a(booleanValue);
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f150413u;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar22.f150415w;
        if (i12 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        c32549e.m157615e(str2);
        return AbstractC29094b.m145339a(booleanValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m157619f(String str, TrackingSource trackingSource, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        String str2;
        Throwable th2;
        C32549e c32549e;
        Throwable m129221e;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f150420w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f150420w = i12 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.f150418u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar2.f150420w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c32549e = (C32549e) cVar2.f150417t;
                        str2 = (String) cVar2.f150416s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar = C24861r.f119264q;
                            m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                            if (m129221e != null) {
                                return AbstractC29094b.m145339a(false);
                            }
                            f150403a.m157615e(str2);
                            throw m129221e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m157614b(str);
                        C32545a c32545a = f150404b;
                        cVar2.f150416s = str;
                        cVar2.f150417t = this;
                        cVar2.f150420w = 1;
                        obj = c32545a.m157603a(str, false, 0, trackingSource, cVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        str2 = str;
                        c32549e = this;
                    } catch (Throwable th4) {
                        str2 = str;
                        th2 = th4;
                        C24861r.a aVar3 = C24861r.f119264q;
                        m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                        if (m129221e != null) {
                        }
                    }
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c32549e.m157615e(str2);
                return AbstractC29094b.m145339a(booleanValue);
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.f150418u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar22.f150420w;
        if (i11 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        c32549e.m157615e(str2);
        return AbstractC29094b.m145339a(booleanValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m157620g(String str, TrackingSource trackingSource, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        String str2;
        Throwable th2;
        C32549e c32549e;
        Throwable m129221e;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f150425w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f150425w = i12 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f150423u;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar2.f150425w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c32549e = (C32549e) dVar2.f150422t;
                        str2 = (String) dVar2.f150421s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar = C24861r.f119264q;
                            m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                            if (m129221e != null) {
                                return AbstractC29094b.m145339a(false);
                            }
                            f150403a.m157615e(str2);
                            throw m129221e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        C24861r.a aVar2 = C24861r.f119264q;
                        m157614b(str);
                        C32545a c32545a = f150404b;
                        dVar2.f150421s = str;
                        dVar2.f150422t = this;
                        dVar2.f150425w = 1;
                        obj = c32545a.m157604b(str, false, 0, trackingSource, dVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        str2 = str;
                        c32549e = this;
                    } catch (Throwable th4) {
                        str2 = str;
                        th2 = th4;
                        C24861r.a aVar3 = C24861r.f119264q;
                        m129221e = C24861r.m129221e(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
                        if (m129221e != null) {
                        }
                    }
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c32549e.m157615e(str2);
                return AbstractC29094b.m145339a(booleanValue);
            }
        }
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f150423u;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar22.f150425w;
        if (i11 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        c32549e.m157615e(str2);
        return AbstractC29094b.m145339a(booleanValue2);
    }
}
