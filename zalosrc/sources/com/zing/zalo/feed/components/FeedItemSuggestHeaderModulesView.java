package com.zing.zalo.feed.components;

import android.content.Context;
import com.zing.zalo.uidrawing.ModulesView;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class FeedItemSuggestHeaderModulesView extends ModulesView {

    /* renamed from: K */
    protected C23528a f44796K;

    /* renamed from: L */
    protected int f44797L;

    /* renamed from: M */
    private C8393t4 f44798M;

    public FeedItemSuggestHeaderModulesView(Context context) {
        super(context);
    }

    /* renamed from: V */
    public void m44139V(Context context, int i11) {
        this.f44796K = new C23528a(context);
        this.f44797L = i11;
        try {
            C8393t4 c8393t4 = new C8393t4(context);
            this.f44798M = c8393t4;
            c8393t4.m89106L().m89060k0(-1).m89030N(-2);
            mo69681L(this.f44798M);
            this.f44798M.m44881o1(context, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C8393t4 getFeedItemSuggestHeaderModule() {
        return this.f44798M;
    }
}
