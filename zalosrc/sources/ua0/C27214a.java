package ua0;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19053g0;
import fn0.C19055h0;
import fn0.C19059j0;
import gw.C19669z;
import hu.C20131e;
import i30.C20222a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import mm0.AbstractC23350e;
import p185gc.AbstractC19379c;
import p348mi.AbstractC23306f;
import pm.C24831b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import za0.C31747a;

/* renamed from: ua0.a */
/* loaded from: classes6.dex */
public final class C27214a extends AbstractC19379c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19669z f127949a;

    /* renamed from: b */
    private final boolean f127950b;

    /* renamed from: c */
    private final C20222a.b f127951c;

    /* renamed from: ua0.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ua0.a$b */
    /* loaded from: classes6.dex */
    public static abstract class b {

        /* renamed from: ua0.a$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a */
            public static final a f127952a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: ua0.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C32988b extends b {

            /* renamed from: a */
            public static final C32988b f127953a = new C32988b();

            private C32988b() {
                super(null);
            }
        }

        /* renamed from: ua0.a$b$c */
        /* loaded from: classes6.dex */
        public static final class c extends b {

            /* renamed from: a */
            private final float f127954a;

            public c(float f11) {
                super(null);
                this.f127954a = f11;
            }

            /* renamed from: a */
            public final float m139312a() {
                return this.f127954a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Float.compare(this.f127954a, ((c) obj).f127954a) == 0;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f127954a);
            }

            public String toString() {
                return "OnLoadedPerThread(progress=" + this.f127954a + ")";
            }
        }

        /* renamed from: ua0.a$b$d */
        /* loaded from: classes6.dex */
        public static final class d extends b {

            /* renamed from: a */
            private final List f127955a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list) {
                super(null);
                AbstractC19074t.m100208f(list, "data");
                this.f127955a = list;
            }

            /* renamed from: a */
            public final List m139313a() {
                return this.f127955a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC19074t.m100204b(this.f127955a, ((d) obj).f127955a);
            }

            public int hashCode() {
                return this.f127955a.hashCode();
            }

            public String toString() {
                return "Success(data=" + this.f127955a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ua0.a$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        private /* synthetic */ Object f127956A;

        /* renamed from: C */
        final /* synthetic */ long f127958C;

        /* renamed from: t */
        Object f127959t;

        /* renamed from: u */
        Object f127960u;

        /* renamed from: v */
        Object f127961v;

        /* renamed from: w */
        int f127962w;

        /* renamed from: x */
        float f127963x;

        /* renamed from: y */
        long f127964y;

        /* renamed from: z */
        int f127965z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ua0.a$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ C19055h0 f127966A;

            /* renamed from: B */
            final /* synthetic */ ProducerScope f127967B;

            /* renamed from: C */
            final /* synthetic */ int f127968C;

            /* renamed from: t */
            Object f127969t;

            /* renamed from: u */
            int f127970u;

            /* renamed from: v */
            final /* synthetic */ Conversation f127971v;

            /* renamed from: w */
            final /* synthetic */ File[] f127972w;

            /* renamed from: x */
            final /* synthetic */ C27214a f127973x;

            /* renamed from: y */
            final /* synthetic */ C19053g0 f127974y;

            /* renamed from: z */
            final /* synthetic */ float f127975z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ua0.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C32989a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f127976t;

                /* renamed from: u */
                final /* synthetic */ C19053g0 f127977u;

                /* renamed from: v */
                final /* synthetic */ float f127978v;

                /* renamed from: w */
                final /* synthetic */ C19055h0 f127979w;

                /* renamed from: x */
                final /* synthetic */ ProducerScope f127980x;

                /* renamed from: y */
                final /* synthetic */ int f127981y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32989a(C19053g0 c19053g0, float f11, C19055h0 c19055h0, ProducerScope producerScope, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f127977u = c19053g0;
                    this.f127978v = f11;
                    this.f127979w = c19055h0;
                    this.f127980x = producerScope;
                    this.f127981y = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32989a(this.f127977u, this.f127978v, this.f127979w, this.f127980x, this.f127981y, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f127976t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C19053g0 c19053g0 = this.f127977u;
                        float f11 = c19053g0.f94930p + this.f127978v;
                        c19053g0.f94930p = f11;
                        this.f127979w.f94931p++;
                        ProducerScope producerScope = this.f127980x;
                        b.c cVar = new b.c(f11);
                        this.f127976t = 1;
                        if (producerScope.mo112908S(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    C31747a.m152703b("SMLLoadAllLocalMediaUseCase", "Loading progress: " + this.f127977u.f94930p + "% - " + this.f127979w.f94931p + "/" + this.f127981y + " threads loaded", false);
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32989a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Conversation conversation, File[] fileArr, C27214a c27214a, C19053g0 c19053g0, float f11, C19055h0 c19055h0, ProducerScope producerScope, int i11, Continuation continuation) {
                super(2, continuation);
                this.f127971v = conversation;
                this.f127972w = fileArr;
                this.f127973x = c27214a;
                this.f127974y = c19053g0;
                this.f127975z = f11;
                this.f127966A = c19055h0;
                this.f127967B = producerScope;
                this.f127968C = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f127971v, this.f127972w, this.f127973x, this.f127974y, this.f127975z, this.f127966A, this.f127967B, this.f127968C, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f127970u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) this.f127969t;
                        AbstractC24862s.m129228b(obj);
                        return threadStorageInfo;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                ThreadStorageInfo m105678a = AbstractC23306f.m120586I().m105678a(this.f127971v, this.f127972w, this.f127973x.f127951c);
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                C32989a c32989a = new C32989a(this.f127974y, this.f127975z, this.f127966A, this.f127967B, this.f127968C, null);
                this.f127969t = m105678a;
                this.f127970u = 1;
                if (BuildersKt.m112534g(m112681c, c32989a, this) == m142578e) {
                    return m142578e;
                }
                return m105678a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, Continuation continuation) {
            super(2, continuation);
            this.f127958C = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f127958C, continuation);
            cVar.f127956A = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01f3 A[Catch: Exception -> 0x0037, LOOP:0: B:18:0x01ed->B:20:0x01f3, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:16:0x0032, B:17:0x01df, B:18:0x01ed, B:20:0x01f3, B:22:0x0203, B:25:0x0041, B:27:0x01c8, B:35:0x014f, B:36:0x0173, B:38:0x0179, B:40:0x01b2), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01de A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0179 A[Catch: Exception -> 0x0037, LOOP:1: B:36:0x0173->B:38:0x0179, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:16:0x0032, B:17:0x01df, B:18:0x01ed, B:20:0x01f3, B:22:0x0203, B:25:0x0041, B:27:0x01c8, B:35:0x014f, B:36:0x0173, B:38:0x0179, B:40:0x01b2), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01c7  */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.channels.SendChannel] */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ProducerScope producerScope;
            File[] listFiles;
            C19053g0 c19053g0;
            int i11;
            ProducerScope producerScope2;
            C19059j0 c19059j0;
            float f11;
            ProducerScope producerScope3;
            long j11;
            int m131511r;
            Iterator it;
            Object m112521a;
            long j12;
            Deferred m112538b;
            ProducerScope producerScope4;
            List list;
            Object mo112908S;
            Iterator it2;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f127965z;
            ?? r82 = 1;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                    r82 = producerScope;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j12 = this.f127964y;
                            list = (List) this.f127959t;
                            ProducerScope producerScope5 = (ProducerScope) this.f127956A;
                            AbstractC24862s.m129228b(obj);
                            r82 = producerScope5;
                            long currentTimeMillis = System.currentTimeMillis() - j12;
                            it2 = list.iterator();
                            int i13 = 0;
                            while (it2.hasNext()) {
                                i13 += ((ThreadStorageInfo) it2.next()).m74799j().size();
                            }
                            C31747a.m152704c("SMLLoadAllLocalMediaUseCase", "Calculated data: Total msg count = " + i13 + " - Total thread count = " + list.size() + ". Exec time: " + currentTimeMillis + " ms", false, 4, null);
                            return C24848g0.f119245a;
                        }
                        j12 = this.f127964y;
                        ProducerScope producerScope6 = (ProducerScope) this.f127956A;
                        AbstractC24862s.m129228b(obj);
                        m112521a = obj;
                        producerScope4 = producerScope6;
                        list = (List) m112521a;
                        b.d dVar = new b.d(list);
                        this.f127956A = producerScope4;
                        this.f127959t = list;
                        this.f127964y = j12;
                        this.f127965z = 4;
                        mo112908S = producerScope4.mo112908S(dVar, this);
                        r82 = producerScope4;
                        if (mo112908S == m142578e) {
                            return m142578e;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - j12;
                        it2 = list.iterator();
                        int i132 = 0;
                        while (it2.hasNext()) {
                        }
                        C31747a.m152704c("SMLLoadAllLocalMediaUseCase", "Calculated data: Total msg count = " + i132 + " - Total thread count = " + list.size() + ". Exec time: " + currentTimeMillis2 + " ms", false, 4, null);
                        return C24848g0.f119245a;
                    }
                    f11 = this.f127963x;
                    i11 = this.f127962w;
                    C19053g0 c19053g02 = (C19053g0) this.f127961v;
                    c19059j0 = (C19059j0) this.f127960u;
                    listFiles = (File[]) this.f127959t;
                    ProducerScope producerScope7 = (ProducerScope) this.f127956A;
                    try {
                        AbstractC24862s.m129228b(obj);
                        producerScope2 = producerScope7;
                        c19053g0 = c19053g02;
                        producerScope3 = producerScope2;
                        C19055h0 c19055h0 = new C19055h0();
                        CoroutineScope m112637a = CoroutineScopeKt.m112637a(producerScope3.mo9207O());
                        j11 = this.f127958C;
                        C27214a c27214a = C27214a.this;
                        Iterable iterable = (Iterable) c19059j0.f94941p;
                        m131511r = AbstractC25370t.m131511r(iterable, 10);
                        ArrayList arrayList = new ArrayList(m131511r);
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            m112538b = BuildersKt__Builders_commonKt.m112538b(m112637a, Dispatchers.m112679a(), null, new a((Conversation) it.next(), listFiles, c27214a, c19053g0, f11, c19055h0, producerScope3, i11, null), 2, null);
                            arrayList.add(m112538b);
                        }
                        this.f127956A = producerScope3;
                        this.f127959t = null;
                        this.f127960u = null;
                        this.f127961v = null;
                        this.f127964y = j11;
                        this.f127965z = 3;
                        m112521a = AwaitKt.m112521a(arrayList, this);
                    } catch (Exception e13) {
                        e = e13;
                        r82 = producerScope7;
                        AbstractC23350e.m122776f("SMLLoadAllLocalMediaUseCase", e);
                        C31747a.m152716o(System.currentTimeMillis() - this.f127958C);
                        b.a aVar = b.a.f127952a;
                        this.f127956A = null;
                        this.f127959t = null;
                        this.f127960u = null;
                        this.f127961v = null;
                        this.f127965z = 5;
                        if (r82.mo112908S(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    if (m112521a != m142578e) {
                        return m142578e;
                    }
                    j12 = j11;
                    producerScope4 = producerScope3;
                    list = (List) m112521a;
                    b.d dVar2 = new b.d(list);
                    this.f127956A = producerScope4;
                    this.f127959t = list;
                    this.f127964y = j12;
                    this.f127965z = 4;
                    mo112908S = producerScope4.mo112908S(dVar2, this);
                    r82 = producerScope4;
                    if (mo112908S == m142578e) {
                    }
                    long currentTimeMillis22 = System.currentTimeMillis() - j12;
                    it2 = list.iterator();
                    int i1322 = 0;
                    while (it2.hasNext()) {
                    }
                    C31747a.m152704c("SMLLoadAllLocalMediaUseCase", "Calculated data: Total msg count = " + i1322 + " - Total thread count = " + list.size() + ". Exec time: " + currentTimeMillis22 + " ms", false, 4, null);
                    return C24848g0.f119245a;
                }
                producerScope = (ProducerScope) this.f127956A;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                producerScope = (ProducerScope) this.f127956A;
                b.C32988b c32988b = b.C32988b.f127953a;
                this.f127956A = producerScope;
                this.f127965z = 1;
                if (producerScope.mo112908S(c32988b, this) == m142578e) {
                    return m142578e;
                }
            }
            listFiles = new File(C20131e.m104919l(), CoreUtility.f89233i).listFiles();
            C27214a.this.f127949a.m103229t0();
            C21459a.m111041j();
            C19059j0 c19059j02 = new C19059j0();
            List m103212Y0 = C27214a.this.f127949a.m103212Y0();
            AbstractC19074t.m100206d(m103212Y0, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.chat.model.tabmessage.Conversation>");
            c19059j02.f94941p = (ArrayList) m103212Y0;
            if (C27214a.this.f127950b) {
                Iterable iterable2 = (Iterable) c19059j02.f94941p;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable2) {
                    if (!C21459a.f104477a.m111044h(((Conversation) obj2).f42893q)) {
                        arrayList2.add(obj2);
                    }
                }
                c19059j02.f94941p = arrayList2;
            }
            C24831b c24831b = C24831b.f119222a;
            if (c24831b.m129118d()) {
                ArrayList arrayList3 = new ArrayList((Collection) c19059j02.f94941p);
                long m129117c = c24831b.m129117c();
                for (long j13 = 1; j13 < m129117c; j13++) {
                    ((ArrayList) c19059j02.f94941p).addAll(arrayList3);
                }
            }
            int size = ((ArrayList) c19059j02.f94941p).size() + 1;
            float f12 = 100.0f / size;
            c19053g0 = new C19053g0();
            b.c cVar = new b.c(c19053g0.f94930p);
            this.f127956A = producerScope;
            this.f127959t = listFiles;
            this.f127960u = c19059j02;
            this.f127961v = c19053g0;
            this.f127962w = size;
            this.f127963x = f12;
            this.f127965z = 2;
            if (producerScope.mo112908S(cVar, this) == m142578e) {
                return m142578e;
            }
            i11 = size;
            producerScope2 = producerScope;
            c19059j0 = c19059j02;
            f11 = f12;
            producerScope3 = producerScope2;
            C19055h0 c19055h02 = new C19055h0();
            CoroutineScope m112637a2 = CoroutineScopeKt.m112637a(producerScope3.mo9207O());
            j11 = this.f127958C;
            C27214a c27214a2 = C27214a.this;
            Iterable iterable3 = (Iterable) c19059j0.f94941p;
            m131511r = AbstractC25370t.m131511r(iterable3, 10);
            ArrayList arrayList4 = new ArrayList(m131511r);
            it = iterable3.iterator();
            while (it.hasNext()) {
            }
            this.f127956A = producerScope3;
            this.f127959t = null;
            this.f127960u = null;
            this.f127961v = null;
            this.f127964y = j11;
            this.f127965z = 3;
            m112521a = AwaitKt.m112521a(arrayList4, this);
            if (m112521a != m142578e) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((c) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C27214a(C19669z c19669z, boolean z11, C20222a.b bVar) {
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(bVar, "mode");
        this.f127949a = c19669z;
        this.f127950b = z11;
        this.f127951c = bVar;
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113290h(new c(System.currentTimeMillis(), null));
    }
}
