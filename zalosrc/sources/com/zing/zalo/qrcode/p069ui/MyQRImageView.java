package com.zing.zalo.qrcode.p069ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public final class MyQRImageView extends RoundedImageView {

    /* renamed from: F */
    private final float f48791F;

    /* renamed from: G */
    private final int f48792G;

    /* renamed from: H */
    private final int f48793H;

    /* renamed from: I */
    private final int f48794I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyQRImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f11;
        DisplayMetrics displayMetrics;
        AbstractC19074t.m100208f(context, "context");
        Resources resources = getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f11 = displayMetrics.density;
        } else {
            f11 = 1.0f;
        }
        this.f48791F = f11;
        this.f48792G = AbstractC23136l9.m118712h(context, 96.0f);
        this.f48793H = AbstractC23136l9.m118712h(context, 300.0f);
        this.f48794I = AbstractC23136l9.m118712h(context, 290.0f);
    }

    public final Rect getRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.imageview.RoundedImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        int max = Math.max(this.f48792G, Math.min(Math.min(size2 - this.f48794I, Math.min(getMeasuredWidth(), getMeasuredHeight())), this.f48793H));
        setMeasuredDimension(max, max);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.imageview.RoundedImageView, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != 0 && i12 != 0) {
            float f11 = ((i11 * 12) / 238.0f) / this.f48791F;
            m76289j(f11, f11, f11, f11);
        }
    }
}
