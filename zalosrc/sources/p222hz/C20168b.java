package p222hz;

import android.content.Context;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import fn0.C19059j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import km0.InterfaceC21766a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kz.AbstractC21970a;
import org.json.JSONArray;
import org.json.JSONObject;
import p191gz.C19683a;
import p191gz.C19684b;
import p248iy.AbstractC20887g;
import p249iz.C20892e;
import p249iz.InterfaceC20890c;
import p282jz.AbstractC21416a;
import p282jz.C21418c;
import p282jz.InterfaceC21417b;
import p334lz.AbstractC22690b;
import p334lz.AbstractC22691c;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: hz.b */
/* loaded from: classes4.dex */
public final class C20168b implements InterfaceC20167a {

    /* renamed from: a */
    private final Context f99544a;

    /* renamed from: b */
    private String f99545b;

    /* renamed from: c */
    private final C29234i f99546c;

    /* renamed from: d */
    private final InterfaceC29232g f99547d;

    /* renamed from: e */
    private final InterfaceC21417b f99548e;

    /* renamed from: f */
    private boolean f99549f;

    /* renamed from: g */
    private boolean f99550g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: A */
        long f99551A;

        /* renamed from: B */
        /* synthetic */ Object f99552B;

        /* renamed from: D */
        int f99554D;

        /* renamed from: s */
        Object f99555s;

        /* renamed from: t */
        Object f99556t;

        /* renamed from: u */
        Object f99557u;

        /* renamed from: v */
        Object f99558v;

        /* renamed from: w */
        Object f99559w;

        /* renamed from: x */
        Object f99560x;

        /* renamed from: y */
        Object f99561y;

        /* renamed from: z */
        long f99562z;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f99552B = obj;
            this.f99554D |= Integer.MIN_VALUE;
            return C20168b.this.mo105172i(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: A */
        final /* synthetic */ C19059j0 f99563A;

        /* renamed from: t */
        int f99564t;

        /* renamed from: u */
        /* synthetic */ int f99565u;

        /* renamed from: v */
        /* synthetic */ Object f99566v;

        /* renamed from: w */
        final /* synthetic */ C19051f0 f99567w;

        /* renamed from: x */
        final /* synthetic */ C19051f0 f99568x;

        /* renamed from: y */
        final /* synthetic */ C20168b f99569y;

        /* renamed from: z */
        final /* synthetic */ C19055h0 f99570z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hz.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f99571t;

            a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f99571t == 0) {
                    AbstractC24862s.m129228b(obj);
                    AbstractC21970a.m114741j(System.currentTimeMillis());
                    AbstractC21970a.m114742k(System.currentTimeMillis());
                    int m114737f = AbstractC21970a.m114737f();
                    int m114732a = AbstractC21970a.m114732a();
                    if (m114732a == m114737f) {
                        AbstractC20887g.m109244v(101019, null, 2, null);
                    }
                    if (m114732a != -1) {
                        AbstractC21970a.m114738g(m114732a + 1);
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C19051f0 c19051f0, C19051f0 c19051f02, C20168b c20168b, C19055h0 c19055h0, C19059j0 c19059j0, Continuation continuation) {
            super(3, continuation);
            this.f99567w = c19051f0;
            this.f99568x = c19051f02;
            this.f99569y = c20168b;
            this.f99570z = c19055h0;
            this.f99563A = c19059j0;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m105183r(((Number) obj).intValue(), (String) obj2, (Continuation) obj3);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f99564t;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f99565u;
                    str = (String) this.f99566v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i13 = this.f99565u;
                str = (String) this.f99566v;
                this.f99567w.f94928p = false;
                this.f99568x.f94928p = true;
                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                a aVar = new a(null);
                this.f99566v = str;
                this.f99565u = i13;
                this.f99564t = 1;
                if (BuildersKt.m112534g(m112680b, aVar, this) == m142578e) {
                    return m142578e;
                }
                i11 = i13;
            }
            this.f99569y.f99549f = false;
            AbstractC22691c.m117365b("\tgetAllZaloSettingsPaging: page=" + this.f99570z.f94931p + ", keyLv0=" + ((String) this.f99563A.f94941p) + ", errorCode=" + i11 + ", errorMsg=" + str + ", time=" + System.currentTimeMillis());
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Object m105183r(int i11, String str, Continuation continuation) {
            b bVar = new b(this.f99567w, this.f99568x, this.f99569y, this.f99570z, this.f99563A, continuation);
            bVar.f99565u = i11;
            bVar.f99566v = str;
            return bVar.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C19055h0 f99572A;

        /* renamed from: t */
        Object f99573t;

        /* renamed from: u */
        int f99574u;

        /* renamed from: v */
        /* synthetic */ Object f99575v;

        /* renamed from: w */
        final /* synthetic */ Map f99576w;

        /* renamed from: x */
        final /* synthetic */ C20168b f99577x;

        /* renamed from: y */
        final /* synthetic */ C19051f0 f99578y;

        /* renamed from: z */
        final /* synthetic */ C19059j0 f99579z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Map map, C20168b c20168b, C19051f0 c19051f0, C19059j0 c19059j0, C19055h0 c19055h0, Continuation continuation) {
            super(2, continuation);
            this.f99576w = map;
            this.f99577x = c20168b;
            this.f99578y = c19051f0;
            this.f99579z = c19059j0;
            this.f99572A = c19055h0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f99576w, this.f99577x, this.f99578y, this.f99579z, this.f99572A, continuation);
            cVar.f99575v = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C19684b c19684b;
            Map map;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99574u;
            if (i11 != 0) {
                if (i11 == 1) {
                    map = (Map) this.f99573t;
                    c19684b = (C19684b) this.f99575v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                c19684b = (C19684b) this.f99575v;
                Map map2 = this.f99576w;
                InterfaceC20890c m105181q = this.f99577x.m105181q();
                JSONObject m103287c = c19684b.m103287c();
                this.f99575v = c19684b;
                this.f99573t = map2;
                this.f99574u = 1;
                Object mo109294o = m105181q.mo109294o(m103287c, this);
                if (mo109294o == m142578e) {
                    return m142578e;
                }
                map = map2;
                obj = mo109294o;
            }
            map.putAll((Map) obj);
            this.f99578y.f94928p = c19684b.m103285a();
            this.f99579z.f94941p = c19684b.m103286b();
            AbstractC22691c.m117367d("\tgetAllZaloSettingsPaging: success, page=" + this.f99572A.f94931p + ", keyLv0=" + ((String) this.f99579z.f94941p) + ", time=" + System.currentTimeMillis());
            if (this.f99578y.f94928p) {
                this.f99572A.f94931p++;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C19684b c19684b, Continuation continuation) {
            return ((c) mo238a(c19684b, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f99580t;

        /* renamed from: u */
        int f99581u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f99582v;

        /* renamed from: w */
        final /* synthetic */ C20168b f99583w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC18509p interfaceC18509p, C20168b c20168b, Continuation continuation) {
            super(2, continuation);
            this.f99582v = interfaceC18509p;
            this.f99583w = c20168b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f99582v, this.f99583w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC18509p interfaceC18509p;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99581u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (Boolean) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC18509p = (InterfaceC18509p) this.f99580t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                interfaceC18509p = this.f99582v;
                if (interfaceC18509p != null) {
                    InterfaceC20890c m105181q = this.f99583w.m105181q();
                    this.f99580t = interfaceC18509p;
                    this.f99581u = 1;
                    obj = m105181q.mo109287h(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                } else {
                    return null;
                }
            }
            this.f99580t = null;
            this.f99581u = 2;
            obj = interfaceC18509p.mo240pC(obj, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (Boolean) obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f99584s;

        /* renamed from: t */
        Object f99585t;

        /* renamed from: u */
        Object f99586u;

        /* renamed from: v */
        long f99587v;

        /* renamed from: w */
        /* synthetic */ Object f99588w;

        /* renamed from: y */
        int f99590y;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f99588w = obj;
            this.f99590y |= Integer.MIN_VALUE;
            return C20168b.this.mo105175l(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f99591t;

        /* renamed from: u */
        /* synthetic */ int f99592u;

        /* renamed from: v */
        /* synthetic */ Object f99593v;

        /* renamed from: w */
        final /* synthetic */ JSONObject f99594w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONObject jSONObject, Continuation continuation) {
            super(3, continuation);
            this.f99594w = jSONObject;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m105187r(((Number) obj).intValue(), (String) obj2, (Continuation) obj3);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f99591t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC22691c.m117365b("\tgetListZaloSettings: json=" + this.f99594w + ", errorCode=" + this.f99592u + ", errorMsg=" + ((String) this.f99593v));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Object m105187r(int i11, String str, Continuation continuation) {
            f fVar = new f(this.f99594w, continuation);
            fVar.f99592u = i11;
            fVar.f99593v = str;
            return fVar.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f99595t;

        /* renamed from: u */
        /* synthetic */ Object f99596u;

        /* renamed from: v */
        final /* synthetic */ long f99597v;

        /* renamed from: w */
        final /* synthetic */ C20168b f99598w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18509p f99599x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hz.b$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC18509p f99600A;

            /* renamed from: t */
            long f99601t;

            /* renamed from: u */
            Object f99602u;

            /* renamed from: v */
            Object f99603v;

            /* renamed from: w */
            int f99604w;

            /* renamed from: x */
            final /* synthetic */ long f99605x;

            /* renamed from: y */
            final /* synthetic */ C20168b f99606y;

            /* renamed from: z */
            final /* synthetic */ C19684b f99607z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, C20168b c20168b, C19684b c19684b, InterfaceC18509p interfaceC18509p, Continuation continuation) {
                super(2, continuation);
                this.f99605x = j11;
                this.f99606y = c20168b;
                this.f99607z = c19684b;
                this.f99600A = interfaceC18509p;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f99605x, this.f99606y, this.f99607z, this.f99600A, continuation);
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0148  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0104 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                long currentTimeMillis;
                List list;
                Map map;
                InterfaceC20890c m105181q;
                Map map2;
                InterfaceC20890c m105181q2;
                InterfaceC20890c m105181q3;
                List list2;
                long j11;
                InterfaceC18509p interfaceC18509p;
                long j12;
                m142578e = AbstractC28298d.m142578e();
                switch (this.f99604w) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        AbstractC22691c.m117364a("\tgetListZaloSettings network call in " + (System.currentTimeMillis() - this.f99605x) + " ms");
                        currentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = this.f99607z.m103287c().keys();
                        AbstractC19074t.m100207e(keys, "response.settings.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            AbstractC19074t.m100207e(next, "key");
                            arrayList.add(next);
                        }
                        InterfaceC20890c m105181q4 = this.f99606y.m105181q();
                        JSONObject m103287c = this.f99607z.m103287c();
                        this.f99602u = arrayList;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 1;
                        Object mo109294o = m105181q4.mo109294o(m103287c, this);
                        if (mo109294o == m142578e) {
                            return m142578e;
                        }
                        list = arrayList;
                        obj = mo109294o;
                        map = (Map) obj;
                        m105181q = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = map;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 2;
                        if (m105181q.mo109289j(map, this) != m142578e) {
                            return m142578e;
                        }
                        map2 = map;
                        m105181q2 = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = map2;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 3;
                        if (m105181q2.mo109297r(list, this) == m142578e) {
                            return m142578e;
                        }
                        m105181q3 = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = null;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 4;
                        if (m105181q3.mo109291l(map2, this) == m142578e) {
                            return m142578e;
                        }
                        list2 = list;
                        AbstractC22691c.m117364a("\tsave specific keys in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                        if (AbstractC22690b.m117361d(list2)) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            InterfaceC20890c m105181q5 = this.f99606y.m105181q();
                            this.f99602u = null;
                            this.f99601t = currentTimeMillis2;
                            this.f99604w = 5;
                            obj = m105181q5.mo109287h(this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            j11 = currentTimeMillis2;
                            JSONObject jSONObject = (JSONObject) obj;
                            interfaceC18509p = this.f99600A;
                            if (interfaceC18509p != null) {
                                this.f99601t = j11;
                                this.f99604w = 6;
                                obj = interfaceC18509p.mo240pC(jSONObject, this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                j12 = j11;
                                j11 = j12;
                            }
                            AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - j11) + " ms");
                        }
                        return C24848g0.f119245a;
                    case 1:
                        currentTimeMillis = this.f99601t;
                        List list3 = (List) this.f99602u;
                        AbstractC24862s.m129228b(obj);
                        list = list3;
                        map = (Map) obj;
                        m105181q = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = map;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 2;
                        if (m105181q.mo109289j(map, this) != m142578e) {
                        }
                        break;
                    case 2:
                        currentTimeMillis = this.f99601t;
                        map2 = (Map) this.f99603v;
                        list = (List) this.f99602u;
                        AbstractC24862s.m129228b(obj);
                        m105181q2 = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = map2;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 3;
                        if (m105181q2.mo109297r(list, this) == m142578e) {
                        }
                        m105181q3 = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = null;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 4;
                        if (m105181q3.mo109291l(map2, this) == m142578e) {
                        }
                        break;
                    case 3:
                        currentTimeMillis = this.f99601t;
                        map2 = (Map) this.f99603v;
                        list = (List) this.f99602u;
                        AbstractC24862s.m129228b(obj);
                        m105181q3 = this.f99606y.m105181q();
                        this.f99602u = list;
                        this.f99603v = null;
                        this.f99601t = currentTimeMillis;
                        this.f99604w = 4;
                        if (m105181q3.mo109291l(map2, this) == m142578e) {
                        }
                        break;
                    case 4:
                        currentTimeMillis = this.f99601t;
                        list2 = (List) this.f99602u;
                        AbstractC24862s.m129228b(obj);
                        AbstractC22691c.m117364a("\tsave specific keys in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                        if (AbstractC22690b.m117361d(list2)) {
                        }
                        return C24848g0.f119245a;
                    case 5:
                        j11 = this.f99601t;
                        AbstractC24862s.m129228b(obj);
                        JSONObject jSONObject2 = (JSONObject) obj;
                        interfaceC18509p = this.f99600A;
                        if (interfaceC18509p != null) {
                        }
                        AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - j11) + " ms");
                        return C24848g0.f119245a;
                    case 6:
                        j12 = this.f99601t;
                        AbstractC24862s.m129228b(obj);
                        j11 = j12;
                        AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - j11) + " ms");
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j11, C20168b c20168b, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f99597v = j11;
            this.f99598w = c20168b;
            this.f99599x = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            g gVar = new g(this.f99597v, this.f99598w, this.f99599x, continuation);
            gVar.f99596u = obj;
            return gVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99595t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19684b c19684b = (C19684b) this.f99596u;
                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                a aVar = new a(this.f99597v, this.f99598w, c19684b, this.f99599x, null);
                this.f99595t = 1;
                if (BuildersKt.m112534g(m112680b, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C19684b c19684b, Continuation continuation) {
            return ((g) mo238a(c19684b, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f99608s;

        /* renamed from: t */
        Object f99609t;

        /* renamed from: u */
        long f99610u;

        /* renamed from: v */
        /* synthetic */ Object f99611v;

        /* renamed from: x */
        int f99613x;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f99611v = obj;
            this.f99613x |= Integer.MIN_VALUE;
            return C20168b.this.mo105173j(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f99614t;

        /* renamed from: u */
        /* synthetic */ int f99615u;

        /* renamed from: v */
        /* synthetic */ Object f99616v;

        i(Continuation continuation) {
            super(3, continuation);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m105190r(((Number) obj).intValue(), (String) obj2, (Continuation) obj3);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f99614t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC22691c.m117365b("\tpushLogZaloSettings: errorCode=" + this.f99615u + ", errorMsg=" + ((String) this.f99616v));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Object m105190r(int i11, String str, Continuation continuation) {
            i iVar = new i(continuation);
            iVar.f99615u = i11;
            iVar.f99616v = str;
            return iVar.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f99617t;

        /* renamed from: u */
        final /* synthetic */ long f99618u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j11, Continuation continuation) {
            super(2, continuation);
            this.f99618u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f99618u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f99617t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC22691c.m117368e("\tpushLogZaloSettings: network call success in " + (System.currentTimeMillis() - this.f99618u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C19683a c19683a, Continuation continuation) {
            return ((j) mo238a(c19683a, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC29096d {

        /* renamed from: A */
        int f99619A;

        /* renamed from: s */
        Object f99620s;

        /* renamed from: t */
        Object f99621t;

        /* renamed from: u */
        Object f99622u;

        /* renamed from: v */
        Object f99623v;

        /* renamed from: w */
        long f99624w;

        /* renamed from: x */
        long f99625x;

        /* renamed from: y */
        /* synthetic */ Object f99626y;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f99626y = obj;
            this.f99619A |= Integer.MIN_VALUE;
            return C20168b.this.mo105174k(null, null, this);
        }
    }

    /* renamed from: hz.b$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {
        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20892e mo12V4() {
            File file = new File(new File(C20168b.this.f99544a.getNoBackupFilesDir(), "leveldb-databases"), AbstractC19074t.m100216n("/remote-config/", C20168b.this.f99545b));
            file.mkdirs();
            C20892e.a aVar = C20892e.Companion;
            Context context = C20168b.this.f99544a;
            String str = C20168b.this.f99545b;
            String absolutePath = file.getAbsolutePath();
            AbstractC19074t.m100207e(absolutePath, "configDbDir.absolutePath");
            C20892e m109323a = aVar.m109323a(context, str, absolutePath);
            C20168b.this.f99550g = true;
            return m109323a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hz.b$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f99629t;

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
            AbstractC28298d.m142578e();
            if (this.f99629t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC21970a.m114741j(System.currentTimeMillis());
                AbstractC21970a.m114742k(0L);
                AbstractC21970a.m114738g(-1);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20168b(Context context, String str, InterfaceC21766a interfaceC21766a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        this.f99544a = context;
        this.f99545b = str;
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f99546c = m145994a;
        this.f99547d = AbstractC29233h.m145991b(m145994a, new l());
        this.f99548e = new C21418c(interfaceC21766a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final InterfaceC20890c m105181q() {
        return (InterfaceC20890c) this.f99547d.getValue();
    }

    /* renamed from: r */
    private final Object m105182r(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new m(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: a */
    public long mo105165a(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        return m105181q().mo109280a(str, j11);
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: b */
    public String mo105166b(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "fallback");
        return m105181q().mo109281b(str, str2);
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: c */
    public double mo105167c(String str, double d11) {
        AbstractC19074t.m100208f(str, "key");
        return m105181q().mo109282c(str, d11);
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: d */
    public int mo105168d(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        return m105181q().mo109283d(str, i11);
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: e */
    public void mo105169e() {
        AbstractC22691c.m117364a("deInit");
        if (this.f99550g) {
            m105181q().mo109284e();
        }
        this.f99546c.m145993b();
        this.f99550g = false;
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: g */
    public JSONObject mo105170g(String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jSONObject, "fallback");
        return m105181q().mo109286g(str, jSONObject);
    }

    @Override // p222hz.InterfaceC20167a
    /* renamed from: h */
    public JSONObject mo105171h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC22691c.m117364a("parseManualLoginSettings start ###########");
        if (!jSONObject.isNull("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            InterfaceC20890c m105181q = m105181q();
            AbstractC19074t.m100207e(jSONObject2, "settings");
            Map mo109292m = m105181q.mo109292m(jSONObject2);
            m105181q().mo109296q(mo109292m);
            m105181q().mo109293n(mo109292m);
            jSONObject = AbstractC22690b.m117358a(jSONObject);
        }
        AbstractC22691c.m117364a("parseManualLoginSettings in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        AbstractC22691c.m117364a("parseManualLoginSettings end ###########");
        return jSONObject;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0261 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ce -> B:36:0x01d6). Please report as a decompilation issue!!! */
    @Override // p222hz.InterfaceC20167a
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo105172i(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        a aVar;
        Object m142578e;
        C20168b c20168b;
        LinkedHashMap linkedHashMap;
        C19059j0 c19059j0;
        C19055h0 c19055h0;
        long j11;
        C19051f0 c19051f0;
        Object obj;
        a aVar2;
        C19051f0 c19051f02;
        InterfaceC18509p interfaceC18509p2;
        C19051f0 c19051f03;
        C19059j0 c19059j02;
        InterfaceC18509p interfaceC18509p3;
        C19055h0 c19055h02;
        C19051f0 c19051f04;
        C20168b c20168b2;
        long j12;
        LinkedHashMap linkedHashMap2;
        b bVar;
        String str;
        Object obj2;
        c cVar;
        String str2;
        long currentTimeMillis;
        InterfaceC18509p interfaceC18509p4;
        long j13;
        C20168b c20168b3;
        Map map;
        long currentTimeMillis2;
        InterfaceC20890c m105181q;
        InterfaceC18509p interfaceC18509p5;
        C20168b c20168b4;
        InterfaceC20890c m105181q2;
        InterfaceC18509p interfaceC18509p6;
        long j14;
        InterfaceC18509p interfaceC18509p7;
        C20168b c20168b5;
        long j15;
        CoroutineDispatcher m112680b;
        d dVar;
        long j16;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f99554D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f99554D = i11 - Integer.MIN_VALUE;
                Object obj3 = aVar.f99552B;
                m142578e = AbstractC28298d.m142578e();
                String str3 = " ms";
                switch (aVar.f99554D) {
                    case 0:
                        AbstractC24862s.m129228b(obj3);
                        if (this.f99549f) {
                            return C24848g0.f119245a;
                        }
                        this.f99549f = true;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        AbstractC22691c.m117364a("fetchAllAndActive start ###########");
                        C19051f0 c19051f05 = new C19051f0();
                        c19051f05.f94928p = true;
                        C19051f0 c19051f06 = new C19051f0();
                        C19055h0 c19055h03 = new C19055h0();
                        c19055h03.f94931p = 1;
                        C19059j0 c19059j03 = new C19059j0();
                        c19059j03.f94941p = "";
                        c20168b = this;
                        linkedHashMap = new LinkedHashMap();
                        c19059j0 = c19059j03;
                        c19055h0 = c19055h03;
                        j11 = currentTimeMillis3;
                        c19051f0 = c19051f06;
                        obj = m142578e;
                        aVar2 = aVar;
                        c19051f02 = c19051f05;
                        interfaceC18509p2 = interfaceC18509p;
                        if (c19051f02.f94928p) {
                            InterfaceC21417b interfaceC21417b = c20168b.f99548e;
                            int i12 = c19055h0.f94931p;
                            String str4 = (String) c19059j0.f94941p;
                            aVar2.f99555s = c20168b;
                            aVar2.f99556t = interfaceC18509p2;
                            aVar2.f99557u = c19051f02;
                            aVar2.f99558v = c19051f0;
                            aVar2.f99559w = c19055h0;
                            aVar2.f99560x = c19059j0;
                            aVar2.f99561y = linkedHashMap;
                            aVar2.f99562z = j11;
                            aVar2.f99554D = 1;
                            Object mo110916c = interfaceC21417b.mo110916c(i12, str4, aVar2);
                            if (mo110916c == obj) {
                                return obj;
                            }
                            long j17 = j11;
                            interfaceC18509p3 = interfaceC18509p2;
                            obj3 = mo110916c;
                            c19059j02 = c19059j0;
                            c20168b2 = c20168b;
                            c19051f03 = c19051f0;
                            c19055h02 = c19055h0;
                            c19051f04 = c19051f02;
                            aVar = aVar2;
                            m142578e = obj;
                            linkedHashMap2 = linkedHashMap;
                            j12 = j17;
                            C20168b c20168b6 = c20168b2;
                            str = str3;
                            InterfaceC18509p interfaceC18509p8 = interfaceC18509p3;
                            C19051f0 c19051f07 = c19051f04;
                            obj2 = m142578e;
                            C19051f0 c19051f08 = c19051f03;
                            C19055h0 c19055h04 = c19055h02;
                            bVar = new b(c19051f04, c19051f03, c20168b6, c19055h02, c19059j02, null);
                            cVar = new c(linkedHashMap2, c20168b6, c19051f07, c19059j02, c19055h04, null);
                            c20168b = c20168b6;
                            aVar.f99555s = c20168b;
                            aVar.f99556t = interfaceC18509p8;
                            aVar.f99557u = c19051f07;
                            aVar.f99558v = c19051f08;
                            c19055h0 = c19055h04;
                            aVar.f99559w = c19055h0;
                            aVar.f99560x = c19059j02;
                            aVar.f99561y = linkedHashMap2;
                            aVar.f99562z = j12;
                            aVar.f99554D = 2;
                            if (((AbstractC21416a) obj3).m110910a(bVar, cVar, aVar) != obj2) {
                                return obj2;
                            }
                            c19051f0 = c19051f08;
                            c19059j0 = c19059j02;
                            j11 = j12;
                            aVar2 = aVar;
                            linkedHashMap = linkedHashMap2;
                            c19051f02 = c19051f07;
                            obj = obj2;
                            interfaceC18509p2 = interfaceC18509p8;
                            str3 = str;
                            if (c19051f02.f94928p) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\tgetAllZaloSettingsPaging in ");
                                sb2.append(System.currentTimeMillis() - j11);
                                str2 = str3;
                                sb2.append(str2);
                                AbstractC22691c.m117364a(sb2.toString());
                                if (!c19051f0.f94928p) {
                                    currentTimeMillis = System.currentTimeMillis();
                                    InterfaceC20890c m105181q3 = c20168b.m105181q();
                                    aVar2.f99555s = c20168b;
                                    aVar2.f99556t = interfaceC18509p2;
                                    aVar2.f99557u = linkedHashMap;
                                    aVar2.f99558v = null;
                                    aVar2.f99559w = null;
                                    aVar2.f99560x = null;
                                    aVar2.f99561y = null;
                                    aVar2.f99562z = j11;
                                    aVar2.f99551A = currentTimeMillis;
                                    aVar2.f99554D = 3;
                                    if (m105181q3.mo109295p(linkedHashMap, aVar2) == obj) {
                                        return obj;
                                    }
                                    interfaceC18509p4 = interfaceC18509p2;
                                    j13 = j11;
                                    c20168b3 = c20168b;
                                    map = linkedHashMap;
                                    AbstractC22691c.m117364a("\tbackup config (sqlite) in " + (System.currentTimeMillis() - currentTimeMillis) + str2);
                                    currentTimeMillis2 = System.currentTimeMillis();
                                    m105181q = c20168b3.m105181q();
                                    aVar2.f99555s = c20168b3;
                                    aVar2.f99556t = interfaceC18509p4;
                                    aVar2.f99557u = map;
                                    aVar2.f99562z = j13;
                                    aVar2.f99551A = currentTimeMillis2;
                                    aVar2.f99554D = 4;
                                    if (m105181q.mo109298s(aVar2) != obj) {
                                        return obj;
                                    }
                                    interfaceC18509p5 = interfaceC18509p4;
                                    c20168b4 = c20168b3;
                                    m105181q2 = c20168b4.m105181q();
                                    aVar2.f99555s = c20168b4;
                                    aVar2.f99556t = interfaceC18509p5;
                                    aVar2.f99557u = null;
                                    aVar2.f99562z = j13;
                                    aVar2.f99551A = currentTimeMillis2;
                                    aVar2.f99554D = 5;
                                    if (m105181q2.mo109291l(map, aVar2) != obj) {
                                        return obj;
                                    }
                                    long j18 = j13;
                                    interfaceC18509p6 = interfaceC18509p5;
                                    j14 = j18;
                                    AbstractC22691c.m117364a("\tsave leveldb config in " + (System.currentTimeMillis() - currentTimeMillis2) + str2);
                                    aVar2.f99555s = c20168b4;
                                    aVar2.f99556t = interfaceC18509p6;
                                    aVar2.f99562z = j14;
                                    aVar2.f99554D = 6;
                                    if (c20168b4.m105182r(aVar2) != obj) {
                                        return obj;
                                    }
                                    interfaceC18509p7 = interfaceC18509p6;
                                    c20168b5 = c20168b4;
                                    j15 = j14;
                                    long currentTimeMillis4 = System.currentTimeMillis();
                                    m112680b = Dispatchers.m112680b();
                                    dVar = new d(interfaceC18509p7, c20168b5, null);
                                    aVar2.f99555s = c20168b5;
                                    aVar2.f99556t = null;
                                    aVar2.f99562z = j15;
                                    aVar2.f99551A = currentTimeMillis4;
                                    aVar2.f99554D = 7;
                                    if (BuildersKt.m112534g(m112680b, dVar, aVar2) != obj) {
                                        return obj;
                                    }
                                    j16 = currentTimeMillis4;
                                    AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - j16) + str2);
                                    c20168b = c20168b5;
                                    j11 = j15;
                                }
                                c20168b.f99549f = false;
                                AbstractC22691c.m117364a("fetchAllAndActive in " + (System.currentTimeMillis() - j11) + str2);
                                AbstractC22691c.m117364a("fetchAllAndActive end ###########");
                                return C24848g0.f119245a;
                            }
                        }
                    case 1:
                        long j19 = aVar.f99562z;
                        ?? r42 = (Map) aVar.f99561y;
                        C19059j0 c19059j04 = (C19059j0) aVar.f99560x;
                        C19055h0 c19055h05 = (C19055h0) aVar.f99559w;
                        c19051f03 = (C19051f0) aVar.f99558v;
                        C19051f0 c19051f09 = (C19051f0) aVar.f99557u;
                        InterfaceC18509p interfaceC18509p9 = (InterfaceC18509p) aVar.f99556t;
                        C20168b c20168b7 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        c19059j02 = c19059j04;
                        interfaceC18509p3 = interfaceC18509p9;
                        c19055h02 = c19055h05;
                        c19051f04 = c19051f09;
                        c20168b2 = c20168b7;
                        j12 = j19;
                        linkedHashMap2 = r42;
                        C20168b c20168b62 = c20168b2;
                        str = str3;
                        InterfaceC18509p interfaceC18509p82 = interfaceC18509p3;
                        C19051f0 c19051f072 = c19051f04;
                        obj2 = m142578e;
                        C19051f0 c19051f082 = c19051f03;
                        C19055h0 c19055h042 = c19055h02;
                        bVar = new b(c19051f04, c19051f03, c20168b62, c19055h02, c19059j02, null);
                        cVar = new c(linkedHashMap2, c20168b62, c19051f072, c19059j02, c19055h042, null);
                        c20168b = c20168b62;
                        aVar.f99555s = c20168b;
                        aVar.f99556t = interfaceC18509p82;
                        aVar.f99557u = c19051f072;
                        aVar.f99558v = c19051f082;
                        c19055h0 = c19055h042;
                        aVar.f99559w = c19055h0;
                        aVar.f99560x = c19059j02;
                        aVar.f99561y = linkedHashMap2;
                        aVar.f99562z = j12;
                        aVar.f99554D = 2;
                        if (((AbstractC21416a) obj3).m110910a(bVar, cVar, aVar) != obj2) {
                        }
                        break;
                    case 2:
                        long j21 = aVar.f99562z;
                        ?? r43 = (Map) aVar.f99561y;
                        C19059j0 c19059j05 = (C19059j0) aVar.f99560x;
                        c19055h0 = (C19055h0) aVar.f99559w;
                        C19051f0 c19051f010 = (C19051f0) aVar.f99558v;
                        C19051f0 c19051f011 = (C19051f0) aVar.f99557u;
                        InterfaceC18509p interfaceC18509p10 = (InterfaceC18509p) aVar.f99556t;
                        C20168b c20168b8 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        str = " ms";
                        interfaceC18509p2 = interfaceC18509p10;
                        linkedHashMap = r43;
                        obj = m142578e;
                        aVar2 = aVar;
                        c19051f02 = c19051f011;
                        c20168b = c20168b8;
                        c19059j0 = c19059j05;
                        j11 = j21;
                        c19051f0 = c19051f010;
                        str3 = str;
                        if (c19051f02.f94928p) {
                        }
                        break;
                    case 3:
                        long j22 = aVar.f99551A;
                        j13 = aVar.f99562z;
                        map = (Map) aVar.f99557u;
                        interfaceC18509p4 = (InterfaceC18509p) aVar.f99556t;
                        c20168b3 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        aVar2 = aVar;
                        str2 = " ms";
                        currentTimeMillis = j22;
                        obj = m142578e;
                        AbstractC22691c.m117364a("\tbackup config (sqlite) in " + (System.currentTimeMillis() - currentTimeMillis) + str2);
                        currentTimeMillis2 = System.currentTimeMillis();
                        m105181q = c20168b3.m105181q();
                        aVar2.f99555s = c20168b3;
                        aVar2.f99556t = interfaceC18509p4;
                        aVar2.f99557u = map;
                        aVar2.f99562z = j13;
                        aVar2.f99551A = currentTimeMillis2;
                        aVar2.f99554D = 4;
                        if (m105181q.mo109298s(aVar2) != obj) {
                        }
                        break;
                    case 4:
                        long j23 = aVar.f99551A;
                        j13 = aVar.f99562z;
                        map = (Map) aVar.f99557u;
                        InterfaceC18509p interfaceC18509p11 = (InterfaceC18509p) aVar.f99556t;
                        C20168b c20168b9 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        currentTimeMillis2 = j23;
                        interfaceC18509p5 = interfaceC18509p11;
                        c20168b4 = c20168b9;
                        obj = m142578e;
                        aVar2 = aVar;
                        str2 = " ms";
                        m105181q2 = c20168b4.m105181q();
                        aVar2.f99555s = c20168b4;
                        aVar2.f99556t = interfaceC18509p5;
                        aVar2.f99557u = null;
                        aVar2.f99562z = j13;
                        aVar2.f99551A = currentTimeMillis2;
                        aVar2.f99554D = 5;
                        if (m105181q2.mo109291l(map, aVar2) != obj) {
                        }
                        break;
                    case 5:
                        long j24 = aVar.f99551A;
                        long j25 = aVar.f99562z;
                        InterfaceC18509p interfaceC18509p12 = (InterfaceC18509p) aVar.f99556t;
                        c20168b4 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        currentTimeMillis2 = j24;
                        obj = m142578e;
                        aVar2 = aVar;
                        str2 = " ms";
                        j14 = j25;
                        interfaceC18509p6 = interfaceC18509p12;
                        AbstractC22691c.m117364a("\tsave leveldb config in " + (System.currentTimeMillis() - currentTimeMillis2) + str2);
                        aVar2.f99555s = c20168b4;
                        aVar2.f99556t = interfaceC18509p6;
                        aVar2.f99562z = j14;
                        aVar2.f99554D = 6;
                        if (c20168b4.m105182r(aVar2) != obj) {
                        }
                        break;
                    case 6:
                        long j26 = aVar.f99562z;
                        InterfaceC18509p interfaceC18509p13 = (InterfaceC18509p) aVar.f99556t;
                        c20168b5 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        interfaceC18509p7 = interfaceC18509p13;
                        j15 = j26;
                        obj = m142578e;
                        aVar2 = aVar;
                        str2 = " ms";
                        long currentTimeMillis42 = System.currentTimeMillis();
                        m112680b = Dispatchers.m112680b();
                        dVar = new d(interfaceC18509p7, c20168b5, null);
                        aVar2.f99555s = c20168b5;
                        aVar2.f99556t = null;
                        aVar2.f99562z = j15;
                        aVar2.f99551A = currentTimeMillis42;
                        aVar2.f99554D = 7;
                        if (BuildersKt.m112534g(m112680b, dVar, aVar2) != obj) {
                        }
                        break;
                    case 7:
                        j16 = aVar.f99551A;
                        j15 = aVar.f99562z;
                        C20168b c20168b10 = (C20168b) aVar.f99555s;
                        AbstractC24862s.m129228b(obj3);
                        c20168b5 = c20168b10;
                        str2 = " ms";
                        AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - j16) + str2);
                        c20168b = c20168b5;
                        j11 = j15;
                        c20168b.f99549f = false;
                        AbstractC22691c.m117364a("fetchAllAndActive in " + (System.currentTimeMillis() - j11) + str2);
                        AbstractC22691c.m117364a("fetchAllAndActive end ###########");
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        aVar = new a(continuation);
        Object obj32 = aVar.f99552B;
        m142578e = AbstractC28298d.m142578e();
        String str32 = " ms";
        switch (aVar.f99554D) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // p222hz.InterfaceC20167a
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo105173j(JSONObject jSONObject, Continuation continuation) {
        h hVar;
        Object obj;
        Object m142578e;
        int i11;
        long currentTimeMillis;
        JSONArray optJSONArray;
        C20168b c20168b;
        JSONObject jSONObject2;
        long j11;
        i iVar;
        j jVar;
        long j12;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f99613x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f99613x = i12 - Integer.MIN_VALUE;
                obj = hVar.f99611v;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f99613x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                j12 = hVar.f99610u;
                                AbstractC24862s.m129228b(obj);
                                AbstractC22691c.m117364a("forceSubmitConfig in " + (System.currentTimeMillis() - j12) + " ms");
                                AbstractC22691c.m117364a("forceSubmitConfig end ###########");
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j11 = hVar.f99610u;
                        AbstractC24862s.m129228b(obj);
                        iVar = new i(null);
                        jVar = new j(j11, null);
                        hVar.f99610u = j11;
                        hVar.f99613x = 3;
                        if (((AbstractC21416a) obj).m110910a(iVar, jVar, hVar) != m142578e) {
                            return m142578e;
                        }
                        j12 = j11;
                        AbstractC22691c.m117364a("forceSubmitConfig in " + (System.currentTimeMillis() - j12) + " ms");
                        AbstractC22691c.m117364a("forceSubmitConfig end ###########");
                        return C24848g0.f119245a;
                    }
                    currentTimeMillis = hVar.f99610u;
                    optJSONArray = (JSONArray) hVar.f99609t;
                    c20168b = (C20168b) hVar.f99608s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    AbstractC22691c.m117364a("forceSubmitConfig start ###########");
                    if (jSONObject == null) {
                        return C24848g0.f119245a;
                    }
                    if (!jSONObject.has("listKeyLv0")) {
                        return C24848g0.f119245a;
                    }
                    optJSONArray = jSONObject.optJSONArray("listKeyLv0");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        InterfaceC20890c m105181q = m105181q();
                        hVar.f99608s = this;
                        hVar.f99609t = optJSONArray;
                        hVar.f99610u = currentTimeMillis;
                        hVar.f99613x = 1;
                        obj = m105181q.mo109290k(optJSONArray, hVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c20168b = this;
                    } else {
                        return C24848g0.f119245a;
                    }
                }
                jSONObject2 = (JSONObject) obj;
                if (jSONObject2.length() == 0) {
                    AbstractC22691c.m117364a(AbstractC19074t.m100216n("\tforceSubmitConfig: no saved config for ", optJSONArray));
                }
                InterfaceC21417b interfaceC21417b = c20168b.f99548e;
                hVar.f99608s = null;
                hVar.f99609t = null;
                hVar.f99610u = currentTimeMillis;
                hVar.f99613x = 2;
                obj = interfaceC21417b.mo110914a(jSONObject2, hVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                j11 = currentTimeMillis;
                iVar = new i(null);
                jVar = new j(j11, null);
                hVar.f99610u = j11;
                hVar.f99613x = 3;
                if (((AbstractC21416a) obj).m110910a(iVar, jVar, hVar) != m142578e) {
                }
            }
        }
        hVar = new h(continuation);
        obj = hVar.f99611v;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f99613x;
        if (i11 == 0) {
        }
        jSONObject2 = (JSONObject) obj;
        if (jSONObject2.length() == 0) {
        }
        InterfaceC21417b interfaceC21417b2 = c20168b.f99548e;
        hVar.f99608s = null;
        hVar.f99609t = null;
        hVar.f99610u = currentTimeMillis;
        hVar.f99613x = 2;
        obj = interfaceC21417b2.mo110914a(jSONObject2, hVar);
        if (obj != m142578e) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a A[LOOP:0: B:25:0x0164->B:27:0x016a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // p222hz.InterfaceC20167a
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo105174k(JSONObject jSONObject, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        k kVar;
        Object m142578e;
        InterfaceC18509p interfaceC18509p2;
        JSONObject jSONObject2;
        C20168b c20168b;
        long j11;
        long j12;
        Object mo109288i;
        C20168b c20168b2;
        InterfaceC18509p interfaceC18509p3;
        InterfaceC20890c m105181q;
        JSONObject jSONObject3;
        Map map;
        InterfaceC18509p interfaceC18509p4;
        InterfaceC20890c m105181q2;
        JSONObject jSONObject4;
        ArrayList arrayList;
        Iterator<String> keys;
        long currentTimeMillis;
        InterfaceC18509p interfaceC18509p5;
        long j13;
        long j14;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f99619A;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f99619A = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f99626y;
                m142578e = AbstractC28298d.m142578e();
                switch (kVar.f99619A) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        AbstractC22691c.m117364a("forceUpdateConfig start ###########");
                        if (jSONObject != null && jSONObject.length() != 0) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            JSONObject m117362e = AbstractC22690b.m117362e(jSONObject);
                            InterfaceC20890c m105181q3 = m105181q();
                            kVar.f99620s = this;
                            interfaceC18509p2 = interfaceC18509p;
                            kVar.f99621t = interfaceC18509p2;
                            kVar.f99622u = m117362e;
                            kVar.f99624w = currentTimeMillis2;
                            kVar.f99625x = currentTimeMillis3;
                            kVar.f99619A = 1;
                            if (m105181q3.mo109285f(jSONObject, kVar) == m142578e) {
                                return m142578e;
                            }
                            jSONObject2 = m117362e;
                            c20168b = this;
                            j11 = currentTimeMillis3;
                            j12 = currentTimeMillis2;
                            InterfaceC20890c m105181q4 = c20168b.m105181q();
                            kVar.f99620s = c20168b;
                            kVar.f99621t = interfaceC18509p2;
                            kVar.f99622u = jSONObject2;
                            kVar.f99624w = j12;
                            kVar.f99625x = j11;
                            kVar.f99619A = 2;
                            mo109288i = m105181q4.mo109288i(kVar);
                            if (mo109288i != m142578e) {
                                return m142578e;
                            }
                            InterfaceC18509p interfaceC18509p6 = interfaceC18509p2;
                            c20168b2 = c20168b;
                            obj = mo109288i;
                            interfaceC18509p3 = interfaceC18509p6;
                            Map map2 = (Map) obj;
                            m105181q = c20168b2.m105181q();
                            kVar.f99620s = c20168b2;
                            kVar.f99621t = interfaceC18509p3;
                            kVar.f99622u = jSONObject2;
                            kVar.f99623v = map2;
                            kVar.f99624w = j12;
                            kVar.f99625x = j11;
                            kVar.f99619A = 3;
                            if (m105181q.mo109298s(kVar) != m142578e) {
                                return m142578e;
                            }
                            InterfaceC18509p interfaceC18509p7 = interfaceC18509p3;
                            jSONObject3 = jSONObject2;
                            map = map2;
                            interfaceC18509p4 = interfaceC18509p7;
                            m105181q2 = c20168b2.m105181q();
                            kVar.f99620s = c20168b2;
                            kVar.f99621t = interfaceC18509p4;
                            kVar.f99622u = jSONObject3;
                            kVar.f99623v = null;
                            kVar.f99624w = j12;
                            kVar.f99625x = j11;
                            kVar.f99619A = 4;
                            if (m105181q2.mo109291l(map, kVar) != m142578e) {
                                return m142578e;
                            }
                            jSONObject4 = jSONObject3;
                            AbstractC22691c.m117364a("\tsave specific keys in " + (System.currentTimeMillis() - j11) + " ms");
                            arrayList = new ArrayList();
                            keys = jSONObject4.keys();
                            AbstractC19074t.m100207e(keys, "settings.keys()");
                            while (keys.hasNext()) {
                                String next = keys.next();
                                AbstractC19074t.m100207e(next, "key");
                                arrayList.add(next);
                            }
                            if (AbstractC22690b.m117361d(arrayList)) {
                                currentTimeMillis = System.currentTimeMillis();
                                InterfaceC20890c m105181q5 = c20168b2.m105181q();
                                kVar.f99620s = interfaceC18509p4;
                                kVar.f99621t = null;
                                kVar.f99622u = null;
                                kVar.f99624w = j12;
                                kVar.f99625x = currentTimeMillis;
                                kVar.f99619A = 5;
                                Object mo109287h = m105181q5.mo109287h(kVar);
                                if (mo109287h == m142578e) {
                                    return m142578e;
                                }
                                InterfaceC18509p interfaceC18509p8 = interfaceC18509p4;
                                obj = mo109287h;
                                interfaceC18509p5 = interfaceC18509p8;
                                JSONObject jSONObject5 = (JSONObject) obj;
                                if (interfaceC18509p5 != null) {
                                    kVar.f99620s = null;
                                    kVar.f99624w = j12;
                                    kVar.f99625x = currentTimeMillis;
                                    kVar.f99619A = 6;
                                    obj = interfaceC18509p5.mo240pC(jSONObject5, kVar);
                                    if (obj == m142578e) {
                                        return m142578e;
                                    }
                                    j13 = currentTimeMillis;
                                    j14 = j12;
                                    j12 = j14;
                                    currentTimeMillis = j13;
                                }
                                AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                            }
                            AbstractC22691c.m117364a("forceUpdateConfig in " + (System.currentTimeMillis() - j12) + " ms");
                            AbstractC22691c.m117364a("forceUpdateConfig end ###########");
                            return C24848g0.f119245a;
                        }
                        return C24848g0.f119245a;
                    case 1:
                        j11 = kVar.f99625x;
                        j12 = kVar.f99624w;
                        jSONObject2 = (JSONObject) kVar.f99622u;
                        InterfaceC18509p interfaceC18509p9 = (InterfaceC18509p) kVar.f99621t;
                        C20168b c20168b3 = (C20168b) kVar.f99620s;
                        AbstractC24862s.m129228b(obj);
                        c20168b = c20168b3;
                        interfaceC18509p2 = interfaceC18509p9;
                        InterfaceC20890c m105181q42 = c20168b.m105181q();
                        kVar.f99620s = c20168b;
                        kVar.f99621t = interfaceC18509p2;
                        kVar.f99622u = jSONObject2;
                        kVar.f99624w = j12;
                        kVar.f99625x = j11;
                        kVar.f99619A = 2;
                        mo109288i = m105181q42.mo109288i(kVar);
                        if (mo109288i != m142578e) {
                        }
                        break;
                    case 2:
                        j11 = kVar.f99625x;
                        j12 = kVar.f99624w;
                        jSONObject2 = (JSONObject) kVar.f99622u;
                        interfaceC18509p3 = (InterfaceC18509p) kVar.f99621t;
                        c20168b2 = (C20168b) kVar.f99620s;
                        AbstractC24862s.m129228b(obj);
                        Map map22 = (Map) obj;
                        m105181q = c20168b2.m105181q();
                        kVar.f99620s = c20168b2;
                        kVar.f99621t = interfaceC18509p3;
                        kVar.f99622u = jSONObject2;
                        kVar.f99623v = map22;
                        kVar.f99624w = j12;
                        kVar.f99625x = j11;
                        kVar.f99619A = 3;
                        if (m105181q.mo109298s(kVar) != m142578e) {
                        }
                        break;
                    case 3:
                        j11 = kVar.f99625x;
                        j12 = kVar.f99624w;
                        map = (Map) kVar.f99623v;
                        jSONObject3 = (JSONObject) kVar.f99622u;
                        InterfaceC18509p interfaceC18509p10 = (InterfaceC18509p) kVar.f99621t;
                        C20168b c20168b4 = (C20168b) kVar.f99620s;
                        AbstractC24862s.m129228b(obj);
                        interfaceC18509p4 = interfaceC18509p10;
                        c20168b2 = c20168b4;
                        m105181q2 = c20168b2.m105181q();
                        kVar.f99620s = c20168b2;
                        kVar.f99621t = interfaceC18509p4;
                        kVar.f99622u = jSONObject3;
                        kVar.f99623v = null;
                        kVar.f99624w = j12;
                        kVar.f99625x = j11;
                        kVar.f99619A = 4;
                        if (m105181q2.mo109291l(map, kVar) != m142578e) {
                        }
                        break;
                    case 4:
                        j11 = kVar.f99625x;
                        j12 = kVar.f99624w;
                        jSONObject4 = (JSONObject) kVar.f99622u;
                        InterfaceC18509p interfaceC18509p11 = (InterfaceC18509p) kVar.f99621t;
                        c20168b2 = (C20168b) kVar.f99620s;
                        AbstractC24862s.m129228b(obj);
                        interfaceC18509p4 = interfaceC18509p11;
                        AbstractC22691c.m117364a("\tsave specific keys in " + (System.currentTimeMillis() - j11) + " ms");
                        arrayList = new ArrayList();
                        keys = jSONObject4.keys();
                        AbstractC19074t.m100207e(keys, "settings.keys()");
                        while (keys.hasNext()) {
                        }
                        if (AbstractC22690b.m117361d(arrayList)) {
                        }
                        AbstractC22691c.m117364a("forceUpdateConfig in " + (System.currentTimeMillis() - j12) + " ms");
                        AbstractC22691c.m117364a("forceUpdateConfig end ###########");
                        return C24848g0.f119245a;
                    case 5:
                        currentTimeMillis = kVar.f99625x;
                        j12 = kVar.f99624w;
                        interfaceC18509p5 = (InterfaceC18509p) kVar.f99620s;
                        AbstractC24862s.m129228b(obj);
                        JSONObject jSONObject52 = (JSONObject) obj;
                        if (interfaceC18509p5 != null) {
                        }
                        AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                        AbstractC22691c.m117364a("forceUpdateConfig in " + (System.currentTimeMillis() - j12) + " ms");
                        AbstractC22691c.m117364a("forceUpdateConfig end ###########");
                        return C24848g0.f119245a;
                    case 6:
                        j13 = kVar.f99625x;
                        j14 = kVar.f99624w;
                        AbstractC24862s.m129228b(obj);
                        j12 = j14;
                        currentTimeMillis = j13;
                        AbstractC22691c.m117364a("\thandleZaloSystemSetting in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                        AbstractC22691c.m117364a("forceUpdateConfig in " + (System.currentTimeMillis() - j12) + " ms");
                        AbstractC22691c.m117364a("forceUpdateConfig end ###########");
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f99626y;
        m142578e = AbstractC28298d.m142578e();
        switch (kVar.f99619A) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p222hz.InterfaceC20167a
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo105175l(JSONObject jSONObject, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        C20168b c20168b;
        InterfaceC18509p interfaceC18509p2;
        Object obj;
        long j11;
        f fVar;
        g gVar;
        long j12;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f99590y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f99590y = i12 - Integer.MIN_VALUE;
                Object obj2 = eVar.f99588w;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f99590y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            j12 = eVar.f99587v;
                            AbstractC24862s.m129228b(obj2);
                            AbstractC22691c.m117364a("forceGetConfig in " + (System.currentTimeMillis() - j12) + " ms");
                            AbstractC22691c.m117364a("forceGetConfig end ###########");
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j13 = eVar.f99587v;
                    InterfaceC18509p interfaceC18509p3 = (InterfaceC18509p) eVar.f99586u;
                    JSONObject jSONObject2 = (JSONObject) eVar.f99585t;
                    C20168b c20168b2 = (C20168b) eVar.f99584s;
                    AbstractC24862s.m129228b(obj2);
                    interfaceC18509p2 = interfaceC18509p3;
                    c20168b = c20168b2;
                    obj = obj2;
                    j11 = j13;
                    jSONObject = jSONObject2;
                } else {
                    AbstractC24862s.m129228b(obj2);
                    long currentTimeMillis = System.currentTimeMillis();
                    AbstractC22691c.m117364a("forceGetConfig start ###########");
                    if (jSONObject == null) {
                        return C24848g0.f119245a;
                    }
                    if (!jSONObject.has("listKeyLv0")) {
                        return C24848g0.f119245a;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("listKeyLv0");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        InterfaceC21417b interfaceC21417b = this.f99548e;
                        eVar.f99584s = this;
                        eVar.f99585t = jSONObject;
                        eVar.f99586u = interfaceC18509p;
                        eVar.f99587v = currentTimeMillis;
                        eVar.f99590y = 1;
                        Object mo110915b = interfaceC21417b.mo110915b(optJSONArray, eVar);
                        if (mo110915b == m142578e) {
                            return m142578e;
                        }
                        c20168b = this;
                        interfaceC18509p2 = interfaceC18509p;
                        obj = mo110915b;
                        j11 = currentTimeMillis;
                    } else {
                        return C24848g0.f119245a;
                    }
                }
                fVar = new f(jSONObject, null);
                gVar = new g(j11, c20168b, interfaceC18509p2, null);
                eVar.f99584s = null;
                eVar.f99585t = null;
                eVar.f99586u = null;
                eVar.f99587v = j11;
                eVar.f99590y = 2;
                if (((AbstractC21416a) obj).m110910a(fVar, gVar, eVar) != m142578e) {
                    return m142578e;
                }
                j12 = j11;
                AbstractC22691c.m117364a("forceGetConfig in " + (System.currentTimeMillis() - j12) + " ms");
                AbstractC22691c.m117364a("forceGetConfig end ###########");
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        Object obj22 = eVar.f99588w;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f99590y;
        if (i11 == 0) {
        }
        fVar = new f(jSONObject, null);
        gVar = new g(j11, c20168b, interfaceC18509p2, null);
        eVar.f99584s = null;
        eVar.f99585t = null;
        eVar.f99586u = null;
        eVar.f99587v = j11;
        eVar.f99590y = 2;
        if (((AbstractC21416a) obj).m110910a(fVar, gVar, eVar) != m142578e) {
        }
    }
}
