package com.zing.zalo.uicontrol.svg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.uicontrol.svg.C16654c;

/* loaded from: classes4.dex */
public class EmojiImageView extends View {

    /* renamed from: p */
    private float f83944p;

    /* renamed from: q */
    private float f83945q;

    /* renamed from: r */
    private float f83946r;

    /* renamed from: s */
    private Object f83947s;

    /* renamed from: t */
    private RectF f83948t;

    /* renamed from: u */
    private int f83949u;

    /* renamed from: v */
    private int f83950v;

    public EmojiImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83944p = 1.0f;
        this.f83949u = -1;
        this.f83950v = -1;
    }

    /* renamed from: a */
    public void m88436a(int i11, int i12) {
        this.f83949u = i11;
        this.f83950v = i12;
    }

    /* renamed from: b */
    public float m88437b(C16654c c16654c) {
        C16654c.b bVar = c16654c.m88486g().f84197p;
        this.f83947s = c16654c;
        this.f83945q = bVar.f84024r;
        this.f83946r = bVar.f84025s;
        this.f83948t = new RectF(0.0f, 0.0f, bVar.f84024r, bVar.f84025s);
        return bVar.f84024r;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width;
        float height;
        int i11;
        try {
            if (this.f83947s != null) {
                RectF rectF = this.f83948t;
                float f11 = this.f83945q;
                float f12 = this.f83944p;
                float f13 = f11 * f12;
                rectF.right = f13;
                float f14 = this.f83946r * f12;
                rectF.bottom = f14;
                int i12 = this.f83949u;
                if (i12 != -1 && (i11 = this.f83950v) != -1) {
                    width = i12 - (f13 / 2.0f);
                    height = i11 - (f14 / 2.0f);
                } else {
                    width = (getWidth() - this.f83948t.right) / 2.0f;
                    height = (getHeight() - this.f83948t.bottom) / 2.0f;
                }
                if (width < 0.0f) {
                    width = 0.0f;
                }
                if (this.f83948t.right + width > getWidth()) {
                    width = getWidth() - this.f83948t.right;
                }
                if (this.f83948t.bottom + height > getHeight()) {
                    height = getHeight() - this.f83948t.bottom;
                }
                canvas.translate(width, height);
                Object obj = this.f83947s;
                if (obj instanceof C16654c) {
                    ((C16654c) obj).m88489j(canvas, this.f83948t);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setScale(float f11) {
        this.f83944p = f11;
    }

    public EmojiImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83944p = 1.0f;
        this.f83949u = -1;
        this.f83950v = -1;
    }
}
