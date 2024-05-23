package com.zing.zalo.zview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes7.dex */
public class SplashView extends RelativeLayout {

    /* renamed from: p */
    public TextView f88718p;

    /* renamed from: q */
    public ImageView f88719q;

    public SplashView(Context context) {
        this(context, null);
    }

    public SplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SplashView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC17470g.splash, (ViewGroup) this, true);
        this.f88718p = (TextView) inflate.findViewById(AbstractC17468f.str_copyright);
        this.f88719q = (ImageView) inflate.findViewById(AbstractC17468f.logosplash);
    }
}
