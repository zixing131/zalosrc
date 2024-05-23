package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: u */
    private static final Queue f36590u = new ArrayDeque(10);

    /* renamed from: l */
    private boolean m33741l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f36590u;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received duplicate message: ");
                sb2.append(str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* renamed from: m */
    private void m33742m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C6618g0.m33858t(extras)) {
            C6618g0 c6618g0 = new C6618g0(extras);
            ExecutorService m33916e = AbstractC6630m.m33916e();
            try {
                if (new C6614f(this, c6618g0, m33916e).m33847a()) {
                    return;
                }
                m33916e.shutdown();
                if (AbstractC6612e0.m33815A(intent)) {
                    AbstractC6612e0.m33836t(intent);
                }
            } finally {
                m33916e.shutdown();
            }
        }
        mo33747q(new RemoteMessage(extras));
    }

    /* renamed from: n */
    private String m33743n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: o */
    private void m33744o(Intent intent) {
        if (!m33741l(intent.getStringExtra("google.message_id"))) {
            m33745u(intent);
        }
    }

    /* renamed from: u */
    private void m33745u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c11 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c11 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c11 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c11 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                mo33746p();
                return;
            case 1:
                AbstractC6612e0.m33838v(intent);
                m33742m(intent);
                return;
            case 2:
                m33750t(m33743n(intent), new SendException(intent.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR)));
                return;
            case 3:
                m33748r(intent.getStringExtra("google.message_id"));
                return;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received message with unknown type: ");
                sb2.append(stringExtra);
                return;
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    /* renamed from: e */
    protected Intent mo33696e(Intent intent) {
        return C6639q0.m33932b().m33934c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    /* renamed from: f */
    public void mo33697f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo33749s(intent.getStringExtra("token"));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown intent action: ");
            sb2.append(intent.getAction());
            return;
        }
        m33744o(intent);
    }

    /* renamed from: p */
    public void mo33746p() {
    }

    /* renamed from: q */
    public void mo33747q(RemoteMessage remoteMessage) {
    }

    /* renamed from: r */
    public void m33748r(String str) {
    }

    /* renamed from: s */
    public void mo33749s(String str) {
    }

    /* renamed from: t */
    public void m33750t(String str, Exception exc) {
    }
}
