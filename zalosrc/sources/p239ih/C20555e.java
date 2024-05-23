package p239ih;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import bn0.AbstractC2933b;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.InputStream;
import java.io.OutputStream;
import me0.AbstractC23254w8;
import me0.C23257x1;
import on0.AbstractC24342w;
import pm0.C24848g0;

/* renamed from: ih.e */
/* loaded from: classes3.dex */
public final class C20555e implements InterfaceC20552b {

    /* renamed from: a */
    private final String f100926a;

    /* renamed from: b */
    private long f100927b = -1;

    public C20555e(String str) {
        this.f100926a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C23257x1 m106827q(String str) {
        C23257x1 c23257x1;
        String message;
        boolean m127149O;
        ParcelFileDescriptor openFileDescriptor;
        C23257x1 c23257x12;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                Uri parse = Uri.parse(str);
                AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    try {
                        c23257x1 = new C23257x1(openFileDescriptor.getFileDescriptor());
                    } catch (Throwable th2) {
                        th = th2;
                        c23257x12 = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            try {
                                AbstractC2933b.m13890a(openFileDescriptor, th);
                                throw th3;
                            } catch (Exception e11) {
                                e = e11;
                                c23257x1 = c23257x12;
                                message = e.getMessage();
                                if (message != null) {
                                }
                                return c23257x1;
                            }
                        }
                    }
                } else {
                    c23257x1 = null;
                }
            } catch (Exception e12) {
                e = e12;
                c23257x1 = null;
            }
            try {
                C24848g0 c24848g0 = C24848g0.f119245a;
                try {
                    AbstractC2933b.m13890a(openFileDescriptor, null);
                } catch (Exception e13) {
                    e = e13;
                    message = e.getMessage();
                    if (message != null) {
                        m127149O = AbstractC24342w.m127149O(message, "ACCESS_MEDIA_LOCATION", false, 2, null);
                        if (!m127149O) {
                            AbstractC20110a.f98889a.mo104552e(e);
                        }
                    }
                    return c23257x1;
                }
            } catch (Throwable th4) {
                c23257x12 = c23257x1;
                th = th4;
                throw th;
            }
        } else {
            try {
                String mo106823n = mo106823n();
                if (mo106823n != null && mo106823n.length() != 0) {
                    c23257x1 = new C23257x1(mo106823n);
                }
                return null;
            } catch (Exception e14) {
                AbstractC20110a.f98889a.mo104552e(e14);
                return null;
            }
        }
        return c23257x1;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: a */
    public ParcelFileDescriptor mo106810a() {
        String str = this.f100926a;
        if (str != null && str.length() != 0) {
            try {
                ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                Uri parse = Uri.parse(this.f100926a);
                AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    this.f100927b = openFileDescriptor.getStatSize();
                }
                return openFileDescriptor;
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
        return false;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: c */
    public OutputStream mo106812c() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:32|33|(7:35|12|13|15|16|17|18))|12|13|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r1);     */
    @Override // p239ih.InterfaceC20552b
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo106813d() {
        Uri m119853a;
        String str;
        Cursor query;
        String str2 = this.f100926a;
        String str3 = null;
        if (str2 == null || str2.length() == 0 || (m119853a = AbstractC23254w8.m119853a(this.f100926a)) == null) {
            return null;
        }
        try {
            query = CoreUtility.getAppContext().getContentResolver().query(m119853a, new String[]{"_display_name"}, null, null, null);
        } catch (Exception e11) {
            String str4 = str3;
            Exception e12 = e11;
            str = str4;
        }
        try {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC2933b.m13890a(query, null);
                        return str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC2933b.m13890a(query, th);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return str;
        } catch (Throwable th4) {
            str3 = str;
            th = th4;
            throw th;
        }
        str = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:32|33|(7:35|12|13|15|16|17|18))|12|13|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:            ho0.AbstractC20110a.f98889a.mo104552e(r1);     */
    @Override // p239ih.InterfaceC20552b
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo106814e() {
        Uri m119853a;
        String str;
        Cursor query;
        String str2 = this.f100926a;
        String str3 = null;
        if (str2 == null || str2.length() == 0 || (m119853a = AbstractC23254w8.m119853a(this.f100926a)) == null) {
            return null;
        }
        try {
            query = CoreUtility.getAppContext().getContentResolver().query(m119853a, new String[]{"relative_path"}, null, null, null);
        } catch (Exception e11) {
            String str4 = str3;
            Exception e12 = e11;
            str = str4;
        }
        try {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("relative_path"));
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC2933b.m13890a(query, null);
                        return str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC2933b.m13890a(query, th);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return str;
        } catch (Throwable th4) {
            str3 = str;
            th = th4;
            throw th;
        }
        str = null;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: f */
    public String mo106815f() {
        int m127178g0;
        String str = this.f100926a;
        if (str != null && str.length() != 0) {
            String str2 = this.f100926a;
            m127178g0 = AbstractC24342w.m127178g0(str2, "/", 0, false, 6, null);
            String substring = str2.substring(m127178g0 + 1);
            AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:            if (r2.moveToFirst() != false) goto L20;     */
    @Override // p239ih.InterfaceC20552b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo106816g() {
        String str = this.f100926a;
        if (str != null && str.length() != 0) {
            try {
                ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                Uri parse = Uri.parse(this.f100926a);
                AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                boolean z11 = true;
                Cursor query = contentResolver.query(parse, new String[]{"_id"}, null, null, null);
                if (query != null) {
                    try {
                    } finally {
                    }
                }
                z11 = false;
                AbstractC2933b.m13890a(query, null);
                return z11;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:            r0 = on0.AbstractC24342w.m127177f0(r6, java.io.File.separatorChar, 0, false, 6, null);     */
    @Override // p239ih.InterfaceC20552b
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo106817h() {
        int m127177f0;
        String mo106823n = mo106823n();
        if (AbstractC19074t.m100204b(mo106823n, this.f100926a)) {
            return this.f100926a;
        }
        if (mo106823n != null) {
            try {
                if (mo106823n.length() != 0 && m127177f0 > 0) {
                    String substring = mo106823n.substring(0, m127177f0);
                    AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return substring;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return this.f100926a;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: i */
    public boolean mo106818i() {
        return true;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: j */
    public float[] mo106819j() {
        Uri requireOriginal;
        float[] fArr = new float[2];
        try {
            String str = this.f100926a;
            if (Build.VERSION.SDK_INT >= 29) {
                requireOriginal = MediaStore.setRequireOriginal(Uri.parse(str));
                str = requireOriginal.toString();
            }
            C23257x1 m106827q = m106827q(str);
            if (m106827q != null) {
                m106827q.m119908l(fArr);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return fArr;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: k */
    public C23257x1 mo106820k() {
        return m106827q(this.f100926a);
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
        return this.f100926a;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: n */
    public String mo106823n() {
        int columnIndexOrThrow;
        String str = this.f100926a;
        if (str != null && str.length() != 0) {
            String[] strArr = {"_data"};
            try {
                ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                Uri parse = Uri.parse(this.f100926a);
                AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                Cursor query = contentResolver.query(parse, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndexOrThrow = query.getColumnIndexOrThrow("_data")) >= 0) {
                            str = query.getString(columnIndexOrThrow);
                        }
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(query, null);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return str;
    }

    @Override // p239ih.InterfaceC20552b
    /* renamed from: o */
    public long mo106824o() {
        String str;
        if (this.f100927b <= 0 && (str = this.f100926a) != null && str.length() != 0) {
            try {
                ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                Uri parse = Uri.parse(this.f100926a);
                AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    try {
                        this.f100927b = openFileDescriptor.getStatSize();
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(openFileDescriptor, null);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return this.f100927b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p239ih.InterfaceC20552b
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo106825p() {
        Uri m119853a;
        boolean m127149O;
        String str;
        Cursor query;
        boolean m127149O2;
        boolean m127149O3;
        String str2 = this.f100926a;
        long j11 = -1;
        if (str2 != null && str2.length() != 0 && (m119853a = AbstractC23254w8.m119853a(this.f100926a)) != null) {
            String uri = m119853a.toString();
            AbstractC19074t.m100207e(uri, "fileContentUri.toString()");
            m127149O = AbstractC24342w.m127149O(uri, "image", false, 2, null);
            if (!m127149O) {
                m127149O2 = AbstractC24342w.m127149O(uri, "video", false, 2, null);
                if (!m127149O2) {
                    m127149O3 = AbstractC24342w.m127149O(uri, "audio", false, 2, null);
                    if (!m127149O3) {
                        str = null;
                        if (str != null && str.length() != 0) {
                            try {
                                query = CoreUtility.getAppContext().getContentResolver().query(m119853a, new String[]{str}, null, null, null);
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            j11 = query.getLong(query.getColumnIndex(str)) * 1000;
                                        }
                                    } finally {
                                    }
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                AbstractC2933b.m13890a(query, null);
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                            }
                        }
                    }
                }
            }
            str = "date_modified";
            if (str != null) {
                query = CoreUtility.getAppContext().getContentResolver().query(m119853a, new String[]{str}, null, null, null);
                if (query != null) {
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
                AbstractC2933b.m13890a(query, null);
            }
        }
        return j11;
    }
}
