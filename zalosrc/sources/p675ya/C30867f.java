package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.f */
/* loaded from: classes3.dex */
public final class C30867f implements InterfaceC30868g {
    /* renamed from: b */
    private static void m150029b(char c11, StringBuilder sb2) {
        if (c11 >= ' ' && c11 <= '?') {
            sb2.append(c11);
        } else if (c11 >= '@' && c11 <= '^') {
            sb2.append((char) (c11 - '@'));
        } else {
            AbstractC30871j.m150059e(c11);
        }
    }

    /* renamed from: c */
    private static String m150030c(CharSequence charSequence, int i11) {
        char c11;
        char c12;
        int length = charSequence.length() - i11;
        if (length != 0) {
            char charAt = charSequence.charAt(i11);
            char c13 = 0;
            if (length >= 2) {
                c11 = charSequence.charAt(i11 + 1);
            } else {
                c11 = 0;
            }
            if (length >= 3) {
                c12 = charSequence.charAt(i11 + 2);
            } else {
                c12 = 0;
            }
            if (length >= 4) {
                c13 = charSequence.charAt(i11 + 3);
            }
            int i12 = (charAt << 18) + (c11 << '\f') + (c12 << 6) + c13;
            char c14 = (char) ((i12 >> 16) & 255);
            char c15 = (char) ((i12 >> 8) & 255);
            char c16 = (char) (i12 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(c14);
            if (length >= 2) {
                sb2.append(c15);
            }
            if (length >= 3) {
                sb2.append(c16);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    private static void m150031e(C30869h c30869h, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z11 = true;
            if (length == 1) {
                c30869h.m150048p();
                int m150073a = c30869h.m150040g().m150073a() - c30869h.m150034a();
                int m150039f = c30869h.m150039f();
                if (m150039f > m150073a) {
                    c30869h.m150049q(c30869h.m150034a() + 1);
                    m150073a = c30869h.m150040g().m150073a() - c30869h.m150034a();
                }
                if (m150039f <= m150073a && m150073a <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i11 = length - 1;
                String m150030c = m150030c(charSequence, 0);
                if (!(!c30869h.m150041i()) || i11 > 2) {
                    z11 = false;
                }
                if (i11 <= 2) {
                    c30869h.m150049q(c30869h.m150034a() + i11);
                    if (c30869h.m150040g().m150073a() - c30869h.m150034a() >= 3) {
                        c30869h.m150049q(c30869h.m150034a() + m150030c.length());
                        c30869h.m150051s(m150030c);
                        return;
                    }
                }
                if (z11) {
                    c30869h.m150043k();
                    c30869h.f142429d -= i11;
                    return;
                }
                c30869h.m150051s(m150030c);
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c30869h.m150047o(0);
        }
    }

    @Override // p675ya.InterfaceC30868g
    /* renamed from: a */
    public void mo150007a(C30869h c30869h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c30869h.m150041i()) {
                break;
            }
            m150029b(c30869h.m150036c(), sb2);
            c30869h.f142429d++;
            if (sb2.length() >= 4) {
                c30869h.m150051s(m150030c(sb2, 0));
                sb2.delete(0, 4);
                if (AbstractC30871j.m150068n(c30869h.m150037d(), c30869h.f142429d, m150032d()) != m150032d()) {
                    c30869h.m150047o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        m150031e(c30869h, sb2);
    }

    /* renamed from: d */
    public int m150032d() {
        return 4;
    }
}
