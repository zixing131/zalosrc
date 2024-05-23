package com.zing.zalo.p077ui;

import android.os.Bundle;
import android.view.Window;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.zviews.NoWebviewInstalledView;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes5.dex */
public final class NoWebviewInstalledActivity extends BaseZaloActivity {
    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119600g(this, false, AbstractC8915g0.ThemeDefault_MP_Dark, AbstractC8915g0.ThemeDefault_MP_Light, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        }
        mo35579p().m93069k2(NoWebviewInstalledView.class, null, 0, true);
    }
}
