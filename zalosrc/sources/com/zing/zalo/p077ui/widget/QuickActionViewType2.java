package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import p716zh.C31862c;

/* loaded from: classes6.dex */
public class QuickActionViewType2 extends RelativeLayout implements InterfaceC13567b1 {

    /* renamed from: p */
    public TextView f69470p;

    /* renamed from: q */
    public TextView f69471q;

    /* renamed from: r */
    public C31862c f69472r;

    /* renamed from: s */
    View f69473s;

    public QuickActionViewType2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m75827e(InterfaceC13567b1.a aVar, C31862c c31862c, View view) {
        if (aVar != null) {
            aVar.mo36332B5(c31862c, c31862c.f146324q, c31862c.f146323p, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m75828f(InterfaceC13567b1.a aVar, C31862c c31862c, View view) {
        if (aVar != null) {
            aVar.mo36332B5(c31862c, c31862c.f146321n, c31862c.f146320m, 1);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(final C31862c c31862c, final InterfaceC13567b1.a aVar) {
        this.f69472r = c31862c;
        if (c31862c != null) {
            if (!TextUtils.isEmpty(c31862c.f146325r)) {
                this.f69470p.setVisibility(0);
                this.f69470p.setText(c31862c.f146325r);
                this.f69470p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.d1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        QuickActionViewType2.m75827e(InterfaceC13567b1.a.this, c31862c, view);
                    }
                });
            } else {
                this.f69470p.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c31862c.f146322o)) {
                this.f69471q.setVisibility(0);
                this.f69471q.setText(c31862c.f146322o);
                this.f69471q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        QuickActionViewType2.m75828f(InterfaceC13567b1.a.this, c31862c, view);
                    }
                });
                return;
            }
            this.f69471q.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69473s;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69470p = (TextView) findViewById(AbstractC6918a0.left_btn);
        this.f69471q = (TextView) findViewById(AbstractC6918a0.right_btn);
        this.f69473s = findViewById(AbstractC6918a0.iv_close);
    }
}
