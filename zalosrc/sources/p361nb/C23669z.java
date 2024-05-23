package p361nb;

import java.util.Arrays;
import p386ob.C24192c;

/* renamed from: nb.z */
/* loaded from: classes3.dex */
public class C23669z {

    /* renamed from: a */
    public int f114654a = 0;

    /* renamed from: b */
    public int f114655b = 0;

    /* renamed from: c */
    public long f114656c = 0;

    /* renamed from: d */
    public int f114657d = 0;

    /* renamed from: e */
    public int f114658e = 0;

    /* renamed from: f */
    public String[] f114659f = new String[0];

    /* renamed from: g */
    public boolean f114660g;

    /* renamed from: h */
    public boolean f114661h;

    /* renamed from: b */
    public static C23669z m123999b(int i11, int i12, int i13) {
        if (i11 == 2) {
            return new C23665v();
        }
        if (i11 == 1) {
            return new C23655l();
        }
        if (i11 == 3) {
            return C23651h.m123959g(i13);
        }
        if (i11 == 4) {
            return new C23666w();
        }
        if (i11 == 5) {
            return new C23644a0();
        }
        if (i11 == 6) {
            return new C23659p();
        }
        if (i11 == 7) {
            return new C23661r();
        }
        if (i11 == 9) {
            return new C23652i();
        }
        if (i11 == 8) {
            return new C23667x(i11, i12, i13, null);
        }
        if (i11 == 10) {
            return new C23658o();
        }
        if (i11 == 11) {
            return new C23657n();
        }
        if (i11 == 13) {
            return C23648e.Companion.m123929a();
        }
        if (i11 == 14) {
            return new C24192c();
        }
        return new C23669z();
    }

    /* renamed from: e */
    private String m124000e(int i11) {
        String str;
        String[] strArr = this.f114659f;
        if (strArr != null && i11 < strArr.length && (str = strArr[i11]) != null) {
            return mo123972a(i11, str);
        }
        return "";
    }

    /* renamed from: a */
    public String mo123972a(int i11, String str) {
        return str;
    }

    /* renamed from: c */
    public void mo123889c() {
    }

    /* renamed from: d */
    public String mo123915d() {
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append("\n");
        stringBuffer.append(this.f114656c);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114654a);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114655b);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114657d);
        if (this.f114659f != null) {
            for (int i11 = 0; i11 < this.f114659f.length; i11++) {
                stringBuffer.append("\t");
                stringBuffer.append(m124000e(i11));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public void mo123890f() {
    }

    public String toString() {
        return "ZaloTrackingInfo{typeLog=" + this.f114654a + ", subTypeLog=" + this.f114655b + ", time=" + this.f114656c + ", source=" + this.f114657d + ", params=" + Arrays.toString(this.f114659f) + '}';
    }
}
