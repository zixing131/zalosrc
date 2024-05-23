package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public class QRCardTemplate extends RelativeLayout {

    /* renamed from: p */
    private final RecyclingImageView f69445p;

    /* renamed from: q */
    private final RecyclingImageView f69446q;

    /* renamed from: r */
    private final RecyclingImageView f69447r;

    /* renamed from: s */
    private final RobotoTextView f69448s;

    /* renamed from: t */
    private final RobotoTextView f69449t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCardTemplate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, null, null, null, 252, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final RecyclingImageView getAvatarView() {
        return this.f69446q;
    }

    public final RecyclingImageView getBackgroundView() {
        return this.f69445p;
    }

    public final RobotoTextView getNameView() {
        return this.f69448s;
    }

    public final RecyclingImageView getQrImageView() {
        return this.f69447r;
    }

    public final RobotoTextView getSubNameView() {
        return this.f69449t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCardTemplate(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, null, null, null, null, 248, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ QRCardTemplate(Context context, AttributeSet attributeSet, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : num3, (i12 & 64) != 0 ? null : num4, (i12 & 128) == 0 ? num5 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCardTemplate(Context context, AttributeSet attributeSet, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        super(context, attributeSet, i11);
        int i12;
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 3.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 18.0f);
        int m118712h5 = AbstractC23136l9.m118712h(context, 40.0f);
        int m118712h6 = AbstractC23136l9.m118712h(context, num != null ? num.intValue() : 420.0f);
        int m118712h7 = AbstractC23136l9.m118712h(context, num2 != null ? num2.intValue() : 640.0f);
        int m118712h8 = AbstractC23136l9.m118712h(context, num3 != null ? num3.intValue() : 238.0f);
        int m118712h9 = AbstractC23136l9.m118712h(context, num4 != null ? num4.intValue() : 64.0f);
        int i13 = (m118712h * 2) + m118712h9;
        if (num5 != null) {
            i12 = num5.intValue();
        } else {
            i12 = (((m118712h7 / 2) - (m118712h8 / 2)) / 2) - (i13 / 2);
        }
        setLayoutParams(new RelativeLayout.LayoutParams(m118712h6, m118712h7));
        super.setBackgroundColor(-1);
        RecyclingImageView recyclingImageView = new RecyclingImageView(context);
        recyclingImageView.setBackgroundColor(-65536);
        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m118712h6, m118712h7);
        layoutParams.addRule(13, -1);
        C24848g0 c24848g0 = C24848g0.f119245a;
        addView(recyclingImageView, layoutParams);
        this.f69445p = recyclingImageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(AbstractC16803z.bg_circle_avatar_custom_noti);
        frameLayout.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i13, i13);
        layoutParams2.addRule(14, -1);
        layoutParams2.setMargins(0, i12, 0, 0);
        addView(frameLayout, layoutParams2);
        RecyclingImageView recyclingImageView2 = new RecyclingImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m118712h9, m118712h9);
        layoutParams3.gravity = 17;
        frameLayout.addView(recyclingImageView2, layoutParams3);
        this.f69446q = recyclingImageView2;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.mo75850g(true);
        robotoTextView.setId(View.generateViewId());
        robotoTextView.setTextSize(0, m118712h4);
        robotoTextView.setTextColor(AbstractC23136l9.m118641B(context, AbstractC16801x.Light_TextColor1));
        robotoTextView.setTypeface(C13718q1.m76694c(context, 7));
        robotoTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        robotoTextView.setEllipsize(truncateAt);
        robotoTextView.setTextAlignment(4);
        int i14 = (m118712h6 - (m118712h5 * 2)) - (m118712h3 * 2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i14, -2);
        layoutParams4.addRule(3, frameLayout.getId());
        layoutParams4.addRule(14, -1);
        layoutParams4.topMargin = m118712h2;
        addView(robotoTextView, layoutParams4);
        this.f69448s = robotoTextView;
        RobotoTextView robotoTextView2 = new RobotoTextView(context);
        robotoTextView2.mo75850g(true);
        robotoTextView2.setTextSize(0, m118712h3);
        robotoTextView2.setTextColor(AbstractC23136l9.m118641B(context, AbstractC16801x.Light_TextColor2));
        robotoTextView2.setMaxLines(1);
        robotoTextView2.setEllipsize(truncateAt);
        robotoTextView2.setTextAlignment(4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i14, -2);
        layoutParams5.addRule(3, robotoTextView.getId());
        layoutParams5.addRule(14, -1);
        layoutParams5.setMargins(m118712h5, m118712h, m118712h5, 0);
        addView(robotoTextView2, layoutParams5);
        this.f69449t = robotoTextView2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundResource(AbstractC16803z.ic_qr_business_qr_code_background_shadow);
        frameLayout2.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        addView(frameLayout2, layoutParams6);
        RoundedImageView roundedImageView = new RoundedImageView(context);
        roundedImageView.m76289j(12.0f, 12.0f, 12.0f, 12.0f);
        frameLayout2.addView(roundedImageView, m118712h8, m118712h8);
        this.f69447r = roundedImageView;
    }
}
