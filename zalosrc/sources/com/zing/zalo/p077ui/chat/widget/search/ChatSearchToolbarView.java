package com.zing.zalo.p077ui.chat.widget.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class ChatSearchToolbarView extends LinearLayout implements View.OnClickListener {

    /* renamed from: p */
    private RedDotImageView f61354p;

    /* renamed from: q */
    private RobotoTextView f61355q;

    /* renamed from: r */
    private View f61356r;

    /* renamed from: s */
    private View f61357s;

    /* renamed from: t */
    private InterfaceC11797a f61358t;

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatSearchToolbarView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11797a {
        /* renamed from: a */
        void mo60409a();

        /* renamed from: b */
        void mo60410b();

        /* renamed from: c */
        void mo60411c();
    }

    public ChatSearchToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m65608a() {
        View findViewById = findViewById(AbstractC6918a0.icn_search_by_sender);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f61354p = (RedDotImageView) findViewById;
        getMBtnOpenSearchBySender().setRightRedDot(true);
        getMBtnOpenSearchBySender().setRedDotMarginLeft(0);
        getMBtnOpenSearchBySender().setRedDotMarginTop(0);
        getMBtnOpenSearchBySender().setOnClickListener(this);
        View findViewById2 = findViewById(AbstractC6918a0.search_result_position_tv);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f61355q = (RobotoTextView) findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.chat_search_up_btn);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f61356r = findViewById3;
        View view = null;
        if (findViewById3 == null) {
            AbstractC19074t.m100223u("mSearchBtnUp");
            findViewById3 = null;
        }
        findViewById3.setOnClickListener(this);
        View findViewById4 = findViewById(AbstractC6918a0.chat_search_down_btn);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f61357s = findViewById4;
        if (findViewById4 == null) {
            AbstractC19074t.m100223u("mSearchBtnDown");
        } else {
            view = findViewById4;
        }
        view.setOnClickListener(this);
    }

    /* renamed from: b */
    public final void m65609b(boolean z11, boolean z12) {
        View view = this.f61356r;
        View view2 = null;
        if (view == null) {
            AbstractC19074t.m100223u("mSearchBtnUp");
            view = null;
        }
        view.setEnabled(z11);
        View view3 = this.f61357s;
        if (view3 == null) {
            AbstractC19074t.m100223u("mSearchBtnDown");
        } else {
            view2 = view3;
        }
        view2.setEnabled(z12);
    }

    /* renamed from: c */
    public final void m65610c(boolean z11) {
        int i11;
        RedDotImageView mBtnOpenSearchBySender = getMBtnOpenSearchBySender();
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        mBtnOpenSearchBySender.setVisibility(i11);
    }

    public final RedDotImageView getMBtnOpenSearchBySender() {
        RedDotImageView redDotImageView = this.f61354p;
        if (redDotImageView != null) {
            return redDotImageView;
        }
        AbstractC19074t.m100223u("mBtnOpenSearchBySender");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC11797a interfaceC11797a;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.icn_search_by_sender;
        if (num != null && num.intValue() == i11) {
            InterfaceC11797a interfaceC11797a2 = this.f61358t;
            if (interfaceC11797a2 != null) {
                interfaceC11797a2.mo60411c();
                return;
            }
            return;
        }
        int i12 = AbstractC6918a0.chat_search_up_btn;
        if (num != null && num.intValue() == i12) {
            InterfaceC11797a interfaceC11797a3 = this.f61358t;
            if (interfaceC11797a3 != null) {
                interfaceC11797a3.mo60410b();
                return;
            }
            return;
        }
        int i13 = AbstractC6918a0.chat_search_down_btn;
        if (num != null && num.intValue() == i13 && (interfaceC11797a = this.f61358t) != null) {
            interfaceC11797a.mo60409a();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m65608a();
    }

    public final void setListener(InterfaceC11797a interfaceC11797a) {
        AbstractC19074t.m100208f(interfaceC11797a, "listener");
        this.f61358t = interfaceC11797a;
    }

    public final void setSearchResultPostion(String str) {
        AbstractC19074t.m100208f(str, "text");
        RobotoTextView robotoTextView = this.f61355q;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("mSearchResultPosition");
            robotoTextView = null;
        }
        robotoTextView.setText(str);
    }
}
