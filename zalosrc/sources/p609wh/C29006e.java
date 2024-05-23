package p609wh;

import android.text.TextUtils;
import hm0.C20096c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import me0.AbstractC23228u2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONObject;

/* renamed from: wh.e */
/* loaded from: classes3.dex */
public class C29006e extends AbstractC29002c {

    /* renamed from: K */
    private final AbstractC29004d f134294K;

    /* renamed from: L */
    private final File f134295L;

    /* renamed from: M */
    private long f134296M;

    /* renamed from: N */
    private final String f134297N;

    /* renamed from: O */
    private long f134298O;

    /* renamed from: P */
    private long f134299P;

    /* renamed from: Q */
    private boolean f134300Q;

    public C29006e(File file, long j11, String str, AbstractC29004d abstractC29004d) {
        super(abstractC29004d);
        this.f134296M = -1L;
        this.f134298O = -1L;
        this.f134299P = -1L;
        this.f134300Q = false;
        this.f134294K = abstractC29004d;
        this.f134295L = file;
        if (j11 > 0) {
            this.f134296M = j11;
        }
        this.f134297N = str;
    }

    /* renamed from: n0 */
    private InputStream m144880n0(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
            this.f134300Q = true;
            inputStream = new GZIPInputStream(inputStream);
        }
        return new BufferedInputStream(inputStream);
    }

    /* renamed from: o0 */
    private void m144881o0(HttpURLConnection httpURLConnection) {
        m144885s0(httpURLConnection);
        if (httpURLConnection.getHeaderFields().containsKey("Content-Length")) {
            try {
                boolean containsKey = httpURLConnection.getHeaderFields().containsKey("Content-Range");
                this.f134298O = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
                if (containsKey && this.f134299P > -1) {
                    if (AbstractC23228u2.m119705d(httpURLConnection.getHeaderField("Content-Range")) != null) {
                        if (r7.m119707a() != this.f134299P) {
                        }
                    }
                    this.f134295L.delete();
                } else {
                    this.f134295L.delete();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: p0 */
    private void m144882p0() {
        if ((this.f134296M != -1 && this.f134295L.length() != this.f134296M) || (!TextUtils.isEmpty(this.f134297N) && !AbstractC23352g.m122787c(this.f134297N, this.f134295L))) {
            if (this.f134296M != -1 && this.f134295L.length() >= this.f134296M) {
                m144883q0("Md5 checksum failed or lengths not matches!");
                return;
            }
            AbstractC29004d abstractC29004d = this.f134294K;
            if (abstractC29004d != null) {
                abstractC29004d.mo1342c(new C20096c(50001, "Download was interrupted!"));
                return;
            }
            return;
        }
        m144884r0();
    }

    /* renamed from: q0 */
    private void m144883q0(String str) {
        this.f134295L.delete();
        AbstractC29004d abstractC29004d = this.f134294K;
        if (abstractC29004d != null) {
            abstractC29004d.mo1342c(new C20096c(502, str));
        }
    }

    /* renamed from: r0 */
    private void m144884r0() {
        AbstractC29004d abstractC29004d = this.f134294K;
        if (abstractC29004d != null) {
            abstractC29004d.mo1343f(new JSONObject());
        }
        m110300S();
    }

    /* renamed from: s0 */
    private void m144885s0(HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            for (String str2 : headerFields.get(str)) {
                AbstractC23350e.m122774d(C29037t0.f134385J, str + ":" + str2);
            }
        }
    }

    /* renamed from: t0 */
    private void m144886t0(InputStream inputStream, OutputStream outputStream, long j11, long j12) {
        byte[] bArr = new byte[1024];
        while (true) {
            long j13 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    j13 += read;
                } else {
                    return;
                }
            } while (j13 <= 4096);
            j11 += j13;
            AbstractC29004d abstractC29004d = this.f134294K;
            if (abstractC29004d != null) {
                abstractC29004d.mo144879g(j11, j12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jm0.AbstractC21298h
    /* renamed from: I */
    public void mo110293I(HttpURLConnection httpURLConnection, int i11) {
        this.f134295L.delete();
        super.mo110293I(httpURLConnection, i11);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: J */
    protected void mo110294J(HttpURLConnection httpURLConnection) {
        long length;
        m144881o0(httpURLConnection);
        InputStream m144880n0 = m144880n0(httpURLConnection);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f134295L, true));
        try {
            long length2 = this.f134295L.length();
            if (this.f134300Q) {
                length = this.f134296M;
            } else {
                length = this.f134295L.length() + this.f134298O;
            }
            m144886t0(m144880n0, bufferedOutputStream, length2, length);
            bufferedOutputStream.close();
            m144880n0.close();
            m144882p0();
        } catch (Throwable th2) {
            bufferedOutputStream.close();
            m144880n0.close();
            throw th2;
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: M */
    protected void mo110297M(HttpURLConnection httpURLConnection) {
        this.f134295L.delete();
        mo110294J(httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p609wh.AbstractC29002c, p609wh.C29037t0, jm0.AbstractC21298h
    /* renamed from: T */
    public void mo82640T(HttpURLConnection httpURLConnection) {
        super.mo82640T(httpURLConnection);
        if (this.f134295L.exists() && (this.f134296M == -1 || this.f134295L.length() < this.f134296M)) {
            this.f134299P = this.f134295L.length();
            httpURLConnection.setRequestProperty("Range", "bytes=" + this.f134295L.length() + "-");
            return;
        }
        this.f134295L.delete();
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: Z */
    public void mo110303Z() {
        if (this.f134295L.exists()) {
            long length = this.f134295L.length();
            long j11 = this.f134296M;
            if ((length == j11 && j11 > 0) || AbstractC23352g.m122787c(this.f134297N, this.f134295L)) {
                m144884r0();
                return;
            }
        }
        super.mo110303Z();
    }
}
