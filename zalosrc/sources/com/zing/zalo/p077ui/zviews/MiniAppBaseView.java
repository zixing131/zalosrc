package com.zing.zalo.p077ui.zviews;

import android.os.Build;
import android.view.View;
import android.view.Window;
import me0.C23212s8;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class MiniAppBaseView extends SlidableZaloView {
    /* renamed from: gM */
    private final void m81660gM() {
        View view;
        Window window;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (window = m92676n2.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && view != null) {
            if (!C23212s8.m119603k()) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            } else {
                view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
            }
        }
    }

    public String getTrackingKey() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (!(this instanceof MiniAppPopupView)) {
            m81660gM();
        }
    }
}
