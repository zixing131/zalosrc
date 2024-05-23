package p026b0;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b0.a */
/* loaded from: classes2.dex */
public interface InterfaceC2475a extends IInterface {

    /* renamed from: b0.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC2475a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C32646a implements InterfaceC2475a {

            /* renamed from: q */
            public static InterfaceC2475a f10084q;

            /* renamed from: p */
            private IBinder f10085p;

            C32646a(IBinder iBinder) {
                this.f10085p = iBinder;
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: D1 */
            public void mo12491D1(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(3, obtain, obtain2, 0) && a.m12498N() != null) {
                        a.m12498N().mo12491D1(str, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: F4 */
            public void mo12492F4(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(5, obtain, obtain2, 0) && a.m12498N() != null) {
                        a.m12498N().mo12492F4(str, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: J4 */
            public void mo12493J4(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(4, obtain, obtain2, 0) && a.m12498N() != null) {
                        a.m12498N().mo12493J4(bundle);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: L4 */
            public void mo12494L4(int i11, Uri uri, boolean z11, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i11);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z11 ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(6, obtain, obtain2, 0) && a.m12498N() != null) {
                        a.m12498N().mo12494L4(i11, uri, z11, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: O0 */
            public Bundle mo12495O0(String str, Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(7, obtain, obtain2, 0) && a.m12498N() != null) {
                        Bundle mo12495O0 = a.m12498N().mo12495O0(str, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return mo12495O0;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10085p;
            }

            @Override // p026b0.InterfaceC2475a
            /* renamed from: r4 */
            public void mo12496r4(int i11, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i11);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10085p.transact(2, obtain, obtain2, 0) && a.m12498N() != null) {
                        a.m12498N().mo12496r4(i11, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: E */
        public static InterfaceC2475a m12497E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2475a)) {
                return (InterfaceC2475a) queryLocalInterface;
            }
            return new C32646a(iBinder);
        }

        /* renamed from: N */
        public static InterfaceC2475a m12498N() {
            return C32646a.f10084q;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            Uri uri;
            if (i11 != 1598968902) {
                boolean z11 = false;
                Bundle bundle = null;
                switch (i11) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo12496r4(readInt, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo12491D1(readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo12493J4(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo12492F4(readString2, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            z11 = true;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo12494L4(readInt2, uri, z11, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle mo12495O0 = mo12495O0(readString3, bundle);
                        parcel2.writeNoException();
                        if (mo12495O0 != null) {
                            parcel2.writeInt(1);
                            mo12495O0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i11, parcel, parcel2, i12);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }

    /* renamed from: D1 */
    void mo12491D1(String str, Bundle bundle);

    /* renamed from: F4 */
    void mo12492F4(String str, Bundle bundle);

    /* renamed from: J4 */
    void mo12493J4(Bundle bundle);

    /* renamed from: L4 */
    void mo12494L4(int i11, Uri uri, boolean z11, Bundle bundle);

    /* renamed from: O0 */
    Bundle mo12495O0(String str, Bundle bundle);

    /* renamed from: r4 */
    void mo12496r4(int i11, Bundle bundle);
}
