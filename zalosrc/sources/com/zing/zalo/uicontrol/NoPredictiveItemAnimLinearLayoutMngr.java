package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public class NoPredictiveItemAnimLinearLayoutMngr extends LinearLayoutManager {
    public NoPredictiveItemAnimLinearLayoutMngr(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: J1 */
    public boolean mo9654J1() {
        return false;
    }

    public NoPredictiveItemAnimLinearLayoutMngr(Context context, int i11, boolean z11) {
        super(context, i11, z11);
    }

    public NoPredictiveItemAnimLinearLayoutMngr(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }
}
