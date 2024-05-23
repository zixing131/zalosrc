package p044c0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c0.a */
/* loaded from: classes2.dex */
public interface InterfaceC3179a extends IInterface {

    /* renamed from: c0.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC3179a {

        /* renamed from: c0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32679a implements InterfaceC3179a {

            /* renamed from: p */
            private IBinder f13413p;

            C32679a(IBinder iBinder) {
                this.f13413p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13413p;
            }
        }

        /* renamed from: E */
        public static InterfaceC3179a m15976E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3179a)) {
                return (InterfaceC3179a) queryLocalInterface;
            }
            return new C32679a(iBinder);
        }
    }
}
