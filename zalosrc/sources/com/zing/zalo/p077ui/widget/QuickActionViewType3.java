package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.C13648i1;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import p354n3.C23528a;
import p716zh.C31862c;

/* loaded from: classes6.dex */
public class QuickActionViewType3 extends RelativeLayout implements InterfaceC13567b1 {

    /* renamed from: p */
    C23528a f69474p;

    /* renamed from: q */
    Context f69475q;

    /* renamed from: r */
    InterfaceC13567b1.a f69476r;

    /* renamed from: s */
    RecyclerView f69477s;

    /* renamed from: t */
    C13648i1 f69478t;

    /* renamed from: u */
    View f69479u;

    /* renamed from: v */
    C31862c f69480v;

    public QuickActionViewType3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69474p = new C23528a(context);
        this.f69475q = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m75830c(C13648i1.a aVar, C31862c.a aVar2) {
        InterfaceC13567b1.a aVar3 = this.f69476r;
        if (aVar3 != null) {
            aVar3.mo36332B5(this.f69480v, aVar2.f146337d, aVar2.f146338e, 1);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(C31862c c31862c, InterfaceC13567b1.a aVar) {
        this.f69480v = c31862c;
        this.f69476r = aVar;
        this.f69478t.m76269M(c31862c.f146330w);
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69479u;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69477s = (RecyclerView) findViewById(AbstractC6918a0.recycler_view);
        this.f69479u = findViewById(AbstractC6918a0.iv_close);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f69475q);
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f69478t = new C13648i1(this.f69474p, new C13648i1.b() { // from class: com.zing.zalo.ui.widget.f1
            @Override // com.zing.zalo.p077ui.widget.C13648i1.b
            /* renamed from: a */
            public final void mo76218a(C13648i1.a aVar, C31862c.a aVar2) {
                QuickActionViewType3.this.m75830c(aVar, aVar2);
            }
        });
        this.f69477s.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        this.f69477s.setAdapter(this.f69478t);
    }
}
