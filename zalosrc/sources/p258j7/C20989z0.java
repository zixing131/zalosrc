package p258j7;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p094d7.InterfaceC17801a;

/* renamed from: j7.z0 */
/* loaded from: classes3.dex */
final class C20989z0 implements InterfaceC17801a {

    /* renamed from: a */
    final /* synthetic */ Activity f102914a;

    public C20989z0(C20950g c20950g, Activity activity) {
        this.f102914a = activity;
    }

    @Override // p094d7.InterfaceC17801a
    /* renamed from: a */
    public final void mo33349a(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        this.f102914a.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }
}
