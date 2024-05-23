package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p716zh.C31890dc;

/* loaded from: classes4.dex */
public class TypographyView extends FrameLayout {

    /* renamed from: p */
    AspectRatioImageView f47381p;

    /* renamed from: q */
    C23528a f47382q;

    public TypographyView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m47324a(Context context) {
        try {
            this.f47382q = new C23528a(context);
            int m118742r = AbstractC23136l9.m118742r(14.0f);
            int[] iArr = {0, -872415232};
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_typography_view, this);
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(AbstractC6918a0.imv_typo);
            this.f47381p = aspectRatioImageView;
            aspectRatioImageView.setScaleOption(5);
            if (this.f47381p.getLoadingView() != null) {
                this.f47381p.getLoadingView().m77066e(m118742r, m118742r);
                this.f47381p.getLoadingView().m77065d(iArr);
                this.f47381p.getLoadingView().m77068g(AbstractC23136l9.m118742r(1.0f));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m47325b(C31890dc c31890dc, boolean z11, C31890dc c31890dc2) {
        if (c31890dc == null) {
            return;
        }
        try {
            if (c31890dc.m153249t()) {
                AspectRatioImageView aspectRatioImageView = this.f47381p;
                aspectRatioImageView.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView.getContext(), AbstractC16803z.typo_default));
            } else {
                AspectRatioImageView aspectRatioImageView2 = this.f47381p;
                aspectRatioImageView2.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView2.getContext(), AbstractC16803z.blank_default_typo));
                if (!TextUtils.isEmpty(c31890dc.f146496b) && (!z11 || C23999j.m125696L2(c31890dc.f146496b, C23278z2.m120124e1()))) {
                    ((C23528a) this.f47382q.m123612r(this.f47381p)).m123619y(c31890dc.f146496b, C23278z2.m120124e1(), 10);
                }
            }
            AspectRatioImageView aspectRatioImageView3 = this.f47381p;
            aspectRatioImageView3.setBackgroundDrawable(AbstractC23136l9.m118665N(aspectRatioImageView3.getContext(), AbstractC16803z.stroke_bg_typo_grey));
            this.f47381p.setShowLoading(false);
            if (c31890dc2 != null && c31890dc.f146495a == c31890dc2.f146495a) {
                AspectRatioImageView aspectRatioImageView4 = this.f47381p;
                aspectRatioImageView4.setBackgroundDrawable(AbstractC23136l9.m118665N(aspectRatioImageView4.getContext(), AbstractC16803z.stroke_bg_typo_blue));
                this.f47381p.setShowLoading(!c31890dc.m153250u());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public TypographyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TypographyView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
