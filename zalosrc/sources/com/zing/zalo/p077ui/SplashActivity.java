package com.zing.zalo.p077ui;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.SplashActivity;
import com.zing.zalo.startup.StartupActivity;
import fh0.AbstractC18942g;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import mx.C23470g;
import mx.C23476m;
import on0.AbstractC24342w;
import p248iy.AbstractC20887g;
import rh0.AbstractC25803k;

/* loaded from: classes.dex */
public final class SplashActivity extends StartupActivity {
    /* renamed from: d */
    private final boolean m56971d() {
        String m104833H = AbstractC20130d.m104833H(null);
        boolean z11 = false;
        if (TextUtils.isEmpty(m104833H)) {
            return false;
        }
        File file = new File(m104833H + File.separator + "test");
        try {
            z11 = file.createNewFile();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            }
        }
        return z11;
    }

    /* renamed from: e */
    private final boolean m56972e() {
        boolean m127149O;
        String m104833H = AbstractC20130d.m104833H(null);
        if (m104833H != null) {
            m127149O = AbstractC24342w.m127149O(m104833H, "DualApp", false, 2, null);
            return m127149O;
        }
        return false;
    }

    /* renamed from: f */
    private final void m56973f() {
        new AlertDialog.Builder(this).setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_warning)).setMessage(AbstractC23136l9.m118743r0(AbstractC8020f0.str_incompatible_dual_app_mode)).setCancelable(false).setPositiveButton(AbstractC23136l9.m118743r0(AbstractC8020f0.str_i_got_it), new DialogInterface.OnClickListener() { // from class: h40.u1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SplashActivity.m56974g(SplashActivity.this, dialogInterface, i11);
            }
        }).create().show();
        if (!AbstractC0924m0.m3366Qa()) {
            AbstractC20887g.m109244v(21066, null, 2, null);
            AbstractC0924m0.m3874hi(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m56974g(SplashActivity splashActivity, DialogInterface dialogInterface, int i11) {
        AbstractC19074t.m100208f(splashActivity, "this$0");
        splashActivity.m56975h();
    }

    /* renamed from: h */
    private final void m56975h() {
        final Intent intent = getIntent();
        Intent intent2 = new Intent(this, (Class<?>) ZaloLauncherActivity.class);
        if (intent != null) {
            intent2.setAction(intent.getAction());
            intent2.putExtras(intent);
        }
        startActivity(intent2);
        overridePendingTransition(0, 0);
        finish();
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: h40.t1
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.m56976i(intent, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m56976i(Intent intent, SplashActivity splashActivity) {
        AbstractC19074t.m100208f(splashActivity, "this$0");
        try {
            AbstractC18942g.m99258n(intent);
            if (C23476m.m123248f()) {
                C23470g.m123226d(splashActivity.getApplication());
                C23470g.m123225c().m123230b(AbstractC25803k.m132967g());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.startup.StartupActivity, com.zing.zalo.startup.StartupApplication.InterfaceC10902b
    /* renamed from: a */
    public void mo12585a() {
        AbstractC20110a.f98889a.mo104548a("onOpenUiInitialized", new Object[0]);
        if (AbstractC19074t.m100204b(Build.BRAND, "vsmart") && Build.VERSION.SDK_INT >= 30 && m56972e() && AbstractC23034c6.m118121G() && !m56971d()) {
            m56973f();
        } else {
            m56975h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.startup.StartupActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MainApplication.Companion.m35498a(this);
        super.onCreate(bundle);
    }
}
