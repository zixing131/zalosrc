package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C1211t1;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class TabItem extends View {

    /* renamed from: p */
    public final CharSequence f35884p;

    /* renamed from: q */
    public final Drawable f35885q;

    /* renamed from: r */
    public final int f35886r;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1211t1 m5715u = C1211t1.m5715u(context, attributeSet, AbstractC23587l.TabItem);
        this.f35884p = m5715u.m5732p(AbstractC23587l.TabItem_android_text);
        this.f35885q = m5715u.m5723g(AbstractC23587l.TabItem_android_icon);
        this.f35886r = m5715u.m5730n(AbstractC23587l.TabItem_android_layout, 0);
        m5715u.m5736w();
    }
}
