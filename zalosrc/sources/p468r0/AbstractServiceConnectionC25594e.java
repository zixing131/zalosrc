package p468r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p026b0.InterfaceC2476b;

/* renamed from: r0.e */
/* loaded from: classes2.dex */
public abstract class AbstractServiceConnectionC25594e implements ServiceConnection {

    /* renamed from: p */
    private Context f122370p;

    /* renamed from: r0.e$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC25592c {
        a(InterfaceC2476b interfaceC2476b, ComponentName componentName, Context context) {
            super(interfaceC2476b, componentName, context);
        }
    }

    /* renamed from: a */
    public abstract void mo28105a(ComponentName componentName, AbstractC25592c abstractC25592c);

    /* renamed from: b */
    public void m132195b(Context context) {
        this.f122370p = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f122370p != null) {
            mo28105a(componentName, new a(InterfaceC2476b.a.m12499E(iBinder), componentName, this.f122370p));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
