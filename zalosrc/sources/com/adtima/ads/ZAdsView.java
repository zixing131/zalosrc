package com.adtima.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adtima.Adtima;
import com.adtima.control.ZVideoControl;
import p178g3.AbstractC19211f;
import p196h3.InterfaceC19745g;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
class ZAdsView extends LinearLayout {
    public static final String TAG = "ZAdsView";
    protected int mAdsBackground;
    protected ZAdsBannerSize mAdsBannerSize;
    protected Context mAdsContext;
    protected boolean mAdsIsLoaded;
    protected ZAdsListener mAdsListener;
    protected InterfaceC19745g mAdsLoadListener;
    protected boolean mAdsTransitAnim;
    protected String mAdsType;
    protected String mAdsZoneId;

    public ZAdsView(Context context) {
        super(context);
        this.mAdsContext = null;
        this.mAdsType = null;
        this.mAdsZoneId = null;
        this.mAdsIsLoaded = false;
        this.mAdsTransitAnim = true;
        this.mAdsBackground = 0;
        this.mAdsListener = null;
        this.mAdsLoadListener = null;
        this.mAdsBannerSize = ZAdsBannerSize.MEDIUM_RECTANGLE;
        this.mAdsContext = context;
        setupLayout();
    }

    private void setupLayout() {
        setLayoutParams(new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b));
        setMinimumHeight(1);
        setBackgroundColor(0);
        setDescendantFocusability(393216);
        if (AbstractC19211f.m100806a(21)) {
            ZVideoControl zVideoControl = new ZVideoControl(this.mAdsContext);
            zVideoControl.setVisibility(8);
            addView(zVideoControl);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addAdsToBanner(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            try {
                view.setVisibility(4);
                if (layoutParams == null) {
                    addView(view);
                } else {
                    addView(view, layoutParams);
                }
                view.setVisibility(0);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "addAdsToBanner", e11);
            }
        }
    }

    public boolean isAdsLoaded() {
        return this.mAdsIsLoaded;
    }

    protected void removeAdsInBanner(View view) {
        if (view != null) {
            try {
                removeView(view);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "removeAdsInBanner", e11);
            }
        }
    }

    public void setAdsBackgroundColor(int i11) {
        this.mAdsBackground = i11;
    }

    public void setAdsListener(ZAdsListener zAdsListener) {
        this.mAdsListener = zAdsListener;
    }

    public void setAdsTransitAnim(boolean z11) {
        this.mAdsTransitAnim = z11;
    }

    public ZAdsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdsContext = null;
        this.mAdsType = null;
        this.mAdsZoneId = null;
        this.mAdsIsLoaded = false;
        this.mAdsTransitAnim = true;
        this.mAdsBackground = 0;
        this.mAdsListener = null;
        this.mAdsLoadListener = null;
        this.mAdsBannerSize = ZAdsBannerSize.MEDIUM_RECTANGLE;
        this.mAdsContext = context;
        setupLayout();
    }

    public ZAdsView(Context context, AttributeSet attributeSet, String str) {
        super(context, attributeSet);
        this.mAdsContext = null;
        this.mAdsType = null;
        this.mAdsZoneId = null;
        this.mAdsIsLoaded = false;
        this.mAdsTransitAnim = true;
        this.mAdsBackground = 0;
        this.mAdsListener = null;
        this.mAdsLoadListener = null;
        this.mAdsBannerSize = ZAdsBannerSize.MEDIUM_RECTANGLE;
        this.mAdsContext = context;
        this.mAdsType = str;
        setupLayout();
    }

    public ZAdsView(Context context, String str, String str2) {
        super(context);
        this.mAdsContext = null;
        this.mAdsType = null;
        this.mAdsZoneId = null;
        this.mAdsIsLoaded = false;
        this.mAdsTransitAnim = true;
        this.mAdsBackground = 0;
        this.mAdsListener = null;
        this.mAdsLoadListener = null;
        this.mAdsBannerSize = ZAdsBannerSize.MEDIUM_RECTANGLE;
        this.mAdsContext = context;
        this.mAdsZoneId = str;
        this.mAdsType = str2;
        setupLayout();
    }
}
