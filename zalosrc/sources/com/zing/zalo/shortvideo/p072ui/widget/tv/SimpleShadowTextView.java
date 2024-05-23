package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import s20.AbstractC26100b;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public class SimpleShadowTextView extends RobotoTextView {

    /* renamed from: A */
    private final Paint f54731A;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.SimpleShadowTextView$a */
    /* loaded from: classes5.dex */
    public static final class C10847a extends AbstractC19075u implements InterfaceC18505l {
        C10847a() {
            super(1);
        }

        /* renamed from: a */
        public final void m56264a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            float dimension = typedArray.getDimension(AbstractC27414i.ZchSimpleShadowTextView_zchShadowDxDip, SimpleShadowTextView.this.getShadowDx());
            float dimension2 = typedArray.getDimension(AbstractC27414i.ZchSimpleShadowTextView_zchShadowDyDip, SimpleShadowTextView.this.getShadowDy());
            if (dimension != SimpleShadowTextView.this.getShadowDx() || dimension2 != SimpleShadowTextView.this.getShadowDy()) {
                SimpleShadowTextView simpleShadowTextView = SimpleShadowTextView.this;
                simpleShadowTextView.setShadowLayer(simpleShadowTextView.getShadowRadius(), dimension, dimension2, SimpleShadowTextView.this.getShadowColor());
            }
            SimpleShadowTextView.this.setFontStyle(typedArray.getInt(AbstractC27414i.ZchSimpleShadowTextView_zchFontStyle, 5));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56264a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(getShadowColor(), PorterDuff.Mode.SRC_IN));
        this.f54731A = paint;
        int[] iArr = AbstractC27414i.ZchSimpleShadowTextView;
        AbstractC19074t.m100207e(iArr, "ZchSimpleShadowTextView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10847a());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (getShadowColor() != 0 && getShadowRadius() == 0.0f) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.f54731A);
            canvas.translate(getShadowDx(), getShadowDy());
            super.draw(canvas);
            canvas.restore();
        }
        super.draw(canvas);
    }
}
