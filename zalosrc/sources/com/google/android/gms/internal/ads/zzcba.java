package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p031b5.AbstractC2552a;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class zzcba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcba> CREATOR = new mf0();

    /* renamed from: p */
    ParcelFileDescriptor f31998p;

    /* renamed from: q */
    private Parcelable f31999q = null;

    /* renamed from: r */
    private boolean f32000r = true;

    public zzcba(ParcelFileDescriptor parcelFileDescriptor) {
        this.f31998p = parcelFileDescriptor;
    }

    /* renamed from: t */
    public final SafeParcelable m28717t(Parcelable.Creator creator) {
        if (this.f32000r) {
            if (this.f31998p == null) {
                yk0.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f31998p));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    AbstractC20291l.m105939a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f31999q = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f32000r = false;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (IOException e11) {
                    yk0.zzh("Could not read from parcel file descriptor", e11);
                    AbstractC20291l.m105939a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                AbstractC20291l.m105939a(dataInputStream);
                throw th3;
            }
        }
        return (SafeParcelable) this.f31999q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f31998p == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f31999q.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kf0
                            @Override // java.lang.Runnable
                            public final void run() {
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                Parcelable.Creator<zzcba> creator = zzcba.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            AbstractC20291l.m105939a(dataOutputStream2);
                                        } catch (IOException e11) {
                                            e = e11;
                                            dataOutputStream = dataOutputStream2;
                                            yk0.zzh("Error transporting the ad response", e);
                                            zzt.zzo().m22945t(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                AbstractC20291l.m105939a(outputStream);
                                            } else {
                                                AbstractC20291l.m105939a(dataOutputStream);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                AbstractC20291l.m105939a(outputStream);
                                            } else {
                                                AbstractC20291l.m105939a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e11) {
                        e = e11;
                        yk0.zzh("Error transporting the ad response", e);
                        zzt.zzo().m22945t(e, "LargeParcelTeleporter.pipeData.2");
                        AbstractC20291l.m105939a(autoCloseOutputStream);
                        this.f31998p = parcelFileDescriptor;
                        int m12912a = AbstractC2552a.m12912a(parcel);
                        AbstractC2552a.m12932u(parcel, 2, this.f31998p, i11, false);
                        AbstractC2552a.m12913b(parcel, m12912a);
                    }
                } catch (IOException e12) {
                    e = e12;
                    autoCloseOutputStream = null;
                }
                this.f31998p = parcelFileDescriptor;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        int m12912a2 = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, this.f31998p, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a2);
    }
}
