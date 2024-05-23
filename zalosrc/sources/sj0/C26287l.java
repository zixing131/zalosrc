package sj0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.zing.zalo.zinstant.AbstractC17158i1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import ll0.C22514b;
import ln0.AbstractC22543l;

/* renamed from: sj0.l */
/* loaded from: classes7.dex */
public final class C26287l extends Drawable {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f124809a;

    /* renamed from: b */
    private int f124810b;

    /* renamed from: c */
    private int f124811c;

    /* renamed from: d */
    private int f124812d;

    /* renamed from: e */
    private int f124813e;

    /* renamed from: f */
    private float f124814f;

    /* renamed from: g */
    private float f124815g;

    /* renamed from: h */
    private boolean f124816h;

    /* renamed from: i */
    private boolean f124817i;

    /* renamed from: j */
    private boolean f124818j;

    /* renamed from: k */
    private boolean f124819k;

    /* renamed from: p */
    private Bitmap f124824p;

    /* renamed from: l */
    private int[] f124820l = new int[0];

    /* renamed from: m */
    private int[] f124821m = new int[0];

    /* renamed from: n */
    private int[] f124822n = new int[0];

    /* renamed from: o */
    private int[] f124823o = new int[0];

    /* renamed from: q */
    private final Paint f124825q = new Paint(3);

    /* renamed from: r */
    private final Rect f124826r = new Rect();

    /* renamed from: s */
    private final Rect f124827s = new Rect();

    /* renamed from: sj0.l$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: e */
    private final void m135253e(Bitmap bitmap, int i11) {
        RenderScript create = RenderScript.create(AbstractC17158i1.m91742a());
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(i11);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap);
        create2.destroy();
        create.destroy();
        createFromBitmap.destroy();
        createTyped.destroy();
    }

    /* renamed from: f */
    private final void m135254f() {
        float f11;
        int i11 = (((this.f124811c * 2) + ((int) this.f124815g)) << 1) + 1;
        final Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f124813e);
        int i12 = this.f124811c;
        Rect rect = new Rect(i12, i12, i11 - i12, i11 - i12);
        C26280e c26280e = new C26280e();
        c26280e.m135230h(rect.width(), rect.height());
        float f12 = this.f124815g;
        if (f12 > 0.0f) {
            f11 = f12 + this.f124811c;
        } else {
            f11 = 0.0f;
        }
        c26280e.m135234m(f11, this.f124816h, this.f124817i, this.f124819k, this.f124818j);
        c26280e.m135232k(paint);
        c26280e.setBounds(rect);
        c26280e.draw(canvas);
        this.f124820l = new int[]{0, (int) ((this.f124811c * 2) + this.f124815g), createBitmap.getWidth() - ((int) ((this.f124811c * 2) + this.f124815g)), createBitmap.getWidth()};
        this.f124821m = new int[]{0, (int) ((this.f124811c * 2) + this.f124815g), createBitmap.getHeight() - ((int) ((this.f124811c * 2) + this.f124815g)), createBitmap.getHeight()};
        try {
            AbstractC19074t.m100207e(createBitmap, "bitmap");
            m135253e(createBitmap, this.f124811c);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104553f(e11, "BoxShadow RenderScript has failed.", new Object[0]);
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: sj0.k
            @Override // java.lang.Runnable
            public final void run() {
                C26287l.m135255g(C26287l.this, createBitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m135255g(C26287l c26287l, Bitmap bitmap) {
        AbstractC19074t.m100208f(c26287l, "this$0");
        c26287l.m135257i();
        c26287l.f124824p = bitmap;
    }

    /* renamed from: h */
    private final boolean m135256h() {
        if (this.f124820l.length == 4 && this.f124822n.length == 4 && this.f124821m.length == 4 && this.f124823o.length == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private final void m135257i() {
        Bitmap bitmap = this.f124824p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f124824p = null;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m135258k(C26287l c26287l) {
        AbstractC19074t.m100208f(c26287l, "this$0");
        c26287l.m135257i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m135259l(C26287l c26287l) {
        AbstractC19074t.m100208f(c26287l, "this$0");
        c26287l.m135254f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m135260m(C26287l c26287l) {
        AbstractC19074t.m100208f(c26287l, "this$0");
        c26287l.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Bitmap bitmap = this.f124824p;
        if (bitmap != null && m135256h()) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (i12 < 3) {
                    Rect rect = this.f124826r;
                    int[] iArr = this.f124820l;
                    int i13 = iArr[i11];
                    int[] iArr2 = this.f124821m;
                    int i14 = i11 + 1;
                    int i15 = i12 + 1;
                    rect.set(i13, iArr2[i12], iArr[i14], iArr2[i15]);
                    Rect rect2 = this.f124827s;
                    int[] iArr3 = this.f124822n;
                    int i16 = iArr3[i11];
                    int[] iArr4 = this.f124823o;
                    rect2.set(i16, iArr4[i12], iArr3[i14], iArr4[i15]);
                    canvas.drawBitmap(bitmap, this.f124826r, this.f124827s, this.f124825q);
                    i12 = i15;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* renamed from: j */
    public final void m135261j(int i11, int i12, int i13, int i14, int i15, float f11, boolean z11, boolean z12, boolean z13, boolean z14, int i16, int i17) {
        int min = Math.min(Math.max((int) (i13 * 1.6666666f), 0), 25);
        float ceil = (float) Math.ceil(Math.min(f11, Math.min(i16, i17) / 2.0f));
        boolean z15 = (this.f124809a == i11 && this.f124810b == i12) ? false : true;
        boolean z16 = (this.f124811c == min && this.f124812d == i14 && this.f124813e == i15 && this.f124814f == ceil && this.f124816h == z11 && this.f124817i == z12 && this.f124818j == z14 && this.f124819k == z13) ? false : true;
        this.f124810b = i12;
        this.f124809a = i11;
        this.f124811c = min;
        this.f124812d = i14;
        this.f124813e = i15;
        this.f124814f = ceil;
        this.f124815g = ceil > 0.0f ? i14 + ceil : 0.0f;
        this.f124816h = z11;
        this.f124817i = z12;
        this.f124818j = z14;
        this.f124819k = z13;
        if (z16) {
            AbstractC19444a.m101695c(new Runnable() { // from class: sj0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C26287l.m135258k(C26287l.this);
                }
            });
            C22514b.m116415b().m116416a(new Runnable() { // from class: sj0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C26287l.m135259l(C26287l.this);
                }
            });
        } else if (z15) {
            AbstractC19444a.m101695c(new Runnable() { // from class: sj0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C26287l.m135260m(C26287l.this);
                }
            });
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int m116584g;
        int m116584g2;
        int m116584g3;
        int m116584g4;
        AbstractC19074t.m100208f(rect, "bounds");
        super.onBoundsChange(rect);
        int i11 = rect.left;
        int i12 = this.f124809a;
        int i13 = this.f124811c;
        int i14 = this.f124812d;
        int i15 = rect.top;
        int i16 = this.f124810b;
        Rect rect2 = new Rect(((i11 + i12) - i13) - i14, ((i15 + i16) - i13) - i14, rect.right + i12 + i13 + i14, rect.bottom + i16 + i13 + i14);
        int i17 = rect2.left;
        m116584g = AbstractC22543l.m116584g((this.f124811c * 2) + ((int) this.f124815g), rect2.width() / 2);
        int i18 = rect2.right;
        m116584g2 = AbstractC22543l.m116584g((this.f124811c * 2) + ((int) this.f124815g), rect2.width() / 2);
        this.f124822n = new int[]{i17, m116584g + i17, i18 - m116584g2, rect2.right};
        int i19 = rect2.top;
        m116584g3 = AbstractC22543l.m116584g((this.f124811c * 2) + ((int) this.f124815g), rect2.height() / 2);
        int i21 = rect2.bottom;
        m116584g4 = AbstractC22543l.m116584g((this.f124811c * 2) + ((int) this.f124815g), rect2.height() / 2);
        this.f124823o = new int[]{i19, m116584g3 + i19, i21 - m116584g4, rect2.bottom};
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f124825q.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
