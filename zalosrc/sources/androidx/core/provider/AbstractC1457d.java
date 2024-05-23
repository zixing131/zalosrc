package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1457d {

    /* renamed from: a */
    private static final Comparator f6294a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m7382g;
            m7382g = AbstractC1457d.m7382g((byte[]) obj, (byte[]) obj2);
            return m7382g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static Cursor m7384a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List m7377b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m7378c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals((byte[]) list.get(i11), (byte[]) list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List m7379d(C1458e c1458e, Resources resources) {
        if (c1458e.m7386b() != null) {
            return c1458e.m7386b();
        }
        return AbstractC1398e.m7052c(resources, c1458e.m7387c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC1460g.a m7380e(Context context, C1458e c1458e, CancellationSignal cancellationSignal) {
        ProviderInfo m7381f = m7381f(context.getPackageManager(), c1458e, context.getResources());
        if (m7381f == null) {
            return AbstractC1460g.a.m7405a(1, null);
        }
        return AbstractC1460g.a.m7405a(0, m7383h(context, c1458e, m7381f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m7381f(PackageManager packageManager, C1458e c1458e, Resources resources) {
        String m7389e = c1458e.m7389e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m7389e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c1458e.m7390f())) {
                List m7377b = m7377b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m7377b, f6294a);
                List m7379d = m7379d(c1458e, resources);
                for (int i11 = 0; i11 < m7379d.size(); i11++) {
                    ArrayList arrayList = new ArrayList((Collection) m7379d.get(i11));
                    Collections.sort(arrayList, f6294a);
                    if (m7378c(m7377b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m7389e + ", but package was not " + c1458e.m7390f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m7389e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m7382g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            byte b12 = bArr2[i11];
            if (b11 != b12) {
                return b11 - b12;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static AbstractC1460g.b[] m7383h(Context context, C1458e c1458e, String str, CancellationSignal cancellationSignal) {
        int i11;
        int i12;
        Uri withAppendedId;
        int i13;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor m7384a = a.m7384a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c1458e.m7391g()}, null, cancellationSignal);
            if (m7384a != null) {
                try {
                    if (m7384a.getCount() > 0) {
                        int columnIndex = m7384a.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = m7384a.getColumnIndex("_id");
                        int columnIndex3 = m7384a.getColumnIndex("file_id");
                        int columnIndex4 = m7384a.getColumnIndex("font_ttc_index");
                        int columnIndex5 = m7384a.getColumnIndex("font_weight");
                        int columnIndex6 = m7384a.getColumnIndex("font_italic");
                        while (m7384a.moveToNext()) {
                            if (columnIndex != -1) {
                                i11 = m7384a.getInt(columnIndex);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i12 = m7384a.getInt(columnIndex4);
                            } else {
                                i12 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, m7384a.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, m7384a.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i13 = m7384a.getInt(columnIndex5);
                            } else {
                                i13 = 400;
                            }
                            if (columnIndex6 != -1 && m7384a.getInt(columnIndex6) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            arrayList.add(AbstractC1460g.b.m7408a(withAppendedId, i12, i13, z11, i11));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = m7384a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (m7384a != null) {
                m7384a.close();
            }
            return (AbstractC1460g.b[]) arrayList.toArray(new AbstractC1460g.b[0]);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
