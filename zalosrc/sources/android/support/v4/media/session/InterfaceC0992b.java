package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes2.dex */
public interface InterfaceC0992b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC0992b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32621a implements InterfaceC0992b {

            /* renamed from: p */
            private IBinder f3542p;

            C32621a(IBinder iBinder) {
                this.f3542p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3542p;
            }
        }

        /* renamed from: E */
        public static InterfaceC0992b m4619E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0992b)) {
                return (InterfaceC0992b) queryLocalInterface;
            }
            return new C32621a(iBinder);
        }
    }
}
