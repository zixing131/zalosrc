package p632x4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: x4.a */
/* loaded from: classes2.dex */
public class ServiceConnectionC29315a implements ServiceConnection {

    /* renamed from: p */
    boolean f135801p = false;

    /* renamed from: q */
    private final BlockingQueue f135802q = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m146462a() {
        AbstractC4205o.m19721j("BlockingServiceConnection.getService() called on main thread");
        if (!this.f135801p) {
            this.f135801p = true;
            return (IBinder) this.f135802q.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    /* renamed from: b */
    public IBinder m146463b(long j11, TimeUnit timeUnit) {
        AbstractC4205o.m19721j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f135801p) {
            this.f135801p = true;
            IBinder iBinder = (IBinder) this.f135802q.poll(j11, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f135802q.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
