package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import au.AbstractC2379w;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class CustomRelativeLayout extends RelativeLayout {

    /* renamed from: p */
    private final AbstractC2379w.a f69078p;

    /* renamed from: q */
    private int f69079q;

    /* renamed from: r */
    private boolean f69080r;

    /* renamed from: s */
    private InterfaceC13484a f69081s;

    /* renamed from: com.zing.zalo.ui.widget.CustomRelativeLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13484a {
        /* renamed from: Og */
        void mo75644Og(int i11, int i12);

        /* renamed from: n8 */
        void mo75645n8(int i11, int i12);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69078p = new AbstractC2379w.a();
        this.f69079q = 0;
        this.f69080r = false;
    }

    /* renamed from: a */
    private void m75643a() {
        boolean z11;
        AbstractC2379w.m12429c(this, this.f69078p, AbstractC23309i.m122007i5(getContext()));
        AbstractC2379w.a aVar = this.f69078p;
        int i11 = aVar.f9930e;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.f69079q;
        if ((i11 != i12 || !this.f69080r) && z11) {
            this.f69080r = true;
            this.f69079q = i11;
            AbstractC23309i.m120984Gp(i11);
            InterfaceC13484a interfaceC13484a = this.f69081s;
            if (interfaceC13484a != null) {
                interfaceC13484a.mo75645n8(this.f69079q, this.f69078p.f9929d);
                return;
            }
            return;
        }
        if (this.f69080r && !z11) {
            this.f69080r = false;
            InterfaceC13484a interfaceC13484a2 = this.f69081s;
            if (interfaceC13484a2 != null) {
                interfaceC13484a2.mo75644Og(i12, aVar.f9929d);
            }
        }
    }

    public InterfaceC13484a getLayoutChangeListener() {
        return this.f69081s;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m75643a();
    }

    public void setLayoutChangeListener(InterfaceC13484a interfaceC13484a) {
        this.f69081s = interfaceC13484a;
    }
}
