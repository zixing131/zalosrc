package wg0;

/* renamed from: wg0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC28983f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final float m144702b(InterfaceC28990m[] interfaceC28990mArr) {
        float f11;
        int i11 = 1;
        if (interfaceC28990mArr.length == 1) {
            return interfaceC28990mArr[0].mo90080a();
        }
        int length = interfaceC28990mArr.length;
        int i12 = 0;
        double d11 = 0.0d;
        while (true) {
            float f12 = 0.1f;
            if (i12 >= length) {
                break;
            }
            int mo90085f = interfaceC28990mArr[i12].mo90085f();
            if (mo90085f != 0) {
                if (mo90085f != 1) {
                    if (mo90085f != 2) {
                        if (mo90085f != 3) {
                            f12 = 0.0f;
                        } else {
                            f12 = 0.85f;
                        }
                    }
                } else {
                    for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
                        if (interfaceC28990m.mo90085f() != 0) {
                        }
                    }
                }
                d11 += f12;
                i12++;
            }
            f12 = 0.05f;
            d11 += f12;
            i12++;
        }
        double d12 = 1.0f / d11;
        int length2 = interfaceC28990mArr.length;
        double d13 = 0.0d;
        int i13 = 0;
        while (i13 < length2) {
            int mo90085f2 = interfaceC28990mArr[i13].mo90085f();
            if (mo90085f2 != 0) {
                if (mo90085f2 != i11) {
                    if (mo90085f2 != 2) {
                        if (mo90085f2 != 3) {
                            f11 = 0.0f;
                        } else {
                            f11 = 0.85f;
                        }
                    }
                } else {
                    for (InterfaceC28990m interfaceC28990m2 : interfaceC28990mArr) {
                        if (interfaceC28990m2.mo90085f() != 0) {
                        }
                    }
                    f11 = 0.1f;
                }
                d13 += r15.mo90080a() * f11 * d12;
                i13++;
                i11 = 1;
            }
            f11 = 0.05f;
            d13 += r15.mo90080a() * f11 * d12;
            i13++;
            i11 = 1;
        }
        return (float) d13;
    }
}
