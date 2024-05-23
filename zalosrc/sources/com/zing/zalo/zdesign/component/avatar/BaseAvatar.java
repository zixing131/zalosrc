package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import android.util.AttributeSet;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ui0.C27274a;

/* loaded from: classes7.dex */
public class BaseAvatar extends DrawableCallbackView {

    /* renamed from: q */
    private InterfaceC18505l f86481q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAvatar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86481q = C27274a.f128311a.m139634b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC18505l getFormatAvatarMore() {
        return this.f86481q;
    }

    public final void setAvatarMoreFormat(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "format");
        this.f86481q = interfaceC18505l;
    }

    protected final void setFormatAvatarMore(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "<set-?>");
        this.f86481q = interfaceC18505l;
    }

    public /* synthetic */ BaseAvatar(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
