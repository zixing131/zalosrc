package com.zing.zalo.uicontrol;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.SparseArray;
import com.androidquery.util.AbstractC3972e;
import ho0.AbstractC20110a;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p502s3.C26117c;
import p620wt.AbstractC29237l;
import sh0.AbstractC26250b;

/* renamed from: com.zing.zalo.uicontrol.e0 */
/* loaded from: classes4.dex */
public class C16586e0 extends AbstractC26250b {

    /* renamed from: c */
    private final SparseArray f83786c = new SparseArray();

    /* renamed from: d */
    private final File[] f83787d;

    /* renamed from: e */
    private ArrayList f83788e;

    public C16586e0(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.zing.zalo.uicontrol.c0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean m88372o;
                    m88372o = C16586e0.m88372o(file2, str);
                    return m88372o;
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new Comparator() { // from class: com.zing.zalo.uicontrol.d0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m88373p;
                        m88373p = C16586e0.m88373p((File) obj, (File) obj2);
                        return m88373p;
                    }
                });
            } else {
                listFiles = new File[0];
            }
            this.f83787d = listFiles;
            try {
                String str = file.getAbsolutePath() + "/metadata";
                if (AbstractC23041d2.m118194A(str)) {
                    String m118197D = AbstractC23041d2.m118197D(str);
                    if (!TextUtils.isEmpty(m118197D)) {
                        JSONArray jSONArray = new JSONObject(m118197D).getJSONArray("duration");
                        if (jSONArray.length() > 0) {
                            this.f83788e = new ArrayList();
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                this.f83788e.add(Integer.valueOf(jSONArray.getInt(i11)));
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            String.format("STICKER FRAMES INIT TIME: %s", (System.currentTimeMillis() - currentTimeMillis) + "");
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is not directory!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ boolean m88372o(File file, String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith(".png") && !lowerCase.endsWith(".jpg")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ int m88373p(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return -1;
        }
        if (file2 == null) {
            return 1;
        }
        return file.getName().compareTo(file2.getName());
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: a */
    public synchronized void mo88374a() {
        while (this.f83786c.size() > 0) {
            try {
                try {
                    this.f83786c.removeAt(0);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f83786c.clear();
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: b */
    public int mo88375b() {
        return this.f83787d.length;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: c */
    public int mo88376c(int i11) {
        int i12 = 200;
        try {
            ArrayList arrayList = this.f83788e;
            if (arrayList != null && i11 >= 0) {
                if (i11 < arrayList.size()) {
                    i12 = ((Integer) this.f83788e.get(i11)).intValue();
                } else {
                    int size = this.f83788e.size();
                    if (size > 0) {
                        i12 = ((Integer) this.f83788e.get(size - 1)).intValue();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i12;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: d */
    public synchronized Bitmap mo88377d(int i11) {
        return mo88378e(i11, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    @Override // p098dc.InterfaceC17872f
    /* renamed from: e */
    public synchronized Bitmap mo88378e(int i11, boolean z11) {
        FileInputStream fileInputStream;
        Bitmap bitmap;
        Closeable closeable = null;
        Bitmap bitmap2 = null;
        r1 = null;
        FileInputStream fileInputStream2 = null;
        ?? r12 = 0;
        if (mo88375b() == 0) {
            return null;
        }
        ?? mo88375b = mo88375b();
        int i12 = i11 % mo88375b;
        if (z11) {
            Bitmap bitmap3 = (Bitmap) this.f83786c.get(i12);
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                return bitmap3;
            }
            File file = this.f83787d[i12];
            BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                try {
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    try {
                        FileDescriptor fd2 = fileInputStream3.getFD();
                        if (AbstractC3972e.m18765V()) {
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFileDescriptor(fd2, null, options);
                            options.inJustDecodeBounds = false;
                            options.inMutable = true;
                            Bitmap m134457b = C26117c.m134454d().m134457b(options.outWidth, options.outHeight, options.inPreferredConfig);
                            if (m134457b != null && !m134457b.isRecycled()) {
                                options.inBitmap = m134457b;
                            }
                        }
                        bitmap3 = BitmapFactory.decodeFileDescriptor(fd2, null, options);
                        AbstractC29237l.m145996a(fileInputStream3);
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream2 = fileInputStream3;
                        AbstractC3972e.m18779e0(e);
                        AbstractC29237l.m145996a(fileInputStream2);
                        r12 = bitmap3;
                        this.f83786c.put(i12, r12);
                        bitmap = r12;
                        return bitmap;
                    } catch (RuntimeException e12) {
                        e = e12;
                        fileInputStream2 = fileInputStream3;
                        AbstractC3972e.m18779e0(e);
                        AbstractC29237l.m145996a(fileInputStream2);
                        r12 = bitmap3;
                        this.f83786c.put(i12, r12);
                        bitmap = r12;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                        r12 = fileInputStream3;
                        AbstractC29237l.m145996a(r12);
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                } catch (RuntimeException e14) {
                    e = e14;
                }
                r12 = bitmap3;
                this.f83786c.put(i12, r12);
                bitmap = r12;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                File file2 = this.f83787d[i12];
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                try {
                    fileInputStream = new FileInputStream(file2);
                } catch (Exception e15) {
                    e = e15;
                    fileInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    AbstractC29237l.m145996a(closeable);
                    throw th;
                }
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options2);
                    mo88375b = fileInputStream;
                    bitmap2 = decodeFileDescriptor;
                } catch (Exception e16) {
                    e = e16;
                    AbstractC3972e.m18779e0(e);
                    mo88375b = fileInputStream;
                    AbstractC29237l.m145996a(mo88375b);
                    bitmap = bitmap2;
                    return bitmap;
                }
                AbstractC29237l.m145996a(mo88375b);
                bitmap = bitmap2;
            } catch (Throwable th5) {
                th = th5;
                closeable = mo88375b;
            }
        }
        return bitmap;
    }

    @Override // p098dc.InterfaceC17872f
    public int getType() {
        return 0;
    }

    @Override // sh0.AbstractC26250b
    /* renamed from: j */
    public boolean mo88379j() {
        if (this.f83786c.size() == mo88375b()) {
            return true;
        }
        return false;
    }
}
