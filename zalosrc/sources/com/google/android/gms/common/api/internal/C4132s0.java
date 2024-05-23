package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.InterfaceC4187i;
import java.util.Map;
import java.util.Set;
import p704z4.C31218b;
import p704z4.InterfaceC31227f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes2.dex */
public final class C4132s0 implements AbstractC4172d.c, InterfaceC31227f0 {

    /* renamed from: a */
    private final C4071a.f f16436a;

    /* renamed from: b */
    private final C31218b f16437b;

    /* renamed from: c */
    private InterfaceC4187i f16438c = null;

    /* renamed from: d */
    private Set f16439d = null;

    /* renamed from: e */
    private boolean f16440e = false;

    /* renamed from: f */
    final /* synthetic */ C4083c f16441f;

    public C4132s0(C4083c c4083c, C4071a.f fVar, C31218b c31218b) {
        this.f16441f = c4083c;
        this.f16436a = fVar;
        this.f16437b = c31218b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m19553h() {
        InterfaceC4187i interfaceC4187i;
        if (this.f16440e && (interfaceC4187i = this.f16438c) != null) {
            this.f16436a.getRemoteService(interfaceC4187i, this.f16439d);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.c
    /* renamed from: a */
    public final void mo19548a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f16441f.f16271E;
        handler.post(new RunnableC4129r0(this, connectionResult));
    }

    @Override // p704z4.InterfaceC31227f0
    /* renamed from: b */
    public final void mo19554b(InterfaceC4187i interfaceC4187i, Set set) {
        if (interfaceC4187i != null && set != null) {
            this.f16438c = interfaceC4187i;
            this.f16439d = set;
            m19553h();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo19555c(new ConnectionResult(4));
        }
    }

    @Override // p704z4.InterfaceC31227f0
    /* renamed from: c */
    public final void mo19555c(ConnectionResult connectionResult) {
        Map map;
        map = this.f16441f.f16267A;
        C4123p0 c4123p0 = (C4123p0) map.get(this.f16437b);
        if (c4123p0 != null) {
            c4123p0.m19533F(connectionResult);
        }
    }
}
