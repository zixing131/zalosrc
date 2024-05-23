package lf0;

import android.content.Context;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.InputStream;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import li.AbstractC22490a;
import me0.AbstractC23160o0;
import me0.AbstractC23238v2;
import mf0.C23287a;
import nf0.C23741a;
import of0.C24248a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p023av.EnumC2383a;
import p023av.InterfaceC2384b;
import p189gv.C19609h;
import p245iv.C20837a;
import pf0.C24745a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qf0.C25256c;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import wf0.C28964i;
import xf0.C29620a;
import xf0.InterfaceC29621b;
import yf0.C30933c0;

/* renamed from: lf0.b */
/* loaded from: classes5.dex */
public final class C22472b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Context f109888a;

    /* renamed from: b */
    private final C30933c0 f109889b;

    /* renamed from: c */
    private final InterfaceC2384b f109890c;

    /* renamed from: d */
    private final C19609h f109891d;

    /* renamed from: e */
    private final String f109892e;

    /* renamed from: f */
    private String f109893f;

    /* renamed from: g */
    private JSONObject f109894g;

    /* renamed from: h */
    private String f109895h;

    /* renamed from: i */
    private String f109896i;

    /* renamed from: j */
    private final String f109897j;

    /* renamed from: k */
    private final InterfaceC24854k f109898k;

    /* renamed from: l */
    private final InterfaceC24854k f109899l;

    /* renamed from: m */
    private final String f109900m;

    /* renamed from: n */
    private final String f109901n;

    /* renamed from: o */
    private final String f109902o;

    /* renamed from: p */
    private final String f109903p;

    /* renamed from: q */
    private final File f109904q;

    /* renamed from: r */
    private final File f109905r;

    /* renamed from: s */
    private final InterfaceC24854k f109906s;

    /* renamed from: t */
    private final CoroutineScope f109907t;

    /* renamed from: lf0.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: lf0.b$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC29621b {
        b() {
        }

        @Override // xf0.InterfaceC29621b
        /* renamed from: a */
        public void mo116200a(int i11, String str) {
            C22472b.this.m116196u(i11, str);
            C22472b.this.m116198y("createMaDownloadHelper: An error occurred: error code = " + i11 + ", " + str);
        }

        @Override // xf0.InterfaceC29621b
        /* renamed from: b */
        public void mo116201b(String str) {
            AbstractC19074t.m100208f(str, "savedFilePath");
            C22472b c22472b = C22472b.this;
            C22472b.m116178x(c22472b, AbstractC22474d.m116214b(str, c22472b.m116195t()), null, 2, null);
        }
    }

    /* renamed from: lf0.b$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29620a mo12V4() {
            return C22472b.this.m116172i();
        }
    }

    /* renamed from: lf0.b$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22473c mo12V4() {
            return new C22473c(C22472b.this);
        }
    }

    /* renamed from: lf0.b$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: lf0.b$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {

            /* renamed from: q */
            final /* synthetic */ C22472b f109912q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CoroutineExceptionHandler.Key key, C22472b c22472b) {
                super(key);
                this.f109912q = c22472b;
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            /* renamed from: G */
            public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
                AbstractC22490a.m116282e(new Exception(this.f109912q.f109892e, th2));
            }
        }

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineExceptionHandler mo12V4() {
            return new a(CoroutineExceptionHandler.f105837l, C22472b.this);
        }
    }

    public C22472b(Context context, C30933c0 c30933c0, InterfaceC2384b interfaceC2384b, C19609h c19609h) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        String m102616j;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c30933c0, "maViewModel");
        AbstractC19074t.m100208f(interfaceC2384b, "storageRepository");
        this.f109888a = context;
        this.f109889b = c30933c0;
        this.f109890c = interfaceC2384b;
        this.f109891d = c19609h;
        String simpleName = C22472b.class.getSimpleName();
        this.f109892e = simpleName;
        String str = "";
        this.f109893f = "";
        this.f109894g = new JSONObject();
        this.f109896i = "";
        if (c19609h != null && (m102616j = c19609h.m102616j()) != null) {
            str = m102616j;
        }
        this.f109897j = str;
        m129210a = AbstractC24856m.m129210a(new c());
        this.f109898k = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new d());
        this.f109899l = m129210a2;
        String mo12446c = interfaceC2384b.mo12446c(context, str);
        this.f109900m = mo12446c;
        String mo12448e = interfaceC2384b.mo12448e(context, str);
        this.f109901n = mo12448e;
        this.f109902o = interfaceC2384b.mo12447d(context);
        this.f109903p = interfaceC2384b.mo12445b(context);
        File file = new File(mo12448e);
        this.f109904q = file;
        File file2 = new File(mo12446c);
        this.f109905r = file2;
        m129210a3 = AbstractC24856m.m129210a(new e());
        this.f109906s = m129210a3;
        InterfaceC27315f mo112823d0 = Dispatchers.m112681c().mo112861G0().mo112823d0(m116176r());
        AbstractC19074t.m100207e(simpleName, "debugName");
        this.f109907t = CoroutineScopeKt.m112637a(mo112823d0.mo112823d0(new CoroutineName(simpleName)));
        if (!file2.exists() && !file2.mkdirs()) {
            m116196u(-1, "Cannot create MA data folder");
        }
        if (!file.exists() && !file.mkdirs()) {
            m116196u(-1, "Cannot create MA cache folder");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final C29620a m116172i() {
        return new C29620a(new b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    private final InterfaceC22471a m116173j() {
        long j11;
        String str = this.f109893f;
        switch (str.hashCode()) {
            case -1674667341:
                if (str.equals("action.lfs.file.info")) {
                    String optString = this.f109894g.optString("file_path");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    String optString2 = this.f109894g.optString("digest_algorithm");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    return new C23287a(this, optString, optString2);
                }
                return null;
            case -1674381438:
                if (str.equals("action.lfs.file.save")) {
                    CoroutineScope coroutineScope = this.f109907t;
                    C29620a m116174k = m116174k();
                    String str2 = this.f109896i;
                    Long mo12444a = this.f109890c.mo12444a(this.f109905r);
                    if (mo12444a != null) {
                        j11 = mo12444a.longValue();
                    } else {
                        j11 = 5242880;
                    }
                    return new C25256c(this, coroutineScope, m116174k, str2, j11);
                }
                return null;
            case 1506984265:
                if (str.equals("action.lfs.file.remove")) {
                    return new C24745a(this, this.f109896i);
                }
                return null;
            case 2027607019:
                if (str.equals("action.lfs.list")) {
                    return new C23741a(this);
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: k */
    private final C29620a m116174k() {
        return (C29620a) this.f109898k.getValue();
    }

    /* renamed from: q */
    private final C22473c m116175q() {
        return (C22473c) this.f109899l.getValue();
    }

    /* renamed from: r */
    private final CoroutineExceptionHandler m116176r() {
        return (CoroutineExceptionHandler) this.f109906s.getValue();
    }

    /* renamed from: v */
    public static /* synthetic */ void m116177v(C22472b c22472b, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        c22472b.m116196u(i11, str);
    }

    /* renamed from: x */
    public static /* synthetic */ void m116178x(C22472b c22472b, Object obj, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        c22472b.m116197w(obj, str);
    }

    /* renamed from: A */
    public final void m116179A(String str, JSONObject jSONObject, String str2) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "h5Action");
        AbstractC19074t.m100208f(jSONObject, "item");
        try {
            if (this.f109891d != null && this.f109897j.length() != 0 && this.f109905r.exists() && this.f109904q.exists()) {
                this.f109893f = str;
                this.f109894g = jSONObject;
                this.f109895h = str2;
                String optString = jSONObject.optString("file_path");
                AbstractC19074t.m100207e(optString, "optString(...)");
                m127168X0 = AbstractC24342w.m127168X0(optString);
                this.f109896i = m127168X0.toString();
                InterfaceC22471a m116173j = m116173j();
                if (m116173j != null) {
                    m116173j.mo116169d();
                    return;
                }
                return;
            }
            m116196u(-1, "Lack of information");
            m116198y("Lack of information. miniProgramInfo: " + this.f109891d + ", miniAppId: " + this.f109897j + ", maDataFolder.exists(): " + this.f109905r.exists() + ",maCacheFolder.exists(): " + this.f109904q.exists());
        } catch (Exception e11) {
            m116177v(this, -1, null, 2, null);
            AbstractC22490a.m116282e(new Exception(this.f109892e + ": dispatchException", e11));
        }
    }

    /* renamed from: B */
    public final void m116180B(String str, JSONObject jSONObject, String str2, EnumC2383a enumC2383a) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(enumC2383a, "compressLevel");
        this.f109893f = str;
        new C24248a(this, m116175q(), jSONObject, str2, enumC2383a).mo116169d();
    }

    /* renamed from: C */
    public final void m116181C() {
        m116175q().m116212h(this.f109904q);
    }

    /* renamed from: D */
    public final void m116182D(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        C28964i.Companion.m144662a().m144661f(str);
        m116196u(-300, "Exceed limit size. File size: " + i11 + ". Remain space: " + (5242880 - j11));
    }

    /* renamed from: c */
    public final boolean m116183c(File file) {
        AbstractC19074t.m100208f(file, "file");
        Long mo12444a = this.f109890c.mo12444a(this.f109905r);
        if (mo12444a == null) {
            return false;
        }
        if (file.length() + mo12444a.longValue() > 5242880) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m116184d() {
        return AbstractC23238v2.m119726k();
    }

    /* renamed from: e */
    public final boolean m116185e(String str) {
        boolean m127118H;
        boolean m127149O;
        AbstractC19074t.m100208f(str, "pathFromH5");
        m127118H = AbstractC24341v.m127118H(str, "miniappres://", true);
        if (m127118H) {
            m127149O = AbstractC24342w.m127149O(str, this.f109897j, false, 2, null);
            if (m127149O) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m116186f(String str) {
        boolean m127118H;
        boolean m127149O;
        AbstractC19074t.m100208f(str, "pathFromH5");
        m127118H = AbstractC24341v.m127118H(str, "miniappres://cache", true);
        if (m127118H) {
            m127149O = AbstractC24342w.m127149O(str, this.f109897j, false, 2, null);
            if (m127149O) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m116187g(String str) {
        boolean m127118H;
        boolean m127149O;
        AbstractC19074t.m100208f(str, "pathFromH5");
        m127118H = AbstractC24341v.m127118H(str, "miniappres://files", true);
        if (m127118H) {
            m127149O = AbstractC24342w.m127149O(str, this.f109897j, false, 2, null);
            if (m127149O) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final String m116188h(String str) {
        AbstractC19074t.m100208f(str, "fileName");
        return this.f109890c.mo12449f(this.f109888a, str, this.f109897j);
    }

    /* renamed from: l */
    public final String m116189l() {
        return this.f109901n;
    }

    /* renamed from: m */
    public final File m116190m() {
        return this.f109905r;
    }

    /* renamed from: n */
    public final String m116191n() {
        return this.f109900m;
    }

    /* renamed from: o */
    public final String m116192o(String str) {
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        return m116175q().m116210d(str);
    }

    /* renamed from: p */
    public final InputStream m116193p(String str) {
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        return m116175q().m116209c(str);
    }

    /* renamed from: s */
    public final String m116194s() {
        return this.f109902o;
    }

    /* renamed from: t */
    public final String m116195t() {
        return this.f109903p;
    }

    /* renamed from: u */
    public final void m116196u(int i11, String str) {
        C30933c0 c30933c0 = this.f109889b;
        if (str == null) {
            str = C20837a.f102420a.m108934a(i11);
        }
        C30933c0.m150274o0(c30933c0, i11, str, this.f109893f, null, this.f109895h, 8, null);
    }

    /* renamed from: w */
    public final void m116197w(Object obj, String str) {
        C30933c0 c30933c0 = this.f109889b;
        String str2 = this.f109893f;
        if (str == null) {
            str = this.f109895h;
        }
        C30933c0.m150274o0(c30933c0, 0, null, str2, obj, str, 3, null);
    }

    /* renamed from: y */
    public final void m116198y(String str) {
        AbstractC19074t.m100208f(str, "msg");
        String str2 = "[" + AbstractC23160o0.m119205M(System.currentTimeMillis()) + "] " + this.f109892e + ":\n" + str;
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        String str3 = this.f109892e;
        AbstractC19074t.m100207e(str3, "debugName");
        aVar.m104564x(str3).mo104556o(8, str2, new Object[0]);
    }

    /* renamed from: z */
    public final void m116199z(String str) {
        AbstractC19074t.m100208f(str, "msg");
        AbstractC20110a.f98889a.mo104548a(this.f109892e + ": " + this.f109893f + "\n" + str, new Object[0]);
    }
}
