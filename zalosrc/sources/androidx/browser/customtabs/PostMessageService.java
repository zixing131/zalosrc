package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import p026b0.InterfaceC2475a;
import p026b0.InterfaceC2477c;

/* loaded from: classes2.dex */
public class PostMessageService extends Service {

    /* renamed from: p */
    private InterfaceC2477c.a f4795p = new BinderC1231a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    /* loaded from: classes2.dex */
    class BinderC1231a extends InterfaceC2477c.a {
        BinderC1231a() {
        }

        @Override // p026b0.InterfaceC2477c
        /* renamed from: K3 */
        public void mo5821K3(InterfaceC2475a interfaceC2475a, String str, Bundle bundle) {
            interfaceC2475a.mo12492F4(str, bundle);
        }

        @Override // p026b0.InterfaceC2477c
        /* renamed from: m4 */
        public void mo5822m4(InterfaceC2475a interfaceC2475a, Bundle bundle) {
            interfaceC2475a.mo12493J4(bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4795p;
    }
}
