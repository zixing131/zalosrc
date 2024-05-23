package p633x5;

import java.util.Arrays;

/* renamed from: x5.o */
/* loaded from: classes2.dex */
public final class C29360o {

    /* renamed from: a */
    Object[] f135847a = new Object[8];

    /* renamed from: b */
    int f135848b = 0;

    /* renamed from: c */
    C29358n f135849c;

    /* renamed from: a */
    public final C29360o m146501a(Object obj, Object obj2) {
        int i11 = this.f135848b + 1;
        Object[] objArr = this.f135847a;
        int length = objArr.length;
        int i12 = i11 + i11;
        if (i12 > length) {
            this.f135847a = Arrays.copyOf(objArr, AbstractC29348i.m146488a(length, i12));
        }
        AbstractC29342f.m146483a(obj, obj2);
        Object[] objArr2 = this.f135847a;
        int i13 = this.f135848b;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.f135848b = i13 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC29362p m146502b() {
        C29358n c29358n = this.f135849c;
        if (c29358n == null) {
            C29378x m146517g = C29378x.m146517g(this.f135848b, this.f135847a, this);
            C29358n c29358n2 = this.f135849c;
            if (c29358n2 == null) {
                return m146517g;
            }
            throw c29358n2.m146499a();
        }
        throw c29358n.m146499a();
    }
}
