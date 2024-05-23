package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c20.C3226p;
import fn0.AbstractC19074t;
import q10.C25063w0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class ShimmerVideoItem extends FrameLayout {

    /* renamed from: A */
    private final int f50917A;

    /* renamed from: B */
    private final int f50918B;

    /* renamed from: C */
    private final int f50919C;

    /* renamed from: D */
    private final int f50920D;

    /* renamed from: E */
    private final int f50921E;

    /* renamed from: F */
    private final int f50922F;

    /* renamed from: G */
    private final int f50923G;

    /* renamed from: H */
    private final Paint f50924H;

    /* renamed from: I */
    private final Paint f50925I;

    /* renamed from: J */
    private Canvas f50926J;

    /* renamed from: K */
    private Bitmap f50927K;

    /* renamed from: L */
    private Bitmap f50928L;

    /* renamed from: M */
    private final float f50929M;

    /* renamed from: N */
    private float f50930N;

    /* renamed from: O */
    private float f50931O;

    /* renamed from: P */
    private C25063w0 f50932P;

    /* renamed from: p */
    private final int f50933p;

    /* renamed from: q */
    private final int f50934q;

    /* renamed from: r */
    private final int f50935r;

    /* renamed from: s */
    private final int f50936s;

    /* renamed from: t */
    private final int f50937t;

    /* renamed from: u */
    private final int f50938u;

    /* renamed from: v */
    private final int f50939v;

    /* renamed from: w */
    private final int f50940w;

    /* renamed from: x */
    private final int f50941x;

    /* renamed from: y */
    private final int f50942y;

    /* renamed from: z */
    private final int f50943z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        setWillNotDraw(false);
        this.f50933p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_padding);
        this.f50934q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        int m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_padding_top);
        this.f50935r = m134433y;
        int m134433y2 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_padding_bottom);
        this.f50936s = m134433y2;
        this.f50937t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_width) - (m134433y * 2);
        this.f50938u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_margin_right) + m134433y;
        this.f50939v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_right_btn_spacing) + (m134433y * 2);
        this.f50940w = m134433y2 - (m134433y * 2);
        this.f50941x = m134433y * 2;
        this.f50942y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_size);
        this.f50943z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f50917A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_name);
        this.f50918B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_avatar_to_description);
        this.f50919C = AbstractC26105g.m134347n(16);
        this.f50920D = AbstractC26105g.m134347n(8);
        this.f50921E = AbstractC26105g.m134347n(112);
        int m134426u = AbstractC26112n.m134426u(this, AbstractC27406a.zch_shimmer_skeleton);
        this.f50922F = m134426u;
        this.f50923G = AbstractC26112n.m134426u(this, AbstractC27406a.zch_shimmer_ripple);
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(m134426u);
        this.f50924H = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f50925I = paint2;
        this.f50929M = 0.5f;
        this.f50930N = -1.0f;
        this.f50931O = 0.02f;
    }

    /* renamed from: a */
    private final void m52352a(Canvas canvas, int i11, int i12, int i13, int i14, int i15) {
        float f11 = i15;
        canvas.drawRoundRect(i12, i11 - i14, i12 + i13, i11, f11, f11, this.f50924H);
    }

    /* renamed from: b */
    private final void m52353b(Canvas canvas, int i11, int i12, int i13, int i14, int i15) {
        float f11 = i15;
        canvas.drawRoundRect(i12 - i13, i11 - i14, i12, i11, f11, f11, this.f50924H);
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        AbstractC19074t.m100208f(canvas, "canvas");
        Canvas canvas2 = this.f50926J;
        if (canvas2 == null || (bitmap = this.f50927K) == null || (bitmap2 = this.f50928L) == null) {
            return;
        }
        canvas2.drawColor(this.f50922F, PorterDuff.Mode.SRC_IN);
        canvas2.drawBitmap(bitmap2, this.f50930N * bitmap2.getWidth(), 0.0f, this.f50925I);
        canvas.save();
        float f11 = this.f50929M;
        canvas.scale(1.0f / f11, 1.0f / f11);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        float f12 = this.f50930N + this.f50931O;
        this.f50930N = f12;
        if (f12 > 1.5f) {
            this.f50930N = -1.0f;
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25063w0 m129962a = C25063w0.m129962a(this);
        AbstractC19074t.m100207e(m129962a, "bind(...)");
        View view = m129962a.f120398q;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 637534208, 1291845632, 1711276032});
        view.setBackground(gradientDrawable);
        this.f50932P = m129962a;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        float f11 = i11;
        float f12 = this.f50929M;
        float f13 = i12;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f11 * f12), (int) (f12 * f13), config);
        Canvas canvas = new Canvas(createBitmap);
        this.f50926J = canvas;
        this.f50927K = createBitmap;
        canvas.save();
        float f14 = this.f50929M;
        canvas.scale(f14, f14);
        int i15 = i11 - this.f50938u;
        int i16 = i12 - this.f50933p;
        C3226p.a aVar = C3226p.Companion;
        if (aVar.m16362e()) {
            i16 -= this.f50934q;
        }
        int i17 = i16;
        int i18 = this.f50937t;
        m52353b(canvas, i17, i15, i18, i18, i18 / 2);
        int i19 = this.f50937t;
        int i21 = i17 - (this.f50939v + i19);
        int i22 = this.f50940w;
        m52353b(canvas, i21, i15, i19, i22, i22 / 2);
        int i23 = i21 - (this.f50940w + this.f50941x);
        int i24 = this.f50937t;
        m52353b(canvas, i23, i15, i24, i24, i24 / 2);
        int i25 = this.f50937t;
        int i26 = i23 - (this.f50939v + i25);
        m52353b(canvas, i26, i15, i25, i25, i25 / 2);
        int i27 = this.f50937t;
        int i28 = i26 - (this.f50939v + i27);
        int i29 = this.f50940w;
        m52353b(canvas, i28, i15, i27, i29, i29 / 2);
        int i31 = i28 - (this.f50940w + this.f50941x);
        int i32 = this.f50937t;
        m52353b(canvas, i31, i15, i32, i32, i32 / 2);
        int i33 = this.f50937t;
        int i34 = i31 - (this.f50939v + i33);
        int i35 = this.f50940w;
        m52353b(canvas, i34, i15, i33, i35, i35 / 2);
        int i36 = i34 - (this.f50940w + this.f50941x);
        int i37 = this.f50937t;
        m52353b(canvas, i36, i15, i37, i37, i37 / 2);
        int i38 = this.f50937t;
        int i39 = i36 - (this.f50939v + i38);
        int i41 = this.f50940w;
        m52353b(canvas, i39, i15, i38, i41, i41 / 2);
        int i42 = i39 - (this.f50940w + this.f50941x);
        int i43 = this.f50937t;
        m52353b(canvas, i42, i15, i43, i43, i43 / 2);
        int i44 = this.f50933p;
        int i45 = i12 - i44;
        if (aVar.m16362e()) {
            i45 -= this.f50934q;
        }
        int i46 = i45;
        int i47 = (i11 - this.f50933p) - this.f50921E;
        int i48 = this.f50919C;
        m52352a(canvas, i46, i44, i47, i48, i48 / 2);
        int i49 = this.f50919C;
        int i51 = i46 - (this.f50920D + i49);
        m52352a(canvas, i51, i44, i47, i49, i49 / 2);
        int i52 = i51 - (this.f50919C + this.f50918B);
        int i53 = this.f50942y;
        m52352a(canvas, i52, i44, i53, i53, this.f50943z);
        int i54 = this.f50942y;
        int i55 = i44 + this.f50917A + i54;
        int i56 = this.f50919C;
        m52352a(canvas, i52 - ((i54 - i56) / 2), i55, i47 / 2, i56, i56 / 2);
        canvas.restore();
        float f15 = this.f50929M;
        Bitmap createBitmap2 = Bitmap.createBitmap((int) (f11 * f15), (int) (f13 * f15), config);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        int i57 = this.f50922F;
        gradientDrawable.setColors(new int[]{i57, this.f50923G, i57});
        gradientDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
        gradientDrawable.draw(new Canvas(createBitmap2));
        this.f50928L = createBitmap2;
    }
}
