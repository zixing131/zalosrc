package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzdvb extends FrameLayout {

    /* renamed from: p */
    private final zzas f32096p;

    public zzdvb(Context context, View view, zzas zzasVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f32096p = zzasVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f32096p.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if (childAt != null && (childAt instanceof zq0)) {
                arrayList.add((zq0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((zq0) arrayList.get(i12)).destroy();
        }
    }
}
