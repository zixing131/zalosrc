package ik0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ll0.C22514b;
import md.C22986b;
import mk0.C23342a;
import nj0.AbstractC23804c;
import ok0.C24287d;
import ok0.InterfaceC24285b;
import ok0.InterfaceC24286c;
import ok0.InterfaceC24288e;
import ok0.InterfaceC24289f;
import ok0.InterfaceC24290g;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.EnumC25629a;
import p665y0.C30243e;
import pj0.InterfaceC24775a;
import vg.C28006a;

/* renamed from: ik0.o */
/* loaded from: classes.dex */
public final class C20592o extends AbstractC23804c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Context f101295a;

    /* renamed from: b */
    private final C23528a f101296b;

    /* renamed from: c */
    private final ConcurrentHashMap f101297c;

    /* renamed from: d */
    private final C30243e f101298d;

    /* renamed from: e */
    private final ConcurrentHashMap f101299e;

    /* renamed from: f */
    private final Object f101300f;

    /* renamed from: g */
    private InterfaceC24290g f101301g;

    /* renamed from: ik0.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final EnumC25629a m107179b() {
            if (AbstractC3972e.m18765V()) {
                return EnumC25629a.IN_BITMAP;
            }
            return EnumC25629a.DEFAULT;
        }

        /* renamed from: c */
        public final C24003n m107180c(int i11) {
            C24003n c24003n = new C24003n(0, null, 0, false, 0, false, null, 127, null);
            c24003n.f116275p = true;
            c24003n.f116276q = true;
            c24003n.f116261b = new BitmapDrawable(AbstractC3972e.m18756M(), AbstractC17158i1.m91745d());
            c24003n.f116263d = true;
            c24003n.f116266g = m107179b();
            c24003n.f116260a = i11;
            return c24003n;
        }
    }

    /* renamed from: ik0.o$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        private String f101302a;

        /* renamed from: b */
        private int f101303b;

        /* renamed from: c */
        private boolean f101304c;

        /* renamed from: d */
        private InterfaceC24288e f101305d;

        public b(String str, int i11, boolean z11, InterfaceC24288e interfaceC24288e) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC24288e, "callback");
            this.f101302a = str;
            this.f101303b = i11;
            this.f101304c = z11;
            this.f101305d = interfaceC24288e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f101303b == bVar.f101303b && this.f101304c == bVar.f101304c && AbstractC17201m.m91810b(this.f101302a, bVar.f101302a) && this.f101305d == bVar.f101305d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC17201m.m91818j(this.f101302a, Integer.valueOf(this.f101303b), Boolean.valueOf(this.f101304c), this.f101305d);
        }
    }

    /* renamed from: ik0.o$c */
    /* loaded from: classes7.dex */
    public static final class c extends C23999j {
        c() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "imageInfo");
            AbstractC19074t.m100208f(c23995f, "status");
        }
    }

    /* renamed from: ik0.o$d */
    /* loaded from: classes7.dex */
    public static final class d implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24286c f101306a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24289f.a f101307b;

        d(InterfaceC24286c interfaceC24286c, InterfaceC24289f.a aVar) {
            this.f101306a = interfaceC24286c;
            this.f101307b = aVar;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(InterfaceC24285b.b bVar) {
            AbstractC19074t.m100208f(bVar, "kfImage");
            InterfaceC24286c interfaceC24286c = this.f101306a;
            String str = this.f101307b.f117274b;
            AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            interfaceC24286c.onSuccess(new C24287d(str, bVar));
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            this.f101306a.mo15338c(exc);
        }
    }

    /* renamed from: ik0.o$e */
    /* loaded from: classes7.dex */
    public static final class e implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24286c f101308a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24289f.a f101309b;

        e(InterfaceC24286c interfaceC24286c, InterfaceC24289f.a aVar) {
            this.f101308a = interfaceC24286c;
            this.f101309b = aVar;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(InterfaceC24285b.c cVar) {
            AbstractC19074t.m100208f(cVar, "lottieDrawable");
            InterfaceC24286c interfaceC24286c = this.f101308a;
            String str = this.f101309b.f117274b;
            AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            interfaceC24286c.onSuccess(new C24287d(str, cVar));
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            this.f101308a.mo15338c(exc);
        }
    }

    /* renamed from: ik0.o$f */
    /* loaded from: classes7.dex */
    public static final class f implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24286c f101310a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24289f.a f101311b;

        f(InterfaceC24286c interfaceC24286c, InterfaceC24289f.a aVar) {
            this.f101310a = interfaceC24286c;
            this.f101311b = aVar;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(InterfaceC24285b.d dVar) {
            AbstractC19074t.m100208f(dVar, "webpDrawable");
            InterfaceC24286c interfaceC24286c = this.f101310a;
            String str = this.f101311b.f117274b;
            AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            interfaceC24286c.onSuccess(new C24287d(str, dVar));
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            this.f101310a.mo15338c(exc);
        }
    }

    /* renamed from: ik0.o$g */
    /* loaded from: classes7.dex */
    public static final class g implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24286c f101312a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24289f.a f101313b;

        g(InterfaceC24286c interfaceC24286c, InterfaceC24289f.a aVar) {
            this.f101312a = interfaceC24286c;
            this.f101313b = aVar;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(InterfaceC24285b.a aVar) {
            AbstractC19074t.m100208f(aVar, "gifDrawable");
            InterfaceC24286c interfaceC24286c = this.f101312a;
            String str = this.f101313b.f117274b;
            AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            interfaceC24286c.onSuccess(new C24287d(str, aVar));
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            this.f101312a.mo15338c(exc);
        }
    }

    /* renamed from: ik0.o$h */
    /* loaded from: classes7.dex */
    public static final class h extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ b f101315m1;

        /* renamed from: n1 */
        final /* synthetic */ String f101316n1;

        /* renamed from: o1 */
        final /* synthetic */ String f101317o1;

        h(b bVar, String str, String str2) {
            this.f101315m1 = bVar;
            this.f101316n1 = str;
            this.f101317o1 = str2;
        }

        /* renamed from: H3 */
        public static final void m107186H3(C20592o c20592o, b bVar, C3979l c3979l, String str, String str2) {
            Bitmap bitmap;
            AbstractC19074t.m100208f(c20592o, "this$0");
            AbstractC19074t.m100208f(bVar, "$request");
            AbstractC19074t.m100208f(str, "$key");
            AbstractC19074t.m100208f(str2, "$url");
            try {
                c20592o.f101297c.remove(bVar);
                if (c3979l != null) {
                    bitmap = c3979l.m18839c();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    c20592o.m107164s(str, new Exception("Bitmap was null!!!"));
                    return;
                }
                if (c20592o.m107170y(c3979l, str2)) {
                    c20592o.m107165t(str, bitmap);
                    return;
                }
                c20592o.f101296b.m123599d();
                c20592o.m107164s(str, new Exception("Request fail with wrong image: " + c3979l.m18848l()));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("ZaloZinstantImageLoader").mo104552e(e11);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ik0.p.<init>(ik0.o, ik0.o$b, com.androidquery.util.l, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(java.lang.String r7, com.androidquery.util.InterfaceC3968a r8, com.androidquery.util.C3979l r9, p379o3.C23995f r10) {
            /*
                r6 = this;
                java.lang.String r0 = "urlCallback"
                fn0.AbstractC19074t.m100208f(r7, r0)
                java.lang.String r7 = "imageview"
                fn0.AbstractC19074t.m100208f(r8, r7)
                java.lang.String r7 = "status"
                fn0.AbstractC19074t.m100208f(r10, r7)
                ik0.o r7 = ik0.C20592o.this
                ik0.o$b r2 = r6.f101315m1
                java.lang.String r4 = r6.f101316n1
                java.lang.String r5 = r6.f101317o1
                ik0.p r8 = new ik0.p
                r0 = r8
                r1 = r7
                r3 = r9
                r0.<init>()
                ik0.C20592o.m107152f(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ik0.C20592o.h.mo473O1(java.lang.String, com.androidquery.util.a, com.androidquery.util.l, o3.f):void");
        }
    }

    public C20592o(Context context, InterfaceC24290g interfaceC24290g) {
        AbstractC19074t.m100208f(context, "context");
        this.f101297c = new ConcurrentHashMap();
        this.f101299e = new ConcurrentHashMap();
        this.f101300f = new Object();
        Context applicationContext = context.getApplicationContext();
        AbstractC19074t.m100207e(applicationContext, "getApplicationContext(...)");
        this.f101295a = applicationContext;
        this.f101296b = new C23528a(applicationContext);
        this.f101298d = new C30243e(20);
        this.f101301g = interfaceC24290g;
        C22986b.f111775a.m117754c(applicationContext);
    }

    /* renamed from: l */
    public final void m107158l(Runnable runnable) {
        if (AbstractC19444a.m101693a()) {
            C22514b.m116415b().m116416a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: m */
    private final String m107159m(String str, int i11, boolean z11) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("url=%s&targetWidth=%s&requestFullImg=%s", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Boolean.valueOf(z11)}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: n */
    private final String m107160n(String str) {
        int m127177f0;
        if (!TextUtils.isEmpty(str)) {
            m127177f0 = AbstractC24342w.m127177f0(str, '/', 0, false, 6, null);
            String substring = str.substring(m127177f0 + 1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return "";
    }

    /* renamed from: o */
    private final C24003n m107161o(int i11, boolean z11) {
        if (z11) {
            i11 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Companion.m107180c(i11);
        }
        C24003n c24003n = (C24003n) this.f101298d.m149139d(Integer.valueOf(i11));
        if (c24003n == null) {
            C24003n m107180c = Companion.m107180c(i11);
            this.f101298d.m149140e(Integer.valueOf(i11), m107180c);
            return m107180c;
        }
        return c24003n;
    }

    /* renamed from: q */
    private final boolean m107162q(String str, int i11, boolean z11) {
        return C23999j.m125696L2(str, m107161o(i11, z11));
    }

    /* renamed from: r */
    private final boolean m107163r() {
        try {
            if (AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: s */
    public final void m107164s(String str, Exception exc) {
        Set m107166u = m107166u(str);
        if (m107166u != null) {
            Iterator it = m107166u.iterator();
            while (it.hasNext()) {
                ((InterfaceC24288e) it.next()).mo15338c(exc);
            }
        }
    }

    /* renamed from: t */
    public final void m107165t(String str, Bitmap bitmap) {
        Set m107166u = m107166u(str);
        if (m107166u != null) {
            Iterator it = m107166u.iterator();
            while (it.hasNext()) {
                ((InterfaceC24288e) it.next()).onSuccess(bitmap);
            }
        }
    }

    /* renamed from: u */
    private final Set m107166u(String str) {
        Set set;
        synchronized (this.f101300f) {
            set = (Set) this.f101299e.remove(str);
        }
        return set;
    }

    /* renamed from: v */
    private final boolean m107167v(String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11, C24003n c24003n) {
        C3979l m123606l;
        if (m107177p(str, i11, z11) && (m123606l = this.f101296b.m123606l(str, c24003n.f116260a, c24003n.f116263d, c24003n.f116266g)) != null && m123606l.m18839c() != null) {
            if (m107170y(m123606l, str)) {
                interfaceC24288e.onSuccess(m123606l.m18839c());
                return true;
            }
            AbstractC20110a.f98889a.m104564x("ZaloZinstantImageLoader").mo104551d("BitmapAjax cache: image fail with target=%s but received=%s", str, m123606l.m18848l());
        }
        return false;
    }

    /* renamed from: w */
    private final void m107168w(String str, InterfaceC24288e interfaceC24288e) {
        Bitmap m141159a = new C28006a().m141159a(str);
        if (m141159a != null && !m141159a.isRecycled()) {
            interfaceC24288e.onSuccess(m141159a);
        } else {
            interfaceC24288e.mo15338c(new Exception("Can not generate barcode"));
        }
    }

    /* renamed from: x */
    private final boolean m107169x(String str, String str2) {
        try {
            String m18810w = AbstractC3972e.m18810w(str);
            AbstractC19074t.m100207e(m18810w, "getCacheFileName(...)");
            return TextUtils.equals(m18810w, m107160n(str2));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: y */
    public final boolean m107170y(C3979l c3979l, String str) {
        String m18848l = c3979l.m18848l();
        if (TextUtils.isEmpty(m18848l)) {
            return false;
        }
        AbstractC19074t.m100205c(m18848l);
        if (m107169x(str, m18848l)) {
            return true;
        }
        return m107171z(this.f101296b.m123603i(str), m18848l);
    }

    /* renamed from: z */
    private final boolean m107171z(File file, String str) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists()) {
                return false;
            }
            if (!TextUtils.equals(file.getPath(), str)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    @Override // ok0.InterfaceC24289f
    /* renamed from: a */
    public void mo107172a() {
        Iterator it = this.f101297c.values().iterator();
        while (it.hasNext()) {
            ((C3977j) it.next()).setImageInfo(null);
        }
        this.f101297c.clear();
        this.f101299e.clear();
    }

    @Override // ok0.InterfaceC24289f
    /* renamed from: b */
    public void mo107173b(InterfaceC24289f.a aVar, InterfaceC24288e interfaceC24288e) {
        JSONObject jSONObject;
        AbstractC19074t.m100208f(aVar, "params");
        AbstractC19074t.m100208f(interfaceC24288e, "callback");
        try {
            jSONObject = new JSONObject(aVar.f117274b);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            jSONObject = null;
        }
        if (jSONObject == null) {
            interfaceC24288e.mo15338c(new Exception("Data is not valid"));
            return;
        }
        String optString = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String optString2 = jSONObject.optString("data");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            if (TextUtils.equals("qrcode", optString)) {
                AbstractC19074t.m100205c(optString2);
                m107168w(optString2, interfaceC24288e);
                return;
            } else {
                interfaceC24288e.mo15338c(new Exception("Not support query type: " + optString));
                return;
            }
        }
        interfaceC24288e.mo15338c(new Exception("Param type or data is not valid"));
    }

    @Override // ok0.InterfaceC24289f
    /* renamed from: c */
    public void mo107174c(InterfaceC24289f.a aVar, InterfaceC24286c interfaceC24286c) {
        AbstractC19074t.m100208f(aVar, "params");
        AbstractC19074t.m100208f(interfaceC24286c, "animationDrawableCallback");
        InterfaceC24290g interfaceC24290g = this.f101301g;
        if (interfaceC24290g == null) {
            interfaceC24286c.mo15338c(new Exception("Loader must be non-null: " + aVar));
            return;
        }
        int i11 = aVar.f117273a;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        interfaceC24286c.mo15338c(new Exception("Not Support: " + aVar));
                        return;
                    }
                    String str = aVar.f117274b;
                    AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    interfaceC24290g.mo91900d(str, aVar.f117275c, aVar.f117276d, new g(interfaceC24286c, aVar));
                    return;
                }
                String str2 = aVar.f117274b;
                AbstractC19074t.m100207e(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                interfaceC24290g.mo91899c(str2, aVar.f117275c, aVar.f117276d, new f(interfaceC24286c, aVar));
                return;
            }
            String str3 = aVar.f117274b;
            AbstractC19074t.m100207e(str3, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            interfaceC24290g.mo91898b(str3, aVar.f117275c, aVar.f117276d, new e(interfaceC24286c, aVar));
            return;
        }
        String str4 = aVar.f117274b;
        AbstractC19074t.m100207e(str4, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        interfaceC24290g.mo91901e(str4, new d(interfaceC24286c, aVar));
    }

    @Override // ok0.InterfaceC24289f
    /* renamed from: d */
    public void mo107175d(String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11, JSONObject jSONObject) {
        boolean z12;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC24288e, "bitmapCallback");
        b bVar = new b(str, i11, z11, interfaceC24288e);
        C24003n m107161o = m107161o(i11, z11);
        if (m107167v(str, interfaceC24288e, i11, z11, m107161o)) {
            return;
        }
        if (!m107163r()) {
            interfaceC24288e.mo15338c(new ZinstantException(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, "url=" + str));
            return;
        }
        String m107159m = m107159m(str, i11, z11);
        synchronized (this.f101300f) {
            try {
                Set set = (Set) this.f101299e.get(m107159m);
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f101299e.put(m107159m, set);
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (set.contains(interfaceC24288e)) {
                    return;
                }
                set.add(interfaceC24288e);
                if (z12) {
                    C3977j c3977j = new C3977j(this.f101295a);
                    this.f101297c.put(bVar, c3977j);
                    synchronized (this.f101296b) {
                        h hVar = new h(bVar, m107159m, str);
                        int m122747a = C23342a.m122747a(jSONObject, false, 26010);
                        hVar.m125631t1(false);
                        hVar.m125611h1(m122747a, 0);
                        hVar.m125608e0();
                        hVar.m125609e1(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ok0.InterfaceC24289f
    /* renamed from: e */
    public void mo107176e(String str, int i11, boolean z11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (!m107177p(str, i11, z11)) {
            C3977j c3977j = new C3977j(this.f101295a);
            C24003n m107161o = m107161o(i11, z11);
            c cVar = new c();
            int m122747a = C23342a.m122747a(jSONObject, true, 26010);
            cVar.m125631t1(false);
            cVar.m125611h1(m122747a, 0);
            cVar.m125609e1(true);
            synchronized (this.f101296b) {
            }
        }
    }

    /* renamed from: p */
    public boolean m107177p(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (!m107162q(str, i11, z11) && this.f101296b.m123603i(str) == null) {
            return false;
        }
        return true;
    }
}
