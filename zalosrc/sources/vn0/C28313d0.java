package vn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26342i;

/* renamed from: vn0.d0 */
/* loaded from: classes7.dex */
public final class C28313d0 {

    /* renamed from: a */
    private Object[] f132040a = new Object[8];

    /* renamed from: b */
    private int[] f132041b;

    /* renamed from: c */
    private int f132042c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vn0.d0$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f132043a = new a();

        private a() {
        }
    }

    public C28313d0() {
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        this.f132041b = iArr;
        this.f132042c = -1;
    }

    /* renamed from: e */
    private final void m142696e() {
        int i11 = this.f132042c * 2;
        Object[] copyOf = Arrays.copyOf(this.f132040a, i11);
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        this.f132040a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f132041b, i11);
        AbstractC19074t.m100207e(copyOf2, "copyOf(this, newSize)");
        this.f132041b = copyOf2;
    }

    /* renamed from: a */
    public final String m142697a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i11 = this.f132042c + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = this.f132040a[i12];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (AbstractC19074t.m100204b(serialDescriptor.mo113948d(), AbstractC26342i.b.f125057a)) {
                    if (this.f132041b[i12] != -1) {
                        sb2.append("[");
                        sb2.append(this.f132041b[i12]);
                        sb2.append("]");
                    }
                } else {
                    int i13 = this.f132041b[i12];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.mo113950f(i13));
                    }
                }
            } else if (obj != a.f132043a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: b */
    public final void m142698b() {
        int i11 = this.f132042c;
        int[] iArr = this.f132041b;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            this.f132042c = i11 - 1;
        }
        int i12 = this.f132042c;
        if (i12 != -1) {
            this.f132042c = i12 - 1;
        }
    }

    /* renamed from: c */
    public final void m142699c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "sd");
        int i11 = this.f132042c + 1;
        this.f132042c = i11;
        if (i11 == this.f132040a.length) {
            m142696e();
        }
        this.f132040a[i11] = serialDescriptor;
    }

    /* renamed from: d */
    public final void m142700d() {
        int[] iArr = this.f132041b;
        int i11 = this.f132042c;
        if (iArr[i11] == -2) {
            this.f132040a[i11] = a.f132043a;
        }
    }

    /* renamed from: f */
    public final void m142701f(Object obj) {
        int[] iArr = this.f132041b;
        int i11 = this.f132042c;
        if (iArr[i11] != -2) {
            int i12 = i11 + 1;
            this.f132042c = i12;
            if (i12 == this.f132040a.length) {
                m142696e();
            }
        }
        Object[] objArr = this.f132040a;
        int i13 = this.f132042c;
        objArr[i13] = obj;
        this.f132041b[i13] = -2;
    }

    /* renamed from: g */
    public final void m142702g(int i11) {
        this.f132041b[this.f132042c] = i11;
    }

    public String toString() {
        return m142697a();
    }
}
