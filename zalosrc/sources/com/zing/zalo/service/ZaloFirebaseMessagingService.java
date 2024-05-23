package com.zing.zalo.service;

import android.text.TextUtils;
import b30.AbstractC2505a;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.zing.zalo.service.ZaloFirebaseMessagingService;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Map;
import org.json.JSONObject;
import p221hy.C20166b;
import p221hy.InterfaceC20165a;
import p248iy.AbstractC20887g;

/* loaded from: classes4.dex */
public final class ZaloFirebaseMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m50460A(RemoteMessage remoteMessage, ZaloFirebaseMessagingService zaloFirebaseMessagingService) {
        AbstractC19074t.m100208f(remoteMessage, "$remoteMessage");
        AbstractC19074t.m100208f(zaloFirebaseMessagingService, "this$0");
        try {
            if (!remoteMessage.m33755t().containsKey("content")) {
                AbstractC20110a.f98889a.mo104548a("onMessageReceived: without content", new Object[0]);
                return;
            }
            zaloFirebaseMessagingService.m50465y(remoteMessage);
            long m33754M = remoteMessage.m33754M();
            if (m33754M == 0) {
                m33754M = System.currentTimeMillis();
            }
            long j11 = m33754M;
            C20166b m105162b = C20166b.Companion.m105162b();
            InterfaceC20165a.a aVar = InterfaceC20165a.a.f99531p;
            Map m33755t = remoteMessage.m33755t();
            AbstractC19074t.m100207e(m33755t, "getData(...)");
            m105162b.m105155g(aVar, zaloFirebaseMessagingService, m33755t, j11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m50461B(String str, ZaloFirebaseMessagingService zaloFirebaseMessagingService) {
        AbstractC19074t.m100208f(str, "$tokens");
        AbstractC19074t.m100208f(zaloFirebaseMessagingService, "this$0");
        try {
            if (!TextUtils.isEmpty(str)) {
                AbstractC20110a.f98889a.mo104556o(8, "[Firebase] onNewToken: " + str, new Object[0]);
                C20166b.Companion.m105162b().m105156h(InterfaceC20165a.a.f99531p, zaloFirebaseMessagingService, str);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: y */
    private final void m50465y(RemoteMessage remoteMessage) {
        if (remoteMessage.m33753K() != remoteMessage.m33752J()) {
            AbstractC20887g.m109244v(266008, null, 2, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("priority", remoteMessage.m33753K());
            jSONObject.put("originalPriority", remoteMessage.m33752J());
            AbstractC20887g.m109236n(266008, jSONObject.toString(), null, 0, 0L, 0, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m50466z() {
        try {
            C20166b.Companion.m105162b().m105154f(InterfaceC20165a.a.f99531p);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: p */
    public void mo33746p() {
        if (CoreUtility.getAppContext() == null) {
            return;
        }
        AbstractC2505a.m12583b(this, new Runnable() { // from class: q00.l
            @Override // java.lang.Runnable
            public final void run() {
                ZaloFirebaseMessagingService.m50466z();
            }
        });
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: q */
    public void mo33747q(final RemoteMessage remoteMessage) {
        AbstractC19074t.m100208f(remoteMessage, "remoteMessage");
        if (CoreUtility.getAppContext() == null) {
            return;
        }
        AbstractC2505a.m12583b(this, new Runnable() { // from class: q00.n
            @Override // java.lang.Runnable
            public final void run() {
                ZaloFirebaseMessagingService.m50460A(RemoteMessage.this, this);
            }
        });
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: s */
    public void mo33749s(final String str) {
        AbstractC19074t.m100208f(str, "tokens");
        if (CoreUtility.getAppContext() == null) {
            return;
        }
        AbstractC2505a.m12583b(this, new Runnable() { // from class: q00.m
            @Override // java.lang.Runnable
            public final void run() {
                ZaloFirebaseMessagingService.m50461B(str, this);
            }
        });
    }
}
