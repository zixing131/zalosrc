package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.c */
/* loaded from: classes3.dex */
public class C30864c implements InterfaceC30868g {
    /* renamed from: b */
    private int m150011b(C30869h c30869h, StringBuilder sb2, StringBuilder sb3, int i11) {
        int length = sb2.length();
        sb2.delete(length - i11, length);
        c30869h.f142429d--;
        int mo150014c = mo150014c(c30869h.m150036c(), sb3);
        c30869h.m150043k();
        return mo150014c;
    }

    /* renamed from: d */
    private static String m150012d(CharSequence charSequence, int i11) {
        int charAt = (charSequence.charAt(i11) * 1600) + (charSequence.charAt(i11 + 1) * '(') + charSequence.charAt(i11 + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m150013g(C30869h c30869h, StringBuilder sb2) {
        c30869h.m150051s(m150012d(sb2, 0));
        sb2.delete(0, 3);
    }

    @Override // p675ya.InterfaceC30868g
    /* renamed from: a */
    public void mo150007a(C30869h c30869h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c30869h.m150041i()) {
                break;
            }
            char m150036c = c30869h.m150036c();
            c30869h.f142429d++;
            int mo150014c = mo150014c(m150036c, sb2);
            int m150034a = c30869h.m150034a() + ((sb2.length() / 3) * 2);
            c30869h.m150049q(m150034a);
            int m150073a = c30869h.m150040g().m150073a() - m150034a;
            if (!c30869h.m150041i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && m150073a != 2) {
                    mo150014c = m150011b(c30869h, sb2, sb3, mo150014c);
                }
                while (sb2.length() % 3 == 1 && (mo150014c > 3 || m150073a != 1)) {
                    mo150014c = m150011b(c30869h, sb2, sb3, mo150014c);
                }
            } else if (sb2.length() % 3 == 0 && AbstractC30871j.m150068n(c30869h.m150037d(), c30869h.f142429d, mo150015e()) != mo150015e()) {
                c30869h.m150047o(0);
                break;
            }
        }
        mo150016f(c30869h, sb2);
    }

    /* renamed from: c */
    int mo150014c(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) (c11 - '3'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '!'));
            return 2;
        }
        if (c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c11 - '`'));
            return 2;
        }
        sb2.append("\u0001\u001e");
        return mo150014c((char) (c11 - 128), sb2) + 2;
    }

    /* renamed from: e */
    public int mo150015e() {
        return 1;
    }

    /* renamed from: f */
    void mo150016f(C30869h c30869h, StringBuilder sb2) {
        int length = (sb2.length() / 3) * 2;
        int length2 = sb2.length() % 3;
        int m150034a = c30869h.m150034a() + length;
        c30869h.m150049q(m150034a);
        int m150073a = c30869h.m150040g().m150073a() - m150034a;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                m150013g(c30869h, sb2);
            }
            if (c30869h.m150041i()) {
                c30869h.m150050r((char) 254);
            }
        } else if (m150073a == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                m150013g(c30869h, sb2);
            }
            if (c30869h.m150041i()) {
                c30869h.m150050r((char) 254);
            }
            c30869h.f142429d--;
        } else if (length2 == 0) {
            while (sb2.length() >= 3) {
                m150013g(c30869h, sb2);
            }
            if (m150073a > 0 || c30869h.m150041i()) {
                c30869h.m150050r((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c30869h.m150047o(0);
    }
}
