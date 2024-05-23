package com.zing.zalo.p077ui.maintab.msg;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.BatteryOptimizationWarningBottomSheet;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zlottie.widget.C17291a;
import fn0.AbstractC19074t;
import java.io.InputStream;
import me0.AbstractC23136l9;
import mk.C23331i;
import p649xl.C29864j0;

/* loaded from: classes5.dex */
public final class BatteryOptimizationWarningBottomSheet extends BottomSheet implements InterfaceC0733x {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public static final void m68092LL(BatteryOptimizationWarningBottomSheet batteryOptimizationWarningBottomSheet, View view) {
        AbstractC19074t.m100208f(batteryOptimizationWarningBottomSheet, "this$0");
        ZaloWebView.Companion.m87168C(batteryOptimizationWarningBottomSheet.m92676n2(), "https://help.zalo.me/huong-dan/chuyen-muc/nhan-tin-va-goi/khac-phuc-loi-thong-bao-zalo/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ML */
    public static final void m68093ML(BatteryOptimizationWarningBottomSheet batteryOptimizationWarningBottomSheet, View view) {
        AbstractC19074t.m100208f(batteryOptimizationWarningBottomSheet, "this$0");
        C23331i.f113531a.m122737m(batteryOptimizationWarningBottomSheet.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m68094NL(BatteryOptimizationWarningBottomSheet batteryOptimizationWarningBottomSheet, View view) {
        AbstractC19074t.m100208f(batteryOptimizationWarningBottomSheet, "this$0");
        batteryOptimizationWarningBottomSheet.close();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BATTERY_RESTRICT_BTS";
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        String m118743r0;
        InputStream inputStream;
        AssetManager assets;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        C29864j0 m148096c = C29864j0.m148096c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148096c, "inflate(...)");
        if (Build.VERSION.SDK_INT < 31) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_optimized_bottom_sheet_description_below_12);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_optimized_bottom_sheet_description_12_above);
        }
        AbstractC19074t.m100205c(m118743r0);
        m148096c.f138224u.setText(Html.fromHtml(m118743r0));
        m148096c.f138222s.setIdTracking("BATTERY_RESTRICT_BTS_BTN_LEARN_MORE");
        m148096c.f138222s.setOnClickListener(new View.OnClickListener() { // from class: t70.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BatteryOptimizationWarningBottomSheet.m68092LL(BatteryOptimizationWarningBottomSheet.this, view);
            }
        });
        m148096c.f138220q.setIdTracking("BATTERY_RESTRICT_BTS_BTN_ACTION");
        m148096c.f138220q.setOnClickListener(new View.OnClickListener() { // from class: t70.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BatteryOptimizationWarningBottomSheet.m68093ML(BatteryOptimizationWarningBottomSheet.this, view);
            }
        });
        m148096c.f138221r.setIdTracking("BATTERY_RESTRICT_BTS_BTN_REMIND_LATER");
        m148096c.f138221r.setOnClickListener(new View.OnClickListener() { // from class: t70.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BatteryOptimizationWarningBottomSheet.m68094NL(BatteryOptimizationWarningBottomSheet.this, view);
            }
        });
        Context context = getContext();
        if (context != null && (assets = context.getAssets()) != null) {
            inputStream = assets.open("lottiefiles/noti_hot_fix.json");
        } else {
            inputStream = null;
        }
        m148096c.f138223t.setImageDrawable(new C17291a(inputStream, "noti_hot_fix", AbstractC23136l9.m118742r(265.0f), AbstractC23136l9.m118742r(149.0f), false));
        m90533zL(EnumC17017m.HUG_CONTENT);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (!C23331i.f113531a.m122735k(2, getContext())) {
            close();
        }
    }
}
