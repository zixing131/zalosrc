package com.zing.zalo.p077ui.widget;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.zing.zalo.ui.widget.z1 */
/* loaded from: classes6.dex */
public class C13822z1 extends ViewOutlineProvider {

    /* renamed from: a */
    private final float f71486a;

    /* renamed from: b */
    private float f71487b;

    /* renamed from: c */
    private float f71488c;

    /* renamed from: d */
    private int f71489d;

    /* renamed from: e */
    private final Rect f71490e = new Rect();

    public C13822z1(float f11, float f12, float f13, int i11) {
        this.f71486a = f11;
        this.f71487b = f12;
        this.f71488c = f13;
        this.f71489d = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Drawable background;
        if (view != null && (background = view.getBackground()) != null) {
            background.copyBounds(this.f71490e);
        }
        AbstractC13563a2.m76017b(this.f71490e, this.f71487b, this.f71488c);
        this.f71490e.offset(0, this.f71489d);
        if (outline != null) {
            outline.setRoundRect(this.f71490e, this.f71486a);
        }
    }
}
