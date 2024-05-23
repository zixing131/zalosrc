package j40;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import en0.InterfaceC18494a;
import fg0.C18929b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import j40.C20915b;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;
import p664y.AbstractC30228a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sh0.C26253e;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: j40.b */
/* loaded from: classes5.dex */
public final class C20915b extends Drawable implements Animatable {
    public static final c Companion = new c(null);

    /* renamed from: F */
    private static final d f102745F = null;

    /* renamed from: G */
    private static final Handler f102746G = new Handler(Looper.getMainLooper());

    /* renamed from: H */
    private static final ThreadPoolExecutor f102747H;

    /* renamed from: A */
    private boolean f102748A;

    /* renamed from: B */
    private final AtomicBoolean f102749B;

    /* renamed from: C */
    private Drawable f102750C;

    /* renamed from: D */
    private WeakReference f102751D;

    /* renamed from: E */
    private final InterfaceC24854k f102752E;

    /* renamed from: p */
    private final String f102753p;

    /* renamed from: q */
    private final d f102754q;

    /* renamed from: r */
    private C26253e f102755r;

    /* renamed from: s */
    private int f102756s;

    /* renamed from: t */
    private Bitmap f102757t;

    /* renamed from: u */
    private Bitmap f102758u;

    /* renamed from: v */
    private int f102759v;

    /* renamed from: w */
    private int f102760w;

    /* renamed from: x */
    private long f102761x;

    /* renamed from: y */
    private final InterfaceC24854k f102762y;

    /* renamed from: z */
    private final AtomicReference f102763z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: j40.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f102764p = new a("IDLE", 0);

        /* renamed from: q */
        public static final a f102765q = new a("PREPARING", 1);

        /* renamed from: r */
        public static final a f102766r = new a("PREPARED", 2);

        /* renamed from: s */
        public static final a f102767s = new a("RUNNING", 3);

        /* renamed from: t */
        public static final a f102768t = new a("PAUSE", 4);

        /* renamed from: u */
        public static final a f102769u = new a("INVALID", 5);

        /* renamed from: v */
        private static final /* synthetic */ a[] f102770v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f102771w;

        static {
            a[] m109438b = m109438b();
            f102770v = m109438b;
            f102771w = AbstractC30166b.m148796a(m109438b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m109438b() {
            return new a[]{f102764p, f102765q, f102766r, f102767s, f102768t, f102769u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f102770v.clone();
        }
    }

    /* renamed from: j40.b$b */
    /* loaded from: classes5.dex */
    public interface b {
    }

    /* renamed from: j40.b$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C20915b m109440c(c cVar, String str, Drawable drawable, b bVar, d dVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                drawable = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            if ((i11 & 8) != 0) {
                dVar = C20915b.f102745F;
            }
            return cVar.m109443b(str, drawable, bVar, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final long m109441d() {
            return SystemClock.uptimeMillis();
        }

        /* renamed from: f */
        public static /* synthetic */ C20915b m109442f(c cVar, String str, Drawable drawable, d dVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                drawable = null;
            }
            if ((i11 & 4) != 0) {
                dVar = C20915b.f102745F;
            }
            return cVar.m109444e(str, drawable, dVar);
        }

        /* renamed from: b */
        public final C20915b m109443b(String str, Drawable drawable, b bVar, d dVar) {
            AbstractC19074t.m100208f(str, "path");
            C20915b c20915b = new C20915b(str, dVar, null);
            c20915b.m109437y(drawable);
            c20915b.m109436x(bVar);
            c20915b.m109433w();
            return c20915b;
        }

        /* renamed from: e */
        public final C20915b m109444e(String str, Drawable drawable, d dVar) {
            AbstractC19074t.m100208f(str, "path");
            return m109440c(this, str, drawable, null, dVar, 4, null);
        }
    }

    /* renamed from: j40.b$d */
    /* loaded from: classes5.dex */
    public interface d {
        /* renamed from: a */
        C26253e mo91751a(String str);

        /* renamed from: b */
        void mo91752b(String str, C26253e c26253e);
    }

    /* renamed from: j40.b$e */
    /* loaded from: classes5.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f102772a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f102769u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f102766r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f102767s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f102768t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102772a = iArr;
        }
    }

    /* renamed from: j40.b$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m109446c(C20915b c20915b) {
            AbstractC19074t.m100208f(c20915b, "this$0");
            c20915b.invalidateSelf();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Runnable mo12V4() {
            final C20915b c20915b = C20915b.this;
            return new Runnable() { // from class: j40.c
                @Override // java.lang.Runnable
                public final void run() {
                    C20915b.f.m109446c(C20915b.this);
                }
            };
        }
    }

    /* renamed from: j40.b$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f102774q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            return paint;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 4, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C18929b("ZAnimRender"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f102747H = threadPoolExecutor;
    }

    public /* synthetic */ C20915b(String str, d dVar, AbstractC19060k abstractC19060k) {
        this(str, dVar);
    }

    /* renamed from: e */
    private final void m109416e() {
        if (this.f102758u == null && this.f102749B.compareAndSet(false, true)) {
            try {
                int i11 = (this.f102756s + 1) % this.f102759v;
                C26253e c26253e = this.f102755r;
                if (c26253e != null) {
                    this.f102758u = c26253e.mo88378e(i11, true);
                    this.f102760w = c26253e.mo88376c(i11);
                }
                if (!m109429r()) {
                    this.f102757t = this.f102758u;
                }
                this.f102756s = i11;
                long j11 = this.f102761x;
                if (j11 > 0) {
                    m109432v(j11 - Companion.m109441d());
                } else {
                    m109430s();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("ZaloAnimationDrawable").mo104552e(e11);
            }
            this.f102749B.set(false);
        }
    }

    /* renamed from: f */
    private final void m109417f() {
        C26253e c26253e;
        if (this.f102758u == null && !this.f102749B.get() && (c26253e = this.f102755r) != null) {
            if (c26253e.mo88379j()) {
                m109416e();
            } else {
                f102747H.execute(new Runnable() { // from class: j40.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20915b.m109418g(C20915b.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m109418g(C20915b c20915b) {
        AbstractC19074t.m100208f(c20915b, "this$0");
        c20915b.m109416e();
    }

    /* renamed from: h */
    private final void m109419h() {
        m109430s();
    }

    /* renamed from: i */
    private final void m109420i() {
        m109426o();
    }

    /* renamed from: j */
    private final void m109421j() {
        m109430s();
        if (this.f102748A) {
            start();
        }
    }

    /* renamed from: k */
    private final void m109422k() {
        m109430s();
        m109426o();
    }

    /* renamed from: l */
    private final void m109423l(Canvas canvas, Bitmap bitmap, Rect rect) {
        canvas.drawBitmap(bitmap, (Rect) null, rect, m109428q());
    }

    /* renamed from: m */
    private final void m109424m(Canvas canvas, Drawable drawable, Rect rect) {
        if (m109431t(drawable) && !rect.isEmpty()) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    /* renamed from: n */
    private final a m109425n() {
        Object obj = this.f102763z.get();
        AbstractC19074t.m100207e(obj, "get(...)");
        return (a) obj;
    }

    /* renamed from: o */
    private final b m109426o() {
        WeakReference weakReference = this.f102751D;
        if (weakReference != null) {
            AbstractC30228a.m149044a(weakReference.get());
            return null;
        }
        return null;
    }

    /* renamed from: p */
    private final Runnable m109427p() {
        return (Runnable) this.f102752E.getValue();
    }

    /* renamed from: q */
    private final Paint m109428q() {
        return (Paint) this.f102762y.getValue();
    }

    /* renamed from: r */
    private final boolean m109429r() {
        return this.f102759v > 1 && ((long) this.f102760w) > 0;
    }

    /* renamed from: s */
    private final void m109430s() {
        if (AbstractC19074t.m100204b(Looper.myLooper(), Looper.getMainLooper())) {
            invalidateSelf();
        } else {
            m109432v(0L);
        }
    }

    /* renamed from: t */
    private final boolean m109431t(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap == null || bitmap.isRecycled()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: v */
    private final void m109432v(long j11) {
        Handler handler = f102746G;
        handler.removeCallbacks(m109427p());
        handler.postDelayed(m109427p(), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0014, B:8:0x0018, B:11:0x0039, B:13:0x003d, B:14:0x0023, B:16:0x002e, B:18:0x0032, B:20:0x0046, B:22:0x004a, B:23:0x004f, B:27:0x004d), top: B:1:0x0000 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109433w() {
        a aVar;
        C26253e m135004b;
        try {
            if (AbstractC0007b.m4a(this.f102763z, a.f102764p, a.f102765q) && this.f102753p.length() > 0) {
                d dVar = this.f102754q;
                if (dVar != null) {
                    m135004b = dVar.mo91751a(this.f102753p);
                    if (m135004b == null) {
                    }
                    this.f102755r = m135004b;
                    if (m135004b != null) {
                        this.f102759v = m135004b.mo88375b();
                        m109416e();
                    }
                }
                m135004b = C26253e.Companion.m135004b(this.f102753p, 1);
                if (m135004b != null) {
                    d dVar2 = this.f102754q;
                    if (dVar2 != null) {
                        dVar2.mo91752b(this.f102753p, m135004b);
                    }
                } else {
                    m135004b = null;
                }
                this.f102755r = m135004b;
                if (m135004b != null) {
                }
            }
            if (this.f102755r != null) {
                aVar = a.f102766r;
            } else {
                aVar = a.f102769u;
            }
            m109434z(aVar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("ZaloAnimationDrawable").mo104552e(e11);
            m109434z(a.f102769u);
        }
    }

    /* renamed from: z */
    private final boolean m109434z(a aVar) {
        a aVar2 = (a) this.f102763z.get();
        if (aVar2 != aVar && AbstractC0007b.m4a(this.f102763z, aVar2, aVar)) {
            try {
                int i11 = e.f102772a[aVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                m109420i();
                            }
                        } else {
                            m109422k();
                        }
                    } else {
                        m109421j();
                    }
                } else {
                    m109419h();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("ZaloAnimationDrawable").mo104552e(e11);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0068, code lost:            if (r2 == null) goto L40;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:7:0x0015, B:9:0x0027, B:11:0x002b, B:17:0x0039, B:19:0x003d, B:24:0x0048, B:26:0x004d, B:29:0x0057, B:30:0x0089, B:33:0x008f, B:34:0x0093, B:35:0x005a, B:42:0x006d, B:44:0x0075, B:45:0x0077, B:47:0x0085, B:53:0x009b, B:55:0x009f, B:57:0x00a3, B:59:0x00a7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:7:0x0015, B:9:0x0027, B:11:0x002b, B:17:0x0039, B:19:0x003d, B:24:0x0048, B:26:0x004d, B:29:0x0057, B:30:0x0089, B:33:0x008f, B:34:0x0093, B:35:0x005a, B:42:0x006d, B:44:0x0075, B:45:0x0077, B:47:0x0085, B:53:0x009b, B:55:0x009f, B:57:0x00a3, B:59:0x00a7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:7:0x0015, B:9:0x0027, B:11:0x002b, B:17:0x0039, B:19:0x003d, B:24:0x0048, B:26:0x004d, B:29:0x0057, B:30:0x0089, B:33:0x008f, B:34:0x0093, B:35:0x005a, B:42:0x006d, B:44:0x0075, B:45:0x0077, B:47:0x0085, B:53:0x009b, B:55:0x009f, B:57:0x00a3, B:59:0x00a7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:7:0x0015, B:9:0x0027, B:11:0x002b, B:17:0x0039, B:19:0x003d, B:24:0x0048, B:26:0x004d, B:29:0x0057, B:30:0x0089, B:33:0x008f, B:34:0x0093, B:35:0x005a, B:42:0x006d, B:44:0x0075, B:45:0x0077, B:47:0x0085, B:53:0x009b, B:55:0x009f, B:57:0x00a3, B:59:0x00a7), top: B:2:0x0005 }] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean z11;
        Bitmap bitmap;
        Drawable drawable;
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            Rect bounds = getBounds();
            AbstractC19074t.m100207e(bounds, "getBounds(...)");
            if (bounds.isEmpty()) {
                return;
            }
            a aVar = (a) this.f102763z.get();
            Bitmap bitmap2 = this.f102757t;
            Bitmap bitmap3 = this.f102758u;
            boolean z12 = false;
            boolean z13 = true;
            if (aVar != a.f102766r && aVar != a.f102767s && aVar != a.f102768t) {
                z11 = false;
                bitmap = null;
                if (z11 && this.f102759v > 0) {
                    if (!m109429r()) {
                        long m109441d = Companion.m109441d();
                        if (bitmap2 == null && bitmap3 == null) {
                            this.f102761x = m109441d;
                        } else {
                            if (this.f102761x <= m109441d || bitmap2 == null) {
                                z12 = true;
                            }
                            if (z12) {
                                if (bitmap3 == null) {
                                    if (z12) {
                                        if (!AbstractC19074t.m100204b(this.f102757t, bitmap2)) {
                                            this.f102757t = bitmap2;
                                        }
                                        this.f102761x = this.f102760w + m109441d;
                                        if (AbstractC19074t.m100204b(this.f102758u, bitmap3)) {
                                            this.f102758u = null;
                                        }
                                    }
                                    bitmap = bitmap2;
                                    z13 = z12;
                                }
                                bitmap2 = bitmap3;
                                if (z12) {
                                }
                                bitmap = bitmap2;
                                z13 = z12;
                            }
                        }
                        if (aVar == a.f102767s) {
                            if (z13) {
                                m109417f();
                            } else {
                                m109432v(this.f102761x - m109441d);
                            }
                        }
                    } else {
                        if (bitmap2 == null) {
                            bitmap2 = bitmap3;
                        }
                        if (bitmap2 == null) {
                            m109417f();
                        }
                        bitmap = bitmap2;
                    }
                }
                if (bitmap == null) {
                    m109423l(canvas, bitmap, bounds);
                    return;
                } else {
                    if (aVar == a.f102769u && (drawable = this.f102750C) != null) {
                        m109424m(canvas, drawable, bounds);
                        return;
                    }
                    return;
                }
            }
            z11 = true;
            bitmap = null;
            if (z11) {
                if (!m109429r()) {
                }
            }
            if (bitmap == null) {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("ZaloAnimationDrawable").mo104552e(e11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C26253e c26253e = this.f102755r;
        if (c26253e != null) {
            return c26253e.m134995r();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C26253e c26253e = this.f102755r;
        if (c26253e != null) {
            return c26253e.m134996s();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C26253e c26253e = this.f102755r;
        if (c26253e != null && c26253e.m134999v()) {
            return -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f102763z.get() == a.f102767s) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        super.onBoundsChange(rect);
        Drawable drawable = this.f102750C;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        m109428q().setAlpha(i11);
        Drawable drawable = this.f102750C;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m109428q().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (m109435u()) {
            m109419h();
            return;
        }
        if (m109425n() == a.f102764p) {
            this.f102748A = true;
            m109433w();
            return;
        }
        a m109425n = m109425n();
        a aVar = a.f102767s;
        if (m109425n != aVar) {
            m109434z(aVar);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f102748A = false;
        if (isRunning()) {
            m109434z(a.f102768t);
        }
    }

    /* renamed from: u */
    public final boolean m109435u() {
        if (this.f102763z.get() == a.f102769u) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m109436x(b bVar) {
        if (bVar == null) {
            this.f102751D = null;
            return;
        }
        WeakReference weakReference = this.f102751D;
        if (weakReference != null) {
            AbstractC30228a.m149044a(weakReference.get());
        }
        if (!AbstractC19074t.m100204b(null, bVar)) {
            this.f102751D = new WeakReference(bVar);
        }
    }

    /* renamed from: y */
    public final void m109437y(Drawable drawable) {
        this.f102750C = drawable;
        if (drawable != null && drawable.getAlpha() != getAlpha()) {
            drawable.setAlpha(getAlpha());
        }
    }

    private C20915b(String str, d dVar) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f102753p = str;
        this.f102754q = dVar;
        this.f102756s = -1;
        m129210a = AbstractC24856m.m129210a(g.f102774q);
        this.f102762y = m129210a;
        this.f102763z = new AtomicReference(a.f102764p);
        this.f102749B = new AtomicBoolean(false);
        m129210a2 = AbstractC24856m.m129210a(new f());
        this.f102752E = m129210a2;
    }
}
