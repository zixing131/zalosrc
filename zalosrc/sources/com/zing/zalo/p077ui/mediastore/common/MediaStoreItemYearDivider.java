package com.zing.zalo.p077ui.mediastore.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.util.Calendar;

/* loaded from: classes6.dex */
public final class MediaStoreItemYearDivider extends RelativeLayout {

    /* renamed from: p */
    private Context f64247p;

    /* renamed from: q */
    private RobotoTextView f64248q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemYearDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f64247p = context;
    }

    /* renamed from: a */
    public final void m69464a() {
        Object systemService = this.f64247p.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.media_store_item_year_divider_content, this);
        View findViewById = findViewById(AbstractC6918a0.tvYearDivider);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type com.zing.zalo.ui.widget.RobotoTextView");
        this.f64248q = (RobotoTextView) findViewById;
    }

    public final void setYearData(long j11) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            RobotoTextView robotoTextView = this.f64248q;
            if (robotoTextView != null) {
                robotoTextView.setText(String.valueOf(calendar.get(1)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
