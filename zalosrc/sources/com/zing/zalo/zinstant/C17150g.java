package com.zing.zalo.zinstant;

import com.zing.zalocore.CoreUtility;
import p248iy.AbstractC20887g;

/* renamed from: com.zing.zalo.zinstant.g */
/* loaded from: classes.dex */
public class C17150g implements InterfaceC17147f {
    @Override // com.zing.zalo.zinstant.InterfaceC17147f
    /* renamed from: a */
    public void mo91679a(int i11, long j11, long j12) {
        AbstractC20887g.m109215B(i11, null, j11, j12);
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17147f
    /* renamed from: b */
    public void mo91680b(int i11, Exception exc) {
        String message;
        if (exc == null) {
            message = null;
        } else {
            message = exc.getMessage();
        }
        AbstractC20887g.m109240r(i11, message);
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17147f
    /* renamed from: c */
    public void mo91681c(int i11, String str) {
        AbstractC20887g.m109231i(CoreUtility.f89233i, i11, str, System.currentTimeMillis(), 110000, CoreUtility.f89236l);
    }
}
