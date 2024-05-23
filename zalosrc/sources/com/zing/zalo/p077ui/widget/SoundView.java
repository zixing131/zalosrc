package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class SoundView extends View {

    /* renamed from: p */
    protected View.OnTouchListener f69647p;

    /* renamed from: com.zing.zalo.ui.widget.SoundView$a */
    /* loaded from: classes6.dex */
    public enum EnumC13533a {
        START,
        RECORDING,
        PREVIEW_CANCEL,
        PREVIEW_FREEHAND,
        FREEHAND
    }

    public SoundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public abstract void mo75727a();

    /* renamed from: b */
    public abstract void mo75728b();

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f69647p = onTouchListener;
    }

    public abstract void setState(EnumC13533a enumC13533a);

    public abstract void setVolume(int i11);
}
