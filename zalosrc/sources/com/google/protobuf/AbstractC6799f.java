package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6799f implements Iterable, Serializable {

    /* renamed from: q */
    public static final AbstractC6799f f37259q = new i(AbstractC6830s.f37476c);

    /* renamed from: r */
    private static final f f37260r;

    /* renamed from: s */
    private static final Comparator f37261s;

    /* renamed from: p */
    private int f37262p = 0;

    /* renamed from: com.google.protobuf.f$a */
    /* loaded from: classes3.dex */
    public class a extends c {

        /* renamed from: p */
        private int f37263p = 0;

        /* renamed from: q */
        private final int f37264q;

        a() {
            this.f37264q = AbstractC6799f.this.size();
        }

        @Override // com.google.protobuf.AbstractC6799f.g
        /* renamed from: b */
        public byte mo34810b() {
            int i11 = this.f37263p;
            if (i11 < this.f37264q) {
                this.f37263p = i11 + 1;
                return AbstractC6799f.this.mo34800m(i11);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37263p < this.f37264q;
        }
    }

    /* renamed from: com.google.protobuf.f$b */
    /* loaded from: classes3.dex */
    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC6799f abstractC6799f, AbstractC6799f abstractC6799f2) {
            g m34802p = abstractC6799f.m34802p();
            g m34802p2 = abstractC6799f2.m34802p();
            while (m34802p.hasNext() && m34802p2.hasNext()) {
                int compare = Integer.compare(AbstractC6799f.m34796v(m34802p.mo34810b()), AbstractC6799f.m34796v(m34802p2.mo34810b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC6799f.size(), abstractC6799f2.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.f$c */
    /* loaded from: classes3.dex */
    public static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo34810b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.f$d */
    /* loaded from: classes3.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.f$e */
    /* loaded from: classes3.dex */
    public static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: u */
        private final int f37266u;

        /* renamed from: v */
        private final int f37267v;

        e(byte[] bArr, int i11, int i12) {
            super(bArr);
            AbstractC6799f.m34794j(i11, i11 + i12, bArr.length);
            this.f37266u = i11;
            this.f37267v = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC6799f.i
        /* renamed from: E */
        protected int mo34813E() {
            return this.f37266u;
        }

        @Override // com.google.protobuf.AbstractC6799f.i, com.google.protobuf.AbstractC6799f
        /* renamed from: e */
        public byte mo34798e(int i11) {
            AbstractC6799f.m34793g(i11, size());
            return this.f37268t[this.f37266u + i11];
        }

        @Override // com.google.protobuf.AbstractC6799f.i, com.google.protobuf.AbstractC6799f
        /* renamed from: l */
        protected void mo34799l(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f37268t, mo34813E() + i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.AbstractC6799f.i, com.google.protobuf.AbstractC6799f
        /* renamed from: m */
        byte mo34800m(int i11) {
            return this.f37268t[this.f37266u + i11];
        }

        @Override // com.google.protobuf.AbstractC6799f.i, com.google.protobuf.AbstractC6799f
        public int size() {
            return this.f37267v;
        }

        Object writeReplace() {
            return AbstractC6799f.m34791B(m34806u());
        }
    }

    /* renamed from: com.google.protobuf.f$f */
    /* loaded from: classes3.dex */
    private interface f {
    }

    /* renamed from: com.google.protobuf.f$g */
    /* loaded from: classes3.dex */
    public interface g extends Iterator {
        /* renamed from: b */
        byte mo34810b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.f$h */
    /* loaded from: classes3.dex */
    public static abstract class h extends AbstractC6799f {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.m34802p();
        }
    }

    /* renamed from: com.google.protobuf.f$i */
    /* loaded from: classes3.dex */
    public static class i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: t */
        protected final byte[] f37268t;

        i(byte[] bArr) {
            bArr.getClass();
            this.f37268t = bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: C */
        public final void mo34797C(AbstractC6796e abstractC6796e) {
            abstractC6796e.mo34676a(this.f37268t, mo34813E(), size());
        }

        /* renamed from: D */
        final boolean m34814D(AbstractC6799f abstractC6799f, int i11, int i12) {
            if (i12 <= abstractC6799f.size()) {
                int i13 = i11 + i12;
                if (i13 <= abstractC6799f.size()) {
                    if (abstractC6799f instanceof i) {
                        i iVar = (i) abstractC6799f;
                        byte[] bArr = this.f37268t;
                        byte[] bArr2 = iVar.f37268t;
                        int mo34813E = mo34813E() + i12;
                        int mo34813E2 = mo34813E();
                        int mo34813E3 = iVar.mo34813E() + i11;
                        while (mo34813E2 < mo34813E) {
                            if (bArr[mo34813E2] != bArr2[mo34813E3]) {
                                return false;
                            }
                            mo34813E2++;
                            mo34813E3++;
                        }
                        return true;
                    }
                    return abstractC6799f.mo34805t(i11, i13).equals(mo34805t(0, i12));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + abstractC6799f.size());
            }
            throw new IllegalArgumentException("Length too large: " + i12 + size());
        }

        /* renamed from: E */
        protected int mo34813E() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: e */
        public byte mo34798e(int i11) {
            return this.f37268t[i11];
        }

        @Override // com.google.protobuf.AbstractC6799f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC6799f) || size() != ((AbstractC6799f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                int m34804s = m34804s();
                int m34804s2 = iVar.m34804s();
                if (m34804s != 0 && m34804s2 != 0 && m34804s != m34804s2) {
                    return false;
                }
                return m34814D(iVar, 0, size());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: l */
        protected void mo34799l(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f37268t, i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: m */
        byte mo34800m(int i11) {
            return this.f37268t[i11];
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: n */
        public final boolean mo34801n() {
            int mo34813E = mo34813E();
            return AbstractC6807h1.m34964m(this.f37268t, mo34813E, size() + mo34813E);
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: r */
        protected final int mo34803r(int i11, int i12, int i13) {
            return AbstractC6830s.m35137i(i11, this.f37268t, mo34813E() + i12, i13);
        }

        @Override // com.google.protobuf.AbstractC6799f
        public int size() {
            return this.f37268t.length;
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: t */
        public final AbstractC6799f mo34805t(int i11, int i12) {
            int m34794j = AbstractC6799f.m34794j(i11, i12, size());
            if (m34794j == 0) {
                return AbstractC6799f.f37259q;
            }
            return new e(this.f37268t, mo34813E() + i11, m34794j);
        }

        @Override // com.google.protobuf.AbstractC6799f
        /* renamed from: x */
        protected final String mo34808x(Charset charset) {
            return new String(this.f37268t, mo34813E(), size(), charset);
        }
    }

    /* renamed from: com.google.protobuf.f$j */
    /* loaded from: classes3.dex */
    private static final class j implements f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        f dVar;
        if (AbstractC6793d.m34762c()) {
            dVar = new j(null);
        } else {
            dVar = new d(null);
        }
        f37260r = dVar;
        f37261s = new b();
    }

    AbstractC6799f() {
    }

    /* renamed from: A */
    private String m34790A() {
        if (size() <= 50) {
            return AbstractC6789b1.m34734a(this);
        }
        return AbstractC6789b1.m34734a(mo34805t(0, 47)) + "...";
    }

    /* renamed from: B */
    static AbstractC6799f m34791B(byte[] bArr) {
        return new i(bArr);
    }

    /* renamed from: g */
    static void m34793g(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    /* renamed from: j */
    static int m34794j(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) < 0) {
            if (i11 >= 0) {
                if (i12 < i11) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
                }
                throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        return i14;
    }

    /* renamed from: k */
    public static AbstractC6799f m34795k(String str) {
        return new i(str.getBytes(AbstractC6830s.f37474a));
    }

    /* renamed from: v */
    public static int m34796v(byte b11) {
        return b11 & 255;
    }

    /* renamed from: C */
    public abstract void mo34797C(AbstractC6796e abstractC6796e);

    /* renamed from: e */
    public abstract byte mo34798e(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.f37262p;
        if (i11 == 0) {
            int size = size();
            i11 = mo34803r(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f37262p = i11;
        }
        return i11;
    }

    /* renamed from: l */
    protected abstract void mo34799l(byte[] bArr, int i11, int i12, int i13);

    /* renamed from: m */
    abstract byte mo34800m(int i11);

    /* renamed from: n */
    public abstract boolean mo34801n();

    /* renamed from: p */
    public g m34802p() {
        return new a();
    }

    /* renamed from: r */
    protected abstract int mo34803r(int i11, int i12, int i13);

    /* renamed from: s */
    protected final int m34804s() {
        return this.f37262p;
    }

    public abstract int size();

    /* renamed from: t */
    public abstract AbstractC6799f mo34805t(int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m34790A());
    }

    /* renamed from: u */
    public final byte[] m34806u() {
        int size = size();
        if (size == 0) {
            return AbstractC6830s.f37476c;
        }
        byte[] bArr = new byte[size];
        mo34799l(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: w */
    public final String m34807w(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return mo34808x(charset);
    }

    /* renamed from: x */
    protected abstract String mo34808x(Charset charset);

    /* renamed from: z */
    public final String m34809z() {
        return m34807w(AbstractC6830s.f37474a);
    }
}
