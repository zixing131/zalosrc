package p194h1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: h1.a */
/* loaded from: classes2.dex */
public interface InterfaceC19698a extends IInterface {

    /* renamed from: h1.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC19698a {

        /* renamed from: h1.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32830a implements InterfaceC19698a {

            /* renamed from: p */
            private IBinder f97720p;

            C32830a(IBinder iBinder) {
                this.f97720p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f97720p;
            }
        }

        /* renamed from: E */
        public static InterfaceC19698a m103373E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC19698a)) {
                return (InterfaceC19698a) queryLocalInterface;
            }
            return new C32830a(iBinder);
        }
    }
}
