package vg;

import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.service.ZaloBackgroundService;
import ho0.AbstractC20110a;

/* renamed from: vg.j8 */
/* loaded from: classes.dex */
public abstract class AbstractC28105j8 {
    /* renamed from: c */
    public static void m141581c() {
        if (Build.VERSION.SDK_INT >= 26 && !ZaloLauncherActivity.m57091m6()) {
            return;
        }
        AbstractC0777e.m1935a("checkToStartZaloService");
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: vg.i8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28105j8.m141582d();
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ void m141582d() {
        try {
            if ((Build.VERSION.SDK_INT < 26 || ZaloLauncherActivity.m57091m6()) && !ZaloBackgroundService.m50458i(MainApplication.getAppContext())) {
                Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloBackgroundService.class);
                intent.setAction("com.zing.zalo.intent.action.PICK_SERVICE");
                MainApplication.getAppContext().startService(intent);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m141583e(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26 && !ZaloLauncherActivity.m57091m6()) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) ZaloBackgroundService.class);
            intent.setAction("com.zing.zalo.intent.action.PICK_SERVICE");
            context.startService(intent);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    public static void m141584f(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !ZaloLauncherActivity.m57091m6()) {
            return;
        }
        AbstractC0777e.m1935a("startZaloService");
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.h8

            /* renamed from: p */
            public final /* synthetic */ Context f131013p;

            public /* synthetic */ RunnableC28085h8(Context context2) {
                r1 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28105j8.m141583e(r1);
            }
        });
    }
}
