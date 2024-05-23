package p259j8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p259j8.C21091e;

/* renamed from: j8.f */
/* loaded from: classes.dex */
class C21092f implements InterfaceC21087a {

    /* renamed from: d */
    private static final Charset f103109d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f103110a;

    /* renamed from: b */
    private final int f103111b;

    /* renamed from: c */
    private C21091e f103112c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j8.f$a */
    /* loaded from: classes.dex */
    public class a implements C21091e.d {

        /* renamed from: a */
        final /* synthetic */ byte[] f103113a;

        /* renamed from: b */
        final /* synthetic */ int[] f103114b;

        a(byte[] bArr, int[] iArr) {
            this.f103113a = bArr;
            this.f103114b = iArr;
        }

        @Override // p259j8.C21091e.d
        /* renamed from: a */
        public void mo109602a(InputStream inputStream, int i11) {
            try {
                inputStream.read(this.f103113a, this.f103114b[0], i11);
                int[] iArr = this.f103114b;
                iArr[0] = iArr[0] + i11;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final byte[] f103116a;

        /* renamed from: b */
        public final int f103117b;

        b(byte[] bArr, int i11) {
            this.f103116a = bArr;
            this.f103117b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21092f(File file, int i11) {
        this.f103110a = file;
        this.f103111b = i11;
    }

    /* renamed from: f */
    private void m109603f(long j11, String str) {
        if (this.f103112c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i11 = this.f103111b / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f103112c.m109597f(String.format(Locale.US, "%d %s%n", Long.valueOf(j11), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f103109d));
            while (!this.f103112c.m109601s() && this.f103112c.m109596M() > this.f103111b) {
                this.f103112c.m109595G();
            }
        } catch (IOException e11) {
            C18821f.m98795f().m98799e("There was a problem writing to the Crashlytics log.", e11);
        }
    }

    /* renamed from: g */
    private b m109604g() {
        if (!this.f103110a.exists()) {
            return null;
        }
        m109605h();
        C21091e c21091e = this.f103112c;
        if (c21091e == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c21091e.m109596M()];
        try {
            this.f103112c.m109600q(new a(bArr, iArr));
        } catch (IOException e11) {
            C18821f.m98795f().m98799e("A problem occurred while reading the Crashlytics log file.", e11);
        }
        return new b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m109605h() {
        if (this.f103112c == null) {
            try {
                this.f103112c = new C21091e(this.f103110a);
            } catch (IOException e11) {
                C18821f.m98795f().m98799e("Could not open log file: " + this.f103110a, e11);
            }
        }
    }

    @Override // p259j8.InterfaceC21087a
    /* renamed from: a */
    public void mo109546a() {
        AbstractC20395h.m106209e(this.f103112c, "There was a problem closing the Crashlytics log file.");
        this.f103112c = null;
    }

    @Override // p259j8.InterfaceC21087a
    /* renamed from: b */
    public String mo109547b() {
        byte[] mo109548c = mo109548c();
        if (mo109548c != null) {
            return new String(mo109548c, f103109d);
        }
        return null;
    }

    @Override // p259j8.InterfaceC21087a
    /* renamed from: c */
    public byte[] mo109548c() {
        b m109604g = m109604g();
        if (m109604g == null) {
            return null;
        }
        int i11 = m109604g.f103117b;
        byte[] bArr = new byte[i11];
        System.arraycopy(m109604g.f103116a, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // p259j8.InterfaceC21087a
    /* renamed from: d */
    public void mo109549d() {
        mo109546a();
        this.f103110a.delete();
    }

    @Override // p259j8.InterfaceC21087a
    /* renamed from: e */
    public void mo109550e(long j11, String str) {
        m109605h();
        m109603f(j11, str);
    }
}
