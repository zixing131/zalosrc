package xf0;

import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import on0.AbstractC24342w;
import p307kv.AbstractC21954k;
import pm0.AbstractC24845f;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import vu.C28630a;
import wf0.C28964i;
import wm0.AbstractC29104l;

/* renamed from: xf0.a */
/* loaded from: classes5.dex */
public class C29620a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC29621b f136775a;

    /* renamed from: b */
    private File f136776b;

    /* renamed from: c */
    private String f136777c;

    /* renamed from: d */
    private C20627a f136778d;

    /* renamed from: e */
    private InterfaceC20630d f136779e;

    /* renamed from: f */
    private final InterfaceC24854k f136780f;

    /* renamed from: g */
    private final CoroutineScope f136781g;

    /* renamed from: h */
    private int f136782h;

    /* renamed from: xf0.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xf0.a$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20630d {
        b() {
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            if (str != null) {
                C29620a.this.m147220p(str);
            } else {
                C29620a.m147219o(C29620a.this, 0, "File path null!", 1, null);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            Integer num;
            Integer num2 = null;
            if (i11 == -6) {
                C29620a c29620a = C29620a.this;
                C20627a c20627a = c29620a.f136778d;
                if (c20627a != null) {
                    num2 = Integer.valueOf(c20627a.m107412Z());
                }
                c29620a.m147218n(-300, "Exceed limit size. Remain space: " + num2);
                return;
            }
            C29620a c29620a2 = C29620a.this;
            C20627a c20627a2 = c29620a2.f136778d;
            if (c20627a2 != null) {
                num = Integer.valueOf(c20627a2.m107409W());
            } else {
                num = null;
            }
            C20627a c20627a3 = C29620a.this.f136778d;
            if (c20627a3 != null) {
                num2 = Integer.valueOf(c20627a3.m107411Y());
            }
            c29620a2.m147218n(-305, "Cannot download! (" + num + "," + num2 + ")");
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xf0.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f136784t;

        /* renamed from: u */
        private /* synthetic */ Object f136785u;

        /* renamed from: v */
        final /* synthetic */ String f136786v;

        /* renamed from: w */
        final /* synthetic */ C29620a f136787w;

        /* renamed from: x */
        final /* synthetic */ boolean f136788x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, C29620a c29620a, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f136786v = str;
            this.f136787w = c29620a;
            this.f136788x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f136786v, this.f136787w, this.f136788x, continuation);
            cVar.f136785u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f136784t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScopeKt.m112641e((CoroutineScope) this.f136785u);
                if (URLUtil.isNetworkUrl(this.f136786v)) {
                    String m147214i = this.f136787w.m147214i(this.f136786v);
                    if (m147214i != null) {
                        this.f136787w.m147215k(m147214i, this.f136786v, this.f136788x);
                    }
                } else {
                    this.f136787w.m147223t(this.f136786v);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xf0.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f136789q = new d();

        /* renamed from: xf0.a$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {
            public a(CoroutineExceptionHandler.Key key) {
                super(key);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            /* renamed from: G */
            public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
                AbstractC20110a.f98889a.mo104548a("The exception " + th2 + " occurred in " + interfaceC27315f, new Object[0]);
            }
        }

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final CoroutineExceptionHandler mo12V4() {
            return new a(CoroutineExceptionHandler.f105837l);
        }
    }

    public C29620a(InterfaceC29621b interfaceC29621b) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC29621b, "downloadFileListener");
        this.f136775a = interfaceC29621b;
        this.f136777c = "";
        m129210a = AbstractC24856m.m129210a(d.f136789q);
        this.f136780f = m129210a;
        this.f136781g = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(m147216l()).mo112823d0(new CoroutineName("DownloadFileHelperScope")));
        this.f136782h = -1;
    }

    /* renamed from: g */
    private final boolean m147212g(String str) {
        if (str.length() == 0) {
            m147218n(-302, "Empty URL");
            return false;
        }
        if (URLUtil.isHttpUrl(str)) {
            m147218n(-302, "Http URL is not supported, use https URL");
            return false;
        }
        if (!AbstractC23238v2.m119726k()) {
            m147219o(this, -301, null, 2, null);
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final InterfaceC20630d m147213h() {
        return new b();
    }

    /* renamed from: i */
    public final String m147214i(String str) {
        AbstractC20110a.f98889a.mo104548a("Download: from url: " + str, new Object[0]);
        String m147217m = m147217m(str);
        if (m147217m == null) {
            m147219o(this, 0, "Media type is not supported!", 1, null);
            m147222r("Download: Media type is not supported!");
            return null;
        }
        String guessFileName = URLUtil.guessFileName(str, null, m147217m);
        return new File(this.f136776b, SystemClock.elapsedRealtime() + "_" + guessFileName).getAbsolutePath();
    }

    /* renamed from: k */
    public final void m147215k(String str, String str2, boolean z11) {
        this.f136779e = m147213h();
        C20627a c20627a = new C20627a(false);
        c20627a.m107419g0(this.f136779e);
        c20627a.m107420h0(str);
        if (!z11) {
            c20627a.m107424k0();
        }
        int i11 = this.f136782h;
        if (i11 > 0) {
            c20627a.m107423j0(i11);
        }
        c20627a.m107488m(str2);
        this.f136778d = c20627a;
    }

    /* renamed from: l */
    private final CoroutineExceptionHandler m147216l() {
        return (CoroutineExceptionHandler) this.f136780f.getValue();
    }

    /* renamed from: m */
    private final String m147217m(String str) {
        boolean m127149O;
        try {
            String m120353t = AbstractC23280z4.m120353t(Uri.parse(str));
            if (m120353t == null) {
                m120353t = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getHeaderField("Content-Type");
            }
            if (m120353t == null) {
                return null;
            }
            Iterator it = C28630a.f132728u.iterator();
            while (it.hasNext()) {
                m127149O = AbstractC24342w.m127149O(m120353t, (String) it.next(), false, 2, null);
                if (m127149O) {
                    return null;
                }
            }
            return m120353t;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final void m147218n(int i11, String str) {
        C28964i.Companion.m144662a().m144661f(this.f136777c);
        this.f136775a.mo116200a(i11, str);
    }

    /* renamed from: o */
    static /* synthetic */ void m147219o(C29620a c29620a, int i11, String str, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = -1;
            }
            if ((i12 & 2) != 0) {
                str = null;
            }
            c29620a.m147218n(i11, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleDownloadFailed");
    }

    /* renamed from: p */
    public final void m147220p(String str) {
        C28964i.Companion.m144662a().m144661f(this.f136777c);
        this.f136775a.mo116201b(str);
    }

    /* renamed from: q */
    private final void m147221q(String str) {
        AbstractC20110a.f98889a.mo104548a("MADownloadHelper: " + str, new Object[0]);
    }

    /* renamed from: r */
    private final void m147222r(String str) {
        AbstractC20110a.f98889a.mo104551d("MADownloadHelper: " + str, new Object[0]);
    }

    /* renamed from: t */
    public final void m147223t(String str) {
        String guessFileName = URLUtil.guessFileName(str, null, null);
        String m114608I = AbstractC21954k.Companion.m114608I(str, new File(this.f136776b, SystemClock.elapsedRealtime() + "_" + guessFileName));
        if (m114608I != null) {
            m147220p(m114608I);
            return;
        }
        m147219o(this, 0, "The url is not supported!", 1, null);
        m147222r("Download: The url " + str + " is not supported!");
    }

    /* renamed from: j */
    public final void m147224j(String str, boolean z11, File file) {
        String m129183b;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(file, "folderToSave");
        try {
            if (!m147212g(str)) {
                return;
            }
            C28964i.Companion.m144662a().m144660e(str);
            this.f136777c = str;
            this.f136776b = file;
            if (file.exists()) {
                BuildersKt__Builders_commonKt.m112540d(this.f136781g, null, null, new c(str, this, z11, null), 3, null);
                return;
            }
            m147219o(this, 0, "Folder does not exist!", 1, null);
            m147221q("Download: Folder " + file.getAbsolutePath() + " does not exist");
        } catch (Exception e11) {
            m147219o(this, 0, "Exception " + e11.getMessage() + " occurred when downloading this file!", 1, null);
            m129183b = AbstractC24845f.m129183b(e11);
            m147222r("Download: An exception occurred!\n" + m129183b);
        }
    }

    /* renamed from: s */
    public final void m147225s(int i11) {
        this.f136782h = i11;
    }
}
