package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import bo.C2948a3;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;

/* loaded from: classes4.dex */
public class ProfileMediaItemYearDivider extends RelativeLayout {

    /* renamed from: p */
    private final Context f45091p;

    /* renamed from: q */
    private RobotoTextView f45092q;

    /* renamed from: r */
    private View f45093r;

    public ProfileMediaItemYearDivider(Context context) {
        super(context);
        this.f45091p = context;
    }

    /* renamed from: a */
    public void m44473a(C2948a3 c2948a3) {
        RobotoTextView robotoTextView = this.f45092q;
        if (robotoTextView != null) {
            robotoTextView.setText(c2948a3.m13956b());
            this.f45092q.setTextColor(c2948a3.m13957c());
        }
        View view = this.f45093r;
        if (view != null) {
            view.setBackgroundColor(c2948a3.m13955a());
        }
    }

    /* renamed from: b */
    public void m44474b() {
        ((LayoutInflater) this.f45091p.getSystemService("layout_inflater")).inflate(AbstractC7409c0.media_store_item_year_divider_content, this);
        this.f45092q = (RobotoTextView) findViewById(AbstractC6918a0.tvYearDivider);
        this.f45093r = findViewById(AbstractC6918a0.feedItemTimeBar);
    }

    public ProfileMediaItemYearDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45091p = context;
    }
}
