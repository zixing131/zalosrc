package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p094d7.InterfaceC17801a;

/* renamed from: com.google.android.play.core.appupdate.k */
/* loaded from: classes3.dex */
final class C6485k implements InterfaceC17801a {

    /* renamed from: a */
    final /* synthetic */ Activity f36289a;

    public C6485k(C6486l c6486l, Activity activity) {
        this.f36289a = activity;
    }

    @Override // p094d7.InterfaceC17801a
    /* renamed from: a */
    public final void mo33349a(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        this.f36289a.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }
}
