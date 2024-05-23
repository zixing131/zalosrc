package com.zing.zalo.zbrowser.cache;

import com.zing.zalo.leveldb.AbstractC8942a;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p657xt.C30203a;
import p664y.AbstractC30228a;

/* renamed from: com.zing.zalo.zbrowser.cache.f */
/* loaded from: classes7.dex */
public class C16902f {

    /* renamed from: a */
    private String f86121a;

    /* renamed from: b */
    private long f86122b;

    /* renamed from: e */
    private String f86125e;

    /* renamed from: f */
    private long f86126f;

    /* renamed from: h */
    private AbstractC8942a f86128h;

    /* renamed from: g */
    private long f86127g = 5242880;

    /* renamed from: i */
    private int f86129i = 8;

    /* renamed from: d */
    private ArrayList f86124d = new ArrayList();

    /* renamed from: c */
    ArrayList f86123c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zbrowser.cache.f$a */
    /* loaded from: classes7.dex */
    public class a implements Serializable, Comparable {

        /* renamed from: p */
        long f86130p;

        /* renamed from: q */
        byte[] f86131q;

        public a(long j11, byte[] bArr) {
            this.f86130p = j11;
            this.f86131q = bArr;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j11 = this.f86130p;
            long j12 = aVar.f86130p;
            if (j11 < j12) {
                return -1;
            }
            if (j11 > j12) {
                return 1;
            }
            return 0;
        }
    }

    public C16902f(String str, String str2, long j11) {
        this.f86121a = str2;
        this.f86125e = str;
        if (j11 <= 0) {
            this.f86122b = this.f86127g;
        } else {
            this.f86122b = j11;
        }
        m90437d();
    }

    /* renamed from: a */
    private Long m90436a(byte[] bArr) {
        long j11 = 0;
        for (int i11 = 0; i11 < this.f86129i; i11++) {
            j11 = (j11 << 8) | (bArr[i11] & 255);
        }
        return Long.valueOf(j11);
    }

    /* renamed from: d */
    private boolean m90437d() {
        try {
            AbstractC8942a.b m47700c = AbstractC8942a.m47700c();
            m47700c.m47709a(true);
            m47700c.m47715g(AbstractC8942a.b.EnumC32711b.kNoCompression);
            AbstractC8942a m47702t = AbstractC8942a.m47702t(this.f86125e + "/" + this.f86121a, m47700c);
            this.f86128h = m47702t;
            C30203a mo47687o = m47702t.mo47687o();
            mo47687o.m148961h();
            while (mo47687o.m148959f()) {
                byte[] m148957d = mo47687o.m148957d();
                Long m90438g = m90438g(mo47687o.m148958e());
                if (m90438g != null && m148957d != null) {
                    this.f86126f += m148957d.length + m90440j(r3);
                    this.f86123c.add(new a(m90438g.longValue(), m148957d));
                }
                mo47687o.m148960g();
            }
            mo47687o.m148954a();
            Collections.sort(this.f86123c, new C16901e());
            return true;
        } catch (Exception e11) {
            m90446q(ZAbstractBase.ZVU_BLEND_PERCENTAGE, e11.getMessage());
            return false;
        }
    }

    /* renamed from: g */
    private Long m90438g(byte[] bArr) {
        if (bArr != null) {
            int i11 = this.f86129i;
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            return m90436a(bArr2);
        }
        return null;
    }

    /* renamed from: i */
    private byte[] m90439i(byte[] bArr) {
        if (bArr != null) {
            int m90440j = m90440j(bArr);
            byte[] bArr2 = new byte[m90440j];
            System.arraycopy(bArr, this.f86129i, bArr2, 0, m90440j);
            return bArr2;
        }
        return null;
    }

    /* renamed from: j */
    private int m90440j(byte[] bArr) {
        return bArr.length - this.f86129i;
    }

    /* renamed from: k */
    private boolean m90441k(String str) {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte[] mo47685i = this.f86128h.mo47685i(bytes);
            Long m90438g = m90438g(mo47685i);
            if (m90438g != null) {
                long length = bytes.length + m90440j(mo47685i);
                this.f86128h.mo47683d(str);
                int binarySearch = Collections.binarySearch(this.f86123c, new a(m90438g.longValue(), bytes));
                if (binarySearch >= 0) {
                    this.f86123c.remove(binarySearch);
                }
                this.f86126f -= length;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: l */
    private boolean m90442l() {
        byte[] bArr;
        byte[] mo47685i;
        try {
            if (this.f86123c.size() >= 1 && this.f86123c.get(0) != null && (mo47685i = this.f86128h.mo47685i((bArr = ((a) this.f86123c.get(0)).f86131q))) != null) {
                this.f86128h.mo47683d(new String(bArr, 0, bArr.length));
                this.f86123c.remove(0);
                this.f86126f -= bArr.length + m90440j(mo47685i);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: m */
    private String m90443m(String str) {
        try {
            byte[] m90439i = m90439i(this.f86128h.mo47684h(str));
            if (m90439i != null) {
                m90444n(str, m90439i, System.currentTimeMillis());
                return new String(m90439i, StandardCharsets.UTF_8);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: n */
    private boolean m90444n(String str, byte[] bArr, long j11) {
        byte[] m90445o = m90445o(j11);
        byte[] bArr2 = new byte[bArr.length + m90445o.length];
        try {
            System.arraycopy(m90445o, 0, bArr2, 0, m90445o.length);
            System.arraycopy(bArr, 0, bArr2, m90445o.length, bArr.length);
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            Long m90438g = m90438g(this.f86128h.mo47685i(bytes));
            if (m90438g != null) {
                int binarySearch = Collections.binarySearch(this.f86123c, new a(m90438g.longValue(), bytes), new C16901e());
                if (binarySearch >= 0) {
                    this.f86123c.remove(binarySearch);
                }
                this.f86128h.mo47683d(str);
                this.f86126f -= bytes.length + bArr.length;
            }
            long length = bytes.length + bArr.length;
            while (true) {
                if (this.f86126f + length <= this.f86122b) {
                    break;
                }
                if (!m90442l()) {
                    if (this.f86126f + length > this.f86122b) {
                        return false;
                    }
                }
            }
            this.f86126f += length;
            this.f86128h.m47703v(str, bArr2);
            this.f86123c.add(new a(j11, bytes));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    private byte[] m90445o(long j11) {
        int i11 = this.f86129i;
        byte[] bArr = new byte[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i12] = (byte) (255 & j11);
            j11 >>= 8;
        }
        return bArr;
    }

    /* renamed from: q */
    private void m90446q(int i11, String str) {
        Iterator it = this.f86124d.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC30228a.m149044a(it.next());
        throw null;
    }

    /* renamed from: b */
    public void m90447b() {
        ArrayList arrayList = this.f86123c;
        if (arrayList != null) {
            arrayList.clear();
        }
        try {
            AbstractC8942a abstractC8942a = this.f86128h;
            if (abstractC8942a != null) {
                abstractC8942a.close();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        this.f86126f = 0L;
        m90437d();
    }

    /* renamed from: c */
    public void m90448c() {
        ArrayList arrayList = this.f86123c;
        if (arrayList != null) {
            arrayList.clear();
            this.f86123c = null;
        }
        ArrayList arrayList2 = this.f86124d;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f86124d = null;
        }
        AbstractC8942a abstractC8942a = this.f86128h;
        if (abstractC8942a != null) {
            try {
                abstractC8942a.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public boolean m90449e(String str) {
        if (this.f86128h != null) {
            return m90441k(str);
        }
        return false;
    }

    /* renamed from: f */
    public String m90450f(String str) {
        if (this.f86128h != null && str != null) {
            try {
                return m90443m(str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: h */
    public long m90451h() {
        return this.f86126f;
    }

    /* renamed from: p */
    public boolean m90452p(String str, String str2) {
        if (this.f86128h != null && str != null && str2 != null) {
            return m90444n(str, str2.getBytes(StandardCharsets.UTF_8), System.currentTimeMillis());
        }
        return false;
    }
}
