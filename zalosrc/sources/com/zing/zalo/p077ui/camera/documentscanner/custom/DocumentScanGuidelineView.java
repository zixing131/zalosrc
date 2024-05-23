package com.zing.zalo.p077ui.camera.documentscanner.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.imgdecor.model.model.PaintData;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23140m2;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class DocumentScanGuidelineView extends FrameLayout {

    /* renamed from: A */
    private static final InterfaceC24854k f56636A;

    /* renamed from: B */
    private static final InterfaceC24854k f56637B;

    /* renamed from: C */
    private static final InterfaceC24854k f56638C;
    public static final C11267e Companion = new C11267e(null);

    /* renamed from: s */
    private static final int f56639s = AbstractC23136l9.m118742r(75.0f);

    /* renamed from: t */
    private static final int f56640t = AbstractC23136l9.m118742r(15.0f);

    /* renamed from: u */
    private static final int f56641u = AbstractC23136l9.m118742r(130.0f);

    /* renamed from: v */
    private static final int f56642v = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: w */
    private static final int f56643w = AbstractC23136l9.m118742r(125.0f);

    /* renamed from: x */
    private static final int f56644x = AbstractC23136l9.m118742r(30.0f);

    /* renamed from: y */
    private static final int f56645y = AbstractC23136l9.m118742r(100.0f);

    /* renamed from: z */
    private static final InterfaceC24854k f56646z;

    /* renamed from: p */
    private int f56647p;

    /* renamed from: q */
    private PointF[] f56648q;

    /* renamed from: r */
    private final PointF f56649r;

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.DocumentScanGuidelineView$a */
    /* loaded from: classes5.dex */
    static final class C11263a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11263a f56650q = new C11263a();

        C11263a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.black_50));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.DocumentScanGuidelineView$b */
    /* loaded from: classes5.dex */
    static final class C11264b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11264b f56651q = new C11264b();

        C11264b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.Dark_AppPrimaryColor));
            paint.setStrokeWidth(AbstractC23136l9.m118762x1(1.0f));
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.DocumentScanGuidelineView$c */
    /* loaded from: classes5.dex */
    static final class C11265c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11265c f56652q = new C11265c();

        C11265c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.Dark_AppPrimaryColor));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AbstractC23136l9.m118762x1(4.0f));
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.DocumentScanGuidelineView$d */
    /* loaded from: classes5.dex */
    static final class C11266d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11266d f56653q = new C11266d();

        C11266d() {
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

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.custom.DocumentScanGuidelineView$e */
    /* loaded from: classes5.dex */
    public static final class C11267e {
        private C11267e() {
        }

        public /* synthetic */ C11267e(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final Paint m59134e() {
            return (Paint) DocumentScanGuidelineView.f56646z.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final Paint m59135f() {
            return (Paint) DocumentScanGuidelineView.f56637B.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public final Paint m59136g() {
            return (Paint) DocumentScanGuidelineView.f56638C.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final Path m59137h() {
            return (Path) DocumentScanGuidelineView.f56636A.getValue();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(C11263a.f56650q);
        f56646z = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C11266d.f56653q);
        f56636A = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C11264b.f56651q);
        f56637B = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C11265c.f56652q);
        f56638C = m129210a4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanGuidelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f56648q = new PointF[0];
        this.f56649r = new PointF();
        m59125h();
    }

    /* renamed from: e */
    private final void m59122e(Canvas canvas) {
        int length = this.f56648q.length;
        int i11 = 0;
        while (i11 < length) {
            PointF[] pointFArr = this.f56648q;
            PointF pointF = pointFArr[i11];
            i11++;
            PointF pointF2 = pointFArr[i11 % length];
            canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, Companion.m59135f());
        }
    }

    /* renamed from: f */
    private final void m59123f(Canvas canvas) {
        C11267e c11267e = Companion;
        c11267e.m59137h().rewind();
        c11267e.m59137h().lineTo(0.0f, AbstractC23136l9.m118763y(getContext()) + this.f56647p);
        c11267e.m59137h().lineTo(AbstractC23136l9.m118766z(getContext()), AbstractC23136l9.m118763y(getContext()) + this.f56647p);
        c11267e.m59137h().lineTo(AbstractC23136l9.m118766z(getContext()), 0.0f);
        c11267e.m59137h().moveTo(0.0f, 0.0f);
        c11267e.m59137h().close();
        int length = this.f56648q.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 == 0) {
                Path m59137h = Companion.m59137h();
                PointF pointF = this.f56648q[i11];
                m59137h.moveTo(pointF.x, pointF.y);
            } else {
                Path m59137h2 = Companion.m59137h();
                PointF pointF2 = this.f56648q[i11];
                m59137h2.lineTo(pointF2.x, pointF2.y);
            }
        }
        C11267e c11267e2 = Companion;
        c11267e2.m59137h().close();
        canvas.drawPath(c11267e2.m59137h(), c11267e2.m59134e());
    }

    /* renamed from: g */
    private final void m59124g(Canvas canvas) {
        DocumentScanGuidelineView documentScanGuidelineView = this;
        int length = documentScanGuidelineView.f56648q.length;
        int i11 = 0;
        while (i11 < length) {
            PointF[] pointFArr = documentScanGuidelineView.f56648q;
            PointF pointF = pointFArr[i11];
            i11++;
            PointF pointF2 = pointFArr[i11 % length];
            float f11 = 2;
            documentScanGuidelineView.f56649r.set((pointF.x + pointF2.x) / f11, (pointF.y + pointF2.y) / f11);
            double m118806c = f56645y / AbstractC23140m2.m118806c(new PaintData.Position(pointF.x, pointF.y, 1.0f), new PaintData.Position(pointF2.x, pointF2.y, 1.0f));
            float f12 = pointF.x;
            float f13 = pointF.y;
            double d11 = 1 - m118806c;
            int i12 = length;
            C11267e c11267e = Companion;
            canvas.drawLine(f12, f13, (float) ((f12 * d11) + (pointF2.x * m118806c)), (float) ((f13 * d11) + (pointF2.y * m118806c)), c11267e.m59136g());
            float f14 = pointF2.x;
            float f15 = pointF2.y;
            canvas.drawLine(f14, f15, (float) ((f14 * d11) + (pointF.x * m118806c)), (float) ((d11 * f15) + (m118806c * pointF.y)), c11267e.m59136g());
            documentScanGuidelineView = this;
            length = i12;
        }
    }

    /* renamed from: h */
    private final void m59125h() {
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void invalidate() {
        WindowInsets rootWindowInsets;
        int i11;
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        if (Build.VERSION.SDK_INT >= 28) {
            rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    displayCutout2 = rootWindowInsets.getDisplayCutout();
                    AbstractC19074t.m100205c(displayCutout2);
                    i11 = displayCutout2.getSafeInsetTop();
                    this.f56647p = i11;
                }
            }
            i11 = 0;
            this.f56647p = i11;
        }
        if ((AbstractC23136l9.m118766z(getContext()) * 1.0f) / AbstractC23136l9.m118763y(getContext()) < 1.0f) {
            int i12 = f56640t;
            int i13 = f56639s;
            float m118766z = AbstractC23136l9.m118766z(getContext()) - i12;
            int m118763y = AbstractC23136l9.m118763y(getContext());
            int i14 = f56641u;
            this.f56648q = new PointF[]{new PointF(i12, this.f56647p + i13), new PointF(AbstractC23136l9.m118766z(getContext()) - i12, i13 + this.f56647p), new PointF(m118766z, (m118763y - i14) + this.f56647p), new PointF(i12, (AbstractC23136l9.m118763y(getContext()) - i14) + this.f56647p)};
        } else {
            int i15 = f56643w;
            int i16 = f56642v;
            float m118766z2 = AbstractC23136l9.m118766z(getContext()) - i15;
            int m118763y2 = AbstractC23136l9.m118763y(getContext());
            int i17 = f56644x;
            this.f56648q = new PointF[]{new PointF(i15, this.f56647p + i16), new PointF(AbstractC23136l9.m118766z(getContext()) - i15, i16 + this.f56647p), new PointF(m118766z2, (m118763y2 - i17) + this.f56647p), new PointF(i15, (AbstractC23136l9.m118763y(getContext()) - i17) + this.f56647p)};
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        m59123f(canvas);
        m59122e(canvas);
        m59124g(canvas);
    }
}
