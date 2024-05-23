package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context, 0);
        AbstractC4205o.m19723l(context, "Context cannot be null");
    }

    public final VideoController zza() {
        return this.zza.zzf();
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 0);
    }
}
