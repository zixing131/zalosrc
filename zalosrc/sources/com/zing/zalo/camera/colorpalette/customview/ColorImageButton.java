package com.zing.zalo.camera.colorpalette.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes3.dex */
public final class ColorImageButton extends ColorButton {

    /* renamed from: w */
    private int f41057w;

    /* renamed from: x */
    private Drawable f41058x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorImageButton(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    public final Drawable getIcon() {
        return this.f41058x;
    }

    public final int getResId() {
        return this.f41057w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        AbstractC19074t.m100208f(canvas, "canvas");
        Drawable drawable = this.f41058x;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Paint paintStroke = getPaintStroke();
        if (m39182a()) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        paintStroke.setColor(i11);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getRadius() - getStrokePadding(), getPaintStroke());
    }

    public final void setIcon(Drawable drawable) {
        this.f41058x = drawable;
    }

    public final void setIconId(int i11) {
        if (i11 != this.f41057w) {
            this.f41057w = i11;
            Drawable m118665N = AbstractC23136l9.m118665N(getContext(), i11);
            if (m118665N != null) {
                m118665N.setBounds(0, 0, getViewSize(), getViewSize());
            } else {
                m118665N = null;
            }
            this.f41058x = m118665N;
        }
    }

    public final void setResId(int i11) {
        this.f41057w = i11;
    }
}
