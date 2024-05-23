package p568v5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC27530a implements IInterface {

    /* renamed from: p */
    private final IBinder f129502p;

    /* renamed from: q */
    private final String f129503q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC27530a(IBinder iBinder, String str) {
        this.f129502p = iBinder;
        this.f129503q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m140738E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f129503q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m140739N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f129502p.transact(i11, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e11) {
                obtain.recycle();
                throw e11;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public final void m140740Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f129502p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f129502p;
    }
}
