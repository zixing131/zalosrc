package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import bd0.C2770a;
import com.zing.zalo.feed.uicontrols.InterfaceC8899z;
import com.zing.zalo.p077ui.widget.C13700o2;
import l80.C22122a0;
import p471r3.C25630b;
import vg.C28181s2;

/* renamed from: com.zing.zalo.ui.widget.i0 */
/* loaded from: classes6.dex */
public class C13647i0 extends C22122a0 implements C2770a.a, InterfaceC8899z {

    /* renamed from: f1 */
    private final C13700o2 f70404f1;

    /* renamed from: g1 */
    private int f70405g1;

    /* renamed from: h1 */
    private int f70406h1;

    /* renamed from: i1 */
    public boolean f70407i1;

    public C13647i0(Context context) {
        super(context);
        this.f70407i1 = true;
        this.f70404f1 = new C13700o2(new C2770a(this, C13700o2.d.f70834p, -1, null, true, this.f70407i1, false, C13700o2.Companion.m76549c(), false));
    }

    /* renamed from: X1 */
    public void m76264X1() {
        C13700o2 c13700o2 = this.f70404f1;
        if (c13700o2 != null) {
            c13700o2.m76530R(true);
        }
        C28181s2.f131306a.m141724e();
    }

    /* renamed from: Y1 */
    public void m76265Y1() {
        C13700o2 c13700o2 = this.f70404f1;
        if (c13700o2 != null) {
            c13700o2.m76530R(true);
        }
    }

    /* renamed from: Z1 */
    public void m76266Z1(int i11, int i12) {
        if (this.f70406h1 != i11 || this.f70405g1 != i12) {
            this.f70406h1 = i11;
            this.f70405g1 = i12;
            C13700o2 c13700o2 = this.f70404f1;
            if (c13700o2 != null) {
                c13700o2.m76539b0(C13700o2.d.f70835q, i12, null);
            }
            requestLayout();
        }
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return false;
    }

    /* renamed from: a2 */
    public void m76267a2(Bitmap bitmap) {
        C13700o2 c13700o2 = this.f70404f1;
        if (c13700o2 != null) {
            c13700o2.m76541e0(bitmap);
            requestLayout();
        }
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return false;
    }

    @Override // com.zing.zalo.feed.uicontrols.InterfaceC8899z
    /* renamed from: e */
    public void mo47512e(C25630b c25630b, String str, boolean z11, boolean z12, boolean z13) {
        C13700o2 c13700o2 = this.f70404f1;
        if (c13700o2 != null) {
            c13700o2.m76529O(c25630b, str, z11, z12, false, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        try {
            canvas.translate((this.f70406h1 - this.f70404f1.m76524H()) / 2, 0.0f);
            this.f70404f1.m76545v(canvas);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        m89097G0(this.f70406h1, this.f70405g1);
    }

    @Override // com.zing.zalo.feed.uicontrols.InterfaceC8899z
    public void setThumbBitmap(Bitmap bitmap) {
        m76267a2(bitmap);
    }
}
