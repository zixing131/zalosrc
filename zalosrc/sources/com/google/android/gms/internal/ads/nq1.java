package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import p229i5.AbstractC20295p;

/* loaded from: classes2.dex */
public final class nq1 {

    /* renamed from: a */
    private Context f25303a;

    /* renamed from: b */
    private PopupWindow f25304b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24976a(Context context, View view) {
        Window window;
        PopupWindow popupWindow;
        if (AbstractC20295p.m105950d() && !AbstractC20295p.m105952f()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            } else {
                window = null;
            }
            if (window != null && window.getDecorView() != null && !((Activity) context).isDestroyed()) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(view, -1, -1);
                popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setClippingEnabled(false);
                yk0.zze("Displaying the 1x1 popup off the screen.");
                try {
                    popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception unused) {
                }
                this.f25304b = popupWindow;
                if (popupWindow == null) {
                    context = null;
                }
                this.f25303a = context;
            }
            popupWindow = null;
            this.f25304b = popupWindow;
            if (popupWindow == null) {
            }
            this.f25303a = context;
        }
    }

    /* renamed from: b */
    public final void m24977b() {
        Context context = this.f25303a;
        if (context != null && this.f25304b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f25304b.isShowing()) {
                this.f25304b.dismiss();
            }
            this.f25303a = null;
            this.f25304b = null;
        }
    }
}
