package com.zing.zalo.p077ui.chat.widget.search;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ActionEditText;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes5.dex */
public final class ChatSearchBarView extends LinearLayout implements View.OnClickListener {

    /* renamed from: p */
    private View f61349p;

    /* renamed from: q */
    private View f61350q;

    /* renamed from: r */
    private RobotoTextView f61351r;

    /* renamed from: s */
    private ActionEditText f61352s;

    /* renamed from: t */
    private InterfaceC11796a f61353t;

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatSearchBarView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11796a {
        /* renamed from: a */
        void mo60437a();

        /* renamed from: m */
        void mo60438m();
    }

    public ChatSearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m65606a() {
        View findViewById = findViewById(AbstractC6918a0.btn_search_back);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f61349p = findViewById;
        View view = null;
        if (findViewById == null) {
            AbstractC19074t.m100223u("mButtonBack");
            findViewById = null;
        }
        findViewById.setOnClickListener(this);
        View findViewById2 = findViewById(AbstractC6918a0.chat_search_clear_btn);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f61350q = findViewById2;
        if (findViewById2 == null) {
            AbstractC19074t.m100223u("mClearSearchBtn");
        } else {
            view = findViewById2;
        }
        view.setOnClickListener(this);
        View findViewById3 = findViewById(AbstractC6918a0.from_sender_search_tv);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f61351r = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC6918a0.chat_search_edittext);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f61352s = (ActionEditText) findViewById4;
    }

    /* renamed from: b */
    public final void m65607b(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f61351r;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("mFromSenderSearchTv");
            robotoTextView = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC11796a interfaceC11796a;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.btn_search_back;
        if (num != null && num.intValue() == i11) {
            InterfaceC11796a interfaceC11796a2 = this.f61353t;
            if (interfaceC11796a2 != null) {
                interfaceC11796a2.mo60438m();
                return;
            }
            return;
        }
        int i12 = AbstractC6918a0.chat_search_clear_btn;
        if (num != null && num.intValue() == i12 && (interfaceC11796a = this.f61353t) != null) {
            interfaceC11796a.mo60437a();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m65606a();
    }

    public final void setBtnClearSearchVisible(int i11) {
        View view = this.f61350q;
        if (view == null) {
            AbstractC19074t.m100223u("mClearSearchBtn");
            view = null;
        }
        view.setVisibility(i11);
    }

    public final void setFromSenderSearchName(String str) {
        AbstractC19074t.m100208f(str, "sender");
        RobotoTextView robotoTextView = this.f61351r;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("mFromSenderSearchTv");
            robotoTextView = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_searchbar_from_sender));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor)), length, spannableStringBuilder.length(), 33);
        robotoTextView.setText(spannableStringBuilder);
    }

    public final void setListener(InterfaceC11796a interfaceC11796a) {
        this.f61353t = interfaceC11796a;
    }

    public final void setPlaceholderSearchEditText(String str) {
        AbstractC19074t.m100208f(str, "placeholder");
        ActionEditText actionEditText = this.f61352s;
        if (actionEditText == null) {
            AbstractC19074t.m100223u("mSearchEditText");
            actionEditText = null;
        }
        actionEditText.setHint(str);
    }
}
