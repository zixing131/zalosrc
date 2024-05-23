package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C31862c;

/* loaded from: classes6.dex */
public class QuickActionViewType1 extends RelativeLayout implements InterfaceC13567b1 {

    /* renamed from: p */
    public AvatarImageView f69460p;

    /* renamed from: q */
    public TextView f69461q;

    /* renamed from: r */
    public TextView f69462r;

    /* renamed from: s */
    public TextView f69463s;

    /* renamed from: t */
    public View f69464t;

    /* renamed from: u */
    public boolean f69465u;

    /* renamed from: v */
    public View f69466v;

    /* renamed from: w */
    public Context f69467w;

    /* renamed from: x */
    public C23528a f69468x;

    /* renamed from: y */
    public C31862c f69469y;

    public QuickActionViewType1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69465u = false;
        this.f69467w = context;
        this.f69468x = new C23528a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m75822c(InterfaceC13567b1.a aVar, C31862c c31862c, View view) {
        if (aVar != null) {
            aVar.mo36332B5(c31862c, c31862c.f146321n, c31862c.f146320m, 1);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(final C31862c c31862c, final InterfaceC13567b1.a aVar) {
        this.f69469y = c31862c;
        if (c31862c != null) {
            if (!TextUtils.isEmpty(c31862c.f146312e)) {
                this.f69460p.setVisibility(0);
                ((C23528a) this.f69468x.m123612r(this.f69460p)).m123618x(c31862c.f146312e, C23278z2.m120146o0());
            } else {
                this.f69460p.setVisibility(4);
            }
            if (!TextUtils.isEmpty(c31862c.f146313f)) {
                this.f69461q.setText(c31862c.f146313f);
                this.f69461q.setVisibility(0);
            } else {
                this.f69461q.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c31862c.f146314g)) {
                this.f69462r.setText(c31862c.f146314g);
                this.f69462r.setVisibility(0);
                this.f69461q.setMaxLines(1);
            } else {
                this.f69462r.setVisibility(8);
                this.f69461q.setMaxLines(2);
            }
            if (!TextUtils.isEmpty(c31862c.f146322o)) {
                this.f69463s.setVisibility(0);
                this.f69463s.setText(c31862c.f146322o);
                this.f69463s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.c1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        QuickActionViewType1.m75822c(InterfaceC13567b1.a.this, c31862c, view);
                    }
                });
                return;
            }
            this.f69463s.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69464t;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69460p = (AvatarImageView) findViewById(AbstractC6918a0.imv_icon);
        this.f69461q = (TextView) findViewById(AbstractC6918a0.tv_title);
        this.f69462r = (TextView) findViewById(AbstractC6918a0.tv_description);
        this.f69463s = (TextView) findViewById(AbstractC6918a0.btn_action);
        this.f69466v = findViewById(AbstractC6918a0.separate_line);
        this.f69464t = findViewById(AbstractC6918a0.iv_close);
    }
}
