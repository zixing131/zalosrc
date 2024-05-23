package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzasw implements Parcelable {
    public static final Parcelable.Creator<zzasw> CREATOR = new C4612ih();

    /* renamed from: A */
    public final float f31815A;

    /* renamed from: B */
    public final int f31816B;

    /* renamed from: C */
    public final float f31817C;

    /* renamed from: D */
    public final int f31818D;

    /* renamed from: E */
    public final byte[] f31819E;

    /* renamed from: F */
    public final zzbau f31820F;

    /* renamed from: G */
    public final int f31821G;

    /* renamed from: H */
    public final int f31822H;

    /* renamed from: I */
    public final int f31823I;

    /* renamed from: J */
    public final int f31824J;

    /* renamed from: K */
    public final int f31825K;

    /* renamed from: L */
    public final long f31826L;

    /* renamed from: M */
    public final int f31827M;

    /* renamed from: N */
    public final String f31828N;

    /* renamed from: O */
    public final int f31829O;

    /* renamed from: P */
    private int f31830P;

    /* renamed from: p */
    public final String f31831p;

    /* renamed from: q */
    public final int f31832q;

    /* renamed from: r */
    public final String f31833r;

    /* renamed from: s */
    public final zzaxh f31834s;

    /* renamed from: t */
    public final String f31835t;

    /* renamed from: u */
    public final String f31836u;

    /* renamed from: v */
    public final int f31837v;

    /* renamed from: w */
    public final List f31838w;

    /* renamed from: x */
    public final zzauv f31839x;

    /* renamed from: y */
    public final int f31840y;

    /* renamed from: z */
    public final int f31841z;

    public zzasw(Parcel parcel) {
        this.f31831p = parcel.readString();
        this.f31835t = parcel.readString();
        this.f31836u = parcel.readString();
        this.f31833r = parcel.readString();
        this.f31832q = parcel.readInt();
        this.f31837v = parcel.readInt();
        this.f31840y = parcel.readInt();
        this.f31841z = parcel.readInt();
        this.f31815A = parcel.readFloat();
        this.f31816B = parcel.readInt();
        this.f31817C = parcel.readFloat();
        this.f31819E = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f31818D = parcel.readInt();
        this.f31820F = (zzbau) parcel.readParcelable(zzbau.class.getClassLoader());
        this.f31821G = parcel.readInt();
        this.f31822H = parcel.readInt();
        this.f31823I = parcel.readInt();
        this.f31824J = parcel.readInt();
        this.f31825K = parcel.readInt();
        this.f31827M = parcel.readInt();
        this.f31828N = parcel.readString();
        this.f31829O = parcel.readInt();
        this.f31826L = parcel.readLong();
        int readInt = parcel.readInt();
        this.f31838w = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f31838w.add(parcel.createByteArray());
        }
        this.f31839x = (zzauv) parcel.readParcelable(zzauv.class.getClassLoader());
        this.f31834s = (zzaxh) parcel.readParcelable(zzaxh.class.getClassLoader());
    }

    /* renamed from: g */
    public static zzasw m28679g(String str, String str2, String str3, int i11, int i12, int i13, int i14, List list, zzauv zzauvVar, int i15, String str4) {
        return m28680h(str, str2, null, -1, -1, i13, i14, -1, -1, -1, null, zzauvVar, 0, str4, null);
    }

    /* renamed from: h */
    public static zzasw m28680h(String str, String str2, String str3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list, zzauv zzauvVar, int i18, String str4, zzaxh zzaxhVar) {
        return new zzasw(str, null, str2, null, -1, i12, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i13, i14, i15, -1, -1, i18, str4, -1, Long.MAX_VALUE, list, zzauvVar, null);
    }

    /* renamed from: i */
    public static zzasw m28681i(String str, String str2, String str3, int i11, List list, String str4, zzauv zzauvVar) {
        return new zzasw(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzauvVar, null);
    }

    /* renamed from: j */
    public static zzasw m28682j(String str, String str2, String str3, int i11, zzauv zzauvVar) {
        return new zzasw(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzauvVar, null);
    }

    /* renamed from: k */
    public static zzasw m28683k(String str, String str2, String str3, int i11, int i12, String str4, int i13, zzauv zzauvVar, long j11, List list) {
        return new zzasw(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i12, str4, -1, j11, list, zzauvVar, null);
    }

    /* renamed from: l */
    public static zzasw m28684l(String str, String str2, String str3, int i11, int i12, int i13, int i14, float f11, List list, int i15, float f12, byte[] bArr, int i16, zzbau zzbauVar, zzauv zzauvVar) {
        return new zzasw(str, null, str2, null, -1, i12, i13, i14, -1.0f, i15, f12, bArr, i16, zzbauVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzauvVar, null);
    }

    /* renamed from: m */
    private static void m28685m(MediaFormat mediaFormat, String str, int i11) {
        if (i11 != -1) {
            mediaFormat.setInteger(str, i11);
        }
    }

    /* renamed from: a */
    public final int m28686a() {
        int i11;
        int i12 = this.f31840y;
        if (i12 == -1 || (i11 = this.f31841z) == -1) {
            return -1;
        }
        return i12 * i11;
    }

    /* renamed from: b */
    public final MediaFormat m28687b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f31836u);
        String str = this.f31828N;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m28685m(mediaFormat, "max-input-size", this.f31837v);
        m28685m(mediaFormat, "width", this.f31840y);
        m28685m(mediaFormat, "height", this.f31841z);
        float f11 = this.f31815A;
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        m28685m(mediaFormat, "rotation-degrees", this.f31816B);
        m28685m(mediaFormat, "channel-count", this.f31821G);
        m28685m(mediaFormat, "sample-rate", this.f31822H);
        m28685m(mediaFormat, "encoder-delay", this.f31824J);
        m28685m(mediaFormat, "encoder-padding", this.f31825K);
        for (int i11 = 0; i11 < this.f31838w.size(); i11++) {
            mediaFormat.setByteBuffer("csd-" + i11, ByteBuffer.wrap((byte[]) this.f31838w.get(i11)));
        }
        zzbau zzbauVar = this.f31820F;
        if (zzbauVar != null) {
            m28685m(mediaFormat, "color-transfer", zzbauVar.f31870r);
            m28685m(mediaFormat, "color-standard", zzbauVar.f31868p);
            m28685m(mediaFormat, "color-range", zzbauVar.f31869q);
            byte[] bArr = zzbauVar.f31871s;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    public final zzasw m28688c(zzauv zzauvVar) {
        return new zzasw(this.f31831p, this.f31835t, this.f31836u, this.f31833r, this.f31832q, this.f31837v, this.f31840y, this.f31841z, this.f31815A, this.f31816B, this.f31817C, this.f31819E, this.f31818D, this.f31820F, this.f31821G, this.f31822H, this.f31823I, this.f31824J, this.f31825K, this.f31827M, this.f31828N, this.f31829O, this.f31826L, this.f31838w, zzauvVar, this.f31834s);
    }

    /* renamed from: d */
    public final zzasw m28689d(int i11, int i12) {
        return new zzasw(this.f31831p, this.f31835t, this.f31836u, this.f31833r, this.f31832q, this.f31837v, this.f31840y, this.f31841z, this.f31815A, this.f31816B, this.f31817C, this.f31819E, this.f31818D, this.f31820F, this.f31821G, this.f31822H, this.f31823I, i11, i12, this.f31827M, this.f31828N, this.f31829O, this.f31826L, this.f31838w, this.f31839x, this.f31834s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzasw m28690e(int i11) {
        return new zzasw(this.f31831p, this.f31835t, this.f31836u, this.f31833r, this.f31832q, i11, this.f31840y, this.f31841z, this.f31815A, this.f31816B, this.f31817C, this.f31819E, this.f31818D, this.f31820F, this.f31821G, this.f31822H, this.f31823I, this.f31824J, this.f31825K, this.f31827M, this.f31828N, this.f31829O, this.f31826L, this.f31838w, this.f31839x, this.f31834s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzasw.class == obj.getClass()) {
            zzasw zzaswVar = (zzasw) obj;
            if (this.f31832q == zzaswVar.f31832q && this.f31837v == zzaswVar.f31837v && this.f31840y == zzaswVar.f31840y && this.f31841z == zzaswVar.f31841z && this.f31815A == zzaswVar.f31815A && this.f31816B == zzaswVar.f31816B && this.f31817C == zzaswVar.f31817C && this.f31818D == zzaswVar.f31818D && this.f31821G == zzaswVar.f31821G && this.f31822H == zzaswVar.f31822H && this.f31823I == zzaswVar.f31823I && this.f31824J == zzaswVar.f31824J && this.f31825K == zzaswVar.f31825K && this.f31826L == zzaswVar.f31826L && this.f31827M == zzaswVar.f31827M && AbstractC4916qo.m25839o(this.f31831p, zzaswVar.f31831p) && AbstractC4916qo.m25839o(this.f31828N, zzaswVar.f31828N) && this.f31829O == zzaswVar.f31829O && AbstractC4916qo.m25839o(this.f31835t, zzaswVar.f31835t) && AbstractC4916qo.m25839o(this.f31836u, zzaswVar.f31836u) && AbstractC4916qo.m25839o(this.f31833r, zzaswVar.f31833r) && AbstractC4916qo.m25839o(this.f31839x, zzaswVar.f31839x) && AbstractC4916qo.m25839o(this.f31834s, zzaswVar.f31834s) && AbstractC4916qo.m25839o(this.f31820F, zzaswVar.f31820F) && Arrays.equals(this.f31819E, zzaswVar.f31819E) && this.f31838w.size() == zzaswVar.f31838w.size()) {
                for (int i11 = 0; i11 < this.f31838w.size(); i11++) {
                    if (!Arrays.equals((byte[]) this.f31838w.get(i11), (byte[]) zzaswVar.f31838w.get(i11))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final zzasw m28691f(zzaxh zzaxhVar) {
        return new zzasw(this.f31831p, this.f31835t, this.f31836u, this.f31833r, this.f31832q, this.f31837v, this.f31840y, this.f31841z, this.f31815A, this.f31816B, this.f31817C, this.f31819E, this.f31818D, this.f31820F, this.f31821G, this.f31822H, this.f31823I, this.f31824J, this.f31825K, this.f31827M, this.f31828N, this.f31829O, this.f31826L, this.f31838w, this.f31839x, zzaxhVar);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i11 = this.f31830P;
        if (i11 == 0) {
            String str = this.f31831p;
            int i12 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i13 = (hashCode + 527) * 31;
            String str2 = this.f31835t;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i14 = (i13 + hashCode2) * 31;
            String str3 = this.f31836u;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            String str4 = this.f31833r;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i16 = (((((((((((i15 + hashCode4) * 31) + this.f31832q) * 31) + this.f31840y) * 31) + this.f31841z) * 31) + this.f31821G) * 31) + this.f31822H) * 31;
            String str5 = this.f31828N;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (((i16 + hashCode5) * 31) + this.f31829O) * 31;
            zzauv zzauvVar = this.f31839x;
            if (zzauvVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = zzauvVar.hashCode();
            }
            int i18 = (i17 + hashCode6) * 31;
            zzaxh zzaxhVar = this.f31834s;
            if (zzaxhVar != null) {
                i12 = zzaxhVar.hashCode();
            }
            int i19 = i18 + i12;
            this.f31830P = i19;
            return i19;
        }
        return i11;
    }

    public final String toString() {
        return "Format(" + this.f31831p + ", " + this.f31835t + ", " + this.f31836u + ", " + this.f31832q + ", " + this.f31828N + ", [" + this.f31840y + ", " + this.f31841z + ", " + this.f31815A + "], [" + this.f31821G + ", " + this.f31822H + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12;
        parcel.writeString(this.f31831p);
        parcel.writeString(this.f31835t);
        parcel.writeString(this.f31836u);
        parcel.writeString(this.f31833r);
        parcel.writeInt(this.f31832q);
        parcel.writeInt(this.f31837v);
        parcel.writeInt(this.f31840y);
        parcel.writeInt(this.f31841z);
        parcel.writeFloat(this.f31815A);
        parcel.writeInt(this.f31816B);
        parcel.writeFloat(this.f31817C);
        if (this.f31819E != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        parcel.writeInt(i12);
        byte[] bArr = this.f31819E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f31818D);
        parcel.writeParcelable(this.f31820F, i11);
        parcel.writeInt(this.f31821G);
        parcel.writeInt(this.f31822H);
        parcel.writeInt(this.f31823I);
        parcel.writeInt(this.f31824J);
        parcel.writeInt(this.f31825K);
        parcel.writeInt(this.f31827M);
        parcel.writeString(this.f31828N);
        parcel.writeInt(this.f31829O);
        parcel.writeLong(this.f31826L);
        int size = this.f31838w.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            parcel.writeByteArray((byte[]) this.f31838w.get(i13));
        }
        parcel.writeParcelable(this.f31839x, 0);
        parcel.writeParcelable(this.f31834s, 0);
    }

    public zzasw(String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, float f11, int i15, float f12, byte[] bArr, int i16, zzbau zzbauVar, int i17, int i18, int i19, int i21, int i22, int i23, String str5, int i24, long j11, List list, zzauv zzauvVar, zzaxh zzaxhVar) {
        this.f31831p = str;
        this.f31835t = str2;
        this.f31836u = str3;
        this.f31833r = str4;
        this.f31832q = i11;
        this.f31837v = i12;
        this.f31840y = i13;
        this.f31841z = i14;
        this.f31815A = f11;
        this.f31816B = i15;
        this.f31817C = f12;
        this.f31819E = bArr;
        this.f31818D = i16;
        this.f31820F = zzbauVar;
        this.f31821G = i17;
        this.f31822H = i18;
        this.f31823I = i19;
        this.f31824J = i21;
        this.f31825K = i22;
        this.f31827M = i23;
        this.f31828N = str5;
        this.f31829O = i24;
        this.f31826L = j11;
        this.f31838w = list == null ? Collections.emptyList() : list;
        this.f31839x = zzauvVar;
        this.f31834s = zzaxhVar;
    }
}
