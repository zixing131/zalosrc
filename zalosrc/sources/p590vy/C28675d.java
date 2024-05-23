package p590vy;

import ag0.AbstractC0837p0;
import android.webkit.MimeTypeMap;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.AbstractC20130d;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p354n3.AbstractC23529b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p405ov.C24561c;
import p590vy.C28675d;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: vy.d */
/* loaded from: classes4.dex */
public final class C28675d {
    public static final c Companion = new c(null);

    /* renamed from: c */
    private static final InterfaceC24854k f133109c;

    /* renamed from: a */
    private final InterfaceC24854k f133110a;

    /* renamed from: b */
    private final InterfaceC24854k f133111b;

    /* renamed from: vy.d$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo143627a(String str, File file);

        /* renamed from: b */
        void mo143628b();
    }

    /* renamed from: vy.d$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f133112q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C28675d mo12V4() {
            return d.f133113a.m143631a();
        }
    }

    /* renamed from: vy.d$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28675d m143630a() {
            return (C28675d) C28675d.f133109c.getValue();
        }
    }

    /* renamed from: vy.d$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f133113a = new d();

        /* renamed from: b */
        private static final C28675d f133114b = new C28675d();

        private d() {
        }

        /* renamed from: a */
        public final C28675d m143631a() {
            return f133114b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.d$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f133115q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: vy.d$f */
    /* loaded from: classes4.dex */
    public static final class f extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ File f133117m1;

        f(File file) {
            this.f133117m1 = file;
        }

        /* renamed from: H3 */
        public static final void m143634H3(C28675d c28675d, String str, C3979l c3979l, File file) {
            AbstractC19074t.m100208f(c28675d, "this$0");
            AbstractC19074t.m100208f(file, "$filePathOut");
            c28675d.m143623j(str, c3979l, file);
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vy.e

                /* renamed from: q */
                public final /* synthetic */ String f133120q;

                /* renamed from: r */
                public final /* synthetic */ C3979l f133121r;

                /* renamed from: s */
                public final /* synthetic */ File f133122s;

                public /* synthetic */ RunnableC28676e(String str2, C3979l c3979l2, File file) {
                    r2 = str2;
                    r3 = c3979l2;
                    r4 = file;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C28675d.f.m143634H3(C28675d.this, r2, r3, r4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.d$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f133118q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f133112q);
        f133109c = m129210a;
    }

    public C28675d() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(g.f133118q);
        this.f133110a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(e.f133115q);
        this.f133111b = m129210a2;
    }

    /* renamed from: c */
    private final void m143617c(String str, a aVar) {
        HashSet hashSet = (HashSet) m143622i().get(str);
        if (hashSet == null) {
            hashSet = new HashSet();
            m143622i().put(str, hashSet);
        }
        hashSet.add(aVar);
    }

    /* renamed from: d */
    private final C23528a m143618d() {
        return (C23528a) this.f133111b.getValue();
    }

    /* renamed from: e */
    private final String m143619e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        AbstractC19074t.m100205c(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() <= 0) {
            fileExtensionFromUrl = null;
        }
        if (fileExtensionFromUrl == null) {
            return "jpg";
        }
        return fileExtensionFromUrl;
    }

    /* renamed from: f */
    private final String m143620f(String str) {
        String m104849P = AbstractC20130d.m104849P();
        AbstractC19074t.m100207e(m104849P, "getFileCacheExternalStorageDirectory(...)");
        File file = new File(m104849P);
        if (!file.exists()) {
            file.mkdirs();
        }
        return m104849P + AbstractC23352g.m122788d(str) + "." + m143619e(str);
    }

    /* renamed from: h */
    private final synchronized void m143621h(String str, File file, InterfaceC3968a interfaceC3968a) {
        file.delete();
        ((C23528a) m143618d().m123612r(interfaceC3968a)).m123584H(str, false, true, 0, 0, new f(file));
    }

    /* renamed from: i */
    private final HashMap m143622i() {
        return (HashMap) this.f133110a.getValue();
    }

    /* renamed from: j */
    public final synchronized void m143623j(String str, C3979l c3979l, File file) {
        try {
            if (str != null) {
                try {
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("QRWallet", e11);
                    m143624k(str);
                }
                if (str.length() != 0) {
                    File m123576h = AbstractC23529b.m123576h(MainApplication.Companion.m35500c(), str);
                    if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() > 0 && c3979l.m18839c().getHeight() > 0 && m123576h != null && m123576h.exists()) {
                        AbstractC23238v2.m119717b(m123576h, file);
                        if (file.exists()) {
                            m143625l(str, file);
                        } else {
                            C24561c.m127942b("QRWallet", "copyFile is fail");
                            m143624k(str);
                        }
                    } else {
                        C24561c.m127942b("QRWallet", "imageInfo is invalid");
                        m143624k(str);
                    }
                }
            }
            C24561c.m127942b("QRWallet", "Url is invalid");
            m143624k(str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    private final synchronized void m143624k(String str) {
        try {
            HashSet hashSet = (HashSet) AbstractC19069o0.m100187d(m143622i()).remove(str);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo143628b();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
        }
    }

    /* renamed from: l */
    private final synchronized void m143625l(String str, File file) {
        try {
            HashSet hashSet = (HashSet) m143622i().remove(str);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo143627a(str, file);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
        }
    }

    /* renamed from: g */
    public final synchronized void m143626g(String str, InterfaceC3968a interfaceC3968a, a aVar) {
        String m143620f;
        File file;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC3968a, "dumpAQView");
        AbstractC19074t.m100208f(aVar, "callback");
        try {
            m143620f = m143620f(str);
            file = new File(m143620f);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("QRWallet", e11);
            aVar.mo143628b();
        }
        if (AbstractC23041d2.m118194A(m143620f)) {
            aVar.mo143627a(str, file);
            return;
        }
        if (!m143622i().containsKey(str)) {
            m143617c(str, aVar);
            m143621h(str, file, interfaceC3968a);
        } else {
            m143617c(str, aVar);
        }
    }
}
