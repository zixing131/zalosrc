package p264jd;

import android.os.SystemClock;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gd.C19395d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import mm0.AbstractC23352g;
import p128ed.C18387b;
import p128ed.C18388c;
import p128ed.C18390e;
import p264jd.C21223b;
import p264jd.C21224c;
import p543uc.C27225c;
import qm0.AbstractC25366r;
import qm0.AbstractC25376w;
import vi.C28259e;
import vi.C28260f;
import vi.C28261g;

/* renamed from: jd.a */
/* loaded from: classes3.dex */
public final class C21222a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C21224c f103459a;

    /* renamed from: b */
    private final C19395d f103460b;

    /* renamed from: c */
    private final C21223b f103461c;

    /* renamed from: d */
    private long f103462d;

    /* renamed from: e */
    private long f103463e;

    /* renamed from: f */
    private String f103464f;

    /* renamed from: g */
    private File f103465g;

    /* renamed from: h */
    private boolean f103466h;

    /* renamed from: i */
    private C28259e f103467i;

    /* renamed from: j */
    private boolean f103468j;

    /* renamed from: jd.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21222a(C21224c c21224c, C19395d c19395d, C21223b c21223b) {
        AbstractC19074t.m100208f(c21224c, "uploadChunkDriveUseCase");
        AbstractC19074t.m100208f(c19395d, "processZipAListUseCase");
        AbstractC19074t.m100208f(c21223b, "sendInitReqUploadUseCase");
        this.f103459a = c21224c;
        this.f103460b = c19395d;
        this.f103461c = c21223b;
        this.f103468j = true;
    }

    /* renamed from: a */
    private final int m109967a(long j11, long j12) {
        int i11 = 0;
        if (j11 == 0 || j12 == 0) {
            return 0;
        }
        int i12 = (int) (j11 / j12);
        if (j11 % j12 != 0) {
            i11 = 1;
        }
        return i11 + i12;
    }

    /* renamed from: b */
    private final void m109968b(C28259e c28259e) {
        if (c28259e != null) {
            C7959d.Companion.m41850e().m41690C0(c28259e.m142299b());
        }
    }

    /* renamed from: c */
    private final String m109969c(C28261g c28261g, long j11) {
        C28260f m142319h = c28261g.m142319h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m142319h.mo142291d());
        sb2.append(m142319h.mo142288a());
        sb2.append(j11);
        sb2.append(c28261g.m142293e());
        sb2.append(m142319h.m142306h());
        ArrayList arrayList = new ArrayList(m142319h.m142309k().size());
        arrayList.addAll(m142319h.m142309k().keySet());
        AbstractC25376w.m131533v(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String m122788d = AbstractC23352g.m122788d(sb2.toString());
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        return m122788d;
    }

    /* renamed from: d */
    private final String m109970d(C28261g c28261g, long j11) {
        if (this.f103464f == null) {
            this.f103464f = m109969c(c28261g, j11);
        }
        String str = this.f103464f;
        AbstractC19074t.m100206d(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m109971e(C28261g c28261g, long j11) {
        String str;
        C28259e m41844z1 = C7959d.Companion.m41850e().m41844z1(c28261g.mo142291d());
        this.f103467i = m41844z1;
        boolean z11 = false;
        if (m41844z1 != null) {
            if (AbstractC19074t.m100204b(m41844z1.m142298a(), m109970d(c28261g, j11))) {
                File file = new File(C18388c.f92779a.m97397h(c28261g.mo142291d()));
                if (file.exists() && file.isFile() && file.lastModified() == m41844z1.m142301d()) {
                    c28261g.mo142290c(file.length());
                    this.f103465g = file;
                    str = m41844z1.m142300c();
                    C18390e.m97413u("sessionUploadUrl: get from cache", false, 2, null);
                    this.f103466h = true;
                    if (z11) {
                        m109968b(this.f103467i);
                        AbstractC23041d2.m118208g(c28261g.mo142288a());
                        this.f103467i = null;
                    }
                    return str;
                }
                C18390e.m97413u("Zip file to resume upload not exist or not a valid file!", false, 2, null);
            } else {
                C18390e.m97413u("sessionUploadUrl: not match from cache", false, 2, null);
            }
            str = null;
            z11 = true;
            if (z11) {
            }
            return str;
        }
        C18390e.m97413u("lastSessionResumable not exist on DB", false, 2, null);
        return null;
    }

    /* renamed from: f */
    public final void m109972f() {
        this.f103462d = 0L;
        this.f103463e = 0L;
        this.f103464f = null;
        this.f103466h = false;
        this.f103467i = null;
        this.f103465g = null;
        this.f103468j = true;
    }

    /* renamed from: g */
    public final void m109973g(String str, C28261g c28261g, InterfaceC21225d interfaceC21225d, long j11, long j12, String str2) {
        List m131496e;
        boolean z11;
        boolean z12;
        C28259e c28259e;
        int i11;
        long j13;
        C21224c.b bVar;
        long m116585h;
        AbstractC19074t.m100208f(str, "tokenAuth");
        AbstractC19074t.m100208f(c28261g, "zipFileUpload");
        AbstractC19074t.m100208f(interfaceC21225d, "uploadCallback");
        AbstractC19074t.m100208f(str2, "rootPathUpload");
        String mo142291d = c28261g.mo142291d();
        C18390e c18390e = C18390e.f92781a;
        C18390e.m97413u("[Upload] Start resume upload: zipName=" + mo142291d + "}, count upload=" + c18390e.m97420h(c28261g.m142319h()) + ", count delete=" + c18390e.m97419g(c28261g.m142319h()), false, 2, null);
        m109972f();
        String m109971e = m109971e(c28261g, j12);
        if (m109971e == null || m109971e.length() == 0) {
            C19395d c19395d = this.f103460b;
            m131496e = AbstractC25366r.m131496e(c28261g);
            c19395d.m101508a(new C19395d.a(str2, m131496e));
            this.f103461c.m101515f(str);
            C21223b.c cVar = (C21223b.c) this.f103461c.m101509a(new C21223b.b(c28261g));
            if (cVar != null && cVar.m109976a().length() != 0) {
                m109971e = cVar.m109976a();
                C18390e.m97413u("sessionUploadUrl: get from server", false, 2, null);
                this.f103465g = new File(C18388c.f92779a.m97397h(c28261g.mo142291d()));
                z11 = true;
            } else {
                throw new BackupRestoreMediaException(4, 2009, "Upload Drive failed: invalid session upload URL");
            }
        } else {
            z11 = false;
        }
        File file = this.f103465g;
        if (file != null) {
            AbstractC19074t.m100205c(file);
            if (file.exists()) {
                File file2 = this.f103465g;
                AbstractC19074t.m100205c(file2);
                long length = file2.length();
                this.f103463e = length;
                C18390e.m97413u("File size upload=" + length, false, 2, null);
                long j14 = j11 <= 0 ? 5242880L : j11;
                try {
                    this.f103459a.m101515f(str);
                    int m109967a = m109967a(this.f103463e, j14) + 10;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j15 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < m109967a) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime <= 1200000) {
                            if (!this.f103466h) {
                                i11 = m109967a;
                                m116585h = AbstractC22543l.m116585h(j14, this.f103463e - j15);
                                int i14 = (int) m116585h;
                                j13 = j14;
                                long j16 = (i14 + j15) - 1;
                                AbstractC19074t.m100205c(m109971e);
                                File file3 = this.f103465g;
                                AbstractC19074t.m100205c(file3);
                                bVar = new C21224c.b(m109971e, this.f103463e, "[" + j15 + "-" + j16 + "]", j15, j16, i14, file3, this.f103466h, j15);
                                int i15 = i13 + 1;
                                C18390e.m97413u("----- Start upload chunk times: " + i15 + ", chunkId=" + bVar.m109981c(), false, 2, null);
                                i13 = i15;
                            } else {
                                i11 = m109967a;
                                j13 = j14;
                                this.f103466h = false;
                                AbstractC19074t.m100205c(m109971e);
                                long j17 = this.f103463e;
                                File file4 = this.f103465g;
                                AbstractC19074t.m100205c(file4);
                                bVar = new C21224c.b(m109971e, j17, "[*-*]", 0L, 0L, 0, file4, true, 0L);
                                C18390e.m97413u("----- Start request get UPLOAD STATUS, chunkId=" + bVar.m109981c(), false, 2, null);
                            }
                            C21224c.c cVar2 = (C21224c.c) this.f103459a.m101509a(bVar);
                            if (cVar2 != null) {
                                j15 = cVar2.m109988a();
                                interfaceC21225d.mo98999b(j15, this.f103463e);
                                if (cVar2.m109992e()) {
                                    C28260f m142319h = c28261g.m142319h();
                                    File file5 = this.f103465g;
                                    AbstractC19074t.m100205c(file5);
                                    String m109989b = cVar2.m109989b();
                                    if (m109989b == null) {
                                        m109989b = "";
                                    }
                                    interfaceC21225d.mo98998a(m142319h, file5, m109989b);
                                    m109968b(this.f103467i);
                                    return;
                                }
                                if (cVar2.m109991d() && bVar.m109987j()) {
                                    m109968b(this.f103467i);
                                    AbstractC23041d2.m118207f(this.f103465g);
                                    if (this.f103468j) {
                                        C18390e.m97413u("sessionUploadUrl expired, auto restart upload", false, 2, null);
                                        this.f103468j = false;
                                        m109973g(str, c28261g, interfaceC21225d, j11, j12, str2);
                                        return;
                                    }
                                    throw new BackupRestoreMediaException(4, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Upload Drive failed: exceed quota, auto restart upload");
                                }
                                String m109990c = cVar2.m109990c();
                                if (m109990c != null && m109990c.length() != 0) {
                                    m109971e = cVar2.m109990c();
                                    C18390e.m97413u("sessionUploadUrl changed, " + m109971e, false, 2, null);
                                }
                                i12++;
                                m109967a = i11;
                                j14 = j13;
                            } else {
                                throw new BackupRestoreMediaException(4, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Upload Drive failed: null result");
                            }
                        } else {
                            throw new BackupRestoreMediaException(4, 2010, "Upload Drive failed: upload chunk timeout");
                        }
                    }
                    throw new BackupRestoreMediaException(4, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Upload Drive failed: exceed quota resend bytes chunk that server not being received");
                } catch (BackupRestoreMediaException e11) {
                    if (C27225c.f127989a.m139333a(e11)) {
                        C18390e.m97413u("canResumeLater, " + e11.getMessage(), false, 2, null);
                        if (z11) {
                            String mo142291d2 = c28261g.mo142291d();
                            String m109970d = m109970d(c28261g, j12);
                            File file6 = this.f103465g;
                            AbstractC19074t.m100205c(file6);
                            C28259e c28259e2 = new C28259e(mo142291d2, m109970d, m109971e, file6.lastModified());
                            z12 = false;
                            C18390e.m97413u("Cache new session upload, sessionUploadUrl=" + m109971e, false, 2, null);
                            c28259e = c28259e2;
                        } else {
                            if (this.f103467i != null && m109971e.length() > 0) {
                                C28259e c28259e3 = this.f103467i;
                                AbstractC19074t.m100205c(c28259e3);
                                if (!AbstractC19074t.m100204b(c28259e3.m142300c(), m109971e)) {
                                    C28259e c28259e4 = this.f103467i;
                                    AbstractC19074t.m100205c(c28259e4);
                                    c28259e4.m142302e(m109971e);
                                    C28259e c28259e5 = this.f103467i;
                                    z12 = false;
                                    C18390e.m97413u("Cache old session upload changed", false, 2, null);
                                    c28259e = c28259e5;
                                }
                            }
                            z12 = false;
                            C18390e.m97413u("Cache is nothing to change", false, 2, null);
                            c28259e = null;
                        }
                        if (c28259e != null) {
                            C7959d.Companion.m41850e().m41761X1(c28259e);
                        }
                        C18387b.f92777a.m97389c(z12, true);
                    } else {
                        m109968b(this.f103467i);
                        File file7 = this.f103465g;
                        if (file7 != null) {
                            AbstractC23041d2.m118207f(file7);
                        }
                    }
                    throw e11;
                }
            }
        }
        throw new BackupRestoreMediaException(4, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Upload Drive failed: invalid upload file (" + this.f103465g + ")");
    }
}
