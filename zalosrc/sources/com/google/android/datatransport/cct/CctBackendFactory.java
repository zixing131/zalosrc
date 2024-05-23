package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p030b4.AbstractC2514h;
import p030b4.InterfaceC2510d;
import p030b4.InterfaceC2519m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC2510d {
    @Override // p030b4.InterfaceC2510d
    public InterfaceC2519m create(AbstractC2514h abstractC2514h) {
        return new C3997d(abstractC2514h.mo12595b(), abstractC2514h.mo12598e(), abstractC2514h.mo12597d());
    }
}
