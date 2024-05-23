package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.a */
/* loaded from: classes3.dex */
public final class C30862a implements InterfaceC30868g {
    /* renamed from: b */
    private static char m150006b(char c11, char c12) {
        if (AbstractC30871j.m150060f(c11) && AbstractC30871j.m150060f(c12)) {
            return (char) (((c11 - '0') * 10) + (c12 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c11 + c12);
    }

    @Override // p675ya.InterfaceC30868g
    /* renamed from: a */
    public void mo150007a(C30869h c30869h) {
        if (AbstractC30871j.m150055a(c30869h.m150037d(), c30869h.f142429d) >= 2) {
            c30869h.m150050r(m150006b(c30869h.m150037d().charAt(c30869h.f142429d), c30869h.m150037d().charAt(c30869h.f142429d + 1)));
            c30869h.f142429d += 2;
            return;
        }
        char m150036c = c30869h.m150036c();
        int m150068n = AbstractC30871j.m150068n(c30869h.m150037d(), c30869h.f142429d, m150008c());
        if (m150068n != m150008c()) {
            if (m150068n != 1) {
                if (m150068n != 2) {
                    if (m150068n != 3) {
                        if (m150068n != 4) {
                            if (m150068n == 5) {
                                c30869h.m150050r((char) 231);
                                c30869h.m150047o(5);
                                return;
                            } else {
                                throw new IllegalStateException("Illegal mode: " + m150068n);
                            }
                        }
                        c30869h.m150050r((char) 240);
                        c30869h.m150047o(4);
                        return;
                    }
                    c30869h.m150050r((char) 238);
                    c30869h.m150047o(3);
                    return;
                }
                c30869h.m150050r((char) 239);
                c30869h.m150047o(2);
                return;
            }
            c30869h.m150050r((char) 230);
            c30869h.m150047o(1);
            return;
        }
        if (AbstractC30871j.m150061g(m150036c)) {
            c30869h.m150050r((char) 235);
            c30869h.m150050r((char) (m150036c - 127));
            c30869h.f142429d++;
        } else {
            c30869h.m150050r((char) (m150036c + 1));
            c30869h.f142429d++;
        }
    }

    /* renamed from: c */
    public int m150008c() {
        return 0;
    }
}
