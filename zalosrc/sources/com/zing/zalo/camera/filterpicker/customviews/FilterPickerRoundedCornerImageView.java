package com.zing.zalo.camera.filterpicker.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23222t7;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes3.dex */
public final class FilterPickerRoundedCornerImageView extends View {

    /* renamed from: p */
    private int f41240p;

    /* renamed from: q */
    private int f41241q;

    /* renamed from: r */
    private int f41242r;

    /* renamed from: s */
    private boolean f41243s;

    /* renamed from: t */
    private final InterfaceC24854k f41244t;

    /* renamed from: u */
    private final InterfaceC24854k f41245u;

    /* renamed from: v */
    private final InterfaceC24854k f41246v;

    /* renamed from: com.zing.zalo.camera.filterpicker.customviews.FilterPickerRoundedCornerImageView$a */
    /* loaded from: classes3.dex */
    public static final class C7622a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ InterfaceC3968a f41247l1;

        /* renamed from: m1 */
        final /* synthetic */ FilterPickerRoundedCornerImageView f41248m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f41249n1;

        C7622a(InterfaceC3968a interfaceC3968a, FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView, boolean z11) {
            this.f41247l1 = interfaceC3968a;
            this.f41248m1 = filterPickerRoundedCornerImageView;
            this.f41249n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageView");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (this.f41247l1.getTag() != null && AbstractC19074t.m100204b(this.f41247l1.getTag(), str)) {
                    this.f41247l1.setImageInfo(c3979l, false);
                    if (c3979l != null) {
                        bitmap = c3979l.m18839c();
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        if (bitmap.getWidth() != 1 || bitmap.getHeight() != 1) {
                            this.f41248m1.getRoundView().m76480u(bitmap, true ^ this.f41249n1);
                            this.f41248m1.invalidate();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public FilterPickerRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        int i11 = AbstractC23222t7.f112565i0;
        this.f41240p = i11;
        this.f41241q = i11;
        this.f41242r = AbstractC23222t7.f112562h;
        m129210a = AbstractC24856m.m129210a(new C7623a(this));
        this.f41244t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C7624b(this));
        this.f41245u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C7625c(this));
        this.f41246v = m129210a3;
        m39317b();
    }

    private final C23528a getAQuery() {
        return (C23528a) this.f41244t.getValue();
    }

    private final C3977j getDumpImageView() {
        return (C3977j) this.f41245u.getValue();
    }

    /* renamed from: a */
    public final void m39316a(String str, C24003n c24003n, boolean z11) {
        try {
            this.f41243s = z11;
            if (str != null && str.length() != 0) {
                m39318c(str, c24003n, getDumpImageView());
            }
            getRoundView().m76477r();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m39317b() {
        try {
            int i11 = AbstractC23222t7.f112565i0;
            this.f41240p = i11;
            this.f41241q = i11;
            this.f41242r = AbstractC23222t7.f112562h;
            m39319d();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m39318c(String str, C24003n c24003n, InterfaceC3968a interfaceC3968a) {
        AbstractC19074t.m100208f(interfaceC3968a, "imageDump");
        if (str != null && str.length() != 0) {
            boolean m125696L2 = C23999j.m125696L2(str, c24003n);
            if (!m125696L2) {
                getRoundView().m76477r();
            }
            if (m125696L2 || !this.f41243s) {
                interfaceC3968a.setTag(str);
                ((C23528a) getAQuery().m123612r(interfaceC3968a)).m123579C(str, c24003n, new C7622a(interfaceC3968a, this, m125696L2));
                return;
            }
            return;
        }
        getRoundView().m76477r();
    }

    /* renamed from: d */
    public final void m39319d() {
        getRoundView().m76462J(1, this.f41240p);
        C13697o roundView = getRoundView();
        int i11 = this.f41242r;
        roundView.m76461I(new float[]{i11, i11, i11, i11, i11, i11, i11, i11});
        getRoundView().m76481v(this.f41240p, this.f41241q);
    }

    /* renamed from: e */
    public final void m39320e(int i11, int i12, int i13) {
        this.f41240p = i11;
        this.f41241q = i12;
        this.f41242r = i13;
        m39319d();
    }

    public final C13697o getRoundView() {
        return (C13697o) this.f41246v.getValue();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        getRoundView().m76460H(0, 0);
        getRoundView().m76467d(canvas);
    }

    public final void setDrawBorder(boolean z11) {
        getRoundView().m76457E(z11);
    }

    public FilterPickerRoundedCornerImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        int i12 = AbstractC23222t7.f112565i0;
        this.f41240p = i12;
        this.f41241q = i12;
        this.f41242r = AbstractC23222t7.f112562h;
        m129210a = AbstractC24856m.m129210a(new C7623a(this));
        this.f41244t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C7624b(this));
        this.f41245u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C7625c(this));
        this.f41246v = m129210a3;
        m39317b();
    }
}
