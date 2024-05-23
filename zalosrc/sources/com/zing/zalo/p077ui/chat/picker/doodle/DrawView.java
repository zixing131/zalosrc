package com.zing.zalo.p077ui.chat.picker.doodle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import ln0.AbstractC22543l;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23170p;
import on0.AbstractC24341v;
import th.AbstractC26689j;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class DrawView extends View {
    public static final C11654a Companion = new C11654a(null);

    /* renamed from: A */
    private Bitmap f60559A;

    /* renamed from: B */
    private Canvas f60560B;

    /* renamed from: C */
    private float f60561C;

    /* renamed from: D */
    private float f60562D;

    /* renamed from: E */
    private boolean f60563E;

    /* renamed from: F */
    private boolean f60564F;

    /* renamed from: G */
    private final Rect f60565G;

    /* renamed from: H */
    private final C1761c0 f60566H;

    /* renamed from: I */
    private final C1761c0 f60567I;

    /* renamed from: J */
    private float f60568J;

    /* renamed from: K */
    private float f60569K;

    /* renamed from: L */
    private final PathMeasure f60570L;

    /* renamed from: p */
    private float f60571p;

    /* renamed from: q */
    private final ArrayList f60572q;

    /* renamed from: r */
    private final PorterDuffXfermode f60573r;

    /* renamed from: s */
    private final Path f60574s;

    /* renamed from: t */
    private final Paint f60575t;

    /* renamed from: u */
    private final Paint f60576u;

    /* renamed from: v */
    private boolean f60577v;

    /* renamed from: w */
    private boolean f60578w;

    /* renamed from: x */
    private Bitmap f60579x;

    /* renamed from: y */
    private int f60580y;

    /* renamed from: z */
    private int f60581z;

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawView$a */
    /* loaded from: classes5.dex */
    public static final class C11654a {
        private C11654a() {
        }

        public /* synthetic */ C11654a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawView$b */
    /* loaded from: classes5.dex */
    public static final class C11655b {

        /* renamed from: a */
        private Path f60582a;

        /* renamed from: b */
        private int f60583b;

        /* renamed from: c */
        private int f60584c;

        /* renamed from: d */
        private float f60585d;

        /* renamed from: e */
        private boolean f60586e;

        /* renamed from: f */
        private float f60587f;

        /* renamed from: g */
        private float f60588g;

        public C11655b(Path path, int i11, int i12, float f11, boolean z11, float f12, float f13) {
            AbstractC19074t.m100208f(path, "path");
            this.f60582a = path;
            this.f60583b = i11;
            this.f60584c = i12;
            this.f60585d = f11;
            this.f60586e = z11;
            this.f60587f = f12;
            this.f60588g = f13;
        }

        /* renamed from: a */
        public final float m64949a() {
            return this.f60585d;
        }

        /* renamed from: b */
        public final int m64950b() {
            return this.f60584c;
        }

        /* renamed from: c */
        public final boolean m64951c() {
            return this.f60586e;
        }

        /* renamed from: d */
        public final int m64952d() {
            return this.f60583b;
        }

        /* renamed from: e */
        public final Path m64953e() {
            return this.f60582a;
        }

        /* renamed from: f */
        public final float m64954f() {
            return this.f60587f;
        }

        /* renamed from: g */
        public final float m64955g() {
            return this.f60588g;
        }

        /* renamed from: h */
        public final void m64956h(float f11) {
            this.f60587f = f11;
        }

        /* renamed from: i */
        public final void m64957i(float f11) {
            this.f60588g = f11;
        }
    }

    public DrawView(Context context, float f11) {
        super(context);
        this.f60571p = f11;
        this.f60572q = new ArrayList();
        this.f60573r = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f60574s = new Path();
        Paint paint = new Paint(5);
        this.f60575t = paint;
        this.f60576u = new Paint(5);
        this.f60563E = true;
        this.f60565G = new Rect();
        this.f60566H = new C1761c0();
        this.f60567I = new C1761c0();
        this.f60570L = new PathMeasure();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.f60571p);
    }

    /* renamed from: a */
    private final void m64935a(int i11, int i12) {
        int m116580c;
        int m116580c2;
        Bitmap bitmap = this.f60559A;
        if (bitmap == null) {
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            setNewDrawingBitmap(createBitmap);
            this.f60561C = 0.0f;
            this.f60562D = 0.0f;
            return;
        }
        if (this.f60564F) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        m116580c = AbstractC22543l.m116580c(i11, width);
        m116580c2 = AbstractC22543l.m116580c(i12, height);
        float f11 = (i11 - m116580c) / 2.0f;
        float f12 = (i12 - m116580c2) / 2.0f;
        if (m116580c > width || m116580c2 > height) {
            Bitmap createBitmap2 = Bitmap.createBitmap(m116580c, m116580c2, bitmap.getConfig());
            AbstractC19074t.m100207e(createBitmap2, "createBitmap(...)");
            setNewDrawingBitmap(createBitmap2);
            float f13 = (m116580c - width) / 2.0f;
            float f14 = (m116580c2 - height) / 2.0f;
            Iterator it = this.f60572q.iterator();
            while (it.hasNext()) {
                C11655b c11655b = (C11655b) it.next();
                c11655b.m64956h(c11655b.m64954f() + f13);
                c11655b.m64957i(c11655b.m64955g() + f14);
                c11655b.m64953e().offset(f13, f14);
            }
            this.f60574s.offset(f13, f14);
            m64937g();
        }
        if (f11 != this.f60561C || f12 != this.f60562D) {
            this.f60561C = f11;
            this.f60562D = f12;
            m64937g();
        }
        this.f60564F = true;
    }

    /* renamed from: b */
    private final void m64936b() {
        Bitmap bitmap;
        Canvas canvas;
        PorterDuffXfermode porterDuffXfermode;
        if (!this.f60563E || (bitmap = this.f60559A) == null || (canvas = this.f60560B) == null) {
            return;
        }
        bitmap.eraseColor(0);
        Bitmap bitmap2 = this.f60579x;
        if (bitmap2 != null) {
            int width = (bitmap.getWidth() - bitmap2.getWidth()) / 2;
            int height = (bitmap.getHeight() - bitmap2.getHeight()) / 2;
            this.f60565G.set(width, height, bitmap2.getWidth() + width, bitmap2.getHeight() + height);
            canvas.drawBitmap(bitmap2, (Rect) null, this.f60565G, this.f60576u);
        }
        Iterator it = this.f60572q.iterator();
        while (it.hasNext()) {
            C11655b c11655b = (C11655b) it.next();
            Paint paint = this.f60575t;
            if (c11655b.m64952d() == 0) {
                porterDuffXfermode = null;
            } else {
                porterDuffXfermode = this.f60573r;
            }
            paint.setXfermode(porterDuffXfermode);
            this.f60575t.setColor(c11655b.m64950b());
            if (c11655b.m64951c()) {
                this.f60575t.setStyle(Paint.Style.FILL);
                canvas.drawCircle(c11655b.m64954f(), c11655b.m64955g(), c11655b.m64949a() / 2, this.f60575t);
            } else {
                this.f60575t.setStyle(Paint.Style.STROKE);
                this.f60575t.setStrokeWidth(c11655b.m64949a());
                canvas.drawPath(c11655b.m64953e(), this.f60575t);
            }
        }
        this.f60563E = false;
    }

    /* renamed from: g */
    private final void m64937g() {
        this.f60563E = true;
    }

    /* renamed from: h */
    private final void m64938h() {
        this.f60566H.mo9221n(Integer.valueOf(this.f60572q.size()));
    }

    /* renamed from: i */
    private final void m64939i() {
        m64937g();
        postInvalidate();
    }

    /* renamed from: k */
    private final void m64940k(float f11, float f12) {
        try {
            float abs = Math.abs(f11 - this.f60568J);
            float abs2 = Math.abs(f12 - this.f60569K);
            if (abs >= 4.0f || abs2 >= 4.0f) {
                Path path = this.f60574s;
                float f13 = this.f60568J;
                float f14 = this.f60569K;
                float f15 = 2;
                path.quadTo(f13, f14, (f11 + f13) / f15, (f12 + f14) / f15);
                this.f60568J = f11;
                this.f60569K = f12;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    private final void m64941l(float f11, float f12) {
        this.f60567I.mo9224q(Boolean.TRUE);
        try {
            this.f60574s.reset();
            this.f60574s.moveTo(f11, f12);
            this.f60568J = f11;
            this.f60569K = f12;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    private final void m64942m() {
        boolean z11;
        this.f60567I.mo9224q(Boolean.FALSE);
        try {
            this.f60574s.lineTo(this.f60568J, this.f60569K);
            this.f60570L.setPath(this.f60574s, false);
            ArrayList arrayList = this.f60572q;
            Path path = new Path(this.f60574s);
            int i11 = this.f60580y;
            int i12 = this.f60581z;
            float f11 = this.f60571p;
            if (this.f60570L.getLength() == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new C11655b(path, i11, i12, f11, z11, this.f60568J, this.f60569K));
            this.f60574s.reset();
            m64939i();
            m64938h();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final void setNewDrawingBitmap(Bitmap bitmap) {
        this.f60559A = bitmap;
        this.f60560B = new Canvas(bitmap);
    }

    /* renamed from: c */
    public final void m64943c() {
        try {
            this.f60580y = 0;
            this.f60572q.clear();
            Bitmap bitmap = this.f60559A;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            m64938h();
            m64939i();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public final boolean m64944d() {
        return !this.f60572q.isEmpty();
    }

    /* renamed from: e */
    public final boolean m64945e() {
        return this.f60577v;
    }

    /* renamed from: f */
    public final boolean m64946f() {
        return this.f60578w;
    }

    public final Bitmap getDoodleBitmap() {
        Bitmap bitmap = this.f60559A;
        if (bitmap == null) {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        return bitmap;
    }

    public final LiveData getDrawObjectsCount() {
        return this.f60566H;
    }

    public final int getMode() {
        return this.f60580y;
    }

    public final LiveData getTouchDrawing() {
        return this.f60567I;
    }

    /* renamed from: j */
    public final void m64947j(String str, int i11) {
        int m116584g;
        boolean m127126v;
        Bitmap m119366x;
        Bitmap bitmap = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f60577v = true;
                m116584g = AbstractC22543l.m116584g(i11, AbstractC26689j.m137110s());
                Bitmap m117967r = AbstractC23009a3.m117967r(str, m116584g);
                if (m117967r != null) {
                    if (m117967r.getWidth() > m117967r.getHeight() && getWidth() > 0 && getHeight() > 0) {
                        m119366x = AbstractC23170p.m119367y(m117967r, getWidth());
                    } else {
                        m119366x = AbstractC23170p.m119366x(m117967r, getHeight());
                    }
                    bitmap = m119366x;
                }
                this.f60579x = bitmap;
                m127126v = AbstractC24341v.m127126v(AbstractC23041d2.m118216o(str), "png", true);
                this.f60578w = m127126v;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            this.f60577v = false;
            this.f60578w = true;
            try {
                Bitmap bitmap2 = this.f60579x;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f60579x = null;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        m64939i();
    }

    /* renamed from: n */
    public final void m64948n() {
        try {
            if (!this.f60572q.isEmpty()) {
                this.f60572q.remove(r0.size() - 1);
            }
            if (!this.f60572q.isEmpty()) {
                m64938h();
            } else {
                this.f60580y = 0;
                m64938h();
            }
            m64939i();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode;
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            m64935a(getWidth(), getHeight());
            m64936b();
            Bitmap bitmap = this.f60559A;
            if (bitmap == null) {
                return;
            }
            canvas.translate(this.f60561C, this.f60562D);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f60576u);
            if (!this.f60574s.isEmpty()) {
                Paint paint = this.f60575t;
                if (this.f60580y == 1) {
                    porterDuffXfermode = this.f60573r;
                } else {
                    porterDuffXfermode = null;
                }
                paint.setXfermode(porterDuffXfermode);
                this.f60575t.setColor(this.f60581z);
                this.f60575t.setStyle(Paint.Style.STROKE);
                this.f60575t.setStrokeWidth(this.f60571p);
                canvas.drawPath(this.f60574s, this.f60575t);
            }
            canvas.translate(-this.f60561C, -this.f60562D);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            this.f60564F = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:            if (r5 != 6) goto L21;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        float x11 = motionEvent.getX() - this.f60561C;
        float y11 = motionEvent.getY() - this.f60562D;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                    }
                } else {
                    m64940k(x11, y11);
                    invalidate();
                }
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            m64942m();
            invalidate();
        } else {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            m64941l(x11, y11);
            invalidate();
        }
        return true;
    }

    public final void setBrushColor(int i11) {
        this.f60581z = i11;
    }

    public final void setBrushSize(float f11) {
        this.f60571p = f11;
    }

    public final void setMode(int i11) {
        this.f60580y = i11;
    }
}
