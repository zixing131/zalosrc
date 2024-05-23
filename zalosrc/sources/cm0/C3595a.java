package cm0;

import android.graphics.Point;
import android.graphics.Rect;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import la.C22166a;

/* renamed from: cm0.a */
/* loaded from: classes7.dex */
public final class C3595a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f15185a;

    /* renamed from: b */
    private final String f15186b;

    /* renamed from: c */
    private final byte[] f15187c;

    /* renamed from: d */
    private final Rect f15188d;

    /* renamed from: e */
    private final Point[] f15189e;

    /* renamed from: cm0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3595a m18212a(C22166a c22166a) {
            AbstractC19074t.m100208f(c22166a, "mlkitBarcode");
            b m18215a = b.Companion.m18215a(c22166a.m115781c());
            String m115783e = c22166a.m115783e();
            if (m115783e == null) {
                m115783e = "";
            }
            String str = m115783e;
            byte[] m115782d = c22166a.m115782d();
            if (m115782d == null) {
                m115782d = new byte[0];
            }
            byte[] bArr = m115782d;
            Rect m115779a = c22166a.m115779a();
            if (m115779a == null) {
                m115779a = new Rect();
            }
            Rect rect = m115779a;
            Point[] m115780b = c22166a.m115780b();
            if (m115780b == null) {
                m115780b = new Point[0];
            }
            return new C3595a(m18215a, str, bArr, rect, m115780b);
        }
    }

    /* renamed from: cm0.a$b */
    /* loaded from: classes7.dex */
    public enum b {
        ALL_FORMAT(0),
        CODE_128(1),
        CODE_39(2),
        CODE_93(4),
        CODABAR(8),
        DATA_MATRIX(16),
        EAN_13(32),
        EAN_8(64),
        ITF(128),
        QR_CODE(256),
        UPC_A(512),
        UPC_E(1024),
        PDF417(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA),
        AZTEC(4096);

        public static final a Companion = new a(null);

        /* renamed from: p */
        private final int f15205p;

        /* renamed from: cm0.a$b$a */
        /* loaded from: classes7.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m18215a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            switch (i11) {
                                case 4:
                                    return b.CODE_93;
                                case 8:
                                    return b.CODABAR;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                    return b.DATA_MATRIX;
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    return b.EAN_13;
                                case 64:
                                    return b.EAN_8;
                                case 128:
                                    return b.ITF;
                                case 256:
                                    return b.QR_CODE;
                                case 512:
                                    return b.UPC_A;
                                case 1024:
                                    return b.UPC_E;
                                case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                                    return b.PDF417;
                                case 4096:
                                    return b.AZTEC;
                                default:
                                    throw new IllegalArgumentException("Unknown format: " + i11);
                            }
                        }
                        return b.CODE_39;
                    }
                    return b.CODE_128;
                }
                return b.ALL_FORMAT;
            }
        }

        b(int i11) {
            this.f15205p = i11;
        }

        /* renamed from: c */
        public final int m18214c() {
            return this.f15205p;
        }
    }

    public C3595a(b bVar, String str, byte[] bArr, Rect rect, Point[] pointArr) {
        AbstractC19074t.m100208f(bVar, "format");
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(bArr, "rawBytes");
        AbstractC19074t.m100208f(rect, "boundingBox");
        AbstractC19074t.m100208f(pointArr, "cornerPoints");
        this.f15185a = bVar;
        this.f15186b = str;
        this.f15187c = bArr;
        this.f15188d = rect;
        this.f15189e = pointArr;
    }

    /* renamed from: a */
    public final Point[] m18209a() {
        return this.f15189e;
    }

    /* renamed from: b */
    public final byte[] m18210b() {
        return this.f15187c;
    }

    /* renamed from: c */
    public final String m18211c() {
        return this.f15186b;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(C3595a.class, cls)) {
            return false;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zvision.mlkit.barcode.Barcode");
        C3595a c3595a = (C3595a) obj;
        if (this.f15185a == c3595a.f15185a && AbstractC19074t.m100204b(this.f15186b, c3595a.f15186b) && Arrays.equals(this.f15187c, c3595a.f15187c) && AbstractC19074t.m100204b(this.f15188d, c3595a.f15188d) && Arrays.equals(this.f15189e, c3595a.f15189e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f15185a.hashCode() * 31) + this.f15186b.hashCode()) * 31) + Arrays.hashCode(this.f15187c)) * 31) + this.f15188d.hashCode()) * 31) + Arrays.hashCode(this.f15189e);
    }

    public String toString() {
        return "Barcode(format=" + this.f15185a + ", text=" + this.f15186b + ", rawBytes=" + Arrays.toString(this.f15187c) + ", boundingBox=" + this.f15188d + ", cornerPoints=" + Arrays.toString(this.f15189e) + ')';
    }
}
