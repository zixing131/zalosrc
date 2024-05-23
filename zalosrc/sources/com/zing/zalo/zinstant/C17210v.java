package com.zing.zalo.zinstant;

import android.text.TextUtils;
import au.AbstractC2378v0;
import com.zing.zalo.zinstant.C17210v;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gk0.C19473a;
import gk0.C19474b;
import gk0.C19475c;
import gk0.C19476d;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import ll0.C22513a;
import mm0.AbstractC23352g;
import ok0.InterfaceC24285b;
import ok0.InterfaceC24290g;
import on0.AbstractC24342w;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import p536u3.AbstractC27005l;
import p566v3.C27508p;
import p620wt.AbstractC29237l;
import p667y2.C30268e;
import pj0.C24777c;
import pj0.C24780f;
import pj0.C24793s;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24778d;
import pj0.InterfaceC24782h;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zinstant.v */
/* loaded from: classes.dex */
public final class C17210v implements InterfaceC24290g {

    /* renamed from: b */
    private static InterfaceC24782h f87768b;

    /* renamed from: c */
    private static C23528a f87769c;

    /* renamed from: f */
    private static final InterfaceC24854k f87772f;

    /* renamed from: a */
    public static final C17210v f87767a = new C17210v();

    /* renamed from: d */
    private static final ConcurrentHashMap f87770d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final Object f87771e = new Object();

    /* renamed from: com.zing.zalo.zinstant.v$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f87773q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(File file) {
            AbstractC19074t.m100208f(file, "file");
            return AbstractC20130d.m104877k(file);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC24778d {

        /* renamed from: a */
        final /* synthetic */ File f87774a;

        b(File file) {
            this.f87774a = file;
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0074: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:117), block:B:32:0x0074 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0077: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:120), block:B:27:0x0077 */
        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        public void mo91792a(String str, File file) {
            Closeable closeable;
            Closeable closeable2;
            Throwable th2;
            String m104877k;
            BufferedWriter bufferedWriter;
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(file, "donwloadedFile");
            Closeable closeable3 = null;
            try {
                try {
                    if (file.exists()) {
                        Object obj = C17210v.f87771e;
                        File file2 = this.f87774a;
                        try {
                            synchronized (obj) {
                                try {
                                    m104877k = AbstractC20130d.m104877k(file2);
                                    bufferedWriter = new BufferedWriter(new FileWriter(new File(file2.toString() + "_c")));
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                                try {
                                    bufferedWriter.write(m104877k);
                                    C17210v.f87767a.m91864H(str, file2);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    AbstractC29237l.m145996a(bufferedWriter);
                                    return;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    throw th2;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            closeable3 = closeable2;
                            C17210v.f87767a.m91863G(str, new Exception("Download resource failed: " + str));
                            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(e);
                            AbstractC29237l.m145996a(closeable3);
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            closeable3 = closeable;
                            AbstractC29237l.m145996a(closeable3);
                            throw th;
                        }
                    }
                    C17210v.f87767a.m91863G(str, new Exception("Download resource failed: " + str));
                    AbstractC29237l.m145996a(null);
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(str2, C30268e.f140632a);
            C17210v.f87767a.m91863G(str, new Exception(str2));
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$c */
    /* loaded from: classes7.dex */
    public static final class c implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87775a;

        c(InterfaceC24775a interfaceC24775a) {
            this.f87775a = interfaceC24775a;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a */
        public void onSuccess(File file) {
            C24848g0 c24848g0;
            if (file != null) {
                InterfaceC24775a interfaceC24775a = this.f87775a;
                if (interfaceC24775a != null) {
                    interfaceC24775a.onSuccess(file);
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 != null) {
                    return;
                }
            }
            InterfaceC24775a interfaceC24775a2 = this.f87775a;
            if (interfaceC24775a2 != null) {
                interfaceC24775a2.mo15338c(new Exception("[Zinstant] Download Resource failed"));
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            InterfaceC24775a interfaceC24775a = this.f87775a;
            if (interfaceC24775a != null) {
                interfaceC24775a.mo15338c(exc);
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$d */
    /* loaded from: classes7.dex */
    public static final class d extends C23994e {
        d() {
        }

        /* renamed from: D1 */
        public static final void m91906D1(String str, File file, C23995f c23995f) {
            AbstractC19074t.m100208f(str, "$url");
            AbstractC19074t.m100208f(c23995f, "$status");
            C17210v.f87767a.m91859B(str, file, c23995f);
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: C1 */
        public void mo1932C(String str, File file, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.w

                /* renamed from: p */
                public final /* synthetic */ String f87906p;

                /* renamed from: q */
                public final /* synthetic */ File f87907q;

                /* renamed from: r */
                public final /* synthetic */ C23995f f87908r;

                public /* synthetic */ RunnableC17241w(String str2, File file2, C23995f c23995f2) {
                    r1 = str2;
                    r2 = file2;
                    r3 = c23995f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.d.m91906D1(r1, r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f87776q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22513a mo12V4() {
            return new C22513a("ResourceFileProvider");
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$f */
    /* loaded from: classes7.dex */
    public static final class f implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87777a;

        f(InterfaceC24775a interfaceC24775a) {
            this.f87777a = interfaceC24775a;
        }

        /* renamed from: d */
        public static final void m91911d(InterfaceC24775a interfaceC24775a, Exception exc) {
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            AbstractC19074t.m100208f(exc, "$exception");
            interfaceC24775a.mo15338c(exc);
        }

        /* renamed from: f */
        public static final void m91912f(File file, InterfaceC24775a interfaceC24775a) {
            AbstractC19074t.m100208f(file, "$file");
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            InterfaceC24285b.a m91868L = C17210v.f87767a.m91868L(file);
            if (m91868L != null) {
                interfaceC24775a.onSuccess(m91868L);
            } else {
                interfaceC24775a.mo15338c(new Exception("Can't not generate Lottie Drawable"));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.y

                /* renamed from: q */
                public final /* synthetic */ Exception f87926q;

                public /* synthetic */ RunnableC17245y(Exception exc2) {
                    r2 = exc2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.f.m91911d(InterfaceC24775a.this, r2);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: e */
        public void onSuccess(File file) {
            AbstractC19074t.m100208f(file, "file");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.x

                /* renamed from: p */
                public final /* synthetic */ File f87920p;

                /* renamed from: q */
                public final /* synthetic */ InterfaceC24775a f87921q;

                public /* synthetic */ RunnableC17243x(File file2, InterfaceC24775a interfaceC24775a) {
                    r1 = file2;
                    r2 = interfaceC24775a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.f.m91912f(r1, r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$g */
    /* loaded from: classes7.dex */
    public static final class g implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87778a;

        g(InterfaceC24775a interfaceC24775a) {
            this.f87778a = interfaceC24775a;
        }

        /* renamed from: d */
        public static final void m91916d(InterfaceC24775a interfaceC24775a, Exception exc) {
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            AbstractC19074t.m100208f(exc, "$exception");
            interfaceC24775a.mo15338c(exc);
        }

        /* renamed from: f */
        public static final void m91917f(File file, InterfaceC24775a interfaceC24775a) {
            AbstractC19074t.m100208f(file, "$file");
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            C27508p m91869M = C17210v.f87767a.m91869M(file);
            if (m91869M != null) {
                interfaceC24775a.onSuccess(new C19474b(m91869M));
            } else {
                interfaceC24775a.mo15338c(new Exception("Can't not generate Keyframes Drawable"));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.a0

                /* renamed from: q */
                public final /* synthetic */ Exception f87470q;

                public /* synthetic */ RunnableC17100a0(Exception exc2) {
                    r2 = exc2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.g.m91916d(InterfaceC24775a.this, r2);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: e */
        public void onSuccess(File file) {
            AbstractC19074t.m100208f(file, "file");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.z

                /* renamed from: p */
                public final /* synthetic */ File f87927p;

                /* renamed from: q */
                public final /* synthetic */ InterfaceC24775a f87928q;

                public /* synthetic */ RunnableC17247z(File file2, InterfaceC24775a interfaceC24775a) {
                    r1 = file2;
                    r2 = interfaceC24775a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.g.m91917f(r1, r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$h */
    /* loaded from: classes7.dex */
    public static final class h implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87779a;

        /* renamed from: b */
        final /* synthetic */ int f87780b;

        /* renamed from: c */
        final /* synthetic */ int f87781c;

        h(InterfaceC24775a interfaceC24775a, int i11, int i12) {
            this.f87779a = interfaceC24775a;
            this.f87780b = i11;
            this.f87781c = i12;
        }

        /* renamed from: d */
        public static final void m91921d(InterfaceC24775a interfaceC24775a, Exception exc) {
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            AbstractC19074t.m100208f(exc, "$exception");
            interfaceC24775a.mo15338c(exc);
        }

        /* renamed from: f */
        public static final void m91922f(File file, int i11, int i12, InterfaceC24775a interfaceC24775a) {
            AbstractC19074t.m100208f(file, "$file");
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            InterfaceC24285b.c m91870N = C17210v.f87767a.m91870N(file, i11, i12);
            if (m91870N != null) {
                interfaceC24775a.onSuccess(m91870N);
            } else {
                interfaceC24775a.mo15338c(new Exception("Can't not generate Lottie Drawable"));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.b0

                /* renamed from: q */
                public final /* synthetic */ Exception f87475q;

                public /* synthetic */ RunnableC17103b0(Exception exc2) {
                    r2 = exc2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.h.m91921d(InterfaceC24775a.this, r2);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: e */
        public void onSuccess(File file) {
            AbstractC19074t.m100208f(file, "file");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.c0

                /* renamed from: p */
                public final /* synthetic */ File f87484p;

                /* renamed from: q */
                public final /* synthetic */ int f87485q;

                /* renamed from: r */
                public final /* synthetic */ int f87486r;

                /* renamed from: s */
                public final /* synthetic */ InterfaceC24775a f87487s;

                public /* synthetic */ RunnableC17106c0(File file2, int i11, int i12, InterfaceC24775a interfaceC24775a) {
                    r1 = file2;
                    r2 = i11;
                    r3 = i12;
                    r4 = interfaceC24775a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.h.m91922f(r1, r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zinstant.v$i */
    /* loaded from: classes7.dex */
    public static final class i implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87782a;

        /* renamed from: b */
        final /* synthetic */ int f87783b;

        /* renamed from: c */
        final /* synthetic */ int f87784c;

        i(InterfaceC24775a interfaceC24775a, int i11, int i12) {
            this.f87782a = interfaceC24775a;
            this.f87783b = i11;
            this.f87784c = i12;
        }

        /* renamed from: d */
        public static final void m91926d(InterfaceC24775a interfaceC24775a, Exception exc) {
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            AbstractC19074t.m100208f(exc, "$exception");
            interfaceC24775a.mo15338c(exc);
        }

        /* renamed from: f */
        public static final void m91927f(File file, int i11, int i12, InterfaceC24775a interfaceC24775a) {
            AbstractC19074t.m100208f(file, "$file");
            AbstractC19074t.m100208f(interfaceC24775a, "$listener");
            InterfaceC24285b.d m91873Q = C17210v.f87767a.m91873Q(file, i11, i12);
            if (m91873Q != null) {
                interfaceC24775a.onSuccess(m91873Q);
            } else {
                interfaceC24775a.mo15338c(new Exception("Can't not generate WebP Drawable"));
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.e0

                /* renamed from: q */
                public final /* synthetic */ Exception f87647q;

                public /* synthetic */ RunnableC17145e0(Exception exc2) {
                    r2 = exc2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.i.m91926d(InterfaceC24775a.this, r2);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: e */
        public void onSuccess(File file) {
            AbstractC19074t.m100208f(file, "file");
            C17210v.f87767a.m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.d0

                /* renamed from: p */
                public final /* synthetic */ File f87631p;

                /* renamed from: q */
                public final /* synthetic */ int f87632q;

                /* renamed from: r */
                public final /* synthetic */ int f87633r;

                /* renamed from: s */
                public final /* synthetic */ InterfaceC24775a f87634s;

                public /* synthetic */ RunnableC17140d0(File file2, int i11, int i12, InterfaceC24775a interfaceC24775a) {
                    r1 = file2;
                    r2 = i11;
                    r3 = i12;
                    r4 = interfaceC24775a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17210v.i.m91927f(r1, r2, r3, r4);
                }
            });
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(e.f87776q);
        f87772f = m129210a;
    }

    private C17210v() {
    }

    /* renamed from: A */
    private final InterfaceC24775a m91858A(InterfaceC24775a interfaceC24775a) {
        return new c(interfaceC24775a);
    }

    /* renamed from: B */
    public final void m91859B(String str, File file, C23995f c23995f) {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                File m128779s = C24777c.m128779s(AbstractC23352g.m122788d(str), "img_src");
                AbstractC19074t.m100207e(m128779s, "getCacheFile(...)");
                if (file != null && file.exists() && c23995f.m125657h() == 200) {
                    AbstractC19074t.m100206d(file, "null cannot be cast to non-null type java.io.File");
                    if (!AbstractC2378v0.m12421d(file, m128779s)) {
                        m91863G(str, new Exception("Can't unzip resource: " + str));
                        AbstractC29237l.m145996a(null);
                        return;
                    }
                    AbstractC20130d.m104858T0(file);
                    String m104877k = AbstractC20130d.m104877k(m128779s);
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(new File(m128779s.toString() + "_c")));
                    try {
                        bufferedWriter2.write(m104877k);
                        m91864H(str, m128779s);
                        AbstractC29237l.m145996a(bufferedWriter2);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter = bufferedWriter2;
                        AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(e);
                        m91863G(str, e);
                        AbstractC29237l.m145996a(bufferedWriter);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = bufferedWriter2;
                        AbstractC29237l.m145996a(bufferedWriter);
                        throw th;
                    }
                }
                m91863G(str, new Exception("Download resource failed - " + str + "-" + c23995f.m125664o()));
                AbstractC29237l.m145996a(null);
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: D */
    private final boolean m91860D(String str, InterfaceC24775a interfaceC24775a) {
        synchronized (f87771e) {
            try {
                ConcurrentHashMap concurrentHashMap = f87770d;
                LinkedList linkedList = (LinkedList) concurrentHashMap.get(str);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    concurrentHashMap.put(str, linkedList);
                }
                if (linkedList.isEmpty()) {
                    linkedList.push(interfaceC24775a);
                    return true;
                }
                if (!linkedList.contains(interfaceC24775a)) {
                    linkedList.push(interfaceC24775a);
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: E */
    private final boolean m91861E(String str, File file) {
        try {
            File[] listFiles = file.listFiles();
            if (file.exists() && listFiles != null && listFiles.length != 0) {
                File m128779s = C24777c.m128779s(str + "_c", "img_src");
                AbstractC19074t.m100207e(m128779s, "getCacheFile(...)");
                if (m128779s.length() == 32) {
                    BufferedReader bufferedReader = null;
                    try {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(m128779s));
                            try {
                                boolean equals = TextUtils.equals(bufferedReader2.readLine(), AbstractC20130d.m104877k(file));
                                AbstractC29237l.m145996a(bufferedReader2);
                                if (equals) {
                                    return true;
                                }
                                return false;
                            } catch (Exception e11) {
                                e = e11;
                                bufferedReader = bufferedReader2;
                                AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104552e(e);
                                AbstractC29237l.m145996a(bufferedReader);
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                AbstractC29237l.m145996a(bufferedReader);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } else {
                    return false;
                }
            }
            return false;
        } catch (Throwable th4) {
            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104552e(th4);
            return false;
        }
    }

    /* renamed from: F */
    private final void m91862F(String str) {
        File m128779s = C24777c.m128779s(m91895z(str), "img_src");
        AbstractC19074t.m100207e(m128779s, "getCacheFile(...)");
        d dVar = new d();
        dVar.m125609e1(true);
        C23528a c23528a = f87769c;
        if (c23528a == null) {
            m91863G(str, new Exception("AQuery was not init"));
        }
    }

    /* renamed from: G */
    public final void m91863G(String str, Exception exc) {
        LinkedList m91865I = m91865I(str);
        if (m91865I != null) {
            Iterator it = m91865I.iterator();
            while (it.hasNext()) {
                ((InterfaceC24775a) it.next()).mo15338c(exc);
            }
        }
    }

    /* renamed from: H */
    public final void m91864H(String str, File file) {
        LinkedList m91865I = m91865I(str);
        if (m91865I != null) {
            Iterator it = m91865I.iterator();
            while (it.hasNext()) {
                ((InterfaceC24775a) it.next()).onSuccess(file);
            }
        }
    }

    /* renamed from: I */
    private final LinkedList m91865I(String str) {
        LinkedList linkedList;
        synchronized (f87771e) {
            linkedList = (LinkedList) f87770d.remove(str);
        }
        return linkedList;
    }

    /* renamed from: J */
    private final boolean m91866J(String str, InterfaceC24775a interfaceC24775a) {
        m91889t();
        return m91860D(str, interfaceC24775a);
    }

    /* renamed from: K */
    private final void m91867K(File file, File file2) {
        try {
            if (file2.exists()) {
                AbstractC20130d.m104856S0(file2);
            }
            if (file.exists()) {
                AbstractC20130d.m104858T0(file);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104552e(e11);
        }
    }

    /* renamed from: L */
    public final InterfaceC24285b.a m91868L(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            return new C19473a(file);
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(th2);
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:32), block:B:31:0x001f */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C27508p m91869M(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        C27508p c27508p;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                File file2 = new File(file, "script_kf.json");
                if (file2.exists()) {
                    fileInputStream = new FileInputStream(file2);
                    try {
                        c27508p = AbstractC27005l.m139132a(fileInputStream, file.getPath());
                        fileInputStream3 = fileInputStream;
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(e);
                        if (fileInputStream == null) {
                            return null;
                        }
                        try {
                            fileInputStream.close();
                            return null;
                        } catch (IOException unused) {
                            return null;
                        }
                    }
                } else {
                    c27508p = null;
                }
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                return c27508p;
            } catch (Exception e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream3 != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            if (fileInputStream3 != null) {
                try {
                    fileInputStream3.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: N */
    public final InterfaceC24285b.c m91870N(File file, int i11, int i12) {
        try {
            File file2 = new File(file, "data.json");
            if (!file2.exists()) {
                return null;
            }
            return new C19475c(file2, i11, i12);
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(th2);
            return null;
        }
    }

    /* renamed from: O */
    public static final void m91871O(InterfaceC24775a interfaceC24775a, String str) {
        AbstractC19074t.m100208f(str, "$target");
        C17210v c17210v = f87767a;
        if (c17210v.m91866J(str, c17210v.m91858A(interfaceC24775a))) {
            c17210v.m91891v(str);
        }
    }

    /* renamed from: P */
    public static final void m91872P(String str, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, "$target");
        C17210v c17210v = f87767a;
        c17210v.m91874R(str, c17210v.m91858A(interfaceC24775a));
    }

    /* renamed from: Q */
    public final InterfaceC24285b.d m91873Q(File file, int i11, int i12) {
        try {
            if (!file.exists()) {
                return null;
            }
            return new C19476d(file, i11, i12);
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.m104564x("ResourceFileProvider").mo104549b(th2);
            return null;
        }
    }

    /* renamed from: R */
    private final void m91874R(String str, InterfaceC24775a interfaceC24775a) {
        if (!m91866J(str, interfaceC24775a)) {
            return;
        }
        m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.t

            /* renamed from: p */
            public final /* synthetic */ String f87739p;

            public /* synthetic */ RunnableC17180t(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17210v.m91875S(r1);
            }
        });
    }

    /* renamed from: S */
    public static final void m91875S(String str) {
        AbstractC19074t.m100208f(str, "$target");
        String m122788d = AbstractC23352g.m122788d(str);
        File m128779s = C24777c.m128779s(m122788d, "img_src");
        AbstractC19074t.m100207e(m128779s, "getCacheFile(...)");
        C17210v c17210v = f87767a;
        AbstractC19074t.m100205c(m122788d);
        if (c17210v.m91861E(m122788d, m128779s)) {
            c17210v.m91864H(str, m128779s);
            return;
        }
        File m128779s2 = C24777c.m128779s(m122788d + "_c", "img_src");
        AbstractC19074t.m100207e(m128779s2, "getCacheFile(...)");
        c17210v.m91867K(m128779s2, m128779s);
        AbstractC19074t.m100207e(C24777c.m128779s(c17210v.m91895z(str), "img_src"), "getCacheFile(...)");
        c17210v.m91862F(str);
    }

    /* renamed from: t */
    private final void m91889t() {
        if (f87768b != null) {
        } else {
            throw new IllegalStateException("Need to call init(ResourceDownloader) first!!!");
        }
    }

    /* renamed from: u */
    public final void m91890u(Runnable runnable) {
        if (!AbstractC19444a.m101693a()) {
            runnable.run();
        } else {
            m91894y().m116414a(runnable);
        }
    }

    /* renamed from: v */
    private final void m91891v(String str) {
        m91890u(new Runnable() { // from class: com.zing.zalo.zinstant.u

            /* renamed from: p */
            public final /* synthetic */ String f87740p;

            public /* synthetic */ RunnableC17182u(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17210v.m91892w(r1);
            }
        });
    }

    /* renamed from: w */
    public static final void m91892w(String str) {
        AbstractC19074t.m100208f(str, "$targetUrl");
        C24780f c24780f = C24780f.f119009a;
        File m128800b = c24780f.m128800b(str, a.f87773q);
        if (m128800b != null) {
            f87767a.m91864H(str, m128800b);
        } else {
            f87767a.m91893x(str, c24780f.m128799a(str));
        }
    }

    /* renamed from: x */
    private final void m91893x(String str, File file) {
        InterfaceC24782h interfaceC24782h = f87768b;
        if (interfaceC24782h == null) {
            m91863G(str, new Exception("Resource Loader was null"));
        } else {
            synchronized (interfaceC24782h) {
                C24793s.m128805c().m128807e(interfaceC24782h, str, 0, file, new b(file));
            }
        }
    }

    /* renamed from: y */
    private final C22513a m91894y() {
        return (C22513a) f87772f.getValue();
    }

    /* renamed from: z */
    private final String m91895z(String str) {
        int m127178g0;
        int m127173b0;
        int m127178g02;
        m127178g0 = AbstractC24342w.m127178g0(str, "/", 0, false, 6, null);
        String substring = str.substring(m127178g0 + 1);
        AbstractC19074t.m100207e(substring, "substring(...)");
        m127173b0 = AbstractC24342w.m127173b0(substring, ".", 0, false, 6, null);
        if (m127173b0 > 0) {
            m127178g02 = AbstractC24342w.m127178g0(substring, ".", 0, false, 6, null);
            String substring2 = substring.substring(0, m127178g02);
            AbstractC19074t.m100207e(substring2, "substring(...)");
            return substring2;
        }
        return substring;
    }

    /* renamed from: C */
    public final void m91896C(InterfaceC24782h interfaceC24782h, C23528a c23528a) {
        AbstractC19074t.m100208f(interfaceC24782h, "resourceDownloader");
        AbstractC19074t.m100208f(c23528a, "aquery");
        f87768b = interfaceC24782h;
        f87769c = c23528a;
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: a */
    public void mo91897a(String str, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        m91894y().m116414a(new Runnable() { // from class: com.zing.zalo.zinstant.s

            /* renamed from: q */
            public final /* synthetic */ String f87732q;

            public /* synthetic */ RunnableC17178s(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17210v.m91871O(InterfaceC24775a.this, r2);
            }
        });
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: b */
    public void mo91898b(String str, int i11, int i12, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(interfaceC24775a, "listener");
        m91874R(str, new h(interfaceC24775a, i11, i12));
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: c */
    public void mo91899c(String str, int i11, int i12, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(interfaceC24775a, "listener");
        mo91897a(str, new i(interfaceC24775a, i11, i12));
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: d */
    public void mo91900d(String str, int i11, int i12, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(interfaceC24775a, "listener");
        mo91897a(str, new f(interfaceC24775a));
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: e */
    public void mo91901e(String str, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(interfaceC24775a, "listener");
        m91874R(str, new g(interfaceC24775a));
    }

    @Override // ok0.InterfaceC24290g
    /* renamed from: f */
    public void mo91902f(String str, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.TARGET_VIEWPORT);
        m91894y().m116414a(new Runnable() { // from class: com.zing.zalo.zinstant.r

            /* renamed from: p */
            public final /* synthetic */ String f87729p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC24775a f87730q;

            public /* synthetic */ RunnableC17176r(String str2, InterfaceC24775a interfaceC24775a2) {
                r1 = str2;
                r2 = interfaceC24775a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17210v.m91872P(r1, r2);
            }
        });
    }
}
