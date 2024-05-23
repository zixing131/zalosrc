package p206hd;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveDownloadException;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gd.C19392a;
import in.AbstractC20631e;
import java.io.File;
import java.util.Arrays;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import p206hd.C19998b;
import p348mi.AbstractC23306f;
import pm0.C24860q;
import sc.C26220b;
import vc.EnumC27961a;
import vi.C28260f;
import vi.C28261g;

/* renamed from: hd.f */
/* loaded from: classes3.dex */
public final class C20002f extends AbstractC20631e {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private InterfaceC20001e f98338p;

    /* renamed from: q */
    private String f98339q;

    /* renamed from: r */
    private boolean f98340r;

    /* renamed from: s */
    private int f98341s;

    /* renamed from: hd.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hd.f$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC19997a {

        /* renamed from: a */
        final /* synthetic */ long f98342a;

        /* renamed from: b */
        final /* synthetic */ C20002f f98343b;

        /* renamed from: c */
        final /* synthetic */ String f98344c;

        b(long j11, C20002f c20002f, String str) {
            this.f98342a = j11;
            this.f98343b = c20002f;
            this.f98344c = str;
        }

        @Override // p206hd.InterfaceC19997a
        /* renamed from: a */
        public void mo103756a(long j11, long j12) {
            this.f98343b.m107483F(this.f98344c, String.valueOf((int) ((j11 * 100) / this.f98342a)));
        }

        @Override // p206hd.InterfaceC19997a
        public boolean isCancelled() {
            return C20002f.super.m107496y();
        }
    }

    public C20002f() {
        this.f101515g = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C24860q mo1204l(String... strArr) {
        String str;
        int i11;
        long j11;
        long parseLong;
        AbstractC19074t.m100208f(strArr, "params");
        try {
            String str2 = strArr[0];
            String str3 = strArr[1];
            String str4 = strArr[2];
            str = strArr[3];
            if (str4 != null) {
                try {
                    try {
                        parseLong = Long.parseLong(str4);
                    } catch (BackupRestoreMediaException e11) {
                        e = e11;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = e.m37267a();
                        this.f98339q = e.m37268b();
                        i11 = this.f98341s;
                        if (i11 == 40302) {
                        }
                        this.f98341s = 106;
                        return null;
                    } catch (DriveDownloadException e12) {
                        e = e12;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = e.f40043p;
                        this.f98339q = e.f40044q;
                        return null;
                    } catch (Exception e13) {
                        e = e13;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = 105;
                        this.f98339q = e.getMessage();
                        return null;
                    }
                } catch (NumberFormatException unused) {
                    j11 = 0;
                }
            } else {
                parseLong = 0;
            }
            j11 = parseLong;
            try {
                if (str2 != null) {
                    try {
                        if (str2.length() != 0 && str3 != null && str3.length() != 0 && str != null && str.length() != 0 && j11 != 0) {
                            if (!TextUtils.isEmpty(AbstractC23306f.m120688m().m132993i())) {
                                String m132995l = AbstractC23306f.m120688m().m132995l(this.f98340r);
                                if (!TextUtils.isEmpty(m132995l)) {
                                    int m132996n = AbstractC23306f.m120688m().m132996n();
                                    if (m132996n == 0) {
                                        File file = new File(str);
                                        if (file.exists()) {
                                            file.deleteOnExit();
                                        }
                                        if (AbstractC23238v2.m119727l()) {
                                            if (AbstractC23238v2.m119726k()) {
                                                C26220b.m134826i("SMLDownloadDrive", "Download from Drive: " + str2, null, 4, null);
                                                C28261g c28261g = new C28261g(new C28260f(str3, str2, j11, 0L, null, 24, null), EnumC27961a.f130360s);
                                                long mo142289b = c28261g.mo142289b();
                                                C19998b c19998b = new C19998b();
                                                c19998b.m101515f(m132995l);
                                                C19392a c19392a = new C19392a(c19998b, AbstractC23306f.m120676j().m128419n(), null, 4, null);
                                                c19392a.m101511c(this.f98340r);
                                                C19998b.c cVar = (C19998b.c) c19392a.m101509a(new C19998b.b(c28261g, str, new b(mo142289b, this, str3)));
                                                if (cVar == null) {
                                                    return null;
                                                }
                                                return new C24860q(cVar.m103761a(), Boolean.FALSE);
                                            }
                                            throw new DriveDownloadException(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, "No space left on device");
                                        }
                                        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
                                        throw new DriveDownloadException(109, "Device storage unmounted");
                                    }
                                    throw new DriveDownloadException(103, "Invalid Drive token state (" + m132996n + ")");
                                }
                                throw new DriveDownloadException(103, "Empty Drive token");
                            }
                            throw new DriveDownloadException(101, "Drive email is empty");
                        }
                    } catch (BackupRestoreMediaException e14) {
                        e = e14;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = e.m37267a();
                        this.f98339q = e.m37268b();
                        i11 = this.f98341s;
                        if (i11 == 40302 && i11 != 40303) {
                            if (i11 == 2008) {
                                this.f98341s = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10;
                                return null;
                            }
                            if (AbstractC23238v2.m119727l()) {
                                return null;
                            }
                            this.f98341s = 109;
                            this.f98339q = "Device storage unmounted";
                            return null;
                        }
                        this.f98341s = 106;
                        return null;
                    } catch (DriveDownloadException e15) {
                        e = e15;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = e.f40043p;
                        this.f98339q = e.f40044q;
                        return null;
                    } catch (Exception e16) {
                        e = e16;
                        AbstractC23350e.m122776f("SMLDownloadDrive", e);
                        AbstractC23041d2.m118208g(str);
                        this.f98341s = 105;
                        this.f98339q = e.getMessage();
                        return null;
                    }
                }
                throw new DriveDownloadException(100, "Invalid Drive file ID or output path or file size");
            } catch (BackupRestoreMediaException e17) {
                e = e17;
                str = null;
            } catch (DriveDownloadException e18) {
                e = e18;
                str = null;
            } catch (Exception e19) {
                e = e19;
                str = null;
            }
        } catch (BackupRestoreMediaException e21) {
            e = e21;
            str = null;
        } catch (DriveDownloadException e22) {
            e = e22;
            str = null;
        } catch (Exception e23) {
            e = e23;
            str = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo1197A(String str, boolean z11) {
        super.mo1197A(str, z11);
        if (!TextUtils.isEmpty(str)) {
            InterfaceC20001e interfaceC20001e = this.f98338p;
            if (interfaceC20001e != null) {
                AbstractC19074t.m100205c(str);
                interfaceC20001e.mo98997d(str);
                return;
            }
            return;
        }
        InterfaceC20001e interfaceC20001e2 = this.f98338p;
        if (interfaceC20001e2 != null) {
            int i11 = this.f98341s;
            String str2 = this.f98339q;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC20001e2.mo98996c(i11, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo1198C(String... strArr) {
        long j11;
        AbstractC19074t.m100208f(strArr, "values");
        super.mo1198C(Arrays.copyOf(strArr, strArr.length));
        InterfaceC20001e interfaceC20001e = this.f98338p;
        if (interfaceC20001e != null) {
            String str = strArr[0];
            if (str == null) {
                str = "";
            }
            String str2 = strArr[1];
            if (str2 != null) {
                j11 = Long.parseLong(str2);
            } else {
                j11 = 0;
            }
            interfaceC20001e.mo98994a(str, j11);
        }
    }

    /* renamed from: O */
    public final void m103806O(InterfaceC20001e interfaceC20001e) {
        this.f98338p = interfaceC20001e;
    }

    /* renamed from: P */
    public final void m103807P(boolean z11) {
        this.f98340r = z11;
    }
}
