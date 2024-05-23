package lg0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import dh0.C17933b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vi.C28255a;
import vi.C28260f;
import vi.C28262h;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: lg0.h */
/* loaded from: classes7.dex */
public final class C22484h implements InterfaceC22477a {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private volatile boolean f109954d;

    /* renamed from: g */
    private Deferred f109957g;

    /* renamed from: a */
    private final ArrayList f109951a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f109952b = new ArrayList();

    /* renamed from: c */
    private final HashMap f109953c = new HashMap();

    /* renamed from: e */
    private boolean f109955e = true;

    /* renamed from: f */
    private final Mutex f109956f = MutexKt.m113910b(false, 1, null);

    /* renamed from: lg0.h$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC22477a m116257a() {
            return b.f109958a.m116258a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lg0.h$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f109958a = new b();

        /* renamed from: b */
        private static final C22484h f109959b = new C22484h();

        private b() {
        }

        /* renamed from: a */
        public final C22484h m116258a() {
            return f109959b;
        }
    }

    /* renamed from: lg0.h$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109960t;

        /* renamed from: v */
        final /* synthetic */ String f109962v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(1, continuation);
            this.f109962v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f109960t == 0) {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = C22484h.this.f109951a;
                String str = this.f109962v;
                for (Object obj2 : arrayList) {
                    if (AbstractC19074t.m100204b(((C28255a) obj2).mo142271k(), str)) {
                        return obj2;
                    }
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Continuation m116259r(Continuation continuation) {
            return new c(this.f109962v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((c) m116259r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: lg0.h$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109963t;

        /* renamed from: v */
        final /* synthetic */ String f109965v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation continuation) {
            super(1, continuation);
            this.f109965v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f109963t == 0) {
                AbstractC24862s.m129228b(obj);
                return C22484h.this.f109953c.get(this.f109965v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Continuation m116261r(Continuation continuation) {
            return new d(this.f109965v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((d) m116261r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: lg0.h$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f109966t;

        /* renamed from: v */
        final /* synthetic */ MessageId f109968v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MessageId messageId, Continuation continuation) {
            super(1, continuation);
            this.f109968v = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f109966t == 0) {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = C22484h.this.f109952b;
                MessageId messageId = this.f109968v;
                for (Object obj2 : arrayList) {
                    MessageId m142324B = ((C28262h) obj2).m142324B();
                    if (m142324B != null && m142324B.m41041B(messageId.m41048l(), messageId.m41050n(), messageId.m41044h(), messageId.m41046j())) {
                        return obj2;
                    }
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Continuation m116263r(Continuation continuation) {
            return new e(this.f109968v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((e) m116263r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f109969t;

        /* renamed from: u */
        int f109970u;

        f(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C22484h c22484h;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109970u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c22484h = (C22484h) this.f109969t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (C22484h.this.f109954d) {
                    return C24848g0.f119245a;
                }
                if (C22484h.this.f109955e) {
                    C22484h c22484h2 = C22484h.this;
                    this.f109969t = c22484h2;
                    this.f109970u = 1;
                    Object m116254u = c22484h2.m116254u(this);
                    if (m116254u == m142578e) {
                        return m142578e;
                    }
                    c22484h = c22484h2;
                    obj = m116254u;
                }
                return C24848g0.f119245a;
            }
            c22484h.f109954d = ((Boolean) obj).booleanValue();
            C22484h.this.f109955e = false;
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m116265r(Continuation continuation) {
            return new f(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f) m116265r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109972t;

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
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109972t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C22484h c22484h = C22484h.this;
                this.f109972t = 1;
                if (c22484h.m116252s(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f109974s;

        /* renamed from: u */
        int f109976u;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109974s = obj;
            this.f109976u |= Integer.MIN_VALUE;
            return C22484h.this.m116254u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29096d {

        /* renamed from: s */
        Object f109977s;

        /* renamed from: t */
        /* synthetic */ Object f109978t;

        /* renamed from: v */
        int f109980v;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109978t = obj;
            this.f109980v |= Integer.MIN_VALUE;
            return C22484h.this.mo116223a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29096d {

        /* renamed from: s */
        Object f109981s;

        /* renamed from: t */
        Object f109982t;

        /* renamed from: u */
        /* synthetic */ Object f109983u;

        /* renamed from: w */
        int f109985w;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109983u = obj;
            this.f109985w |= Integer.MIN_VALUE;
            return C22484h.this.m116255v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.h$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC29096d {

        /* renamed from: s */
        Object f109986s;

        /* renamed from: t */
        /* synthetic */ Object f109987t;

        /* renamed from: v */
        int f109989v;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109987t = obj;
            this.f109989v |= Integer.MIN_VALUE;
            return C22484h.this.m116256w(null, this);
        }
    }

    public C22484h() {
        m116253t();
    }

    /* renamed from: r */
    public static final InterfaceC22477a m116251r() {
        return Companion.m116257a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final Object m116252s(Continuation continuation) {
        Object m142578e;
        Object m116255v = m116255v(new f(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m116255v == m142578e) {
            return m116255v;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: t */
    private final Deferred m116253t() {
        Deferred m112538b;
        Deferred deferred = this.f109957g;
        if (deferred == null) {
            m112538b = BuildersKt__Builders_commonKt.m112538b(C17933b.f90533a.m94579d(), Dispatchers.m112680b(), null, new g(null), 2, null);
            this.f109957g = m112538b;
            return m112538b;
        }
        return deferred;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116254u(Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        Map m142309k;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f109976u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f109976u = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f109974s;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f109976u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C7959d m41850e = C7959d.Companion.m41850e();
                    List<C28255a> m41796j1 = m41850e.m41796j1();
                    if (m41796j1.isEmpty()) {
                        return AbstractC29094b.m145339a(false);
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C28255a c28255a : m41796j1) {
                        if (c28255a instanceof C28262h) {
                            arrayList2.add(c28255a);
                        } else {
                            arrayList.add(c28255a);
                        }
                    }
                    HashMap hashMap = new HashMap(m41850e.m41800k1());
                    if (!hashMap.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C28262h c28262h = (C28262h) it.next();
                            C28260f c28260f = (C28260f) hashMap.get(c28262h.m142327E());
                            if (c28260f != null && (m142309k = c28260f.m142309k()) != null) {
                                String mo142292f = c28262h.mo142292f();
                                AbstractC19074t.m100205c(c28262h);
                            }
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return AbstractC29094b.m145339a(false);
                    }
                    hVar.f109976u = 1;
                    if (mo116224b(arrayList, hashMap, hVar) == m142578e) {
                        return m142578e;
                    }
                }
                return AbstractC29094b.m145339a(true);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f109974s;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f109976u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116255v(InterfaceC18505l interfaceC18505l, Continuation continuation) {
        j jVar;
        Object m142578e;
        int i11;
        Mutex mutex;
        Throwable th2;
        Mutex mutex2;
        Object mo205i9;
        try {
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i12 = jVar.f109985w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    jVar.f109985w = i12 - Integer.MIN_VALUE;
                    Object obj = jVar.f109983u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = jVar.f109985w;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                mutex2 = (Mutex) jVar.f109981s;
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    mutex2.mo113890c(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    mutex2.mo113890c(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex3 = (Mutex) jVar.f109982t;
                        InterfaceC18505l interfaceC18505l2 = (InterfaceC18505l) jVar.f109981s;
                        AbstractC24862s.m129228b(obj);
                        mutex = mutex3;
                        interfaceC18505l = interfaceC18505l2;
                    } else {
                        AbstractC24862s.m129228b(obj);
                        mutex = this.f109956f;
                        jVar.f109981s = interfaceC18505l;
                        jVar.f109982t = mutex;
                        jVar.f109985w = 1;
                        if (mutex.mo113889b(null, jVar) == m142578e) {
                            return m142578e;
                        }
                    }
                    jVar.f109981s = mutex;
                    jVar.f109982t = null;
                    jVar.f109985w = 2;
                    mo205i9 = interfaceC18505l.mo205i9(jVar);
                    if (mo205i9 != m142578e) {
                        return m142578e;
                    }
                    Mutex mutex4 = mutex;
                    obj = mo205i9;
                    mutex2 = mutex4;
                    mutex2.mo113890c(null);
                    return obj;
                }
            }
            jVar.f109981s = mutex;
            jVar.f109982t = null;
            jVar.f109985w = 2;
            mo205i9 = interfaceC18505l.mo205i9(jVar);
            if (mo205i9 != m142578e) {
            }
        } catch (Throwable th4) {
            Mutex mutex5 = mutex;
            th2 = th4;
            mutex2 = mutex5;
            mutex2.mo113890c(null);
            throw th2;
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f109983u;
        m142578e = AbstractC28298d.m142578e();
        i11 = jVar.f109985w;
        if (i11 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116256w(InterfaceC18505l interfaceC18505l, Continuation continuation) {
        k kVar;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i12 = kVar.f109989v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f109989v = i12 - Integer.MIN_VALUE;
                obj = kVar.f109987t;
                m142578e = AbstractC28298d.m142578e();
                i11 = kVar.f109989v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC18505l = (InterfaceC18505l) kVar.f109986s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    kVar.f109986s = interfaceC18505l;
                    kVar.f109989v = 1;
                    obj = mo116223a(kVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    kVar.f109986s = null;
                    kVar.f109989v = 2;
                    obj = interfaceC18505l.mo205i9(kVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return obj;
                }
                throw new IllegalStateException("Repository has not validated yet");
            }
        }
        kVar = new k(continuation);
        obj = kVar.f109987t;
        m142578e = AbstractC28298d.m142578e();
        i11 = kVar.f109989v;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // lg0.InterfaceC22477a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116223a(Continuation continuation) {
        i iVar;
        Object m142578e;
        int i11;
        C22484h c22484h;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i12 = iVar.f109980v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar.f109980v = i12 - Integer.MIN_VALUE;
                Object obj = iVar.f109978t;
                m142578e = AbstractC28298d.m142578e();
                i11 = iVar.f109980v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c22484h = (C22484h) iVar.f109977s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Deferred m116253t = m116253t();
                    iVar.f109977s = this;
                    iVar.f109980v = 1;
                    if (m116253t.mo112598E(iVar) == m142578e) {
                        return m142578e;
                    }
                    c22484h = this;
                }
                return AbstractC29094b.m145339a(c22484h.f109954d);
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f109978t;
        m142578e = AbstractC28298d.m142578e();
        i11 = iVar.f109980v;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(c22484h.f109954d);
    }

    @Override // lg0.InterfaceC22477a
    /* renamed from: b */
    public Object mo116224b(List list, Map map, Continuation continuation) {
        this.f109951a.addAll(list);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C28260f) ((Map.Entry) it.next()).getValue()).m142305g().iterator();
            while (it2.hasNext()) {
                C28255a c28255a = (C28255a) it2.next();
                if (c28255a instanceof C28262h) {
                    this.f109952b.add(c28255a);
                } else {
                    this.f109951a.add(c28255a);
                }
            }
        }
        this.f109953c.putAll(map);
        return C24848g0.f119245a;
    }

    @Override // lg0.InterfaceC22477a
    /* renamed from: c */
    public Object mo116225c(String str, Continuation continuation) {
        return m116256w(new c(str, null), continuation);
    }

    @Override // lg0.InterfaceC22477a
    /* renamed from: d */
    public Object mo116226d(String str, Continuation continuation) {
        return m116256w(new d(str, null), continuation);
    }

    @Override // lg0.InterfaceC22477a
    /* renamed from: e */
    public Object mo116227e(boolean z11, Continuation continuation) {
        this.f109954d = z11;
        return C24848g0.f119245a;
    }

    @Override // lg0.InterfaceC22477a
    /* renamed from: f */
    public Object mo116228f(MessageId messageId, Continuation continuation) {
        return m116256w(new e(messageId, null), continuation);
    }
}
