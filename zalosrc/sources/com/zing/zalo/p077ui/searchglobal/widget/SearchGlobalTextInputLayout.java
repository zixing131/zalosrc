package com.zing.zalo.p077ui.searchglobal.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.view.AbstractC1602t;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTextInputLayout;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.zview.AbstractC17450b;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import zl0.AbstractC32234k;

/* loaded from: classes6.dex */
public final class SearchGlobalTextInputLayout extends FrameLayout {

    /* renamed from: p */
    private final ZAppCompatImageView f67512p;

    /* renamed from: q */
    private final EditText f67513q;

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTextInputLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13101a extends AbstractC18391a {

        /* renamed from: p */
        final /* synthetic */ ZAppCompatImageView f67514p;

        C13101a(ZAppCompatImageView zAppCompatImageView) {
            this.f67514p = zAppCompatImageView;
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            ZAppCompatImageView zAppCompatImageView = this.f67514p;
            if (charSequence != null && charSequence.length() > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            zAppCompatImageView.setVisibility(i14);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchGlobalTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m73446b(SearchGlobalTextInputLayout searchGlobalTextInputLayout, View view) {
        AbstractC19074t.m100208f(searchGlobalTextInputLayout, "this$0");
        Editable text = ((ActionEditText) searchGlobalTextInputLayout.f67513q).getText();
        if (text != null && text.length() > 0) {
            searchGlobalTextInputLayout.f67513q.setText("");
            AbstractC2379w.m12434h(searchGlobalTextInputLayout.f67513q);
        }
    }

    public final ZAppCompatImageView getClearTextButton() {
        return this.f67512p;
    }

    public final EditText getSearchEditText() {
        return this.f67513q;
    }

    public /* synthetic */ SearchGlobalTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 32.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m118712h3);
        layoutParams.setMargins(0, m118712h, 0, m118712h);
        layoutParams.addRule(15);
        setLayoutParams(layoutParams);
        setBackgroundResource(AbstractC16803z.search_global_search_bar_bg_r8);
        ActionEditText actionEditText = new ActionEditText(context);
        actionEditText.setId(AbstractC6918a0.edit_text);
        actionEditText.setBackgroundResource(0);
        actionEditText.setEllipsize(TextUtils.TruncateAt.END);
        actionEditText.setImeOptions(2);
        actionEditText.setInputType(589825);
        actionEditText.setMaxLines(1);
        actionEditText.setSingleLine(true);
        actionEditText.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        actionEditText.setHintTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        AbstractC32234k.m155469a(actionEditText, AbstractC16803z.ic_search_global_search_cursor_design);
        actionEditText.setTextSize(0, m118712h2);
        actionEditText.setHint(getResources().getString(AbstractC8020f0.str_search_global_pre_state_main_search_hint));
        actionEditText.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(m118712h3, 0, m118712h3, 0);
        layoutParams2.gravity = 16;
        addView(actionEditText, layoutParams2);
        this.f67513q = actionEditText;
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(context);
        zAppCompatImageView.setImageResource(AbstractC23322a.zds_ic_search_line_16);
        zAppCompatImageView.setColorFilter(C23212s8.m119607o(context, AbstractC16781w.NormalIcon3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118712h(context, 20.0f), AbstractC23136l9.m118712h(context, 20.0f));
        layoutParams3.setMarginStart(AbstractC23136l9.m118712h(context, 6.0f));
        layoutParams3.gravity = 16;
        addView(zAppCompatImageView, layoutParams3);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams4.gravity = AbstractC1602t.m8182b(8388613, getLayoutDirection());
        addView(frameLayout, layoutParams4);
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(context);
        zAppCompatImageView2.setId(AbstractC6918a0.clear_btn);
        zAppCompatImageView2.setImageResource(AbstractC23322a.zds_ic_close_circle_solid_16);
        zAppCompatImageView2.setColorFilter(C23212s8.m119607o(context, AbstractC17450b.NormalIcon2));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(AbstractC23136l9.m118712h(context, 18.0f), AbstractC23136l9.m118712h(context, 18.0f));
        layoutParams5.gravity = 17;
        layoutParams5.setMargins(AbstractC23136l9.m118712h(context, 7.0f), 0, AbstractC23136l9.m118712h(context, 7.0f), 0);
        actionEditText.addTextChangedListener(new C13101a(zAppCompatImageView2));
        zAppCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: ka0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGlobalTextInputLayout.m73446b(SearchGlobalTextInputLayout.this, view);
            }
        });
        frameLayout.addView(zAppCompatImageView2, layoutParams5);
        this.f67512p = zAppCompatImageView2;
    }
}
