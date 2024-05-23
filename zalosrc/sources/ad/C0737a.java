package ad;

import android.text.TextUtils;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveDownloadException;
import com.zing.zalo.p062db.C7959d;
import in.AbstractC20631e;
import lg0.AbstractC22483g;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p206hd.InterfaceC20001e;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import pm0.C24860q;
import sc.C26220b;
import sc.C26222d;
import vi.C28255a;

/* renamed from: ad.a */
/* loaded from: classes3.dex */
public class C0737a extends AbstractC20631e {

    /* renamed from: p */
    private InterfaceC20001e f2461p;

    /* renamed from: q */
    private String f2462q;

    /* renamed from: r */
    private int f2463r;

    /* renamed from: s */
    private String f2464s;

    /* renamed from: t */
    private boolean f2465t = false;

    public C0737a() {
        this.f101515g = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C24860q mo1204l(String... strArr) {
        C28255a m116238a;
        try {
            String str = strArr[0];
            String str2 = strArr[1];
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.f2464s = strArr[2];
                if (!TextUtils.isEmpty(AbstractC23306f.m120688m().m132993i())) {
                    String m132994k = AbstractC23306f.m120688m().m132994k();
                    if (!TextUtils.isEmpty(m132994k)) {
                        int m132996n = AbstractC23306f.m120688m().m132996n();
                        if (m132996n == 0) {
                            String m122788d = AbstractC23352g.m122788d(str);
                            String m41764Y0 = C7959d.m41638d1().m41764Y0(m122788d);
                            if (m41764Y0 == null && (m116238a = AbstractC22483g.m116238a(AbstractC23306f.m120657e0(), m122788d)) != null) {
                                m41764Y0 = m116238a.m142266e();
                            }
                            if (!TextUtils.isEmpty(m41764Y0)) {
                                C26220b.m134823f("SMLDownloadDriveSingle", "Download from Drive: " + str);
                                C28255a c28255a = new C28255a(m41764Y0, str2);
                                C0738b c0738b = new C0738b(m132994k, c28255a);
                                c0738b.m150124i(this.f2465t);
                                c0738b.m150121b(AbstractC23306f.m120676j().m128419n());
                                return new C24860q(c28255a.m142269i(), Boolean.FALSE);
                            }
                            throw new DriveDownloadException(104, "Drive file ID not found");
                        }
                        throw new DriveDownloadException(103, "Invalid Drive token state (" + m132996n + ")");
                    }
                    throw new DriveDownloadException(103, "Empty Drive token");
                }
                throw new DriveDownloadException(101, "Drive email is empty");
            }
            throw new DriveDownloadException(100, "Invalid URL or output path");
        } catch (BackupRestoreMediaException e11) {
            AbstractC23350e.m122776f("SMLDownloadDriveSingle", e11);
            int m37267a = e11.m37267a();
            this.f2463r = m37267a;
            if (m37267a == 40302 || m37267a == 40303) {
                this.f2463r = 106;
            }
            this.f2462q = e11.m37268b();
            return null;
        } catch (DriveDownloadException e12) {
            AbstractC23350e.m122776f("SMLDownloadDriveSingle", e12);
            this.f2463r = e12.f40043p;
            this.f2462q = e12.f40044q;
            return null;
        } catch (Exception e13) {
            AbstractC23350e.m122776f("SMLDownloadDriveSingle", e13);
            this.f2463r = 105;
            this.f2462q = e13.getMessage();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo1197A(String str, boolean z11) {
        super.mo1197A(str, z11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPostExecute: ");
        sb2.append(str);
        if (!TextUtils.isEmpty(str)) {
            AbstractC20887g.m109245w(18851);
            InterfaceC20001e interfaceC20001e = this.f2461p;
            if (interfaceC20001e != null) {
                interfaceC20001e.mo98997d(str);
            }
            if (!TextUtils.isEmpty(this.f2464s)) {
                C26222d.f124594a.m134860j(this.f2464s);
                return;
            }
            return;
        }
        String format = String.format("errorMessage=%s, errorCode=%d", this.f2462q, Integer.valueOf(this.f2463r));
        C26220b.m134822e(format);
        AbstractC20887g.m109240r(18851, format);
        InterfaceC20001e interfaceC20001e2 = this.f2461p;
        if (interfaceC20001e2 != null) {
            int i11 = this.f2463r;
            String str2 = this.f2462q;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC20001e2.mo98996c(i11, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // in.AbstractC20631e
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo1198C(String... strArr) {
        super.mo1198C(strArr);
    }

    /* renamed from: M */
    public void m1202M(InterfaceC20001e interfaceC20001e) {
        this.f2461p = interfaceC20001e;
    }

    /* renamed from: N */
    public void m1203N(boolean z11) {
        this.f2465t = z11;
    }
}
