package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzadl extends zzadd {
    public static final Parcelable.Creator<zzadl> CREATOR = new C4302a2();

    /* renamed from: q */
    public final String f31797q;

    /* renamed from: r */
    public final String f31798r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzadl(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i11 = g92.f20474a;
        this.f31797q = parcel.readString();
        this.f31798r = parcel.readString();
    }

    /* renamed from: a */
    private static List m28674a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadl.class == obj.getClass()) {
            zzadl zzadlVar = (zzadl) obj;
            if (g92.m22362t(this.f31786p, zzadlVar.f31786p) && g92.m22362t(this.f31797q, zzadlVar.f31797q) && g92.m22362t(this.f31798r, zzadlVar.f31798r)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzbp
    /* renamed from: f0 */
    public final void mo28672f0(C4518fy c4518fy) {
        char c11;
        Integer num;
        String str = this.f31786p;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                c4518fy.m22237H(this.f31798r);
                return;
            case 2:
            case 3:
                c4518fy.m22246u(this.f31798r);
                return;
            case 4:
            case 5:
                c4518fy.m22244s(this.f31798r);
                return;
            case 6:
            case 7:
                c4518fy.m22245t(this.f31798r);
                return;
            case '\b':
            case '\t':
                String[] m22314H = g92.m22314H(this.f31798r, "/");
                try {
                    int parseInt = Integer.parseInt(m22314H[0]);
                    if (m22314H.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(m22314H[1]));
                    } else {
                        num = null;
                    }
                    c4518fy.m22239J(Integer.valueOf(parseInt));
                    c4518fy.m22238I(num);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    c4518fy.m22232C(Integer.valueOf(Integer.parseInt(this.f31798r)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.f31798r.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.f31798r.substring(0, 2));
                    c4518fy.m22231B(Integer.valueOf(parseInt2));
                    c4518fy.m22230A(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List m28674a = m28674a(this.f31798r);
                int size = m28674a.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        } else {
                            c4518fy.m22230A((Integer) m28674a.get(2));
                        }
                    }
                    c4518fy.m22231B((Integer) m28674a.get(1));
                }
                c4518fy.m22232C((Integer) m28674a.get(0));
                return;
            case 15:
                List m28674a2 = m28674a(this.f31798r);
                int size2 = m28674a2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            c4518fy.m22233D((Integer) m28674a2.get(2));
                        } else {
                            return;
                        }
                    }
                    c4518fy.m22234E((Integer) m28674a2.get(1));
                }
                c4518fy.m22235F((Integer) m28674a2.get(0));
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
                c4518fy.m22248w(this.f31798r);
                return;
            case 18:
            case 19:
                c4518fy.m22249x(this.f31798r);
                return;
            case 20:
            case 21:
                c4518fy.m22240K(this.f31798r);
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f31786p.hashCode() + 527) * 31;
        String str = this.f31797q;
        int i12 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (hashCode + i11) * 31;
        String str2 = this.f31798r;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final String toString() {
        return this.f31786p + ": description=" + this.f31797q + ": value=" + this.f31798r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31786p);
        parcel.writeString(this.f31797q);
        parcel.writeString(this.f31798r);
    }

    public zzadl(String str, String str2, String str3) {
        super(str);
        this.f31797q = str2;
        this.f31798r = str3;
    }
}
