package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.e9 */
/* loaded from: classes2.dex */
public final class C4456e9 implements InterfaceC5233z7 {

    /* renamed from: c */
    private final InterfaceC4419d9 f19568c;

    /* renamed from: a */
    private final Map f19566a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f19567b = 0;

    /* renamed from: d */
    private final int f19569d = 5242880;

    public C4456e9(InterfaceC4419d9 interfaceC4419d9, int i11) {
        this.f19568c = interfaceC4419d9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m21632c(InputStream inputStream) {
        return (m21639l(inputStream) << 24) | m21639l(inputStream) | (m21639l(inputStream) << 8) | (m21639l(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static long m21633d(InputStream inputStream) {
        return (m21639l(inputStream) & 255) | ((m21639l(inputStream) & 255) << 8) | ((m21639l(inputStream) & 255) << 16) | ((m21639l(inputStream) & 255) << 24) | ((m21639l(inputStream) & 255) << 32) | ((m21639l(inputStream) & 255) << 40) | ((m21639l(inputStream) & 255) << 48) | ((255 & m21639l(inputStream)) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m21634f(C4382c9 c4382c9) {
        return new String(m21638k(c4382c9, m21633d(c4382c9)), "UTF-8");
    }

    /* renamed from: h */
    static void m21635h(OutputStream outputStream, int i11) {
        outputStream.write(i11 & 255);
        outputStream.write((i11 >> 8) & 255);
        outputStream.write((i11 >> 16) & 255);
        outputStream.write((i11 >> 24) & 255);
    }

    /* renamed from: i */
    static void m21636i(OutputStream outputStream, long j11) {
        outputStream.write((byte) j11);
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 32));
        outputStream.write((byte) (j11 >>> 40));
        outputStream.write((byte) (j11 >>> 48));
        outputStream.write((byte) (j11 >>> 56));
    }

    /* renamed from: j */
    static void m21637j(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m21636i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: k */
    static byte[] m21638k(C4382c9 c4382c9, long j11) {
        long m20840a = c4382c9.m20840a();
        if (j11 >= 0 && j11 <= m20840a) {
            int i11 = (int) j11;
            if (i11 == j11) {
                byte[] bArr = new byte[i11];
                new DataInputStream(c4382c9).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j11 + ", maxLength=" + m20840a);
    }

    /* renamed from: l */
    private static int m21639l(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: m */
    private final void m21640m(String str, C4346b9 c4346b9) {
        if (!this.f19566a.containsKey(str)) {
            this.f19567b += c4346b9.f17671a;
        } else {
            this.f19567b += c4346b9.f17671a - ((C4346b9) this.f19566a.get(str)).f17671a;
        }
        this.f19566a.put(str, c4346b9);
    }

    /* renamed from: n */
    private final void m21641n(String str) {
        C4346b9 c4346b9 = (C4346b9) this.f19566a.remove(str);
        if (c4346b9 != null) {
            this.f19567b -= c4346b9.f17671a;
        }
    }

    /* renamed from: o */
    private static final String m21642o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5233z7
    /* renamed from: a */
    public final synchronized void mo21643a(String str, C5196y7 c5196y7) {
        long j11;
        long j12 = this.f19567b;
        int length = c5196y7.f30820a.length;
        int i11 = this.f19569d;
        if (j12 + length > i11 && length > i11 * 0.9f) {
            return;
        }
        File m21645e = m21645e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m21645e));
            C4346b9 c4346b9 = new C4346b9(str, c5196y7);
            try {
                m21635h(bufferedOutputStream, 538247942);
                m21637j(bufferedOutputStream, c4346b9.f17672b);
                String str2 = c4346b9.f17673c;
                if (str2 == null) {
                    str2 = "";
                }
                m21637j(bufferedOutputStream, str2);
                m21636i(bufferedOutputStream, c4346b9.f17674d);
                m21636i(bufferedOutputStream, c4346b9.f17675e);
                m21636i(bufferedOutputStream, c4346b9.f17676f);
                m21636i(bufferedOutputStream, c4346b9.f17677g);
                List<C4529g8> list = c4346b9.f17678h;
                if (list != null) {
                    m21635h(bufferedOutputStream, list.size());
                    for (C4529g8 c4529g8 : list) {
                        m21637j(bufferedOutputStream, c4529g8.m22291a());
                        m21637j(bufferedOutputStream, c4529g8.m22292b());
                    }
                } else {
                    m21635h(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(c5196y7.f30820a);
                bufferedOutputStream.close();
                c4346b9.f17671a = m21645e.length();
                m21640m(str, c4346b9);
                if (this.f19567b >= this.f19569d) {
                    if (AbstractC5048u8.f28785a) {
                        AbstractC5048u8.m26869d("Pruning old cache entries.", new Object[0]);
                    }
                    long j13 = this.f19567b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.f19566a.entrySet().iterator();
                    int i12 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            C4346b9 c4346b92 = (C4346b9) ((Map.Entry) it.next()).getValue();
                            if (m21645e(c4346b92.f17672b).delete()) {
                                j11 = elapsedRealtime;
                                this.f19567b -= c4346b92.f17671a;
                            } else {
                                j11 = elapsedRealtime;
                                String str3 = c4346b92.f17672b;
                                AbstractC5048u8.m26866a("Could not delete cache entry for key=%s, filename=%s", str3, m21642o(str3));
                            }
                            it.remove();
                            i12++;
                            if (((float) this.f19567b) < this.f19569d * 0.9f) {
                                break;
                            } else {
                                elapsedRealtime = j11;
                            }
                        } else {
                            j11 = elapsedRealtime;
                            break;
                        }
                    }
                    if (AbstractC5048u8.f28785a) {
                        AbstractC5048u8.m26869d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.f19567b - j13), Long.valueOf(SystemClock.elapsedRealtime() - j11));
                    }
                }
            } catch (IOException e11) {
                AbstractC5048u8.m26866a("%s", e11.toString());
                bufferedOutputStream.close();
                AbstractC5048u8.m26866a("Failed to write header for %s", m21645e.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!m21645e.delete()) {
                AbstractC5048u8.m26866a("Could not clean up file %s", m21645e.getAbsolutePath());
            }
            if (!this.f19568c.zza().exists()) {
                AbstractC5048u8.m26866a("Re-initializing cache after external clearing.", new Object[0]);
                this.f19566a.clear();
                this.f19567b = 0L;
                zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5233z7
    /* renamed from: b */
    public final synchronized void mo21644b(String str, boolean z11) {
        C5196y7 zza = zza(str);
        if (zza != null) {
            zza.f30825f = 0L;
            zza.f30824e = 0L;
            mo21643a(str, zza);
        }
    }

    /* renamed from: e */
    public final File m21645e(String str) {
        return new File(this.f19568c.zza(), m21642o(str));
    }

    /* renamed from: g */
    public final synchronized void m21646g(String str) {
        boolean delete = m21645e(str).delete();
        m21641n(str);
        if (!delete) {
            AbstractC5048u8.m26866a("Could not delete cache entry for key=%s, filename=%s", str, m21642o(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5233z7
    public final synchronized C5196y7 zza(String str) {
        C4346b9 c4346b9 = (C4346b9) this.f19566a.get(str);
        if (c4346b9 == null) {
            return null;
        }
        File m21645e = m21645e(str);
        try {
            C4382c9 c4382c9 = new C4382c9(new BufferedInputStream(new FileInputStream(m21645e)), m21645e.length());
            try {
                C4346b9 m20440a = C4346b9.m20440a(c4382c9);
                if (!TextUtils.equals(str, m20440a.f17672b)) {
                    AbstractC5048u8.m26866a("%s: key=%s, found=%s", m21645e.getAbsolutePath(), str, m20440a.f17672b);
                    m21641n(str);
                    return null;
                }
                byte[] m21638k = m21638k(c4382c9, c4382c9.m20840a());
                C5196y7 c5196y7 = new C5196y7();
                c5196y7.f30820a = m21638k;
                c5196y7.f30821b = c4346b9.f17673c;
                c5196y7.f30822c = c4346b9.f17674d;
                c5196y7.f30823d = c4346b9.f17675e;
                c5196y7.f30824e = c4346b9.f17676f;
                c5196y7.f30825f = c4346b9.f17677g;
                List<C4529g8> list = c4346b9.f17678h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C4529g8 c4529g8 : list) {
                    treeMap.put(c4529g8.m22291a(), c4529g8.m22292b());
                }
                c5196y7.f30826g = treeMap;
                c5196y7.f30827h = Collections.unmodifiableList(c4346b9.f17678h);
                return c5196y7;
            } finally {
                c4382c9.close();
            }
        } catch (IOException e11) {
            AbstractC5048u8.m26866a("%s: %s", m21645e.getAbsolutePath(), e11.toString());
            m21646g(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5233z7
    public final synchronized void zzb() {
        long length;
        C4382c9 c4382c9;
        File zza = this.f19568c.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                AbstractC5048u8.m26867b("Unable to create cache dir %s", zza.getAbsolutePath());
                return;
            }
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                c4382c9 = new C4382c9(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                C4346b9 m20440a = C4346b9.m20440a(c4382c9);
                m20440a.f17671a = length;
                m21640m(m20440a.f17672b, m20440a);
                c4382c9.close();
            } catch (Throwable th2) {
                c4382c9.close();
                throw th2;
                break;
            }
        }
    }

    public C4456e9(File file, int i11) {
        this.f19568c = new C4309a9(this, file);
    }
}
