package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C4152a();

    /* renamed from: p */
    final int f16485p;

    /* renamed from: q */
    ParcelFileDescriptor f16486q;

    /* renamed from: r */
    final int f16487r;

    /* renamed from: s */
    private Bitmap f16488s = null;

    /* renamed from: t */
    private boolean f16489t = false;

    /* renamed from: u */
    private File f16490u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitmapTeleporter(int i11, ParcelFileDescriptor parcelFileDescriptor, int i12) {
        this.f16485p = i11;
        this.f16486q = parcelFileDescriptor;
        this.f16487r = i12;
    }

    /* renamed from: t */
    private static final void m19590t(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f16486q == null) {
            Bitmap bitmap = (Bitmap) AbstractC4205o.m19722k(this.f16488s);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f16490u;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f16486q = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                            } catch (IOException e11) {
                                throw new IllegalStateException("Could not write into unlinked file", e11);
                            }
                        } finally {
                            m19590t(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e12) {
                    throw new IllegalStateException("Could not create temporary file", e12);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16485p);
        AbstractC2552a.m12932u(parcel, 2, this.f16486q, i11 | 1, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16487r);
        AbstractC2552a.m12913b(parcel, m12912a);
        this.f16486q = null;
    }
}
