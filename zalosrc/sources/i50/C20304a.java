package i50;

import am.AbstractC0924m0;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import bp0.AbstractC3096i0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import j50.C20925e;
import j50.C20926f;
import j50.C20927g;
import j50.C20928h;
import j50.C20929i;
import j50.C20930j;
import j50.InterfaceC20921a;
import j50.InterfaceC20922b;
import j50.InterfaceC20923c;
import j50.InterfaceC20924d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.C21473a;
import k50.C21475c;
import k50.C21476d;
import k50.C21478f;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import l50.C22090l;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p348mi.AbstractC23304d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import r50.AbstractC25664a;
import un0.AbstractC27323a;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: i50.a */
/* loaded from: classes5.dex */
public final class C20304a implements InterfaceC20921a, InterfaceC20922b, InterfaceC20924d, InterfaceC20923c {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private static volatile C20304a f100260t;

    /* renamed from: p */
    private final InterfaceC20921a f100261p;

    /* renamed from: q */
    private final InterfaceC20922b f100262q;

    /* renamed from: r */
    private final InterfaceC20924d f100263r;

    /* renamed from: s */
    private final InterfaceC20923c f100264s;

    /* renamed from: i50.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20304a m106001a() {
            C20304a c20304a = C20304a.f100260t;
            if (c20304a == null) {
                synchronized (this) {
                    c20304a = new C20304a(new C20927g(), new C20928h(), new C20930j(null, 1, null), new C20929i());
                    C20304a.f100260t = c20304a;
                }
            }
            return c20304a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i50.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f100265s;

        /* renamed from: t */
        /* synthetic */ Object f100266t;

        /* renamed from: v */
        int f100268v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f100266t = obj;
            this.f100268v |= Integer.MIN_VALUE;
            return C20304a.this.mo105986f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i50.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f100269s;

        /* renamed from: t */
        /* synthetic */ Object f100270t;

        /* renamed from: v */
        int f100272v;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f100270t = obj;
            this.f100272v |= Integer.MIN_VALUE;
            return C20304a.this.m105993o(this);
        }
    }

    /* renamed from: i50.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f100273t;

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
            if (this.f100273t == 0) {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = new ArrayList();
                RingtoneManager ringtoneManager = new RingtoneManager(AbstractC3096i0.m15574y());
                ringtoneManager.setType(1);
                Cursor cursor = ringtoneManager.getCursor();
                while (cursor.moveToNext()) {
                    Uri uri = Uri.EMPTY;
                    if (ringtoneManager.getRingtoneUri(cursor.getPosition()) != null) {
                        uri = ringtoneManager.getRingtoneUri(cursor.getPosition());
                    }
                    Uri uri2 = uri;
                    String string = cursor.getString(1);
                    AbstractC19074t.m100205c(string);
                    AbstractC19074t.m100205c(uri2);
                    arrayList.add(new C21478f(string, uri2, 2, false, 8, null));
                }
                cursor.close();
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i50.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f100274s;

        /* renamed from: t */
        Object f100275t;

        /* renamed from: u */
        /* synthetic */ Object f100276u;

        /* renamed from: w */
        int f100278w;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f100276u = obj;
            this.f100278w |= Integer.MIN_VALUE;
            return C20304a.this.m106000z(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i50.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f100279s;

        /* renamed from: t */
        /* synthetic */ Object f100280t;

        /* renamed from: v */
        int f100282v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f100280t = obj;
            this.f100282v |= Integer.MIN_VALUE;
            return C20304a.this.m105977B(null, 0, false, this);
        }
    }

    public C20304a(InterfaceC20921a interfaceC20921a, InterfaceC20922b interfaceC20922b, InterfaceC20924d interfaceC20924d, InterfaceC20923c interfaceC20923c) {
        AbstractC19074t.m100208f(interfaceC20921a, "ringtoneAPI");
        AbstractC19074t.m100208f(interfaceC20922b, "ringtoneCache");
        AbstractC19074t.m100208f(interfaceC20924d, "ringtoneResultCache");
        AbstractC19074t.m100208f(interfaceC20923c, "ringtoneCategoryCache");
        this.f100261p = interfaceC20921a;
        this.f100262q = interfaceC20922b;
        this.f100263r = interfaceC20924d;
        this.f100264s = interfaceC20923c;
    }

    /* renamed from: q */
    public static /* synthetic */ int m105972q(C20304a c20304a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c20304a.m105994p(z11);
    }

    /* renamed from: s */
    private final int m105973s() {
        int m3565X6 = AbstractC0924m0.m3565X6();
        if (m3565X6 != 0 && m3565X6 != 1 && m3565X6 != 2) {
            return 0;
        }
        return m3565X6;
    }

    /* renamed from: t */
    private final int m105974t(boolean z11) {
        boolean m127128x;
        int m3565X6 = AbstractC0924m0.m3565X6();
        if (m3565X6 != 3 || !z11 || !m105999y() || !m105975x()) {
            if (m3565X6 != 3 || z11) {
                if (m3565X6 != 1 || !AbstractC23304d.f113339V1) {
                    if (m3565X6 == 2 && AbstractC23304d.f113339V1) {
                        if (z11) {
                            if (z11) {
                                String m3713c7 = AbstractC0924m0.m3713c7();
                                AbstractC19074t.m100207e(m3713c7, "getUriSelectedSystemRingtone(...)");
                                m127128x = AbstractC24341v.m127128x(m3713c7);
                                if (!m127128x) {
                                    return m3565X6;
                                }
                            }
                        } else {
                            return m3565X6;
                        }
                    }
                    return 0;
                }
                return m3565X6;
            }
            return m3565X6;
        }
        return m3565X6;
    }

    /* renamed from: x */
    private final boolean m105975x() {
        boolean m127128x;
        boolean m127128x2;
        boolean m127128x3;
        RingtoneData m105995r = m105995r();
        if (m105995r != null) {
            m127128x = AbstractC24341v.m127128x(m105995r.m58732d());
            if (!m127128x) {
                m127128x2 = AbstractC24341v.m127128x(m105995r.m58733e());
                if (!m127128x2) {
                    m127128x3 = AbstractC24341v.m127128x(m105995r.m58735g());
                    if (!(!m127128x3)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: A */
    public final void m105976A() {
        AbstractC0924m0.m4326wn("");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[LOOP:0: B:11:0x0067->B:13:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m105977B(String str, int i11, boolean z11, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i12;
        C20304a c20304a;
        Iterator it;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i13 = fVar.f100282v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f100282v = i13 - Integer.MIN_VALUE;
                Object obj = fVar.f100280t;
                m142578e = AbstractC28298d.m142578e();
                i12 = fVar.f100282v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c20304a = (C20304a) fVar.f100279s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!z11 && this.f100263r.mo105987g(str)) {
                        C21476d mo105984d = this.f100263r.mo105984d(str);
                        AbstractC19074t.m100205c(mo105984d);
                        return mo105984d;
                    }
                    InterfaceC20921a interfaceC20921a = this.f100261p;
                    fVar.f100279s = this;
                    fVar.f100282v = 1;
                    obj = interfaceC20921a.mo105988h(str, i11, fVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20304a = this;
                }
                C21476d c21476d = (C21476d) obj;
                it = c21476d.m111091b().iterator();
                while (it.hasNext()) {
                    c20304a.f100262q.mo105992l((C21475c) it.next());
                }
                c20304a.f100263r.mo105996u(c21476d);
                return c21476d;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f100280t;
        m142578e = AbstractC28298d.m142578e();
        i12 = fVar.f100282v;
        if (i12 == 0) {
        }
        C21476d c21476d2 = (C21476d) obj2;
        it = c21476d2.m111091b().iterator();
        while (it.hasNext()) {
        }
        c20304a.f100263r.mo105996u(c21476d2);
        return c21476d2;
    }

    /* renamed from: C */
    public final void m105978C(C21475c c21475c) {
        RingtoneData m58730a;
        AbstractC19074t.m100208f(c21475c, "data");
        AbstractC27323a.a aVar = AbstractC27323a.f128573d;
        m58730a = r1.m58730a((r20 & 1) != 0 ? r1.f56350a : null, (r20 & 2) != 0 ? r1.f56351b : null, (r20 & 4) != 0 ? r1.f56352c : null, (r20 & 8) != 0 ? r1.f56353d : null, (r20 & 16) != 0 ? r1.f56354e : false, (r20 & 32) != 0 ? r1.f56355f : 0, (r20 & 64) != 0 ? r1.f56356g : false, (r20 & 128) != 0 ? r1.f56357h : false, (r20 & 256) != 0 ? AbstractC25664a.m132549a(c21475c).f56358i : false);
        aVar.mo131586a();
        AbstractC0924m0.m4326wn(aVar.mo131597b(RingtoneData.Companion.serializer(), m58730a));
    }

    /* renamed from: D */
    public final void m105979D() {
        AbstractC0924m0.m4055nj(System.currentTimeMillis());
    }

    /* renamed from: E */
    public final boolean m105980E() {
        if (AbstractC23304d.f113343W1 != 0 && System.currentTimeMillis() - AbstractC0924m0.m4068o2() > AbstractC23304d.f113343W1 * 3600000) {
            return true;
        }
        return false;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: a */
    public Object mo105981a(Continuation continuation) {
        return this.f100261p.mo105981a(continuation);
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: b */
    public Object mo105982b(int i11, int i12, Continuation continuation) {
        return this.f100261p.mo105982b(i11, i12, continuation);
    }

    @Override // j50.InterfaceC20923c
    /* renamed from: c */
    public List mo105983c() {
        return this.f100264s.mo105983c();
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: d */
    public C21476d mo105984d(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return this.f100263r.mo105984d(str);
    }

    @Override // j50.InterfaceC20922b
    /* renamed from: e */
    public C21475c mo105985e(String str) {
        AbstractC19074t.m100208f(str, "songId");
        return this.f100262q.mo105985e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j50.InterfaceC20921a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo105986f(String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C20304a c20304a;
        boolean m127128x;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f100268v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f100268v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f100266t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f100268v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c20304a = (C20304a) bVar.f100265s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21475c mo105985e = this.f100262q.mo105985e(str);
                    if (mo105985e != null) {
                        m127128x = AbstractC24341v.m127128x(mo105985e.m111087d());
                        if (!m127128x) {
                            return mo105985e;
                        }
                    }
                    InterfaceC20921a interfaceC20921a = this.f100261p;
                    bVar.f100265s = this;
                    bVar.f100268v = 1;
                    obj = interfaceC20921a.mo105986f(str, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20304a = this;
                }
                C21475c c21475c = (C21475c) obj;
                c20304a.f100262q.mo105992l(c21475c);
                return c21475c;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f100266t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f100268v;
        if (i11 == 0) {
        }
        C21475c c21475c2 = (C21475c) obj2;
        c20304a.f100262q.mo105992l(c21475c2);
        return c21475c2;
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: g */
    public boolean mo105987g(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return this.f100263r.mo105987g(str);
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: h */
    public Object mo105988h(String str, int i11, Continuation continuation) {
        return this.f100261p.mo105988h(str, i11, continuation);
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: i */
    public Object mo105989i(String str, String str2, Continuation continuation) {
        return this.f100261p.mo105989i(str, str2, continuation);
    }

    @Override // j50.InterfaceC20923c
    /* renamed from: j */
    public void mo105990j(C21473a c21473a) {
        AbstractC19074t.m100208f(c21473a, "songCategory");
        this.f100264s.mo105990j(c21473a);
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: k */
    public Object mo105991k(int i11, String str, Continuation continuation) {
        return this.f100261p.mo105991k(i11, str, continuation);
    }

    @Override // j50.InterfaceC20922b
    /* renamed from: l */
    public void mo105992l(C21475c c21475c) {
        AbstractC19074t.m100208f(c21475c, "song");
        this.f100262q.mo105992l(c21475c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[LOOP:1: B:16:0x0077->B:18:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m105993o(Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C20304a c20304a;
        Iterator it;
        Iterator it2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f100272v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f100272v = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f100270t;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f100272v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c20304a = (C20304a) cVar.f100269s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List mo105983c = this.f100264s.mo105983c();
                    if (mo105983c == null) {
                        InterfaceC20921a interfaceC20921a = this.f100261p;
                        cVar.f100269s = this;
                        cVar.f100272v = 1;
                        obj = interfaceC20921a.mo105981a(cVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c20304a = this;
                    } else {
                        return mo105983c;
                    }
                }
                C20925e c20925e = (C20925e) obj;
                it = c20925e.m109450b().iterator();
                while (it.hasNext()) {
                    c20304a.f100262q.mo105992l((C21475c) it.next());
                }
                it2 = c20925e.m109449a().iterator();
                while (it2.hasNext()) {
                    c20304a.f100264s.mo105990j((C21473a) it2.next());
                }
                return c20925e.m109449a();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f100270t;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f100272v;
        if (i11 == 0) {
        }
        C20925e c20925e2 = (C20925e) obj2;
        it = c20925e2.m109450b().iterator();
        while (it.hasNext()) {
        }
        it2 = c20925e2.m109449a().iterator();
        while (it2.hasNext()) {
        }
        return c20925e2.m109449a();
    }

    /* renamed from: p */
    public final int m105994p(boolean z11) {
        int i11 = AbstractC23304d.f113267D1;
        if (i11 == 0) {
            return 0;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return 0;
            }
            return m105974t(z11);
        }
        return m105973s();
    }

    /* renamed from: r */
    public final RingtoneData m105995r() {
        try {
            String m4041n5 = AbstractC0924m0.m4041n5();
            if (m4041n5 == null || m4041n5.length() <= 0) {
                return null;
            }
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            aVar.mo131586a();
            return (RingtoneData) aVar.m139867d(RingtoneData.Companion.serializer(), m4041n5);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: u */
    public void mo105996u(C21476d c21476d) {
        AbstractC19074t.m100208f(c21476d, "searchResult");
        this.f100263r.mo105996u(c21476d);
    }

    /* renamed from: v */
    public final C21478f m105997v() {
        Uri uri;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_base_on_system_ringtone);
        try {
            uri = RingtoneManager.getActualDefaultRingtoneUri(MainApplication.Companion.m35500c(), 1);
        } catch (Exception unused) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = uri;
        AbstractC19074t.m100205c(m118743r0);
        AbstractC19074t.m100205c(uri2);
        return new C21478f(m118743r0, uri2, 1, false, 8, null);
    }

    /* renamed from: w */
    public final Object m105998w(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(null), continuation);
    }

    /* renamed from: y */
    public final boolean m105999y() {
        boolean m127149O;
        RingtoneData m105995r = m105995r();
        if (m105995r == null) {
            return false;
        }
        String m3683b7 = AbstractC0924m0.m3683b7();
        AbstractC19074t.m100205c(m3683b7);
        m127149O = AbstractC24342w.m127149O(m3683b7, m105995r.m58732d(), false, 2, null);
        if (!m127149O || !C22090l.f108732a.m115267j(m3683b7)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m106000z(C21473a c21473a, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        C20304a c20304a;
        Iterator it;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f100278w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f100278w = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f100276u;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f100278w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c21473a = (C21473a) eVar.f100275t;
                        c20304a = (C20304a) eVar.f100274s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!c21473a.m111073e()) {
                        return c21473a;
                    }
                    InterfaceC20921a interfaceC20921a = this.f100261p;
                    int m111074f = c21473a.m111074f();
                    int m111076h = c21473a.m111076h() + 1;
                    eVar.f100274s = this;
                    eVar.f100275t = c21473a;
                    eVar.f100278w = 1;
                    obj = interfaceC20921a.mo105982b(m111074f, m111076h, eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c20304a = this;
                }
                C20926f c20926f = (C20926f) obj;
                C21473a m111071b = c21473a.m111071b(c20926f.m109453c(), c20926f.m109452b(), c20926f.m109451a());
                it = c20926f.m109453c().iterator();
                while (it.hasNext()) {
                    c20304a.f100262q.mo105992l((C21475c) it.next());
                }
                c20304a.f100264s.mo105990j(m111071b);
                return m111071b;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f100276u;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f100278w;
        if (i11 == 0) {
        }
        C20926f c20926f2 = (C20926f) obj2;
        C21473a m111071b2 = c21473a.m111071b(c20926f2.m109453c(), c20926f2.m109452b(), c20926f2.m109451a());
        it = c20926f2.m109453c().iterator();
        while (it.hasNext()) {
        }
        c20304a.f100264s.mo105990j(m111071b2);
        return m111071b2;
    }
}
