package com.zing.zalo.p077ui.imageviewer;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class PreCacheLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    private int f62912I;

    public PreCacheLinearLayoutManager(Context context, int i11, boolean z11) {
        super(context, i11, z11);
        this.f62912I = -1;
    }

    /* renamed from: N2 */
    public void m67263N2(int i11) {
        this.f62912I = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: o2 */
    public int mo9751o2(RecyclerView.C1899z c1899z) {
        int i11 = this.f62912I;
        if (i11 <= 0) {
            return super.mo9751o2(c1899z);
        }
        return i11;
    }

    public PreCacheLinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f62912I = -1;
    }
}
