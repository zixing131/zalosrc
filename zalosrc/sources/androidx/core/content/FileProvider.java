package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p227i3.C20219w;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: r */
    private static final String[] f6099r = {"_display_name", "_size"};

    /* renamed from: s */
    private static final File f6100s = new File("/");

    /* renamed from: t */
    private static final HashMap f6101t = new HashMap();

    /* renamed from: p */
    private InterfaceC1385b f6102p;

    /* renamed from: q */
    private int f6103q = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes2.dex */
    public static class C1384a {
        /* renamed from: a */
        static File[] m6953a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1385b {
        /* renamed from: a */
        Uri mo6954a(File file);

        /* renamed from: b */
        File mo6955b(Uri uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$c */
    /* loaded from: classes.dex */
    public static class C1386c implements InterfaceC1385b {

        /* renamed from: a */
        private final String f6104a;

        /* renamed from: b */
        private final HashMap f6105b = new HashMap();

        C1386c(String str) {
            this.f6104a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC1385b
        /* renamed from: a */
        public Uri mo6954a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f6105b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f6104a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC1385b
        /* renamed from: b */
        public File mo6955b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f6105b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        /* renamed from: c */
        void m6956c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f6105b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e11) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e11);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    /* renamed from: a */
    private static File m6945a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    private static Object[] m6946b(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        return objArr2;
    }

    /* renamed from: c */
    private static String[] m6947c(String[] strArr, int i11) {
        String[] strArr2 = new String[i11];
        System.arraycopy(strArr, 0, strArr2, 0, i11);
        return strArr2;
    }

    /* renamed from: d */
    static XmlResourceParser m6948d(Context context, String str, ProviderInfo providerInfo, int i11) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i11 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i11);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    private static InterfaceC1385b m6949e(Context context, String str, int i11) {
        InterfaceC1385b interfaceC1385b;
        HashMap hashMap = f6101t;
        synchronized (hashMap) {
            try {
                interfaceC1385b = (InterfaceC1385b) hashMap.get(str);
                if (interfaceC1385b == null) {
                    try {
                        try {
                            interfaceC1385b = m6952h(context, str, i11);
                            hashMap.put(str, interfaceC1385b);
                        } catch (XmlPullParserException e11) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    } catch (IOException e12) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e12);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC1385b;
    }

    /* renamed from: f */
    public static Uri m6950f(Context context, String str, File file) {
        return m6949e(context, str, 0).mo6954a(file);
    }

    /* renamed from: g */
    private static int m6951g(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!C20219w.f100062c.equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    /* renamed from: h */
    private static InterfaceC1385b m6952h(Context context, String str, int i11) {
        C1386c c1386c = new C1386c(str);
        XmlResourceParser m6948d = m6948d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i11);
        while (true) {
            int next = m6948d.next();
            if (next != 1) {
                if (next == 2) {
                    String name = m6948d.getName();
                    File file = null;
                    String attributeValue = m6948d.getAttributeValue(null, "name");
                    String attributeValue2 = m6948d.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        file = f6100s;
                    } else if ("files-path".equals(name)) {
                        file = context.getFilesDir();
                    } else if ("cache-path".equals(name)) {
                        file = context.getCacheDir();
                    } else if ("external-path".equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(name)) {
                        File[] m6966h = AbstractC1388a.m6966h(context, null);
                        if (m6966h.length > 0) {
                            file = m6966h[0];
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] m6965g = AbstractC1388a.m6965g(context);
                        if (m6965g.length > 0) {
                            file = m6965g[0];
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] m6953a = C1384a.m6953a(context);
                        if (m6953a.length > 0) {
                            file = m6953a[0];
                        }
                    }
                    if (file != null) {
                        c1386c.m6956c(attributeValue, m6945a(file, attributeValue2));
                    }
                }
            } else {
                return c1386c;
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap hashMap = f6101t;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.f6102p = m6949e(context, str, this.f6103q);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f6102p.mo6955b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo6955b = this.f6102p.mo6955b(uri);
        int lastIndexOf = mo6955b.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo6955b.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f6102p.mo6955b(uri), m6951g(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i11;
        String str3;
        File mo6955b = this.f6102p.mo6955b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f6099r;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i12 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i12] = "_display_name";
                i11 = i12 + 1;
                if (queryParameter == null) {
                    str3 = mo6955b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i12] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i12] = "_size";
                i11 = i12 + 1;
                objArr[i12] = Long.valueOf(mo6955b.length());
            }
            i12 = i11;
        }
        String[] m6947c = m6947c(strArr3, i12);
        Object[] m6946b = m6946b(objArr, i12);
        MatrixCursor matrixCursor = new MatrixCursor(m6947c, 1);
        matrixCursor.addRow(m6946b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
