package p224i0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.graphics.drawable.AbstractC1414a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.d */
/* loaded from: classes2.dex */
public abstract class AbstractC20175d extends Drawable implements Drawable.Callback {

    /* renamed from: A */
    private b f99649A;

    /* renamed from: p */
    private c f99650p;

    /* renamed from: q */
    private Rect f99651q;

    /* renamed from: r */
    private Drawable f99652r;

    /* renamed from: s */
    private Drawable f99653s;

    /* renamed from: u */
    private boolean f99655u;

    /* renamed from: w */
    private boolean f99657w;

    /* renamed from: x */
    private Runnable f99658x;

    /* renamed from: y */
    private long f99659y;

    /* renamed from: z */
    private long f99660z;

    /* renamed from: t */
    private int f99654t = 255;

    /* renamed from: v */
    private int f99656v = -1;

    /* renamed from: i0.d$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC20175d.this.m105225a(true);
            AbstractC20175d.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.d$b */
    /* loaded from: classes2.dex */
    public static class b implements Drawable.Callback {

        /* renamed from: p */
        private Drawable.Callback f99662p;

        b() {
        }

        /* renamed from: a */
        public Drawable.Callback m105229a() {
            Drawable.Callback callback = this.f99662p;
            this.f99662p = null;
            return callback;
        }

        /* renamed from: b */
        public b m105230b(Drawable.Callback callback) {
            this.f99662p = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            Drawable.Callback callback = this.f99662p;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j11);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f99662p;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.d$c */
    /* loaded from: classes2.dex */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        int f99663A;

        /* renamed from: B */
        int f99664B;

        /* renamed from: C */
        boolean f99665C;

        /* renamed from: D */
        ColorFilter f99666D;

        /* renamed from: E */
        boolean f99667E;

        /* renamed from: F */
        ColorStateList f99668F;

        /* renamed from: G */
        PorterDuff.Mode f99669G;

        /* renamed from: H */
        boolean f99670H;

        /* renamed from: I */
        boolean f99671I;

        /* renamed from: a */
        final AbstractC20175d f99672a;

        /* renamed from: b */
        Resources f99673b;

        /* renamed from: c */
        int f99674c;

        /* renamed from: d */
        int f99675d;

        /* renamed from: e */
        int f99676e;

        /* renamed from: f */
        SparseArray f99677f;

        /* renamed from: g */
        Drawable[] f99678g;

        /* renamed from: h */
        int f99679h;

        /* renamed from: i */
        boolean f99680i;

        /* renamed from: j */
        boolean f99681j;

        /* renamed from: k */
        Rect f99682k;

        /* renamed from: l */
        boolean f99683l;

        /* renamed from: m */
        boolean f99684m;

        /* renamed from: n */
        int f99685n;

        /* renamed from: o */
        int f99686o;

        /* renamed from: p */
        int f99687p;

        /* renamed from: q */
        int f99688q;

        /* renamed from: r */
        boolean f99689r;

        /* renamed from: s */
        int f99690s;

        /* renamed from: t */
        boolean f99691t;

        /* renamed from: u */
        boolean f99692u;

        /* renamed from: v */
        boolean f99693v;

        /* renamed from: w */
        boolean f99694w;

        /* renamed from: x */
        boolean f99695x;

        /* renamed from: y */
        boolean f99696y;

        /* renamed from: z */
        int f99697z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, AbstractC20175d abstractC20175d, Resources resources) {
            Resources resources2;
            int i11;
            this.f99674c = 160;
            this.f99680i = false;
            this.f99683l = false;
            this.f99695x = true;
            this.f99663A = 0;
            this.f99664B = 0;
            this.f99672a = abstractC20175d;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f99673b;
            } else {
                resources2 = null;
            }
            this.f99673b = resources2;
            if (cVar != null) {
                i11 = cVar.f99674c;
            } else {
                i11 = 0;
            }
            int m105224f = AbstractC20175d.m105224f(resources, i11);
            this.f99674c = m105224f;
            if (cVar != null) {
                this.f99675d = cVar.f99675d;
                this.f99676e = cVar.f99676e;
                this.f99693v = true;
                this.f99694w = true;
                this.f99680i = cVar.f99680i;
                this.f99683l = cVar.f99683l;
                this.f99695x = cVar.f99695x;
                this.f99696y = cVar.f99696y;
                this.f99697z = cVar.f99697z;
                this.f99663A = cVar.f99663A;
                this.f99664B = cVar.f99664B;
                this.f99665C = cVar.f99665C;
                this.f99666D = cVar.f99666D;
                this.f99667E = cVar.f99667E;
                this.f99668F = cVar.f99668F;
                this.f99669G = cVar.f99669G;
                this.f99670H = cVar.f99670H;
                this.f99671I = cVar.f99671I;
                if (cVar.f99674c == m105224f) {
                    if (cVar.f99681j) {
                        this.f99682k = new Rect(cVar.f99682k);
                        this.f99681j = true;
                    }
                    if (cVar.f99684m) {
                        this.f99685n = cVar.f99685n;
                        this.f99686o = cVar.f99686o;
                        this.f99687p = cVar.f99687p;
                        this.f99688q = cVar.f99688q;
                        this.f99684m = true;
                    }
                }
                if (cVar.f99689r) {
                    this.f99690s = cVar.f99690s;
                    this.f99689r = true;
                }
                if (cVar.f99691t) {
                    this.f99692u = cVar.f99692u;
                    this.f99691t = true;
                }
                Drawable[] drawableArr = cVar.f99678g;
                this.f99678g = new Drawable[drawableArr.length];
                this.f99679h = cVar.f99679h;
                SparseArray sparseArray = cVar.f99677f;
                if (sparseArray != null) {
                    this.f99677f = sparseArray.clone();
                } else {
                    this.f99677f = new SparseArray(this.f99679h);
                }
                int i12 = this.f99679h;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f99677f.put(i13, constantState);
                        } else {
                            this.f99678g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f99678g = new Drawable[10];
            this.f99679h = 0;
        }

        /* renamed from: e */
        private void m105231e() {
            SparseArray sparseArray = this.f99677f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f99678g[this.f99677f.keyAt(i11)] = m105232s(((Drawable.ConstantState) this.f99677f.valueAt(i11)).newDrawable(this.f99673b));
                }
                this.f99677f = null;
            }
        }

        /* renamed from: s */
        private Drawable m105232s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f99697z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f99672a);
            return mutate;
        }

        /* renamed from: a */
        public final int m105233a(Drawable drawable) {
            int i11 = this.f99679h;
            if (i11 >= this.f99678g.length) {
                mo105246o(i11, i11 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f99672a);
            this.f99678g[i11] = drawable;
            this.f99679h++;
            this.f99676e = drawable.getChangingConfigurations() | this.f99676e;
            m105247p();
            this.f99682k = null;
            this.f99681j = false;
            this.f99684m = false;
            this.f99693v = false;
            return i11;
        }

        /* renamed from: b */
        final void m105234b(Resources.Theme theme) {
            if (theme != null) {
                m105231e();
                int i11 = this.f99679h;
                Drawable[] drawableArr = this.f99678g;
                for (int i12 = 0; i12 < i11; i12++) {
                    Drawable drawable = drawableArr[i12];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i12].applyTheme(theme);
                        this.f99676e |= drawableArr[i12].getChangingConfigurations();
                    }
                }
                m105254y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean m105235c() {
            if (this.f99693v) {
                return this.f99694w;
            }
            m105231e();
            this.f99693v = true;
            int i11 = this.f99679h;
            Drawable[] drawableArr = this.f99678g;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getConstantState() == null) {
                    this.f99694w = false;
                    return false;
                }
            }
            this.f99694w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i11 = this.f99679h;
            Drawable[] drawableArr = this.f99678g;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f99677f.get(i12);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m105236d() {
            this.f99684m = true;
            m105231e();
            int i11 = this.f99679h;
            Drawable[] drawableArr = this.f99678g;
            this.f99686o = -1;
            this.f99685n = -1;
            this.f99688q = 0;
            this.f99687p = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f99685n) {
                    this.f99685n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f99686o) {
                    this.f99686o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f99687p) {
                    this.f99687p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f99688q) {
                    this.f99688q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m105237f() {
            return this.f99678g.length;
        }

        /* renamed from: g */
        public final Drawable m105238g(int i11) {
            int indexOfKey;
            Drawable drawable = this.f99678g[i11];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f99677f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i11)) < 0) {
                return null;
            }
            Drawable m105232s = m105232s(((Drawable.ConstantState) this.f99677f.valueAt(indexOfKey)).newDrawable(this.f99673b));
            this.f99678g[i11] = m105232s;
            this.f99677f.removeAt(indexOfKey);
            if (this.f99677f.size() == 0) {
                this.f99677f = null;
            }
            return m105232s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f99675d | this.f99676e;
        }

        /* renamed from: h */
        public final int m105239h() {
            return this.f99679h;
        }

        /* renamed from: i */
        public final int m105240i() {
            if (!this.f99684m) {
                m105236d();
            }
            return this.f99686o;
        }

        /* renamed from: j */
        public final int m105241j() {
            if (!this.f99684m) {
                m105236d();
            }
            return this.f99688q;
        }

        /* renamed from: k */
        public final int m105242k() {
            if (!this.f99684m) {
                m105236d();
            }
            return this.f99687p;
        }

        /* renamed from: l */
        public final Rect m105243l() {
            Rect rect = null;
            if (this.f99680i) {
                return null;
            }
            Rect rect2 = this.f99682k;
            if (rect2 == null && !this.f99681j) {
                m105231e();
                Rect rect3 = new Rect();
                int i11 = this.f99679h;
                Drawable[] drawableArr = this.f99678g;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (drawableArr[i12].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i13 = rect3.left;
                        if (i13 > rect.left) {
                            rect.left = i13;
                        }
                        int i14 = rect3.top;
                        if (i14 > rect.top) {
                            rect.top = i14;
                        }
                        int i15 = rect3.right;
                        if (i15 > rect.right) {
                            rect.right = i15;
                        }
                        int i16 = rect3.bottom;
                        if (i16 > rect.bottom) {
                            rect.bottom = i16;
                        }
                    }
                }
                this.f99681j = true;
                this.f99682k = rect;
                return rect;
            }
            return rect2;
        }

        /* renamed from: m */
        public final int m105244m() {
            if (!this.f99684m) {
                m105236d();
            }
            return this.f99685n;
        }

        /* renamed from: n */
        public final int m105245n() {
            int i11;
            if (this.f99689r) {
                return this.f99690s;
            }
            m105231e();
            int i12 = this.f99679h;
            Drawable[] drawableArr = this.f99678g;
            if (i12 > 0) {
                i11 = drawableArr[0].getOpacity();
            } else {
                i11 = -2;
            }
            for (int i13 = 1; i13 < i12; i13++) {
                i11 = Drawable.resolveOpacity(i11, drawableArr[i13].getOpacity());
            }
            this.f99690s = i11;
            this.f99689r = true;
            return i11;
        }

        /* renamed from: o */
        public void mo105246o(int i11, int i12) {
            Drawable[] drawableArr = new Drawable[i12];
            System.arraycopy(this.f99678g, 0, drawableArr, 0, i11);
            this.f99678g = drawableArr;
        }

        /* renamed from: p */
        void m105247p() {
            this.f99689r = false;
            this.f99691t = false;
        }

        /* renamed from: q */
        public final boolean m105248q() {
            return this.f99683l;
        }

        /* renamed from: r */
        abstract void mo105215r();

        /* renamed from: t */
        public final void m105249t(boolean z11) {
            this.f99683l = z11;
        }

        /* renamed from: u */
        public final void m105250u(int i11) {
            this.f99663A = i11;
        }

        /* renamed from: v */
        public final void m105251v(int i11) {
            this.f99664B = i11;
        }

        /* renamed from: w */
        final boolean m105252w(int i11, int i12) {
            boolean z11;
            int i13 = this.f99679h;
            Drawable[] drawableArr = this.f99678g;
            boolean z12 = false;
            for (int i14 = 0; i14 < i13; i14++) {
                Drawable drawable = drawableArr[i14];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z11 = drawable.setLayoutDirection(i11);
                    } else {
                        z11 = false;
                    }
                    if (i14 == i12) {
                        z12 = z11;
                    }
                }
            }
            this.f99697z = i11;
            return z12;
        }

        /* renamed from: x */
        public final void m105253x(boolean z11) {
            this.f99680i = z11;
        }

        /* renamed from: y */
        final void m105254y(Resources resources) {
            if (resources != null) {
                this.f99673b = resources;
                int m105224f = AbstractC20175d.m105224f(resources, this.f99674c);
                int i11 = this.f99674c;
                this.f99674c = m105224f;
                if (i11 != m105224f) {
                    this.f99684m = false;
                    this.f99681j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m105222d(Drawable drawable) {
        int layoutDirection;
        if (this.f99649A == null) {
            this.f99649A = new b();
        }
        drawable.setCallback(this.f99649A.m105230b(drawable.getCallback()));
        try {
            if (this.f99650p.f99663A <= 0 && this.f99655u) {
                drawable.setAlpha(this.f99654t);
            }
            c cVar = this.f99650p;
            if (cVar.f99667E) {
                drawable.setColorFilter(cVar.f99666D);
            } else {
                if (cVar.f99670H) {
                    AbstractC1414a.m7197o(drawable, cVar.f99668F);
                }
                c cVar2 = this.f99650p;
                if (cVar2.f99671I) {
                    AbstractC1414a.m7198p(drawable, cVar2.f99669G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f99650p.f99695x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                layoutDirection = getLayoutDirection();
                drawable.setLayoutDirection(layoutDirection);
            }
            drawable.setAutoMirrored(this.f99650p.f99665C);
            Rect rect = this.f99651q;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f99649A.m105229a());
        } catch (Throwable th2) {
            drawable.setCallback(this.f99649A.m105229a());
            throw th2;
        }
    }

    /* renamed from: e */
    private boolean m105223e() {
        if (isAutoMirrored() && AbstractC1414a.m7188f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    static int m105224f(Resources resources, int i11) {
        if (resources != null) {
            i11 = resources.getDisplayMetrics().densityDpi;
        }
        if (i11 == 0) {
            return 160;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m105225a(boolean z11) {
        boolean z12;
        Drawable drawable;
        boolean z13 = true;
        this.f99655u = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f99652r;
        if (drawable2 != null) {
            long j11 = this.f99659y;
            if (j11 != 0) {
                if (j11 <= uptimeMillis) {
                    drawable2.setAlpha(this.f99654t);
                    this.f99659y = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - uptimeMillis) * 255)) / this.f99650p.f99663A)) * this.f99654t) / 255);
                    z12 = true;
                    drawable = this.f99653s;
                    if (drawable == null) {
                        long j12 = this.f99660z;
                        if (j12 != 0) {
                            if (j12 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.f99653s = null;
                                this.f99660z = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j12 - uptimeMillis) * 255)) / this.f99650p.f99664B) * this.f99654t) / 255);
                                if (z11 && z13) {
                                    scheduleSelf(this.f99658x, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.f99660z = 0L;
                    }
                    z13 = z12;
                    if (z11) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else {
            this.f99659y = 0L;
        }
        z12 = false;
        drawable = this.f99653s;
        if (drawable == null) {
        }
        z13 = z12;
        if (z11) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f99650p.m105234b(theme);
    }

    /* renamed from: b */
    abstract c mo105201b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m105226c() {
        return this.f99656v;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f99650p.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f99653s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m105227g(int i11) {
        Runnable runnable;
        if (i11 == this.f99656v) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f99650p.f99664B > 0) {
            Drawable drawable = this.f99653s;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f99652r;
            if (drawable2 != null) {
                this.f99653s = drawable2;
                this.f99660z = this.f99650p.f99664B + uptimeMillis;
            } else {
                this.f99653s = null;
                this.f99660z = 0L;
            }
        } else {
            Drawable drawable3 = this.f99652r;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i11 >= 0) {
            c cVar = this.f99650p;
            if (i11 < cVar.f99679h) {
                Drawable m105238g = cVar.m105238g(i11);
                this.f99652r = m105238g;
                this.f99656v = i11;
                if (m105238g != null) {
                    int i12 = this.f99650p.f99663A;
                    if (i12 > 0) {
                        this.f99659y = uptimeMillis + i12;
                    }
                    m105222d(m105238g);
                }
                if (this.f99659y == 0 || this.f99660z != 0) {
                    runnable = this.f99658x;
                    if (runnable != null) {
                        this.f99658x = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    m105225a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f99652r = null;
        this.f99656v = -1;
        if (this.f99659y == 0) {
        }
        runnable = this.f99658x;
        if (runnable != null) {
        }
        m105225a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f99654t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f99650p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f99650p.m105235c()) {
            this.f99650p.f99675d = getChangingConfigurations();
            return this.f99650p;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f99652r;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f99651q;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f99650p.m105248q()) {
            return this.f99650p.m105240i();
        }
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f99650p.m105248q()) {
            return this.f99650p.m105244m();
        }
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f99650p.m105248q()) {
            return this.f99650p.m105241j();
        }
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f99650p.m105248q()) {
            return this.f99650p.m105242k();
        }
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f99652r;
        if (drawable != null && drawable.isVisible()) {
            return this.f99650p.m105245n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m105243l = this.f99650p.m105243l();
        if (m105243l != null) {
            rect.set(m105243l);
            if ((m105243l.right | m105243l.left | m105243l.top | m105243l.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f99652r;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m105223e()) {
            int i11 = rect.left;
            rect.left = rect.right;
            rect.right = i11;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo105202h(c cVar) {
        this.f99650p = cVar;
        int i11 = this.f99656v;
        if (i11 >= 0) {
            Drawable m105238g = cVar.m105238g(i11);
            this.f99652r = m105238g;
            if (m105238g != null) {
                m105222d(m105238g);
            }
        }
        this.f99653s = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m105228i(Resources resources) {
        this.f99650p.m105254y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f99650p;
        if (cVar != null) {
            cVar.m105247p();
        }
        if (drawable == this.f99652r && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f99650p.f99665C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z11;
        Drawable drawable = this.f99653s;
        boolean z12 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f99653s = null;
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.f99652r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f99655u) {
                this.f99652r.setAlpha(this.f99654t);
            }
        }
        if (this.f99660z != 0) {
            this.f99660z = 0L;
        } else {
            z12 = z11;
        }
        if (this.f99659y != 0) {
            this.f99659y = 0L;
        } else if (!z12) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f99657w && super.mutate() == this) {
            c mo105201b = mo105201b();
            mo105201b.mo105215r();
            mo105202h(mo105201b);
            this.f99657w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f99653s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f99652r;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return this.f99650p.m105252w(i11, m105226c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f99653s;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        Drawable drawable2 = this.f99652r;
        if (drawable2 != null) {
            return drawable2.setLevel(i11);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        if (drawable == this.f99652r && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (!this.f99655u || this.f99654t != i11) {
            this.f99655u = true;
            this.f99654t = i11;
            Drawable drawable = this.f99652r;
            if (drawable != null) {
                if (this.f99659y == 0) {
                    drawable.setAlpha(i11);
                } else {
                    m105225a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        c cVar = this.f99650p;
        if (cVar.f99665C != z11) {
            cVar.f99665C = z11;
            Drawable drawable = this.f99652r;
            if (drawable != null) {
                AbstractC1414a.m7192j(drawable, z11);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f99650p;
        cVar.f99667E = true;
        if (cVar.f99666D != colorFilter) {
            cVar.f99666D = colorFilter;
            Drawable drawable = this.f99652r;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        c cVar = this.f99650p;
        if (cVar.f99695x != z11) {
            cVar.f99695x = z11;
            Drawable drawable = this.f99652r;
            if (drawable != null) {
                drawable.setDither(z11);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            AbstractC1414a.m7193k(drawable, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        Rect rect = this.f99651q;
        if (rect == null) {
            this.f99651q = new Rect(i11, i12, i13, i14);
        } else {
            rect.set(i11, i12, i13, i14);
        }
        Drawable drawable = this.f99652r;
        if (drawable != null) {
            AbstractC1414a.m7194l(drawable, i11, i12, i13, i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f99650p;
        cVar.f99670H = true;
        if (cVar.f99668F != colorStateList) {
            cVar.f99668F = colorStateList;
            AbstractC1414a.m7197o(this.f99652r, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f99650p;
        cVar.f99671I = true;
        if (cVar.f99669G != mode) {
            cVar.f99669G = mode;
            AbstractC1414a.m7198p(this.f99652r, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.f99653s;
        if (drawable != null) {
            drawable.setVisible(z11, z12);
        }
        Drawable drawable2 = this.f99652r;
        if (drawable2 != null) {
            drawable2.setVisible(z11, z12);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f99652r && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
