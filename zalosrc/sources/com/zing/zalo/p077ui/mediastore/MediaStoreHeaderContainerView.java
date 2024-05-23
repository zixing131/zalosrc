package com.zing.zalo.p077ui.mediastore;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class MediaStoreHeaderContainerView extends LinearLayout {

    /* renamed from: p */
    private InterfaceC12289a f63997p;

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreHeaderContainerView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12289a {
        /* renamed from: a */
        void mo68964a(int i11, int i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreHeaderContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    public final InterfaceC12289a getMListener() {
        return this.f63997p;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        InterfaceC12289a interfaceC12289a;
        super.onSizeChanged(i11, i12, i13, i14);
        if (i12 != i14 && (interfaceC12289a = this.f63997p) != null) {
            interfaceC12289a.mo68964a(i12, i13);
        }
    }

    public final void setHeaderContainerEventListener(InterfaceC12289a interfaceC12289a) {
        AbstractC19074t.m100208f(interfaceC12289a, "listener");
        this.f63997p = interfaceC12289a;
    }

    public final void setMListener(InterfaceC12289a interfaceC12289a) {
        this.f63997p = interfaceC12289a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreHeaderContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
