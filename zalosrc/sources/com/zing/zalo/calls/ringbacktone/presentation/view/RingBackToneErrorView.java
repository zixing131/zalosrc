package com.zing.zalo.calls.ringbacktone.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.calls.ringbacktone.presentation.view.RingBackToneErrorView;
import dg0.AbstractC17927b;
import fn0.AbstractC19074t;
import p389oe.C24239f;
import p389oe.InterfaceC24236c;
import p649xl.C30082v6;

/* loaded from: classes3.dex */
public final class RingBackToneErrorView extends RelativeLayout {

    /* renamed from: p */
    private C30082v6 f40470p;

    /* renamed from: q */
    private InterfaceC24236c f40471q;

    public RingBackToneErrorView(Context context) {
        super(context);
        m37796f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m37794d(final RingBackToneErrorView ringBackToneErrorView, View view) {
        AbstractC19074t.m100208f(ringBackToneErrorView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RING_BACK_TONE", new Runnable() { // from class: pe.b
            @Override // java.lang.Runnable
            public final void run() {
                RingBackToneErrorView.m37795e(RingBackToneErrorView.this);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m37795e(RingBackToneErrorView ringBackToneErrorView) {
        AbstractC19074t.m100208f(ringBackToneErrorView, "this$0");
        InterfaceC24236c interfaceC24236c = ringBackToneErrorView.f40471q;
        if (interfaceC24236c != null) {
            interfaceC24236c.mo37713Wy(C24239f.f117072a);
        }
    }

    /* renamed from: f */
    private final void m37796f(Context context) {
        C30082v6 m148611c = C30082v6.m148611c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148611c, "inflate(...)");
        this.f40470p = m148611c;
    }

    /* renamed from: c */
    public final void m37797c(String str) {
        AbstractC19074t.m100208f(str, "message");
        C30082v6 c30082v6 = this.f40470p;
        C30082v6 c30082v62 = null;
        if (c30082v6 == null) {
            AbstractC19074t.m100223u("binding");
            c30082v6 = null;
        }
        c30082v6.f139663s.setText(str);
        C30082v6 c30082v63 = this.f40470p;
        if (c30082v63 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30082v62 = c30082v63;
        }
        c30082v62.f139661q.setOnClickListener(new View.OnClickListener() { // from class: pe.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingBackToneErrorView.m37794d(RingBackToneErrorView.this, view);
            }
        });
    }

    public final InterfaceC24236c getListener() {
        return this.f40471q;
    }

    public final void setListener(InterfaceC24236c interfaceC24236c) {
        this.f40471q = interfaceC24236c;
    }

    public RingBackToneErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37796f(context);
    }
}
