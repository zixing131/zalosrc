package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.n */
/* loaded from: classes3.dex */
public final class C30875n extends C30864c {
    @Override // p675ya.C30864c, p675ya.InterfaceC30868g
    /* renamed from: a */
    public void mo150007a(C30869h c30869h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c30869h.m150041i()) {
                break;
            }
            char m150036c = c30869h.m150036c();
            c30869h.f142429d++;
            mo150014c(m150036c, sb2);
            if (sb2.length() % 3 == 0) {
                C30864c.m150013g(c30869h, sb2);
                if (AbstractC30871j.m150068n(c30869h.m150037d(), c30869h.f142429d, mo150015e()) != mo150015e()) {
                    c30869h.m150047o(0);
                    break;
                }
            }
        }
        mo150016f(c30869h, sb2);
    }

    @Override // p675ya.C30864c
    /* renamed from: c */
    int mo150014c(char c11, StringBuilder sb2) {
        if (c11 != '\r') {
            if (c11 != ' ') {
                if (c11 != '*') {
                    if (c11 != '>') {
                        if (c11 >= '0' && c11 <= '9') {
                            sb2.append((char) (c11 - ','));
                        } else if (c11 >= 'A' && c11 <= 'Z') {
                            sb2.append((char) (c11 - '3'));
                        } else {
                            AbstractC30871j.m150059e(c11);
                        }
                    } else {
                        sb2.append((char) 2);
                    }
                } else {
                    sb2.append((char) 1);
                }
            } else {
                sb2.append((char) 3);
            }
        } else {
            sb2.append((char) 0);
        }
        return 1;
    }

    @Override // p675ya.C30864c
    /* renamed from: e */
    public int mo150015e() {
        return 3;
    }

    @Override // p675ya.C30864c
    /* renamed from: f */
    void mo150016f(C30869h c30869h, StringBuilder sb2) {
        c30869h.m150048p();
        int m150073a = c30869h.m150040g().m150073a() - c30869h.m150034a();
        c30869h.f142429d -= sb2.length();
        if (c30869h.m150039f() > 1 || m150073a > 1 || c30869h.m150039f() != m150073a) {
            c30869h.m150050r((char) 254);
        }
        if (c30869h.m150038e() < 0) {
            c30869h.m150047o(0);
        }
    }
}
