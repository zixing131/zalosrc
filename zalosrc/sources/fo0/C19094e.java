package fo0;

import java.util.BitSet;

/* renamed from: fo0.e */
/* loaded from: classes7.dex */
public class C19094e {

    /* renamed from: a */
    private final C19090a f95034a;

    /* renamed from: b */
    private final C19091b f95035b;

    /* renamed from: c */
    private final C19090a f95036c;

    /* renamed from: d */
    private BitSet f95037d;

    /* renamed from: e */
    private BitSet f95038e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19094e(C19090a c19090a, C19091b c19091b, C19090a c19090a2, BitSet bitSet, BitSet bitSet2) {
        this.f95037d = new BitSet();
        new BitSet();
        this.f95034a = c19090a;
        this.f95035b = c19091b;
        this.f95036c = c19090a2;
        this.f95037d = bitSet;
        this.f95038e = bitSet2;
    }

    /* renamed from: a */
    public int m100296a(char c11) {
        return this.f95034a.m100285a(c11);
    }

    /* renamed from: b */
    public char m100297b(char c11, char c12) {
        return (char) this.f95036c.m100285a((c11 << 16) | c12);
    }

    /* renamed from: c */
    public void m100298c(boolean z11, char c11, StringBuffer stringBuffer) {
        String m100287a = this.f95035b.m100287a(c11);
        if (m100287a != null && (!z11 || !this.f95037d.get(c11))) {
            for (int i11 = 0; i11 < m100287a.length(); i11++) {
                m100298c(z11, m100287a.charAt(i11), stringBuffer);
            }
            return;
        }
        stringBuffer.append(c11);
    }
}
