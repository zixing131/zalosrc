package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17466e;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p716zh.C31890dc;
import p716zh.C31984k1;
import v20.C27477e;

/* loaded from: classes4.dex */
public class DecorBackgroundRowView extends LinearLayout {

    /* renamed from: p */
    C23528a f47304p;

    /* renamed from: q */
    InterfaceC8854a f47305q;

    /* renamed from: r */
    AspectRatioImageView[] f47306r;

    /* renamed from: com.zing.zalo.feed.uicontrols.DecorBackgroundRowView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8854a {
        /* renamed from: a */
        void mo47293a(C31890dc c31890dc);
    }

    public DecorBackgroundRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private void m47288c(AspectRatioImageView aspectRatioImageView, int[] iArr, int i11) {
        try {
            aspectRatioImageView.setScaleOption(1);
            if (aspectRatioImageView.getLoadingView() != null) {
                aspectRatioImageView.getLoadingView().m77066e(i11, i11);
                aspectRatioImageView.getLoadingView().m77065d(iArr);
                aspectRatioImageView.getLoadingView().m77068g(AbstractC23136l9.m118742r(2.0f));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m47289e(C31890dc c31890dc, View view) {
        InterfaceC8854a interfaceC8854a = this.f47305q;
        if (interfaceC8854a != null) {
            interfaceC8854a.mo47293a(c31890dc);
        }
    }

    /* renamed from: b */
    void m47290b(AspectRatioImageView aspectRatioImageView, C31890dc c31890dc, boolean z11, C31890dc c31890dc2) {
        try {
            if (c31890dc != null) {
                aspectRatioImageView.setVisibility(0);
                if (c31890dc.m153247r()) {
                    aspectRatioImageView.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView.getContext(), AbstractC16803z.bg_default_thumb));
                } else {
                    aspectRatioImageView.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView.getContext(), AbstractC16803z.bg_loading_thumb));
                    if (!TextUtils.isEmpty(c31890dc.f146496b) && (!z11 || C23999j.m125696L2(c31890dc.f146496b, C23278z2.m120060A()))) {
                        ((C23528a) this.f47304p.m123612r(aspectRatioImageView)).m123579C(c31890dc.f146496b, C23278z2.m120060A(), new C23999j().m125764I1(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));
                    }
                }
                aspectRatioImageView.setBackgroundResource(AbstractC17466e.transparent);
                aspectRatioImageView.setShowLoading(false);
                if (c31890dc2 != null && c31890dc.f146495a == c31890dc2.f146495a && c31890dc.f146509o == c31890dc2.f146509o) {
                    aspectRatioImageView.setBackgroundResource(AbstractC16803z.bg_decor_stroke_selected);
                    aspectRatioImageView.setShowLoading(!c31890dc.m153250u());
                }
                aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.uicontrols.a

                    /* renamed from: q */
                    public final /* synthetic */ C31890dc f47384q;

                    public /* synthetic */ ViewOnClickListenerC8869a(C31890dc c31890dc3) {
                        r2 = c31890dc3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DecorBackgroundRowView.this.m47289e(r2, view);
                    }
                });
                return;
            }
            aspectRatioImageView.setVisibility(4);
            aspectRatioImageView.setOnClickListener(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m47291d(Context context) {
        int i11;
        int i12;
        this.f47304p = new C23528a(context);
        setOrientation(0);
        int m118742r = AbstractC23136l9.m118742r(20.0f);
        int[] iArr = {0, -1};
        int i13 = C27477e.f129234F;
        int i14 = C27477e.f129235G / 2;
        int i15 = C27477e.f129237I;
        int m118742r2 = AbstractC23136l9.m118742r(1.0f);
        this.f47306r = new AspectRatioImageView[i13];
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = C27477e.f129236H;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i17, i17);
            if (i16 == 0) {
                i11 = i15;
            } else {
                i11 = i14;
            }
            if (i16 == i13 - 1) {
                i12 = i15;
            } else {
                i12 = i14;
            }
            layoutParams.setMargins(i11, i14, i12, i14);
            View aspectRatioImageView = new AspectRatioImageView(getContext());
            aspectRatioImageView.setPadding(m118742r2, m118742r2, m118742r2, m118742r2);
            this.f47306r[i16] = aspectRatioImageView;
            addView(aspectRatioImageView, layoutParams);
            m47288c(this.f47306r[i16], iArr, m118742r);
        }
    }

    /* renamed from: f */
    public void m47292f(C31984k1 c31984k1, boolean z11, C31890dc c31890dc) {
        for (int i11 = 0; i11 < C27477e.f129234F; i11++) {
            try {
                AspectRatioImageView aspectRatioImageView = this.f47306r[i11];
                if (aspectRatioImageView != null) {
                    aspectRatioImageView.setVisibility(4);
                    this.f47306r[i11].setOnClickListener(null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (c31984k1 != null && c31984k1.f147078b != null) {
            for (int i12 = 0; i12 < c31984k1.f147078b.size(); i12++) {
                m47290b(this.f47306r[i12], c31984k1.m153944d(i12), z11, c31890dc);
            }
        }
    }

    public void setListener(InterfaceC8854a interfaceC8854a) {
        this.f47305q = interfaceC8854a;
    }
}
