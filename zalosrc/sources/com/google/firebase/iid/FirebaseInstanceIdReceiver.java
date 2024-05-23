package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.AbstractC6612e0;
import com.google.firebase.messaging.C6628l;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.util.concurrent.ExecutionException;
import p342m6.AbstractC22894m;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: g */
    private static Intent m33625g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: b */
    protected int mo19159b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) AbstractC22894m.m117599a(new C6628l(context).m33904i(cloudMessage.m19155t()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: c */
    protected void mo19160c(Context context, Bundle bundle) {
        Intent m33625g = m33625g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (AbstractC6612e0.m33815A(m33625g)) {
            AbstractC6612e0.m33835s(m33625g);
        }
    }
}
