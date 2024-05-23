package p249iz;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Process;
import com.zing.zalo.leveldb.AbstractC8942a;
import com.zing.zalo.leveldb.exception.LevelDBCorruptionException;
import com.zing.zalo.leveldb.exception.LevelDBException;
import com.zing.zalo.leveldb.exception.LevelDBIOException;
import com.zing.zalo.leveldb.exception.LevelDBInvalidArgumentException;
import com.zing.zalo.leveldb.exception.LevelDBNotFoundException;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23041d2;
import me0.AbstractC23044d5;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19173b;
import p248iy.AbstractC20887g;
import p334lz.AbstractC22689a;
import p334lz.AbstractC22690b;
import p334lz.AbstractC22691c;
import p334lz.AbstractC22692d;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p657xt.C30203a;
import p657xt.C30204b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: iz.e */
/* loaded from: classes4.dex */
public final class C20892e implements InterfaceC20890c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Context f102659a;

    /* renamed from: b */
    private String f102660b;

    /* renamed from: c */
    private final AbstractC8942a.b f102661c;

    /* renamed from: d */
    private final String f102662d;

    /* renamed from: e */
    private AbstractC8942a f102663e;

    /* renamed from: f */
    private final AtomicBoolean f102664f;

    /* renamed from: g */
    private final C29234i f102665g;

    /* renamed from: h */
    private final InterfaceC29232g f102666h;

    /* renamed from: iz.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20892e m109323a(Context context, String str, String str2) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "currentUid");
            AbstractC19074t.m100208f(str2, "dbPath");
            EnumC16739a enumC16739a = EnumC16739a.f84888e0;
            AbstractC23044d5.m118231d(context, enumC16739a);
            if (AbstractC23044d5.m118229b(enumC16739a)) {
                AbstractC8942a.b m47704a = AbstractC8942a.Companion.m47704a();
                m47704a.m47709a(true);
                m47704a.m47715g(AbstractC8942a.b.EnumC32711b.kSnappyCompressionAndAesEncrypt);
                m47704a.m47714f(AbstractC23352g.m122788d(str));
                return new C20892e(context, str, m47704a, str2);
            }
            throw new LevelDBException("RemoteConfig: Leveldb Native load error !");
        }
    }

    /* renamed from: iz.e$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102667t;

        /* renamed from: v */
        final /* synthetic */ Map f102669v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, Continuation continuation) {
            super(2, continuation);
            this.f102669v = map;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f102669v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102667t == 0) {
                AbstractC24862s.m129228b(obj);
                C20892e.this.mo109293n(this.f102669v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20889b mo12V4() {
            return new C20889b(C20892e.this.f102659a, C20892e.this.f102660b);
        }
    }

    /* renamed from: iz.e$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102671t;

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
            if (this.f102671t == 0) {
                AbstractC24862s.m129228b(obj);
                return C20892e.this.m109299A().mo109253h();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102673t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102673t == 0) {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                Map mo109253h = C20892e.this.m109299A().mo109253h();
                JSONObject jSONObject = new JSONObject();
                for (String str : mo109253h.keySet()) {
                    jSONObject.put(str, mo109253h.get(str));
                }
                JSONObject m117358a = AbstractC22690b.m117358a(jSONObject);
                AbstractC22691c.m117364a("\tLevelDb#getAllSavedConfigLegacyFormat() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_code", 0);
                jSONObject2.put("error_message", "Successful.");
                jSONObject2.put("settings", m117358a);
                return jSONObject2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102675t;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f102677v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C19059j0 c19059j0, Continuation continuation) {
            super(2, continuation);
            this.f102677v = c19059j0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f102677v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f102675t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20888a m109299A = C20892e.this.m109299A();
                JSONArray jSONArray = new JSONArray(new String[]{(String) this.f102677v.f94941p});
                this.f102675t = 1;
                obj = m109299A.mo109257r(jSONArray, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102678t;

        /* renamed from: v */
        final /* synthetic */ JSONObject f102680v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f102680v = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f102680v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102678t == 0) {
                AbstractC24862s.m129228b(obj);
                return C20892e.this.mo109292m(this.f102680v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102681t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102681t == 0) {
                AbstractC24862s.m129228b(obj);
                C20892e.this.m109316H();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.e$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102683t;

        /* renamed from: v */
        final /* synthetic */ List f102685v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, Continuation continuation) {
            super(2, continuation);
            this.f102685v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f102685v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102683t == 0) {
                AbstractC24862s.m129228b(obj);
                C20892e.this.m109317I(this.f102685v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20892e(Context context, String str, AbstractC8942a.b bVar, String str2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(bVar, "mConfiguration");
        AbstractC19074t.m100208f(str2, "mDbPath");
        this.f102659a = context;
        this.f102660b = str;
        this.f102661c = bVar;
        this.f102662d = str2;
        this.f102664f = new AtomicBoolean(false);
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f102665g = m145994a;
        this.f102666h = AbstractC29233h.m145991b(m145994a, new c());
        m109302D(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final InterfaceC20888a m109299A() {
        return (InterfaceC20888a) this.f102666h.getValue();
    }

    /* renamed from: B */
    private final void m109300B(LevelDBException levelDBException) {
        if (levelDBException instanceof LevelDBNotFoundException) {
            return;
        }
        AbstractC22691c.m117366c(levelDBException);
        boolean z11 = this.f102664f.get();
        if ((levelDBException.isRepairCorruption(levelDBException.getMessage()) || (levelDBException instanceof LevelDBCorruptionException)) && this.f102664f.compareAndSet(false, true)) {
            m109304F(true);
        }
        if (levelDBException instanceof LevelDBInvalidArgumentException) {
            AbstractC20887g.m109244v(101011, null, 2, null);
            AbstractC20887g.m109236n(101011, AbstractC19074t.m100216n("Invalid Exception - ", levelDBException), null, 0, 0L, 0, 60, null);
        } else {
            if (levelDBException instanceof LevelDBCorruptionException) {
                if (z11) {
                    AbstractC20887g.m109244v(101010, null, 2, null);
                    AbstractC20887g.m109236n(101010, AbstractC19074t.m100216n("Corruption Exception - ", levelDBException), null, 0, 0L, 0, 60, null);
                    return;
                }
                return;
            }
            if (levelDBException instanceof LevelDBIOException) {
                AbstractC20887g.m109244v(101008, null, 2, null);
                AbstractC20887g.m109236n(101008, AbstractC19074t.m100216n("IO Exception - ", levelDBException), null, 0, 0L, 0, 60, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m109301C(boolean z11) {
        boolean z12;
        AbstractC22691c.m117364a(AbstractC19074t.m100216n("open path: ", this.f102662d));
        try {
            this.f102663e = AbstractC8942a.Companion.m47706c(this.f102662d, this.f102661c);
            if (z11) {
                m109306J();
            } else {
                this.f102664f.set(false);
            }
        } catch (LevelDBException e11) {
            AbstractC22691c.m117364a("fail to open leveldb");
            AbstractC22691c.m117366c(e11);
            if (e11 instanceof LevelDBIOException) {
                LevelDBIOException levelDBIOException = (LevelDBIOException) e11;
                if (levelDBIOException.isLockByPid()) {
                    Context appContext = CoreUtility.getAppContext();
                    AbstractC19074t.m100207e(appContext, "getAppContext()");
                    String m117370a = AbstractC22692d.m117370a(appContext, levelDBIOException.getLockPid());
                    AbstractC20887g.m109244v(101005, null, 2, null);
                    AbstractC20887g.m109236n(101005, "open error: leveldb lock by " + levelDBIOException.getLockPid() + " - " + m117370a + " - currentPid:" + Process.myPid() + " - dbPath:" + this.f102662d, null, 0, 0L, 0, 60, null);
                } else {
                    AbstractC20887g.m109244v(101005, null, 2, null);
                    AbstractC20887g.m109236n(101005, AbstractC19074t.m100216n("Open Exception - ", e11), null, 0, 0L, 0, 60, null);
                }
            } else {
                if ((e11 instanceof LevelDBCorruptionException) && !this.f102664f.get()) {
                    z12 = true;
                    if (!this.f102664f.compareAndSet(false, true)) {
                        m109304F(z12);
                        return;
                    }
                    return;
                }
                AbstractC20887g.m109244v(101005, null, 2, null);
                AbstractC20887g.m109236n(101005, AbstractC19074t.m100216n("Open Exception - ", e11), null, 0, 0L, 0, 60, null);
            }
            z12 = false;
            if (!this.f102664f.compareAndSet(false, true)) {
            }
        }
    }

    /* renamed from: D */
    static /* synthetic */ void m109302D(C20892e c20892e, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c20892e.m109301C(z11);
    }

    /* renamed from: E */
    private final void m109303E() {
        AbstractC22691c.m117364a("reCreate leveldb");
        if (m109314y()) {
            File file = new File(this.f102662d);
            if (!file.exists()) {
                file.mkdirs();
            }
            m109301C(true);
        }
    }

    /* renamed from: F */
    private final void m109304F(final boolean z11) {
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: iz.d
            @Override // java.lang.Runnable
            public final void run() {
                C20892e.m109305G(C20892e.this, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m109305G(C20892e c20892e, boolean z11) {
        AbstractC19074t.m100208f(c20892e, "this$0");
        try {
            AbstractC22691c.m117364a("Start recoverDb");
            boolean m47707d = AbstractC8942a.Companion.m47707d(c20892e.f102662d, c20892e.f102661c);
            c20892e.m109313x();
            if (m47707d) {
                AbstractC20887g.m109217D(101012, null, 2, null);
                AbstractC20887g.m109236n(101012, AbstractC19074t.m100216n("repairDb success: ", c20892e.f102662d), null, 0, 0L, 0, 60, null);
                m109302D(c20892e, false, 1, null);
            } else {
                c20892e.m109303E();
            }
            AbstractC22691c.m117364a("End recoverDb");
        } catch (LevelDBException e11) {
            AbstractC22691c.m117364a("fail to recover leveldb");
            AbstractC22691c.m117366c(e11);
            AbstractC20887g.m109244v(101006, null, 2, null);
            AbstractC20887g.m109236n(101006, "Repair Exception - " + e11 + " - repair from corruption : " + z11, null, 0, 0L, 0, 60, null);
            c20892e.m109314y();
        } catch (Throwable th2) {
            AbstractC22691c.m117364a("fail to recover leveldb");
            AbstractC22691c.m117366c(th2);
        }
    }

    /* renamed from: J */
    private final void m109306J() {
        AbstractC22691c.m117364a("Start restoreLevelDb");
        mo109293n(m109299A().mo109253h());
        AbstractC20887g.m109217D(101013, null, 2, null);
        this.f102664f.compareAndSet(true, false);
        AbstractC22691c.m117364a("End restoreLevelDb");
    }

    /* renamed from: K */
    private final void m109307K(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i11++;
            if (value instanceof Boolean) {
                m109318L(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                m109319M(str, ((Number) value).doubleValue());
            } else if (value instanceof Integer) {
                m109320N(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                m109321O(str, ((Number) value).longValue());
            } else if (value instanceof String) {
                m109322P(str, (String) value);
            } else if (value instanceof JSONArray) {
                m109322P(str, ((JSONArray) value).toString());
            } else {
                AbstractC22691c.m117364a(AbstractC19074t.m100216n("Unsupported type: ", str));
            }
            C19173b.Companion.m100622a().m100620c(str, value);
        }
        AbstractC22691c.m117364a("\tLevelDb#saveConfig() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms with " + i11 + " keys");
    }

    /* renamed from: Q */
    private final void m109308Q() {
        if (!this.f102664f.get()) {
        } else {
            throw new LevelDBException("LevelDB warning: Cannot access to db while repairing !");
        }
    }

    /* renamed from: x */
    private final void m109313x() {
        try {
            AbstractC22691c.m117364a("close leveldb");
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.close();
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (IOException e11) {
            AbstractC22691c.m117364a("fail to close leveldb");
            AbstractC22691c.m117366c(e11);
        }
    }

    /* renamed from: y */
    private final boolean m109314y() {
        try {
            AbstractC22691c.m117364a("destroy leveldb");
            return AbstractC8942a.Companion.m47705b(this.f102662d);
        } catch (LevelDBException e11) {
            AbstractC22691c.m117364a("fail to destroy leveldb");
            AbstractC23041d2.m118210i(new File(this.f102662d));
            AbstractC22691c.m117366c(e11);
            AbstractC20887g.m109244v(101007, null, 2, null);
            AbstractC20887g.m109236n(101007, AbstractC19074t.m100216n("Destroy Exception - ", e11), null, 0, 0L, 0, 60, null);
            return false;
        } catch (Throwable th2) {
            AbstractC22691c.m117364a("fail to destroy leveldb");
            AbstractC22691c.m117366c(th2);
            return false;
        }
    }

    /* renamed from: z */
    private final Map m109315z(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : map.keySet()) {
            AbstractC22690b.m117360c(linkedHashMap, map.get(str), str);
        }
        return linkedHashMap;
    }

    /* renamed from: H */
    public void m109316H() {
        AbstractC8942a abstractC8942a;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            abstractC8942a = this.f102663e;
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
        if (abstractC8942a != null) {
            C30203a mo47687o = abstractC8942a.mo47687o();
            if (mo47687o != null) {
                mo47687o.m148961h();
                int i11 = 0;
                while (mo47687o.m148959f()) {
                    AbstractC8942a abstractC8942a2 = this.f102663e;
                    if (abstractC8942a2 != null) {
                        abstractC8942a2.mo47683d(mo47687o.m148956c());
                        i11++;
                        mo47687o.m148960g();
                    } else {
                        AbstractC19074t.m100223u("db");
                        throw null;
                    }
                }
                AbstractC22691c.m117364a(AbstractC19074t.m100216n("\tLevelDb#removeAllKeys() number keys deleted: ", Integer.valueOf(i11)));
                mo47687o.m148954a();
            }
            AbstractC22691c.m117364a("\tLevelDb#removeAllKeys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return;
        }
        AbstractC19074t.m100223u("db");
        throw null;
    }

    /* renamed from: I */
    public void m109317I(List list) {
        AbstractC8942a abstractC8942a;
        boolean m127120J;
        AbstractC19074t.m100208f(list, "keys");
        if (list.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            abstractC8942a = this.f102663e;
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
        if (abstractC8942a != null) {
            C30203a mo47687o = abstractC8942a.mo47687o();
            if (mo47687o != null) {
                mo47687o.m148961h();
                while (mo47687o.m148959f()) {
                    String m148956c = mo47687o.m148956c();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            if (m148956c != null) {
                                m127120J = AbstractC24341v.m127120J(m148956c, str, false, 2, null);
                                if (m127120J) {
                                    AbstractC8942a abstractC8942a2 = this.f102663e;
                                    if (abstractC8942a2 != null) {
                                        abstractC8942a2.mo47683d(m148956c);
                                    } else {
                                        AbstractC19074t.m100223u("db");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    mo47687o.m148960g();
                }
                mo47687o.m148954a();
            }
            AbstractC22691c.m117364a("\tLevelDb#removeLevel0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return;
        }
        AbstractC19074t.m100223u("db");
        throw null;
    }

    /* renamed from: L */
    public void m109318L(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.m47703v(str, AbstractC22689a.m117353a(z11));
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
    }

    /* renamed from: M */
    public void m109319M(String str, double d11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.m47703v(str, AbstractC22689a.m117354b(d11));
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
    }

    /* renamed from: N */
    public void m109320N(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.m47703v(str, AbstractC22689a.m117355c(i11));
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
    }

    /* renamed from: O */
    public void m109321O(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.m47703v(str, AbstractC22689a.m117356d(j11));
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
    }

    /* renamed from: P */
    public void m109322P(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "value");
        try {
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                abstractC8942a.m47703v(str, AbstractC22689a.m117357e(str2));
            } else {
                AbstractC19074t.m100223u("db");
                throw null;
            }
        } catch (LevelDBException e11) {
            m109300B(e11);
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
        }
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: a */
    public long mo109280a(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m109308Q();
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                byte[] mo47684h = abstractC8942a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 9) {
                        if (C30204b.m148965e(mo47684h) == 3) {
                            return C30204b.m148964d(mo47684h);
                        }
                        throw new LevelDBException("Invalid data type");
                    }
                    throw new LevelDBException("Invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            }
            AbstractC19074t.m100223u("db");
            throw null;
        } catch (LevelDBException e11) {
            m109300B(e11);
            AbstractC22691c.m117365b(AbstractC19074t.m100216n("getLong: when read data : ", e11.getMessage()));
            return j11;
        } catch (IPreferences.PreferencesExceptionNotFound unused) {
            AbstractC22691c.m117369f("getLong: value for " + str + " not found");
            return j11;
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
            return j11;
        }
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: b */
    public String mo109281b(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "fallback");
        try {
            m109308Q();
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                byte[] mo47684h = abstractC8942a.mo47684h(str);
                if (mo47684h != null) {
                    if (C30204b.m148965e(mo47684h) == 4) {
                        int length = mo47684h.length - 1;
                        Charset charset = StandardCharsets.UTF_8;
                        AbstractC19074t.m100207e(charset, "UTF_8");
                        return new String(mo47684h, 1, length, charset);
                    }
                    throw new LevelDBException("Invalid data type");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            }
            AbstractC19074t.m100223u("db");
            throw null;
        } catch (LevelDBException e11) {
            m109300B(e11);
            AbstractC22691c.m117365b(AbstractC19074t.m100216n("getString() when read data : ", e11.getMessage()));
            return str2;
        } catch (IPreferences.PreferencesExceptionNotFound unused) {
            AbstractC22691c.m117369f("getString: value for " + str + " not found");
            return str2;
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
            return str2;
        }
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: c */
    public double mo109282c(String str, double d11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m109308Q();
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                byte[] mo47684h = abstractC8942a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 9) {
                        if (C30204b.m148965e(mo47684h) == 5) {
                            return C30204b.f140319a.m148966b(mo47684h);
                        }
                        throw new LevelDBException("Invalid data type");
                    }
                    throw new LevelDBException("Invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            }
            AbstractC19074t.m100223u("db");
            throw null;
        } catch (LevelDBException e11) {
            m109300B(e11);
            AbstractC22691c.m117365b(AbstractC19074t.m100216n("getDouble: when read data : ", e11.getMessage()));
            return d11;
        } catch (IPreferences.PreferencesExceptionNotFound unused) {
            AbstractC22691c.m117369f("getDouble: value for " + str + " not found");
            return d11;
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
            return d11;
        }
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: d */
    public int mo109283d(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m109308Q();
            AbstractC8942a abstractC8942a = this.f102663e;
            if (abstractC8942a != null) {
                byte[] mo47684h = abstractC8942a.mo47684h(str);
                if (mo47684h != null) {
                    if (mo47684h.length == 5) {
                        if (C30204b.m148965e(mo47684h) == 2) {
                            return C30204b.m148963c(mo47684h);
                        }
                        throw new LevelDBException("Invalid data type");
                    }
                    throw new LevelDBException("Invalid data length");
                }
                throw new IPreferences.PreferencesExceptionNotFound();
            }
            AbstractC19074t.m100223u("db");
            throw null;
        } catch (LevelDBException e11) {
            m109300B(e11);
            AbstractC22691c.m117365b(AbstractC19074t.m100216n("getInt: when read data : ", e11.getMessage()));
            return i11;
        } catch (IPreferences.PreferencesExceptionNotFound unused) {
            AbstractC22691c.m117369f("getInt: value for " + str + " not found");
            return i11;
        } catch (Exception e12) {
            AbstractC22691c.m117366c(e12);
            return i11;
        }
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: e */
    public void mo109284e() {
        AbstractC22691c.m117364a("deInit leveldb");
        this.f102665g.m145993b();
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: f */
    public Object mo109285f(JSONObject jSONObject, Continuation continuation) {
        Object m142578e;
        Object mo109252f = m109299A().mo109252f(jSONObject, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo109252f == m142578e) {
            return mo109252f;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:            if (r12 == null) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // p249iz.InterfaceC20890c
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject mo109286g(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        List m127132B0;
        Object m112536b;
        JSONObject optJSONObject;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jSONObject, "fallback");
        if (str.length() != 0 && !AbstractC19074t.m100204b(str, "features") && !AbstractC19074t.m100204b(str, "features@")) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                int i11 = 0;
                m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"@"}, false, 0, 6, null);
                int size = m127132B0.size();
                C19059j0 c19059j0 = new C19059j0();
                Object obj = m127132B0.get(0);
                c19059j0.f94941p = obj;
                if (size > 1 && AbstractC19074t.m100204b(obj, "features")) {
                    c19059j0.f94941p = ((String) c19059j0.f94941p) + '@' + ((String) m127132B0.get(1));
                    i11 = 1;
                }
                m112536b = BuildersKt__BuildersKt.m112536b(null, new f(c19059j0, null), 1, null);
                jSONObject2 = ((JSONObject) m112536b).optJSONObject((String) c19059j0.f94941p);
                while (i11 < size - 1) {
                    i11++;
                    if (jSONObject2 == null) {
                        jSONObject2 = null;
                    } else {
                        jSONObject2 = jSONObject2.optJSONObject((String) m127132B0.get(i11));
                    }
                    if (jSONObject2 == null) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("RemoteConfig.getJSONObject() in ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                sb2.append(" ms, result: ");
                if (jSONObject2 != null) {
                    optJSONObject = jSONObject2.optJSONObject(str);
                }
                optJSONObject = jSONObject;
                sb2.append(optJSONObject);
                AbstractC22691c.m117364a(sb2.toString());
            } catch (LevelDBException e11) {
                m109300B(e11);
                jSONObject2 = jSONObject;
                if (jSONObject2 != null) {
                }
            } catch (Exception e12) {
                AbstractC22691c.m117366c(e12);
                jSONObject2 = jSONObject;
                if (jSONObject2 != null) {
                }
            }
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            return jSONObject;
        }
        return jSONObject;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: h */
    public Object mo109287h(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new e(null), continuation);
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: i */
    public Object mo109288i(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(null), continuation);
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: j */
    public Object mo109289j(Map map, Continuation continuation) {
        Object m142578e;
        Object mo109256q = m109299A().mo109256q(map, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo109256q == m142578e) {
            return mo109256q;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: k */
    public Object mo109290k(JSONArray jSONArray, Continuation continuation) {
        return m109299A().mo109257r(jSONArray, continuation);
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: l */
    public Object mo109291l(Map map, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new b(map, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: m */
    public Map mo109292m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                linkedHashMap.put(next, JSONObject.wrap(jSONObject.get(next)));
            }
        }
        AbstractC22691c.m117364a("\tpreprocessConfig(): done with size " + linkedHashMap.size() + " in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return linkedHashMap;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: n */
    public void mo109293n(Map map) {
        AbstractC19074t.m100208f(map, "level0Pairs");
        m109307K(m109315z(map));
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: o */
    public Object mo109294o(JSONObject jSONObject, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112679a(), new g(jSONObject, null), continuation);
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: p */
    public Object mo109295p(Map map, Continuation continuation) {
        Object m142578e;
        Object mo109254i = m109299A().mo109254i(map, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo109254i == m142578e) {
            return mo109254i;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: q */
    public void mo109296q(Map map) {
        AbstractC19074t.m100208f(map, "level0Pairs");
        m109299A().mo109255o(map);
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: r */
    public Object mo109297r(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new i(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20890c
    /* renamed from: s */
    public Object mo109298s(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new h(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }
}
