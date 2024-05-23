package jm0;

import java.io.File;
import java.io.OutputStream;
import java.util.Hashtable;

/* renamed from: jm0.f */
/* loaded from: classes7.dex */
public class C21296f extends AbstractC21293c {

    /* renamed from: f */
    private final File f103738f;

    /* renamed from: g */
    private final long f103739g;

    /* renamed from: h */
    public String f103740h;

    /* renamed from: i */
    private byte[] f103741i;

    /* renamed from: j */
    public int f103742j;

    /* renamed from: k */
    private int f103743k;

    /* renamed from: l */
    private boolean f103744l;

    /* renamed from: m */
    private Hashtable f103745m;

    public C21296f(String str, String str2, String str3, String str4) {
        super(str, str2, str3);
        this.f103743k = 524288;
        this.f103744l = false;
        this.f103742j = 0;
        this.f103740h = str4;
        this.f103738f = null;
        this.f103739g = 0L;
    }

    @Override // jm0.AbstractC21293c
    /* renamed from: c */
    public long mo110259c() {
        return m110260d() + this.f103739g;
    }

    @Override // jm0.AbstractC21293c
    /* renamed from: f */
    protected void mo110262f(OutputStream outputStream) {
    }

    /* renamed from: h */
    public void m110265h(Hashtable hashtable) {
        this.f103745m = hashtable;
    }

    /* renamed from: i */
    public byte[] m110266i() {
        return this.f103741i;
    }

    /* renamed from: j */
    public int m110267j() {
        return this.f103743k;
    }

    /* renamed from: k */
    public boolean m110268k() {
        return this.f103744l;
    }

    /* renamed from: l */
    public Hashtable m110269l() {
        return this.f103745m;
    }

    /* renamed from: m */
    public void m110270m(int i11) {
        this.f103743k = i11;
    }

    /* renamed from: n */
    public void m110271n(boolean z11) {
        this.f103744l = z11;
    }

    public C21296f(String str, String str2, String str3, File file) {
        super(str, str2, str3);
        this.f103740h = "";
        this.f103743k = 524288;
        this.f103744l = false;
        this.f103738f = file;
        this.f103739g = file.length();
        this.f103742j = 0;
        this.f103740h = file.getPath();
    }

    public C21296f(String str, byte[] bArr) {
        super("file", "file", str);
        this.f103740h = "";
        this.f103743k = 524288;
        this.f103744l = false;
        this.f103742j = 1;
        this.f103741i = bArr;
        this.f103739g = 0L;
        this.f103738f = null;
    }

    public C21296f(String str, String str2, String str3, byte[] bArr) {
        super(str, str2, str3);
        this.f103740h = "";
        this.f103743k = 524288;
        this.f103744l = false;
        this.f103742j = 1;
        this.f103741i = bArr;
        this.f103739g = 0L;
        this.f103738f = null;
    }
}
