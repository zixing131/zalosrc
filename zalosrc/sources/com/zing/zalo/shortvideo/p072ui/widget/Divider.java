package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import s20.AbstractC26100b;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class Divider extends View {

    /* renamed from: p */
    private final Paint f54060p;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.Divider$a */
    /* loaded from: classes5.dex */
    static final class C10678a extends AbstractC19075u implements InterfaceC18505l {
        C10678a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55730a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            Divider.this.f54060p.setColor(typedArray.getColor(AbstractC27414i.ZchDivider_zchColorDivider, 0));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55730a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (getVisibility() == 0) {
            canvas.drawRect(getPaddingStart(), 0.0f, getWidth() - getPaddingEnd(), getHeight(), this.f54060p);
        }
    }

    public /* synthetic */ Divider(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Divider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f54060p = paint;
        int[] iArr = AbstractC27414i.ZchDivider;
        AbstractC19074t.m100207e(iArr, "ZchDivider");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10678a());
    }
}
