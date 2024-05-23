package com.zing.zalo.p077ui.widget.layoutmanager;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes6.dex */
public class LinearLayoutManagerFixed extends LinearLayoutManager {

    /* renamed from: I */
    boolean f70631I;

    public LinearLayoutManagerFixed(Context context, int i11, boolean z11, boolean z12) {
        super(context, i11, z11);
        this.f70631I = z12;
    }

    /* renamed from: N2 */
    public void m76390N2(boolean z11) {
        this.f70631I = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        return this.f70631I;
    }
}
