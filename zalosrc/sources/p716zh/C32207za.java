package p716zh;

import ag0.AbstractC0837p0;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import com.androidquery.util.C3977j;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import java.io.File;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p020ak.C0884c;
import p239ih.C20556f;
import p354n3.C23528a;
import p363nh.C23744a;

/* renamed from: zh.za */
/* loaded from: classes3.dex */
public class C32207za {

    /* renamed from: k */
    static final String[] f148581k = {"_id", "media_type", "_data", "date_added", "date_modified"};

    /* renamed from: l */
    static Uri f148582l = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: m */
    static Uri f148583m = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: n */
    private static volatile C32207za f148584n;

    /* renamed from: b */
    public C0884c f148586b;

    /* renamed from: c */
    boolean f148587c;

    /* renamed from: d */
    volatile MediaItem f148588d;

    /* renamed from: j */
    c f148594j;

    /* renamed from: a */
    int f148585a = 1;

    /* renamed from: g */
    Handler f148591g = new Handler();

    /* renamed from: e */
    C23528a f148589e = new C23528a(MainApplication.getAppContext());

    /* renamed from: f */
    C3977j f148590f = new C3977j(MainApplication.getAppContext());

    /* renamed from: h */
    ContentObserver f148592h = new a(this.f148591g);

    /* renamed from: i */
    ContentObserver f148593i = new b(this.f148591g);

    /* renamed from: zh.za$a */
    /* loaded from: classes3.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            super.onChange(z11);
            C32207za.this.m155311f(true);
        }
    }

    /* renamed from: zh.za$b */
    /* loaded from: classes3.dex */
    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            super.onChange(z11);
            C32207za.this.m155311f(true);
        }
    }

    /* renamed from: zh.za$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo115168a(long j11);

        /* renamed from: b */
        long mo115169b();

        /* renamed from: c */
        long mo115170c();
    }

    private C32207za() {
    }

    /* renamed from: b */
    public static C32207za m155306b() {
        if (f148584n == null) {
            synchronized (C32207za.class) {
                try {
                    if (f148584n == null) {
                        f148584n = new C32207za();
                    }
                } finally {
                }
            }
        }
        return f148584n;
    }

    /* renamed from: d */
    private Cursor m155307d(int i11, String str) {
        String str2 = ("(media_type=1 AND (LOWER(_display_name) NOT LIKE '%.gif' AND LOWER(_display_name) NOT LIKE '%.dng' AND LOWER(_display_name) NOT LIKE '%.arw' AND LOWER(_display_name) NOT LIKE '%.srf' AND LOWER(_display_name) NOT LIKE '%.sr2' AND LOWER(_display_name) NOT LIKE '%.srw' ))") + " OR " + ("(media_type=3 AND (LOWER(_display_name) LIKE '%.mp4' OR LOWER(_display_name) LIKE '%.3gp' ))");
        String str3 = str + " DESC ";
        SensitiveData sensitiveData = new SensitiveData("gallery_story_suggest_send_photo", "social_timeline");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return AbstractC23280z4.m120358v0(f148583m, null, "LOWER(_display_name) LIKE '%.mp4' OR LOWER(_display_name) LIKE '%.3gp' ", null, str3, 1, sensitiveData);
            }
            return AbstractC23280z4.m120358v0(f148582l, null, "LOWER(_display_name) NOT LIKE '%.gif' AND LOWER(_display_name) NOT LIKE '%.dng' AND LOWER(_display_name) NOT LIKE '%.arw' AND LOWER(_display_name) NOT LIKE '%.srf' AND LOWER(_display_name) NOT LIKE '%.sr2' AND LOWER(_display_name) NOT LIKE '%.srw' ", null, str3, 1, sensitiveData);
        }
        return AbstractC23280z4.m120358v0(MediaStore.Files.getContentUri("external"), null, str2, null, str3, 1, sensitiveData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m155308e(MediaItem mediaItem, boolean z11) {
        long j11;
        long j12;
        String[] strArr;
        MediaItem mediaItem2;
        System.currentTimeMillis();
        c cVar = this.f148594j;
        long j13 = 0;
        if (cVar != null) {
            j11 = cVar.mo115169b();
        } else {
            j11 = 0;
        }
        String[] strArr2 = {"date_added", "date_modified", "datetaken", "datetaken"};
        try {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = 0;
            while (i11 < 4) {
                String str = strArr2[i11];
                Cursor m155307d = m155307d(this.f148585a, str);
                if (m155307d != null) {
                    try {
                        if (m155307d.moveToFirst()) {
                            int columnIndex = m155307d.getColumnIndex("_id");
                            int columnIndex2 = m155307d.getColumnIndex("media_type");
                            int columnIndex3 = m155307d.getColumnIndex("_data");
                            int columnIndex4 = m155307d.getColumnIndex(str);
                            long j14 = m155307d.getLong(columnIndex4);
                            if (j14 > System.currentTimeMillis() / 1000) {
                                j14 /= 1000;
                            }
                            j12 = currentTimeMillis;
                            long j15 = j14;
                            if (j15 > j13) {
                                String m120357v = AbstractC23280z4.m120357v(m155307d, m155309n(this.f148585a), columnIndex, columnIndex3);
                                int i12 = this.f148585a;
                                strArr = strArr2;
                                int i13 = 1;
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        i13 = 3;
                                    } else {
                                        i13 = m155307d.getInt(columnIndex2);
                                    }
                                }
                                if (m155318m(m120357v, i13)) {
                                    Long.signum(j15);
                                    if (j12 - (1000 * j15) <= this.f148586b.m2729c() && j15 > j11) {
                                        if (i13 == 3) {
                                            mediaItem2 = new VideoItem();
                                        } else {
                                            mediaItem2 = new MediaItem();
                                        }
                                        mediaItem2.mo41080F0(m155307d.getLong(columnIndex));
                                        mediaItem2.mo41082W0(m120357v);
                                        mediaItem2.m41105I0(j15);
                                        mediaItem2.m41107J0(m155307d.getLong(columnIndex4));
                                        this.f148588d = mediaItem2;
                                        j13 = j15;
                                    }
                                }
                                m155307d.close();
                                i11++;
                                strArr2 = strArr;
                                currentTimeMillis = j12;
                            } else {
                                strArr = strArr2;
                            }
                            if (m155307d == null) {
                                m155307d.close();
                                i11++;
                                strArr2 = strArr;
                                currentTimeMillis = j12;
                            } else {
                                i11++;
                                strArr2 = strArr;
                                currentTimeMillis = j12;
                            }
                        }
                    } finally {
                    }
                }
                strArr = strArr2;
                j12 = currentTimeMillis;
                if (m155307d == null) {
                }
            }
            if (this.f148588d != null) {
                c cVar2 = this.f148594j;
                if (cVar2 != null) {
                    cVar2.mo115168a(System.currentTimeMillis());
                }
                m155312g();
            }
            this.f148587c = false;
            if (this.f148588d != mediaItem && z11) {
                C23744a.m124114c().m124116d(50, new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                AbstractC23350e.m122778h(th2);
                this.f148587c = false;
                if (this.f148588d != mediaItem && z11) {
                    C23744a.m124114c().m124116d(50, new Object[0]);
                }
            } finally {
            }
        }
    }

    /* renamed from: n */
    private Uri m155309n(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return f148583m;
            }
            return f148582l;
        }
        return MediaStore.Files.getContentUri("external");
    }

    /* renamed from: c */
    public MediaItem m155310c() {
        if (this.f148588d != null && this.f148586b != null && System.currentTimeMillis() - (this.f148588d.m41097D() * 1000) <= this.f148586b.m2729c()) {
            return this.f148588d;
        }
        return null;
    }

    /* renamed from: f */
    public void m155311f(final boolean z11) {
        long j11;
        C0884c c0884c = this.f148586b;
        if (c0884c == null || !c0884c.m2732f() || !AbstractC23034c6.m118121G() || this.f148587c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        c cVar = this.f148594j;
        if (cVar != null) {
            j11 = cVar.mo115170c();
        } else {
            j11 = 0;
        }
        if (currentTimeMillis - j11 <= this.f148586b.m2731e()) {
            return;
        }
        this.f148587c = true;
        final MediaItem mediaItem = this.f148588d;
        this.f148588d = null;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.ya
            @Override // java.lang.Runnable
            public final void run() {
                C32207za.this.m155308e(mediaItem, z11);
            }
        });
    }

    /* renamed from: g */
    public void m155312g() {
        if (this.f148588d != null) {
            if (this.f148588d instanceof VideoItem) {
                ((C23528a) this.f148589e.m123612r(this.f148590f)).m123618x(((VideoItem) this.f148588d).m41212s1(), C23278z2.m120120d0());
            } else {
                ((C23528a) this.f148589e.m123612r(this.f148590f)).m123618x(this.f148588d.mo41081Q(), C23278z2.m120120d0());
            }
        }
    }

    /* renamed from: h */
    public void m155313h() {
        MainApplication.getAppContext().getContentResolver().registerContentObserver(f148582l, true, this.f148592h);
        MainApplication.getAppContext().getContentResolver().registerContentObserver(f148583m, true, this.f148593i);
    }

    /* renamed from: i */
    public void m155314i() {
        this.f148588d = null;
    }

    /* renamed from: j */
    public void m155315j(int i11) {
        this.f148585a = i11;
    }

    /* renamed from: k */
    public void m155316k(c cVar) {
        this.f148594j = cVar;
    }

    /* renamed from: l */
    public void m155317l(C0884c c0884c) {
        this.f148586b = c0884c;
    }

    /* renamed from: m */
    boolean m155318m(String str, int i11) {
        String m118225x;
        if (AbstractC23254w8.m119859g(str)) {
            C20556f c20556f = new C20556f(str);
            if (Build.VERSION.SDK_INT >= 29) {
                m118225x = c20556f.m106843p();
                if (m118225x == null) {
                    m118225x = "";
                }
                if (m118225x.endsWith(File.separator)) {
                    m118225x = m118225x.substring(0, m118225x.length() - 1);
                }
            } else {
                m118225x = AbstractC23041d2.m118225x(c20556f.m106831c());
            }
        } else {
            m118225x = AbstractC23041d2.m118225x(str);
        }
        if (m118225x.isEmpty() || (!m118225x.endsWith(C32050o7.f147578k) && !m118225x.endsWith(C32050o7.f147579l) && !m118225x.endsWith(C32050o7.f147580m) && !m118225x.endsWith(C32050o7.f147581n))) {
            return false;
        }
        if (i11 == 3) {
            return true;
        }
        return AbstractC23258x2.m119958q(str);
    }

    /* renamed from: o */
    public void m155319o() {
        MainApplication.getAppContext().getContentResolver().unregisterContentObserver(this.f148592h);
        MainApplication.getAppContext().getContentResolver().unregisterContentObserver(this.f148593i);
    }
}
