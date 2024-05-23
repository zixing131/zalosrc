package af0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import bn0.AbstractC2933b;
import bn0.AbstractC2942k;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import p239ih.C20556f;
import p324lh.AbstractC22485a;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32205z8;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: af0.b */
/* loaded from: classes4.dex */
public final class C0774b {

    /* renamed from: a */
    public static final C0774b f2680a = new C0774b();

    /* renamed from: b */
    private static final String f2681b;

    /* renamed from: c */
    private static final String f2682c;

    /* renamed from: d */
    private static final InterfaceC24854k f2683d;

    /* renamed from: af0.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f2684s;

        /* renamed from: u */
        int f2686u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f2684s = obj;
            this.f2686u |= Integer.MIN_VALUE;
            return C0774b.this.m1924j(null, false, null, false, this);
        }
    }

    /* renamed from: af0.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f2687t;

        /* renamed from: u */
        final /* synthetic */ C32205z8.c f2688u;

        /* renamed from: v */
        final /* synthetic */ String f2689v;

        /* renamed from: w */
        final /* synthetic */ boolean f2690w;

        /* renamed from: x */
        final /* synthetic */ boolean f2691x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C32205z8.c cVar, String str, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f2688u = cVar;
            this.f2689v = str;
            this.f2690w = z11;
            this.f2691x = z12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f2688u, this.f2689v, this.f2690w, this.f2691x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean m127120J;
            boolean m127120J2;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f2687t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C0774b c0774b = C0774b.f2680a;
                File m1915p = c0774b.m1915p(this.f2688u, this.f2689v, this.f2690w);
                if (m1915p == null) {
                    return "";
                }
                String cVar = this.f2688u.toString();
                if (this.f2691x && m1915p.exists() && m1915p.length() > 0) {
                    String absolutePath = m1915p.getAbsolutePath();
                    AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                    return absolutePath;
                }
                String str2 = null;
                m127120J = AbstractC24341v.m127120J(cVar, "http", false, 2, null);
                if (!m127120J) {
                    m127120J2 = AbstractC24341v.m127120J(cVar, "content://", false, 2, null);
                    if (m127120J2) {
                        str = c0774b.m1916r(this.f2688u.m155304b(), m1915p);
                    } else {
                        str = "";
                    }
                    if (c0774b.m1918d(str)) {
                        str2 = str;
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                this.f2687t = 1;
                obj = c0774b.m1917s(cVar, m1915p, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return (String) obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: af0.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f2692q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ExecutorCoroutineDispatcher mo12V4() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("FileProcessingWorker"));
            AbstractC19074t.m100207e(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            return ExecutorsKt.m112728b(newSingleThreadExecutor);
        }
    }

    /* renamed from: af0.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ CancellableContinuation f2693v0;

        d(CancellableContinuation cancellableContinuation) {
            this.f2693v0 = cancellableContinuation;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1 */
        public void mo1932C(String str, File file, C23995f c23995f) {
            if (file != null) {
                try {
                    if (file.exists() && c23995f != null && c23995f.m125657h() == 200) {
                        CancellableContinuation cancellableContinuation = this.f2693v0;
                        C24861r.a aVar = C24861r.f119264q;
                        cancellableContinuation.mo112492g(C24861r.m129218b(file.getAbsolutePath()));
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    this.f2693v0.mo112492g(C24861r.m129218b(""));
                    return;
                }
            }
            if (c23995f != null && c23995f.m125657h() == 200 && c23995f.m125668s() == -1001) {
                ToastUtils.m89273u();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_msg_download2Evernote_fail, new Object[0]);
            }
            this.f2693v0.mo112492g(C24861r.m129218b(""));
        }
    }

    static {
        InterfaceC24854k m129210a;
        String uri = MediaStore.Video.Media.getContentUri("external").toString();
        AbstractC19074t.m100207e(uri, "toString(...)");
        f2681b = uri;
        String uri2 = MediaStore.Images.Media.getContentUri("external").toString();
        AbstractC19074t.m100207e(uri2, "toString(...)");
        f2682c = uri2;
        m129210a = AbstractC24856m.m129210a(c.f2692q);
        f2683d = m129210a;
    }

    private C0774b() {
    }

    /* renamed from: k */
    public static /* synthetic */ Object m1913k(C0774b c0774b, C32205z8.c cVar, boolean z11, String str, boolean z12, Continuation continuation, int i11, Object obj) {
        boolean z13;
        if ((i11 & 4) != 0) {
            str = AbstractC20130d.m104892r0();
            AbstractC19074t.m100207e(str, "getTempFileDownloadExternalStorageDirectory(...)");
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z12;
        }
        return c0774b.m1924j(cVar, z11, str2, z13, continuation);
    }

    /* renamed from: n */
    private final String m1914n(C32205z8.c cVar) {
        String m116268a;
        String str = "";
        if (cVar.m155303a().length() > 0 && (m116268a = AbstractC22485a.m116268a(cVar.m155303a())) != null) {
            str = m116268a;
        }
        if (str.length() == 0) {
            return new C20556f(cVar.m155304b().toString()).m106834f();
        }
        return str;
    }

    /* renamed from: p */
    public final File m1915p(C32205z8.c cVar, String str, boolean z11) {
        String m106835h;
        try {
            if (z11) {
                String m1914n = m1914n(cVar);
                m106835h = AbstractC23352g.m122788d(cVar.toString());
                if (m1914n.length() > 0) {
                    m106835h = m106835h + "." + m1914n;
                }
            } else {
                m106835h = new C20556f(cVar.toString()).m106835h();
                if (m106835h == null) {
                    return null;
                }
            }
            return new File(str, m106835h);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: r */
    public final String m1916r(Uri uri, File file) {
        String str = "";
        if (!AbstractC23238v2.m119727l()) {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.sd_card_not_available));
            return "";
        }
        if (file.exists() && !file.delete()) {
            throw new IllegalArgumentException("Cannot access destFile: " + file.getAbsolutePath());
        }
        InputStream openInputStream = MainApplication.Companion.m35500c().getContentResolver().openInputStream(uri);
        String str2 = null;
        if (openInputStream != null) {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.close();
                    str = file.getAbsolutePath();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("FileUtils", e11);
                }
                AbstractC2933b.m13890a(openInputStream, null);
                str2 = str;
            } finally {
            }
        }
        if (str2 != null) {
            return str2;
        }
        throw new IllegalAccessException("Cannot open photoUri: " + uri);
    }

    /* renamed from: s */
    public final Object m1917s(String str, File file, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        new C23528a(MainApplication.Companion.m35500c()).m123600e(str, file, new d(cancellableContinuationImpl));
        Object m112571A = cancellableContinuationImpl.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112571A;
    }

    /* renamed from: d */
    public final boolean m1918d(String str) {
        AbstractC19074t.m100208f(str, "path");
        try {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            new FileInputStream(file).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final boolean m1919e(String str, Uri uri) {
        boolean m127120J;
        boolean m127120J2;
        boolean z11;
        boolean m127120J3;
        boolean m127120J4;
        boolean m127120J5;
        if (str != null) {
            m127120J = AbstractC24341v.m127120J(str, "image/", false, 2, null);
            if (AbstractC23258x2.f112740a) {
                return m127120J;
            }
            String m120353t = AbstractC23280z4.m120353t(uri);
            if (m120353t == null) {
                m120353t = "";
            }
            m127120J2 = AbstractC24341v.m127120J(m120353t, "image/heic", false, 2, null);
            if (!m127120J2) {
                m127120J3 = AbstractC24341v.m127120J(m120353t, "image/heif", false, 2, null);
                if (!m127120J3) {
                    m127120J4 = AbstractC24341v.m127120J(str, "image/heic", false, 2, null);
                    if (!m127120J4) {
                        m127120J5 = AbstractC24341v.m127120J(str, "image/heif", false, 2, null);
                        if (!m127120J5) {
                            z11 = false;
                            if (!m127120J && !z11) {
                                return true;
                            }
                        }
                    }
                }
            }
            z11 = true;
            return !m127120J ? false : false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:            if (r5 != false) goto L53;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1920f(Uri uri) {
        boolean m127125u;
        boolean z11;
        boolean z12;
        boolean m127120J;
        boolean m127125u2;
        boolean m127125u3;
        boolean m127125u4;
        boolean m127125u5;
        boolean m127125u6;
        boolean m127125u7;
        boolean m127125u8;
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        AbstractC19074t.m100207e(uri2, "toString(...)");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = uri2.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        m127125u = AbstractC24341v.m127125u(lowerCase, ".gif", false, 2, null);
        if (m127125u && AbstractC23309i.m121792ch()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC23258x2.f112740a) {
            m127125u7 = AbstractC24341v.m127125u(lowerCase, ".heic", false, 2, null);
            if (!m127125u7) {
                m127125u8 = AbstractC24341v.m127125u(lowerCase, ".heif", false, 2, null);
            }
            z12 = true;
            m127120J = AbstractC24341v.m127120J(lowerCase, f2682c, false, 2, null);
            if (!m127120J) {
                m127125u2 = AbstractC24341v.m127125u(lowerCase, ".jpg", false, 2, null);
                if (!m127125u2) {
                    m127125u3 = AbstractC24341v.m127125u(lowerCase, ".png", false, 2, null);
                    if (!m127125u3) {
                        m127125u4 = AbstractC24341v.m127125u(lowerCase, ".jpeg", false, 2, null);
                        if (!m127125u4) {
                            m127125u5 = AbstractC24341v.m127125u(lowerCase, ".webp", false, 2, null);
                            if (!m127125u5) {
                                m127125u6 = AbstractC24341v.m127125u(lowerCase, ".jxl", false, 2, null);
                                if (!m127125u6 && !z11 && !z12) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        z12 = false;
        m127120J = AbstractC24341v.m127120J(lowerCase, f2682c, false, 2, null);
        if (!m127120J) {
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m1921g(String str) {
        boolean m127120J;
        if (str != null) {
            m127120J = AbstractC24341v.m127120J(str, "video/", false, 2, null);
            if (!m127120J) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m1922h(Uri uri) {
        boolean m127120J;
        boolean m127125u;
        boolean m127125u2;
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        AbstractC19074t.m100207e(uri2, "toString(...)");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = uri2.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        m127120J = AbstractC24341v.m127120J(lowerCase, f2681b, false, 2, null);
        if (!m127120J) {
            m127125u = AbstractC24341v.m127125u(lowerCase, ".mp4", false, 2, null);
            if (!m127125u) {
                m127125u2 = AbstractC24341v.m127125u(lowerCase, ".3gp", false, 2, null);
                if (!m127125u2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public final void m1923i(String str, C24003n... c24003nArr) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(c24003nArr, "opts");
        for (C24003n c24003n : c24003nArr) {
            if (C23999j.m125696L2(str, c24003n)) {
                C23999j.m125711V1(str, c24003n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1924j(C32205z8.c cVar, boolean z11, String str, boolean z12, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f2686u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f2686u = i12 - Integer.MIN_VALUE;
                    Object obj = aVar.f2684s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = aVar.f2686u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        ExecutorCoroutineDispatcher m1927o = m1927o();
                        b bVar = new b(cVar, str, z12, z11, null);
                        aVar.f2686u = 1;
                        obj = BuildersKt.m112534g(m1927o, bVar, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    return obj;
                }
            }
            if (i11 == 0) {
            }
            return obj;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f2684s;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f2686u;
    }

    /* renamed from: l */
    public final Uri m1925l(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "path");
        try {
            if (AbstractC23254w8.m119859g(str)) {
                return Uri.parse(str);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return FileProvider.m6950f(context, "com.zing.zalo.provider", new File(str));
            }
            return Uri.fromFile(new File(str));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m1926m(String str, String str2) {
        AbstractC19074t.m100208f(str, "srcPath");
        AbstractC19074t.m100208f(str2, "dstPath");
        try {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            File file2 = new File(str2);
            if (!file2.exists() || file2.delete()) {
                AbstractC2942k.m13924k(file, file2, false, 0, 6, null);
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: o */
    public final ExecutorCoroutineDispatcher m1927o() {
        return (ExecutorCoroutineDispatcher) f2683d.getValue();
    }

    /* renamed from: q */
    public final boolean m1928q(String str) {
        AbstractC19074t.m100208f(str, "path");
        try {
            if (str.length() <= 0) {
                return false;
            }
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
