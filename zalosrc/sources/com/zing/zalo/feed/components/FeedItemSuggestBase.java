package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.uicontrols.FeedAdsImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import is.AbstractC20814p0;
import p354n3.C23528a;
import p604wb.C28905e;

/* loaded from: classes4.dex */
public abstract class FeedItemSuggestBase extends FeedItemBase {

    /* renamed from: A0 */
    protected RobotoTextView f44726A0;

    /* renamed from: B0 */
    protected RobotoTextView f44727B0;

    /* renamed from: C0 */
    protected RobotoTextView f44728C0;

    /* renamed from: D0 */
    protected View f44729D0;

    /* renamed from: E0 */
    protected ImageView f44730E0;

    /* renamed from: F0 */
    protected RobotoTextView f44731F0;

    /* renamed from: G0 */
    protected RobotoTextView f44732G0;

    /* renamed from: H0 */
    protected RobotoTextView f44733H0;

    /* renamed from: I0 */
    protected RobotoTextView f44734I0;

    /* renamed from: J0 */
    protected RobotoTextView f44735J0;

    /* renamed from: K0 */
    protected View f44736K0;

    /* renamed from: L0 */
    protected View f44737L0;

    /* renamed from: M0 */
    protected ImageButton f44738M0;

    /* renamed from: N0 */
    protected View f44739N0;

    /* renamed from: O0 */
    protected int f44740O0;

    /* renamed from: P0 */
    protected C23528a f44741P0;

    /* renamed from: Q0 */
    protected C3000l0 f44742Q0;

    /* renamed from: R0 */
    protected ImageView f44743R0;

    /* renamed from: r0 */
    protected TextView f44744r0;

    /* renamed from: s0 */
    protected ImageView f44745s0;

    /* renamed from: t0 */
    protected RobotoTextView f44746t0;

    /* renamed from: u0 */
    protected ImageButton f44747u0;

    /* renamed from: v0 */
    protected RobotoTextView f44748v0;

    /* renamed from: w0 */
    protected FeedAdsImageView f44749w0;

    /* renamed from: x0 */
    protected RobotoTextView f44750x0;

    /* renamed from: y0 */
    protected View f44751y0;

    /* renamed from: z0 */
    protected View f44752z0;

    public FeedItemSuggestBase(Context context) {
        super(context);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: A */
    public void mo43681A(C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        C3047v0 c3047v0;
        int i12;
        try {
            AbstractC20814p0.m108651j0(c3000l0, i11, this.f44747u0, this.f44746t0, this.f44745s0, this.f44733H0, z11, this.f44741P0, interfaceC10867f, this.f44740O0);
            ImageButton imageButton = this.f44747u0;
            if (imageButton != null) {
                int i13 = this.f44740O0;
                if (i13 != 1 && i13 != 0) {
                    imageButton.setVisibility(8);
                }
                if (C28905e.f133812l == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageButton.setVisibility(i12);
            }
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            if (this.f44744r0 != null) {
                if (!TextUtils.isEmpty(m14324b0.f12061t) && this.f44740O0 != 4) {
                    this.f44744r0.setVisibility(0);
                    this.f44744r0.setText(m14324b0.f12061t);
                } else {
                    this.f44744r0.setVisibility(8);
                }
            }
            if (this.f44743R0 != null && (c3047v0 = m14324b0.f12022B) != null) {
                int i14 = c3047v0.f12279a;
                if (ContactProfile.m40347T0(i14) && ContactProfile.m40345C0(i14)) {
                    this.f44743R0.setVisibility(0);
                } else {
                    this.f44743R0.setVisibility(8);
                }
            }
            AbstractC20814p0.m108610I0(c3000l0, i11, this.f44728C0, this.f44729D0, interfaceC10867f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        try {
            this.f44741P0 = new C23528a(context);
            this.f44740O0 = i11;
            this.f44744r0 = (TextView) findViewById(AbstractC6918a0.tvSuggestHeader);
            this.f44745s0 = (ImageView) findViewById(AbstractC6918a0.imvAvatarFeed);
            this.f44746t0 = (RobotoTextView) findViewById(AbstractC6918a0.tvUserName);
            this.f44747u0 = (ImageButton) findViewById(AbstractC6918a0.btn_submenu_feed_ads);
            this.f44748v0 = (RobotoTextView) findViewById(AbstractC6918a0.tvMessage);
            this.f44749w0 = (FeedAdsImageView) findViewById(AbstractC6918a0.imvPhoto);
            this.f44750x0 = (RobotoTextView) findViewById(AbstractC6918a0.btSuggestAction);
            this.f44751y0 = findViewById(AbstractC6918a0.tvAdsLocation);
            this.f44752z0 = findViewById(AbstractC6918a0.layoutSuggestDetail);
            this.f44726A0 = (RobotoTextView) findViewById(AbstractC6918a0.tvMediaTitle);
            this.f44727B0 = (RobotoTextView) findViewById(AbstractC6918a0.tvMediaSubTitle);
            this.f44728C0 = (RobotoTextView) findViewById(AbstractC6918a0.tvSuggestFeedHeaderTag);
            this.f44729D0 = findViewById(AbstractC6918a0.dividerSuggestTag);
            this.f44743R0 = (ImageView) findViewById(AbstractC6918a0.imv_certificate);
            this.f44730E0 = (ImageView) findViewById(AbstractC6918a0.ibtnLike);
            this.f44731F0 = (RobotoTextView) findViewById(AbstractC6918a0.tvLikeInfo);
            this.f44735J0 = (RobotoTextView) findViewById(AbstractC6918a0.tvLikeText);
            this.f44732G0 = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentInfo);
            this.f44734I0 = (RobotoTextView) findViewById(AbstractC6918a0.tvCommentText);
            this.f44733H0 = (RobotoTextView) findViewById(AbstractC6918a0.tvTime);
            this.f44736K0 = findViewById(AbstractC6918a0.like_touch_delegate);
            this.f44737L0 = findViewById(AbstractC6918a0.layoutFeedItemFooter);
            this.f44738M0 = (ImageButton) findViewById(AbstractC6918a0.btn_submenu_feed);
            this.f44739N0 = findViewById(AbstractC6918a0.feed_footer_overlay);
            if (this.f44740O0 == 4) {
                setFeedItemFooterVisibility(8);
                setLayoutSuggestHeaderVisibility(8);
                setLayoutSuggestFeedHeaderTagVisibility(8);
            }
            RobotoTextView robotoTextView = this.f44733H0;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setFeedContent(C3000l0 c3000l0) {
        this.f44742Q0 = c3000l0;
    }

    public void setFeedItemFooterVisibility(int i11) {
        ImageView imageView = this.f44730E0;
        if (imageView != null) {
            imageView.setVisibility(i11);
        }
        RobotoTextView robotoTextView = this.f44731F0;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(i11);
        }
        RobotoTextView robotoTextView2 = this.f44735J0;
        if (robotoTextView2 != null) {
            robotoTextView2.setVisibility(i11);
        }
        RobotoTextView robotoTextView3 = this.f44732G0;
        if (robotoTextView3 != null) {
            robotoTextView3.setVisibility(i11);
        }
        RobotoTextView robotoTextView4 = this.f44734I0;
        if (robotoTextView4 != null) {
            robotoTextView4.setVisibility(i11);
        }
        View view = this.f44736K0;
        if (view != null) {
            view.setVisibility(i11);
        }
        View view2 = this.f44737L0;
        if (view2 != null) {
            view2.setVisibility(i11);
        }
        ImageButton imageButton = this.f44738M0;
        if (imageButton != null) {
            imageButton.setVisibility(i11);
        }
        View view3 = this.f44739N0;
        if (view3 != null) {
            view3.setVisibility(i11);
        }
    }

    public void setLayoutSuggestFeedHeaderTagVisibility(int i11) {
        RobotoTextView robotoTextView = this.f44728C0;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(i11);
        }
        View view = this.f44729D0;
        if (view != null) {
            view.setVisibility(i11);
        }
    }

    public void setLayoutSuggestHeaderVisibility(int i11) {
        TextView textView = this.f44744r0;
        if (textView != null) {
            textView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setOnFeedMenuClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.f44747u0;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setOnFooterClickListener(View.OnClickListener onClickListener) {
        RobotoTextView robotoTextView = this.f44732G0;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
        View view = this.f44737L0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f44745s0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        RobotoTextView robotoTextView = this.f44746t0;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public void setOnSuggestActionClickListener(View.OnClickListener onClickListener) {
        RobotoTextView robotoTextView = this.f44750x0;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public void setOnSuggestLocationClickListener(View.OnClickListener onClickListener) {
        View view = this.f44751y0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public FeedItemSuggestBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
