package vj0;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.provider.AbstractC1460g;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.zom.node.ZOMFont;
import com.zing.zalo.zinstant.zom.node.ZOMFontFace;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ll0.C22518f;
import mm0.AbstractC23352g;
import pj0.C24777c;
import pj0.C24793s;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24778d;
import pj0.InterfaceC24782h;

/* renamed from: vj0.g */
/* loaded from: classes.dex */
public class C28273g {

    /* renamed from: b */
    private static Typeface f131854b;

    /* renamed from: c */
    private static final SparseArray f131855c = new SparseArray(5);

    /* renamed from: d */
    public static final float f131856d = AbstractC17201m.m91829u(14.0f);

    /* renamed from: e */
    private static float f131857e = 1.0f;

    /* renamed from: f */
    private static final ConcurrentHashMap f131858f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final String f131859g = C28273g.class.getSimpleName();

    /* renamed from: h */
    private static final C22518f f131860h = new C22518f();

    /* renamed from: i */
    static final Object f131861i = new Object();

    /* renamed from: j */
    private static int f131862j = 0;

    /* renamed from: a */
    private InterfaceC24782h f131863a;

    /* renamed from: vj0.g$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC24778d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f131864a;

        /* renamed from: b */
        final /* synthetic */ File f131865b;

        a(InterfaceC24775a interfaceC24775a, File file) {
            this.f131864a = interfaceC24775a;
            this.f131865b = file;
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        public void mo91792a(String str, File file) {
            Typeface typeface;
            if (this.f131865b.exists()) {
                try {
                    typeface = Typeface.createFromFile(this.f131865b);
                } catch (Exception unused) {
                    typeface = Typeface.DEFAULT;
                }
                this.f131864a.onSuccess(typeface);
                return;
            }
            this.f131864a.mo15338c(new Exception("Font file is not exist"));
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            this.f131864a.mo15338c(new Exception(str2));
        }
    }

    /* renamed from: vj0.g$b */
    /* loaded from: classes7.dex */
    public class b implements InterfaceC24778d {
        b() {
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        public void mo91792a(String str, File file) {
            AbstractC17201m.m91823o(C28273g.f131859g, "Load font success: " + str, null);
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            AbstractC17201m.m91823o(C28273g.f131859g, "Load font fail: " + str + " : " + str2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vj0.g$c */
    /* loaded from: classes7.dex */
    public class c implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ ZOMFont f131868a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean[] f131869b;

        /* renamed from: c */
        final /* synthetic */ int f131870c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC24775a f131871d;

        /* renamed from: e */
        final /* synthetic */ ZOMFontFace f131872e;

        c(ZOMFont zOMFont, AtomicBoolean[] atomicBooleanArr, int i11, InterfaceC24775a interfaceC24775a, ZOMFontFace zOMFontFace) {
            this.f131868a = zOMFont;
            this.f131869b = atomicBooleanArr;
            this.f131870c = i11;
            this.f131871d = interfaceC24775a;
            this.f131872e = zOMFontFace;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(Typeface typeface) {
            this.f131869b[this.f131870c].set(true);
            C28273g.this.m142447r(this.f131868a, typeface);
            if (AbstractC17201m.m91809a(this.f131869b) && this.f131871d != null) {
                this.f131872e.requestInvalidate();
                this.f131871d.onSuccess(null);
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC17201m.m91823o(C28273g.f131859g, "Load font error: " + this.f131868a.fontSrc, exc);
            onSuccess(Typeface.DEFAULT);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vj0.g$d */
    /* loaded from: classes7.dex */
    public class d extends AbstractC1460g.c {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean[] f131874a;

        /* renamed from: b */
        final /* synthetic */ int f131875b;

        /* renamed from: c */
        final /* synthetic */ ZOMFont f131876c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC24775a f131877d;

        /* renamed from: e */
        final /* synthetic */ ZOMFontFace f131878e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC24775a f131879f;

        d(AtomicBoolean[] atomicBooleanArr, int i11, ZOMFont zOMFont, InterfaceC24775a interfaceC24775a, ZOMFontFace zOMFontFace, InterfaceC24775a interfaceC24775a2) {
            this.f131874a = atomicBooleanArr;
            this.f131875b = i11;
            this.f131876c = zOMFont;
            this.f131877d = interfaceC24775a;
            this.f131878e = zOMFontFace;
            this.f131879f = interfaceC24775a2;
        }

        @Override // androidx.core.provider.AbstractC1460g.c
        /* renamed from: a */
        public void mo7262a(int i11) {
            C28273g.this.m142452y(this.f131876c, this.f131879f).run();
        }

        @Override // androidx.core.provider.AbstractC1460g.c
        /* renamed from: b */
        public void mo7263b(Typeface typeface) {
            this.f131874a[this.f131875b].set(true);
            C28273g.this.m142447r(this.f131876c, typeface);
            if (AbstractC17201m.m91809a(this.f131874a) && this.f131877d != null) {
                this.f131878e.requestInvalidate();
                this.f131877d.onSuccess(null);
            }
        }
    }

    /* renamed from: vj0.g$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private static final C28273g f131881a = new C28273g();
    }

    /* renamed from: B */
    public static void m142430B(int i11) {
        synchronized (f131861i) {
            f131862j = i11;
        }
    }

    /* renamed from: C */
    public static void m142431C(Typeface typeface) {
        f131854b = typeface;
    }

    /* renamed from: g */
    public static int m142437g() {
        int i11;
        synchronized (f131861i) {
            i11 = f131862j;
        }
        return i11;
    }

    /* renamed from: h */
    public static float m142438h() {
        return f131857e;
    }

    /* renamed from: i */
    public static C28273g m142439i() {
        return e.f131881a;
    }

    /* renamed from: j */
    public static int m142440j(ZOMTextSpan zOMTextSpan) {
        if (zOMTextSpan.bold) {
            if (zOMTextSpan.italic) {
                return 3;
            }
            return 1;
        }
        if (zOMTextSpan.italic) {
            return 2;
        }
        return 0;
    }

    /* renamed from: k */
    public static Typeface m142441k(ZOMTextSpan zOMTextSpan) {
        Typeface typeface;
        int m142440j = m142440j(zOMTextSpan);
        if (m142437g() != 2 && m142437g() != 1) {
            return m142442l(zOMTextSpan.fontWeight, m142440j);
        }
        if (m142437g() == 1) {
            typeface = m142443m();
        } else {
            typeface = (Typeface) f131855c.get(zOMTextSpan.fontWeight);
        }
        if (typeface == null) {
            typeface = (Typeface) f131855c.get(0, m142443m());
        }
        if (typeface != null) {
            try {
                return Typeface.create(typeface, m142440j);
            } catch (Exception unused) {
                return m142443m();
            }
        }
        return m142442l(zOMTextSpan.fontWeight, m142440j);
    }

    /* renamed from: l */
    static Typeface m142442l(int i11, int i12) {
        String str = "sans-serif";
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            str = null;
                        } else if (i12 != 2 && i12 != 3) {
                            i12 = 1;
                        } else {
                            i12 = 3;
                        }
                    } else {
                        str = "sans-serif-medium";
                    }
                } else {
                    str = "sans-serif-light";
                }
            } else {
                str = "sans-serif-thin";
            }
        }
        try {
            return Typeface.create(str, i12);
        } catch (Exception unused) {
            return Typeface.DEFAULT;
        }
    }

    /* renamed from: m */
    public static Typeface m142443m() {
        return f131854b;
    }

    /* renamed from: o */
    public /* synthetic */ void m142444o(InterfaceC24782h interfaceC24782h, String str, File file) {
        C24793s.m128805c().m128807e(interfaceC24782h, str, 0, file, new b());
    }

    /* renamed from: p */
    public /* synthetic */ void m142445p(ZOMFont zOMFont, InterfaceC24775a interfaceC24775a) {
        InterfaceC24782h interfaceC24782h = this.f131863a;
        if (interfaceC24782h != null) {
            m142450u(interfaceC24782h, zOMFont.fontSrc, interfaceC24775a);
        } else {
            interfaceC24775a.mo15338c(new Exception("Resource Downloader was null!!!"));
        }
    }

    /* renamed from: q */
    public static boolean m142446q(ZOMFontFace zOMFontFace) {
        ZOMFont[] zOMFontArr;
        if (zOMFontFace != null && (zOMFontArr = zOMFontFace.mFonts) != null) {
            for (ZOMFont zOMFont : zOMFontArr) {
                if (zOMFont != null && !f131858f.containsKey(zOMFont.fontSrc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m142447r(ZOMFont zOMFont, Typeface typeface) {
        if (typeface != null) {
            m142448s(zOMFont, typeface);
            zOMFont.invalidate();
        }
    }

    /* renamed from: s */
    private static void m142448s(ZOMFont zOMFont, Typeface typeface) {
        f131858f.put(zOMFont.fontSrc, typeface);
    }

    /* renamed from: t */
    public static void m142449t(int i11, Typeface typeface) {
        f131855c.put(i11, typeface);
    }

    /* renamed from: u */
    private void m142450u(InterfaceC24782h interfaceC24782h, String str, InterfaceC24775a interfaceC24775a) {
        if (!AbstractC17201m.m91821m(str)) {
            interfaceC24775a.mo15338c(new Exception("Invalid font url: %s" + str));
            return;
        }
        File m128779s = C24777c.m128779s(AbstractC23352g.m122788d(str), "fonts_src");
        C24793s.m128805c().m128807e(interfaceC24782h, str, 0, m128779s, new a(interfaceC24775a, m128779s));
    }

    /* renamed from: w */
    private static Typeface m142451w(ZOMTextSpan zOMTextSpan) {
        if (zOMTextSpan != null) {
            return (Typeface) f131858f.get(zOMTextSpan.getFontKey());
        }
        return null;
    }

    /* renamed from: y */
    public Runnable m142452y(ZOMFont zOMFont, InterfaceC24775a interfaceC24775a) {
        return new Runnable() { // from class: vj0.f

            /* renamed from: q */
            public final /* synthetic */ ZOMFont f131852q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC24775a f131853r;

            public /* synthetic */ RunnableC28272f(ZOMFont zOMFont2, InterfaceC24775a interfaceC24775a2) {
                r2 = zOMFont2;
                r3 = interfaceC24775a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28273g.this.m142445p(r2, r3);
            }
        };
    }

    /* renamed from: z */
    public static void m142453z(float f11) {
        if (f131857e != f11) {
            f131857e = f11;
        }
    }

    /* renamed from: A */
    public void m142454A(InterfaceC24782h interfaceC24782h) {
        this.f131863a = interfaceC24782h;
    }

    /* renamed from: f */
    public void m142455f(ZOMFontFace zOMFontFace) {
        ZOMFont[] zOMFontArr;
        InterfaceC24782h interfaceC24782h = this.f131863a;
        if (interfaceC24782h != null && (zOMFontArr = zOMFontFace.mFonts) != null) {
            int length = zOMFontArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = zOMFontFace.mFonts[i11].fontSrc;
                if (str != null) {
                    ConcurrentHashMap concurrentHashMap = f131858f;
                    if (concurrentHashMap.get(str) != null) {
                        zOMFontFace.mFonts[i11].invalidate();
                    } else {
                        File m128779s = C24777c.m128779s(AbstractC23352g.m122788d(str), "fonts_src");
                        if (m128779s.exists()) {
                            try {
                                Typeface createFromFile = Typeface.createFromFile(m128779s);
                                if (createFromFile != null) {
                                    concurrentHashMap.put(str, createFromFile);
                                    zOMFontFace.mFonts[i11].invalidate();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        f131860h.m116442m(new Runnable() { // from class: vj0.e

                            /* renamed from: q */
                            public final /* synthetic */ InterfaceC24782h f131848q;

                            /* renamed from: r */
                            public final /* synthetic */ String f131849r;

                            /* renamed from: s */
                            public final /* synthetic */ File f131850s;

                            public /* synthetic */ RunnableC28271e(InterfaceC24782h interfaceC24782h2, String str2, File m128779s2) {
                                r2 = interfaceC24782h2;
                                r3 = str2;
                                r4 = m128779s2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C28273g.this.m142444o(r2, r3, r4);
                            }
                        }, 1, null, false);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public boolean m142456n(ZOMFont zOMFont) {
        if (zOMFont == null || f131858f.get(zOMFont.fontSrc) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public void m142457v(ZOMFontFace zOMFontFace, InterfaceC24775a interfaceC24775a, boolean z11) {
        ZOMFontFace zOMFontFace2 = zOMFontFace;
        try {
            ZOMFont[] zOMFontArr = zOMFontFace2.mFonts;
            if (zOMFontArr != null) {
                int length = zOMFontArr.length;
                int i11 = length - 1;
                AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[length];
                for (int i12 = 0; i12 < length; i12++) {
                    atomicBooleanArr[i12] = new AtomicBoolean(false);
                }
                int i13 = 0;
                while (i13 < length) {
                    ZOMFont zOMFont = zOMFontFace2.mFonts[i13];
                    if (zOMFont != null) {
                        if (f131858f.get(zOMFont.fontSrc) != null) {
                            zOMFont.invalidate();
                            atomicBooleanArr[i13].set(true);
                            if (i13 == i11 && AbstractC17201m.m91809a(atomicBooleanArr) && interfaceC24775a != null) {
                                zOMFontFace.requestInvalidate();
                                interfaceC24775a.onSuccess(null);
                            }
                        } else if (zOMFont.preload != z11 && z11) {
                            atomicBooleanArr[i13].set(true);
                            if (i13 == i11 && AbstractC17201m.m91809a(atomicBooleanArr) && interfaceC24775a != null) {
                                zOMFontFace.requestInvalidate();
                                interfaceC24775a.onSuccess(null);
                            }
                        } else {
                            c cVar = new c(zOMFont, atomicBooleanArr, i13, interfaceC24775a, zOMFontFace);
                            new d(atomicBooleanArr, i13, zOMFont, interfaceC24775a, zOMFontFace, cVar);
                            try {
                                f131860h.m116442m(m142452y(zOMFont, cVar), 10, null, false);
                                i13++;
                                zOMFontFace2 = zOMFontFace;
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                                return;
                            }
                        }
                    }
                    i13++;
                    zOMFontFace2 = zOMFontFace;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: x */
    public Typeface m142458x(ZOMTextSpan zOMTextSpan) {
        Typeface m142451w = m142451w(zOMTextSpan);
        if (m142451w != null) {
            try {
                m142451w = Typeface.create(m142451w, m142440j(zOMTextSpan));
            } catch (Exception unused) {
            }
        }
        if (m142451w == null) {
            return m142441k(zOMTextSpan);
        }
        return m142451w;
    }
}
