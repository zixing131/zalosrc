package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ShareBottomSheet$initializeReceiver$1 extends BaseBroadcastReceiver {

    /* renamed from: e */
    final /* synthetic */ InterfaceC18505l f50481e;

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: b */
    protected IntentFilter mo51933b() {
        return new IntentFilter("com.zing.zalo.shareFeedResultInfo");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        try {
            InterfaceC18505l interfaceC18505l = this.f50481e;
            String stringExtra = intent.getStringExtra("result");
            AbstractC19074t.m100205c(stringExtra);
            boolean z11 = true;
            if (new JSONObject(stringExtra).getInt("send_action") != 1) {
                z11 = false;
            }
            interfaceC18505l.mo205i9(Boolean.valueOf(z11));
        } catch (Exception unused) {
            this.f50481e.mo205i9(Boolean.FALSE);
        }
        mo53687g();
    }
}
