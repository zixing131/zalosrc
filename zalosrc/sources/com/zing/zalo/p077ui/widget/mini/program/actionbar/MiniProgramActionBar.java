package com.zing.zalo.p077ui.widget.mini.program.actionbar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.mini.program.MPContainerView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class MiniProgramActionBar extends MPContainerView implements View.OnClickListener {

    /* renamed from: u */
    private View.OnClickListener f70737u;

    /* renamed from: v */
    private int f70738v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramActionBar(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f70738v = AbstractC8915g0.ThemeDefault_Dark;
    }

    /* renamed from: f */
    private final TypedArray m76433f(int i11) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f70738v, new int[]{i11});
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        return obtainStyledAttributes;
    }

    /* renamed from: h */
    public static /* synthetic */ RecyclingImageView m76434h(MiniProgramActionBar miniProgramActionBar, Drawable drawable, int i11, int i12, int i13, int i14, Drawable drawable2, String str, int i15, Object obj) {
        int i16;
        int i17;
        int i18;
        Drawable drawable3;
        if (obj == null) {
            if ((i15 & 4) != 0) {
                i16 = (int) miniProgramActionBar.getContext().getResources().getDimension(AbstractC16802y.icon_header_mp_size);
            } else {
                i16 = i12;
            }
            if ((i15 & 8) != 0) {
                i17 = (int) miniProgramActionBar.getContext().getResources().getDimension(AbstractC16802y.icon_header_mp_size);
            } else {
                i17 = i13;
            }
            if ((i15 & 16) != 0) {
                Context context = miniProgramActionBar.getContext();
                AbstractC19074t.m100205c(context);
                i18 = AbstractC23136l9.m118641B(context, R.color.transparent);
            } else {
                i18 = i14;
            }
            if ((i15 & 32) != 0) {
                drawable3 = null;
            } else {
                drawable3 = drawable2;
            }
            return miniProgramActionBar.m76435g(drawable, i11, i16, i17, i18, drawable3, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderButton");
    }

    /* renamed from: g */
    protected final RecyclingImageView m76435g(Drawable drawable, int i11, int i12, int i13, int i14, Drawable drawable2, String str) {
        AbstractC19074t.m100208f(str, "trackingId");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        TrackingImageView trackingImageView = new TrackingImageView(context);
        trackingImageView.setCropToPadding(true);
        trackingImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        trackingImageView.setImageDrawable(drawable);
        trackingImageView.setId(i11);
        trackingImageView.setIdTracking(str);
        if (drawable2 != null) {
            trackingImageView.setBackground(drawable2);
        } else {
            trackingImageView.setBackgroundColor(i14);
        }
        trackingImageView.setLayoutParams(new RelativeLayout.LayoutParams(i12, i13));
        trackingImageView.setOnClickListener(this);
        return trackingImageView;
    }

    public final int getCurrentTheme() {
        return this.f70738v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final LinearLayout m76436i() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackground(m76438k(AbstractC16781w.BackgroundButtonMPInActionBar));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        int m118742r = AbstractC23136l9.m118742r(0.5f);
        linearLayout.setPaddingRelative(m118742r, m118742r, m118742r, m118742r);
        return linearLayout;
    }

    /* renamed from: j */
    public final int m76437j(int i11) {
        TypedArray m76433f = m76433f(i11);
        int color = m76433f.getColor(0, 0);
        m76433f.recycle();
        return color;
    }

    /* renamed from: k */
    public final Drawable m76438k(int i11) {
        try {
            TypedArray m76433f = m76433f(i11);
            Drawable drawable = m76433f.getDrawable(0);
            m76433f.recycle();
            return drawable;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f70737u;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setCurrentTheme(int i11) {
        this.f70738v = i11;
    }

    public final void setOptionClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "mOnClickListener");
        this.f70737u = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70738v = AbstractC8915g0.ThemeDefault_Dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramActionBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70738v = AbstractC8915g0.ThemeDefault_Dark;
    }
}
