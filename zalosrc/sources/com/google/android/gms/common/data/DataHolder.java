package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p031b5.AbstractC2552a;

@KeepName
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C4154c();

    /* renamed from: z */
    private static final C4151a f16491z = new C4153b(new String[0], null);

    /* renamed from: p */
    final int f16492p;

    /* renamed from: q */
    private final String[] f16493q;

    /* renamed from: r */
    Bundle f16494r;

    /* renamed from: s */
    private final CursorWindow[] f16495s;

    /* renamed from: t */
    private final int f16496t;

    /* renamed from: u */
    private final Bundle f16497u;

    /* renamed from: v */
    int[] f16498v;

    /* renamed from: w */
    int f16499w;

    /* renamed from: x */
    boolean f16500x = false;

    /* renamed from: y */
    private boolean f16501y = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* loaded from: classes2.dex */
    public static class C4151a {

        /* renamed from: a */
        private final String[] f16502a;

        /* renamed from: b */
        private final ArrayList f16503b = new ArrayList();

        /* renamed from: c */
        private final HashMap f16504c = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i11, String[] strArr, CursorWindow[] cursorWindowArr, int i12, Bundle bundle) {
        this.f16492p = i11;
        this.f16493q = strArr;
        this.f16495s = cursorWindowArr;
        this.f16496t = i12;
        this.f16497u = bundle;
    }

    /* renamed from: F */
    public int m19591F() {
        return this.f16496t;
    }

    /* renamed from: J */
    public final void m19592J() {
        this.f16494r = new Bundle();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr = this.f16493q;
            if (i12 >= strArr.length) {
                break;
            }
            this.f16494r.putInt(strArr[i12], i12);
            i12++;
        }
        this.f16498v = new int[this.f16495s.length];
        int i13 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f16495s;
            if (i11 < cursorWindowArr.length) {
                this.f16498v[i11] = i13;
                i13 += this.f16495s[i11].getNumRows() - (i13 - cursorWindowArr[i11].getStartPosition());
                i11++;
            } else {
                this.f16499w = i13;
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f16500x) {
                    this.f16500x = true;
                    int i11 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f16495s;
                        if (i11 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i11].close();
                        i11++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f16501y && this.f16495s.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z11;
        synchronized (this) {
            z11 = this.f16500x;
        }
        return z11;
    }

    /* renamed from: t */
    public Bundle m19593t() {
        return this.f16497u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12935x(parcel, 1, this.f16493q, false);
        AbstractC2552a.m12937z(parcel, 2, this.f16495s, i11, false);
        AbstractC2552a.m12924m(parcel, 3, m19591F());
        AbstractC2552a.m12916e(parcel, 4, m19593t(), false);
        AbstractC2552a.m12924m(parcel, 1000, this.f16492p);
        AbstractC2552a.m12913b(parcel, m12912a);
        if ((i11 & 1) != 0) {
            close();
        }
    }
}
