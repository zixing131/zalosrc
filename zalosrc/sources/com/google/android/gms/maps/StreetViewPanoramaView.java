package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: p */
    private final C5900h f33584p;

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super((Context) AbstractC4205o.m19723l(context, "context must not be null"), attributeSet);
        this.f33584p = new C5900h(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i11) {
        super((Context) AbstractC4205o.m19723l(context, "context must not be null"), attributeSet, i11);
        this.f33584p = new C5900h(this, context, null);
    }
}
