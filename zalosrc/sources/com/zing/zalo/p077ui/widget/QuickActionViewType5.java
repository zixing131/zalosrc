package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import p716zh.C31862c;
import s00.AbstractC26080o;

/* loaded from: classes6.dex */
public class QuickActionViewType5 extends RelativeLayout implements InterfaceC13567b1, InterfaceC13721r0 {

    /* renamed from: A */
    boolean f69488A;

    /* renamed from: p */
    C31862c f69489p;

    /* renamed from: q */
    LinearLayout f69490q;

    /* renamed from: r */
    RobotoTextView f69491r;

    /* renamed from: s */
    RobotoTextView f69492s;

    /* renamed from: t */
    View f69493t;

    /* renamed from: u */
    InterfaceC13567b1.a f69494u;

    /* renamed from: v */
    InterfaceC13634f2 f69495v;

    /* renamed from: w */
    Handler f69496w;

    /* renamed from: x */
    Runnable f69497x;

    /* renamed from: y */
    long f69498y;

    /* renamed from: z */
    long f69499z;

    /* renamed from: com.zing.zalo.ui.widget.QuickActionViewType5$a */
    /* loaded from: classes6.dex */
    class RunnableC13517a implements Runnable {
        RunnableC13517a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC13634f2 interfaceC13634f2 = QuickActionViewType5.this.f69495v;
            if (interfaceC13634f2 != null) {
                interfaceC13634f2.next();
            }
            QuickActionViewType5.this.f69496w.removeCallbacks(this);
            QuickActionViewType5.this.f69496w.postDelayed(this, 3000L);
            QuickActionViewType5.this.f69498y = System.currentTimeMillis();
        }
    }

    public QuickActionViewType5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69496w = new Handler();
        this.f69497x = new RunnableC13517a();
        this.f69498y = 0L;
        this.f69499z = 0L;
        this.f69488A = false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13721r0
    /* renamed from: a */
    public void mo75831a() {
        if (this.f69488A) {
            m75835g(true);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(C31862c c31862c, InterfaceC13567b1.a aVar) {
        int i11;
        try {
            this.f69489p = c31862c;
            this.f69494u = aVar;
            if (c31862c == null) {
                return;
            }
            this.f69491r.setText(c31862c.f146313f);
            RobotoTextView robotoTextView = this.f69491r;
            int i12 = 8;
            if (!TextUtils.isEmpty(this.f69489p.f146313f)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robotoTextView.setVisibility(i11);
            this.f69492s.setText(this.f69489p.f146314g);
            RobotoTextView robotoTextView2 = this.f69492s;
            if (!TextUtils.isEmpty(this.f69489p.f146314g)) {
                i12 = 0;
            }
            robotoTextView2.setVisibility(i12);
            LinearLayout linearLayout = this.f69490q;
            linearLayout.removeView(linearLayout.findViewById(AbstractC6918a0.slider));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13721r0
    /* renamed from: c */
    public void mo75832c() {
        C31862c c31862c;
        InterfaceC13567b1.a aVar = this.f69494u;
        if (aVar != null && (c31862c = this.f69489p) != null) {
            aVar.mo36332B5(c31862c, c31862c.f146318k, c31862c.f146317j, 1);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13721r0
    /* renamed from: e */
    public void mo75833e() {
        if (!this.f69488A) {
            m75834f(AbstractC26080o.a.f124275b);
        }
    }

    /* renamed from: f */
    void m75834f(int i11) {
    }

    /* renamed from: g */
    void m75835g(boolean z11) {
        long currentTimeMillis;
        this.f69496w.removeCallbacksAndMessages(null);
        if (z11) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.f69498y;
        }
        this.f69499z = currentTimeMillis;
        this.f69498y = 0L;
        this.f69488A = false;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69493t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f69488A) {
            m75835g(false);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69490q = (LinearLayout) findViewById(AbstractC6918a0.layout_action);
        this.f69491r = (RobotoTextView) findViewById(AbstractC6918a0.title);
        this.f69492s = (RobotoTextView) findViewById(AbstractC6918a0.caption);
        this.f69493t = findViewById(AbstractC6918a0.iv_close);
    }

    public void setEnableAutoSliding(boolean z11) {
        if (z11 == this.f69488A) {
            return;
        }
        if (z11) {
            m75834f(3000);
        } else {
            m75835g(false);
        }
    }
}
