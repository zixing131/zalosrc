package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.AbstractC1452r;
import androidx.core.util.AbstractC1487i;
import java.nio.ByteBuffer;
import p469r1.C25600b;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes2.dex */
public final class C1706n {

    /* renamed from: a */
    private final C25600b f6887a;

    /* renamed from: b */
    private final char[] f6888b;

    /* renamed from: c */
    private final a f6889c = new a(1024);

    /* renamed from: d */
    private final Typeface f6890d;

    /* renamed from: androidx.emoji2.text.n$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final SparseArray f6891a;

        /* renamed from: b */
        private C1708p f6892b;

        private a() {
            this(1);
        }

        /* renamed from: a */
        public a m8751a(int i11) {
            SparseArray sparseArray = this.f6891a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i11);
        }

        /* renamed from: b */
        public final C1708p m8752b() {
            return this.f6892b;
        }

        /* renamed from: c */
        void m8753c(C1708p c1708p, int i11, int i12) {
            a m8751a = m8751a(c1708p.m8756b(i11));
            if (m8751a == null) {
                m8751a = new a();
                this.f6891a.put(c1708p.m8756b(i11), m8751a);
            }
            if (i12 > i11) {
                m8751a.m8753c(c1708p, i11 + 1, i12);
            } else {
                m8751a.f6892b = c1708p;
            }
        }

        a(int i11) {
            this.f6891a = new SparseArray(i11);
        }
    }

    private C1706n(Typeface typeface, C25600b c25600b) {
        this.f6890d = typeface;
        this.f6887a = c25600b;
        this.f6888b = new char[c25600b.m132247k() * 2];
        m8744a(c25600b);
    }

    /* renamed from: a */
    private void m8744a(C25600b c25600b) {
        int m132247k = c25600b.m132247k();
        for (int i11 = 0; i11 < m132247k; i11++) {
            C1708p c1708p = new C1708p(this, i11);
            Character.toChars(c1708p.m8760f(), this.f6888b, i11 * 2);
            m8750g(c1708p);
        }
    }

    /* renamed from: b */
    public static C1706n m8745b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            AbstractC1452r.m7366a("EmojiCompat.MetadataRepo.create");
            return new C1706n(typeface, AbstractC1705m.m8737b(byteBuffer));
        } finally {
            AbstractC1452r.m7367b();
        }
    }

    /* renamed from: c */
    public char[] m8746c() {
        return this.f6888b;
    }

    /* renamed from: d */
    public C25600b m8747d() {
        return this.f6887a;
    }

    /* renamed from: e */
    public a m8748e() {
        return this.f6889c;
    }

    /* renamed from: f */
    public Typeface m8749f() {
        return this.f6890d;
    }

    /* renamed from: g */
    void m8750g(C1708p c1708p) {
        boolean z11;
        AbstractC1487i.m7493h(c1708p, "emoji metadata cannot be null");
        if (c1708p.m8757c() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC1487i.m7487b(z11, "invalid metadata codepoint length");
        this.f6889c.m8753c(c1708p, 0, c1708p.m8757c() - 1);
    }
}
