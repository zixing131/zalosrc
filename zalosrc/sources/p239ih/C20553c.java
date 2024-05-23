package p239ih;

import android.os.ParcelFileDescriptor;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import me0.C23257x1;

/* renamed from: ih.c */
/* loaded from: classes.dex */
public final class C20553c implements InterfaceC20552b {

    /* renamed from: a */
    private final String f100924a;

    /* renamed from: b */
    private long f100925b = -1;

    public C20553c(String str) {
        this.f100924a = str;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: a */
    public ParcelFileDescriptor mo106810a() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(this.f100924a);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                this.f100925b = file.length();
                return open;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: b */
    public boolean mo106811b() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            File file = new File(this.f100924a);
            try {
                if (file.exists()) {
                    return file.delete();
                }
                return false;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return false;
            }
        }
        return false;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: c */
    public OutputStream mo106812c() {
        try {
            return new FileOutputStream(this.f100924a);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: d */
    public String mo106813d() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                return new File(this.f100924a).getName();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: e */
    public String mo106814e() {
        return mo106813d();
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: f */
    public String mo106815f() {
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: g */
    public boolean mo106816g() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                return new File(this.f100924a).exists();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return false;
            }
        }
        return false;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: h */
    public String mo106817h() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                return new File(this.f100924a).getParent();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: i */
    public boolean mo106818i() {
        return false;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: j */
    public float[] mo106819j() {
        float[] fArr = new float[2];
        try {
            C23257x1 mo106820k = mo106820k();
            if (mo106820k != null) {
                mo106820k.m119908l(fArr);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return fArr;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: k */
    public C23257x1 mo106820k() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                return new C23257x1(this.f100924a);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: l */
    public InputStream mo106821l() {
        ParcelFileDescriptor mo106810a = mo106810a();
        if (mo106810a != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(mo106810a);
        }
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: m */
    public String mo106822m() {
        return this.f100924a;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: n */
    public String mo106823n() {
        return null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: o */
    public long mo106824o() {
        String str;
        if (this.f100925b <= 0 && (str = this.f100924a) != null && str.length() != 0) {
            try {
                this.f100925b = new File(this.f100924a).length();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return this.f100925b;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: p */
    public long mo106825p() {
        String str = this.f100924a;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(this.f100924a);
                if (file.exists()) {
                    return new Date(file.lastModified()).getTime();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return -1L;
    }
}
