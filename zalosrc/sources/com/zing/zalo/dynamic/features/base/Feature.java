package com.zing.zalo.dynamic.features.base;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public interface Feature {

    @Keep
    /* loaded from: classes3.dex */
    public interface Dependencies {
        Context getContext();
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface Provider<T extends Feature> {
        T get(Dependencies dependencies);

        String getFeatureName();

        String getModuleName();
    }
}
