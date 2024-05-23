package p099dd;

import am.AbstractC0924m0;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19057i0;
import gw.C19669z;
import id.C20511a;
import id.C20512b;
import id.C20514d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import p128ed.C18390e;
import p185gc.AbstractC19377a;
import p387oc.C24214r;
import p421pc.C24720a;
import p484ri.C25806c;
import p543uc.C27225c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sc.C26220b;
import tc.C26627a;
import vi.C28255a;
import vi.C28260f;
import vi.C28262h;
import vi.InterfaceC28256b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: dd.a */
/* loaded from: classes3.dex */
public final class C17887a extends AbstractC19377a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C20511a f90370a;

    /* renamed from: b */
    private final C20514d f90371b;

    /* renamed from: c */
    private final C25806c f90372c;

    /* renamed from: d */
    private final C24720a f90373d;

    /* renamed from: e */
    private final C24214r f90374e;

    /* renamed from: dd.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dd.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f90375a;

        public b(boolean z11) {
            this.f90375a = z11;
        }

        /* renamed from: a */
        public final boolean m94424a() {
            return this.f90375a;
        }
    }

    /* renamed from: dd.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final List f90376a;

        public c(List list) {
            AbstractC19074t.m100208f(list, "listFileMDUploadConversation");
            this.f90376a = list;
        }

        /* renamed from: a */
        public final List m94425a() {
            return this.f90376a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dd.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f90377t;

        /* renamed from: u */
        long f90378u;

        /* renamed from: v */
        int f90379v;

        /* renamed from: w */
        private /* synthetic */ Object f90380w;

        /* renamed from: x */
        final /* synthetic */ b f90381x;

        /* renamed from: y */
        final /* synthetic */ C17887a f90382y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dd.a$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ ArrayList f90383A;

            /* renamed from: t */
            Object f90384t;

            /* renamed from: u */
            int f90385u;

            /* renamed from: v */
            final /* synthetic */ C17887a f90386v;

            /* renamed from: w */
            final /* synthetic */ Conversation f90387w;

            /* renamed from: x */
            final /* synthetic */ HashMap f90388x;

            /* renamed from: y */
            final /* synthetic */ HashMap f90389y;

            /* renamed from: z */
            final /* synthetic */ C19057i0 f90390z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: dd.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32804a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f90391t;

                /* renamed from: u */
                final /* synthetic */ ArrayList f90392u;

                /* renamed from: v */
                final /* synthetic */ List f90393v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32804a(ArrayList arrayList, List list, Continuation continuation) {
                    super(2, continuation);
                    this.f90392u = arrayList;
                    this.f90393v = list;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32804a(this.f90392u, this.f90393v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f90391t == 0) {
                        AbstractC24862s.m129228b(obj);
                        return AbstractC29094b.m145339a(this.f90392u.addAll(this.f90393v));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32804a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17887a c17887a, Conversation conversation, HashMap hashMap, HashMap hashMap2, C19057i0 c19057i0, ArrayList arrayList, Continuation continuation) {
                super(2, continuation);
                this.f90386v = c17887a;
                this.f90387w = conversation;
                this.f90388x = hashMap;
                this.f90389y = hashMap2;
                this.f90390z = c19057i0;
                this.f90383A = arrayList;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f90386v, this.f90387w, this.f90388x, this.f90389y, this.f90390z, this.f90383A, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List list;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f90385u;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            list = (List) this.f90384t;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        List m94422i = this.f90386v.m94422i(this.f90387w.f42893q, this.f90388x, this.f90389y, this.f90390z.f94939p);
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32804a c32804a = new C32804a(this.f90383A, m94422i, null);
                        this.f90384t = m94422i;
                        this.f90385u = 1;
                        if (BuildersKt.m112534g(m112681c, c32804a, this) == m142578e) {
                            return m142578e;
                        }
                        list = m94422i;
                    }
                    return list;
                } catch (Exception e11) {
                    C26220b.m134819b(e11);
                    return C24848g0.f119245a;
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, C17887a c17887a, Continuation continuation) {
            super(2, continuation);
            this.f90381x = bVar;
            this.f90382y = c17887a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f90381x, this.f90382y, continuation);
            dVar.f90380w = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[Catch: Exception -> 0x0022, LOOP:0: B:17:0x00d8->B:19:0x00de, LOOP_END, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0106 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0181 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01b7 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ed A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x024f A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x028b A[Catch: Exception -> 0x0022, LOOP:6: B:75:0x0285->B:77:0x028b, LOOP_END, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001d, B:9:0x02e3, B:15:0x0037, B:16:0x00c0, B:17:0x00d8, B:19:0x00de, B:21:0x00f2, B:22:0x0100, B:24:0x0106, B:31:0x0110, B:27:0x0114, B:35:0x014a, B:37:0x0181, B:39:0x018b, B:40:0x01b1, B:42:0x01b7, B:44:0x01d0, B:49:0x01da, B:50:0x01e7, B:52:0x01ed, B:53:0x01ff, B:55:0x0205, B:58:0x020f, B:64:0x0217, B:65:0x0249, B:67:0x024f, B:69:0x0268, B:74:0x0272, B:75:0x0285, B:77:0x028b, B:79:0x02cd, B:83:0x0187, B:85:0x0042, B:87:0x0074, B:89:0x0078, B:92:0x0080, B:96:0x011a, B:99:0x004f, B:101:0x005b, B:103:0x0061, B:106:0x0124, B:108:0x0132, B:110:0x013c), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131502j;
            CoroutineScope coroutineScope;
            long currentTimeMillis;
            long j11;
            CoroutineScope coroutineScope2;
            List list;
            List m131502j2;
            Object m101503a;
            List m131502j3;
            C20512b.c m126211a;
            C20512b.c cVar;
            List list2;
            C20514d.b bVar;
            Map m131404i;
            Iterator it;
            Iterator it2;
            Iterator it3;
            ArrayList arrayList;
            int m131511r;
            Iterator it4;
            ArrayList arrayList2;
            long j12;
            Deferred m112538b;
            Iterator it5;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f90379v;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                j12 = this.f90378u;
                                arrayList2 = (ArrayList) this.f90380w;
                                AbstractC24862s.m129228b(obj);
                                C26220b.m134826i("SMLGetRemainMediaNeedBackup", "executed time = " + (System.currentTimeMillis() - j12) + " - listFileMDUploadConversation size = " + arrayList2.size(), null, 4, null);
                                return new c(arrayList2);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        currentTimeMillis = this.f90378u;
                        cVar = (C20512b.c) this.f90377t;
                        coroutineScope2 = (CoroutineScope) this.f90380w;
                        AbstractC24862s.m129228b(obj);
                        ArrayList<C28255a> arrayList3 = new ArrayList();
                        arrayList3.addAll(cVar.m106567a());
                        it5 = cVar.m106569c().entrySet().iterator();
                        while (it5.hasNext()) {
                            arrayList3.addAll(((C28260f) ((Map.Entry) it5.next()).getValue()).m142305g());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (C28255a c28255a : arrayList3) {
                            if (c28255a instanceof C28262h) {
                                arrayList4.add(c28255a);
                            } else {
                                arrayList5.add(c28255a);
                            }
                        }
                        j11 = currentTimeMillis;
                        list = arrayList4;
                        list2 = arrayList5;
                        C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Fetched data from DB: singlePhotoFromDb.size=" + list2.size() + ", zipFiles.size=" + list.size(), null, 4, null);
                        bVar = (C20514d.b) this.f90382y.f90371b.m101509a(new C20514d.a(list));
                        if (bVar != null || (m131404i = bVar.m106577a()) == null) {
                            m131404i = AbstractC25363p0.m131404i();
                        }
                        C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Data from zip: zipDriveData.size=" + m131404i.size(), null, 4, null);
                        C19057i0 c19057i0 = new C19057i0();
                        HashMap hashMap = new HashMap();
                        it = list2.iterator();
                        while (it.hasNext()) {
                            C28255a c28255a2 = (C28255a) it.next();
                            hashMap.put(c28255a2.mo142271k(), c28255a2);
                            Iterator it6 = it;
                            if (c28255a2.m142274n() > c19057i0.f94939p) {
                                c19057i0.f94939p = c28255a2.m142274n();
                            }
                            it = it6;
                        }
                        HashMap hashMap2 = new HashMap();
                        it2 = m131404i.values().iterator();
                        while (it2.hasNext()) {
                            for (InterfaceC28256b interfaceC28256b : ((C28260f) it2.next()).m142309k().values()) {
                                if (interfaceC28256b instanceof C28262h) {
                                    hashMap2.put(interfaceC28256b.mo142292f(), interfaceC28256b);
                                }
                            }
                        }
                        int m128446e = this.f90382y.f90373d.m128426v().m128446e();
                        boolean m133023A = this.f90382y.f90372c.m133023A();
                        List m103212Y0 = C19669z.Companion.m103232a().m103212Y0();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        it3 = m103212Y0.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            Iterator it7 = it3;
                            long j13 = j11;
                            if (C26627a.f126082a.m136727b(((Conversation) next).f42893q, C18390e.m97409p(), m128446e, m133023A)) {
                                arrayList7.add(next);
                            }
                            it3 = it7;
                            j11 = j13;
                        }
                        long j14 = j11;
                        C17887a c17887a = this.f90382y;
                        m131511r = AbstractC25370t.m131511r(arrayList7, 10);
                        arrayList = new ArrayList(m131511r);
                        it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, Dispatchers.m112679a(), null, new a(c17887a, (Conversation) it4.next(), hashMap, hashMap2, c19057i0, arrayList6, null), 2, null);
                            arrayList.add(m112538b);
                            j14 = j14;
                            it4 = it4;
                            hashMap = hashMap;
                            arrayList6 = arrayList6;
                            coroutineScope2 = coroutineScope2;
                        }
                        ArrayList arrayList8 = arrayList6;
                        long j15 = j14;
                        this.f90380w = arrayList8;
                        this.f90377t = null;
                        this.f90378u = j15;
                        this.f90379v = 3;
                        if (AwaitKt.m112521a(arrayList, this) == m142578e) {
                            return m142578e;
                        }
                        arrayList2 = arrayList8;
                        j12 = j15;
                        C26220b.m134826i("SMLGetRemainMediaNeedBackup", "executed time = " + (System.currentTimeMillis() - j12) + " - listFileMDUploadConversation size = " + arrayList2.size(), null, 4, null);
                        return new c(arrayList2);
                    }
                    currentTimeMillis = this.f90378u;
                    coroutineScope = (CoroutineScope) this.f90380w;
                    AbstractC24862s.m129228b(obj);
                    m101503a = obj;
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f90380w;
                    currentTimeMillis = System.currentTimeMillis();
                    if (this.f90381x.m94424a() && !AbstractC0924m0.m2989Da()) {
                        C24214r c24214r = this.f90382y.f90374e;
                        this.f90380w = coroutineScope;
                        this.f90378u = currentTimeMillis;
                        this.f90379v = 1;
                        m101503a = c24214r.m101503a(this);
                        if (m101503a == m142578e) {
                            return m142578e;
                        }
                    } else {
                        C20511a.a aVar = (C20511a.a) this.f90382y.f90370a.m101506a();
                        if (aVar == null) {
                            m131502j2 = AbstractC25368s.m131502j();
                            return new c(m131502j2);
                        }
                        List m106561b = aVar.m106561b();
                        List m106560a = aVar.m106560a();
                        j11 = currentTimeMillis;
                        coroutineScope2 = coroutineScope;
                        list = m106560a;
                        list2 = m106561b;
                        C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Fetched data from DB: singlePhotoFromDb.size=" + list2.size() + ", zipFiles.size=" + list.size(), null, 4, null);
                        bVar = (C20514d.b) this.f90382y.f90371b.m101509a(new C20514d.a(list));
                        if (bVar != null) {
                        }
                        m131404i = AbstractC25363p0.m131404i();
                        C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Data from zip: zipDriveData.size=" + m131404i.size(), null, 4, null);
                        C19057i0 c19057i02 = new C19057i0();
                        HashMap hashMap3 = new HashMap();
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        HashMap hashMap22 = new HashMap();
                        it2 = m131404i.values().iterator();
                        while (it2.hasNext()) {
                        }
                        int m128446e2 = this.f90382y.f90373d.m128426v().m128446e();
                        boolean m133023A2 = this.f90382y.f90372c.m133023A();
                        List m103212Y02 = C19669z.Companion.m103232a().m103212Y0();
                        ArrayList arrayList62 = new ArrayList();
                        ArrayList arrayList72 = new ArrayList();
                        it3 = m103212Y02.iterator();
                        while (it3.hasNext()) {
                        }
                        long j142 = j11;
                        C17887a c17887a2 = this.f90382y;
                        m131511r = AbstractC25370t.m131511r(arrayList72, 10);
                        arrayList = new ArrayList(m131511r);
                        it4 = arrayList72.iterator();
                        while (it4.hasNext()) {
                        }
                        ArrayList arrayList82 = arrayList62;
                        long j152 = j142;
                        this.f90380w = arrayList82;
                        this.f90377t = null;
                        this.f90378u = j152;
                        this.f90379v = 3;
                        if (AwaitKt.m112521a(arrayList, this) == m142578e) {
                        }
                    }
                }
                C24214r.b bVar2 = (C24214r.b) m101503a;
                if (bVar2 != null && (m126211a = bVar2.m126211a()) != null) {
                    AbstractC0924m0.m3257Mh(true);
                    C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Fetched data from Drive: mapFileZip.size=" + m126211a.m106569c().size() + ", listFilePhotoSingle.size=" + m126211a.m106567a().size(), null, 4, null);
                    this.f90380w = coroutineScope;
                    this.f90377t = m126211a;
                    this.f90378u = currentTimeMillis;
                    this.f90379v = 2;
                    if (YieldKt.m112882a(this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope2 = coroutineScope;
                    cVar = m126211a;
                    ArrayList<C28255a> arrayList32 = new ArrayList();
                    arrayList32.addAll(cVar.m106567a());
                    it5 = cVar.m106569c().entrySet().iterator();
                    while (it5.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    ArrayList arrayList52 = new ArrayList();
                    while (r6.hasNext()) {
                    }
                    j11 = currentTimeMillis;
                    list = arrayList42;
                    list2 = arrayList52;
                    C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Fetched data from DB: singlePhotoFromDb.size=" + list2.size() + ", zipFiles.size=" + list.size(), null, 4, null);
                    bVar = (C20514d.b) this.f90382y.f90371b.m101509a(new C20514d.a(list));
                    if (bVar != null) {
                    }
                    m131404i = AbstractC25363p0.m131404i();
                    C26220b.m134826i("SMLGetRemainMediaNeedBackup", "Data from zip: zipDriveData.size=" + m131404i.size(), null, 4, null);
                    C19057i0 c19057i022 = new C19057i0();
                    HashMap hashMap32 = new HashMap();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    HashMap hashMap222 = new HashMap();
                    it2 = m131404i.values().iterator();
                    while (it2.hasNext()) {
                    }
                    int m128446e22 = this.f90382y.f90373d.m128426v().m128446e();
                    boolean m133023A22 = this.f90382y.f90372c.m133023A();
                    List m103212Y022 = C19669z.Companion.m103232a().m103212Y0();
                    ArrayList arrayList622 = new ArrayList();
                    ArrayList arrayList722 = new ArrayList();
                    it3 = m103212Y022.iterator();
                    while (it3.hasNext()) {
                    }
                    long j1422 = j11;
                    C17887a c17887a22 = this.f90382y;
                    m131511r = AbstractC25370t.m131511r(arrayList722, 10);
                    arrayList = new ArrayList(m131511r);
                    it4 = arrayList722.iterator();
                    while (it4.hasNext()) {
                    }
                    ArrayList arrayList822 = arrayList622;
                    long j1522 = j1422;
                    this.f90380w = arrayList822;
                    this.f90377t = null;
                    this.f90378u = j1522;
                    this.f90379v = 3;
                    if (AwaitKt.m112521a(arrayList, this) == m142578e) {
                    }
                }
                m131502j3 = AbstractC25368s.m131502j();
                return new c(m131502j3);
            } catch (Exception e11) {
                C26220b.m134821d("SMLGetRemainMediaNeedBackup", e11);
                m131502j = AbstractC25368s.m131502j();
                return new c(m131502j);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C17887a(C20511a c20511a, C20514d c20514d, C25806c c25806c, C24720a c24720a, C24214r c24214r) {
        AbstractC19074t.m100208f(c20511a, "getFileMetadataCacheUseCase");
        AbstractC19074t.m100208f(c20514d, "getZipFileMetadataCacheUseCase");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(c24214r, "refreshTokenAndFetchDriveDataUseCase");
        this.f90370a = c20511a;
        this.f90371b = c20514d;
        this.f90372c = c25806c;
        this.f90373d = c24720a;
        this.f90374e = c24214r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final List m94422i(String str, HashMap hashMap, HashMap hashMap2, long j11) {
        int m4215t = AbstractC0924m0.m4215t();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        long j12 = Long.MAX_VALUE;
        while (j12 > Long.MIN_VALUE) {
            C27225c.m139327b(3);
            j12 = C26627a.f126082a.m136729d(str, arrayList, hashSet, hashMap, hashMap2, j11, 0L, j12, m4215t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object mo451b(b bVar, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(bVar, this, null), continuation);
    }
}
