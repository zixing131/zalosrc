package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.InterfaceC0998a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0995a();

    /* renamed from: p */
    final boolean f3543p = false;

    /* renamed from: q */
    final Handler f3544q = null;

    /* renamed from: r */
    InterfaceC0998a f3545r;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes2.dex */
    class C0995a implements Parcelable.Creator {
        C0995a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i11) {
            return new ResultReceiver[i11];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes2.dex */
    class BinderC0996b extends InterfaceC0998a.a {
        BinderC0996b() {
        }

        @Override // android.support.v4.os.InterfaceC0998a
        /* renamed from: x2 */
        public void mo4627x2(int i11, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f3544q;
            if (handler != null) {
                handler.post(new RunnableC0997c(i11, bundle));
            } else {
                resultReceiver.mo4515a(i11, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes2.dex */
    class RunnableC0997c implements Runnable {

        /* renamed from: p */
        final int f3547p;

        /* renamed from: q */
        final Bundle f3548q;

        RunnableC0997c(int i11, Bundle bundle) {
            this.f3547p = i11;
            this.f3548q = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo4515a(this.f3547p, this.f3548q);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f3545r = InterfaceC0998a.a.m4628E(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo4515a(int i11, Bundle bundle) {
    }

    /* renamed from: b */
    public void m4624b(int i11, Bundle bundle) {
        if (this.f3543p) {
            Handler handler = this.f3544q;
            if (handler != null) {
                handler.post(new RunnableC0997c(i11, bundle));
                return;
            } else {
                mo4515a(i11, bundle);
                return;
            }
        }
        InterfaceC0998a interfaceC0998a = this.f3545r;
        if (interfaceC0998a != null) {
            try {
                interfaceC0998a.mo4627x2(i11, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        synchronized (this) {
            try {
                if (this.f3545r == null) {
                    this.f3545r = new BinderC0996b();
                }
                parcel.writeStrongBinder(this.f3545r.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
