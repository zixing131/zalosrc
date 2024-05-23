package sh0;

import android.graphics.Bitmap;
import android.util.SparseArray;
import bn0.AbstractC2933b;
import com.zing.zalo.zmedia.zanimation.ZAnimation;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: sh0.e */
/* loaded from: classes7.dex */
public final class C26253e extends AbstractC26250b {
    public static final c Companion = new c(null);

    /* renamed from: m */
    private static final a f124670m = new b();

    /* renamed from: c */
    private final int f124671c;

    /* renamed from: d */
    private final Object f124672d;

    /* renamed from: e */
    private ZAnimation f124673e;

    /* renamed from: f */
    private ZAnimation.ZState f124674f;

    /* renamed from: g */
    private Bitmap f124675g;

    /* renamed from: h */
    private long[] f124676h;

    /* renamed from: i */
    private final AtomicBoolean f124677i;

    /* renamed from: j */
    private final AtomicBoolean f124678j;

    /* renamed from: k */
    private final InterfaceC24854k f124679k;

    /* renamed from: l */
    private final InterfaceC24854k f124680l;

    /* renamed from: sh0.e$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        Bitmap mo135000a(int i11, int i12);

        /* renamed from: b */
        void mo135001b(Bitmap bitmap);
    }

    /* renamed from: sh0.e$b */
    /* loaded from: classes7.dex */
    public static final class b implements a {
        b() {
        }

        @Override // sh0.C26253e.a
        /* renamed from: a */
        public Bitmap mo135000a(int i11, int i12) {
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            return createBitmap;
        }

        @Override // sh0.C26253e.a
        /* renamed from: b */
        public void mo135001b(Bitmap bitmap) {
            AbstractC19074t.m100208f(bitmap, "bitmap");
            bitmap.recycle();
        }
    }

    /* renamed from: sh0.e$c */
    /* loaded from: classes7.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C26253e m135002c(c cVar, String str, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 2;
            }
            return cVar.m135004b(str, i11);
        }

        /* renamed from: a */
        public final Bitmap m135003a(int i11, int i12) {
            Bitmap mo135000a = m135005d().mo135000a(i11, i12);
            if (mo135000a.getWidth() >= i11 && mo135000a.getHeight() >= i12 && mo135000a.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException("Invalid bitmap provided".toString());
            }
            return mo135000a;
        }

        /* renamed from: b */
        public final C26253e m135004b(String str, int i11) {
            AbstractC19074t.m100208f(str, "localPath");
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    C26253e c26253e = new C26253e(str, fileInputStream, i11);
                    AbstractC2933b.m13890a(fileInputStream, null);
                    return c26253e;
                } finally {
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }

        /* renamed from: d */
        public final a m135005d() {
            return C26253e.f124670m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh0.e$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean z11;
            if (C26253e.this.m134997t() != 2 && AbstractC26254f.m135008a() < C26252d.f124668a.m134988b()) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh0.e$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f124682q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SparseArray mo12V4() {
            return new SparseArray();
        }
    }

    public C26253e(String str, InputStream inputStream, int i11) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(inputStream, "inputStream");
        this.f124671c = i11;
        this.f124672d = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f124677i = atomicBoolean;
        this.f124678j = new AtomicBoolean(false);
        m129210a = AbstractC24856m.m129210a(e.f124682q);
        this.f124679k = m129210a;
        try {
            ZAnimation decodeByteArray = ZAnimation.decodeByteArray(C26251c.f124664a.m134985d(str, inputStream), i11);
            this.f124673e = decodeByteArray;
            if (decodeByteArray != null) {
                this.f124674f = decodeByteArray.createState();
                this.f124676h = new long[decodeByteArray.getFrameCount()];
                this.f124675g = Companion.m135003a(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                atomicBoolean.set(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        m129210a2 = AbstractC24856m.m129210a(new d());
        this.f124680l = m129210a2;
    }

    /* renamed from: o */
    private final boolean m134991o() {
        return ((Boolean) this.f124680l.getValue()).booleanValue();
    }

    /* renamed from: p */
    private final SparseArray m134992p() {
        return (SparseArray) this.f124679k.getValue();
    }

    /* renamed from: q */
    private final Bitmap m134993q(int i11) {
        try {
            Bitmap bitmap = (Bitmap) m134992p().get(i11);
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    return bitmap;
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: a */
    public void mo88374a() {
        synchronized (this.f124672d) {
            m134992p().clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        m134994n();
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: b */
    public int mo88375b() {
        ZAnimation zAnimation;
        int i11 = 0;
        try {
            if (this.f124677i.get() && (zAnimation = this.f124673e) != null) {
                i11 = zAnimation.getFrameCount();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 <= 0) {
            return 1;
        }
        return i11;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: c */
    public int mo88376c(int i11) {
        long j11;
        long[] jArr;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (this.f124677i.get() && (jArr = this.f124676h) != null) {
            j11 = jArr[i11 % jArr.length];
            return (int) j11;
        }
        j11 = 100;
        return (int) j11;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: d */
    public Bitmap mo88377d(int i11) {
        return mo88378e(i11, false);
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: e */
    public Bitmap mo88378e(int i11, boolean z11) {
        int m116580c;
        long j11;
        int m116580c2;
        Bitmap m134993q;
        Bitmap m134993q2;
        if (z11 && (m134993q2 = m134993q(i11)) != null) {
            return m134993q2;
        }
        Bitmap bitmap = null;
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        synchronized (this.f124672d) {
            if (!this.f124678j.get() && this.f124677i.get()) {
                if (mo88375b() < 1) {
                    return null;
                }
                if (!z11 || (m134993q = m134993q(i11)) == null) {
                    m116580c = AbstractC22543l.m116580c(i11, 0);
                    int mo88375b = m116580c % mo88375b();
                    int i12 = mo88375b - 1;
                    if (mo88375b == 0) {
                        i12 = -1;
                    }
                    ZAnimation.ZState zState = this.f124674f;
                    if (zState != null) {
                        j11 = zState.getFrame(mo88375b, this.f124675g, i12);
                    } else {
                        j11 = -1;
                    }
                    if (j11 < 0) {
                        j11 = 100;
                    } else if (j11 < 16) {
                        j11 = 16;
                    }
                    long[] jArr = this.f124676h;
                    if (jArr != null) {
                        m116580c2 = AbstractC22543l.m116580c(0, mo88375b);
                        jArr[m116580c2 % jArr.length] = j11;
                    }
                    Bitmap bitmap2 = this.f124675g;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    if (m134991o()) {
                        m134992p().put(i11, bitmap);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    return bitmap;
                }
                return m134993q;
            }
            return null;
        }
    }

    protected final void finalize() {
        try {
            ZAnimation.ZState zState = this.f124674f;
            if (zState != null) {
                zState.destroy();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // p098dc.InterfaceC17872f
    public int getType() {
        return 0;
    }

    @Override // sh0.AbstractC26250b
    /* renamed from: j */
    public boolean mo88379j() {
        if (m134992p().size() == mo88375b()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void m134994n() {
        synchronized (this.f124672d) {
            try {
                Bitmap bitmap = this.f124675g;
                if (bitmap != null) {
                    if (!this.f124678j.get() && this.f124677i.get()) {
                        f124670m.mo135001b(bitmap);
                        this.f124678j.set(true);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public final int m134995r() {
        ZAnimation zAnimation = this.f124673e;
        if (zAnimation != null) {
            return zAnimation.getHeight();
        }
        return 0;
    }

    /* renamed from: s */
    public final int m134996s() {
        ZAnimation zAnimation = this.f124673e;
        if (zAnimation != null) {
            return zAnimation.getWidth();
        }
        return 0;
    }

    /* renamed from: t */
    public final int m134997t() {
        return this.f124671c;
    }

    /* renamed from: u */
    public final boolean m134998u() {
        boolean z11;
        synchronized (this.f124672d) {
            if (!this.f124678j.get()) {
                if (this.f124677i.get()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        return z11;
    }

    /* renamed from: v */
    public final boolean m134999v() {
        ZAnimation zAnimation = this.f124673e;
        if (zAnimation != null) {
            return zAnimation.isOpaque();
        }
        return false;
    }

    public /* synthetic */ C26253e(String str, InputStream inputStream, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(str, inputStream, (i12 & 4) != 0 ? 2 : i11);
    }
}
