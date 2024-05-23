package com.zing.zalo.p077ui.mediastore.common;

import android.content.Context;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;

/* loaded from: classes6.dex */
public final class MediaStoreLinearLayoutManager extends NoPredictiveItemAnimLinearLayoutMngr {

    /* renamed from: I */
    private boolean f64249I;

    public MediaStoreLinearLayoutManager(Context context) {
        super(context);
        this.f64249I = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        if (!super.mo9758y() && !this.f64249I) {
            return false;
        }
        return true;
    }
}
