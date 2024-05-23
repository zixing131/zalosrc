package ua;

import va.C27953a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.b */
/* loaded from: classes3.dex */
public final class C27208b extends AbstractC27213g {

    /* renamed from: c */
    private final short f127931c;

    /* renamed from: d */
    private final short f127932d;

    public C27208b(AbstractC27213g abstractC27213g, int i11, int i12) {
        super(abstractC27213g);
        this.f127931c = (short) i11;
        this.f127932d = (short) i12;
    }

    @Override // ua.AbstractC27213g
    /* renamed from: c */
    public void mo139279c(C27953a c27953a, byte[] bArr) {
        int i11 = 0;
        while (true) {
            short s7 = this.f127932d;
            if (i11 < s7) {
                if (i11 == 0 || (i11 == 31 && s7 <= 62)) {
                    c27953a.m140883b(31, 5);
                    short s11 = this.f127932d;
                    if (s11 > 62) {
                        c27953a.m140883b(s11 - 31, 16);
                    } else if (i11 == 0) {
                        c27953a.m140883b(Math.min((int) s11, 31), 5);
                    } else {
                        c27953a.m140883b(s11 - 31, 5);
                    }
                }
                c27953a.m140883b(bArr[this.f127931c + i11], 8);
                i11++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append((int) this.f127931c);
        sb2.append("::");
        sb2.append((this.f127931c + this.f127932d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
