package com.zing.zalo.feed.mvp.bottomsheetmenu.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import io.C20643g;

/* loaded from: classes4.dex */
public final class BottomSheetMenuHeaderView extends RelativeLayout {

    /* renamed from: p */
    private RobotoTextView f46163p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuHeaderView(Context context) {
        super(context, null);
        AbstractC19074t.m100208f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.bottom_sheet_menu_header_view, this);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((ViewGroup) inflate).findViewById(AbstractC6918a0.txt_title);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f46163p = (RobotoTextView) findViewById;
    }

    /* renamed from: a */
    public final void m45477a(C20643g c20643g) {
        AbstractC19074t.m100208f(c20643g, "data");
        if (!TextUtils.isEmpty(c20643g.m107584e())) {
            this.f46163p.setText(c20643g.m107584e());
            this.f46163p.setVisibility(0);
        } else {
            this.f46163p.setVisibility(8);
        }
    }

    public final RobotoTextView getTxtTitle() {
        return this.f46163p;
    }

    public final void setTxtTitle(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f46163p = robotoTextView;
    }
}
