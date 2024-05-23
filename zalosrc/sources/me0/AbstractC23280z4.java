package me0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.text.AbstractC1463b;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.picker.dialog.RecommendHDDialog;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import f90.C18826a;
import ho0.AbstractC20110a;
import hu.AbstractC20129c;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p239ih.C20556f;
import p276jt.C21358m;
import p324lh.AbstractC22485a;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p493rt.C25977a;
import p559uv.C27373c;
import p620wt.AbstractC29238m;
import p716zh.AbstractC32201z4;
import se0.AbstractC26237b;
import su.C26388b;
import th.AbstractC26683d;
import th.AbstractC26684e;
import th.AbstractC26689j;
import tv.AbstractC26897a;
import vg.C28139n5;

/* renamed from: me0.z4 */
/* loaded from: classes.dex */
public abstract class AbstractC23280z4 {

    /* renamed from: a */
    private static final String[] f113019a = {"/data/sec/"};

    /* renamed from: b */
    static boolean f113020b = false;

    /* renamed from: c */
    private static final Object f113021c = new Object();

    /* renamed from: A */
    public static File m120289A(String str) {
        return new File(AbstractC20130d.m104876j0() + str.substring(str.lastIndexOf("/") + 1));
    }

    /* renamed from: B */
    public static long m120290B(Uri uri, String str, String[] strArr) {
        long j11;
        try {
            Cursor m120358v0 = m120358v0(uri, new String[]{"_size"}, str, strArr, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToFirst()) {
                        int columnIndexOrThrow = m120358v0.getColumnIndexOrThrow("_size");
                        if (columnIndexOrThrow >= 0) {
                            j11 = m120358v0.getLong(columnIndexOrThrow);
                        } else {
                            j11 = 0;
                        }
                        m120358v0.close();
                        return j11;
                    }
                } catch (Throwable th2) {
                    try {
                        m120358v0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return 0L;
    }

    /* renamed from: C */
    public static int m120291C(int i11) {
        if (m120318b0(i11) || !m120320c0(i11)) {
            return 0;
        }
        return 2;
    }

    /* renamed from: D */
    public static String m120292D(MediaItem mediaItem) {
        if (mediaItem != null) {
            if (mediaItem instanceof VideoItem) {
                return ((VideoItem) mediaItem).m41212s1();
            }
            if (mediaItem.mo41154l0()) {
                return mediaItem.m41113N();
            }
            String mo41083a0 = mediaItem.mo41083a0();
            if (TextUtils.isEmpty(mo41083a0)) {
                return mediaItem.m41148i0();
            }
            return mo41083a0;
        }
        return "";
    }

    /* renamed from: E */
    public static int m120293E() {
        int i11 = 0;
        try {
            Cursor m120358v0 = m120358v0(C18826a.f94118d, new String[]{"COUNT(_id)"}, C18826a.f94124j, null, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToNext()) {
                        i11 = m120358v0.getInt(0);
                    }
                } finally {
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    /* renamed from: F */
    public static File m120294F(String str) {
        return new File(AbstractC20130d.m104874i0() + str.substring(str.lastIndexOf("/") + 1));
    }

    /* renamed from: G */
    public static boolean m120295G(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && !TextUtils.isEmpty(restoreDecorData.m41180a())) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m120296H(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && !TextUtils.isEmpty(restoreDecorData.m41187h())) {
            try {
                if (new JSONArray(restoreDecorData.m41187h()).length() < 1) {
                    return false;
                }
                return true;
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m120297I(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && !TextUtils.isEmpty(restoreDecorData.m41185f())) {
            try {
                return !C21358m.m110679h0(new JSONObject(restoreDecorData.m41185f()));
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: J */
    private static boolean m120298J(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && !TextUtils.isEmpty(restoreDecorData.m41186g())) {
            try {
                return new JSONObject(restoreDecorData.m41186g()).has("id");
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static int m120299K(List list, MediaItem mediaItem) {
        if (list != null && mediaItem != null) {
            int i11 = 0;
            while (i11 < list.size()) {
                MediaItem mediaItem2 = (MediaItem) list.get(i11);
                if (mediaItem2 != mediaItem) {
                    if ((mediaItem2.mo41090x() <= 0 || mediaItem2.mo41090x() != mediaItem.mo41090x()) && !mediaItem2.mo41081Q().equals(mediaItem.mo41081Q())) {
                        i11++;
                    } else {
                        return i11;
                    }
                } else {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m120300L(String str, String str2, boolean z11, SensitiveData sensitiveData) {
        Uri uri;
        String str3;
        String str4;
        boolean z12;
        try {
        } catch (Exception e11) {
            e = e11;
            uri = null;
            AbstractC20110a.m104539h(e);
            m120323e(uri);
            uri = null;
            if (uri == null) {
            }
        }
        if (AbstractC23254w8.m119859g(str)) {
            m120362x0(Uri.parse(str));
            return str;
        }
        C20556f c20556f = new C20556f(str);
        String m106835h = c20556f.m106835h();
        if (c20556f.m106830b() && m106835h != null) {
            if (!str2.isEmpty()) {
                m106835h = str2;
            }
            int lastIndexOf = m106835h.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                str3 = m106835h.substring(0, lastIndexOf);
            } else {
                str3 = m106835h;
            }
            if (lastIndexOf >= 0) {
                str4 = m106835h.substring(lastIndexOf + 1);
            } else {
                str4 = "";
            }
            String m116269b = AbstractC22485a.m116269b(str4.toLowerCase());
            if (TextUtils.isEmpty(m116269b)) {
                m116269b = "*/*";
            }
            ContentValues m120321d = m120321d(c20556f, m106835h, str3, m116269b);
            if (TextUtils.equals(m116269b, "video/mp4") || TextUtils.equals(m116269b, "video/3gpp")) {
                long m17442j = AbstractC3460h.m17442j(str);
                if (m17442j > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        m120321d.put("duration", Long.valueOf(m17442j));
                    } else {
                        m120321d.put("duration", Long.valueOf(m17442j));
                    }
                }
            }
            if (sensitiveData != null) {
                try {
                    C8937j0.m47658g().m43203b(C23046d7.m118248k(sensitiveData, "gallery"));
                } catch (SensitiveDataException unused) {
                    ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_gallery_block_title));
                    return null;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                AbstractC20110a.m104535d("insertFileIntoMediaStore - Q and above", new Object[0]);
                uri = m120301M(MediaStore.Files.getContentUri("external"), m120321d, AbstractC20130d.f99272c, c20556f, m120347q(str3, str4));
                try {
                    if (AbstractC26683d.f126406y && uri != null && !m120311W(uri)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12 && !f113020b) {
                        AbstractC20110a.m104538g("Insert File Media Android Q fallback", new Object[0]);
                        f113020b = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    AbstractC20110a.m104539h(e);
                    m120323e(uri);
                    uri = null;
                    if (uri == null) {
                    }
                }
            } else {
                uri = null;
                z12 = false;
            }
            if (i11 < 29 || z12) {
                AbstractC20110a.m104535d("insertFileIntoMediaStore - preQ", new Object[0]);
                uri = m120319c(MediaStore.Files.getContentUri("external"), m120321d, c20556f, AbstractC20130d.m104855S() + m106835h, z11);
            }
            if (uri != null && m120310V(c20556f, uri)) {
                m120323e(uri);
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            return uri.toString();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String, java.lang.String[]] */
    /* renamed from: M */
    private static Uri m120301M(Uri uri, ContentValues contentValues, String str, C20556f c20556f, String str2) {
        ?? r22;
        Uri uri2;
        Uri uri3;
        String str3;
        Uri m135978d;
        try {
            ContentResolver m135977c = C26388b.m135977c(MainApplication.getAppContext());
            contentValues.put("relative_path", str);
            contentValues.put("is_pending", (Integer) 1);
            AbstractC20110a.m104535d("ContentValues: \n_size - " + contentValues.get("_size") + "\n_display_name - " + contentValues.get("_display_name") + "\ntitle - " + contentValues.get("title") + "\ndate_added - " + contentValues.get("date_added") + "\ndate_modified - " + contentValues.get("date_modified") + "\nmime_type - " + contentValues.get("mime_type") + "\n_data - " + contentValues.get("_data") + "\nlongitude - " + contentValues.get("longitude") + "\nlatitude - " + contentValues.get("latitude") + "\norientation - " + contentValues.get("orientation") + "\nduration - " + contentValues.get("duration") + "\nrelative_path - " + contentValues.get("relative_path") + "\n", new Object[0]);
            try {
                m135978d = C26388b.m135978d(m135977c, uri, contentValues, true);
                str3 = str2;
            } catch (IllegalStateException unused) {
                str3 = str2;
                try {
                    contentValues.put("_display_name", str3);
                    m135978d = C26388b.m135978d(m135977c, uri, contentValues, false);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    uri2 = null;
                }
            } catch (Exception e12) {
                e = e12;
                r22 = 0;
                uri2 = null;
                AbstractC20110a.m104539h(e);
                m120323e(uri2);
                uri3 = r22;
                return uri3;
            }
            uri2 = m135978d;
            if (uri2 != null) {
                try {
                    boolean m118385c = AbstractC23078g6.m118385c(c20556f.m106842o());
                    AbstractC20110a.m104535d("start copyStreamAndClose", new Object[0]);
                    if (m118385c) {
                        ZJXLDecoder.Options options = new ZJXLDecoder.Options();
                        options.f88636a = true;
                        if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(c20556f.m106842o(), options)) == 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(options.bmPreviewWidth, options.bmPreviewHeight, Bitmap.Config.ARGB_8888);
                            if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(c20556f.m106842o(), 1, createBitmap)) == 0) {
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, m135977c.openOutputStream(uri2));
                            }
                        }
                    } else {
                        try {
                            InputStream m106838k = c20556f.m106838k();
                            try {
                                OutputStream openOutputStream = m135977c.openOutputStream(uri2);
                                if (m106838k != null && openOutputStream != null) {
                                    try {
                                        AbstractC29238m.m145997a(m106838k, openOutputStream);
                                    } finally {
                                    }
                                }
                                if (openOutputStream != null) {
                                    openOutputStream.close();
                                }
                                if (m106838k != null) {
                                    m106838k.close();
                                }
                            } finally {
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    try {
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        r22 = 0;
                    } catch (Exception unused3) {
                        r22 = 0;
                    }
                    try {
                        m135977c.update(uri2, contentValues, null, null);
                    } catch (Exception unused4) {
                        try {
                            contentValues.put("_display_name", str3);
                            m135977c.update(uri2, contentValues, r22, r22);
                            return uri2;
                        } catch (Exception e13) {
                            try {
                                AbstractC20110a.m104539h(e13);
                                m120323e(uri2);
                                uri3 = r22;
                            } catch (Exception e14) {
                                e = e14;
                                AbstractC20110a.m104539h(e);
                                m120323e(uri2);
                                uri3 = r22;
                                return uri3;
                            }
                            return uri3;
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    r22 = 0;
                }
            }
            return uri2;
        } catch (Exception e16) {
            e = e16;
            r22 = 0;
            uri2 = null;
            AbstractC20110a.m104539h(e);
            m120323e(uri2);
            uri3 = r22;
            return uri3;
        }
    }

    /* renamed from: N */
    public static String m120302N(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11, SensitiveData sensitiveData) {
        try {
            String str = ".jpg";
            if (compressFormat == Bitmap.CompressFormat.PNG) {
                str = ".png";
            }
            String str2 = "IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + str;
            File file = new File(AbstractC23204s0.m119555f(), str2);
            bitmap.compress(compressFormat, i11, new FileOutputStream(file));
            return m120304P(file.getPath(), str2, true, false, false, sensitiveData);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m120303O(String str, String str2, String str3, boolean z11, boolean z12, boolean z13, SensitiveData sensitiveData) {
        Uri uri;
        Uri uri2;
        Uri uri3;
        String str4;
        String str5;
        String str6;
        int i11;
        Uri uri4;
        boolean z14;
        boolean z15;
        if (!z12) {
            try {
                if (AbstractC23254w8.m119859g(str)) {
                    m120362x0(Uri.parse(str));
                    return str;
                }
            } catch (Exception e11) {
                e = e11;
                uri = null;
                uri2 = uri;
                AbstractC20110a.m104539h(e);
                m120323e(uri2);
                uri3 = uri;
                if (uri3 != null) {
                }
            }
        }
        C20556f c20556f = new C20556f(str);
        if (!c20556f.m106830b()) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = Environment.DIRECTORY_PICTURES;
        } else {
            str4 = str2;
        }
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str5 = str3.substring(0, lastIndexOf);
        } else {
            str5 = str3;
        }
        if (lastIndexOf >= 0) {
            str6 = str3.substring(lastIndexOf + 1);
        } else {
            str6 = "";
        }
        String m116269b = AbstractC22485a.m116269b(str6.toLowerCase());
        if (TextUtils.isEmpty(m116269b)) {
            m116269b = "image/jpeg";
        }
        if (z11) {
            i11 = AbstractC23277z1.m120058b(str);
        } else {
            i11 = 0;
        }
        double m141645r = C28139n5.m141620j().m141645r();
        double m141640m = C28139n5.m141620j().m141640m();
        ContentValues m120321d = m120321d(c20556f, str3, str5, m116269b);
        try {
            m120321d.put("longitude", Double.valueOf(m141645r));
            m120321d.put("latitude", Double.valueOf(m141640m));
            if (i11 > 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        m120321d.put("orientation", Integer.valueOf(i11));
                    } else {
                        m120321d.put("orientation", Integer.valueOf(i11));
                    }
                } catch (Exception e12) {
                    e = e12;
                    uri = null;
                    uri2 = null;
                    AbstractC20110a.m104539h(e);
                    m120323e(uri2);
                    uri3 = uri;
                    if (uri3 != null) {
                    }
                }
            }
            if ("image/jpeg".equals(m116269b)) {
                C23267y1 c23267y1 = new C23267y1();
                c23267y1.m120025b(m141640m, m141645r);
                c23267y1.m120024a(true);
                AbstractC23277z1.m120059c(c23267y1, new File(c20556f.m106842o()));
            }
            try {
                C8937j0.m47658g().m43203b(C23046d7.m118248k(sensitiveData, "gallery"));
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    AbstractC20110a.m104535d("insertPhotoIntoMediaStore - Q and above", new Object[0]);
                    uri4 = m120301M(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, m120321d, AbstractC20130d.m104868c0(str4), c20556f, m120347q(str5, str6));
                    try {
                        if (AbstractC26683d.f126404w && uri4 != null && !m120311W(uri4)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15 && !f113020b) {
                            AbstractC20110a.m104538g("Insert Photo Media Android Q fallback", new Object[0]);
                            f113020b = true;
                        }
                        z14 = z15;
                    } catch (Exception e13) {
                        e = e13;
                        uri2 = uri4;
                        uri = null;
                        AbstractC20110a.m104539h(e);
                        m120323e(uri2);
                        uri3 = uri;
                        if (uri3 != null) {
                        }
                    }
                } else {
                    uri4 = null;
                    z14 = false;
                }
                if (i12 < 29 || z14) {
                    AbstractC20110a.m104535d("insertPhotoIntoMediaStore - preQ", new Object[0]);
                    uri4 = m120319c(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, m120321d, c20556f, AbstractC20130d.m104867b0(str4) + File.separator + str3, z13);
                }
                if (uri4 != null && m120310V(c20556f, uri4)) {
                    m120323e(uri4);
                    uri4 = null;
                }
                uri3 = uri4;
                uri = null;
            } catch (SensitiveDataException unused) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_gallery_block_title));
                return null;
            }
        } catch (Exception e14) {
            e = e14;
            uri = null;
            uri2 = uri;
            AbstractC20110a.m104539h(e);
            m120323e(uri2);
            uri3 = uri;
            if (uri3 != null) {
            }
        }
        if (uri3 != null) {
            return uri3.toString();
        }
        return uri;
    }

    /* renamed from: P */
    public static String m120304P(String str, String str2, boolean z11, boolean z12, boolean z13, SensitiveData sensitiveData) {
        return m120303O(str, Environment.DIRECTORY_PICTURES, str2, z11, z12, z13, sensitiveData);
    }

    /* renamed from: Q */
    public static String m120305Q(String str, String str2, long j11, boolean z11, boolean z12, SensitiveData sensitiveData) {
        return m120306R(str, Environment.DIRECTORY_MOVIES, str2, j11, z11, z12, sensitiveData);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #3 {Exception -> 0x0016, blocks: (B:78:0x0008, B:80:0x000e, B:3:0x001a, B:7:0x0026, B:9:0x002c, B:10:0x0030, B:12:0x0039, B:15:0x0042, B:16:0x004a, B:19:0x005a, B:23:0x0082, B:26:0x008a, B:28:0x0099, B:29:0x00a1, B:31:0x00aa, B:62:0x011a, B:66:0x0092, B:73:0x007d, B:68:0x0064, B:70:0x006e), top: B:77:0x0008, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #3 {Exception -> 0x0016, blocks: (B:78:0x0008, B:80:0x000e, B:3:0x001a, B:7:0x0026, B:9:0x002c, B:10:0x0030, B:12:0x0039, B:15:0x0042, B:16:0x004a, B:19:0x005a, B:23:0x0082, B:26:0x008a, B:28:0x0099, B:29:0x00a1, B:31:0x00aa, B:62:0x011a, B:66:0x0092, B:73:0x007d, B:68:0x0064, B:70:0x006e), top: B:77:0x0008, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #3 {Exception -> 0x0016, blocks: (B:78:0x0008, B:80:0x000e, B:3:0x001a, B:7:0x0026, B:9:0x002c, B:10:0x0030, B:12:0x0039, B:15:0x0042, B:16:0x004a, B:19:0x005a, B:23:0x0082, B:26:0x008a, B:28:0x0099, B:29:0x00a1, B:31:0x00aa, B:62:0x011a, B:66:0x0092, B:73:0x007d, B:68:0x0064, B:70:0x006e), top: B:77:0x0008, inners: #1, #2 }] */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m120306R(String str, String str2, String str3, long j11, boolean z11, boolean z12, SensitiveData sensitiveData) {
        Uri uri;
        String str4;
        String str5;
        String str6;
        Map m138617c;
        long parseLong;
        int i11;
        boolean z13;
        if (!z11) {
            try {
                if (AbstractC23254w8.m119859g(str)) {
                    m120362x0(Uri.parse(str));
                    return str;
                }
            } catch (Exception e11) {
                e = e11;
                uri = null;
                AbstractC20110a.m104539h(e);
                m120323e(uri);
                uri = null;
                if (uri != null) {
                }
            }
        }
        C20556f c20556f = new C20556f(str);
        if (!c20556f.m106830b()) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = Environment.DIRECTORY_MOVIES;
        } else {
            str4 = str2;
        }
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str5 = str3.substring(0, lastIndexOf);
        } else {
            str5 = str3;
        }
        if (lastIndexOf >= 0) {
            str6 = str3.substring(lastIndexOf + 1);
        } else {
            str6 = "";
        }
        String m116269b = AbstractC22485a.m116269b(str6.toLowerCase());
        if (TextUtils.isEmpty(m116269b)) {
            m116269b = "video/mp4";
        }
        ContentValues m120321d = m120321d(c20556f, str3, str5, m116269b);
        try {
            if (j11 == 0) {
                try {
                    m138617c = AbstractC26897a.m138617c(str);
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                    String str7 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                    Objects.requireNonNull(str7);
                    parseLong = Long.parseLong(str7);
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 < 29) {
                        m120321d.put("duration", Long.valueOf(parseLong));
                    } else {
                        m120321d.put("duration", Long.valueOf(parseLong));
                    }
                    C8937j0.m47658g().m43203b(C23046d7.m118248k(sensitiveData, "gallery"));
                    if (i11 < 29) {
                        AbstractC20110a.m104535d("insertVideoIntoMediaStore - Q and above", new Object[0]);
                        uri = m120301M(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, m120321d, AbstractC20130d.m104868c0(str4), c20556f, m120347q(str5, str6));
                        try {
                            if (AbstractC26683d.f126405x && uri != null && !m120311W(uri)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13 && !f113020b) {
                                AbstractC20110a.m104538g("Insert Video Media Android Q fallback", new Object[0]);
                                f113020b = true;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            AbstractC20110a.m104539h(e);
                            m120323e(uri);
                            uri = null;
                            if (uri != null) {
                            }
                        }
                    } else {
                        uri = null;
                        z13 = false;
                    }
                    if (i11 >= 29 || z13) {
                        AbstractC20110a.m104535d("insertVideoIntoMediaStore - preQ", new Object[0]);
                        uri = m120319c(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, m120321d, c20556f, AbstractC20130d.m104867b0(str4) + File.separator + str3, z12);
                    }
                    if (uri != null && m120310V(c20556f, uri)) {
                        m120323e(uri);
                        uri = null;
                    }
                    if (uri != null) {
                        return null;
                    }
                    return uri.toString();
                }
            }
            C8937j0.m47658g().m43203b(C23046d7.m118248k(sensitiveData, "gallery"));
            if (i11 < 29) {
            }
            if (i11 >= 29) {
            }
            AbstractC20110a.m104535d("insertVideoIntoMediaStore - preQ", new Object[0]);
            uri = m120319c(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, m120321d, c20556f, AbstractC20130d.m104867b0(str4) + File.separator + str3, z12);
            if (uri != null) {
                m120323e(uri);
                uri = null;
            }
            if (uri != null) {
            }
        } catch (SensitiveDataException unused) {
            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sensitive_gallery_block_title));
            return null;
        }
        parseLong = j11;
        i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
        }
    }

    /* renamed from: S */
    public static boolean m120307S(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (i11 == 9) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 25) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 == 26) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean m120327g = m120327g(i11, 5, 17, 16, 3);
        if (!m120328g0(i11) && m120354t0(i11, 10, 3, 18, 16, 19, 11)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 && !m120327g && !z14 && !z12 && !z13) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static boolean m120308T(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && restoreDecorData.m41183d() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m120309U(MediaItem.RestoreDecorData restoreDecorData) {
        if (restoreDecorData != null && !restoreDecorData.m41184e().equals(AbstractC26237b.m134921f())) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private static boolean m120310V(C20556f c20556f, Uri uri) {
        long j11;
        long m106845r = c20556f.m106845r();
        if (m106845r == 0) {
            return true;
        }
        try {
            j11 = new C20556f(uri.toString()).m106845r();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            j11 = 0;
        }
        if (j11 != 0 && (j11 >= m106845r || AbstractC23238v2.m119726k())) {
            return false;
        }
        AbstractC20110a.m104538g("The storage may full", new Object[0]);
        return true;
    }

    /* renamed from: W */
    private static boolean m120311W(Uri uri) {
        try {
            String m120351s = m120351s(uri);
            if (TextUtils.isEmpty(m120351s)) {
                return AbstractC23041d2.m118194A(uri.toString());
            }
            return AbstractC23041d2.m118194A(m120351s);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: X */
    public static boolean m120312X(MediaItem mediaItem) {
        if (mediaItem != null && (m120297I(mediaItem.m41178z()) || m120296H(mediaItem.m41178z()) || m120298J(mediaItem.m41178z()) || m120295G(mediaItem.m41178z()) || m120309U(mediaItem.m41178z()) || m120308T(mediaItem.m41178z()))) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public static boolean m120313Y(MediaItem mediaItem) {
        String mo41081Q = mediaItem.mo41081Q();
        if (mediaItem.m41174v0()) {
            return false;
        }
        if (!TextUtils.isEmpty(mo41081Q) && AbstractC23041d2.m118194A(mo41081Q)) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public static boolean m120314Z() {
        if (m120359w(true) + m120293E() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public static boolean m120316a0(int i11) {
        return m120327g(i11, 16, 13, 14);
    }

    /* renamed from: b */
    public static void m120317b(ZaloView zaloView) {
        if (zaloView != null && !AbstractC23309i.m122318qf() && AbstractC23309i.m121413Sa() == AbstractC23309i.m121376Ra() - 1 && zaloView.m92648SI() != null && zaloView.m92672lJ()) {
            AbstractC23647d.m123897g("9177562");
            new RecommendHDDialog().m92602UK(zaloView.m92649TI(), "RecommendHDDialog");
        }
    }

    /* renamed from: b0 */
    public static boolean m120318b0(int i11) {
        return i11 == -1 || i11 == 16 || i11 == 3 || i11 == 18 || i11 == 5 || i11 == 6 || i11 == 7 || i11 == 24 || i11 == 25 || i11 == 26;
    }

    /* renamed from: c */
    private static Uri m120319c(Uri uri, ContentValues contentValues, C20556f c20556f, String str, boolean z11) {
        Uri uri2;
        C20556f c20556f2;
        long j11;
        ContentResolver contentResolver = MainApplication.getAppContext().getContentResolver();
        try {
            if (!str.isEmpty()) {
                c20556f2 = new C20556f(str);
            } else {
                c20556f2 = c20556f;
            }
            contentValues.put("_data", c20556f2.m106842o());
            AbstractC20110a.m104535d("ContentValues: \n_size - " + contentValues.get("_size") + "\n_display_name - " + contentValues.get("_display_name") + "\ntitle - " + contentValues.get("title") + "\ndate_added - " + contentValues.get("date_added") + "\ndate_modified - " + contentValues.get("date_modified") + "\nmime_type - " + contentValues.get("mime_type") + "\n_data - " + contentValues.get("_data") + "\nlongitude - " + contentValues.get("longitude") + "\nlatitude - " + contentValues.get("latitude") + "\norientation - " + contentValues.get("orientation") + "\nduration - " + contentValues.get("duration") + "\nrelative_path - " + contentValues.get("relative_path") + "\n", new Object[0]);
            uri2 = C26388b.m135978d(contentResolver, uri, contentValues, true);
            if (uri2 == null) {
                try {
                    uri2 = m120343o(uri, c20556f2.m106842o());
                    if (uri2 != null) {
                        contentResolver.update(uri2, contentValues, null, null);
                    }
                } catch (Exception e11) {
                    e = e11;
                    AbstractC20110a.m104539h(e);
                    m120323e(uri2);
                    return null;
                }
            }
            if (!TextUtils.equals(c20556f.m106842o(), c20556f2.m106842o())) {
                AbstractC20110a.m104535d("clone file", new Object[0]);
                if (z11) {
                    synchronized (f113021c) {
                        j11 = System.nanoTime();
                    }
                    String m155241b = AbstractC32201z4.m155241b(j11, str);
                    contentValues.put("_display_name", AbstractC23041d2.m118212k(m155241b));
                    c20556f2 = new C20556f(m155241b);
                } else {
                    j11 = -1;
                }
                AbstractC20110a.m104535d("start copyStreamAndClose", new Object[0]);
                if (AbstractC23078g6.m118385c(c20556f.m106842o())) {
                    ZJXLDecoder.Options options = new ZJXLDecoder.Options();
                    options.f88636a = true;
                    if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(c20556f.m106842o(), options)) == 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(options.bmPreviewWidth, options.bmPreviewHeight, Bitmap.Config.ARGB_8888);
                        if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(c20556f.m106842o(), 1, createBitmap)) == 0) {
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, contentResolver.openOutputStream(uri2));
                        }
                    }
                } else {
                    AbstractC23238v2.m119716a(c20556f, c20556f2);
                }
                AbstractC32201z4.m155250k(j11);
            }
            return uri2;
        } catch (Exception e12) {
            e = e12;
            uri2 = null;
        }
    }

    /* renamed from: c0 */
    public static boolean m120320c0(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 17 || i11 == 14 || i11 == 13;
    }

    /* renamed from: d */
    private static ContentValues m120321d(C20556f c20556f, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_size", Long.valueOf(c20556f.m106845r()));
        contentValues.put("_display_name", str);
        if (Build.VERSION.SDK_INT < 30) {
            contentValues.put("title", str2);
        }
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("mime_type", str3);
        return contentValues;
    }

    /* renamed from: d0 */
    public static boolean m120322d0(int i11) {
        if (!m120350r0(i11) && !m120316a0(i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m120323e(Uri uri) {
        if (uri != null) {
            try {
                C26388b.m135976b(MainApplication.getAppContext(), uri, null, null, true);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: e0 */
    private static boolean m120324e0() {
        if (!AbstractC26684e.f126415h && Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m120325f() {
        return true;
    }

    /* renamed from: f0 */
    public static boolean m120326f0(String str) {
        for (String str2 : f113019a) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m120327g(int i11, int... iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x001e. Please report as an issue. */
    /* renamed from: g0 */
    public static boolean m120328g0(int i11) {
        if (i11 != 1 && i11 != 2 && i11 != 12 && i11 != 13 && i11 != 17 && i11 != 23 && i11 != 25 && i11 != 26) {
            switch (i11) {
                default:
                    switch (i11) {
                        case 28:
                        case 29:
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        case 31:
                            break;
                        default:
                            return false;
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return true;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static MediaItem m120329h(String str) {
        String m106837j = new C20556f(str).m106837j();
        MediaItem mediaItem = new MediaItem();
        if (m106837j != null) {
            mediaItem.mo41080F0(Long.parseLong(m106837j));
        }
        if (m120324e0() && AbstractC23254w8.m119859g(str)) {
            String m120351s = m120351s(Uri.parse(str));
            if (!m120351s.isEmpty()) {
                mediaItem.mo41082W0(m120351s);
            } else {
                mediaItem.mo41082W0(str);
            }
        } else {
            mediaItem.mo41082W0(str);
        }
        return mediaItem;
    }

    /* renamed from: h0 */
    public static boolean m120330h0(int i11) {
        return m120327g(i11, 16, 13);
    }

    /* renamed from: i */
    public static MediaItem m120331i(String str, boolean z11) {
        MediaItem m120329h = m120329h(str);
        C23307g m118368b = AbstractC23067f6.m118368b(str, z11);
        m120329h.m41155l1(m118368b.f113474a);
        m120329h.m41151j1(m118368b.f113475b);
        return m120329h;
    }

    /* renamed from: i0 */
    public static boolean m120332i0(int i11) {
        return m120327g(i11, 16, 13, 23);
    }

    /* renamed from: j */
    public static File m120333j() {
        return new File(AbstractC20130d.m104894s0() + (System.currentTimeMillis() + "_" + AbstractC23138m0.m118769a() + ".jpg"));
    }

    /* renamed from: j0 */
    public static boolean m120334j0(int i11) {
        return m120327g(i11, 16, 13, 8, 23);
    }

    /* renamed from: k */
    public static List m120335k() {
        String[] strArr = {"_data"};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        try {
            Cursor m120358v0 = m120358v0(uri, strArr, null, null, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToFirst()) {
                        int columnIndex = m120358v0.getColumnIndex("_data");
                        do {
                            if (columnIndex >= 0) {
                                arrayList.add(m120358v0.getString(columnIndex));
                            }
                        } while (m120358v0.moveToNext());
                    }
                } finally {
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public static boolean m120336k0(int i11) {
        return m120327g(i11, 13, 8, 23);
    }

    /* renamed from: l */
    public static List m120337l() {
        ArrayList arrayList = new ArrayList();
        try {
            List<String> m120335k = m120335k();
            String m104806n = AbstractC20129c.m104806n(false);
            for (String str : m120335k) {
                if (!TextUtils.isEmpty(str) && str.startsWith(m104806n)) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static boolean m120338l0(C27373c c27373c, int i11) {
        int i12;
        long m137108q = AbstractC26689j.m137108q(i11);
        int m140269w = c27373c.m140269w();
        int m140247d = c27373c.m140247d();
        long m140255i = c27373c.m140255i();
        C25977a m133806c = C25977a.m133806c(c27373c.m140218C(), c27373c.m140217B(), AbstractC26689j.m137077D(i11), AbstractC26689j.m137106o(i11).m40328a());
        if (m140269w > 0) {
            m140269w = Math.min(m140269w, m133806c.f123942c);
        }
        VideoBlendingParam videoBlendingParam = c27373c.f128947T;
        if (videoBlendingParam != null && (i12 = videoBlendingParam.f48265Q) > 0) {
            m140255i = Math.min(m140255i, i12);
        }
        if (AbstractC3460h.m17435c(m140269w, m140247d, m140255i) / 8388608 <= m137108q) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static File m120339m() {
        return new File(C20131e.f99303a.m104953g() + (System.currentTimeMillis() + "_" + AbstractC23138m0.m118769a() + ".jpg"));
    }

    /* renamed from: m0 */
    public static boolean m120340m0(long j11) {
        return m120342n0(j11, true);
    }

    /* renamed from: n */
    public static File m120341n() {
        return new File(AbstractC20130d.m104905y() + (CoreUtility.f89233i + "_draw_doodle_background_" + System.currentTimeMillis() + ".jpg"));
    }

    /* renamed from: n0 */
    public static boolean m120342n0(long j11, boolean z11) {
        if (j11 / 1000 <= 9223372036854775806L) {
            return false;
        }
        if (z11) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.media_picker_select_duration_limited, 9223372036854775806L));
        }
        return true;
    }

    /* renamed from: o */
    private static Uri m120343o(Uri uri, String str) {
        try {
            Cursor m120358v0 = m120358v0(uri, new String[]{"_id"}, "_data=? ", new String[]{str}, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToFirst()) {
                        Uri withAppendedPath = Uri.withAppendedPath(uri, "" + m120358v0.getInt(m120358v0.getColumnIndex("_id")));
                        m120358v0.close();
                        return withAppendedPath;
                    }
                } finally {
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
                return null;
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: o0 */
    public static boolean m120344o0(long j11, long j12) {
        if (j12 == Long.MAX_VALUE || j11 <= 1048576 * j12) {
            return false;
        }
        int i11 = (int) (((j11 / 1024) / 1024) - j12);
        if (i11 > 0 && i11 <= 10) {
            AbstractC23647d.m123897g("9177111");
            return true;
        }
        if (i11 > 10 && i11 <= 20) {
            AbstractC23647d.m123897g("9177112");
            return true;
        }
        if (i11 > 20 && i11 <= 30) {
            AbstractC23647d.m123897g("9177113");
            return true;
        }
        if (i11 > 30) {
            AbstractC23647d.m123897g("9177114");
            return true;
        }
        return true;
    }

    /* renamed from: p */
    public static File m120345p() {
        return new File(AbstractC20130d.m104905y() + (CoreUtility.f89233i + "_photo_edit_" + System.currentTimeMillis() + ".jpg"));
    }

    /* renamed from: p0 */
    public static boolean m120346p0(long j11) {
        return m120348q0(j11, true);
    }

    /* renamed from: q */
    private static String m120347q(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(System.currentTimeMillis());
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "." + str2;
        }
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: q0 */
    public static boolean m120348q0(long j11, boolean z11) {
        if (j11 < C18826a.f94116b) {
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_gallery_picker_video_invalid));
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static File m120349r() {
        return new File(AbstractC20130d.m104905y() + (CoreUtility.f89233i + "_group_avatar_" + System.currentTimeMillis() + ".jpg"));
    }

    /* renamed from: r0 */
    public static boolean m120350r0(int i11) {
        return m120327g(i11, 9, 18, 26, 29, 31);
    }

    /* renamed from: s */
    public static String m120351s(Uri uri) {
        try {
            Cursor m120358v0 = m120358v0(uri, new String[]{"_data"}, null, null, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.getCount() >= 1) {
                        m120358v0.moveToFirst();
                        String string = m120358v0.getString(m120358v0.getColumnIndexOrThrow("_data"));
                        m120358v0.close();
                        return string;
                    }
                } finally {
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
            return uri.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: t */
    public static String m120353t(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("content".equals(uri.getScheme())) {
            return MainApplication.getAppContext().getContentResolver().getType(uri);
        }
        return AbstractC22485a.m116269b(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    /* renamed from: t0 */
    public static boolean m120354t0(int i11, int... iArr) {
        return !m120327g(i11, iArr);
    }

    /* renamed from: u */
    public static String m120355u(MediaItem mediaItem) {
        if (mediaItem != null) {
            if (mediaItem instanceof VideoItem) {
                return ((VideoItem) mediaItem).m41215v1();
            }
            return mediaItem.mo41081Q();
        }
        return "";
    }

    /* renamed from: u0 */
    public static void m120356u0(VideoItem videoItem) {
        try {
            C27373c c27373c = new C27373c();
            c27373c.m140250e0(videoItem.mo41081Q());
            c27373c.f128944Q = false;
            c27373c.f128943P = false;
            c27373c.f128942O = false;
            if (AbstractC26897a.m138620f(c27373c)) {
                videoItem.m41211G1(c27373c);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v */
    public static String m120357v(Cursor cursor, Uri uri, int i11, int i12) {
        if (m120324e0()) {
            return cursor.getString(i12);
        }
        return Uri.withAppendedPath(uri, cursor.getString(i11)).toString();
    }

    /* renamed from: v0 */
    public static Cursor m120358v0(Uri uri, String[] strArr, String str, String[] strArr2, String str2, int i11, SensitiveData sensitiveData) {
        try {
            C8937j0.m47658g().m43203b(C23046d7.m118248k(sensitiveData, "gallery"));
            if (Build.VERSION.SDK_INT >= 30) {
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString("android:query-arg-sql-selection", str);
                }
                if (strArr2 != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", strArr2);
                }
                if (str2 != null) {
                    bundle.putString("android:query-arg-sql-sort-order", str2);
                }
                if (i11 > 0) {
                    bundle.putInt("android:query-arg-limit", i11);
                }
                return C26388b.m135982h(MainApplication.getAppContext(), uri, strArr, bundle, null, true);
            }
            if (i11 > 0) {
                str2 = str2 + " LIMIT " + i11;
            }
            return C26388b.m135984j(MainApplication.getAppContext(), uri, strArr, str, strArr2, str2, true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: w */
    public static int m120359w(boolean z11) {
        int i11 = 0;
        try {
            Cursor m120358v0 = m120358v0(C18826a.f94117c, new String[]{"COUNT(_id)"}, C18826a.m98812a(z11), null, null, -1, new SensitiveData("gallery_get_more_info_media", "camera"));
            if (m120358v0 != null) {
                try {
                    if (m120358v0.moveToNext()) {
                        i11 = m120358v0.getInt(0);
                    }
                } finally {
                }
            }
            if (m120358v0 != null) {
                m120358v0.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    /* renamed from: w0 */
    public static void m120360w0(Context context, long j11, int i11) {
        String m118746s0;
        try {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_video_too_large_description_in_MB_dialog, Long.valueOf(j11));
                if (j11 >= 1024) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_video_too_large_description_in_GB_dialog, Integer.valueOf(Math.round(((float) j11) / 1024.0f)));
                }
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_video_too_large_description_social_in_MB_dialog, Long.valueOf(j11));
                if (j11 >= 1024) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_video_too_large_description_social_in_GB_dialog, Integer.valueOf(Math.round(((float) j11) / 1024.0f)));
                }
            }
            C16972e0.a aVar = new C16972e0.a(context);
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_too_large_title_dialog)).m90949z(AbstractC1463b.m7440a(m118746s0, 63)).m90943t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_big_size_got_it), new InterfaceC17463d.d() { // from class: me0.y4
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    interfaceC17463d.dismiss();
                }
            });
            aVar.m90927d().mo13822K();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public static String m120361x(MediaItem mediaItem) {
        if (mediaItem != null) {
            if (mediaItem instanceof VideoItem) {
                return ((VideoItem) mediaItem).m41212s1();
            }
            if (mediaItem.mo41154l0()) {
                return mediaItem.m41113N();
            }
            return mediaItem.mo41081Q();
        }
        return "";
    }

    /* renamed from: x0 */
    private static void m120362x0(Uri uri) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        MainApplication.getAppContext().getContentResolver().update(uri, contentValues, null, null);
    }

    /* renamed from: y */
    public static String m120363y(MediaItem mediaItem) {
        if (mediaItem != null) {
            if (mediaItem instanceof VideoItem) {
                return ((VideoItem) mediaItem).m41212s1();
            }
            if (TextUtils.isEmpty(mediaItem.m41123T())) {
                return mediaItem.mo41081Q();
            }
            return mediaItem.m41123T();
        }
        return "";
    }

    /* renamed from: z */
    public static String m120364z(MediaItem mediaItem) {
        if (mediaItem == null) {
            return "";
        }
        if (mediaItem instanceof VideoItem) {
            return ((VideoItem) mediaItem).m41212s1();
        }
        String m41113N = mediaItem.m41113N();
        String m41123T = mediaItem.m41123T();
        if (TextUtils.isEmpty(m41113N) && TextUtils.isEmpty(m41123T)) {
            return mediaItem.mo41083a0();
        }
        if (m41113N.equals("")) {
            return m41123T;
        }
        return m41113N;
    }
}
