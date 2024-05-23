package com.zing.zalo.p077ui.chat.widget.photosuggest;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;

/* loaded from: classes5.dex */
public class ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr extends NoPredictiveItemAnimLinearLayoutMngr {

    /* renamed from: I */
    private boolean f61264I;

    public ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr(Context context, int i11, boolean z11) {
        super(context, i11, z11);
        this.f61264I = true;
    }

    /* renamed from: N2 */
    public void m65528N2(boolean z11) {
        this.f61264I = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        if (this.f61264I && super.mo9757x()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        if (this.f61264I && super.mo9758y()) {
            return true;
        }
        return false;
    }

    public ScrollControllAndNoPredictiveItemAnimLinearLayoutMngr(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f61264I = true;
    }
}
