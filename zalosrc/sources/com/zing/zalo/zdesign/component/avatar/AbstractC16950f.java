package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import ui0.C27274a;

/* renamed from: com.zing.zalo.zdesign.component.avatar.f */
/* loaded from: classes7.dex */
public abstract class AbstractC16950f extends C16716d {

    /* renamed from: M0 */
    private InterfaceC18505l f86526M0;

    public AbstractC16950f(Context context) {
        super(context);
        this.f86526M0 = C27274a.f128311a.m139634b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o1 */
    public final InterfaceC18505l m90780o1() {
        return this.f86526M0;
    }

    /* renamed from: p1 */
    public final void m90781p1(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "format");
        this.f86526M0 = interfaceC18505l;
    }
}
