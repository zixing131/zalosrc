package p026b0;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import p026b0.InterfaceC2475a;

/* renamed from: b0.b */
/* loaded from: classes2.dex */
public interface InterfaceC2476b extends IInterface {

    /* renamed from: b0.b$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC2476b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C32647a implements InterfaceC2476b {

            /* renamed from: q */
            public static InterfaceC2476b f10086q;

            /* renamed from: p */
            private IBinder f10087p;

            C32647a(IBinder iBinder) {
                this.f10087p = iBinder;
            }

            @Override // p026b0.InterfaceC2476b
            /* renamed from: C3 */
            public boolean mo5810C3(long j11) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j11);
                    boolean z11 = false;
                    if (!this.f10087p.transact(2, obtain, obtain2, 0) && a.m12500N() != null) {
                        return a.m12500N().mo5810C3(j11);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z11 = true;
                    }
                    return z11;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p026b0.InterfaceC2476b
            /* renamed from: a4 */
            public boolean mo5817a4(InterfaceC2475a interfaceC2475a, Uri uri, Bundle bundle, List list) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (interfaceC2475a != null) {
                        iBinder = interfaceC2475a.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z11 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.f10087p.transact(4, obtain, obtain2, 0) && a.m12500N() != null) {
                        boolean mo5817a4 = a.m12500N().mo5817a4(interfaceC2475a, uri, bundle, list);
                        obtain2.recycle();
                        obtain.recycle();
                        return mo5817a4;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z11 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10087p;
            }

            @Override // p026b0.InterfaceC2476b
            /* renamed from: c1 */
            public boolean mo5818c1(InterfaceC2475a interfaceC2475a) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (interfaceC2475a != null) {
                        iBinder = interfaceC2475a.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z11 = false;
                    if (!this.f10087p.transact(3, obtain, obtain2, 0) && a.m12500N() != null) {
                        boolean mo5818c1 = a.m12500N().mo5818c1(interfaceC2475a);
                        obtain2.recycle();
                        obtain.recycle();
                        return mo5818c1;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z11 = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // p026b0.InterfaceC2476b
            /* renamed from: m2 */
            public boolean mo5819m2(InterfaceC2475a interfaceC2475a, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (interfaceC2475a != null) {
                        iBinder = interfaceC2475a.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z11 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10087p.transact(10, obtain, obtain2, 0) && a.m12500N() != null) {
                        boolean mo5819m2 = a.m12500N().mo5819m2(interfaceC2475a, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return mo5819m2;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z11 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: E */
        public static InterfaceC2476b m12499E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2476b)) {
                return (InterfaceC2476b) queryLocalInterface;
            }
            return new C32647a(iBinder);
        }

        /* renamed from: N */
        public static InterfaceC2476b m12500N() {
            return C32647a.f10086q;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            Uri uri;
            Uri uri2;
            Uri uri3;
            Uri uri4;
            if (i11 != 1598968902) {
                Bundle bundle = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                Uri uri5 = null;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                switch (i11) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean mo5810C3 = mo5810C3(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5810C3 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean mo5818c1 = mo5818c1(InterfaceC2475a.a.m12497E(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5818c1 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5817a4 = mo5817a4(m12497E, uri, bundle, parcel.createTypedArrayList(Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5817a4 ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle mo5813Q0 = mo5813Q0(readString, bundle8);
                        parcel2.writeNoException();
                        if (mo5813Q0 != null) {
                            parcel2.writeInt(1);
                            mo5813Q0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E2 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5820r3 = mo5820r3(m12497E2, bundle7);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5820r3 ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E3 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5816Z0 = mo5816Z0(m12497E3, uri5);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5816Z0 ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E4 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        int mo5812G4 = mo5812G4(m12497E4, readString2, bundle6);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5812G4);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E5 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5814R0 = mo5814R0(m12497E5, readInt, uri2, bundle5);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5814R0 ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E6 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5819m2 = mo5819m2(m12497E6, bundle4);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5819m2 ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E7 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri3 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5811G1 = mo5811G1(m12497E7, uri3, bundle3);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5811G1 ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        InterfaceC2475a m12497E8 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri4 = null;
                        }
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo5815W3 = mo5815W3(m12497E8, uri4, readInt2, bundle2);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo5815W3 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i11, parcel, parcel2, i12);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
    }

    /* renamed from: C3 */
    boolean mo5810C3(long j11);

    /* renamed from: G1 */
    boolean mo5811G1(InterfaceC2475a interfaceC2475a, Uri uri, Bundle bundle);

    /* renamed from: G4 */
    int mo5812G4(InterfaceC2475a interfaceC2475a, String str, Bundle bundle);

    /* renamed from: Q0 */
    Bundle mo5813Q0(String str, Bundle bundle);

    /* renamed from: R0 */
    boolean mo5814R0(InterfaceC2475a interfaceC2475a, int i11, Uri uri, Bundle bundle);

    /* renamed from: W3 */
    boolean mo5815W3(InterfaceC2475a interfaceC2475a, Uri uri, int i11, Bundle bundle);

    /* renamed from: Z0 */
    boolean mo5816Z0(InterfaceC2475a interfaceC2475a, Uri uri);

    /* renamed from: a4 */
    boolean mo5817a4(InterfaceC2475a interfaceC2475a, Uri uri, Bundle bundle, List list);

    /* renamed from: c1 */
    boolean mo5818c1(InterfaceC2475a interfaceC2475a);

    /* renamed from: m2 */
    boolean mo5819m2(InterfaceC2475a interfaceC2475a, Bundle bundle);

    /* renamed from: r3 */
    boolean mo5820r3(InterfaceC2475a interfaceC2475a, Bundle bundle);
}
