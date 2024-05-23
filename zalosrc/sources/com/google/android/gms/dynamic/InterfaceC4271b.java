package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import p538u5.AbstractBinderC27035b;

/* renamed from: com.google.android.gms.dynamic.b */
/* loaded from: classes.dex */
public interface InterfaceC4271b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractBinderC27035b implements InterfaceC4271b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: N */
        public static InterfaceC4271b m19911N(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof InterfaceC4271b) {
                return (InterfaceC4271b) queryLocalInterface;
            }
            return new C4281l(iBinder);
        }
    }
}
