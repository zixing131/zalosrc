package com.zing.zalo.stickers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import bd0.C2770a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.feed.uicontrols.InterfaceC8899z;
import com.zing.zalo.p077ui.widget.C13700o2;
import p471r3.C25630b;
import vg.C28181s2;

/* loaded from: classes5.dex */
public class FeedStickerView extends RecyclingImageView implements C2770a.a, InterfaceC8899z {

    /* renamed from: p */
    C13700o2 f55048p;

    /* renamed from: q */
    private int f55049q;

    /* renamed from: r */
    private int f55050r;

    /* renamed from: s */
    private final boolean f55051s;

    public FeedStickerView(Context context) {
        super(context);
        this.f55051s = false;
        m56560j();
    }

    /* renamed from: j */
    private void m56560j() {
        this.f55048p = new C13700o2(new C2770a(this, C13700o2.d.f70834p, -1, null, true, true, false, C13700o2.Companion.m76549c(), false));
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return false;
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return false;
    }

    @Override // com.zing.zalo.feed.uicontrols.InterfaceC8899z
    /* renamed from: e */
    public void mo47512e(C25630b c25630b, String str, boolean z11, boolean z12, boolean z13) {
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null) {
            c13700o2.m76529O(c25630b, str, z11, z12, false, z13);
        }
    }

    /* renamed from: i */
    public void m56561i() {
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null) {
            c13700o2.m76530R(true);
        }
        C28181s2.f131306a.m141724e();
    }

    /* renamed from: k */
    public boolean m56562k() {
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null && c13700o2.m76526J()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m56563l() {
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null) {
            c13700o2.m76530R(true);
        }
    }

    /* renamed from: m */
    public void m56564m(int i11, int i12) {
        this.f55050r = i11;
        this.f55049q = i12;
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null) {
            c13700o2.m76539b0(C13700o2.d.f70835q, i12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.ZAppCompatImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56561i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            canvas.translate((this.f55050r - this.f55048p.m76524H()) / 2.0f, 0.0f);
            this.f55048p.m76545v(canvas);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        try {
            setMeasuredDimension(this.f55050r, this.f55049q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.uicontrols.InterfaceC8899z
    public void setThumbBitmap(Bitmap bitmap) {
        C13700o2 c13700o2 = this.f55048p;
        if (c13700o2 != null) {
            c13700o2.m76541e0(bitmap);
        }
    }

    public FeedStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55051s = false;
        m56560j();
    }
}
