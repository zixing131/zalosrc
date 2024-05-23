package com.zing.zalo.zinstant.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import java.util.Iterator;
import nk0.C23855s0;
import uk0.InterfaceC27292f;
import wj0.InterfaceC29061b;

/* loaded from: classes7.dex */
public class ZinstantRootLayout extends ZinstantLayout {
    public ZinstantRootLayout(Context context) {
        super(context);
    }

    /* renamed from: T0 */
    protected void m92038T0() {
        C23855s0 zinstantRootTree;
        if (this.f87800O != null && (zinstantRootTree = getZinstantRootTree()) != null && zinstantRootTree.m124626G()) {
            this.f87800O.mo107172a();
        }
    }

    /* renamed from: U0 */
    protected void m92039U0() {
        if (this.f87802Q != null && m91979N()) {
            String delegateID = getDelegateID();
            InterfaceC27292f interfaceC27292f = this.f87802Q;
            int featureType = getFeatureType();
            if (delegateID == null) {
                delegateID = "unknown";
            }
            interfaceC27292f.mo91777a(featureType, delegateID);
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, wj0.InterfaceC29061b
    public ZOMRect getGlobalZOMRect() {
        if (getZINSNode() != null) {
            return getZINSNode().mBound;
        }
        return null;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, android.view.View
    public void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 == 0) {
            post(new Runnable() { // from class: com.zing.zalo.zinstant.view.q
                public /* synthetic */ RunnableC17240q() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantRootLayout.this.m92000s();
                }
            });
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    public void setZinstantRootView(C23855s0 c23855s0) {
        if (c23855s0 == null || !m91981O(c23855s0)) {
            return;
        }
        Iterator<InterfaceC29061b> it = getAllChildZINSComponent().iterator();
        while (it.hasNext()) {
            removeView(it.next().getView());
        }
        super.setZinstantRootView(c23855s0);
        this.f87812s = c23855s0;
        m92039U0();
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: u0 */
    public void mo92003u0() {
        super.mo92003u0();
        m92038T0();
    }

    public ZinstantRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZinstantRootLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
