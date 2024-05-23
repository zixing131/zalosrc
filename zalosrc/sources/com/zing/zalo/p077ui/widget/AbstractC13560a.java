package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zlottie.widget.C17291a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p516t3.C26469c;
import vg.C28050e3;

/* renamed from: com.zing.zalo.ui.widget.a */
/* loaded from: classes6.dex */
public abstract class AbstractC13560a extends ImageSpan {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final boolean f69887p;

    /* renamed from: com.zing.zalo.ui.widget.a$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: com.zing.zalo.ui.widget.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C32779a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f69888a;

            static {
                int[] iArr = new int[C28050e3.c.values().length];
                try {
                    iArr[C28050e3.c.KEYFRAMES_EMOJI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C28050e3.c.LOTTIE_EMOJI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f69888a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13560a m76015a(Drawable drawable, C28050e3.c cVar, int i11) {
            AbstractC19074t.m100208f(drawable, "drawable");
            AbstractC19074t.m100208f(cVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            float f11 = i11;
            drawable.setBounds(0, 0, AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
            int i12 = C32779a.f69888a[cVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2 && (drawable instanceof C17291a)) {
                    return new C13809w0((C17291a) drawable, 1);
                }
                return null;
            }
            if (drawable instanceof C26469c) {
                return new C13800u0((C26469c) drawable, 1);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13560a(Drawable drawable, int i11) {
        super(drawable, i11);
        AbstractC19074t.m100208f(drawable, "drawable");
    }

    /* renamed from: a */
    private final void m76010a(Canvas canvas, float f11, float f12) {
        if (!this.f69887p || getDrawable() == null) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(getDrawable().getBounds().left + f11, getDrawable().getBounds().top + f12, getDrawable().getBounds().right + f11, getDrawable().getBounds().bottom + f12, paint);
    }

    /* renamed from: b */
    public void mo76011b(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        getDrawable().draw(canvas);
    }

    /* renamed from: c */
    public final void m76012c(Drawable.Callback callback) {
        if (getDrawable() == null) {
            return;
        }
        getDrawable().setCallback(callback);
    }

    /* renamed from: d */
    public abstract void mo76013d();

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt;
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(paint, "paint");
        if (getDrawable() != null && (fontMetricsInt = paint.getFontMetricsInt()) != null) {
            canvas.save();
            int i16 = fontMetricsInt.descent;
            float f12 = 2;
            float f13 = ((i14 + i16) - (((i16 - fontMetricsInt.ascent) * 1.0f) / f12)) - (((getDrawable().getBounds().bottom - getDrawable().getBounds().top) * 1.0f) / f12);
            canvas.translate(f11, f13);
            mo76011b(canvas);
            canvas.restore();
            m76010a(canvas, f11, f13);
        }
    }

    /* renamed from: e */
    public abstract void mo76014e();

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC19074t.m100208f(paint, "paint");
        int i13 = 0;
        if (getDrawable() == null) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
        AbstractC19074t.m100207e(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            int i14 = bounds.bottom - bounds.top;
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            if (fontMetricsInt2 != null) {
                AbstractC19074t.m100205c(fontMetricsInt2);
                int i15 = fontMetricsInt2.descent;
                int i16 = fontMetricsInt2.ascent;
                i13 = ((i15 - i16) / 2) + i16;
            }
            int i17 = i14 / 2;
            int i18 = i13 - i17;
            fontMetricsInt.ascent = i18;
            fontMetricsInt.top = i18;
            int i19 = i13 + i17;
            fontMetricsInt.bottom = i19;
            fontMetricsInt.descent = i19;
        }
        return bounds.right;
    }
}
