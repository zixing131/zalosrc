package p675ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ya.m */
/* loaded from: classes3.dex */
public final class C30874m extends C30864c {
    @Override // p675ya.C30864c
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
        if (c11 >= 'a' && c11 <= 'z') {
            sb2.append((char) (c11 - 'S'));
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
        if (c11 >= '[' && c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 == '`') {
            sb2.append((char) 2);
            sb2.append((char) (c11 - '`'));
            return 2;
        }
        if (c11 <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) (c11 - '@'));
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

    @Override // p675ya.C30864c
    /* renamed from: e */
    public int mo150015e() {
        return 2;
    }
}
