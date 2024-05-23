package com.zing.zalo.feed.mvp.profile.quickaccess;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ProfileQuickAccessLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    private boolean f46765I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileQuickAccessLayoutManager(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f46765I = true;
    }

    /* renamed from: N2 */
    public final void m46419N2(boolean z11) {
        this.f46765I = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        if (this.f46765I && super.mo9757x()) {
            return true;
        }
        return false;
    }
}
