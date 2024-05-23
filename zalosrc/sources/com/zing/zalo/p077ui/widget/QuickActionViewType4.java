package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C31862c;

/* loaded from: classes6.dex */
public class QuickActionViewType4 extends RelativeLayout implements InterfaceC13567b1 {

    /* renamed from: p */
    public RecyclingImageView f69481p;

    /* renamed from: q */
    public RobotoTextView f69482q;

    /* renamed from: r */
    public RobotoTextView f69483r;

    /* renamed from: s */
    View f69484s;

    /* renamed from: t */
    public Context f69485t;

    /* renamed from: u */
    public C23528a f69486u;

    /* renamed from: v */
    C31862c f69487v;

    public QuickActionViewType4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69485t = context;
        this.f69486u = new C23528a(context);
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(C31862c c31862c, InterfaceC13567b1.a aVar) {
        this.f69487v = c31862c;
        if (c31862c != null) {
            if (!TextUtils.isEmpty(c31862c.f146329v)) {
                this.f69481p.setVisibility(0);
                ((C23528a) this.f69486u.m123612r(this.f69481p)).m123618x(c31862c.f146329v, C23278z2.m120146o0());
            } else {
                this.f69481p.setVisibility(4);
            }
            if (!TextUtils.isEmpty(c31862c.f146313f)) {
                this.f69482q.setText(c31862c.f146313f);
                this.f69482q.setVisibility(0);
            } else {
                this.f69482q.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c31862c.f146314g)) {
                this.f69483r.setText(c31862c.f146314g);
                this.f69483r.setVisibility(0);
            } else {
                this.f69483r.setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69484s;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69481p = (RecyclingImageView) findViewById(AbstractC6918a0.iv_thumb);
        this.f69482q = (RobotoTextView) findViewById(AbstractC6918a0.tv_title);
        this.f69483r = (RobotoTextView) findViewById(AbstractC6918a0.tv_caption);
        this.f69484s = findViewById(AbstractC6918a0.iv_close);
        this.f69482q.setTextStyleBold(true);
    }
}
