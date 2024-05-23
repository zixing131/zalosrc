package bm;

import com.zing.zalo.p062db.C7959d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: bm.b */
/* loaded from: classes3.dex */
public abstract class AbstractC2844b {
    /* renamed from: b */
    public static void m13726b(File file) {
        File[] listFiles;
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        if (listFiles.length == 0) {
            file.delete();
            return;
        }
        for (File file2 : listFiles) {
            m13726b(file2);
        }
    }

    /* renamed from: c */
    private static void m13727c(ArrayList arrayList, long j11) {
        Collections.sort(arrayList, new Comparator() { // from class: bm.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m13729e;
                m13729e = AbstractC2844b.m13729e((File) obj, (File) obj2);
                return m13729e;
            }
        });
        long j12 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((File) arrayList.get(i11)).length() + j12 > j11) {
                ((File) arrayList.get(i11)).delete();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Delete ");
                sb2.append(((File) arrayList.get(i11)).getPath());
                sb2.append(" - ");
                sb2.append(((File) arrayList.get(i11)).length());
            } else {
                j12 += ((File) arrayList.get(i11)).length();
            }
        }
    }

    /* renamed from: d */
    private static long m13728d(File file, ArrayList arrayList) {
        long j11 = 0;
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j11 += m13728d(file2, arrayList);
                } else {
                    j11 += file2.length();
                    arrayList.add(file2);
                }
            }
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ int m13729e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: f */
    public static void m13730f(long j11, long j12) {
        try {
            m13731g(C7959d.m41668t1(), j11, j12);
            m13726b(new File(C7959d.m41668t1()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m13731g(String str, long j11, long j12) {
        try {
            ArrayList arrayList = new ArrayList();
            if (m13728d(new File(str), arrayList) > j11 && arrayList.size() > 1) {
                m13727c(arrayList, j12);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File size not exceed ");
                sb2.append(j11);
                sb2.append(" or has just only 1 file");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
