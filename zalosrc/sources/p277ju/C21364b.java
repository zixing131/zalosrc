package p277ju;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Vector;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ju.b */
/* loaded from: classes4.dex */
public class C21364b {

    /* renamed from: a */
    public Vector f104150a;

    /* renamed from: b */
    public Vector f104151b;

    /* renamed from: c */
    private int[][] f104152c;

    /* renamed from: d */
    private int[][] f104153d;

    /* renamed from: e */
    private int[][] f104154e;

    /* renamed from: f */
    private int[][] f104155f;

    /* renamed from: g */
    private Object[] f104156g;

    /* renamed from: h */
    private Object[] f104157h;

    /* renamed from: i */
    private int f104158i;

    /* renamed from: j */
    private int f104159j;

    /* renamed from: k */
    private final int[] f104160k;

    /* renamed from: l */
    private final int[] f104161l;

    /* renamed from: m */
    private final int[] f104162m;

    /* renamed from: n */
    private final int[] f104163n;

    /* renamed from: o */
    private final int[] f104164o;

    /* renamed from: p */
    private final int[] f104165p;

    /* renamed from: q */
    private final int[] f104166q;

    /* renamed from: r */
    private final int[] f104167r;

    /* renamed from: s */
    private int f104168s;

    /* renamed from: t */
    private int f104169t;

    public C21364b() {
        int[] iArr = {0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        this.f104160k = iArr;
        int[] iArr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        this.f104161l = iArr2;
        int[] iArr3 = {16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125};
        this.f104162m = iArr3;
        int[] iArr4 = {1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, 129, 145, 161, 8, 35, 66, 177, 193, 21, 82, 209, 240, 36, 51, 98, 114, 130, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, 131, 132, 133, 134, 135, 136, 137, 138, 146, 147, 148, 149, 150, 151, 152, 153, 154, 162, 163, 164, 165, 166, 167, 168, 169, 170, 178, 179, 180, 181, 182, 183, 184, 185, 186, 194, 195, 196, 197, 198, 199, 200, 201, 202, 210, 211, 212, 213, 214, 215, 216, 217, 218, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 241, 242, 243, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, 246, 247, 248, 249, 250};
        this.f104163n = iArr4;
        int[] iArr5 = {1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        this.f104164o = iArr5;
        int[] iArr6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        this.f104165p = iArr6;
        int[] iArr7 = {17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119};
        this.f104166q = iArr7;
        int[] iArr8 = {0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, 129, 8, 20, 66, 145, 161, 177, 193, 9, 35, 51, 82, 240, 21, 98, 114, 209, 10, 22, 36, 52, 225, 37, 241, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, 130, 131, 132, 133, 134, 135, 136, 137, 138, 146, 147, 148, 149, 150, 151, 152, 153, 154, 162, 163, 164, 165, 166, 167, 168, 169, 170, 178, 179, 180, 181, 182, 183, 184, 185, 186, 194, 195, 196, 197, 198, 199, 200, 201, 202, 210, 211, 212, 213, 214, 215, 216, 217, 218, 226, 227, 228, 229, 230, 231, 232, 233, 234, 242, 243, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, 246, 247, 248, 249, 250};
        this.f104167r = iArr8;
        Vector vector = new Vector();
        this.f104150a = vector;
        vector.addElement(iArr);
        this.f104150a.addElement(iArr3);
        this.f104150a.addElement(iArr5);
        this.f104150a.addElement(iArr7);
        Vector vector2 = new Vector();
        this.f104151b = vector2;
        vector2.addElement(iArr2);
        this.f104151b.addElement(iArr4);
        this.f104151b.addElement(iArr6);
        this.f104151b.addElement(iArr8);
        m110720d();
    }

    /* renamed from: a */
    private void m110719a(BufferedOutputStream bufferedOutputStream, int i11, int i12) {
        int i13 = this.f104168s + i12;
        int i14 = ((i11 & ((1 << i12) - 1)) << (24 - i13)) | this.f104169t;
        while (i13 >= 8) {
            int i15 = (i14 >> 16) & 255;
            try {
                bufferedOutputStream.write(i15);
            } catch (IOException e11) {
                System.out.println("IO Error: " + e11.getMessage());
            }
            if (i15 == 255) {
                try {
                    bufferedOutputStream.write(0);
                } catch (IOException e12) {
                    System.out.println("IO Error: " + e12.getMessage());
                }
            }
            i14 <<= 8;
            i13 -= 8;
        }
        this.f104169t = i14;
        this.f104168s = i13;
    }

    /* renamed from: d */
    private void m110720d() {
        Class cls = Integer.TYPE;
        this.f104152c = (int[][]) Array.newInstance((Class<?>) cls, 12, 2);
        this.f104154e = (int[][]) Array.newInstance((Class<?>) cls, 12, 2);
        this.f104153d = (int[][]) Array.newInstance((Class<?>) cls, 255, 2);
        this.f104155f = (int[][]) Array.newInstance((Class<?>) cls, 255, 2);
        this.f104156g = new Object[2];
        this.f104157h = new Object[2];
        int[] iArr = new int[257];
        int[] iArr2 = new int[257];
        int i11 = 0;
        for (int i12 = 1; i12 <= 16; i12++) {
            int i13 = 1;
            while (i13 <= this.f104164o[i12]) {
                iArr[i11] = i12;
                i13++;
                i11++;
            }
        }
        iArr[i11] = 0;
        int i14 = iArr[0];
        int i15 = 0;
        int i16 = 0;
        while (iArr[i15] != 0) {
            while (iArr[i15] == i14) {
                iArr2[i15] = i16;
                i16++;
                i15++;
            }
            i16 <<= 1;
            i14++;
        }
        for (int i17 = 0; i17 < i11; i17++) {
            int[][] iArr3 = this.f104154e;
            int[] iArr4 = this.f104165p;
            iArr3[iArr4[i17]][0] = iArr2[i17];
            iArr3[iArr4[i17]][1] = iArr[i17];
        }
        int i18 = 0;
        for (int i19 = 1; i19 <= 16; i19++) {
            int i21 = 1;
            while (i21 <= this.f104166q[i19]) {
                iArr[i18] = i19;
                i21++;
                i18++;
            }
        }
        iArr[i18] = 0;
        int i22 = iArr[0];
        int i23 = 0;
        int i24 = 0;
        while (iArr[i23] != 0) {
            while (iArr[i23] == i22) {
                iArr2[i23] = i24;
                i24++;
                i23++;
            }
            i24 <<= 1;
            i22++;
        }
        for (int i25 = 0; i25 < i18; i25++) {
            int[][] iArr5 = this.f104155f;
            int[] iArr6 = this.f104167r;
            iArr5[iArr6[i25]][0] = iArr2[i25];
            iArr5[iArr6[i25]][1] = iArr[i25];
        }
        int i26 = 0;
        for (int i27 = 1; i27 <= 16; i27++) {
            int i28 = 1;
            while (i28 <= this.f104160k[i27]) {
                iArr[i26] = i27;
                i28++;
                i26++;
            }
        }
        iArr[i26] = 0;
        int i29 = iArr[0];
        int i31 = 0;
        int i32 = 0;
        while (iArr[i31] != 0) {
            while (iArr[i31] == i29) {
                iArr2[i31] = i32;
                i32++;
                i31++;
            }
            i32 <<= 1;
            i29++;
        }
        for (int i33 = 0; i33 < i26; i33++) {
            int[][] iArr7 = this.f104152c;
            int[] iArr8 = this.f104161l;
            iArr7[iArr8[i33]][0] = iArr2[i33];
            iArr7[iArr8[i33]][1] = iArr[i33];
        }
        int i34 = 0;
        for (int i35 = 1; i35 <= 16; i35++) {
            int i36 = 1;
            while (i36 <= this.f104162m[i35]) {
                iArr[i34] = i35;
                i36++;
                i34++;
            }
        }
        iArr[i34] = 0;
        int i37 = iArr[0];
        int i38 = 0;
        int i39 = 0;
        while (iArr[i38] != 0) {
            while (iArr[i38] == i37) {
                iArr2[i38] = i39;
                i39++;
                i38++;
            }
            i39 <<= 1;
            i37++;
        }
        for (int i41 = 0; i41 < i34; i41++) {
            int[][] iArr9 = this.f104153d;
            int[] iArr10 = this.f104163n;
            iArr9[iArr10[i41]][0] = iArr2[i41];
            iArr9[iArr10[i41]][1] = iArr[i41];
        }
        Object[] objArr = this.f104156g;
        objArr[0] = this.f104152c;
        objArr[1] = this.f104154e;
        Object[] objArr2 = this.f104157h;
        objArr2[0] = this.f104153d;
        objArr2[1] = this.f104155f;
    }

    /* renamed from: b */
    public void m110721b(BufferedOutputStream bufferedOutputStream, int[] iArr, int i11, int i12, int i13) {
        int i14;
        int i15;
        this.f104158i = 2;
        this.f104159j = 2;
        int i16 = iArr[0] - i11;
        if (i16 < 0) {
            int i17 = -i16;
            int i18 = i16 - 1;
            i16 = i17;
            i14 = i18;
        } else {
            i14 = i16;
        }
        int i19 = 0;
        while (i16 != 0) {
            i19++;
            i16 >>= 1;
        }
        Object obj = this.f104156g[i12];
        m110719a(bufferedOutputStream, ((int[][]) obj)[i19][0], ((int[][]) obj)[i19][1]);
        if (i19 != 0) {
            m110719a(bufferedOutputStream, i14, i19);
        }
        int i21 = 0;
        for (int i22 = 1; i22 < 64; i22++) {
            int i23 = iArr[C21365c.f104170g[i22]];
            if (i23 == 0) {
                i21++;
            } else {
                while (i21 > 15) {
                    Object obj2 = this.f104157h[i13];
                    m110719a(bufferedOutputStream, ((int[][]) obj2)[240][0], ((int[][]) obj2)[240][1]);
                    i21 -= 16;
                }
                if (i23 < 0) {
                    i15 = -i23;
                    i23--;
                } else {
                    i15 = i23;
                }
                int i24 = 1;
                while (true) {
                    i15 >>= 1;
                    if (i15 == 0) {
                        break;
                    } else {
                        i24++;
                    }
                }
                int i25 = (i21 << 4) + i24;
                Object obj3 = this.f104157h[i13];
                m110719a(bufferedOutputStream, ((int[][]) obj3)[i25][0], ((int[][]) obj3)[i25][1]);
                m110719a(bufferedOutputStream, i23, i24);
                i21 = 0;
            }
        }
        if (i21 > 0) {
            Object obj4 = this.f104157h[i13];
            m110719a(bufferedOutputStream, ((int[][]) obj4)[0][0], ((int[][]) obj4)[0][1]);
        }
    }

    /* renamed from: c */
    public void m110722c(BufferedOutputStream bufferedOutputStream) {
        int i11 = this.f104169t;
        int i12 = this.f104168s;
        while (i12 >= 8) {
            int i13 = (i11 >> 16) & 255;
            try {
                bufferedOutputStream.write(i13);
            } catch (IOException e11) {
                System.out.println("IO Error: " + e11.getMessage());
            }
            if (i13 == 255) {
                try {
                    bufferedOutputStream.write(0);
                } catch (IOException e12) {
                    System.out.println("IO Error: " + e12.getMessage());
                }
            }
            i11 <<= 8;
            i12 -= 8;
        }
        if (i12 > 0) {
            try {
                bufferedOutputStream.write((i11 >> 16) & 255);
            } catch (IOException e13) {
                System.out.println("IO Error: " + e13.getMessage());
            }
        }
    }
}
