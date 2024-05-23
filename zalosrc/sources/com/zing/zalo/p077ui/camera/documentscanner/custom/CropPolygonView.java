package com.zing.zalo.p077ui.camera.documentscanner.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b00.C2480c;
import com.zing.zalo.AbstractC16801x;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23140m2;
import mm0.AbstractC23350e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import u50.C27040b;

/* loaded from: classes5.dex */
public final class CropPolygonView extends FrameLayout {

    /* renamed from: F */
    private static final InterfaceC24854k f56609F;

    /* renamed from: G */
    private static final InterfaceC24854k f56610G;

    /* renamed from: H */
    private static final InterfaceC24854k f56611H;

    /* renamed from: I */
    private static final InterfaceC24854k f56612I;

    /* renamed from: J */
    private static final InterfaceC24854k f56613J;

    /* renamed from: K */
    private static final InterfaceC24854k f56614K;

    /* renamed from: L */
    private static final InterfaceC24854k f56615L;

    /* renamed from: A */
    private float f56616A;

    /* renamed from: B */
    private InterfaceC11262i f56617B;

    /* renamed from: p */
    private RectF f56618p;

    /* renamed from: q */
    private PointF[] f56619q;

    /* renamed from: r */
    private final PointF f56620r;

    /* renamed from: s */
    private final C27040b f56621s;

    /* renamed from: t */
    private final PointF f56622t;

    /* renamed from: u */
    private int f56623u;

    /* renamed from: v */
    private final PointF f56624v;

    /* renamed from: w */
    private int f56625w;

    /* renamed from: x */
    private final int[] f56626x;

    /* renamed from: y */
    private final PointF f56627y;

    /* renamed from: z */
    private final PointF f56628z;
    public static final C11261h Companion = new C11261h(null);

    /* renamed from: C */
    private static final int f56606C = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: D */
    private static final int f56607D = AbstractC23136l9.m118742r(100.0f);

    /* renamed from: E */
    private static final int f56608E = AbstractC23136l9.m118742r(72.0f);

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$a */
    /* loaded from: classes5.dex */
    static final class C11254a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11254a f56629q = new C11254a();

        C11254a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.black_30));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$b */
    /* loaded from: classes5.dex */
    static final class C11255b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11255b f56630q = new C11255b();

        C11255b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118639A(AbstractC16801x.Dark_NotificationColor1));
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$c */
    /* loaded from: classes5.dex */
    static final class C11256c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11256c f56631q = new C11256c();

        C11256c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(CropPolygonView.Companion.m59114o());
            paint.setStrokeWidth(AbstractC23136l9.m118762x1(1.0f));
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$d */
    /* loaded from: classes5.dex */
    static final class C11257d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11257d f56632q = new C11257d();

        C11257d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(CropPolygonView.Companion.m59114o());
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AbstractC23136l9.m118762x1(4.0f));
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$e */
    /* loaded from: classes5.dex */
    static final class C11258e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11258e f56633q = new C11258e();

        C11258e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Path mo12V4() {
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            return path;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$f */
    /* loaded from: classes5.dex */
    static final class C11259f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11259f f56634q = new C11259f();

        C11259f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118639A(AbstractC16801x.Dark_AppPrimaryColor));
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$g */
    /* loaded from: classes5.dex */
    static final class C11260g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11260g f56635q = new C11260g();

        C11260g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(CropPolygonView.Companion.m59114o());
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$h */
    /* loaded from: classes5.dex */
    public static final class C11261h {
        private C11261h() {
        }

        public /* synthetic */ C11261h(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final Paint m59109h() {
            return (Paint) CropPolygonView.f56615L.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final int m59110i() {
            return ((Number) CropPolygonView.f56610G.getValue()).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final Paint m59111j() {
            return (Paint) CropPolygonView.f56612I.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public final Paint m59112k() {
            return (Paint) CropPolygonView.f56614K.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final Path m59113n() {
            return (Path) CropPolygonView.f56611H.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final int m59114o() {
            return ((Number) CropPolygonView.f56609F.getValue()).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public final Paint m59115p() {
            return (Paint) CropPolygonView.f56613J.getValue();
        }

        /* renamed from: l */
        public final int m59116l() {
            return CropPolygonView.f56606C;
        }

        /* renamed from: m */
        public final int m59117m() {
            return CropPolygonView.f56607D;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.CropPolygonView$i */
    /* loaded from: classes5.dex */
    public interface InterfaceC11262i {
        /* renamed from: a */
        void mo59024a();

        /* renamed from: b */
        void mo59025b();

        /* renamed from: c */
        void mo59026c();

        /* renamed from: d */
        void mo59028d(boolean z11);
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(C11259f.f56634q);
        f56609F = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C11255b.f56630q);
        f56610G = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C11258e.f56633q);
        f56611H = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C11256c.f56631q);
        f56612I = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(C11260g.f56635q);
        f56613J = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(C11257d.f56632q);
        f56614K = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(C11254a.f56629q);
        f56615L = m129210a7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropPolygonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f56618p = new RectF();
        this.f56619q = new PointF[0];
        this.f56620r = new PointF();
        this.f56621s = new C27040b();
        this.f56622t = new PointF(0.0f, 0.0f);
        this.f56623u = -1;
        this.f56624v = new PointF();
        this.f56626x = new int[2];
        this.f56627y = new PointF();
        this.f56628z = new PointF();
        this.f56616A = 1.0f;
        m59087s();
    }

    /* renamed from: A */
    private final void m59066A(float f11, float f12) {
        PointF pointF = this.f56624v;
        float f13 = f11 - pointF.x;
        float f14 = f12 - pointF.y;
        int i11 = this.f56625w;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m59091x(f13, f14);
                }
            } else {
                m59090w(f13, f14);
            }
        } else {
            m59092y(f13, f14);
        }
        this.f56624v.set(f11, f12);
    }

    /* renamed from: B */
    private final void m59067B() {
        if (this.f56625w != 0) {
            this.f56625w = 0;
            m59069E();
            m59068D();
        }
        InterfaceC11262i interfaceC11262i = this.f56617B;
        if (interfaceC11262i != null) {
            AbstractC19074t.m100205c(interfaceC11262i);
            interfaceC11262i.mo59028d(false);
        }
    }

    /* renamed from: D */
    private final void m59068D() {
        if (AbstractC23140m2.m118805b(this.f56619q)) {
            C11261h c11261h = Companion;
            c11261h.m59111j().setColor(c11261h.m59114o());
        } else {
            C11261h c11261h2 = Companion;
            c11261h2.m59111j().setColor(c11261h2.m59110i());
        }
    }

    /* renamed from: E */
    private final void m59069E() {
        if (AbstractC23140m2.m118810g(this.f56619q)) {
            invalidate();
        }
    }

    private static /* synthetic */ void getDragMode$annotations() {
    }

    private final int getVertexCount() {
        return this.f56619q.length;
    }

    /* renamed from: j */
    private final RectF m59079j(Bitmap bitmap, int i11, int i12) {
        float width;
        int i13 = f56606C;
        int i14 = f56607D;
        Size size = new Size(i11 - (i13 * 2), i12 - (i14 * 2));
        PointF pointF = new PointF(getX() + i13, getY() + i14);
        float height = bitmap.getHeight();
        float width2 = bitmap.getWidth();
        if ((size.getHeight() * 1.0f) / size.getWidth() < height / width2) {
            width = size.getHeight() / height;
        } else {
            width = size.getWidth() / width2;
        }
        this.f56616A = width;
        float f11 = this.f56616A;
        SizeF sizeF = new SizeF(width2 * f11, height * f11);
        PointF pointF2 = new PointF(pointF.x + ((size.getWidth() - sizeF.getWidth()) / 2.0f), pointF.y + ((size.getHeight() - sizeF.getHeight()) / 2.0f));
        float f12 = pointF2.x;
        return new RectF(f12, pointF2.y, sizeF.getWidth() + f12, pointF2.y + sizeF.getHeight());
    }

    /* renamed from: k */
    private final float m59080k() {
        int i11;
        if (this.f56622t.x < getWidth() / 2.0f) {
            i11 = (getWidth() - f56608E) - 100;
        } else {
            i11 = f56608E + 100;
        }
        return i11;
    }

    /* renamed from: l */
    private final void m59081l(Canvas canvas) {
        if (m59089v()) {
            return;
        }
        C11261h c11261h = Companion;
        c11261h.m59113n().rewind();
        Path m59113n = c11261h.m59113n();
        RectF rectF = this.f56618p;
        m59113n.moveTo(rectF.left - 50.0f, rectF.bottom + 50.0f);
        Path m59113n2 = c11261h.m59113n();
        RectF rectF2 = this.f56618p;
        m59113n2.lineTo(rectF2.right + 50.0f, rectF2.bottom + 50.0f);
        Path m59113n3 = c11261h.m59113n();
        RectF rectF3 = this.f56618p;
        m59113n3.lineTo(rectF3.right + 50.0f, rectF3.top - 50.0f);
        Path m59113n4 = c11261h.m59113n();
        RectF rectF4 = this.f56618p;
        m59113n4.lineTo(rectF4.left - 50.0f, rectF4.top - 50.0f);
        c11261h.m59113n().close();
        int vertexCount = getVertexCount();
        for (int i11 = 0; i11 < vertexCount; i11++) {
            if (i11 == 0) {
                Path m59113n5 = Companion.m59113n();
                PointF pointF = this.f56619q[i11];
                m59113n5.moveTo(pointF.x, pointF.y);
            } else {
                Path m59113n6 = Companion.m59113n();
                PointF pointF2 = this.f56619q[i11];
                m59113n6.lineTo(pointF2.x, pointF2.y);
            }
        }
        C11261h c11261h2 = Companion;
        c11261h2.m59113n().close();
        canvas.drawPath(c11261h2.m59113n(), c11261h2.m59109h());
    }

    /* renamed from: m */
    private final void m59082m(Canvas canvas) {
        int vertexCount = getVertexCount();
        int i11 = 0;
        while (i11 < vertexCount) {
            PointF[] pointFArr = this.f56619q;
            PointF pointF = pointFArr[i11];
            i11++;
            PointF pointF2 = pointFArr[i11 % vertexCount];
            canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, Companion.m59111j());
        }
    }

    /* renamed from: n */
    private final void m59083n(Canvas canvas) {
        if (this.f56625w != 1) {
            return;
        }
        this.f56621s.m139188d(m59080k(), f56608E + 100);
        this.f56621s.m139189e(this.f56622t);
        this.f56621s.draw(canvas);
    }

    /* renamed from: p */
    private final void m59084p(Canvas canvas) {
        int vertexCount = getVertexCount();
        int i11 = 0;
        while (i11 < vertexCount) {
            PointF[] pointFArr = this.f56619q;
            PointF pointF = pointFArr[i11];
            i11++;
            PointF pointF2 = pointFArr[i11 % vertexCount];
            float f11 = 2;
            this.f56620r.set((pointF.x + pointF2.x) / f11, (pointF.y + pointF2.y) / f11);
            float f12 = pointF.x;
            float f13 = pointF.y;
            C11261h c11261h = Companion;
            canvas.drawCircle(f12, f13, 24.0f, c11261h.m59115p());
            float f14 = pointF.x;
            PointF pointF3 = this.f56620r;
            float f15 = pointF3.x;
            float f16 = (f14 + f15) / f11;
            float f17 = pointF.y;
            float f18 = pointF3.y;
            canvas.drawLine(f16, (f17 + f18) / f11, (pointF2.x + f15) / f11, (pointF2.y + f18) / f11, c11261h.m59112k());
        }
    }

    /* renamed from: q */
    private final int m59085q(float f11, float f12) {
        if (m59089v()) {
            return -1;
        }
        int vertexCount = getVertexCount();
        int i11 = 0;
        while (i11 < vertexCount) {
            PointF pointF = this.f56619q[i11];
            if (Math.abs(pointF.x - f11) < 48.0f && Math.abs(pointF.y - f12) < 48.0f) {
                return i11;
            }
            int i12 = i11 + 1;
            PointF pointF2 = this.f56619q[i12 % vertexCount];
            float f13 = 2;
            PointF pointF3 = new PointF((pointF.x + pointF2.x) / f13, (pointF.y + pointF2.y) / f13);
            PointF pointF4 = new PointF((pointF.x + pointF3.x) / f13, (pointF.y + pointF3.y) / f13);
            PointF pointF5 = new PointF((pointF2.x + pointF3.x) / f13, (pointF2.y + pointF3.y) / f13);
            if (AbstractC23140m2.m118807d(f11, f12, pointF4.x, pointF4.y) + AbstractC23140m2.m118807d(f11, f12, pointF5.x, pointF5.y) < Math.sqrt(Math.pow(AbstractC23140m2.m118807d(pointF5.x, pointF5.y, pointF4.x, pointF4.y), 2.0d) + Math.pow(24.0d, 2.0d)) + 24) {
                return i11 + vertexCount;
            }
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: r */
    private final void m59086r(Bitmap bitmap, RectF rectF, int i11, int i12) {
        this.f56621s.m139187c(bitmap, i11, i12, rectF);
    }

    /* renamed from: s */
    private final void m59087s() {
        setWillNotDraw(false);
    }

    /* renamed from: u */
    private final boolean m59088u(PointF pointF, float f11, float f12) {
        float f13 = pointF.x;
        float f14 = f13 + f11;
        RectF rectF = this.f56618p;
        if (f14 < rectF.right) {
            float f15 = pointF.y;
            if (f15 + f12 < rectF.bottom && f13 + f11 > rectF.left && f15 + f12 > rectF.top) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private final boolean m59089v() {
        if (getVertexCount() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:            if (r7 > r1) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:            if (r11 > r14) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:            if (r2 > r1) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:            if (r10 > r13) goto L46;     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m59090w(float f11, float f12) {
        if (m59089v()) {
            return;
        }
        int vertexCount = getVertexCount();
        int[] iArr = this.f56626x;
        int i11 = this.f56623u % vertexCount;
        iArr[0] = i11;
        int i12 = (i11 + 1) % vertexCount;
        iArr[1] = i12;
        PointF pointF = this.f56627y;
        PointF[] pointFArr = this.f56619q;
        PointF pointF2 = pointFArr[i11];
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        PointF pointF3 = this.f56628z;
        PointF pointF4 = pointFArr[i12];
        float f13 = pointF4.x;
        pointF3.x = f13;
        float f14 = pointF4.y;
        pointF3.y = f14;
        int i13 = (i12 + 1) % vertexCount;
        PointF pointF5 = pointFArr[((i11 - 1) + vertexCount) % vertexCount];
        float f15 = pointF5.x;
        float f16 = pointF5.y;
        PointF pointF6 = pointFArr[i13];
        float f17 = pointF6.x;
        float f18 = pointF6.y;
        float f19 = pointF.y;
        float f21 = f19 - f16;
        float f22 = pointF.x;
        float f23 = f22 - f15;
        float f24 = (f16 * f22) - (f15 * f19);
        float f25 = f14 - f18;
        float f26 = f13 - f17;
        float f27 = (f18 * f13) - (f17 * f14);
        if (Math.abs(f22 - f13) > Math.abs(this.f56627y.y - this.f56628z.y)) {
            float f28 = this.f56628z.y;
            float f29 = f28 + f12;
            RectF rectF = this.f56618p;
            float f31 = rectF.bottom;
            if (f29 < f31 && f28 + f12 > rectF.top) {
                float f32 = f28 + f12;
                float f33 = ((f26 * f32) - f27) / f25;
                float f34 = rectF.left;
                if (f33 >= f34) {
                    f34 = rectF.right;
                }
                f33 = f34;
                PointF pointF7 = this.f56619q[this.f56626x[1]];
                pointF7.x = f33;
                pointF7.y = f32;
            }
            float f35 = this.f56627y.y;
            if (f35 + f12 < f31 && f35 + f12 > rectF.top) {
                float f36 = f35 + f12;
                float f37 = ((f23 * f36) - f24) / f21;
                float f38 = rectF.left;
                if (f37 >= f38) {
                    f38 = rectF.right;
                }
                f37 = f38;
                PointF pointF8 = this.f56619q[this.f56626x[0]];
                pointF8.x = f37;
                pointF8.y = f36;
            }
        } else {
            float f39 = this.f56628z.x;
            float f41 = f39 + f11;
            RectF rectF2 = this.f56618p;
            float f42 = rectF2.right;
            if (f41 < f42 && f39 + f11 > rectF2.left) {
                float f43 = f39 + f11;
                float f44 = ((f25 * f43) + f27) / f26;
                float f45 = rectF2.top;
                if (f44 >= f45) {
                    f45 = rectF2.bottom;
                }
                f44 = f45;
                PointF pointF9 = this.f56619q[this.f56626x[1]];
                pointF9.x = f43;
                pointF9.y = f44;
            }
            float f46 = this.f56627y.x;
            if (f46 + f11 < f42 && f46 + f11 > rectF2.left) {
                float f47 = f46 + f11;
                float f48 = ((f21 * f47) + f24) / f23;
                float f49 = rectF2.top;
                if (f48 >= f49) {
                    f49 = rectF2.bottom;
                }
                f48 = f49;
                PointF pointF10 = this.f56619q[this.f56626x[0]];
                pointF10.x = f47;
                pointF10.y = f48;
            }
        }
        InterfaceC11262i interfaceC11262i = this.f56617B;
        if (interfaceC11262i != null) {
            AbstractC19074t.m100205c(interfaceC11262i);
            interfaceC11262i.mo59024a();
        }
    }

    /* renamed from: x */
    private final void m59091x(float f11, float f12) {
        int vertexCount = getVertexCount();
        boolean z11 = true;
        for (int i11 = 0; i11 < vertexCount; i11++) {
            z11 &= m59088u(this.f56619q[i11], f11, f12);
        }
        if (z11) {
            for (int i12 = 0; i12 < vertexCount; i12++) {
                PointF pointF = this.f56619q[i12];
                pointF.x += f11;
                pointF.y += f12;
            }
            InterfaceC11262i interfaceC11262i = this.f56617B;
            if (interfaceC11262i != null) {
                AbstractC19074t.m100205c(interfaceC11262i);
                interfaceC11262i.mo59026c();
            }
        }
    }

    /* renamed from: y */
    private final void m59092y(float f11, float f12) {
        if (m59089v()) {
            return;
        }
        PointF pointF = this.f56619q[this.f56623u];
        if (m59088u(pointF, f11, f12)) {
            PointF pointF2 = this.f56619q[this.f56623u];
            float f13 = pointF.x + f11;
            pointF2.x = f13;
            float f14 = pointF.y + f12;
            pointF2.y = f14;
            this.f56622t.set(f13, f14);
            InterfaceC11262i interfaceC11262i = this.f56617B;
            if (interfaceC11262i != null) {
                AbstractC19074t.m100205c(interfaceC11262i);
                interfaceC11262i.mo59025b();
            }
        }
    }

    /* renamed from: z */
    private final void m59093z(float f11, float f12) {
        int vertexCount = getVertexCount();
        this.f56623u = m59085q(f11, f12);
        this.f56624v.set(f11, f12);
        int i11 = this.f56623u;
        if (i11 < 0) {
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < vertexCount; i13 += 2) {
                if (!z11) {
                    PointF pointF = this.f56624v;
                    PointF[] pointFArr = this.f56619q;
                    if (!AbstractC23140m2.m118808e(pointF, pointFArr[i13], pointFArr[(i13 + 1) % vertexCount], pointFArr[(i13 + 2) % vertexCount])) {
                        z11 = false;
                    }
                }
                z11 = true;
            }
            if (z11) {
                i12 = 3;
            }
            this.f56625w = i12;
        } else if (i11 < vertexCount) {
            this.f56625w = 1;
            PointF pointF2 = this.f56622t;
            PointF pointF3 = this.f56619q[i11];
            pointF2.set(pointF3.x, pointF3.y);
        } else {
            this.f56625w = 2;
        }
        InterfaceC11262i interfaceC11262i = this.f56617B;
        if (interfaceC11262i != null) {
            AbstractC19074t.m100205c(interfaceC11262i);
            interfaceC11262i.mo59028d(true);
        }
    }

    /* renamed from: C */
    public final void m59094C(C2480c c2480c, Bitmap bitmap) {
        int m118722k0;
        int m118713h0;
        AbstractC19074t.m100208f(c2480c, "bound");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        if (getWidth() != 0) {
            m118722k0 = getWidth();
        } else {
            m118722k0 = AbstractC23136l9.m118722k0();
        }
        if (getHeight() != 0) {
            m118713h0 = getHeight();
        } else {
            m118713h0 = AbstractC23136l9.m118713h0();
        }
        RectF m59079j = m59079j(bitmap, m118722k0, m118713h0);
        this.f56618p = m59079j;
        m59086r(bitmap, m59079j, m118722k0, m118713h0);
        C2480c m12529m = c2480c.m12529m(this.f56616A);
        AbstractC19074t.m100207e(m12529m, "scale(...)");
        setBound(m12529m);
    }

    public final synchronized C2480c getFinalBound() {
        C2480c m12529m;
        try {
            if (m59089v()) {
                m12529m = C2480c.f10102t;
                AbstractC19074t.m100205c(m12529m);
            } else {
                C2480c c2480c = new C2480c(this.f56619q);
                RectF rectF = this.f56618p;
                m12529m = c2480c.m12534r(-rectF.left, -rectF.top).m12529m(1.0f / this.f56616A);
                AbstractC19074t.m100205c(m12529m);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m12529m;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!m59089v()) {
            m59081l(canvas);
            m59082m(canvas);
            m59084p(canvas);
            m59083n(canvas);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:            if (r0 != 3) goto L16;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (m59089v()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m59066A(motionEvent.getX(), motionEvent.getY());
                }
            }
            m59067B();
        } else {
            m59093z(motionEvent.getX(), motionEvent.getY());
        }
        invalidate();
        return true;
    }

    public final synchronized void setBound(C2480c c2480c) {
        AbstractC19074t.m100208f(c2480c, "bound");
        try {
            try {
                RectF rectF = this.f56618p;
                PointF[] m12533q = c2480c.m12534r(rectF.left, rectF.top).m12533q();
                AbstractC19074t.m100207e(m12533q, "toPointFArray(...)");
                this.f56619q = m12533q;
                m59068D();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DocumentScanner_CropPolygonView", e11);
                m59068D();
            }
            invalidate();
        } catch (Throwable th2) {
            m59068D();
            invalidate();
            throw th2;
        }
    }

    public final void setListener(InterfaceC11262i interfaceC11262i) {
        this.f56617B = interfaceC11262i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropPolygonView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f56618p = new RectF();
        this.f56619q = new PointF[0];
        this.f56620r = new PointF();
        this.f56621s = new C27040b();
        this.f56622t = new PointF(0.0f, 0.0f);
        this.f56623u = -1;
        this.f56624v = new PointF();
        this.f56626x = new int[2];
        this.f56627y = new PointF();
        this.f56628z = new PointF();
        this.f56616A = 1.0f;
        m59087s();
    }
}
