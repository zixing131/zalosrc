package com.zing.zalo.p077ui.widget;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import fn0.AbstractC19074t;
import p227i3.C20218v;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p649xl.C29868j4;

/* loaded from: classes6.dex */
public final class HeaderPageContactLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: p */
    private C29868j4 f69311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderPageContactLayout(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m75738a(context);
    }

    /* renamed from: a */
    public final void m75738a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C29868j4 m148109c = C29868j4.m148109c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148109c, "inflate(...)");
        this.f69311p = m148109c;
        C29868j4 c29868j4 = null;
        if (m148109c == null) {
            AbstractC19074t.m100223u("binding");
            m148109c = null;
        }
        m148109c.f138258s.setOnClickListener(this);
        C29868j4 c29868j42 = this.f69311p;
        if (c29868j42 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j42 = null;
        }
        c29868j42.f138256q.setOnClickListener(this);
        C29868j4 c29868j43 = this.f69311p;
        if (c29868j43 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29868j4 = c29868j43;
        }
        c29868j4.f138257r.setOnClickListener(this);
    }

    /* renamed from: b */
    public final void m75739b(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        C29868j4 c29868j4 = this.f69311p;
        C29868j4 c29868j42 = null;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        RobotoTextViewStateAware robotoTextViewStateAware = c29868j4.f138262w;
        boolean z19 = false;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextViewStateAware.setSelected(z11);
        C29868j4 c29868j43 = this.f69311p;
        if (c29868j43 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j43 = null;
        }
        RobotoTextView robotoTextView = c29868j43.f138263x;
        if (i11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        robotoTextView.setSelected(z12);
        C29868j4 c29868j44 = this.f69311p;
        if (c29868j44 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j44 = null;
        }
        LinearLayout linearLayout = c29868j44.f138256q;
        if (i11 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        linearLayout.setSelected(z13);
        C29868j4 c29868j45 = this.f69311p;
        if (c29868j45 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j45 = null;
        }
        RobotoTextViewStateAware robotoTextViewStateAware2 = c29868j45.f138254B;
        if (i11 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        robotoTextViewStateAware2.setSelected(z14);
        C29868j4 c29868j46 = this.f69311p;
        if (c29868j46 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j46 = null;
        }
        RobotoTextView robotoTextView2 = c29868j46.f138265z;
        if (i11 == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        robotoTextView2.setSelected(z15);
        C29868j4 c29868j47 = this.f69311p;
        if (c29868j47 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j47 = null;
        }
        LinearLayout linearLayout2 = c29868j47.f138258s;
        if (i11 == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        linearLayout2.setSelected(z16);
        C29868j4 c29868j48 = this.f69311p;
        if (c29868j48 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j48 = null;
        }
        RobotoTextViewStateAware robotoTextViewStateAware3 = c29868j48.f138253A;
        if (i11 == 2) {
            z17 = true;
        } else {
            z17 = false;
        }
        robotoTextViewStateAware3.setSelected(z17);
        C29868j4 c29868j49 = this.f69311p;
        if (c29868j49 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j49 = null;
        }
        RobotoTextView robotoTextView3 = c29868j49.f138264y;
        if (i11 == 2) {
            z18 = true;
        } else {
            z18 = false;
        }
        robotoTextView3.setSelected(z18);
        C29868j4 c29868j410 = this.f69311p;
        if (c29868j410 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29868j42 = c29868j410;
        }
        LinearLayout linearLayout3 = c29868j42.f138257r;
        if (i11 == 2) {
            z19 = true;
        }
        linearLayout3.setSelected(z19);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        int i14 = 1;
        String str = "21";
        if (id2 == AbstractC6918a0.header_page_all) {
            i11 = C21927m.m114302u().f107790J;
        } else {
            if (id2 == AbstractC6918a0.header_page_new_friend) {
                i11 = C21927m.m114302u().f107793M;
                str = "23";
                i13 = 2;
                i14 = 2;
            } else if (id2 == AbstractC6918a0.header_page_online) {
                C29868j4 c29868j4 = this.f69311p;
                if (c29868j4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29868j4 = null;
                }
                if (c29868j4.f138257r.getVisibility() == 0) {
                    i12 = 3;
                } else {
                    i12 = 2;
                }
                str = "22";
                i13 = i12;
                i11 = C21927m.m114302u().f107794N;
            } else {
                i11 = 0;
            }
            if (C21927m.m114302u().f107791K != i14) {
                if (i14 == 2 && AbstractC23304d.f113337V) {
                    AbstractC23304d.f113337V = false;
                    AbstractC0924m0.m3693bh(false);
                }
                C21927m.m114302u().m114359t0(i14);
                m75739b(i14);
            }
            C0815e1.m2075D().m2095O("1", str, String.valueOf(i13), String.valueOf(i11));
        }
        i13 = 1;
        i14 = 0;
        if (C21927m.m114302u().f107791K != i14) {
        }
        C0815e1.m2075D().m2095O("1", str, String.valueOf(i13), String.valueOf(i11));
    }

    public final void setCountPageAll(int i11) {
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        c29868j4.f138263x.setText(String.valueOf(i11));
    }

    public final void setCountPageNewFriend(int i11) {
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        c29868j4.f138264y.setText(String.valueOf(i11));
    }

    public final void setCountPageOnline(int i11) {
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        c29868j4.f138265z.setText(String.valueOf(i11));
    }

    public final void setEnableCountOnline(boolean z11) {
        int i11;
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        RobotoTextView robotoTextView = c29868j4.f138265z;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setEnablePageNewFriend(boolean z11) {
        int i11;
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        LinearLayout linearLayout = c29868j4.f138257r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    public final void setEnablePageOnline(boolean z11) {
        int i11;
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        LinearLayout linearLayout = c29868j4.f138258s;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    public final void setEnableReddot(boolean z11) {
        C29868j4 c29868j4 = null;
        if (z11) {
            C29868j4 c29868j42 = this.f69311p;
            if (c29868j42 == null) {
                AbstractC19074t.m100223u("binding");
                c29868j42 = null;
            }
            c29868j42.f138260u.setVisibility(0);
            C29868j4 c29868j43 = this.f69311p;
            if (c29868j43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29868j4 = c29868j43;
            }
            c29868j4.f138264y.setVisibility(8);
            return;
        }
        C29868j4 c29868j44 = this.f69311p;
        if (c29868j44 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j44 = null;
        }
        c29868j44.f138260u.setVisibility(8);
        C29868j4 c29868j45 = this.f69311p;
        if (c29868j45 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29868j4 = c29868j45;
        }
        c29868j4.f138264y.setVisibility(0);
    }

    public final void setTextNewFriend(String str) {
        AbstractC19074t.m100208f(str, "text");
        C29868j4 c29868j4 = this.f69311p;
        if (c29868j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29868j4 = null;
        }
        c29868j4.f138253A.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderPageContactLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m75738a(context);
    }
}
