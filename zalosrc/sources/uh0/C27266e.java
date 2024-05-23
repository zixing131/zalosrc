package uh0;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import uh0.C27265d;

/* renamed from: uh0.e */
/* loaded from: classes7.dex */
public class C27266e {

    /* renamed from: k */
    private static final Pattern f128219k = Pattern.compile("(\\S+): (.+)");

    /* renamed from: e */
    private final ByteBuffer f128224e;

    /* renamed from: f */
    public final C27265d f128225f;

    /* renamed from: g */
    private boolean f128226g;

    /* renamed from: h */
    private final AtomicBoolean f128227h;

    /* renamed from: i */
    private long f128228i;

    /* renamed from: j */
    private C27262a f128229j;

    /* renamed from: b */
    private final List f128221b = new ArrayList();

    /* renamed from: a */
    private final C27264c f128220a = new C27264c();

    /* renamed from: c */
    private boolean f128222c = true;

    /* renamed from: d */
    private int f128223d = 0;

    /* renamed from: uh0.e$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo137221a(String str, int i11, C27264c c27264c);

        /* renamed from: b */
        void mo137222b(String str, int i11, C27264c c27264c);

        /* renamed from: c */
        void mo137223c(String str, byte[] bArr, C27264c c27264c);

        /* renamed from: d */
        void mo137224d(String str, String str2);
    }

    public C27266e(C27265d c27265d) {
        ByteBuffer allocate = ByteBuffer.allocate(65536);
        this.f128224e = allocate;
        allocate.limit(0);
        this.f128225f = c27265d;
        this.f128226g = false;
        this.f128227h = new AtomicBoolean(false);
        this.f128228i = 0L;
        this.f128229j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:            if (java.lang.Long.parseLong(r7.f128220a.m139555b("content-length")) == r7.f128228i) goto L47;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m139573a() {
        int i11 = this.f128223d;
        boolean z11 = true;
        if (i11 != 204 && ((300 > i11 || i11 >= 400) && (m139574e() || this.f128220a.m139557d("content-length")))) {
        }
        if (z11) {
            m139576c();
        }
        return z11;
        z11 = false;
        if (z11) {
        }
        return z11;
    }

    /* renamed from: e */
    private boolean m139574e() {
        return "chunked".equalsIgnoreCase(this.f128220a.m139555b("transfer-encoding"));
    }

    /* renamed from: b */
    public String m139575b() {
        int i11 = this.f128223d;
        if (300 <= i11 && i11 < 400 && this.f128220a.m139557d(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
            return this.f128220a.m139555b(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        }
        return null;
    }

    /* renamed from: c */
    public void m139576c() {
        if (this.f128226g) {
            return;
        }
        this.f128226g = true;
        if (!this.f128227h.get()) {
            if (this.f128223d != 0) {
                this.f128225f.m139572m(C27265d.a.DONE);
                if (m139575b() == null) {
                    C27265d c27265d = this.f128225f;
                    c27265d.f128208g.mo137221a(c27265d.f128202a.f128231a, this.f128223d, this.f128220a);
                    return;
                }
                return;
            }
            this.f128225f.m139572m(C27265d.a.ERROR);
            C27265d c27265d2 = this.f128225f;
            c27265d2.f128208g.mo137224d(c27265d2.f128202a.f128231a, "Remote connection broken ");
        }
    }

    /* renamed from: d */
    public byte[] m139577d() {
        if (!this.f128224e.hasRemaining()) {
            return new byte[0];
        }
        byte[] bArr = new byte[this.f128224e.remaining()];
        this.f128224e.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:            if (r8.f128222c == false) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:            if (r5 >= r9.length) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:            r8.f128221b.add(java.util.Arrays.copyOfRange(r9, r5, r9.length));     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:            if (r8.f128226g == false) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:            r8.f128225f.m139570k("Unexpected close connection from remote server");        r9 = r8.f128225f;        r10.mo137224d(r9.f128202a.f128231a, r9.m139561b());     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:            r9 = r8.f128222c;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0185, code lost:            r8.f128227h.set(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018a, code lost:            return r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:            if (m139574e() == false) goto L137;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:            r8.f128229j = new uh0.C27262a();     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:            r8.f128225f.m139572m(uh0.C27265d.a.RECV_DATA);        r10.mo137222b(r8.f128225f.f128202a.f128231a, r8.f128223d, r8.f128220a);     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:            if (m139575b() == null) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:            r8.f128225f.m139572m(uh0.C27265d.a.DONE);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:            r8.f128227h.set(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:            if (r5 >= r9.length) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:            m139580h(java.nio.ByteBuffer.wrap(r9, r5, r9.length - r5), r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0168, code lost:            m139573a();     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:            if (r8.f128226g == false) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:            r8.f128225f.m139572m(uh0.C27265d.a.DONE);        r10.mo137221a(r8.f128225f.f128202a.f128231a, r8.f128223d, r8.f128220a);     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m139578f(byte[] bArr, a aVar) {
        char c11;
        this.f128227h.set(true);
        try {
            if (!this.f128221b.isEmpty()) {
                List list = this.f128221b;
                byte[] bArr2 = (byte[]) list.get(list.size() - 1);
                c11 = (char) bArr2[bArr2.length - 1];
            } else {
                c11 = 0;
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= bArr.length) {
                    break;
                }
                byte b11 = bArr[i11];
                if (10 == b11 && '\r' == c11) {
                    if (i11 - i12 > 1) {
                        this.f128221b.add(Arrays.copyOfRange(bArr, i12, i11 - 1));
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Iterator it = this.f128221b.iterator();
                    while (it.hasNext()) {
                        try {
                            byteArrayOutputStream.write((byte[]) it.next());
                        } catch (IOException unused) {
                        }
                    }
                    String str = new String(byteArrayOutputStream.toByteArray());
                    if (str.matches("HTTP/\\S* (\\d+) \\w+( \\w+)*")) {
                        if (this.f128223d == 0) {
                            this.f128223d = Integer.parseInt(str.replaceAll("HTTP/\\S* (\\d+) \\w+( \\w+)*", "$1"));
                        } else {
                            throw new IOException("Invalid http header: Already parse status of response. Header line: " + str + " - statusCode: " + this.f128223d);
                        }
                    } else {
                        if (str.isEmpty()) {
                            this.f128221b.clear();
                            i12 = i11 + 1;
                            this.f128222c = false;
                            break;
                        }
                        Matcher matcher = f128219k.matcher(str);
                        if (matcher.find()) {
                            this.f128220a.m139558e(matcher.group(1).toLowerCase().trim(), matcher.group(2).trim());
                        } else {
                            throw new IOException("Invalid http header: Header line is invalid: " + str);
                        }
                    }
                    this.f128221b.clear();
                    i12 = i11 + 1;
                    c11 = 0;
                } else {
                    c11 = (char) b11;
                }
                i11++;
            }
        } catch (Throwable th2) {
            this.f128227h.set(false);
            throw th2;
        }
    }

    /* renamed from: g */
    public int m139579g(SocketChannel socketChannel) {
        if (this.f128225f.m139566g()) {
            return -1;
        }
        this.f128224e.clear();
        int read = socketChannel.read(this.f128224e);
        this.f128224e.flip();
        if (read > 0) {
            this.f128227h.set(true);
        }
        return read;
    }

    /* renamed from: h */
    public void m139580h(ByteBuffer byteBuffer, a aVar) {
        this.f128227h.set(true);
        try {
            if (byteBuffer.hasRemaining()) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                this.f128228i += remaining;
                C27262a c27262a = this.f128229j;
                if (c27262a == null) {
                    aVar.mo137223c(this.f128225f.f128202a.f128231a, bArr, this.f128220a);
                } else {
                    byte[] m139547a = c27262a.m139547a(bArr);
                    if (m139547a != null) {
                        if (m139547a.length == 0) {
                            m139576c();
                        } else {
                            aVar.mo137223c(this.f128225f.f128202a.f128231a, m139547a, this.f128220a);
                            byte[] m139547a2 = this.f128229j.m139547a(new byte[0]);
                            if (m139547a2 != null) {
                                if (m139547a2.length == 0) {
                                    m139576c();
                                } else {
                                    throw new IOException("Illegal state when check eof chunked encoding");
                                }
                            }
                        }
                    }
                }
            }
            m139573a();
            if (this.f128226g) {
                this.f128225f.m139572m(C27265d.a.DONE);
                if (m139575b() == null) {
                    aVar.mo137221a(this.f128225f.f128202a.f128231a, this.f128223d, this.f128220a);
                }
            }
            this.f128227h.set(false);
        } catch (Throwable th2) {
            this.f128227h.set(false);
            throw th2;
        }
    }
}
