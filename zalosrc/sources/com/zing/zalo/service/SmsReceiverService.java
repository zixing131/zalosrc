package com.zing.zalo.service;

import ag0.C0815e1;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.provider.MediaStore;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.service.SmsReceiverService;
import java.io.InputStream;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23280z4;
import me0.C23257x1;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p227i3.C20219w;
import p239ih.C20556f;
import p348mi.AbstractC23309i;
import p361nb.C23659p;
import p609wh.AbstractC28998a;
import p667y2.C30271h;
import vg.C28023b6;
import vg.C28157p5;

/* loaded from: classes.dex */
public class SmsReceiverService extends ZaloIntentServiceEmulate {

    /* renamed from: e */
    static final String f49548e = "SmsReceiverService";

    /* renamed from: f */
    static long f49549f;

    /* renamed from: g */
    static final Uri f49550g = MediaStore.Files.getContentUri("external");

    /* renamed from: h */
    static long f49551h = 0;

    /* renamed from: i */
    static final String[] f49552i = {"_data", "_display_name", "width", "height", "_size", "duration", "media_type", "_id", "date_modified", "date_added"};

    /* renamed from: c */
    final Runnable f49553c = new Runnable() { // from class: q00.j
        @Override // java.lang.Runnable
        public final void run() {
            SmsReceiverService.this.m50443k();
        }
    };

    /* renamed from: d */
    final Runnable f49554d = new Runnable() { // from class: q00.k
        @Override // java.lang.Runnable
        public final void run() {
            SmsReceiverService.this.m50444l();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m50443k() {
        f49549f = System.currentTimeMillis();
        m50446j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m50444l() {
        f49551h = System.currentTimeMillis();
        m50447m();
    }

    @Override // com.zing.zalo.service.ZaloIntentServiceEmulate
    /* renamed from: f */
    protected void mo50445f(Intent intent) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleIntent:");
            sb2.append(intent);
            if (intent != null && "com.zing.zalo.action.COUNT_NEWEST_PHOTO_PROVIDER".equals(intent.getAction())) {
                long abs = Math.abs(System.currentTimeMillis() - f49551h);
                if (abs < 60000) {
                    TaskNonStickyExecutor.m50450b().m50456g(this.f49554d, TaskNonStickyExecutor.f49559c, 60000 - abs);
                } else {
                    TaskNonStickyExecutor.m50450b().m50455f(this.f49554d, TaskNonStickyExecutor.f49559c);
                }
            } else if (intent != null && "com.zing.zalo.action.CHECK_CAPTIVE_PORTAL".equals(intent.getAction())) {
                boolean booleanExtra = intent.getBooleanExtra("skip_interval", false);
                long abs2 = Math.abs(System.currentTimeMillis() - f49549f);
                if (abs2 < 60000 && !booleanExtra) {
                    TaskNonStickyExecutor.m50450b().m50456g(this.f49553c, TaskNonStickyExecutor.f49560d, 60000 - abs2);
                } else {
                    TaskNonStickyExecutor.m50450b().m50455f(this.f49553c, TaskNonStickyExecutor.f49560d);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f49548e, e11);
        }
    }

    /* renamed from: j */
    void m50446j() {
        try {
            String m144872a = AbstractC28998a.m144872a();
            if (m144872a != null) {
                C28023b6.m141250h0().m141355k1(m144872a);
            } else {
                C28023b6.m141250h0().m141391w();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(5:22|23|(1:25)(1:85)|26|27)|(5:29|(4:(2:47|(3:50|(2:53|54)|52))|33|34|(1:36))|59|60|(15:62|63|64|65|66|67|68|69|70|71|72|73|74|42|(1:45)(1:44)))|84|65|66|67|68|69|70|71|72|73|74|42|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:22|23|(1:25)(1:85)|26|27|(5:29|(4:(2:47|(3:50|(2:53|54)|52))|33|34|(1:36))|59|60|(15:62|63|64|65|66|67|68|69|70|71|72|73|74|42|(1:45)(1:44)))|84|65|66|67|68|69|70|71|72|73|74|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0226, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020e, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0231 A[LOOP:0: B:22:0x00cb->B:44:0x0231, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230 A[EDGE_INSN: B:45:0x0230->B:46:0x0230 BREAK  A[LOOP:0: B:22:0x00cb->B:44:0x0231], SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m50447m() {
        int count;
        String str;
        String str2;
        JSONObject jSONObject;
        long j11;
        long j12;
        int i11;
        int i12;
        int i13;
        double d11;
        double d12;
        long j13;
        String m120357v;
        C20556f c20556f;
        C23257x1 m106833e;
        long j14;
        double d13;
        double d14;
        float[] m106839l;
        String str3 = "ImageDescription";
        String str4 = "date_modified";
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long m120854D6 = AbstractC23309i.m120854D6();
            if (m120854D6 == 0 || m120854D6 > currentTimeMillis) {
                AbstractC23309i.m120845Cy(currentTimeMillis);
            }
            AbstractC23309i.m121802cr(currentTimeMillis);
            long m121902fd = AbstractC23309i.m121902fd();
            if (m121902fd <= 0) {
                AbstractC23309i.m120845Cy(currentTimeMillis);
                AbstractC23309i.m122333qu(0);
                return;
            }
            if (!AbstractC23034c6.m118121G()) {
                return;
            }
            m50471c().getContentResolver();
            long j15 = 1000;
            Cursor m120358v0 = AbstractC23280z4.m120358v0(f49550g, f49552i, "(media_type=1 OR media_type=3) AND " + String.format("((%s >= ? AND %s < ?) OR (%s >= ? AND %s < ?))", "date_added", "date_added", "date_modified", "date_modified"), new String[]{String.valueOf(m121902fd / 1000), String.valueOf(currentTimeMillis / 1000), String.valueOf(m121902fd / 1000), String.valueOf(currentTimeMillis / 1000)}, " _id asc ", 20, new SensitiveData("gallery_get_last_media_thumb", "camera"));
            if (m120358v0 != null && m120358v0.moveToFirst() && (count = m120358v0.getCount()) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("increase NumberCountNewestPhotoProvider:");
                sb2.append(count);
                AbstractC23309i.m120845Cy(currentTimeMillis);
                AbstractC23309i.m122333qu(AbstractC23309i.m120820C9() + count);
                while (true) {
                    try {
                        jSONObject = new JSONObject();
                        j11 = m120358v0.getLong(m120358v0.getColumnIndexOrThrow("duration")) / j15;
                        j12 = m120358v0.getLong(m120358v0.getColumnIndexOrThrow("_size"));
                        i11 = m120358v0.getInt(m120358v0.getColumnIndexOrThrow("width"));
                        i12 = m120358v0.getInt(m120358v0.getColumnIndexOrThrow("height"));
                        i13 = m120358v0.getInt(m120358v0.getColumnIndexOrThrow("media_type"));
                        Location m141673c = C28157p5.m141667d().m141673c();
                        if (m141673c != null) {
                            d11 = m141673c.getLongitude();
                            d12 = m141673c.getLatitude();
                        } else {
                            d11 = 0.0d;
                            d12 = 0.0d;
                        }
                        j13 = m120358v0.getLong(m120358v0.getColumnIndexOrThrow(str4));
                        m120357v = AbstractC23280z4.m120357v(m120358v0, f49550g, m120358v0.getColumnIndex("_id"), m120358v0.getColumnIndex("_data"));
                        c20556f = new C20556f(m120357v);
                        m106833e = c20556f.m106833e();
                        str2 = str4;
                    } catch (Exception e11) {
                        e = e11;
                        str = str3;
                        str2 = str4;
                    }
                    if (m106833e != null) {
                        if (i13 == 1) {
                            if (i11 < 1 || i12 < 1) {
                                i11 = m106833e.m119907h("ImageWidth", -1);
                                i12 = m106833e.m119907h("ImageLength", -1);
                                if (i11 < 1 || i12 < 1) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    InputStream m106838k = c20556f.m106838k();
                                    BitmapFactory.decodeStream(m106838k, null, options);
                                    int i14 = options.outWidth;
                                    int i15 = options.outHeight;
                                    if (m106838k != null) {
                                        try {
                                            m106838k.close();
                                        } catch (Exception e12) {
                                            AbstractC23350e.m122778h(e12);
                                        }
                                    }
                                    i11 = i14;
                                    i12 = i15;
                                }
                            }
                            try {
                                if (m106833e.m119912x(str3)) {
                                    jSONObject.put("exif_imgd", m106833e.m119906g(str3));
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str = str3;
                                AbstractC23350e.m122778h(e);
                                if (m120358v0.moveToNext()) {
                                }
                            }
                        }
                        try {
                            m106839l = c20556f.m106839l();
                        } catch (Exception e14) {
                            e = e14;
                            str = str3;
                            AbstractC23350e.m122778h(e);
                            if (m120358v0.moveToNext()) {
                            }
                        }
                        if (m106839l.length >= 2) {
                            j14 = j13;
                            d13 = m106839l[0];
                            d14 = m106839l[1];
                            String string = m120358v0.getString(m120358v0.getColumnIndexOrThrow("_display_name"));
                            str = str3;
                            String m118221t = AbstractC23041d2.m118221t(string, false);
                            jSONObject.put("time", j11);
                            jSONObject.put("size", j12);
                            jSONObject.put("ext", m118221t);
                            jSONObject.put(C20219w.f100062c, i11);
                            jSONObject.put(C30271h.f140642d, i12);
                            jSONObject.put("lon_img", d14);
                            jSONObject.put("lat_img", d13);
                            jSONObject.put("lon_device", d11);
                            jSONObject.put("lat_device", d12);
                            jSONObject.put("createTime", j14);
                            jSONObject.put("fileName", string);
                            jSONObject.put("filePath", m120357v);
                            C23659p c23659p = new C23659p();
                            c23659p.m123973g(0, jSONObject.toString());
                            C0815e1.m2075D().m2098T(c23659p);
                            if (m120358v0.moveToNext()) {
                                break;
                            }
                            str3 = str;
                            str4 = str2;
                            j15 = 1000;
                        }
                    }
                    j14 = j13;
                    d13 = 0.0d;
                    d14 = 0.0d;
                    String string2 = m120358v0.getString(m120358v0.getColumnIndexOrThrow("_display_name"));
                    str = str3;
                    String m118221t2 = AbstractC23041d2.m118221t(string2, false);
                    jSONObject.put("time", j11);
                    jSONObject.put("size", j12);
                    jSONObject.put("ext", m118221t2);
                    jSONObject.put(C20219w.f100062c, i11);
                    jSONObject.put(C30271h.f140642d, i12);
                    jSONObject.put("lon_img", d14);
                    jSONObject.put("lat_img", d13);
                    jSONObject.put("lon_device", d11);
                    jSONObject.put("lat_device", d12);
                    jSONObject.put("createTime", j14);
                    jSONObject.put("fileName", string2);
                    jSONObject.put("filePath", m120357v);
                    C23659p c23659p2 = new C23659p();
                    c23659p2.m123973g(0, jSONObject.toString());
                    C0815e1.m2075D().m2098T(c23659p2);
                    if (m120358v0.moveToNext()) {
                    }
                }
            }
            if (m120358v0 != null && !m120358v0.isClosed()) {
                m120358v0.close();
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122778h(th2);
        }
    }
}
