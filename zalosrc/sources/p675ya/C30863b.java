package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.b */
/* loaded from: classes3.dex */
public final class C30863b implements InterfaceC30868g {
    /* renamed from: c */
    private static char m150009c(char c11, int i11) {
        int i12 = c11 + ((i11 * 149) % 255) + 1;
        if (i12 <= 255) {
            return (char) i12;
        }
        return (char) (i12 - 256);
    }

    @Override // p675ya.InterfaceC30868g
    /* renamed from: a */
    public void mo150007a(C30869h c30869h) {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!c30869h.m150041i()) {
                break;
            }
            sb2.append(c30869h.m150036c());
            c30869h.f142429d++;
            if (AbstractC30871j.m150068n(c30869h.m150037d(), c30869h.f142429d, m150010b()) != m150010b()) {
                c30869h.m150047o(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int m150034a = c30869h.m150034a() + length + 1;
        c30869h.m150049q(m150034a);
        if (c30869h.m150040g().m150073a() - m150034a > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c30869h.m150041i() || z11) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: " + length);
            }
        }
        int length2 = sb2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            c30869h.m150050r(m150009c(sb2.charAt(i11), c30869h.m150034a() + 1));
        }
    }

    /* renamed from: b */
    public int m150010b() {
        return 5;
    }
}
