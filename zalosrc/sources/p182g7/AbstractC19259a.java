package p182g7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC19259a implements IInterface {

    /* renamed from: p */
    private final IBinder f95758p;

    /* renamed from: q */
    private final String f95759q = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC19259a(IBinder iBinder, String str) {
        this.f95758p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m100968E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f95759q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m100969N(int i11, Parcel parcel) {
        try {
            this.f95758p.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f95758p;
    }
}
