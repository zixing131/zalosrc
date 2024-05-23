package com.zing.zalo.zinstant;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zing.zalo.zinstant.view.ZinstantRootLayout;
import ok0.InterfaceC24284a;
import p133ek.AbstractC18458a;
import pj0.InterfaceC24785k;
import vg.AbstractC28207v1;

/* loaded from: classes7.dex */
public class ZaloZinstantRootLayout extends ZinstantRootLayout {
    public ZaloZinstantRootLayout(Context context) {
        super(context);
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: H */
    public void mo91432H() {
        super.mo91432H();
        setInteractionTracker(new C17172p());
    }

    /* renamed from: V0 */
    public AbstractC28207v1.h0 m91448V0(String str, String str2, InterfaceC24785k interfaceC24785k) {
        if (!TextUtils.isEmpty(str) && interfaceC24785k != null) {
            return new C17248z0(str, interfaceC24785k);
        }
        return null;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    public String getCurrentLocale() {
        return AbstractC18458a.f93019a;
    }

    public void setOnZinstantClickListener(InterfaceC24284a interfaceC24284a) {
        setOnClickListener(interfaceC24284a);
    }

    public ZaloZinstantRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZaloZinstantRootLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
