package com.androidquery.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;

/* renamed from: com.androidquery.util.a */
/* loaded from: classes2.dex */
public interface InterfaceC3968a {
    Context getContext();

    Resources getResources();

    Object getTag();

    Object getTag(int i11);

    void setAnimation(Animation animation);

    void setImageBitmap(Bitmap bitmap);

    void setImageDrawable(Drawable drawable);

    void setImageInfo(C3979l c3979l);

    void setImageInfo(C3979l c3979l, boolean z11);

    void setImageResource(int i11);

    void setTag(int i11, Object obj);

    void setTag(Object obj);

    void setVisibility(int i11);

    void startAnimation(Animation animation);
}
