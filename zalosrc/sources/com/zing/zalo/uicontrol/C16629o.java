package com.zing.zalo.uicontrol;

import android.content.Context;
import com.zing.zalocore.CoreUtility;
import ei0.InterfaceC18437b;
import fn0.AbstractC19074t;
import qi0.AbstractC25298g;

/* renamed from: com.zing.zalo.uicontrol.o */
/* loaded from: classes4.dex */
public final class C16629o implements InterfaceC18437b {
    @Override // ei0.InterfaceC18437b
    /* renamed from: a */
    public AbstractC25298g mo88402a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return new C16651s2(context);
    }

    @Override // ei0.InterfaceC18437b
    /* renamed from: b */
    public String mo88403b() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return str;
    }
}
