package com.zing.zalo.p077ui.bottomsheet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetLimitFeed;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import ge.C19415g;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import me0.AbstractC23136l9;
import p492rr.C25959b;
import p492rr.C25960c;
import p492rr.C25973p;
import p649xl.C30059u0;
import pm0.C24848g0;
import pm0.C24860q;

/* loaded from: classes5.dex */
public final class BottomSheetLimitFeed extends BottomSheet {

    /* renamed from: b1 */
    public C30059u0 f56211b1;

    /* renamed from: c1 */
    public C19415g f56212c1;

    /* renamed from: d1 */
    private final C25960c f56213d1 = new C25960c();

    /* renamed from: ML */
    private final void m58499ML() {
        C25973p c25973p = C25973p.f123927a;
        C25959b c25959b = C25959b.f123885a;
        int m133790b = c25973p.m133790b(c25959b.m133733b(), c25959b.m133732a());
        Calendar calendar = Calendar.getInstance();
        if (m133790b == 5 && c25959b.m133732a() != 0) {
            calendar.setTimeInMillis(c25959b.m133732a());
        }
        m58505QL(new C19415g(calendar.get(5), calendar.get(2), calendar.get(1)));
        m58502KL().f139525q.init(m58503LL().f96330c, m58503LL().f96329b, m58503LL().f96328a, new DatePicker.OnDateChangedListener() { // from class: e50.k
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i11, int i12, int i13) {
                BottomSheetLimitFeed.m58500NL(BottomSheetLimitFeed.this, datePicker, i11, i12, i13);
            }
        });
        m58502KL().f139525q.setMaxDate(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m58500NL(BottomSheetLimitFeed bottomSheetLimitFeed, DatePicker datePicker, int i11, int i12, int i13) {
        Spanned fromHtml;
        AbstractC19074t.m100208f(bottomSheetLimitFeed, "this$0");
        bottomSheetLimitFeed.m58505QL(new C19415g(i13, i12, i11));
        String format = new SimpleDateFormat("dd/MM/yyyy").format(C25973p.f123927a.m133789a(bottomSheetLimitFeed.m58503LL()).getTime());
        RobotoTextView robotoTextView = bottomSheetLimitFeed.m58502KL().f139526r;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_custom_pick_day_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format2 = String.format(m118743r0, Arrays.copyOf(new Object[]{format}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(format2, 63);
        } else {
            fromHtml = Html.fromHtml(format2);
        }
        robotoTextView.setText(fromHtml);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m58501OL(BottomSheetLimitFeed bottomSheetLimitFeed, View view) {
        AbstractC19074t.m100208f(bottomSheetLimitFeed, "this$0");
        C24860q m133791c = C25973p.f123927a.m133791c(5, bottomSheetLimitFeed.f56213d1.m133740a(bottomSheetLimitFeed.m58503LL()));
        ZaloView m92650VI = bottomSheetLimitFeed.m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_TIME_LIMIT_FEED", ((Number) m133791c.m129216d()).longValue());
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        bottomSheetLimitFeed.close();
    }

    /* renamed from: KL */
    public final C30059u0 m58502KL() {
        C30059u0 c30059u0 = this.f56211b1;
        if (c30059u0 != null) {
            return c30059u0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: LL */
    public final C19415g m58503LL() {
        C19415g c19415g = this.f56212c1;
        if (c19415g != null) {
            return c19415g;
        }
        AbstractC19074t.m100223u("dateInfo");
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        DatePicker datePicker = m58502KL().f139525q;
        AbstractC19074t.m100207e(datePicker, "datePicker");
        return datePicker;
    }

    /* renamed from: PL */
    public final void m58504PL(C30059u0 c30059u0) {
        AbstractC19074t.m100208f(c30059u0, "<set-?>");
        this.f56211b1 = c30059u0;
    }

    /* renamed from: QL */
    public final void m58505QL(C19415g c19415g) {
        AbstractC19074t.m100208f(c19415g, "<set-?>");
        this.f56212c1 = c19415g;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30059u0 m148551c = C30059u0.m148551c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148551c, "inflate(...)");
        m58504PL(m148551c);
        m90525tL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m58502KL().f139527s.setOnClickListener(new View.OnClickListener() { // from class: e50.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetLimitFeed.m58501OL(BottomSheetLimitFeed.this, view);
            }
        });
        m58499ML();
    }
}
