package com.zing.zalo.feed.components.suggestitems;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemSuggestBase;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import is.AbstractC20814p0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p489rn.C25866f0;
import p615wn.C29106b;
import p716zh.C32145v4;

/* loaded from: classes4.dex */
public class SuggestItemOAGif extends FeedItemSuggestBase {

    /* renamed from: S0 */
    private RobotoTextView f45679S0;

    /* renamed from: T0 */
    private RobotoTextView f45680T0;

    /* renamed from: U0 */
    private RobotoTextView f45681U0;

    /* renamed from: V0 */
    private View f45682V0;

    /* renamed from: W0 */
    private ZSimpleGIFView f45683W0;

    /* renamed from: X0 */
    private View f45684X0;

    /* renamed from: Y0 */
    private int f45685Y0;

    public SuggestItemOAGif(Context context) {
        super(context);
        this.f45685Y0 = 0;
    }

    /* renamed from: P */
    private void m44859P(C3025q0.d dVar, C3020p0 c3020p0) {
        C3047v0 c3047v0;
        try {
            String str = "";
            if (this.f45679S0 != null) {
                if (!TextUtils.isEmpty(dVar.f12172c)) {
                    this.f45679S0.setVisibility(0);
                    this.f45679S0.setText(dVar.f12172c);
                } else {
                    this.f45679S0.setText("");
                    this.f45679S0.setVisibility(8);
                }
            }
            if (this.f45680T0 != null) {
                if (!TextUtils.isEmpty(dVar.f12171b)) {
                    this.f45680T0.setVisibility(0);
                    this.f45680T0.setText(dVar.f12171b);
                } else {
                    this.f45680T0.setText("");
                    this.f45680T0.setVisibility(8);
                }
            }
            if (c3020p0 != null && (c3047v0 = c3020p0.f12022B) != null) {
                str = c3047v0.f12280b;
            }
            AbstractC20814p0.m108606G0(this.f45681U0, str, dVar.f12180k, dVar.f12179j);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    public void m44860O(C3000l0 c3000l0, C3025q0.d dVar, boolean z11, InterfaceC2259a interfaceC2259a, int i11) {
        if (c3000l0 != null && dVar != null) {
            try {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                TrackingSource trackingSource = new TrackingSource(225);
                C32145v4 c32145v4 = dVar.f12174e;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                    trackingSource.m40677a("srcId", Integer.valueOf(dVar.f12174e.f148249b));
                }
                ViewGroup.LayoutParams layoutParams = this.f45683W0.getLayoutParams();
                layoutParams.width = i11;
                layoutParams.height = (int) (i11 / 1.92f);
                this.f45683W0.setLayoutParams(layoutParams);
                this.f45683W0.m88227l(new ZSimpleGIFView.C16554f(dVar.f12176g, dVar.f12170a, layoutParams.width, layoutParams.height, "SuggestItemOAGif"), this.f45685Y0, null);
                this.f45683W0.m88224g(100L);
                m44859P(dVar, m14322a0);
                C25866f0.m133492v(this.f45683W0, getContext(), m14322a0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource);
                View view = this.f45682V0;
                if (view != null) {
                    C25866f0.m133492v(view, getContext(), m14322a0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource);
                }
                RobotoTextView robotoTextView = this.f45681U0;
                if (robotoTextView != null) {
                    C25866f0.m133492v(robotoTextView, getContext(), m14322a0, dVar.f12179j, dVar.f12181l, dVar, interfaceC2259a, trackingSource);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestBase, com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.suggest_item_oa_gif_content, this);
            this.f45683W0 = (ZSimpleGIFView) findViewById(AbstractC6918a0.zsimple_gif_view);
            this.f45679S0 = (RobotoTextView) findViewById(AbstractC6918a0.tvMediaTitle);
            this.f45680T0 = (RobotoTextView) findViewById(AbstractC6918a0.tvMediaSubTitle);
            this.f45681U0 = (RobotoTextView) findViewById(AbstractC6918a0.btSuggestAction);
            this.f45682V0 = findViewById(AbstractC6918a0.layoutSuggestDetail);
            this.f45684X0 = findViewById(AbstractC6918a0.view_background);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    public void setPosition(int i11) {
        this.f45685Y0 = i11;
    }

    public void setSuggestBackground(Drawable drawable) {
        View view = this.f45684X0;
        if (view != null) {
            AbstractC23136l9.m118696b1(view, drawable);
        }
    }

    public SuggestItemOAGif(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45685Y0 = 0;
    }
}
