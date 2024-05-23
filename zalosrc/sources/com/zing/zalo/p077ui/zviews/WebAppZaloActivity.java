package com.zing.zalo.p077ui.zviews;

import android.content.Intent;
import android.os.Bundle;
import com.zing.zalo.activity.ZaloActivity;
import me0.C23212s8;
import p363nh.C23744a;

/* loaded from: classes6.dex */
public class WebAppZaloActivity extends ZaloActivity {
    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            super.onActivityResult(i11, i12, intent);
            C23744a.m124114c().m124116d(134, Integer.valueOf(i11), Integer.valueOf(i12), intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo35579p().m93069k2(ZaloWebView.class, intent.getExtras(), 0, true);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent != null && intent.getExtras() != null) {
                mo35579p().m93069k2(ZaloWebView.class, intent.getExtras(), 0, true);
            } else {
                finish();
            }
        }
        super.onPostCreate(bundle);
    }
}
